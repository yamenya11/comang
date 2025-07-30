package GenerationCode;  // أو نفس الحزمة المناسبة عندك

import Ast.AngularASTBuilder;
import Ast.ClassBodyNode;
import Ast.Node;

import Ast.application.ApplicationNode;
import Ast.application.ImportStatementNode;
import Ast.application.InjectableLabelNode;
import Ast.components.ComponentNode;
import Ast.declarations.ClassDeclarationNode;
import Ast.html.HtmlContentNode;
import Ast.html.StandardHtmlElementNode;
import Ast.html.TextNode;
import Ast.html.attrbute.BasicHtmlAttributeNode;
import Ast.html.attrbute.EventBindingAttributeNode;
import Ast.html.attrbute.PropertyBindingAttributeNode;
import Ast.metadata.HtmlMetadataNode;
import Ast.metadata.SelectorNode;
import Ast.ngmodul.NgModuleDecorator;
import Ast.routing.RouteDefinitionNode;
import SymbolTable.SymbolTable;
import seminticerror.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
// استورد باقي أنواع الـ Node التي تحتاجها

public class HtmlAstVisitor extends AngularASTBuilder {

    public HtmlAstVisitor(SymbolTable symbolTable) {
        super(
                symbolTable,
                new SelectorSymbolTable(),
                new ClassSymbolTable(),
                new ErrorHandler(),
                new Import(),
                new HtmlSymbolTable(),
                new FunctionSymbolTable()
        );
    }


    public String visit(Node node) {
        if (node == null) {
            return "<div>Null node encountered</div>";
        }

        // افحص الحالات الخاصة أولا
        if (node instanceof ApplicationNode) {
            ApplicationNode appNode = (ApplicationNode) node;
            StringBuilder sb = new StringBuilder();
            for (Node child : appNode.getApplicationnode()) {
                sb.append(visit(child));
            }
            return sb.toString();
        } else if (node instanceof ImportStatementNode) {
            ImportStatementNode impNode = (ImportStatementNode) node;
            return "<p>import " + impNode.getImported() + " from '" + impNode.getSource() + "'</p>";
        } else if (node instanceof ClassDeclarationNode) {
            ClassDeclarationNode classNode = (ClassDeclarationNode) node;
            return "<h2>class " + classNode.getClassName() + "</h2>";
        }

        // ثم استخدم switch للباقي
        switch (node.getClass().getSimpleName()) {
            case "InjectableLabelNode":
                return visitInjectableLabelNode((InjectableLabelNode) node);
            case "ComponentNode":
                return visitComponentNode((ComponentNode) node);
            case "HtmlMetadataNode":
                return visitHtmlMetadataNode((HtmlMetadataNode) node);
            case "StandardHtmlElementNode":
                return visitStandardHtmlElementNode((StandardHtmlElementNode) node);
            case "HtmlContentNode":
                return visitHtmlContentNode((HtmlContentNode) node);
//            case "TextNode":
//                return visitTextNode((TextNode) node);
            case "ClassBodyNode":
                return visitClassBodyNode((ClassBodyNode) node);
            case "SelectorNode":
                return visitSelectorNode((SelectorNode) node);
            case "BasicHtmlAttributeNode":
                return visitBasicHtmlAttributeNode((BasicHtmlAttributeNode) node);
            case "PropertyBindingAttributeNode":
                return visitPropertyBindingAttributeNode((PropertyBindingAttributeNode) node);
            case "EventBindingAttributeNode":
                return visitEventBindingAttributeNode((EventBindingAttributeNode) node);
            default:
                return "<div>نوع غير معروف: " + node.getClass().getSimpleName() + "</div>";
        }
    }
    private String visitSelectorNode(SelectorNode node) {
        // مثال: أرجع نص يمثل الـ selector
        return "<span class='selector'>" + node.getValue() + "</span>";
    }

    private String visitComponentNode(ComponentNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append("<div class='component'>");
        sb.append("<h3>").append("Component: ").append(node.getComponentName()).append("</h3>");

        // استخرج الميتاداتا
        sb.append("<ul>");
        if (node.getMetadata() != null) {
            for (Node meta : node.getMetadata()) {
                sb.append("<li>").append(visit(meta)).append("</li>");
            }
        }
        sb.append("</ul>");
        sb.append("</div>");
        return sb.toString();
    }
    private String visitHtmlMetadataNode(HtmlMetadataNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append("<div class='template-preview'>");
        sb.append("<pre class='code-block'>");
        sb.append("<code class='html-code'>");

        if (node.getBody() != null && !node.getBody().isEmpty()) {
            for (Node htmlElement : node.getBody()) {
                String elementContent = visit(htmlElement);
                if (elementContent.contains("<form")) {
                    elementContent = processFormContent(elementContent);
                }
                sb.append(indentHtml(elementContent));
            }
        } else {
            sb.append("    <!-- No content available -->");
        }

        sb.append("</code>");
        sb.append("</pre>");
        sb.append("</div>");
        return sb.toString();
    }

