package Ast;

import Ast.application.*;
import Ast.calls.*;
import Ast.components.ComponentNode;
import Ast.components.Injectable;
import Ast.css.CssStylesheetNode;
import Ast.css.ValueNode;
import Ast.declarations.ClassDeclarationNode;
import Ast.expressions.FunctionCallNode;
import Ast.forms.*;
import Ast.function.GetProductByIdNode;
import Ast.html.tag.CloseFixedTagNode;
import Ast.html.tag.CloseTagNode;
import Ast.html.tag.FixedTagNode;
import Ast.html.tag.OpenTagNode;
import Ast.metadata.SelectorNode;

import Ast.methods.*;
import Ast.methods.*;
import Ast.modifiers.ModifierNode;
import Ast.ngmodul.*;
import Ast.properties.*;
import Ast.routing.*;

import Ast.types.*;
import Ast.declarations.ExtendClauseNode;
import Ast.declarations.ImplementClauseNode;
import Ast.expressions.*;
import Ast.function.FUNDECLRATIONNODE;
import Ast.function.FunctionBodyNode;
import Ast.function.NGOnInit;
import Ast.html.*;
import Ast.html.attrbute.*;
import Ast.metadata.*;
import Ast.methods.ConstructorNode;
import Ast.methods.ParameterNode;
import Ast.property.EmptyArrayNode;
import Ast.property.RegularPropertyNode;
import Ast.types.IdentifierValueNode;
import SymbolTable.*;
import antlr.gen.AngularParser;
import Ast.statements.*;
import antlr.gen.*;
import Ast.css.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import seminticerror.*;

import java.util.*;
import java.util.stream.Collectors;

import terminal.TypeTeminal;

public class AngularASTBuilder extends AngularParserBaseVisitor<Node> {
    private final SymbolTable symbolTable;
    private final Import importChecker;
    private final HtmlSymbolTable html;
    private String sourceFile;
    public AngularASTBuilder(SymbolTable symbolTable, SelectorSymbolTable selectorSymbolTable, ClassSymbolTable classSymbolTable, ErrorHandler errorHandler, Import importChecker, HtmlSymbolTable html, FunctionSymbolTable functionTable) {
        html.addSymbol(new SymbolEntry("h1", SymbolType.TAG, "h1", "global",sourceFile));
        html.addSymbol(new SymbolEntry("h2", SymbolType.TAG, "h2", "global",sourceFile));
        html.addSymbol(new SymbolEntry("p", SymbolType.TAG, "p", "global",sourceFile));
        html.addSymbol(new SymbolEntry("div", SymbolType.TAG, "div", "global",sourceFile));
        html.addSymbol(new SymbolEntry("ul", SymbolType.TAG, "ul", "global",sourceFile));
        html.addSymbol(new SymbolEntry("button", SymbolType.TAG, "button", "global",sourceFile));
        html.addSymbol(new SymbolEntry("li", SymbolType.TAG, "li", "global",sourceFile));
        html.addSymbol(new SymbolEntry("span", SymbolType.TAG, "span", "global",sourceFile));
        html.addSymbol(new SymbolEntry("img", SymbolType.TAG, "img", "global",sourceFile));
        this.symbolTable = symbolTable;
        this.classSymbolTable = classSymbolTable;
        this.errorHandler = errorHandler;
        this.selectorSymbolTable = selectorSymbolTable;
        this.importChecker = importChecker;
        this.html = html;
        this.functionTable = functionTable;

    }

    private final SelectorSymbolTable selectorSymbolTable;
    private final ClassSymbolTable classSymbolTable;
    private final ErrorHandler errorHandler;
    private final FunctionSymbolTable functionTable;



    private ExpressionNode safeVisitExpression(ParserRuleContext ctx) {
        Node node = visit(ctx);
        if (node == null) {
            // إنشاء تعبير فارغ، أو رفع استثناء، حسب سياقك
            return new EmptyExpressionNode();
        }
        return (ExpressionNode) node;
    }


    @Override
    public Node visitProgram(AngularParser.ProgramContext ctx) {
        List<Node> applicationNodes = new ArrayList<>();

        if (ctx.application() != null && !ctx.application().isEmpty()) {
            for (var app : ctx.application()) {
                Node node = visit(app);
                if (node != null) {
                    applicationNodes.add(node);
                } else {
                    System.err.println("Warning: Encountered null node during application visit.");
                }
            }
        } else {
            System.err.println("Warning: No applications found in ProgramContext.");
        }

        return new ApplicationNode(applicationNodes);
    }


    @Override
    public Node visitIMPORTLABEL(AngularParser.IMPORTLABELContext ctx) {
        List<String> importedList = new ArrayList<>();
        for (var key : ctx.importStatement().keyimport()) {
            importedList.add(key.getText().trim());
        }
        String imported = String.join(", ", importedList);
        String rawSource = ctx.importStatement().STRING().getText();
        String source = rawSource.substring(1, rawSource.length() - 1);

        String scope = symbolTable.getCurrentScope();
        symbolTable.addSymbol(new SymbolEntry(imported, SymbolType.IMPORT, source, scope,sourceFile));
        List<KeyImportNode> app = new ArrayList<>();
        for (var v : ctx.importStatement().keyimport()) {
            app.add((KeyImportNode) visit(v));
        }
        ImportStatementNode importStatementNode = new ImportStatementNode(imported, source, imported, app);
        return importStatementNode;
    }

    @Override
    public Node visitKEYIMPORTLABEL(AngularParser.KEYIMPORTLABELContext ctx) {
        return new KeyImportNode(ctx.getText());
    }

    @Override
    public Node visitNgModuleDecorator(AngularParser.NgModuleDecoratorContext ctx) {
        String decoratorName = ctx.NG_MODULE().getText();
        List<NgModuleProperty> properties = new ArrayList<>();

        // معالجة خصائص NgModule
        for (AngularParser.NgModulePropertyContext propCtx : ctx.ngModuleProperty()) {
            NgModuleProperty property = (NgModuleProperty) visit(propCtx);
            properties.add(property);
        }

        return new NgModuleDecorator(decoratorName, properties);
    }


    @Override
    public Node visitIMPORTS_PROPERTY(AngularParser.IMPORTS_PROPERTYContext ctx) {
        String propertyName = ctx.IMPORTS().getText();
        List<NgModuleValue> values = new ArrayList<>();

        for (var idNode : ctx.ngModuleValue().ngModuleElement()) {
            String moduleName = idNode.getText();

            // إنشاء قيمة للوحدة
            NgModuleValue valueNode = new NgModuleValue(moduleName);
            values.add(valueNode);

            // تسجيل في جدول الرموز
            symbolTable.addSymbol(new SymbolEntry(
                    moduleName,
                    SymbolType.MODULE,
                    null,
                    symbolTable.getCurrentScope()
                    ,sourceFile
            ));
        }

        return new NgModuleProperty(propertyName, values);
    }

    @Override
    public Node visitEXPORTS_PROPERTY(AngularParser.EXPORTS_PROPERTYContext ctx) {
        String propertyName = ctx.EXPORTS().getText();

        NgModuleValueGroup valueGroup = (NgModuleValueGroup) visit(ctx.ngModuleValue());
        List<NgModuleValue> values = valueGroup.getValues();

        for (NgModuleValue val : values) {
            symbolTable.addSymbol(new SymbolEntry(
                    val.getValue(),
                    SymbolType.MODULE,
                    null,
                    symbolTable.getCurrentScope(),sourceFile
            ));
        }

        return new NgModuleProperty(propertyName, values);
    }

    @Override
    public Node visitNgModuleValue(AngularParser.NgModuleValueContext ctx) {
        List<NgModuleValue> values = new ArrayList<>();
        for (AngularParser.NgModuleElementContext elementCtx : ctx.ngModuleElement()) {
            values.add(new NgModuleValue(elementCtx.getText()));
        }
        return new NgModuleValueGroup(values);
    }

    @Override
    public Node visitMODULE_FUNCTION_CALL(AngularParser.MODULE_FUNCTION_CALLContext ctx) {
        FunctionCallNode functionCallNode = (FunctionCallNode) visit(ctx.propertyAccessFunctionCall());
        return new NgModuleFunctionCallNode(functionCallNode);
    }

    @Override
    public Node visitMODULE_IDENTIFIER(AngularParser.MODULE_IDENTIFIERContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        return new NgModuleIdentifierNode(name);
    }

    @Override
    public Node visitROUTEMOUDLELBEL(AngularParser.ROUTEMOUDLELBELContext ctx) {
        String value = ctx.ROUTER_MODULE().getText();
        return new RouterModuleNode(value);
    }

    @Override
    public Node visitROUTELINKLABEL(AngularParser.ROUTELINKLABELContext ctx) {
        String value = ctx.ROUTER_LINK().getText();
        return new RouterLinkNode(value);
    }

    @Override
    public Node visitPropertyAccessFunctionCall(AngularParser.PropertyAccessFunctionCallContext ctx) {
        String objectName = ctx.ROUTER_MODULE().getText();
        String functionName = ctx.IDENTIFIER().getText();

        List<ExpressionNode> arguments = new ArrayList<>();
        if (ctx.argumentList() != null) {
            for (var exprCtx : ctx.argumentList().expression()) {
                ExpressionNode argNode = (ExpressionNode) visit(exprCtx);
                arguments.add(argNode);
            }
        }

        return new PropertyAccessFunctionCallNode(objectName, functionName, arguments);
    }



    @Override
    public Node visitRouteDefinition(AngularParser.RouteDefinitionContext ctx) {
        RouteDefinitionNode node = new RouteDefinitionNode();

        node.setIdentifier(ctx.IDENTIFIER().getText());

        for (AngularParser.RouteItemContext itemCtx : ctx.routeItem()) {
            RouteItemNode itemNode = (RouteItemNode) visit(itemCtx);
            node.addRouteItem(itemNode);
        }

        return node;
    }




    @Override
    public Node visitRouteItem(AngularParser.RouteItemContext ctx) {
        RouteItemNode itemNode = new RouteItemNode();

        // نضع الـ path أولاً
        itemNode.setPath(stripQuotes(ctx.STRING(0).getText()));

        // الآن نمر على باقي الخصائص حسب وجودها

        // إذا هناك redirectTo و pathMatch
        if (ctx.REDIRECT_TO() != null && ctx.PATH_MATCH() != null) {
            itemNode.setProperty(ctx.REDIRECT_TO().getText(), stripQuotes(ctx.STRING(1).getText()));
            itemNode.setProperty(ctx.PATH_MATCH().getText(), stripQuotes(ctx.STRING(2).getText()));
        } else {
            // خصائص من النوع IDENTIFIER : IDENTIFIER (كـ component: SomeComponent)
            if (ctx.IDENTIFIER(1) != null && ctx.IDENTIFIER(2) != null) {
                itemNode.setProperty(ctx.IDENTIFIER(1).getText(), ctx.IDENTIFIER(2).getText());
            }
        }

        return itemNode;
    }
    private String stripQuotes(String text) {
        if (text != null && text.length() > 1 &&
                ((text.startsWith("\"") && text.endsWith("\"")) || (text.startsWith("'") && text.endsWith("'")))) {
            return text.substring(1, text.length() -1);
        }
        return text;
    }


    @Override
    public Node visitCLASSLABEL(AngularParser.CLASSLABELContext ctx) {
        String className = ctx.classDeclaration().IDENTIFIER().getText();
        ClassBodyNode classBodyNode = new ClassBodyNode();

        if (classSymbolTable.symbolExists(className)) {
            errorHandler.reportSemanticError("Duplicate class definition: " + className, ctx.start);
            return null;
        }

        classSymbolTable.addSymbol(new SymbolEntry(className, SymbolType.CLASS, null, symbolTable.getCurrentScope(),sourceFile));
        symbolTable.enterScope(className);
        for (var child : ctx.children) {
            Node element = child.accept(this);
            if (element != null) {
                classBodyNode.addClassElement(element);
            }
        }
        symbolTable.exitScope();
        return classBodyNode;
    }


    @Override
    public Node visitLETTERMINALLABEL(AngularParser.LETTERMINALLABELContext ctx) {
        String type=ctx.LET().getText();
        return new TypeTeminal(type);
    }

    @Override
    public Node visitVARTERMINALLABEL(AngularParser.VARTERMINALLABELContext ctx) {
        String type=ctx.VAR().getText();
        return new TypeTeminal(type);
    }

    @Override
    public Node visitCONSTTERMINALLABEL(AngularParser.CONSTTERMINALLABELContext ctx) {
        String type=ctx.CONST().getText();
        return new TypeTeminal(type);
    }
    @Override
    public Node visitInjectable(AngularParser.InjectableContext ctx) {
        String injectableName = ctx.INJECTABLE().getText(); // غالباً "Injectable"
        List<MetadataEntryNode> metadataEntries = new ArrayList<>();

        symbolTable.addSymbol(new SymbolEntry(injectableName, SymbolType.INJECTABLE, null, symbolTable.getCurrentScope(), sourceFile));
        symbolTable.enterScope(injectableName);

        for (var entCtx : ctx.metadata().metadataEntry()) {
            metadataEntries.add((MetadataEntryNode) visit(entCtx));
        }

        symbolTable.exitScope();

        MetadataNode metadataNode = new MetadataNode(metadataEntries);

        return new Injectable(metadataNode, injectableName); // كلاسك في Ast.components
    }


