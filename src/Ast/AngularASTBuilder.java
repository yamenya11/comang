package Ast;

import Ast.application.*;
import Ast.calls.*;
import Ast.components.ComponentNode;
import Ast.declarations.ClassDeclarationNode;

import Ast.expressions.ExpressionNode;
import Ast.function.FUNDECLRATIONNODE;
import Ast.function.FunctionBodyNode;
import Ast.html.*;
import Ast.html.attrbute.*;
import Ast.metadata.*;
import Ast.metadata.TemplateUrlNode;
import Ast.methods.ConstructorNode;
import Ast.methods.ParameterNode;
import Ast.property.EmptyArrayNode;
import Ast.property.RegularPropertyNode;
import SymbolTable.*;
import antlr.gen.AngularParser;
import Ast.statements.*;
import antlr.gen.*;
import seminticerror.*;

import java.util.*;
//import org.antlr.runtime.tree.ParseTree;

public class AngularASTBuilder extends AngularParserBaseVisitor<Node> {
    private final SymbolTable symbolTable;
    private final Import importChecker;
    private final HtmlSymbolTable html;

    public AngularASTBuilder(SymbolTable symbolTable, SelectorSymbolTable selectorSymbolTable, ClassSymbolTable classSymbolTable, ErrorHandler errorHandler, Import importChecker,HtmlSymbolTable html) {
        html.addSymbol(new SymbolEntry("h1", SymbolType.TAG, "h1", "global"));
        html.addSymbol(new SymbolEntry("h2", SymbolType.TAG, "h2", "global"));
        html.addSymbol(new SymbolEntry("p", SymbolType.TAG, "p", "global"));
        html.addSymbol(new SymbolEntry("div", SymbolType.TAG, "div", "global"));
        html.addSymbol(new SymbolEntry("ul", SymbolType.TAG, "ul", "global"));
        html.addSymbol(new SymbolEntry("button", SymbolType.TAG, "button", "global"));
        html.addSymbol(new SymbolEntry("li", SymbolType.TAG, "li", "global"));
        html.addSymbol(new SymbolEntry("span", SymbolType.TAG, "span", "global"));
        html.addSymbol(new SymbolEntry("img", SymbolType.TAG, "img", "global"));
        this.symbolTable = symbolTable;
        this.classSymbolTable = classSymbolTable;
        this.errorHandler = errorHandler;
        this.selectorSymbolTable =selectorSymbolTable;
        this.importChecker = importChecker;
        this.html =html;

    }
    private final SelectorSymbolTable selectorSymbolTable;
    private final ClassSymbolTable classSymbolTable ;
    private final ErrorHandler errorHandler;

    /*@Override
    public Node visitApplication(AngularParser.ApplicationContext ctx) {
        List<Node> applicationNodes = new ArrayList<>();
        for (var importCtx : ctx.importStatement()) {
            applicationNodes.add(visit(importCtx));
        }

        for (var componentCtx : ctx.component()) {
            applicationNodes.add(visit(componentCtx));
        }

        for (var classDeclCtx : ctx.classDeclaration()) {
            applicationNodes.add(visit(classDeclCtx));
        }

        for (var injectableCtx : ctx.injectable()) {
            applicationNodes.add(visit(injectableCtx));
        }

        for (var statementCtx : ctx.statement()) {
            applicationNodes.add(visit(statementCtx));
        }


        return new ApplicationNode(applicationNodes);
    }*/


