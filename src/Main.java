import Ast.AngularASTBuilder;
import Ast.Node;
import Ast.components.ComponentNode;
import Ast.metadata.HtmlMetadataNode;
import Ast.metadata.MetadataEntryNode;
import Ast.metadata.SelectorNode;
import GenerationCode.GenerationCode;
import SymbolTable.SymbolTable; // استيراد SymbolTable فقط من هذه الحزمة
import antlr.gen.AngularLexer;
import antlr.gen.AngularParser;
import org.antlr.v4.runtime.*;
import seminticerror.*; // استيراد كل شيء من seminticerror

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private Main() {}

    public static void main(String[] args) {
        List<String> filePaths = List.of(
            //    "C:\\Users\\Yamen\\IdeaProjects\\Finalangular\\src\\app\\product\\addproduct$deleteproduct.txt",
               "C:\\Users\\Yamen\\IdeaProjects\\Finalangular\\src\\app\\product\\addproductfaild.txt"
              //  "C:\\Users\\Yamen\\IdeaProjects\\Finalangular\\src\\app\\product\\navigator.txt",
              //  "C:\\Users\\Yamen\\IdeaProjects\\Finalangular\\src\\app\\product\\product.component.txt",
               //"C:\\Users\\Yamen\\IdeaProjects\\Finalangular\\src\\app\\product\\product-detail.component.txt",
               // "C:\\Users\\Yamen\\IdeaProjects\\Finalangular\\src\\app\\product\\test11.txt"
        );

        // إنشاء جداول الرموز - استخدام أنواع seminticerror
        SymbolTable symbolTable = new SymbolTable();
        seminticerror.ClassSymbolTable classSymbolTable = new seminticerror.ClassSymbolTable();
        seminticerror.ErrorHandler errorHandler = new seminticerror.ErrorHandler();
        seminticerror.SelectorSymbolTable selectorSymbolTable = new seminticerror.SelectorSymbolTable();
        seminticerror.Import importsymboltable = new seminticerror.Import();
        seminticerror.HtmlSymbolTable html = new seminticerror.HtmlSymbolTable();
        seminticerror.FunctionSymbolTable fun = new seminticerror.FunctionSymbolTable();

        List<Node> astList = new ArrayList<>();

        for (String filePathStr : filePaths) {
            File file = new File(filePathStr);
            String fileName = file.getName();

            try {
                CharStream source = CharStreams.fromFileName(file.getAbsolutePath());
                AngularLexer lexer = new AngularLexer(source);
                AngularParser parser = new AngularParser(new CommonTokenStream(lexer));

                AngularASTBuilder builder = new AngularASTBuilder(
                        symbolTable, selectorSymbolTable, classSymbolTable,
                        errorHandler, importsymboltable, html, fun
                );

                Node ast = builder.visit(parser.program());
                astList.add(ast);

                System.out.println("\n✅ AST Constructed for: " + fileName);
                System.out.println(ast);

            } catch (IOException e) {
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("Error while processing file " + fileName + ": " + e.getMessage());
            }
        }

        // توليد الكود بعد تحليل جميع الملفات
        GenerationCode generator = new GenerationCode(symbolTable,filePaths);
        generator.generate(astList);

        // طباعة النتائج
        System.out.println("\n======================= Unified Symbol Table =======================");
        symbolTable.printSymbols();

        if (errorHandler.hasErrors()) {
            errorHandler.writeErrorsToFile("semantic_errors.txt");
            System.out.println("Semantic errors saved to semantic_errors.txt");
        } else {
            System.out.println("✅ No semantic errors found.");
        }

        System.out.println("\n✅ Code generation completed successfully!");
    }
}