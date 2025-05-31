package Ast;

import Ast.application.*;
import Ast.calls.*;
import Ast.components.ComponentNode;
import Ast.declarations.ClassDeclarationNode;
import Ast.types.*;
import Ast.declarations.ExtendClauseNode;
import Ast.declarations.ImplementClauseNode;
import Ast.expressions.*;
import Ast.function.FUNDECLRATIONNODE;
import Ast.function.FunctionBodyNode;
import Ast.function.NGOnInit;
import Ast.html.*;
import Ast.html.attrbute.*;
import Ast.html.tag.CloseFixedTagNode;
import Ast.html.tag.CloseTagNode;
import Ast.html.tag.FixedTagNode;
import Ast.html.tag.OpenTagNode;
import Ast.metadata.*;
import Ast.methods.ConstructorNode;
import Ast.methods.ParameterNode;
import Ast.property.EmptyArrayNode;
import Ast.property.RegularPropertyNode;
import SymbolTable.*;
import antlr.gen.AngularParser;
import Ast.statements.*;
import antlr.gen.*;


import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import seminticerror.*;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import org.antlr.v4.runtime.CommonTokenStream;
import terminal.TypeTeminal;

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
    public Node visitCLASSLABEL(AngularParser.CLASSLABELContext ctx) {
        String className = ctx.classDeclaration().IDENTIFIER().getText();
        ClassBodyNode classBodyNode = new ClassBodyNode();

        if (classSymbolTable.symbolExists(className)) {
            errorHandler.reportSemanticError("Duplicate class definition: " + className, ctx.start);
            return null;
        }

        classSymbolTable.addSymbol(new SymbolEntry(className, SymbolType.CLASS, null, symbolTable.getCurrentScope()));
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
        String injectableName = ctx.INJECTABLE().getText();
        List<MetadataEntryNode> metadataEntries = new ArrayList<>();

        symbolTable.addSymbol(new SymbolEntry(injectableName, SymbolType.INJECTABLE, null, symbolTable.getCurrentScope()));
        symbolTable.enterScope(injectableName);
        for (var entCtx : ctx.metadata().metadataEntry()) {
            metadataEntries.add((MetadataEntryNode) visit(entCtx));
        }
        symbolTable.exitScope();
        return new InjectableLabelNode(injectableName,metadataEntries) ;

    }


    @Override
    public Node visitComponent(AngularParser.ComponentContext ctx) {
        String componentName = ctx.COMPONENT().getText();

//warning
        List<MetadataEntryNode> metadataEntries = new ArrayList<>();

        symbolTable.addSymbol(new SymbolEntry(componentName, SymbolType.COMPONENT, "metadataentry", symbolTable.getCurrentScope()));
        symbolTable.enterScope(componentName);  // الآن currentScope = global.ComponentName
        for (var entCtx : ctx.metadata().metadataEntry()) {
            metadataEntries.add((MetadataEntryNode) visit(entCtx));
        }
        symbolTable.exitScope();
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
    public Node visitProvidin(AngularParser.ProvidinContext ctx) {
        String key = ctx.PROVIDEDIN().getText();
        String value = ctx.STRING().getText().replaceAll("^\"|\"$", "");



        String scope = symbolTable.getCurrentScope();
        symbolTable.addSymbol(new SymbolEntry(key, SymbolType.METADATA, value, scope));

        return new Provedin(key, value);
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

        if (ctx.classInheritance() != null && !ctx.classInheritance().isEmpty()) {
            superClass = ctx.classInheritance().getText();
        }
        symbolTable.addSymbol(new SymbolEntry(className, SymbolType.CLASS, null, symbolTable.getCurrentScope()));
        symbolTable.enterScope(className);
        List<Node> classBodyElements = new ArrayList<>();
        if (ctx.classBody() != null) {
            for (var memberCtx : ctx.classBody().children) {
                Node node = (Node) visit(memberCtx);
                if (node != null) {
                    classBodyElements.add(node);
                }
            }
        }

        symbolTable.exitScope();
        return new ClassDeclarationNode(className, superClass, classBodyElements);
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
        String rawValue = ctx.STRING().getText().replaceAll("^\"|\"$", "");

        symbolTable.addSymbol(new SymbolEntry(
                "templateUrl", SymbolType.METADATA, rawValue, symbolTable.getCurrentScope()
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

        symbolTable.addSymbol(new SymbolEntry(id, SymbolType.FUNCTION, null, symbolTable.getCurrentScope()));

        symbolTable.enterScope(id);

        ProductsNode productsNode = null;

        if (elementsNode instanceof ElementListNode) {
            productsNode = new ProductsNode(id, (ElementListNode) elementsNode);
        }

        symbolTable.exitScope();

        return productsNode;  }









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
            Node pairNode = visit(pairCtx);
            if (pairNode instanceof PairNode) {
                pairs.add((PairNode) pairNode);
            }
        }

        return new ElementNode(pairs);     }


    @Override
    public Node visitPair(AngularParser.PairContext ctx) {
        Node keyNode = visit(ctx.basevalue());
        Node valueNode = visit(ctx.value());

        List<Node> keyList = new ArrayList<>();
        keyList.add(keyNode);

        String valueStr = valueNode.toString();

        symbolTable.addSymbol(new SymbolEntry(ctx.basevalue().getText(), SymbolType.PARAMETER, valueStr, symbolTable.getCurrentScope()));

        return new PairNode(keyList, valueStr);

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
        return new NumberNode(ctx.NUMBER().getText());    }

    @Override
    public Node visitANYLABEL(AngularParser.ANYLABELContext ctx) {
        return new AnyNode();
    }

    @Override
    public Node visitONINITLABEL(AngularParser.ONINITLABELContext ctx) {
        return new VoidNode();
    }

    @Override
    public Node visitVOIDLABEL(AngularParser.VOIDLABELContext ctx) {
        return new OnInitNode();
    }

    @Override
    public Node visitNULLLABEL(AngularParser.NULLLABELContext ctx) {
        return new NullNode();
    }

    @Override
    public Node visitConstructor(AngularParser.ConstructorContext ctx) {
          String constructorName = ctx.CONSTRUCTOR().getText();

           List<Node> parameters = new ArrayList<>();

        symbolTable.addSymbol(new SymbolEntry(
                constructorName,
                SymbolType.CONSTRUCTOR,
                "CONSTRUCTER",
                symbolTable.getCurrentScope()
        ));

           if (ctx.parameter() != null) {
               symbolTable.enterScope(constructorName);
            for (var parameterCtx : ctx.parameter()) {

                String modifier = parameterCtx.modifiers().getText();
                String name = parameterCtx.IDENTIFIER().getText();
                String type = parameterCtx.value().getText();
                if (!importChecker.isImported(type)) {
                    errorHandler.reportSemanticError("The class or service '" + type + "' is used without importing it.", parameterCtx.start);
                }
                parameters.add(new ParameterNode(name, type, modifier));
            }
           }

             List<Node> statements = new ArrayList<>();
             if (ctx.statement() != null) {

            for(var statm:ctx.statement()){
                statements.add(visit(statm));
            }

        }

        symbolTable.exitScope();
        return new ConstructorNode(constructorName, parameters, statements);   }




    @Override
    public Node visitLABELED_STATEMENT(AngularParser.LABELED_STATEMENTContext ctx) {
        String label = ctx.IDENTIFIER().getText();
        Node statement = visit(ctx.statement());
        return new LabeledStatementNode(label, statement);    }

    @Override
    public Node visitIF_STATEMENT(AngularParser.IF_STATEMENTContext ctx) {
        return visit(ctx.ifStatement());    }

    @Override
    public Node visitLOOP_STATEMENT(AngularParser.LOOP_STATEMENTContext ctx) {
        return visit(ctx.loopStatement());    }

    @Override
    public Node visitSWITCH_STATEMENT(AngularParser.SWITCH_STATEMENTContext ctx) {
        return visit(ctx.switchStatement());    }

    @Override
    public Node visitMETHOD_DECLARATION_STATEMENT(AngularParser.METHOD_DECLARATION_STATEMENTContext ctx) {
        return visit(ctx.methodDeclaration());    }

    @Override
    public Node visitPROPERTY_DECLARATION_STATEMENT(AngularParser.PROPERTY_DECLARATION_STATEMENTContext ctx) {
        return visit(ctx.propertyDeclaration());    }

    @Override
    public Node visitFUNCTION_CALL_STATEMENT(AngularParser.FUNCTION_CALL_STATEMENTContext ctx) {
        return visit(ctx.functionCall());
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
        ExpressionNode left = (ExpressionNode) visit(ctx.expression(0));
        ExpressionNode right = (ExpressionNode) visit(ctx.expression(1));
        return new MultiplicationExpressionNode(left, right);
    }

    @Override
    public Node visitEXPMINUS(AngularParser.EXPMINUSContext ctx) {
        ExpressionNode left = (ExpressionNode) visit(ctx.expression(0));
        ExpressionNode right = (ExpressionNode) visit(ctx.expression(1));
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
    public Node visitFUNCTIONCALLLABEL(AngularParser.FUNCTIONCALLLABELContext ctx) {
        return visit(ctx.functionCall());
    }

    @Override
    public Node visitEXPNUMBER(AngularParser.EXPNUMBERContext ctx) {
        return super.visitEXPNUMBER(ctx);
    }

    @Override
    public Node visitEXPINTEGER(AngularParser.EXPINTEGERContext ctx) {
        return new NumberLiteralNode(Integer.parseInt(ctx.INTEGER().getText()));    }

    @Override
    public Node visitEXPPLUSPLUS(AngularParser.EXPPLUSPLUSContext ctx) {
        ExpressionNode expr = (ExpressionNode) visit(ctx.expression());
        return new IncrementExpressionNode(expr);
    }

    @Override
    public Node visitEXPPAREN(AngularParser.EXPPARENContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public Node visitEXPPLUS(AngularParser.EXPPLUSContext ctx) {
        ExpressionNode left = (ExpressionNode) visit(ctx.expression(0));
        ExpressionNode right = (ExpressionNode) visit(ctx.expression(1));
        return new PlusExpressionNode(left, right);
    }

    @Override
    public Node visitEXPDIVIDE(AngularParser.EXPDIVIDEContext ctx) {
        ExpressionNode left = (ExpressionNode) visit(ctx.expression(0));
        ExpressionNode right = (ExpressionNode) visit(ctx.expression(1));
        return new DivisionExpressionNode(left, right);
    }

    @Override
    public Node visitEXPLESS(AngularParser.EXPLESSContext ctx) {
        ExpressionNode left = (ExpressionNode) visit(ctx.expression(0));
        ExpressionNode right = (ExpressionNode) visit(ctx.expression(1));
        return new LessThanExpressionNode(left, right);
    }

    @Override
    public Node visitEXPSTRING(AngularParser.EXPSTRINGContext ctx) {
        return new StringLiteralNode(ctx.STRING().getText());
    }

    @Override
    public Node visitEXPEQUALS(AngularParser.EXPEQUALSContext ctx) {
        ExpressionNode left = (ExpressionNode) visit(ctx.expression(0));
        ExpressionNode right = (ExpressionNode) visit(ctx.expression(1));
        return new EqualsExpressionNode(left, right);
    }

    @Override
    public Node visitEXPMOD(AngularParser.EXPMODContext ctx) {
        ExpressionNode left = (ExpressionNode) visit(ctx.expression(0));
        ExpressionNode right = (ExpressionNode) visit(ctx.expression(1));
        return new ModExpressionNode(left, right);
    }

    @Override
    public Node visitEXPGREATER(AngularParser.EXPGREATERContext ctx) {
        ExpressionNode left = (ExpressionNode) visit(ctx.expression(0));
        ExpressionNode right = (ExpressionNode) visit(ctx.expression(1));
        return new GreaterThanExpressionNode(left, right);
    }

    @Override
    public Node visitLoopStatement(AngularParser.LoopStatementContext ctx) {
        if (ctx.IN() != null) {

            String identifier = ctx.IDENTIFIER(0).getText();
            String inTarget = ctx.IDENTIFIER(1).getText();
            List<StatementNode> body = new ArrayList<>();
            String scope =symbolTable.getCurrentScope();
            symbolTable.addSymbol(new SymbolEntry(identifier,SymbolType.LOOP,inTarget,scope));
             symbolTable.enterScope("loop");
            for (var stmt : ctx.statement()) {
                body.add((StatementNode) visit(stmt));
            }
             symbolTable.exitScope();
            return new LoopStatementNode(identifier, inTarget, body);
        } else {

            String variable = ctx.IDENTIFIER(0).getText();
            ExpressionNode init = (ExpressionNode) visit(ctx.expression(0));
            ExpressionNode condition = (ExpressionNode) visit(ctx.expression(1));
            String scope =symbolTable.getCurrentScope();
            symbolTable.addSymbol(new SymbolEntry(variable,SymbolType.LOOP,"inTarget",scope));
            symbolTable.enterScope("loop");
            String operation = ctx.PLUS_PLUS() != null ? "++" : "--";

            List<StatementNode> body = new ArrayList<>();
            for (var stmt : ctx.statement()) {
                body.add((StatementNode) visit(stmt));
            }
            symbolTable.exitScope();
            return new ForLoopStatementNode(variable, init, condition, operation, body);
        }}

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
        return new WhileStatementNode(condition, body);   }

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
        return new SwitchStatementNode(expression, cases);   }

    @Override
    public Node visitIfStatement(AngularParser.IfStatementContext ctx) {
        ExpressionNode condition = (ExpressionNode) visit(ctx.equalityExpression());

        List<StatementNode> ifBody = new ArrayList<>();
        symbolTable.enterScope("If");
        for (var stmt : ctx.statement()) {
            Node node = visit(stmt);
            if (node instanceof StatementNode) {
                ifBody.add((StatementNode) node);
            }
        }

        List<StatementNode> elseBody = new ArrayList<>();
        if (ctx.ELSE() != null && ctx.statement(1) != null) {
            for (var stmt : ctx.statement()) {
                Node node = visit(stmt);
                if (node instanceof StatementNode) {
                    elseBody.add((StatementNode) node);
                }
            }
        }
symbolTable.exitScope();
        return new IfStatementNode(condition, ifBody, elseBody);  }

    @Override
    public Node visitStrictEquality(AngularParser.StrictEqualityContext ctx) {
        ExpressionNode left = (ExpressionNode) visit(ctx.expression(0));
        ExpressionNode right = (ExpressionNode) visit(ctx.expression(1));
        return new StrictEqualityNode(left, right);    }

    @Override
    public Node visitLooseEquality(AngularParser.LooseEqualityContext ctx) {
        ExpressionNode left = (ExpressionNode) visit(ctx.expression(0));
        ExpressionNode right = (ExpressionNode) visit(ctx.expression(1));
        return new LooseEqualityNode(left, right);    }

    @Override
    public Node visitNotEquality(AngularParser.NotEqualityContext ctx) {
        ExpressionNode left = (ExpressionNode) visit(ctx.expression(0));
        ExpressionNode right = (ExpressionNode) visit(ctx.expression(1));
        return new NotEqualityNode(left, right);    }

    @Override
    public Node visitStrictNotEquality(AngularParser.StrictNotEqualityContext ctx) {
        ExpressionNode left = (ExpressionNode) visit(ctx.expression(0));
        ExpressionNode right = (ExpressionNode) visit(ctx.expression(1));
        return new StrictNotEqualityNode(left, right);    }


    @Override
    public Node visitEXPRESSION_STATEMENT(AngularParser.EXPRESSION_STATEMENTContext ctx) {
        Node expr = visit(ctx.expression());
        return new ExpressionStatementNode(expr);    }




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
        ExpressionNode caseExpr = (ExpressionNode) visit(ctx.expression());
        String name=ctx.NGONINIT().getText();
        String isvoid=ctx.VOID().getText();
        symbolTable.addSymbol(new SymbolEntry(name, SymbolType.FUNCTION, "caseExpr", symbolTable.getCurrentScope()));

        return new NGOnInit(name,caseExpr,isvoid);
    }

    @Override
    public Node visitParameter(AngularParser.ParameterContext ctx) {
        String modifier = null;
        if (ctx.modifiers() != null) {
            modifier = ctx.modifiers().getText();
        }
        String name = ctx.IDENTIFIER().getText();
        String type = ctx.value().getText();
        symbolTable.addSymbol(new SymbolEntry(name, SymbolType.PARAMETER, type, symbolTable.getCurrentScope()));
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
        symbolTable.enterScope(functionName);
        symbolTable.addSymbol(new SymbolEntry(functionName, SymbolType.FUNCTION, null, null));
        super.visitFunctionDeclaration(ctx);
        symbolTable.exitScope();
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
        String value = ctx.value(0).getText();
        String assist = ctx.value(1).getText();
        List<TypeTeminal> type =new ArrayList<>();
        Node typeNode = visit(ctx.typeVarible());
        if (typeNode instanceof TypeTeminal) {
            type.add((TypeTeminal) typeNode);
        }
        return new LetVariableDeclarationNode(type,name, value,assist);    }

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
        Node expressionNode = visit(ctx.ngfor().expression());
        return new NgForNode("*ngFor", expressionNode);
    }

    @Override
    public Node visitNGIFATTRIBUTE(AngularParser.NGIFATTRIBUTEContext ctx) {
        Node condition = visit(ctx.ngIf().expression());
        return new NgIfNode(condition, null);
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

        for (var attr : ctx.htmlAttribute()) {
            HtmlAttributeNode attributeNode = (HtmlAttributeNode) visit(attr);
            node.addAttribute(attributeNode);
        }


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
        String text = null;

        if (ctx.STRING() != null) {
            text = ctx.STRING().getText();
        } else if (ctx.ARABIC_TEXT() != null) {
            text = ctx.ARABIC_TEXT().getText();
        }

        if (text != null && !text.trim().isEmpty()) {
            SymbolEntry entry = new SymbolEntry(
                    "TextNode",
                    SymbolType.LITERAL,
                    text,
                    symbolTable.getCurrentScope()
            );
            symbolTable.addSymbol(entry);
            return new TextNode(text);
        }

        return null;
    }

    @Override
    public Node visitEventBinding(AngularParser.EventBindingContext ctx) {
        return super.visitEventBinding(ctx);
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
                symbolTable.getCurrentScope()
        );
        symbolTable.addSymbol(entry);

        return new InterpolationNode(identifiers);
    }

    @Override
    public Node visitNgfor(AngularParser.NgforContext ctx) {
        String itemVar = ctx.NG().getText();
        Node expressionNode = visit(ctx.expression());

        symbolTable.enterScope("ngFor");  // ادخل نطاق جديد
        symbolTable.addSymbol(new SymbolEntry(
                itemVar,
                SymbolType.VARIABLE,
                null,
                symbolTable.getCurrentScope()
        ));

        return new NgForNode(itemVar, expressionNode);
    }

    @Override
    public Node visitNgIf(AngularParser.NgIfContext ctx) {
        Node condition = visit(ctx.expression());

        SymbolEntry entry = new SymbolEntry(
                "NgIfCondition",
                SymbolType.VARIABLE,
                condition.toString(),
                symbolTable.getCurrentScope()
        );
        symbolTable.addSymbol(entry);

        return new NgIfNode(condition, null);
    }

    @Override
    public Node visitEMPTYPROPERTYBINDINGATTRIBUTE(AngularParser.EMPTYPROPERTYBINDINGATTRIBUTEContext ctx) {
        String attrName = ctx.IDENTIFIER().getText();
        return new EmptyPropertyBindingAttributeNode(attrName);
    }

    @Override
    public Node visitClosefixedtag(AngularParser.ClosefixedtagContext ctx) {
        String tagName = ctx.FIXEDTAGNAME().getText();
        return new CloseFixedTagNode(tagName);    }

    @Override
    public Node visitFixedtqg(AngularParser.FixedtqgContext ctx) {
        String tagName = ctx.FIXEDTAGNAME().getText();
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
}