    @Override
    public Node visitComponent(AngularParser.ComponentContext ctx) {
        String componentName = ctx.COMPONENT().getText();

//warning
        List<MetadataEntryNode> metadataEntries = new ArrayList<>();

        symbolTable.addSymbol(new SymbolEntry(componentName, SymbolType.COMPONENT, "metadataentry", symbolTable.getCurrentScope(),sourceFile));
        symbolTable.enterScope(componentName);  // الآن currentScope = global.ComponentName
        for (var entCtx : ctx.metadata().metadataEntry()) {
            metadataEntries.add((MetadataEntryNode) visit(entCtx));
        }
        symbolTable.exitScope();
        return new ComponentNode(componentName, metadataEntries);
    }

    @Override
    public Node visitMetadata(AngularParser.MetadataContext ctx) {
        List<MetadataEntryNode> entry = new ArrayList<>();
        for (var ent : ctx.metadataEntry()) {
            entry.add((MetadataEntryNode) visit(ent));
        }
        return new MetadataNode(entry);
    }


    @Override
    public Node visitStyleUrl(AngularParser.StyleUrlContext ctx) {
        List<CssStylesheetNode> stylesheets = new ArrayList<>();

        for (var sheetCtx : ctx.stylesheet()) {
            Node node = visit(sheetCtx);
            if (node instanceof CssStylesheetNode) {
                stylesheets.add((CssStylesheetNode) node);
            }
        }

        return new StyleUrlNode(stylesheets);
    }

    @Override
    public Node visitProvidin(AngularParser.ProvidinContext ctx) {
        String key = ctx.PROVIDEDIN().getText();
        String value = ctx.STRING().getText().replaceAll("^\"|\"$", "");


        String scope = symbolTable.getCurrentScope();
        symbolTable.addSymbol(new SymbolEntry(key, SymbolType.METADATA, value, scope,sourceFile));

        return new Provedin(key, value);
    }

    @Override
    public Node visitBasicMetadata(AngularParser.BasicMetadataContext ctx) {
        String key = ctx.TEMPLATE().getText();
        String value = ctx.STRING().getText().replaceAll("^\"|\"$", "");


        String scope = symbolTable.getCurrentScope();
        symbolTable.addSymbol(new SymbolEntry(key, SymbolType.METADATA, value, scope,sourceFile));

        return new BasicMetadataNode(key, value);
    }


    @Override
    public Node visitHtmlMetadata(AngularParser.HtmlMetadataContext ctx) {
        String key = ctx.TEMPLATE().getText();
        List<Node> htmlChildren = new ArrayList<>();
        for (var htmlElemCtx : ctx.htmlElement()) {
            htmlChildren.add((Node) visit(htmlElemCtx));
        }
//

        String scope = symbolTable.getCurrentScope();
        symbolTable.addSymbol(new SymbolEntry(key, SymbolType.METADATA, "", scope,sourceFile));

        return new HtmlMetadataNode(key, htmlChildren);
    }

    @Override
    public Node visitClassBodyLabel(AngularParser.ClassBodyLabelContext ctx) {
        ClassBodyNode body = new ClassBodyNode();

        if (ctx.children != null) {
            for (ParseTree child : ctx.children) {
                Node node = (Node) visit(child);
                if (node != null) {
                    body.addClassElement(node);
                }
            }
        } else {
            // هنا يمكن إما إرجاع null أو جسم فارغ حسب منطقك
            return null; // أو return body;
        }

        return body;
    }

    @Override
    public Node visitClassDeclaration(AngularParser.ClassDeclarationContext ctx) {
        String className = ctx.IDENTIFIER().getText();
        String superClass = null;

        if (ctx.classInheritance() != null && !ctx.classInheritance().isEmpty()) {
            superClass = ctx.classInheritance().getText();
        }

        symbolTable.addSymbol(new SymbolEntry(className, SymbolType.CLASS, null, symbolTable.getCurrentScope(),sourceFile));
        symbolTable.enterScope(className);

        ClassBodyNode bodyNode = new ClassBodyNode();

        if (ctx.classBody() != null) {
            Node result = visit(ctx.classBody());
            if (result instanceof ClassBodyNode) {
                bodyNode = (ClassBodyNode) result;
            }
        }

        symbolTable.exitScope();
        return new ClassDeclarationNode(className, superClass, bodyNode.getClassElements());
    }


    @Override
    public Node visitEXTENDSLABEL(AngularParser.EXTENDSLABELContext ctx) {
        String baseClassName = ctx.extendClause().IDENTIFIER().getText();
        return new ExtendClauseNode(baseClassName);
    }

    @Override
    public Node visitIMPLEMITIONLABEL(AngularParser.IMPLEMITIONLABELContext ctx) {
        List<String> interfaces = new ArrayList<>();

        // نضيف الواجهة الأولى (value) وهي يمكن أن تكون IDENTIFIER أو حسب الـ grammar
        interfaces.add(ctx.implementClause().value().getText());

        // نضيف باقي الواجهات (IDENTIFIER) من الفهرس 1 وطالع (لو موجودة)
        for (int i = 1; i < ctx.implementClause().IDENTIFIER().size(); i++) {
            interfaces.add(ctx.implementClause().IDENTIFIER(i).getText());
        }

        return new ImplementClauseNode(interfaces);
    }

    @Override
    public Node visitExtendClause(AngularParser.ExtendClauseContext ctx) {
        String superClassName = ctx.EXTENDS().getText();
        return new ExtendClauseNode(superClassName);
    }

    @Override
    public Node visitImplementClause(AngularParser.ImplementClauseContext ctx) {
        List<String> interfaceNames = new ArrayList<>();
        interfaceNames.add(ctx.IMPLEMENTS().getText());

        return new ImplementClauseNode(interfaceNames);    }




    @Override
    public Node visitGetproduct(AngularParser.GetproductContext ctx) {
        if (ctx.elementList() != null) {
            List<ExpressionNode> elements = new ArrayList<>();
            for (var elem : ctx.elementList().element()) {
                ExpressionNode expr = (ExpressionNode) visit(elem);
                elements.add(expr);
            }

            // تسجيل رمز في الجدول
            symbolTable.addSymbol(new SymbolEntry(
                    "getProducts",
                    SymbolType.METHOD,
                    "List",
                    symbolTable.getCurrentScope(),sourceFile
            ));

            return new GetProductMethodNode(elements);
        } else if (ctx.propertyAccessChain() != null) {
            ExpressionNode returnValue = (ExpressionNode) visit(ctx.propertyAccessChain());

            symbolTable.addSymbol(new SymbolEntry(
                    "getProducts",
                    SymbolType.METHOD,
                    "object",
                    symbolTable.getCurrentScope(),sourceFile
            ));

            return new GetProductMethodNode(returnValue);
        }

        return null;
    }

    @Override
    public Node visitFormGroupInitialization(AngularParser.FormGroupInitializationContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        Node body = (Node) visit(ctx.formGroupBody());
        return new FormGroupInitializationNode(id, body);
    }


    @Override
    public Node visitFormGroupBody(AngularParser.FormGroupBodyContext ctx) {
        List<FormControlFieldNode> controls = new ArrayList<>();
        for (var controlCtx : ctx.formControlFields().formControlField()) {
            controls.add((FormControlFieldNode) visit(controlCtx));
        }
        return new FormGroupBodyNode(controls);
    }

    @Override
    public Node visitFormControlField(AngularParser.FormControlFieldContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        FormControlArgsNode args = (FormControlArgsNode) visit(ctx.formControlArgs());
        return new FormControlFieldNode(name, args);
    }


//    @Override
//    public Node visitFormControlField(AngularParser.FormControlFieldContext ctx) {
//        return super.visitFormControlField(ctx);
//    }
//
//    @Override
//    public Node visitFormControlArgs(AngularParser.FormControlArgsContext ctx) {
//        String initialValue = ctx.STRING().getText();
//        List<ValidatorNode> validators = new ArrayList<>();
//        if (ctx.validatorExpression() != null) {
//            if (ctx.validatorExpression().validator() != null) {
//                // Handle single validator or multiple validators
//                // يمكن إضافة معالجة هنا لعدة Validators
//                validators.addAll(processValidators(ctx.validatorExpression()));
//            }
//        }
//        return new FormControlArgsNode(initialValue, validators);
//    }

    @Override
    public Node visitValidatorExpression(AngularParser.ValidatorExpressionContext ctx) {
        return super.visitValidatorExpression(ctx);
    }

//    @Override
//    public Node visitValidator(AngularParser.ValidatorContext ctx) {
//        String fullText = ctx.getText();  // مثلاً Validators.min(3)
//        String name = null;
//        Integer param = null;
//
//        if (ctx.IDENTIFIER() != null && !ctx.IDENTIFIER().isEmpty()) {
//            // في حال وجود IDENTIFIER يمكنك الحصول عليه
//            name = ctx.IDENTIFIER().get(1).getText(); // لأن اول IDENTIFIER غالبا 'Validators'
//        } else {
//            // حل بديل لتحليل الاسم إذا لم يكن معرفا بشكل واضح
//            name = fullText.replace("Validators.", "").replaceAll("\\(.*\\)", "");
//        }
//
//        // استخراج رقم المعامل بين الأقواس لو موجود
//        if (fullText.contains("(")) {
//            int start = fullText.indexOf('(');
//            int end = fullText.indexOf(')');
//            String paramStr = fullText.substring(start + 1, end);
//            try {
//                param = Integer.parseInt(paramStr);
//            } catch (NumberFormatException e) {
//                param = null;
//            }
//        }
//        return new ValidatorNode(name, param);
//    }
/////////////////////////////////////////////////////here
    @Override
    public Node visitFunctionBody(AngularParser.FunctionBodyContext ctx) {
        if (ctx == null) {
            return new FunctionBodyNode(Collections.emptyList());
        }

        List<StatementNode> statements = new ArrayList<>();
        for (var stmtCtx : ctx.statement()) {
            Node stmtNode = visit(stmtCtx);
            if (stmtNode instanceof StatementNode) {
                statements.add((StatementNode) stmtNode);
            }
        }
        return new FunctionBodyNode(statements);
    }

    @Override
    public Node visitReturnStatement(AngularParser.ReturnStatementContext ctx) {
        if (ctx.expression() == null) {
            return new ReturnNode(new EmptyExpressionNode());
        }
        Node returnExpr = visit(ctx.expression());
        return new ReturnNode(returnExpr != null ? returnExpr : new EmptyExpressionNode());
    }

    @Override
    public Node visitPrivateMethodDeclaration(AngularParser.PrivateMethodDeclarationContext ctx) {
        String modifier = ctx.modifiers().getText(); // مثلاً: "private"
        String methodName = ctx.IDENTIFIER().getText();

        String returnType = ctx.basevalue() != null ? ctx.basevalue().getText() : "void";

        ExpressionNode returnValue = null;
        if (ctx.returnStatement() != null && ctx.returnStatement().expression() != null) {
            returnValue = (ExpressionNode) visit(ctx.returnStatement().expression());
        }

        // سجل الدالة في جدول الرموز
        symbolTable.addSymbol(new SymbolEntry(
                methodName,
                SymbolType.METHOD,
                returnType,
                symbolTable.getCurrentScope(),sourceFile
        ));

        return new PrivateMethodDeclarationNode(modifier, methodName, returnType, returnValue);
    }

//    @Override
//    public Node visitFROMGROUPLABEL(AngularParser.FROMGROUPLABELContext ctx) {
//        return new FormGroupInitializationNode(visit(ctx.formGroupInitialization()));
//    }

    @Override
    public Node visitDDDDEE(AngularParser.DDDDEEContext ctx) {
        String id = ctx.constStatement().IDENTIFIER().getText();
        ExpressionNode value = (ExpressionNode) visit(ctx.constStatement().CONST());
        return new ConstStatementNode(id, value);
    }

    @Override
    public Node visitDDDDDDDDDDD(AngularParser.DDDDDDDDDDDContext ctx) {
        Node subject = visit(ctx.subjectNextStatement().propertyAccess());
        Node param = visit(ctx.subjectNextStatement().spreadExpression());

        return new SubjectNextStatementNode(subject, param);
    }

    @Override
    public Node visitEEEEEEEEEEEE(AngularParser.EEEEEEEEEEEEContext ctx) {
        // تحليل عناصر الجملة
        AngularParser.SubjectFilterStatementContext stmtCtx = ctx.subjectFilterStatement();

        // تمرير التعبير داخل سلسلة الخصائص إلى الvisitor
        Node propertyAccessChainNode = visit(stmtCtx.propertyAccess(0));

        // تمرير التعبير داخل () إلى الvisitor (عادة Identifier أو تعبير)
        Node filterExpressionNode = visit(stmtCtx.filterExpression());

        return new SubjectFilterStatementNode(propertyAccessChainNode, filterExpressionNode);
    }

    @Override
    public Node visitFormGroupDeclaration(AngularParser.FormGroupDeclarationContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        Node elementList = visit(ctx.elementList());
        return new FormGroupDeclarationNode(name, elementList);
    }

    @Override
    public Node visitFormGroupAssignment(AngularParser.FormGroupAssignmentContext ctx) {
        // استخرج المعرف (IDENTIFIER)
        String id = ctx.IDENTIFIER().getText();

        // استخرج الحقول formGroupFields (قائمة الحقول داخل الكائن)
        AngularParser.FormGroupFieldsContext fieldsCtx = ctx.formGroupFields();

        // زُر الحقول (ستحصل على قائمة من Node)
        List<FormGroupFieldNode> fieldsNodes = new ArrayList<>();
        if (fieldsCtx != null) {
            for (ParseTree child : fieldsCtx.children) {
                FormGroupFieldNode fieldNode = (FormGroupFieldNode) visit(child);
                if (fieldNode != null) {
                    fieldsNodes.add(fieldNode);
                }
            }
        }

        // أنشئ العقدة الجديدة
        return new FormGroupAssignmentNode(id, fieldsNodes);
    }




