package GenerationCode;

import Ast.AngularASTBuilder;
import Ast.Node;
import SymbolTable.SymbolTable;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class GenerationCode {

    private SymbolTable symbolTable;
    private StringBuilder navCode = new StringBuilder();
    private StringBuilder footerCode = new StringBuilder();
    private List<String> filePaths; // لإنتاج ملفات HTML لكل إدخال

    public GenerationCode(SymbolTable symbolTable, List<String> filePaths) {
        this.symbolTable = symbolTable;
        this.filePaths = filePaths;
    }

    public void setNavCode(String code) {
        this.navCode.append(code);
    }

    public void setFooterCode(String code) {
        this.footerCode.append(code);
    }

    public String getNavCode() {
        return navCode.toString();
    }

    public String getFooterCode() {
        return footerCode.toString();
    }

    // الدالة الأساسية لتوليد ملفات HTML
    public void generate(List<Node> astList) {
        TypeScriptCodeGenerator tsGen = new TypeScriptCodeGenerator(symbolTable);

        for (int i = 0; i < astList.size(); i++) {
            String filePath = filePaths.get(i);
            String fileName = extractFileNameWithoutExtension(filePath);

            System.out.println("🔄 توليد مكون من الملف: " + filePath);
            Node ast = astList.get(i);

            if (ast == null) {
                System.out.println("⚠️ تحذير: لم يتم إنشاء AST لهذا الملف: " + filePath);
                continue;
            }

            System.out.println("🧠 AST الناتج: " + ast.getClass().getSimpleName());

            String tsContent = tsGen.generate(ast);
            System.out.println("📦 الكود الناتج TypeScript:\n" + tsContent);

            String htmlContent = generateBodyFromAst(ast);
            System.out.println("🧾 HTML الناتج:\n" + htmlContent);

            generateAngularComponentFile(fileName, tsContent, htmlContent);
        }
    }



    private String generateBodyFromAst(Node ast) {
        HtmlAstVisitor visitor = new HtmlAstVisitor(symbolTable);
        return visitor.visit(ast);
    }

    private void generateHtmlFile(String filename, String bodyContent) {
        StringBuilder finalCode = new StringBuilder();

        finalCode.append("<!DOCTYPE html>\n<html>\n<head>\n<title>")
                .append(filename)
                .append("</title>\n<link rel=\"stylesheet\" href=\"style.css\">\n</head>\n<body>\n");

        if (navCode.length() > 0) {
            finalCode.append(navCode).append("\n");
        }

        finalCode.append(bodyContent).append("\n");

        if (footerCode.length() > 0) {
            finalCode.append(footerCode).append("\n");
        }

        finalCode.append("</body>\n</html>");

        try {
            String outputDir = "C:/Users/Yamen/IdeaProjects/Finalangular/generated-code";
            Files.createDirectories(Paths.get(outputDir)); // التأكد من وجود المجلد
            String outputPath = outputDir + "/" + filename + ".html";
            Files.write(Paths.get(outputPath), finalCode.toString().getBytes());
            System.out.println("✅ HTML تم إنشاؤه: " + outputPath);
        } catch (IOException e) {
            System.err.println("❌ خطأ أثناء كتابة الملف: " + filename);
            e.printStackTrace();
        }
    }

    private void generateAngularComponentFile(String filename, String tsContent, String htmlContent) {
        try {
            String basePath = "C:/Users/Yamen/IdeaProjects/Finalangular/generated-code/" + filename;
            Files.createDirectories(Paths.get(basePath));

            // اكتب ملف TypeScript
            String tsPath = basePath + "/" + filename + ".component.ts";
            Files.write(Paths.get(tsPath), tsContent.getBytes());

            // اكتب ملف HTML
            String htmlPath = basePath + "/" + filename + ".component.html";
            Files.write(Paths.get(htmlPath), htmlContent.getBytes());

            System.out.println("✅ Angular component created: " + filename + " at " + basePath);
        } catch (IOException e) {
            System.err.println("❌ Error creating Angular files for: " + filename);
            e.printStackTrace();
        }
    }

    private String extractFileNameWithoutExtension(String path) {
        String name = Paths.get(path).getFileName().toString();
        int dotIndex = name.lastIndexOf('.');
        return (dotIndex != -1) ? name.substring(0, dotIndex) : name;
    }
}