    private String indentHtml(String html) {
        return html.lines()
                .map(line -> "    " + line)
                .collect(Collectors.joining("\n"));
    }

    private String visitCustomElement(StandardHtmlElementNode node) {
        if (node.getTagName().startsWith("app-")) {
            StringBuilder sb = new StringBuilder();
            sb.append("<").append(node.getTagName());

            // السمات
            for (Node attr : node.getAttributes()) {
                String attrStr = visit(attr);
                if (attrStr != null) {
                    sb.append(" ").append(attrStr);
                }
            }

            sb.append(">");

            // المحتوى
            for (Node child : node.getChildren()) {
                sb.append(visit(child));
            }

            sb.append("</").append(node.getTagName()).append(">");
            return sb.toString();
        }
        return visitStandardHtmlElementNode(node);
    }
    private String visitStandardHtmlElementNode(StandardHtmlElementNode node) {
        StringBuilder sb = new StringBuilder();

        // توليد بداية العنصر مع السمات إن وجدت
        sb.append("<").append(node.getTagName());

        if (node.getAttributes() != null && !node.getAttributes().isEmpty()) {
            for (Node attrNode : node.getAttributes()) {
                String attr = visit(attrNode);  // استخدم visit لتوليد السمة كـ string
                sb.append(" ").append(attr);
            }
        }

        sb.append(">");

        // توليد الأبناء إن وجدوا
        if (node.getChildren() != null) {
            for (Node child : node.getChildren()) {
                sb.append(visit(child));
            }
        }

        sb.append("</").append(node.getTagName()).append(">");
        return sb.toString();
    }
    private String visitBasicHtmlAttributeNode(BasicHtmlAttributeNode node) {
        if (node.getValue() != null) {
            return node.getName() + "=\"" + node.getValue() + "\"";
        } else {
            return node.getName(); // مثلاً: required أو disabled
        }
    }
    private String visitPropertyBindingAttributeNode(PropertyBindingAttributeNode node) {
        String expr = node.getExpression() != null ? node.getExpression() : "";
        return "[" + node.getName() + "]=\"" + expr + "\"";
    }

    private String visitEventBindingAttributeNode(EventBindingAttributeNode node) {
        return "(" + node.getName() + ")=\"" + node.getValue() + "\"";
    }


    private String visitHtmlContentNode(HtmlContentNode node) {
        StringBuilder sb = new StringBuilder();
        for (Node child : node.getChildren()) {
            sb.append(visit(child));
        }
        return sb.toString();
    }

    private String visitTextNode(TextNode node) {
        String text = node.getText();
        if (text.matches(".*[\\p{InArabic}].*")) {
            return "<span dir=\"rtl\">" + text + "</span>";
        }
        return text;
    }


    private String visitInjectableLabelNode(InjectableLabelNode node) {
        return "<div>Injectable: " + node.getClass() + "</div>";
    }




    private String visitClassBodyNode(ClassBodyNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append("<div>Class Body:<ul>");
        if (node.getClassElements() != null) {
            for (Node child : node.getClassElements()) {
                sb.append("<li>").append(visit(child)).append("</li>");
            }
        }
        sb.append("</ul></div>");
        return sb.toString();
    }

    private String processFormContent(String formContent) {
        // إصلاح السمات الأساسية
        String fixed = formContent
                .replace("[formGroup]=\"productForm\"productForm", "[formGroup]=\"productForm\"")
                .replace("(ngSubmit)>", "(ngSubmit)=\"onSubmit()\">");

        // تحويل حقول النموذج
        Pattern fieldPattern = Pattern.compile("\"([^\"]+)\"([^\"]*)\"([^\"]+)\"");
        Matcher matcher = fieldPattern.matcher(fixed);
        StringBuffer sb = new StringBuffer();

        while (matcher.find()) {
            String fieldName = matcher.group(1);
            String fieldType = matcher.group(2).isEmpty() ? "text" : matcher.group(2);
            String fieldLabel = matcher.group(3);

            String fieldHtml = generateFormField(fieldName, fieldType, fieldLabel);
            matcher.appendReplacement(sb, Matcher.quoteReplacement(fieldHtml));
        }

        matcher.appendTail(sb);
        return sb.toString();
    }

    private String generateFormField(String name, String type, String label) {
        StringBuilder field = new StringBuilder();
        field.append("\n      <div class=\"form-group\">");
        field.append("\n        <label><span dir=\"rtl\">").append(label).append("</span></label>");

        if (type.equals("textarea")) {
            field.append("\n        <textarea formControlName=\"").append(name)
                    .append("\" class=\"form-control\"></textarea>");
        } else {
            field.append("\n        <input type=\"").append(type)
                    .append("\" formControlName=\"").append(name)
                    .append("\" class=\"form-control\">");
        }

        field.append("\n      </div>");
        return field.toString();
    }
    private String getInputType(String type) {
        switch (type.toLowerCase()) {
            case "number": return "number";
            case "email": return "email";
            case "date": return "date";
            default: return "text";
        }
    }

}