    @Override
    public Node visitADDSUBMITLABEL(AngularParser.ADDSUBMITLABELContext ctx) {
        Node functionBody = visit(ctx.functionB());
        return new AddProductFunctionNode(functionBody);
    }

    @Override
    public Node visitFROMFAILDLABEL(AngularParser.FROMFAILDLABELContext ctx) {
        String name = ctx.formGroupField(0).IDENTIFIER().getText();
        List<FormGroupFieldNode> fields = new ArrayList<>();
        for (var fieldCtx : ctx.formGroupField()) {
            fields.add((FormGroupFieldNode) visit(fieldCtx));
        }
        return new FormGroupAssignmentNode(name, fields);
    }

    @Override
    public Node visitFormGroupField(AngularParser.FormGroupFieldContext ctx) {
        String fieldName = ctx.IDENTIFIER().getText();
        FormControlInitNode controlInit = (FormControlInitNode) visit(ctx.formControlInit());
        return new FormGroupFieldNode(fieldName, controlInit);
    }


    @Override
    public Node visitFormControlInit(AngularParser.FormControlInitContext ctx) {
        List<String> args = new ArrayList<>();
        if (ctx.formControlArgs() != null) {
            for (var arg : ctx.formControlArgs().children) {
                args.add(arg.getText());
            }
        }

        // تحليل args لتحديد القيمة الابتدائية والـ validators
        String initialValue = null;
        List<String> validators = new ArrayList<>();

        if (!args.isEmpty()) {
            initialValue = args.get(0); // أول عنصر هو القيمة الابتدائية
            if (args.size() > 1) {
                validators = args.subList(1, args.size()); // الباقي validators
            }
        }

        return new FormControlInitNode(initialValue, validators);
    }


    @Override
    public Node visitTYPEFUN(AngularParser.TYPEFUNContext ctx) {
        return new ModifierNode(ctx.getText());
    }

    @Override
    public Node visitBASEvalueLABEL(AngularParser.BASEvalueLABELContext ctx) {

        ParseTree child = ctx.getChild(0);  // نأخذ أول ابن لأنه يمثل نوع basevalue

        if (child instanceof AngularParser.IDENTIFIRELABELContext identCtx) {
            String ident = identCtx.IDENTIFIER().getText();
            return new IdentifierValueNode(ident);

        } else if (child instanceof AngularParser.STRINGLABELContext stringCtx) {
            String value = stringCtx.STRING().getText();
            return new StringValueNode(value);

        } else if (child instanceof AngularParser.NUMBERLABELContext numberCtx) {
            String value = numberCtx.NUMBER().getText();
            return new NumberNode(value); // تأكد من أن الكونستركتر يقبل 1 باراميتر

        } else if (child instanceof AngularParser.ANYLABELContext) {
            return new AnyValueNode("any");

        } else if (child instanceof AngularParser.VOIDLABELContext) {
            return new VoidNode("void");

        } else if (child instanceof AngularParser.NULLLABELContext) {
            return new NullNode("null");

        } else if (child instanceof AngularParser.ONINITLABELContext) {
            return new OnInitNode("OnInit");

        } else if (child instanceof AngularParser.FORMGROUPLABELContext) {
            return new FormGroupValueNode("FormGroup");

        } else if (child instanceof AngularParser.FORMCONTROLLABELContext) {
            return new FormControlValueNode("FormControl");

        }

        errorHandler.reportSemanticError("نوع basevalue غير معروف", ctx.start);
        return null;
    }

    @Override
    public Node visitARRAYTAYPELABEL(AngularParser.ARRAYTAYPELABELContext ctx) {
        String arrayType = ctx.getText();
        return new ArrayTypeNode(arrayType);     }

    @Override
    public Node visitFORMGROUPLABEL(AngularParser.FORMGROUPLABELContext ctx) {
        return new FormGroupValueNode("FormGroup");
    }

    @Override
    public Node visitFORMCONTROLLABEL(AngularParser.FORMCONTROLLABELContext ctx) {
        return new FormControlValueNode("FormControl");
    }

    @Override
    public Node visitAddProductMethod(AngularParser.AddProductMethodContext ctx) {
        ProductParameterNode param = (ProductParameterNode) visit(ctx.productParameter());
        List<Node> statements = new ArrayList<>();
        symbolTable.enterScope("AddProductMethod");
        try {
            if (ctx.variableDeclaration() != null) {
                for (var stmtCtx : ctx.variableDeclaration()) {
                    Node n = visit(stmtCtx);
                    if (n != null) statements.add(n);
                }
            }
            if (ctx.expressionStatement() != null) {
                for (var exprCtx : ctx.expressionStatement()) {
                    Node n = visit(exprCtx);
                    if (n != null) statements.add(n);
                }
            }
            if (ctx.returnStatement() != null) {
                for (var retCtx : ctx.returnStatement()) {
                    Node n = visit(retCtx);
                    if (n != null) statements.add(n);
                }
            }
        } finally {
            symbolTable.exitScope();
        }
        return new AddProductMethodNode(param, statements);
    }
//////////////////////////////////////////////////////here1/////////////////////////////
    @Override
    public Node visitVariableDeclaration(AngularParser.VariableDeclarationContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        String type = ctx.propertyAccess().getText(); // حسب القاعدة type any
        // يمكن تسجيل المتغير في جدول الرموز إذا لزم الأمر:
        symbolTable.addSymbol(new SymbolEntry(name, SymbolType.VARIABLE, type, symbolTable.getCurrentScope(),sourceFile));
        return new ProductParameterNode(name, type);
    }

    @Override
    public Node visitExpressionStatement(AngularParser.ExpressionStatementContext ctx) {
        Node expr;
        if (ctx.methodCall() != null) {
            expr = visit(ctx.methodCall());
        } else {
            expr = visit(ctx.assignment());
        }
        return new ExpressionStNode(expr);
    }

    @Override
    public Node visitAssignment(AngularParser.AssignmentContext ctx) {
        Node left = visit(ctx.propertyAccessChain());
        Node right = visit(ctx.expression());
        return new AssignmentNode(left, right);
    }

    @Override
    public Node visitDeleteProductMethod(AngularParser.DeleteProductMethodContext ctx) {
        Node idParam = visit(ctx.idParameter());
        Node filterAssign = visit(ctx.filterAssignment());
        Node simpleNext = visit(ctx.simpleNextCall());
        return new DeleteProductMethodNode(idParam, filterAssign, simpleNext);
    }

    @Override
    public Node visitProductParameter(AngularParser.ProductParameterContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        String type = ctx.IDENTIFIER().getText();
        symbolTable.addSymbol(new SymbolEntry(name, SymbolType.VARIABLE, type, symbolTable.getCurrentScope(),sourceFile));
        return new ProductParameterNode(name, type);
    }
//////////////////////////////////////////packegr///////////////////////
    @Override
    public Node visitConstStatement(AngularParser.ConstStatementContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();
        Node propertyAccess = visit(ctx.propertyAccess());
        symbolTable.addSymbol(new SymbolEntry(identifier, SymbolType.CONST, "propertyAccess", symbolTable.getCurrentScope(),sourceFile));
        return new ConstStatementNode(identifier, propertyAccess);
    }

    @Override
    public Node visitSubjectNextStatement(AngularParser.SubjectNextStatementContext ctx) {
        Node propertyAccess = visit(ctx.propertyAccess());
        Node spreadExpr = visit(ctx.spreadExpression());
        return new SubjectNextStatementNode(propertyAccess, spreadExpr);
    }

    @Override
    public Node visitSpreadExpression(AngularParser.SpreadExpressionContext ctx) {
        Node expr = null;
        if (ctx.IDENTIFIER() != null) {
            expr = new IdentifierNode(ctx.IDENTIFIER().getText());
        } else if (ctx.propertyAccess() != null) {
            expr = visit(ctx.propertyAccess());
        } else if (ctx.arrayLiteral() != null) {
            expr = visit(ctx.arrayLiteral());
        } else if (ctx.objectLiteral() != null) {
            expr = visit(ctx.objectLiteral());
        }
        return new SpreadExpressionNode(expr);
    }

    @Override
    public Node visitArrayElements(AngularParser.ArrayElementsContext ctx) {
        List<Node> elements = new ArrayList<>();
        elements.add(visit(ctx.expression(0)));
        for (int i = 1; i < ctx.expression().size(); i++) {
            elements.add(visit(ctx.expression(i)));
        }
        return new ArrayElementsNode(elements);
    }

    @Override
    public Node visitSubjectFilterStatement(AngularParser.SubjectFilterStatementContext ctx) {
        Node propAccessChain = visit(ctx.propertyAccess().get(0));
        Node filterExpr = visit(ctx.filterExpression());
        return new SubjectFilterStatementNode(propAccessChain, filterExpr);
    }

    @Override
    public Node visitFilterAssignment(AngularParser.FilterAssignmentContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        Node filterExpr = visit(ctx.filterExpression());
        symbolTable.addSymbol(new SymbolEntry(name, SymbolType.VARIABLE, "filter", symbolTable.getCurrentScope(),sourceFile));
        return new FilterAssignmentNode(name, filterExpr);
    }

    @Override
    public Node visitSimpleNextCall(AngularParser.SimpleNextCallContext ctx) {
        String identifier = ctx.propertyAccess().getText(); // مثل: this.products
        String expressionText = ctx.expression().getText(); // مثل: updated

        // لفّ التعبير في TextNode مؤقتًا (أو ExpressionNode لو عندك)
        TextNode expr = new TextNode(expressionText);

        return new SimpleNextCallNode(identifier, expr);
    }
////////////////////////////////////string
//
    @Override
    public Node visitFilterExpression(AngularParser.FilterExpressionContext ctx) {
        String left = ctx.IDENTIFIER(0).getText();
        String operator = ctx.euals().getText();
        String right = ctx.IDENTIFIER(1).getText();
        return new FilterExpressionNode(left, operator, right);
    }

    @Override
    public Node visitMethodBody(AngularParser.MethodBodyContext ctx) {
        List<Node> statements = new ArrayList<>();
        for (var stmtCtx : ctx.statement()) {
            statements.add(visit(stmtCtx));
        }
        return new MethodBodyNode(statements);
    }

    @Override
    public Node visitEuals(AngularParser.EualsContext ctx) {
        return new EualsNode(ctx.getText());
    }

    @Override
    public Node visitPropertyAccessChain(AngularParser.PropertyAccessChainContext ctx) {
        List<String> chain = new ArrayList<>();
        for (var token : ctx.IDENTIFIER()) {
            chain.add(token.getText());
        }
        // قد تشمل أيضاً FILTER و NEXT لذا يمكن إضافتها هنا حسب الحاجة
        return new PropertyAccessChainNode(chain);
    }

    @Override
    public Node visitIdParameter(AngularParser.IdParameterContext ctx) {
        String name = ctx.IDENTIFIER(0).getText();
        String type = ctx.IDENTIFIER(1).getText();
        symbolTable.addSymbol(new SymbolEntry(name, SymbolType.VARIABLE, type, symbolTable.getCurrentScope(),sourceFile));
        return new ProductParameterNode(name, type);
    }



    @Override
    public Node visitSelector(AngularParser.SelectorContext ctx) {
        String key = ctx.SELECTOR().getText();
        String value = ctx.STRING().getText().replaceAll("^['\"]|['\"]$", "");

        String scope = symbolTable.getCurrentScope();

        // التحقق من صحة selector
        if (!value.matches("^[a-zA-Z_][a-zA-Z0-9_-]*$")) {
            errorHandler.reportSemanticError("Invalid selector value: '" + value + "'. Selector must start with a letter or underscore and contain only alphanumeric characters, underscores or hyphens.", ctx.start);
        } else if (selectorSymbolTable.symbolExists(value)) {
            errorHandler.reportSemanticError("Duplicate selector value: '" + value + "'", ctx.start);
        }

        SymbolEntry entry = new SymbolEntry(key, SymbolType.METADATA, value, scope,sourceFile);
        selectorSymbolTable.addSymbol(entry);
        symbolTable.addSymbol(entry);

        return new SelectorNode(key, value);
    }

    @Override
    public Node visitTemplateurl(AngularParser.TemplateurlContext ctx) {
        String rawValue = ctx.STRING().getText().replaceAll("^\"|\"$", "");

        symbolTable.addSymbol(new SymbolEntry(
                "templateUrl", SymbolType.METADATA, rawValue, symbolTable.getCurrentScope(),sourceFile
        ));

        String resourcePath = "/templates/" + rawValue;
        String fileContent = "";


        // 3) إذا نُسِج المحتوى، نحلله
        List<HtmlElementNode> elements = new ArrayList<>();


        // 4) إرجاع الـ AST node
        return new TemplateUrlNode(rawValue, elements);
    }


    @Override
    public Node visitProducts(AngularParser.ProductsContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        Node elementsNode = visit(ctx.elementList());

        symbolTable.addSymbol(new SymbolEntry(id, SymbolType.FUNCTION, null, symbolTable.getCurrentScope(),sourceFile));

        symbolTable.enterScope(id);

        ProductsNode productsNode = null;

        if (elementsNode instanceof ElementListNode) {
            productsNode = new ProductsNode(id, (ElementListNode) elementsNode);
        }

        symbolTable.exitScope();

        return productsNode;
    }