    @Override
    public Node visitProgram(AngularParser.ProgramContext ctx) {
        List<Node> applicationNodes = new ArrayList<>();
      for (var app:ctx.application()){
          applicationNodes.add(visit(app));
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
        symbolTable.addSymbol(new SymbolEntry(imported, SymbolType.IMPORT, source, scope));
List<KeyImportNode>app=new ArrayList<>();
      for (var v :ctx.importStatement().keyimport()){
       app.add((KeyImportNode) visit(v));
     }
        ImportStatementNode importStatementNode = new ImportStatementNode(imported, source, imported,app);
        return importStatementNode;
    }

    @Override
    public Node visitCOMPONENTLABEL(AngularParser.COMPONENTLABELContext ctx) {
        String componentName = ctx.component().getText().toString();

        List<MetadataEntryNode> meta = new ArrayList<>();

        if (ctx.component().metadata() != null && !ctx.component().metadata().isEmpty()) {
            for (var entryCtx : ctx.component().metadata().metadataEntry()) {
                MetadataEntryNode entryNode = (MetadataEntryNode) visit(entryCtx); // visit each metadata entry
                meta.add(entryNode);
            }
        }
        return new ComponentNode(componentName, meta);
    }



    @Override
    public Node visitCLASSLABEL(AngularParser.CLASSLABELContext ctx) {
        String className = ctx.classDeclaration().IDENTIFIER().getText();
        ClassBodyNode classBodyNode = new ClassBodyNode();
        for (var child : ctx.children) {
            Node element = child.accept(this);
            if (element != null) {
                classBodyNode.addClassElement(element);
            }
        }
        if (classSymbolTable.symbolExists(className)) {
            errorHandler.reportSemanticError("Duplicate class definition: " + className, ctx.start);
            return null;
        }

        classSymbolTable.addSymbol(new SymbolEntry(className, SymbolType.CLASS, null, symbolTable.getCurrentScope()));
        return classBodyNode;
    }

    @Override
    public Node visitINJECTABLELABEL(AngularParser.INJECTABLELABELContext ctx) {
        String injectableName = ctx.injectable().getText();
        symbolTable.addSymbol(new SymbolEntry(injectableName, SymbolType.INJECTABLE, null, symbolTable.getCurrentScope()));
        return new InjectableLabelNode(injectableName) ;
    }

//  @Override
//    public Node visitImportStatement(AngularParser.ImportStatementContext ctx) {
//        String imported = ctx.IDENTIFIER().getText();
//        String source = ctx.STRING().getText();
//        String key=ctx.keyimport().get(0).getText();
//        String scope = symbolTable.getCurrentScope();
//        symbolTable.addSymbol(new SymbolEntry(imported, SymbolType.IMPORT, key,scope));
//        ImportStatementNode importStatementNode = new ImportStatementNode(imported, source,key);
//        return importStatementNode;
//    }


    @Override
    public Node visitComponent(AngularParser.ComponentContext ctx) {
        String componentName = ctx.COMPONENT().getText();

       String vv = ctx.metadata().getText();
//warning
        List<MetadataEntryNode> metadataEntries = new ArrayList<>();
        for (var entCtx : ctx.metadata().metadataEntry()) {
            metadataEntries.add((MetadataEntryNode) visit(entCtx));
        }
        symbolTable.addSymbol(new SymbolEntry(componentName, SymbolType.COMPONENT, null, symbolTable.getCurrentScope()));
        return new ComponentNode(componentName, metadataEntries);    }

    @Override
    public Node visitMetadata(AngularParser.MetadataContext ctx) {
        List<MetadataEntryNode> entry = new ArrayList<>();
        for (var ent : ctx.metadataEntry()) {
            entry.add((MetadataEntryNode) visit(ent));
        }
        return new MetadataNode(entry);
        }

    @Override
    public Node visitBasicMetadata(AngularParser.BasicMetadataContext ctx) {
        String key = ctx.TEMPLATE().getText();
        String value = ctx.STRING().getText().replaceAll("^\"|\"$", "");



        String scope = symbolTable.getCurrentScope();
        symbolTable.addSymbol(new SymbolEntry(key, SymbolType.METADATA, value, scope));

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
        symbolTable.addSymbol(new SymbolEntry(key, SymbolType.METADATA, "", scope));

        return new HtmlMetadataNode(key, htmlChildren);
    }




    @Override
    public Node visitClassDeclaration(AngularParser.ClassDeclarationContext ctx) {
        String className = ctx.IDENTIFIER().getText();

        String superClass = null;
        if (ctx.classInheritance() != null) {
            if (ctx.classInheritance().IDENTIFIER() != null && !ctx.classInheritance().IDENTIFIER().isEmpty()) {
                superClass = ctx.classInheritance().IDENTIFIER(0).getText();
            }
        }

        List<Node> classBodyElements = new ArrayList<>();
        if (ctx.classBody() != null) {
            for (var memberCtx : ctx.classBody().children) {
                Node node = (Node) visit(memberCtx);
                if (node != null) {
                    classBodyElements.add(node);
                }
            }
        }
        String currentScope = symbolTable.getCurrentScope();
        symbolTable.addSymbol(new SymbolEntry(className, SymbolType.CLASS, null, currentScope));

        return new ClassDeclarationNode(className, superClass, classBodyElements);
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

        SymbolEntry entry = new SymbolEntry(key, SymbolType.METADATA, value, scope);
        selectorSymbolTable.addSymbol(entry);
        symbolTable.addSymbol(entry);

        return new SelectorNode(key, value);
    }

    @Override
    public Node visitTemplateurl(AngularParser.TemplateurlContext ctx) {
        String key = ctx.TEMPLATEURL().getText();
        String value = ctx.STRING().getText().replaceAll("^\"|\"$", "");
        String scope = symbolTable.getCurrentScope();
        symbolTable.addSymbol(new SymbolEntry(key, SymbolType.METADATA, value, scope));
        return new TemplateUrlNode(key, value);
    }

// @Override
//    public Node visitClassBodyLabel(AngularParser.ClassBodyLabelContext ctx) {
//        List<Node> classElements = new ArrayList<>();
//        ClassBodyNode clss = new ClassBodyNode();
//        for (var property : ctx.propertyDeclaration()) {
//            classElements.add(visit(property));
//        }
//        for (var method : ctx.methodDeclaration()) {
//            classElements.add(visit(method));
//        }
//        for (var constructor : ctx.constructor()) {
//            classElements.add(visit(constructor));
//        }
//        for (var statement : ctx.statement()) {
//            classElements.add(visit(statement));
//        }
//        for (var decorator : ctx.decorator()) {
//            classElements.add(visit(decorator));
//        }
//        for (var ngOnInit : ctx.ngOnInit()) {
//            classElements.add(visit(ngOnInit));
//        }
//        for (var selectProduct : ctx.selectProduct()) {
//            classElements.add(visit(selectProduct));
//        }
//        for (var onbutton : ctx.onbutton()) {
//            classElements.add(visit(onbutton));
//        }
//
//
//        for (var product : ctx.products()) {
//            classElements.add(visit(product));
//        }
//        for (var lambda : ctx.lambdaExpression()) {
//            classElements.add(visit(lambda));
//        }
//        clss.setClassElements(classElements);
//        return clss;
//    }



    @Override
    public Node visitProducts(AngularParser.ProductsContext ctx) {
        String id=ctx.IDENTIFIER().getText();
        ElementListNode elements = (ElementListNode) visit(ctx.elementList());
        symbolTable.addSymbol(new SymbolEntry(id, SymbolType.FUNCTION, null, symbolTable.getCurrentScope()));

        return new  ProductsNode(id,elements);    }

    @Override
    public Node visitInjectable(AngularParser.InjectableContext ctx) {
        return super.visitInjectable(ctx);
    }

    @Override
    public Node visitElementList(AngularParser.ElementListContext ctx) {
        List<ElementNode> elements = new ArrayList<>();

        for (AngularParser.ElementContext elementCtx : ctx.element()) {
            elements.add((ElementNode) visit(elementCtx));
        }
        return new ElementListNode(elements);    }


    @Override
    public Node visitElement(AngularParser.ElementContext ctx) {
        List<PairNode> pairs = new ArrayList<>();

        for (AngularParser.PairContext pairCtx : ctx.pair()) {
            pairs.add((PairNode) visit(pairCtx));
        }

        return new ElementNode(pairs);    }


    @Override
    public Node visitPair(AngularParser.PairContext ctx) {
        String key=ctx.basevalue().getText();
        String value=ctx.value().getText();
        symbolTable.addSymbol(new SymbolEntry(key, SymbolType.PARAMETER, value, symbolTable.getCurrentScope()));

        return new PairNode(key,value);

    }



    @Override
    public Node visitConstructor(AngularParser.ConstructorContext ctx) {
        String constructorName = ctx.CONSTRUCTOR().getText();

        List<Node> parameters = new ArrayList<>();
        if (ctx.parameter() != null) {

            for (var parameterCtx : ctx.parameter()) {

                String modifier = parameterCtx.modifiers().getText();
                String name = parameterCtx.IDENTIFIER().getText();
                String type = parameterCtx.value().getText();
                if (!importChecker.isImported(type)) {
                    errorHandler.reportSemanticError("The class or service '" + type + "' is used without importing it.", parameterCtx.start);
                }
                parameters.add(new ParameterNode(name, type, modifier));
            }    }

        List<Node> statements = new ArrayList<>();
        if (ctx.statement() != null) {

            for(var statm:ctx.statement()){
                statements.add(visit(statm));
            }

        }

        symbolTable.addSymbol(new SymbolEntry(
                constructorName,
                SymbolType.CONSTRUCTOR,
                "CONSTRUCTER",
                symbolTable.getCurrentScope()
        ));

        return new ConstructorNode(constructorName, parameters, statements);   }



    @Override
    public Node visitParameter(AngularParser.ParameterContext ctx) {
        String modifier = null;
        if (ctx.modifiers() != null) {
            modifier = ctx.modifiers().getText();
        }
        String name = ctx.IDENTIFIER().getText();
        String type = ctx.value().getText();
        ParameterNode parameterNode = new ParameterNode(name, type, modifier);
        return parameterNode;     }

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

        String returnType = ctx.value().getText();
        FunctionBodyNode body = (FunctionBodyNode) visit(ctx.functionB());

        return new FUNDECLRATIONNODE(functionName, parameters, returnType, body);    }

