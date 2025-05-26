package Ast;

import SymbolTable.SymbolTable;
import org.antlr.v4.runtime.*;
import antlr.gen.*; // تأكد من وجود ملفات ANTLR الخاصة بك
import seminticerror.ClassSymbolTable;
import seminticerror.ErrorHandler;
import seminticerror.Import;

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
            return (Node) new AngularASTBuilder(symbolTable, classSymbolTable, errorHandler,importSymbols).visit(parser.htmlContent());
        } catch (Exception e) {
            System.err.println("Error parsing HTML content: " + e.getMessage());
            return null;
        }
    }
}