    @Override
    public Node visitElementList(AngularParser.ElementListContext ctx) {
        List<ElementNode> elements = new ArrayList<>();

        for (AngularParser.ElementContext elementCtx : ctx.element()) {
            elements.add((ElementNode) visit(elementCtx));
        }
        return new ElementListNode(elements);
    }


    @Override
    public Node visitElement(AngularParser.ElementContext ctx) {
        List<PairNode> pairs = new ArrayList<>();

        for (AngularParser.PairContext pairCtx : ctx.pair()) {
            Node pairNode = visit(pairCtx);
            if (pairNode instanceof PairNode) {
                pairs.add((PairNode) pairNode);
            }
        }

        return new ElementNode(pairs);
    }


    @Override
    public Node visitPair(AngularParser.PairContext ctx) {
        Node keyNode = visit(ctx.basevalue());
        String valueNode = ctx.value().getText();

        List<Node> keyList = new ArrayList<>();
        keyList.add(keyNode);

       // String valueStr = cvalueNode;

        symbolTable.addSymbol(new SymbolEntry(ctx.basevalue().getText(), SymbolType.PARAMETER, valueNode, symbolTable.getCurrentScope(),sourceFile));

        return new PairNode(keyList, valueNode);

    }

    @Override
    public Node visitIDENTIFIRELABEL(AngularParser.IDENTIFIRELABELContext ctx) {
        return new IdentifierNode(ctx.IDENTIFIER().getText());
    }

    @Override
    public Node visitSTRINGLABEL(AngularParser.STRINGLABELContext ctx) {
        String value = ctx.STRING().getText().replaceAll("^\"|\"$", "");
        return new StringNode(value);
    }

    @Override
    public Node visitNUMBERLABEL(AngularParser.NUMBERLABELContext ctx) {
        return new NumberNode(ctx.NUMBER().getText());
    }

    @Override
    public Node visitANYLABEL(AngularParser.ANYLABELContext ctx) {
        return new AnyNode("any");
    }

    @Override
    public Node visitONINITLABEL(AngularParser.ONINITLABELContext ctx) {
        return new VoidNode("void");
    }

    @Override
    public Node visitVOIDLABEL(AngularParser.VOIDLABELContext ctx) {
        return new OnInitNode("onit");
    }

    @Override
    public Node visitNULLLABEL(AngularParser.NULLLABELContext ctx) {
        return new NullNode("null");
    }

    @Override
    public Node visitConstructor(AngularParser.ConstructorContext ctx) {
        String constructorName = ctx.CONSTRUCTOR().getText();

        List<Node> parameters = new ArrayList<>();

        symbolTable.addSymbol(new SymbolEntry(
                constructorName,
                SymbolType.CONSTRUCTOR,
                "CONSTRUCTER",
                symbolTable.getCurrentScope(),sourceFile
        ));

        if (ctx.parameter() != null && !ctx.parameter().isEmpty()) {
            symbolTable.enterScope(constructorName);
            for (var parameterCtx : ctx.parameter()) {
                String modifier = parameterCtx.modifiers() != null ? parameterCtx.modifiers().getText() : "";
                String name = parameterCtx.IDENTIFIER() != null ? parameterCtx.IDENTIFIER().getText() : "";
                String type = parameterCtx.value() != null ? parameterCtx.value().getText() : "";

                if (!type.isEmpty() && !importChecker.isImported(type)) {
                    errorHandler.reportSemanticError(
                            "The class or service '" + type + "' is used without importing it.",
                            parameterCtx.start
                    );
                }

                parameters.add(new ParameterNode(name, type, modifier));
            }
        }

        List<Node> statements = new ArrayList<>();
        if (ctx.statement() != null) {
            for (var statm : ctx.statement()) {
                Node stmtNode = visit(statm);
                if (stmtNode != null) {
                    statements.add(stmtNode);
                }
            }
        }

        List<Node> serviceAssignment = new ArrayList<>();
        if (ctx.serviceAssignment() != null) {
            for (var statm : ctx.serviceAssignment()) {
                Node assignmentNode = visit(statm);
                if (assignmentNode != null) {
                    serviceAssignment.add(assignmentNode);
                }
            }
        }

        symbolTable.exitScope();

        return new ConstructorNode(constructorName, parameters, statements, serviceAssignment);
    }


    @Override
    public Node visitLABELED_STATEMENT(AngularParser.LABELED_STATEMENTContext ctx) {
        String label = ctx.IDENTIFIER().getText();
        Node statement = visit(ctx.statement());
        return new LabeledStatementNode(label, statement);
    }

    @Override
    public Node visitIF_STATEMENT(AngularParser.IF_STATEMENTContext ctx) {
        return visit(ctx.ifStatement());
    }

    @Override
    public Node visitLOOP_STATEMENT(AngularParser.LOOP_STATEMENTContext ctx) {
        return visit(ctx.loopStatement());
    }

    @Override
    public Node visitSWITCH_STATEMENT(AngularParser.SWITCH_STATEMENTContext ctx) {
        return visit(ctx.switchStatement());
    }

    @Override
    public Node visitMETHOD_DECLARATION_STATEMENT(AngularParser.METHOD_DECLARATION_STATEMENTContext ctx) {
        return visit(ctx.methodDeclaration());
    }

    @Override
    public Node visitMethodDeclaration(AngularParser.MethodDeclarationContext ctx) {
        String methodName = ctx.IDENTIFIER().getText();

        // استخراج نوع الإرجاع
        String returnType = ctx.value().getText();

        // استخراج المعاملات
        List<ParameterNode> parameters = new ArrayList<>();
        List<AngularParser.ParameterContext> paramContexts = ctx.parameter();
        for (AngularParser.ParameterContext paramCtx : paramContexts) {
            String paramText = paramCtx.getText();
            // نفترض الآن أن الشكل هو: name:type=defaultValue
            String name = "", type = "", defaultValue = "";

            if (paramText.contains(":")) {
                String[] parts = paramText.split(":");
                name = parts[0];

                if (parts[1].contains("=")) {
                    String[] typeDefault = parts[1].split("=");
                    type = typeDefault[0];
                    defaultValue = typeDefault[1];
                } else {
                    type = parts[1];
                }
            } else {
                name = paramText; // في حال لم يكن فيه نوع
            }

            parameters.add(new ParameterNode(name, type, defaultValue));
        }

        // استخراج جسم الدالة (list of statements)
        List<StatementNode> body = new ArrayList<>();
        for (AngularParser.StatementContext stmtCtx : ctx.statement()) {
            StatementNode statement = (StatementNode) visit(stmtCtx);
            body.add(statement);
        }

        return new MethodDeclarationNode(methodName, parameters, returnType, body);
    }

    @Override
    public Node visitFUNCTION_CALL_STATEMENT(AngularParser.FUNCTION_CALL_STATEMENTContext ctx) {
        PropertyAccessNode functionName = (PropertyAccessNode) visit(ctx.functionCall().propertyAccess());
        List<ExpressionNode> args = new ArrayList<>();
        if (ctx.functionCall().argumentList() != null) {
            for (var exprCtx : ctx.functionCall().argumentList().expression()) {
                ExpressionNode exprNode = (ExpressionNode) visit(exprCtx);
                args.add(exprNode);
            }
        }
        return new FunctionCallNode(functionName, args);
    }

    @Override
    public Node visitASSIGNMENT_STATEMENT(AngularParser.ASSIGNMENT_STATEMENTContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();
        ExpressionNode expr = (ExpressionNode) visit(ctx.expression());
        return new AssignmentStatementNode(identifier, expr);
    }

    @Override
    public Node visitRETURN_STATEMENT(AngularParser.RETURN_STATEMENTContext ctx) {
        ExpressionNode expr = (ExpressionNode) visit(ctx.returnStatement());
        return new ReturnStatementNode(expr);
    }

    @Override
    public Node visitPROPERTY_ACCESS_STATEMENT(AngularParser.PROPERTY_ACCESS_STATEMENTContext ctx) {
        return visit(ctx.propertyAccess());
    }

    @Override
    public Node visitCONSOLE_STATEMENT(AngularParser.CONSOLE_STATEMENTContext ctx) {
        return visit(ctx.propertystatment());
    }

    @Override
    public Node visitEXPMINMIN(AngularParser.EXPMINMINContext ctx) {
        ExpressionNode expr = (ExpressionNode) visit(ctx.expression());
        return new DecrementExpressionNode(expr);
    }

    @Override
    public Node visitEXPSTAR(AngularParser.EXPSTARContext ctx) {
        ExpressionNode left = safeVisitExpression(ctx.expression(0));
        ExpressionNode right = safeVisitExpression(ctx.expression(1));
        return new MultiplicationExpressionNode(left, right);
    }




    @Override
    public Node visitEXPMINUS(AngularParser.EXPMINUSContext ctx) {
        ExpressionNode left = safeVisitExpression(ctx.expression(0));
        ExpressionNode right = safeVisitExpression(ctx.expression(1));
        return new MinusExpressionNode(left, right);
    }

    @Override
    public Node visitEXPPRO(AngularParser.EXPPROContext ctx) {
        return visit(ctx.propertyAccess());
    }

    @Override
    public Node visitEXPID(AngularParser.EXPIDContext ctx) {
        return new IdentifierExpressionNode(ctx.IDENTIFIER().getText());
    }

    @Override
    public Node visitVAR_DECLARATION_STATEMENT(AngularParser.VAR_DECLARATION_STATEMENTContext ctx) {
        String id = ctx.letDeclaration().IDENTIFIER().getText();
        ExpressionNode expr = (ExpressionNode) visit(ctx.letDeclaration().expression());
        return new VarDeclarationNode(id, expr);
    }

    @Override
    public Node visitFUNCTIONCALLLABEL(AngularParser.FUNCTIONCALLLABELContext ctx) {
        PropertyAccessNode functionName = (PropertyAccessNode) visit(ctx.functionCall().propertyAccess());
        List<ExpressionNode> args = new ArrayList<>();
        if (ctx.functionCall().argumentList() != null) {
            for (var exprCtx : ctx.functionCall().argumentList().expression()) {
                ExpressionNode exprNode = (ExpressionNode) visit(exprCtx);
                args.add(exprNode);
            }
        }
        return new FunctionCallNode(functionName, args);
    }

    @Override
    public Node visitObjectLiteralExpr(AngularParser.ObjectLiteralExprContext ctx) {
        Map<String, Node> properties = new HashMap<>();

        for (ParseTree child : ctx.children) {
            if (child instanceof AngularParser.ObjectPropertyContext) {
                AngularParser.ObjectPropertyContext prop = (AngularParser.ObjectPropertyContext) child;
                String key = prop.IDENTIFIER().getText();
                Node value = visit(prop.expression());
                properties.put(key, value);
            }
        }

        return new ObjectLiteralNode(properties);
    }



    @Override
    public Node visitLambdaExpressionBlock(AngularParser.LambdaExpressionBlockContext ctx) {
        // زيارة المعلمات وتحويلها إلى ParametersNode
        ParametersNode params = (ParametersNode) visit(ctx.parameters());



        // زيارة كل statement داخل جسم اللامبدا
        List<StatementNode> stmts = new ArrayList<>();
        for (var stmtCtx : ctx.statement()) {
            StatementNode stmtNode = (StatementNode) visit(stmtCtx); // تأكد من الـ cast
            if (stmtNode != null) {
                stmts.add(stmtNode);
            }
        }
        return new LambdaExprBlockNode(params, stmts);
    }


    @Override
    public Node visitLambdaExpressionExpr(AngularParser.LambdaExpressionExprContext ctx) {
        ParametersNode params = (ParametersNode) visit(ctx.parameters());
        Node expr = visit(ctx.expression());
        return new LambdaExprExpressionNode(params, expr);
    }

    @Override
    public Node visitParameters(AngularParser.ParametersContext ctx) {
        List<ParameterNode> params = new ArrayList<>();

        if (ctx.IDENTIFIER() != null) {
            params.add(new ParameterNode(ctx.IDENTIFIER().getText(), null, null));
        } else if (ctx.parameterList() != null) {
            for (var id : ctx.parameterList().parameter2()) {
                params.add(new ParameterNode(id.getText(), null, null));
            }
        }

        return new ParametersNode(params);
    }


    @Override
    public Node visitLambdaExpr(AngularParser.LambdaExprContext ctx) {
        return visit(ctx.lambdaExpression());
    }

    @Override
    public Node visitEXP_STRICT_NOT_EQUAL(AngularParser.EXP_STRICT_NOT_EQUALContext ctx) {
        ExpressionNode left = (ExpressionNode) visit(ctx.expression(0));
        ExpressionNode right = (ExpressionNode) visit(ctx.expression(1));
        return new StrictNotEqualNode(left, right);
    }

    @Override
    public Node visitArrayLiteralExpr(AngularParser.ArrayLiteralExprContext ctx) {
        List<ExpressionNode> elements = new ArrayList<>();
        for (AngularParser.ExpressionContext expr : ctx.arrayLiteral().expression()) {
            Node child = visit(expr);
            if (child instanceof ExpressionNode) {
                elements.add((ExpressionNode) child);
            }
        }
        return new ArrayLiteralNode(elements);
    }

    @Override
    public Node visitEXP_NOT_EQUAL(AngularParser.EXP_NOT_EQUALContext ctx) {
        ExpressionNode left = (ExpressionNode) visit(ctx.expression(0));
        ExpressionNode right = (ExpressionNode) visit(ctx.expression(1));
        return new NotEqualNode(left,right);
    }