    @Override
    public Node visitFunctionB(AngularParser.FunctionBContext ctx) {
        return super.visitFunctionB(ctx);
    }

    @Override
    public Node visitPropertystatment(AngularParser.PropertystatmentContext ctx) {
        return super.visitPropertystatment(ctx);
    }

    @Override
    public Node visitSELECTPRODUCTLABEL(AngularParser.SELECTPRODUCTLABELContext ctx) {
        String name=ctx.SELECTPRODUCT().getText();
        List<ParameterNode> parameters = new ArrayList<>();
        for (var paramCtx : ctx.parameter()) {
            ParameterNode paramNode = (ParameterNode) visit(paramCtx);
            parameters.add(paramNode);
        }

        boolean isVoid = ctx.VOID() != null;

        List<StatementNode> statements = new ArrayList<>();
        if (ctx.statement() != null) {
            for (var statement : ctx.statement()) {
                StatementNode stm =(StatementNode) visit(statement) ;
                statements.add( stm);
            }
        }
        symbolTable.addSymbol(new SymbolEntry(name, SymbolType.FUNCTION, null, symbolTable.getCurrentScope()));

        SelectedProductNode node = new SelectedProductNode(name, parameters, statements);
        node.setVoid(isVoid);

        return node;    }



    @Override
    public Node visitPROPIRTYLABEL(AngularParser.PROPIRTYLABELContext ctx) {
        List<Node> applicationNodes = new ArrayList<>();

        for (var child : ctx.children) {
            Node node = visit(child);
            if (node != null) {
                applicationNodes.add(node);
            }
        }


        return new ApplicationNode(applicationNodes);
    }

