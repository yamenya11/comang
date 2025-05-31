package Ast;

import SymbolTable.SymbolTable;
import org.antlr.v4.runtime.*;
import antlr.gen.*;
import seminticerror.*;

public class AngularHtmlParser {
    public Node parseHtmlTemplate(String htmlContent) {
        try {
            CharStream inputStream = CharStreams.fromString(htmlContent);
            AngularLexer lexer = new AngularLexer(inputStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            AngularParser parser = new AngularParser(tokens);
            SymbolTable symbolTable = new SymbolTable();
            ClassSymbolTable classSymbolTable = new ClassSymbolTable();
            ErrorHandler errorHandler = new ErrorHandler();
            Import importSymbols = new Import();
            SelectorSymbolTable selectorSymbolTable=new SelectorSymbolTable();
            HtmlSymbolTable html=new HtmlSymbolTable();

            return (Node) new AngularASTBuilder(symbolTable,selectorSymbolTable, classSymbolTable, errorHandler,importSymbols,html).visit(parser.htmlContent());
        } catch (Exception e) {
            System.err.println("Error parsing HTML content: " + e.getMessage());
            return null;
        }
    }
}