    @Override
    public Node visitEXPSEMIRAT(AngularParser.EXPSEMIRATContext ctx) {
        String operator = ctx.getChild(0).getText(); // المفترض أن يكون '!'
        String formGroupType = ctx.FORMGROUP().getText(); // المفترض أن يكون 'FormGroup'

        return new UnaryFormGroupNode(operator, formGroupType);
    }

    @Override
    public Node visitKLGILGVIL(AngularParser.KLGILGVILContext ctx) {
        Node expr = visit(ctx.spreadExpression());
        return new SpreadExpressionNode(expr);
    }


    @Override
    public Node visitEXP_LOOSE_EQUAL(AngularParser.EXP_LOOSE_EQUALContext ctx) {
        Node left = visit(ctx.expression(0));
        Node right = visit(ctx.expression(1));
        return new LooseEqualExpressionNode(left, right);
    }

    @Override
    public Node visitPrimaryExpr(AngularParser.PrimaryExprContext ctx) {
        return visit(ctx.primaryExpression());
    }

    @Override
    public Node visitPropAccessExpr(AngularParser.PropAccessExprContext ctx) {
        if (ctx.getChildCount() > 0) {
            return visit(ctx.getChild(0)); // زيارة أول طفل
        }
        return null;
    }
////
////    @Override
////    public Node visitIdExpr(AngularParser.IdExprContext ctx) {
////        String id = ctx.IDENTIFIER().getText();
////        return new IdentifierNode(id);
////    }
////
////    @Override
////    public Node visitThisExprL(AngularParser.ThisExprLContext ctx) {
////        return new ThisExprNode();
////    }
////
////    @Override
////    public Node visitStrExpr(AngularParser.StrExprContext ctx) {
////        String value = ctx.STRING().getText();
////        return new StringExprNode(value);
////    }
////
////    @Override
////    public Node visitNumExpr(AngularParser.NumExprContext ctx) {
////        String numText = ctx.NUMBER().getText();
////
////        return new NumberNode(numText);
////    }
////
////    @Override
////    public Node visitParenExprL(AngularParser.ParenExprLContext ctx) {
////        return visit(ctx.expression());
////    }
////
////
////    @Override
////    public Node visitJJJJKKKK(AngularParser.JJJJKKKKContext ctx) {
////        Node baseChain = visit(ctx.optionalChain().propertyAccessChain());
////
////        List<String> optionalProps = new ArrayList<>();
////        for (int i = 0; i < ctx.optionalChain().IDENTIFIER().size(); i++) {
////            optionalProps.add(ctx.optionalChain().IDENTIFIER(i).getText());
////        }
////
////        return new OptionalChainNode(baseChain, optionalProps);
////    }
////
////    @Override
////    public Node visitPropertyAccessCondition(AngularParser.PropertyAccessConditionContext ctx) {
////        return visit(ctx.propertyAccess());
////    }
////
////    @Override
////    public Node visitEqualityCondition(AngularParser.EqualityConditionContext ctx) {
////        return visit(ctx.equalityExpression());
////    }
//
    @Override
    public Node visitGHJJK(AngularParser.GHJJKContext ctx) {
        Node caller = null;
        if (ctx.methodCall().propertyAccessChain() != null) {
            caller = visit(ctx.methodCall().propertyAccessChain());
        } else if (ctx.methodCall().optionalChain() != null) {
            caller = visit(ctx.methodCall().optionalChain());
        }

        List<Node> args = new ArrayList<>();
        if (ctx.methodCall().argumentList() != null) {
            for (var argCtx : ctx.methodCall().argumentList().expression()) {
                args.add(visit(argCtx));
            }
        }
        return new MethodCallNode(caller, args);
    }

    @Override
    public Node visitEXP_STRICT_EQUAL(AngularParser.EXP_STRICT_EQUALContext ctx) {
        Node left = visit(ctx.expression(0));
        Node right = visit(ctx.expression(1));
        return new BinaryOperationNode(left, "===", right);
    }

    @Override
    public Node visitOptionalChain(AngularParser.OptionalChainContext ctx) {
        Node base = visit(ctx.propertyAccessChain());
        List<String> optionalProps = new ArrayList<>();
        for (var t : ctx.IDENTIFIER()) {
            optionalProps.add(t.getText());
        }
        return new OptionalChainNode(base, optionalProps);
    }

    @Override
    public Node visitPROP_CHAIN(AngularParser.PROP_CHAINContext ctx) {
        List<String> chain = new ArrayList<>();
        for (var t : ctx.propertyAccessChain().IDENTIFIER()) {
            chain.add(t.getText());
        }
        return new PropertyAccessChainNode(chain);
    }


    @Override
    public Node visitBinaryOperation(AngularParser.BinaryOperationContext ctx) {
        Node left = visit(ctx.expression(0));
        Node right = visit(ctx.expression(1));
        String op = ctx.binaryOp().getText();

        return new BinaryOperationNode(left, op, right);
    }

    @Override
    public Node visitArgumentList(AngularParser.ArgumentListContext ctx) {
        ArgumentListNode node = new ArgumentListNode();

        for (int i = 0; i < ctx.getChildCount(); i++) {
            // نفترض كل طفل هو expression أو spreadExpression
            var child = ctx.getChild(i);
            if (child instanceof AngularParser.ExpressionContext || child instanceof AngularParser.SpreadExpressionContext) {
                Node argNode = visit(child);
                node.addArgument(argNode);
            }
        }

        return node;
    }

    @Override
    public Node visitEXPNUMBER(AngularParser.EXPNUMBERContext ctx) {
        return new NumberNode(ctx.NUMBER().getText());
    }

    @Override
    public Node visitEXPINTEGER(AngularParser.EXPINTEGERContext ctx) {
        return new NumberLiteralNode(Integer.parseInt(ctx.INTEGER().getText()));
    }

////    @Override
////    public Node visitEXPPLUSPLUS(AngularParser.EXPPLUSPLUSContext ctx) {
////        ExpressionNode expr = (ExpressionNode) visit(ctx.expression());
////        return new IncrementExpressionNode(expr);
////    }
//
    @Override
    public Node visitEXPPAREN(AngularParser.EXPPARENContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public Node visitEXPPLUS(AngularParser.EXPPLUSContext ctx) {
        ExpressionNode left = safeVisitExpression(ctx.expression(0));
        ExpressionNode right = safeVisitExpression(ctx.expression(1));
        return new PlusExpressionNode(left, right);
    }

    @Override
    public Node visitEXPDIVIDE(AngularParser.EXPDIVIDEContext ctx) {
        ExpressionNode left = safeVisitExpression(ctx.expression(0));
        ExpressionNode right = safeVisitExpression(ctx.expression(1));
        return new DivisionExpressionNode(left, right);
    }

    @Override
    public Node visitEXPLESS(AngularParser.EXPLESSContext ctx) {
        ExpressionNode left = safeVisitExpression(ctx.expression(0));
        ExpressionNode right = safeVisitExpression(ctx.expression(1));
        return new LessThanExpressionNode(left, right);
    }

    @Override
    public Node visitEXPSTRING(AngularParser.EXPSTRINGContext ctx) {
        return new StringLiteralNode(ctx.STRING().getText());
    }

    @Override
    public Node visitEXPEQUALS(AngularParser.EXPEQUALSContext ctx) {
        ExpressionNode left = safeVisitExpression(ctx.expression(0));
        ExpressionNode right = safeVisitExpression(ctx.expression(1));
        return new EqualsExpressionNode(left, right);
    }

    @Override
    public Node visitEXPMOD(AngularParser.EXPMODContext ctx) {
        ExpressionNode left = safeVisitExpression(ctx.expression(0));
        ExpressionNode right = safeVisitExpression(ctx.expression(1));
        return new ModExpressionNode(left, right);
    }

    @Override
    public Node visitEXPGREATER(AngularParser.EXPGREATERContext ctx) {
        ExpressionNode left = safeVisitExpression(ctx.expression(0));
        ExpressionNode right = safeVisitExpression(ctx.expression(1));
        return new GreaterThanExpressionNode(left, right);
    }

    @Override
    public Node visitFORCLASSIC(AngularParser.FORCLASSICContext ctx) {
        String identifier = ctx.IDENTIFIER(0).getText(); // المتغير في LET IDENTIFIER
        List<StatementNode> bodyStatements = ctx.statement().stream()
                .map(stmt -> (StatementNode) visit(stmt))
                .collect(Collectors.toList());

        // اختياري: ممكن إنشاء نوع Loop خاص لـ for التقليدية
        return new LoopStatementNode(identifier, null, bodyStatements);
    }

    @Override
    public Node visitFORIN(AngularParser.FORINContext ctx) {
        String iteratorVar = ctx.IDENTIFIER(0).getText(); // المتغير في LET IDENTIFIER
        String iterable = ctx.IDENTIFIER(1).getText(); // الـ iterable بعد IN

        // إذا في DOT access (e.g., items.data.more)
        if (!ctx.DOT().isEmpty()) {
            for (int i = 0; i < ctx.IDENTIFIER().size() - 1; i++) {
                iterable += "." + ctx.IDENTIFIER(i + 1).getText();
            }
        }

        List<StatementNode> bodyStatements = ctx.statement().stream()
                .map(stmt -> (StatementNode) visit(stmt))
                .collect(Collectors.toList());

        return new LoopStatementNode(iteratorVar, iterable, bodyStatements);
    }

    @Override
    public Node visitWhileStatement(AngularParser.WhileStatementContext ctx) {
        ExpressionNode condition = (ExpressionNode) visit(ctx.expression());
        List<StatementNode> body = new ArrayList<>();
        symbolTable.enterScope("while");
        for (var stmt : ctx.statement()) {
            Node node = visit(stmt);
            if (node instanceof StatementNode) {
                body.add((StatementNode) node);
            }
        }
        symbolTable.exitScope();
        return new WhileStatementNode(condition, body);
    }
//
    @Override
    public Node visitSwitchStatement(AngularParser.SwitchStatementContext ctx) {
        ExpressionNode expression = (ExpressionNode) visit(ctx.expression());
        List<CaseClauseNode> cases = new ArrayList<>();
        symbolTable.enterScope("Switch");
        for (var caseCtx : ctx.caseClause()) {
            CaseClauseNode caseNode = (CaseClauseNode) visit(caseCtx);
            cases.add(caseNode);
        }
        symbolTable.exitScope();
        return new SwitchStatementNode(expression, cases);
    }
//
    @Override
    public Node visitIfStatement(AngularParser.IfStatementContext ctx) {
        ExpressionNode condition = (ExpressionNode) visit(ctx.ifCondition());

        List<StatementNode> ifBody = new ArrayList<>();
        List<StatementNode> elseBody = new ArrayList<>();

        symbolTable.enterScope("if");

        // statements كلها
        List<AngularParser.StatementContext> stmts = ctx.statement();

        if (ctx.ELSE() != null) {
            // إذا كان هناك else، نقسم النصف للنصف تقريبًا (افتراضيًا)
            int splitIndex = stmts.size() / 2;
            for (int i = 0; i < stmts.size(); i++) {
                Node node = visit(stmts.get(i));
                if (node instanceof StatementNode) {
                    if (i < splitIndex) {
                        ifBody.add((StatementNode) node);
                    } else {
                        elseBody.add((StatementNode) node);
                    }
                }
            }
        } else {
            // بدون else
            for (var stmt : stmts) {
                Node node = visit(stmt);
                if (node instanceof StatementNode) {
                    ifBody.add((StatementNode) node);
                }
            }
        }

        symbolTable.exitScope();

        return new IfStatementNode(condition, ifBody, elseBody);
    }
    @Override
    public Node visitStrictEquality(AngularParser.StrictEqualityContext ctx) {
        ExpressionNode left = safeVisitExpression(ctx.expression(0));
        ExpressionNode right = safeVisitExpression(ctx.expression(1));
        return new StrictEqualityNode(left, right);
    }

    @Override
    public Node visitLooseEquality(AngularParser.LooseEqualityContext ctx) {
        ExpressionNode left = safeVisitExpression(ctx.expression(0));
        ExpressionNode right = safeVisitExpression(ctx.expression(1));
        return new LooseEqualityNode(left, right);
    }

    @Override
    public Node visitNotEquality(AngularParser.NotEqualityContext ctx) {
        ExpressionNode left = safeVisitExpression(ctx.expression(0));
        ExpressionNode right = safeVisitExpression(ctx.expression(1));
        return new NotEqualityNode(left, right);
    }

    @Override
    public Node visitStrictNotEquality(AngularParser.StrictNotEqualityContext ctx) {
        ExpressionNode left = safeVisitExpression(ctx.expression(0));
        ExpressionNode right = safeVisitExpression(ctx.expression(1));
        return new StrictNotEqualityNode(left, right);
    }


    @Override
    public Node visitEXPRESSION_STATEMENT(AngularParser.EXPRESSION_STATEMENTContext ctx) {
        Node expr = visit(ctx.expression());
        return new ExpressionStatementNode(expr);
    }


    @Override
    public Node visitCaseClause(AngularParser.CaseClauseContext ctx) {
        ExpressionNode caseExpr = ctx.DEFAULT() == null ? (ExpressionNode) visit(ctx.expression()) : null;
        List<StatementNode> statements = new ArrayList<>();
        for (var stmt : ctx.statement()) {
            Node node = visit(stmt);
            if (node instanceof StatementNode) {
                statements.add((StatementNode) node);
            }
        }
        return new CaseClauseNode(caseExpr, statements, false);

    }

    @Override
    public Node visitNgOnInit(AngularParser.NgOnInitContext ctx) {
        String name = ctx.NGONINIT().getText();
        String isvoid = ctx.VOID().getText();

        List<Node> body = new ArrayList<>();

        for (var stmt : ctx.statement()) {
            Node node = visit(stmt);
            if (node != null) {
                body.add(node);
            }
        }

        for (var routeAssign : ctx.routeParamAssignment()) {
            Node node = visit(routeAssign);
            if (node != null) {
                body.add(node);
            }
        }

        for (var call : ctx.serviceCall()) {
            Node node = visit(call);
            if (node != null) {
                body.add(node);
            }
        }

        // أضف ngOnInit إلى جدول الرموز كـ function
        symbolTable.addSymbol(new SymbolEntry(name, SymbolType.FUNCTION, "void", symbolTable.getCurrentScope(),sourceFile));

        return new NGOnInit(name, isvoid, body);
    }

    @Override
    public Node visitServiceCall(AngularParser.ServiceCallContext ctx) {
        List<Node>propertyAccessChain= new ArrayList<>();

        if (ctx.propertyAccessChain() != null) {

            for (var statm : ctx.propertyAccessChain().children) {
                propertyAccessChain.add(visit(statm));
            }}
            List<Node>argumentList= new ArrayList<>();
            if (ctx.argumentList() != null) {

                for (var statm : ctx.argumentList().children) {
                    argumentList.add(visit(statm));
                }
            }
        return new ServiceCallNode(propertyAccessChain,argumentList);
    }

    @Override
    public Node visitGetProductByIdMethod(AngularParser.GetProductByIdMethodContext ctx) {
        String methodName = ctx.GETPRODUCTBYID().getText(); // غالبًا سيكون "getProductById"

        List<Node> idParameter = new ArrayList<>();
        if (ctx.idParameter() != null) {
            for (var param : ctx.idParameter().children) {
                Node paramNode = visit(param);
                if (paramNode != null) {
                    idParameter.add(paramNode);
                }
            }
        }

        List<Node> returnType = new ArrayList<>();
        if (ctx.returnType() != null) {
            for (var rt : ctx.returnType().children) {
                Node rtNode = visit(rt);
                if (rtNode != null) {
                    returnType.add(rtNode);
                }
            }
        }

        Node returnExpression = null;
        if (ctx.expression() != null) {
            returnExpression = visit(ctx.expression());
        }

        return new GetProductByIdNode(methodName, returnExpression, idParameter, returnType);
    }

    @Override
    public Node visitTYPESPRCLABEL(AngularParser.TYPESPRCLABELContext ctx) {
        TypeSpecNode typeSpec = (TypeSpecNode) visit(ctx.typeSpec());
        return new ReturnTypeNode(typeSpec.getType(), false);
    }

    @Override
    public Node visitVOIDLABELSINGLE(AngularParser.VOIDLABELSINGLEContext ctx) {
        return new ReturnTypeNode("void", true);
    }

    @Override
    public Node visitViewdetails(AngularParser.ViewdetailsContext ctx) {
        Node idParam = visit(ctx.idParameter());
        Node funcCall = visit(ctx.functionCall());
        return new ViewDetailsNode(idParam, funcCall);
    }

    @Override
    public Node visitParameter(AngularParser.ParameterContext ctx) {
        String modifier = null;
        if (ctx.modifiers() != null) {
            modifier = ctx.modifiers().getText();
        }
        String name = ctx.IDENTIFIER().getText();
        String type = ctx.value().getText();
        symbolTable.addSymbol(new SymbolEntry(name, SymbolType.PARAMETER, type, symbolTable.getCurrentScope(),sourceFile));
        ParameterNode parameterNode = new ParameterNode(name, type, modifier);
        return parameterNode;
    }

    @Override
    public Node visitParameterList(AngularParser.ParameterListContext ctx) {
        List<ParameterNode> parameters = new ArrayList<>();

        for (var paramCtx : ctx.parameter2()) {
            String name = paramCtx.IDENTIFIER().getText();
            String type = paramCtx.value().getText();
            parameters.add(new ParameterNode(name, type, null));
        }

        return new ParameterListNode(parameters);
    }

    @Override
    public Node visitFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx) {
        String functionName = ctx.IDENTIFIER().getText();
        List<ParameterNode> parameters = new ArrayList<>();

        if (ctx.parameterList() != null) {
            ParameterListNode paramListNode = (ParameterListNode) visit(ctx.parameterList());
            parameters = paramListNode.getParameters();
        }
        int paramCount = parameters.size();
        try {
            functionTable.addFunction(functionName, paramCount);
        } catch (SemanticException e) {
            errorHandler.reportSemanticError(e.getMessage(), ctx.start);
            System.err.println("Semantic Error at line " + ctx.start.getLine() + ": " + e.getMessage());

        }
        symbolTable.enterScope(functionName);
        symbolTable.addSymbol(new SymbolEntry(functionName, SymbolType.FUNCTION, null, null,sourceFile));
        super.visitFunctionDeclaration(ctx);
        symbolTable.exitScope();
        String returnType = ctx.value().getText();
        FunctionBodyNode body = (FunctionBodyNode) visit(ctx.functionB());

        return new FUNDECLRATIONNODE(functionName, parameters, returnType, body);
    }