    @Override
    public Node visitRegularProperty(AngularParser.RegularPropertyContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        String type = ctx.value().getText();

        ExpressionNode initializer = ctx.expression() != null ? (ExpressionNode) visit(ctx.expression()) : null;

        return new RegularPropertyNode(name, type, initializer);    }

    @Override
    public Node visitLetDeclaration(AngularParser.LetDeclarationContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        String type = ctx.value(0).getText();
        String value = ctx.value(1).getText();

        return new LetVariableDeclarationNode(name, type, value);    }

    @Override
    public Node visitEmptyArrayDeclaration(AngularParser.EmptyArrayDeclarationContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        String type = ctx.value().getText();

        return new EmptyArrayNode(name, type);    }




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
    public Node visitNORMALATTRIBUTE(AngularParser.NORMALATTRIBUTEContext ctx) {
        return new NormalAttributeNode(ctx.IDENTIFIER().getText(), ctx.STRING().getText().replace("\"", ""));
    }

    @Override
    public Node visitSIMPLEATTRIBUTE(AngularParser.SIMPLEATTRIBUTEContext ctx) {
        return super.visitSIMPLEATTRIBUTE(ctx);
    }

    @Override
    public Node visitNGFORATTRIBUTE(AngularParser.NGFORATTRIBUTEContext ctx) {
        return new NgForNode(ctx.ngfor().expression().getText());
    }

    @Override
    public Node visitNGIFATTRIBUTE(AngularParser.NGIFATTRIBUTEContext ctx) {
        String name=ctx.ngIf().getText();
        return new NgIfNode(name);
    }

    @Override
    public Node visitEVENTATTRIBUTE(AngularParser.EVENTATTRIBUTEContext ctx) {
        String name = ctx.eventBinding().IDENTIFIER().getText();
        String expression = ctx.eventBinding().expression().getText();
        return new EventBindingNode(name, expression);    }

    @Override
    public Node visitANGULARBUTTONATTRIBUTE(AngularParser.ANGULARBUTTONATTRIBUTEContext ctx) {
        return super.visitANGULARBUTTONATTRIBUTE(ctx);
    }

    @Override
    public Node visitPROPERTYBINDINGATTRIBUTE(AngularParser.PROPERTYBINDINGATTRIBUTEContext ctx) {
        String name = ctx.getChild(1).getText();
        String expression = ctx.getChild(4).getText();
        SymbolEntry entry = new SymbolEntry(name, SymbolType.TAG, expression, "scope");

        return new PropertyBindingNode(name, expression);
    }

    @Override
    public Node visitEVENTBINDINGATTRIBUTE(AngularParser.EVENTBINDINGATTRIBUTEContext ctx) {
        return super.visitEVENTBINDINGATTRIBUTE(ctx);
    }