    @Override
    public Node visitFunctionB(AngularParser.FunctionBContext ctx) {
        List<Node> statements = new ArrayList<>();
        for (AngularParser.StatementContext stmtCtx : ctx.statement()) {
            Node stmt = visit(stmtCtx);
            if (stmt != null) {
                statements.add(stmt);
            }
        }
        return new FunctionBlockNode(statements);
    }
//
    @Override
    public Node visitPropertystatment(AngularParser.PropertystatmentContext ctx) {
        List<ExpressionNode> args = new ArrayList<>();
        for (AngularParser.ExpressionContext exprCtx : ctx.expressionList().expression()) {
            ExpressionNode expr = (ExpressionNode) visit(exprCtx);
            args.add(expr);
        }
        return new ConsoleLogStatementNode(args);
    }

    @Override
    public Node visitSELECTPRODUCTLABEL(AngularParser.SELECTPRODUCTLABELContext ctx) {
        String name = ctx.SELECTPRODUCT().getText();
        List<ParameterNode> parameters = new ArrayList<>();
        for (var paramCtx : ctx.parameter()) {
            ParameterNode paramNode = (ParameterNode) visit(paramCtx);
            parameters.add(paramNode);
        }

        boolean isVoid = ctx.VOID() != null;

        List<StatementNode> statements = new ArrayList<>();
        if (ctx.statement() != null) {
            for (var statement : ctx.statement()) {
                StatementNode stm = (StatementNode) visit(statement);
                statements.add(stm);
            }
        }
        symbolTable.addSymbol(new SymbolEntry(name, SymbolType.FUNCTION, null, symbolTable.getCurrentScope(),sourceFile));

        SelectedProductNode node = new SelectedProductNode(name, parameters, statements);
        node.setVoid(isVoid);

        return node;
    }

    @Override
    public Node visitPROPERTY_DECLARATION_STATEMENT(AngularParser.PROPERTY_DECLARATION_STATEMENTContext ctx) {
        return visit(ctx.propertyDeclaration());
    }

    @Override
    public Node visitPROPIRTYLABEL(AngularParser.PROPIRTYLABELContext ctx) {
        return visit(ctx.regularProperty());
    }


    @Override
    public Node visitVARIBALLABEL(AngularParser.VARIBALLABELContext ctx) {
        String keyword = ctx.letDeclaration().typeVarible().getText();
        String name = ctx.letDeclaration().IDENTIFIER().getText();
        String type = ctx.letDeclaration().value() != null ? ctx.letDeclaration().value().getText() : "any";
        ExpressionNode value = (ExpressionNode) visit(ctx.letDeclaration().expression());

        symbolTable.addSymbol(new SymbolEntry(name, SymbolType.VARIABLE, type, symbolTable.getCurrentScope(),sourceFile));
        return new LetDeclarationNode(keyword, name, type, value);
    }

    @Override
    public Node visitDDD(AngularParser.DDDContext ctx) {
        String name = ctx.emptyArrayDeclaration().IDENTIFIER().getText();
        String type = "any[]"; // أو استخرج من النوع إذا موجود

        symbolTable.addSymbol(new SymbolEntry(name, SymbolType.VARIABLE, type, symbolTable.getCurrentScope(),sourceFile));
        return new EmptyArrayDeclarationNode(name, type);
    }

    @Override
    public Node visitOBSERVABLE_PROPERTY(AngularParser.OBSERVABLE_PROPERTYContext ctx) {
        String name = ctx.observablePropertyDeclaration().IDENTIFIER().getText();
        List<String> methodChain = new ArrayList<>();

        for (var methodCtx : ctx.observablePropertyDeclaration().observableExpression().observableMethod()) {
            methodChain.add(methodCtx.getText());
        }

        symbolTable.addSymbol(new SymbolEntry(name, SymbolType.VARIABLE, "Observable", symbolTable.getCurrentScope(),sourceFile));
        return new ObservablePropertyNode(name, methodChain);
    }
//
    @Override
    public Node visitBEHAVIOR_SUBJECT_PROPERTY(AngularParser.BEHAVIOR_SUBJECT_PROPERTYContext ctx) {
        boolean isPrivate = ctx.behaviorSubjectDeclaration().PRIVATE() != null;
        String name = ctx.behaviorSubjectDeclaration().IDENTIFIER().getText();
        String genericType = ctx.behaviorSubjectDeclaration().typeSpec().getText();

        ExpressionNode initialValue = (ExpressionNode) visit(ctx.behaviorSubjectDeclaration().initialValue());

        symbolTable.addSymbol(new SymbolEntry(name, SymbolType.VARIABLE, "BehaviorSubject<" + genericType + ">", symbolTable.getCurrentScope(),sourceFile));
        return new BehaviorSubjectPropertyNode(isPrivate, name, genericType, initialValue);
    }

    @Override
    public Node visitRegularProperty(AngularParser.RegularPropertyContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        String type = ctx.value().getText();

        ExpressionNode initializer = ctx.expression() != null ? (ExpressionNode) visit(ctx.expression()) : null;

        symbolTable.addSymbol(new SymbolEntry(name, SymbolType.VARIABLE, type, symbolTable.getCurrentScope(),sourceFile));
        return new RegularPropertyNode(name, type, initializer);
    }

    @Override
    public Node visitLetDeclaration(AngularParser.LetDeclarationContext ctx) {
        String keyword = ctx.typeVarible().getText();
        String name = ctx.IDENTIFIER().getText();
        String type = ctx.value() != null ? ctx.value().getText() : "any";

        ExpressionNode value = (ExpressionNode) visit(ctx.expression());

        symbolTable.addSymbol(new SymbolEntry(name, SymbolType.VARIABLE, type, symbolTable.getCurrentScope(),sourceFile));
        return new LetDeclarationNode(keyword, name, type, value);
    }

    @Override
    public Node visitEmptyArrayDeclaration(AngularParser.EmptyArrayDeclarationContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        String type = ctx.value().getText();

        return new EmptyArrayNode(name, type);
    }



    @Override
    public Node visitObservablePropertyDeclaration(AngularParser.ObservablePropertyDeclarationContext ctx) {
        String name = ctx.IDENTIFIER().getText();

        List<String> methodChain = new ArrayList<>();
        AngularParser.ObservableExpressionContext obsExpr = ctx.observableExpression();

        // ex: this.userService.getUsers().asObservable()
        String base = obsExpr.IDENTIFIER().getText(); // الجزء بعد `this.`

        methodChain.add(base); // أول جزء من السلسلة
        for (var methodCtx : obsExpr.observableMethod()) {
            methodChain.add(methodCtx.getText());
        }

        symbolTable.addSymbol(new SymbolEntry(name, SymbolType.VARIABLE, "Observable", symbolTable.getCurrentScope(),sourceFile));
        return new ObservablePropertyNode(name, methodChain);
    }

    @Override
    public Node visitObservableExpression(AngularParser.ObservableExpressionContext ctx) {
        String base = ctx.IDENTIFIER().getText(); // اسم المتغير بعد this.
        List<String> methodChain = new ArrayList<>();

        for (var method : ctx.observableMethod()) {
            methodChain.add(method.getText()); // مثل getProducts() أو asObservable()
        }

        return new ObservableExpressionNode(base, methodChain);
    }
////
    @Override
    public Node visitObservableMethod(AngularParser.ObservableMethodContext ctx) {
        String methodName = ctx.IDENTIFIER() != null ? ctx.IDENTIFIER().getText() : "asObservable";
        List<ExpressionNode> args = new ArrayList<>();

        if (ctx.argumentList() != null) {
            for (var arg : ctx.argumentList().expression()) {
                args.add((ExpressionNode) visit(arg));
            }
        }

        return new ObservableMethodNode(methodName, args);
    }

    @Override
    public Node visitBehaviorSubjectDeclaration(AngularParser.BehaviorSubjectDeclarationContext ctx) {
        boolean isPrivate = ctx.PRIVATE() != null;
        String name = ctx.IDENTIFIER().getText();
        String type = ctx.typeSpec().getText();

        ExpressionNode initValue = (ExpressionNode) visit(ctx.initialValue());

        symbolTable.addSymbol(new SymbolEntry(name, SymbolType.VARIABLE, "BehaviorSubject<" + type + ">", symbolTable.getCurrentScope(),sourceFile));
        return new BehaviorSubjectPropertyNode(isPrivate, name, type, initValue);
    }