    @Override
    public Node visitStandardHtmlElement(AngularParser.StandardHtmlElementContext ctx) {
        String tagName = ctx.opentag().IDENTIFIER().getText();
        StandardHtmlElementNode node = new StandardHtmlElementNode(tagName);

        String openTag = ctx.opentag().IDENTIFIER().getText();
        String closeTag = ctx.closetag().IDENTIFIER().getText();


        if (!openTag.equals(closeTag)) {
            errorHandler.reportSemanticError(
                    "Mismatched fixed HTML tags: <" + openTag + "> closed with </" + closeTag + ">",
                    ctx.start
            );

        }
        if (!html.isTagAllowed(tagName)) {
            errorHandler.reportSemanticError(
                    "Tag <" + tagName + "> is not recognized as a valid fixed HTML tag.",
                    ctx.start
            );
        }
        // صفات العنصر
        for (var attr : ctx.htmlAttribute()) {
            HtmlAttributeNode attributeNode = (HtmlAttributeNode) visit(attr);
            node.addAttribute(attributeNode);
        }

        // المحتوى الداخلي (عناصر أو نصوص أو تعبيرات)
        for (var content : ctx.htmlContent()) {
            Node contentNode = visit(content);
            node.addChild(contentNode);
        }
        SymbolEntry entry = new SymbolEntry(tagName, SymbolType.TAG, closeTag, symbolTable.getCurrentScope());
        symbolTable.addSymbol(entry);
        return node;  }

    @Override
    public Node visitSelfClosingHtmlElement(AngularParser.SelfClosingHtmlElementContext ctx) {
        String tagName = ctx.opentag().IDENTIFIER().getText();
        SelfClosingHtmlElementNode node = new SelfClosingHtmlElementNode(tagName);

        for (var attr : ctx.htmlAttribute()) {
            HtmlAttributeNode attributeNode = (HtmlAttributeNode) visit(attr);
            node.addAttribute(attributeNode);
        }   SymbolEntry entry = new SymbolEntry(tagName, SymbolType.TAG, "/>", symbolTable.getCurrentScope());
        symbolTable.addSymbol(entry);

        return node;    }

    @Override
    public Node visitFixedHtmlElement(AngularParser.FixedHtmlElementContext ctx) {
        String tagName = ctx.fixedtqg().FIXEDTAGNAME().getText();
        String close =ctx.closefixedtag().getText();
        FixedHtmlElementNode node = new FixedHtmlElementNode(tagName);
        for (var attr : ctx.htmlAttribute()) {
            HtmlAttributeNode attributeNode = (HtmlAttributeNode) visit(attr);
            node.addAttribute(attributeNode);
        }

        SymbolEntry entry = new SymbolEntry(tagName, SymbolType.TAG, close, symbolTable.getCurrentScope());
        symbolTable.addSymbol(entry);
        for (var content : ctx.htmlContent()) {
            node.addChild(visit(content));
        }

        return node;   }


    @Override
    public Node visitAngularButton(AngularParser.AngularButtonContext ctx) {
        String identifier = ctx.BUTTON(0).getText();
        String expression = ctx.htmlAttribute(0).getText();
        String buttonText = ctx.htmlContent(0).getText();
        SymbolEntry entry = new SymbolEntry(identifier, SymbolType.TAG, buttonText, symbolTable.getCurrentScope());
        symbolTable.addSymbol(entry);

        return new AngularButtonNode(identifier, expression, buttonText);
    }





    @Override
    public Node visitHtmlContent(AngularParser.HtmlContentContext ctx) {
        HtmlContentNode contentNode = new HtmlContentNode();

        for (var child : ctx.htmlElement()) {
            Node node = visit(child);
            if (node != null) contentNode.addChild(node);
        }

        for (var child : ctx.textNode()) {
            Node node = visit(child);
            if (node != null) contentNode.addChild(node);
        }

        for (var child : ctx.interp()) {
            Node node = visit(child);
            if (node != null) contentNode.addChild(node);
        }

        return contentNode;
    }

    @Override
    public Node visitTextNode(AngularParser.TextNodeContext ctx) {
        String text = ctx.getText().trim();

        if (!text.isEmpty()) {
            SymbolEntry entry = new SymbolEntry(
                    "TextNode",
                    SymbolType.LITERAL,
                    text,
                    symbolTable.getCurrentScope()
            );

            symbolTable.addSymbol(entry);

            // إنشاء العقدة وإرجاعها
            return new TextNode(text);
        }

        return null;
    }


}