    @Override
    public Node visitTYPEANYLABELSE(AngularParser.TYPEANYLABELSEContext ctx) {
        boolean isArray = ctx.typeany().OPEN_SQUARE() != null && ctx.typeany().CLOSE_SQUARE() != null;
        String typeName = ctx.typeany().ANY() != null ? ctx.typeany().ANY().getText() : "any";
        return new TypeSpecNode(typeName, isArray);
    }

    @Override
    public Node visitTYPEIDENTFIRE(AngularParser.TYPEIDENTFIREContext ctx) {
        boolean isArray = ctx.typeidintfir().OPEN_SQUARE() != null && ctx.typeidintfir().CLOSE_SQUARE() != null;
        String typeName = ctx.typeidintfir().IDENTIFIER() != null
                ? ctx.typeidintfir().IDENTIFIER().getText()
                : "any";

        return new TypeSpecNode(typeName, isArray);
    }

    @Override
    public Node visitTypeany(AngularParser.TypeanyContext ctx) {
        String typeName=ctx.ANY().getText();
        boolean isArray = false;

        if (ctx.ANY() != null) {
            typeName = "any";
        }
        if (ctx.OPEN_SQUARE() != null && ctx.CLOSE_SQUARE() != null) {
            isArray = true;
        }

        return new TypeSpecNode(typeName, isArray);
    }

    @Override
    public Node visitTypeidintfir(AngularParser.TypeidintfirContext ctx) {
        String typeName=ctx.IDENTIFIER().getText();
        boolean isArray = false;

        if (ctx.IDENTIFIER() != null) {
            typeName = "any";
        }
        if (ctx.OPEN_SQUARE() != null && ctx.CLOSE_SQUARE() != null) {
            isArray = true;
        }

        return new TypeSpecNode(typeName, isArray);
    }

    @Override
    public Node visitInitialValue(AngularParser.InitialValueContext ctx) {
        if (ctx.functionCall() != null) {
            return (Node) visit(ctx.functionCall());
        } else if (ctx.expression() != null) {
            return (Node) visit(ctx.expression());
        }
        return null;
    }

    @Override
    public Node visitServiceAssignment(AngularParser.ServiceAssignmentContext ctx) {
        String variableName = ctx.IDENTIFIER().getText(); // المتغير في this.
        String serviceName = ctx.IDENTIFIER().getText(); // اسم الخدمة

        return new ServiceAssignmentNode(variableName, serviceName);
    }

    @Override
    public Node visitHtmlElement(AngularParser.HtmlElementContext ctx) {
        if (ctx.htmlElementassist().size() == 1) {
            return visit(ctx.htmlElementassist(0)); // فقط عنصر واحد، زُره
        } else {
            HtmlContentNode contentNode = new HtmlContentNode();
            for (var assist : ctx.htmlElementassist()) {
                Node child = visit(assist);
                if (child != null) contentNode.addChild(child);
            }
            return contentNode;
        }
    }



    @Override
    public Node visitStandardHtmlElement(AngularParser.StandardHtmlElementContext ctx) {
        // الحصول على اسم التاغ المفتوح
        String openTag = ctx.fixedTagName() != null
                ? ctx.fixedTagName().getText()
                : ctx.IDENTIFIER().getText();

        // الحصول على اسم التاغ المغلق
        String closeTag = ctx.closetag().IDENTIFIER().getText();

        // تحقق من تطابق التاغ المفتوح والمغلق
       if (!openTag.equals(closeTag)) {
            errorHandler.reportSemanticError(
                    "Mismatched HTML tags: <" + openTag + "> closed with </" + closeTag + ">",
                    ctx.start
            );
        }

        // تحقق من أن التاغ مسموح
        if (!html.isTagAllowed(openTag)) {
            errorHandler.reportSemanticError(
                    "Tag <" + openTag + "> is not recognized as a valid HTML tag.",
                    ctx.start
            );
        }

        // إنشاء العقدة
        StandardHtmlElementNode node = new StandardHtmlElementNode(openTag);

        // السمات
        for (var attrCtx : ctx.htmlAttribute()) {
            HtmlAttributeNode attr = (HtmlAttributeNode) visit(attrCtx);
            node.addAttribute(attr);
        }

        // المحتوى الداخلي
        for (var contentCtx : ctx.htmlContent()) {
            Node child = visit(contentCtx);
            node.addChild(child);
        }

        // إدخال التاغ في جدول الرموز
        symbolTable.addSymbol(new SymbolEntry(openTag, SymbolType.TAG, closeTag, symbolTable.getCurrentScope(),sourceFile));

        return node;
    }

    @Override
    public Node visitSelfClosingHtmlElement(AngularParser.SelfClosingHtmlElementContext ctx) {
////        // الحصول على اسم التاغ المفتوح
        String tagName = ctx.fixedTagName() != null
                ? ctx.fixedTagName().getText()
               : ctx.IDENTIFIER().getText();

////        // إنشاء العقدة
        SelfClosingHtmlElementNode node = new SelfClosingHtmlElementNode(tagName);
////
////        // السمات
       for (var attr : ctx.htmlAttribute()) {
           HtmlAttributeNode attributeNode = (HtmlAttributeNode) visit(attr);
           node.addAttribute(attributeNode);
        }

////        // إدخال التاغ في جدول الرموز
       symbolTable.addSymbol(new SymbolEntry(tagName, SymbolType.TAG, "/>", symbolTable.getCurrentScope(),sourceFile));

      return node;
   }


    @Override
    public Node visitFixedHtmlElement(AngularParser.FixedHtmlElementContext ctx) {
        String tagName = ctx.fixedtqg().fixedTagName().getText();
       String close =ctx.closefixedtag().getText();
        FixedHtmlElementNode node = new FixedHtmlElementNode(tagName);
       for (var attr : ctx.htmlContent()) {
           HtmlAttributeNode attributeNode = (HtmlAttributeNode) visit(attr);
          node.addAttribute(attributeNode);
        }

        SymbolEntry entry = new SymbolEntry(tagName, SymbolType.TAG, close, symbolTable.getCurrentScope(),sourceFile);
        symbolTable.addSymbol(entry);
        for (var content : ctx.htmlContent()) {
        }

        return node;   }
////
////


    @Override
    public Node visitSTANDERHTMLELEMNT(AngularParser.STANDERHTMLELEMNTContext ctx) {
        String tagName = ctx.standardHtmlElement().fixedTagName() != null ?
                ctx.standardHtmlElement().fixedTagName().getText() :
                ctx.standardHtmlElement().IDENTIFIER().getText();

        StandardHtmlElementNode node = new StandardHtmlElementNode(tagName);

        // معالجة السمات
        for (var attrCtx : ctx.standardHtmlElement().htmlAttribute()) {
            Node attrNode = visit(attrCtx);
            if (attrNode instanceof HtmlAttributeNode) {
                node.addAttribute((HtmlAttributeNode) attrNode);
            }
        }

        // معالجة المحتوى
        for (var contentCtx : ctx.standardHtmlElement().htmlContent()) {
            Node child = visit(contentCtx);
            if (child != null) {
                node.addChild(child);
            }
        }

        // التحقق من تطابق الوسم المغلق
        String closeTag = ctx.standardHtmlElement().closetag().IDENTIFIER().getText();


        return node;
    }


    @Override
    public Node visitSELFCLOSEHTMLELEMNT(AngularParser.SELFCLOSEHTMLELEMNTContext ctx) {
        String tagName = ctx.selfClosingHtmlElement().fixedTagName() != null ?
                ctx.selfClosingHtmlElement().fixedTagName().getText() :
                ctx.selfClosingHtmlElement().IDENTIFIER().getText();

        SelfClosingHtmlElementNode node = new SelfClosingHtmlElementNode(tagName);

        for (var attrCtx : ctx.selfClosingHtmlElement().htmlAttribute()) {
            Node attrNode = visit(attrCtx);
            if (attrNode instanceof HtmlAttributeNode) {
                node.addAttribute((HtmlAttributeNode) attrNode);
            }
        }

        return node;
    }

    @Override
    public Node visitFIXEDHTMLELEMNT(AngularParser.FIXEDHTMLELEMNTContext ctx) {
        String tagName = ctx.fixedHtmlElement().fixedtqg().fixedTagName().getText();
        FixedHtmlElementNode node = new FixedHtmlElementNode(tagName);

        // معالجة المحتوى
        for (var contentCtx : ctx.fixedHtmlElement().htmlContent()) {
            Node contentNode = visit(contentCtx);
            if (contentNode != null) {
                node.addChild(contentNode);
            }
        }

        return node;
    }

    @Override
    public Node visitANGULARBUTTONLABEL(AngularParser.ANGULARBUTTONLABELContext ctx) {
        return super.visitANGULARBUTTONLABEL(ctx);
    }

    @Override
    public Node visitFORMELEMENTLABEL(AngularParser.FORMELEMENTLABELContext ctx) {
        FormElementNode formNode = new FormElementNode();

        // معالجة السمات
        for (var attrCtx : ctx.formElement().htmlAttribute()) {
            HtmlAttributeNode attr = (HtmlAttributeNode) visit(attrCtx);
            formNode.addAttribute(attr);
        }

        // معالجة عناصر التحكم والمحتوى
        for (var childCtx : ctx.formElement().children) {
            if (childCtx instanceof AngularParser.FormControlElementContext controlCtx) {
                FormControlElementNode controlNode = (FormControlElementNode) visit(controlCtx);
                formNode.addFormControl(controlNode);
            } else if (childCtx instanceof AngularParser.HtmlContentContext contentCtx) {
                Node contentNode = visit(contentCtx);
                formNode.addChild(contentNode);
            }
        }

        return formNode;
    }

    @Override
    public Node visitFormElement(AngularParser.FormElementContext ctx) {
        FormElementNode formNode = new FormElementNode();

        for (var attrCtx : ctx.htmlAttribute()) {
            HtmlAttributeNode attr = (HtmlAttributeNode) visit(attrCtx);
            formNode.addAttribute(attr);
        }

        for (var child : ctx.htmlContent()) {
            Node childNode = visit(child);
            if (childNode != null) formNode.addChild(childNode);
        }
        for (var control : ctx.formControlElement()) {
            Node controlNode = visit(control);
            if (controlNode != null) formNode.addChild(controlNode);
        }

        return formNode;
    }

    @Override
    public Node visitFormControlElement(AngularParser.FormControlElementContext ctx) {
        String tagName = ctx.Input() != null ? "input" : "textarea";
        FormControlElementNode node = new FormControlElementNode(tagName);

        for (var attrCtx : ctx.htmlAttribute()) {
            HtmlAttributeNode attr = (HtmlAttributeNode) visit(attrCtx);
            node.addAttribute(attr);
        }

        return node;
    }


    @Override
    public Node visitTagH1(AngularParser.TagH1Context ctx) {
        ConcreteHtmlElementNode node = new ConcreteHtmlElementNode("h1");
        node.addAttributesAndChildren(ctx, this);
        return node;
    }

    @Override
    public Node visitTagH2(AngularParser.TagH2Context ctx) {
        ConcreteHtmlElementNode node = new ConcreteHtmlElementNode("h2");
        node.addAttributesAndChildren(ctx, this);
        return node;
    }

    @Override
    public Node visitTagP(AngularParser.TagPContext ctx) {
        ConcreteHtmlElementNode node = new ConcreteHtmlElementNode("p");
        node.addAttributesAndChildren(ctx, this);
        return node;
    }

    @Override
    public Node visitTagDiv(AngularParser.TagDivContext ctx) {
        ConcreteHtmlElementNode node = new ConcreteHtmlElementNode("div");
        node.addAttributesAndChildren(ctx, this);
        return node;
    }

    @Override
    public Node visitTagUl(AngularParser.TagUlContext ctx) {
        ConcreteHtmlElementNode node = new ConcreteHtmlElementNode("ul");
        node.addAttributesAndChildren(ctx, this);
        return node;
    }

    @Override
    public Node visitTagLi(AngularParser.TagLiContext ctx) {
        ConcreteHtmlElementNode node = new ConcreteHtmlElementNode("li");
        node.addAttributesAndChildren(ctx, this);
        return node;
    }

    @Override
    public Node visitTagSpan(AngularParser.TagSpanContext ctx) {
        ConcreteHtmlElementNode node = new ConcreteHtmlElementNode("span");
        node.addAttributesAndChildren(ctx, this);
        return node;
    }

    @Override
    public Node visitTagImg(AngularParser.TagImgContext ctx) {
        ConcreteHtmlElementNode node = new ConcreteHtmlElementNode("img");
        node.addAttributesAndChildren(ctx, this);
        return node;
    }

    @Override
    public Node visitFORMLABEL(AngularParser.FORMLABELContext ctx) {
        ConcreteHtmlElementNode node = new ConcreteHtmlElementNode("form");
        node.addAttributesAndChildren(ctx, this);
        return node;
    }

    @Override
    public Node visitINPUTLABEL(AngularParser.INPUTLABELContext ctx) {
        ConcreteHtmlElementNode node = new ConcreteHtmlElementNode("input");
        node.addAttributesAndChildren(ctx, this);
        return node;
    }

    @Override
    public Node visitTEXTAREALABEL(AngularParser.TEXTAREALABELContext ctx) {
        ConcreteHtmlElementNode node = new ConcreteHtmlElementNode("textarea");
        node.addAttributesAndChildren(ctx, this);
        return node;
    }

    @Override
    public Node visitPropertyBinding(AngularParser.PropertyBindingContext ctx) {
        String propertyName = ctx.bindingIdentifier().getText();

        String expressionValue = null;
        if (ctx.expression() != null) {
            expressionValue = ctx.expression().getText();
        }

        return new PropertyBindingAttributeNode(propertyName, expressionValue);
    }

    @Override
    public Node visitIdentifierChainBinding(AngularParser.IdentifierChainBindingContext ctx) {
        List<String> identifiers = new ArrayList<>();
        for (var id : ctx.IDENTIFIER()) {
            identifiers.add(id.getText());
        }
        return new ComplexBindingIdentifierNode(identifiers);
    }

    @Override
    public Node visitFormGroupAttributeBinding(AngularParser.FormGroupAttributeBindingContext ctx) {
        String formGroupAttr = ctx.FORMGROUPATTR().getText();
        return new FormGroupAttrNode(formGroupAttr);
    }

    @Override
    public Node visitFormControlNameBinding(AngularParser.FormControlNameBindingContext ctx) {
        String formControlName = ctx.FORMCONTROLNAME().getText();
        return new FormControlNameNode(formControlName);
    }

    @Override
    public Node visitErrorNode(AngularParser.ErrorNodeContext ctx) {
        return super.visitErrorNode(ctx);
    }

    @Override
    public Node visitBindingSyntax(AngularParser.BindingSyntaxContext ctx) {
        return super.visitBindingSyntax(ctx);
    }

    @Override
    public Node visitFf(AngularParser.FfContext ctx) {
        return super.visitFf(ctx);
    }

    @Override
    public Node visitBUTTONLABEL(AngularParser.BUTTONLABELContext ctx) {
        ConcreteHtmlElementNode node = new ConcreteHtmlElementNode("button");
        node.addAttributesAndChildren(ctx, this);
        return node;
    }

    @Override
    public Node visitALABEL(AngularParser.ALABELContext ctx) {
        ConcreteHtmlElementNode node = new ConcreteHtmlElementNode("a");
        node.addAttributesAndChildren(ctx, this);
        return node;
    }

    @Override
    public Node visitFORMCONTROL_ATTRIBUTE(AngularParser.FORMCONTROL_ATTRIBUTEContext ctx) {
        String attrName = ctx.FORMCONTROLNAME().getText();
        String attrValue = stripQuotes(ctx.STRING().getText());
        return new BasicHtmlAttributeNode(attrName, attrValue);
    }


    @Override
    public Node visitFORMGROUP_ATTRIBUTE(AngularParser.FORMGROUP_ATTRIBUTEContext ctx) {
        String attrName = ctx.FORMGROUPATTR().getText();
        String attrValue;
        if (ctx.expression() != null) {
            Node exprNode = visit(ctx.expression());
            attrValue = exprNode.toString();  // أو طريقة أخرى لتحويل التعبير لقيمة نصية
        } else if (ctx.bindingSyntax() != null) {
            Node bindingNode = visit(ctx.bindingSyntax());
            attrValue = bindingNode.toString();
        } else {
            attrValue = "";
        }
        return new BasicHtmlAttributeNode(attrName, attrValue);
    }

    @Override
    public Node visitNGSUBMIT_ATTRIBUTE(AngularParser.NGSUBMIT_ATTRIBUTEContext ctx) {
        String attrName = ctx.NG_SUBMIT().getText();
        Node exprNode = visit(ctx.expression());

        String attrValue = (exprNode != null) ? exprNode.toString() : "";

        return new BasicHtmlAttributeNode(attrName, attrValue);
    }

    @Override
    public Node visitPROPERTYBINDING_ATTRIBUTE(AngularParser.PROPERTYBINDING_ATTRIBUTEContext ctx) {
        String name = ctx.propertyBinding().bindingIdentifier().getText();
        String expression = ctx.propertyBinding().expression() != null ?
                ctx.propertyBinding().expression().getText() :
                "";
        return new PropertyBindingAttributeNode(name, expression);
    }

    @Override
    public Node visitEVENTBINDING_ATTRIBUTE(AngularParser.EVENTBINDING_ATTRIBUTEContext ctx) {
        String eventName = ctx.eventBinding().IDENTIFIER().getText();
        String handler = ctx.eventBinding().expression().getText();
        return new EventBindingAttributeNode(eventName, handler);
    }

    @Override
    public Node visitNGIF_ATTRIBUTE(AngularParser.NGIF_ATTRIBUTEContext ctx) {
        return visit(ctx.ngIf());
    }

    @Override
    public Node visitNGFOR_ATTRIBUTE(AngularParser.NGFOR_ATTRIBUTEContext ctx) {
        return visit(ctx.ngfor());
    }

    @Override
    public Node visitBINDING_SYNTAX(AngularParser.BINDING_SYNTAXContext ctx) {
        return visit(ctx.bindingSyntax());
    }

    @Override
    public Node visitRAW_INPUT_ELEMENT(AngularParser.RAW_INPUT_ELEMENTContext ctx) {
        String rawText = ctx.getText();
        return new BasicHtmlAttributeNode("raw", rawText);
    }

    @Override
   public Node visitAngularButton(AngularParser.AngularButtonContext ctx) {
      String identifier = ctx.BUTTON(0).getText();
       String expression = ctx.htmlAttribute(0).getText();
       String buttonText = ctx.htmlContent(0).getText();
       SymbolEntry entry = new SymbolEntry(identifier, SymbolType.TAG, buttonText, symbolTable.getCurrentScope(),sourceFile);
        symbolTable.addSymbol(entry);

       return new AngularButtonNode(identifier, expression, buttonText);
    }


    @Override
    public Node visitHtmlContent(AngularParser.HtmlContentContext ctx) {
        HtmlContentNode contentNode = new HtmlContentNode();

        for (var child : ctx.children) {
            if (child instanceof AngularParser.HtmlElementContext) {
                Node element = visit(child);
                if (element != null) contentNode.addChild(element);
            }
            else if (child instanceof AngularParser.TextNodeContext) {
                TextNode textNode = (TextNode) visit(child);
                if (textNode != null) contentNode.addChild(textNode);
            }
            else if (child instanceof AngularParser.InterpContext) {
                InterpolationNode interpNode = (InterpolationNode) visit(child);
                if (interpNode != null) contentNode.addChild(interpNode);
            }
        }

        return contentNode;
    }


    @Override
    public Node visitCLASS_ATTRIBUTE(AngularParser.CLASS_ATTRIBUTEContext ctx) {
        String value = stripQuotes(ctx.STRING().getText()); // لو عندك دالة لإزالة علامات التنصيص
        return new ClassAttributeNode(value);
    }


    @Override
    public Node visitTextNode(AngularParser.TextNodeContext ctx) {
        String text = ctx.getText().trim();
        if (!text.isEmpty()) {
            return new TextNode(text);
        }
        return null;
    }


    @Override
    public Node visitEventBinding(AngularParser.EventBindingContext ctx) {
        String eventName = ctx.IDENTIFIER().getText();  // "click" مثلاً
        String expression = ctx.expression().getText(); // "doSomething()"

        return new EventBindingAttributeNode(eventName, expression);
    }

    @Override
    public Node visitIdentifierChain(AngularParser.IdentifierChainContext ctx) {
        List<String> identifiers = new ArrayList<>();
        for (var idCtx : ctx.IDENTIFIER()) {
            identifiers.add(idCtx.getText());
        }
        return new IdentifierChainNode(identifiers);
    }

    @Override
    public Node visitInterp(AngularParser.InterpContext ctx) {
        List<String> identifiers = new ArrayList<>();
         String idtext=ctx.identifierChain().getText();
        for (var id : ctx.identifierChain().IDENTIFIER()) {
            identifiers.add(id.getText());
        }
        SymbolEntry entry = new SymbolEntry(
                idtext,
                SymbolType.VARIABLE,
                null,
                symbolTable.getCurrentScope(),sourceFile
        );
        symbolTable.addSymbol(entry);

        return new InterpolationNode(identifiers);
    }

//    @Override
//    public Node visitNgfor(AngularParser.NgforContext ctx) {
//        String itemVar = ctx.NG().getText();
//        Node expressionNode = visit(ctx.expression());
//
//        symbolTable.enterScope("ngFor");  // ادخل نطاق جديد
//        symbolTable.addSymbol(new SymbolEntry(
//                itemVar,
//                SymbolType.VARIABLE,
//                null,
//                symbolTable.getCurrentScope(),
//                sourceFile
//        ));
//
//        return new NgForNode(itemVar, expressionNode);
//    }
//
//    @Override
//    public Node visitNgIf(AngularParser.NgIfContext ctx) {
//        Node condition = visit(ctx.expression());
//
//        SymbolEntry entry = new SymbolEntry(
//                "NgIfCondition",
//                SymbolType.VARIABLE,
//                condition.toString(),
//                symbolTable.getCurrentScope(),
//                sourceFile
//        );
//        symbolTable.addSymbol(entry);
//
//        return new NgIfNode(condition, null);
//    }
//

    @Override
    public Node visitClosefixedtag(AngularParser.ClosefixedtagContext ctx) {
        String tagName = ctx.fixedTagName().getText();
        return new CloseFixedTagNode(tagName);    }

    @Override
    public Node visitFixedtqg(AngularParser.FixedtqgContext ctx) {
        String tagName = ctx.fixedTagName().getText();
        return new FixedTagNode(tagName);
    }

    @Override
    public Node visitClosetag(AngularParser.ClosetagContext ctx) {
        String tagName = ctx.IDENTIFIER().getText();
        return new CloseTagNode(tagName);
    }

    @Override
    public Node visitOpentag(AngularParser.OpentagContext ctx) {
        String tagName = ctx.IDENTIFIER().getText();
        return new OpenTagNode(tagName);
    }

    @Override
    public Node visitStylesheet(AngularParser.StylesheetContext ctx) {
        List<Node> rules = new ArrayList<>();
        for (var rule : ctx.ruleSet()) {
            rules.add(visit(rule));
        }
        return new CssStylesheetNode(rules);
    }

    @Override
    public Node visitRuleSet(AngularParser.RuleSetContext ctx) {
        CssNode selector = (CssNode) visit(ctx.selector1());
        List<DeclarationNode> declarations = new ArrayList<>();
        for (var declCtx : ctx.declaration()) {
            declarations.add((DeclarationNode) visit(declCtx));
        }
        return new RuleSetNode(selector, declarations);
    }


    @Override
    public Node visitCssFunctionValueLabel(AngularParser.CssFunctionValueLabelContext ctx) {
        return visit(ctx.cssFunction());
    }

    @Override
    public Node visitStringValueLabel(AngularParser.StringValueLabelContext ctx) {
        String str = ctx.STRING().getText().replaceAll("^\"|\"$", ""); // إزالة علامات الاقتباس
        return new StringValueNode(str);
    }

    /*@Override
    public Node visitIdentifierValueLabel(AngularParser.IdentifierValueLabelContext ctx) {
        String text = ctx.IDENTIFIER().getText();
        return new IdentifierValueNode(text);
    }*/

    @Override
    public Node visitColorValueLabel(AngularParser.ColorValueLabelContext ctx) {
        String color = ctx.COLOR().getText();
        return new ColorValueNode(color);
    }

    @Override
    public Node visitNumberValueLabel(AngularParser.NumberValueLabelContext ctx) {
        String number = ctx.NUMBER().getText();
        String unit = ctx.UNIT() != null ? ctx.UNIT().getText() : null;
        return new NumberValueNode(number, unit);
    }

    @Override
    public Node visitPseudoClassSelectorLabel(AngularParser.PseudoClassSelectorLabelContext ctx) {
        return visit(ctx.pseudoClassSelector());
    }

    @Override
    public Node visitIdSelectorLabel(AngularParser.IdSelectorLabelContext ctx) {
        return visit(ctx.idSelector());
    }

    @Override
    public Node visitClassSelectorLabel(AngularParser.ClassSelectorLabelContext ctx) {
        return visit(ctx.classSelector());
    }

    @Override
    public Node visitClassSelector(AngularParser.ClassSelectorContext ctx) {
        return new ClassSelectorNode(ctx.DOT().getText());    }

    @Override
    public Node visitIdSelector(AngularParser.IdSelectorContext ctx) {
        return new IdSelectorNode(ctx.IDENTIFIER().getText());
    }

    @Override
    public Node visitPseudoClassSelector(AngularParser.PseudoClassSelectorContext ctx) {
        ClassSelectorNode base = (ClassSelectorNode) visit(ctx.classSelector());
        return new PseudoClassSelectorNode(base, ctx.IDENTIFIER().getText());
    }

    @Override
    public Node visitDeclaration(AngularParser.DeclarationContext ctx) {
        String property = ctx.property().getText();
        ValueNode value = (ValueNode) visit(ctx.value1());
        return new DeclarationNode(property, value);
    }

    @Override
    public Node visitProperty(AngularParser.PropertyContext ctx) {
        StringBuilder propertyName = new StringBuilder();

        List<TerminalNode> identifiers = ctx.IDENTIFIER();
        for (int i = 0; i < identifiers.size(); i++) {
            propertyName.append(identifiers.get(i).getText());
            if (i < identifiers.size() - 1) {
                propertyName.append("-");
            }
        }

        return new PropertyNode(propertyName.toString());
    }



    @Override
    public Node visitCssFunction(AngularParser.CssFunctionContext ctx) {
        String functionName = ctx.IDENTIFIER().getText();
        ValueNode argument = (ValueNode) visit(ctx.value1());
        return new CssFunctionValueNode(functionName, argument);
    }

//}
}