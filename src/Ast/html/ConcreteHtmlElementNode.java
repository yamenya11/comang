package Ast.html;
import Ast.AngularASTBuilder;
import Ast.Node;
import Ast.html.attrbute.HtmlAttributeNode;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.List;
public class ConcreteHtmlElementNode extends HtmlElementNode {


    public ConcreteHtmlElementNode(String tagName) {
        this.tagName = tagName;
    }

    // دالة عامة لإضافة الصفات والأبناء من أي سياق (context)
    public void addAttributesAndChildren(ParserRuleContext ctx, AngularASTBuilder builder) {
        // نفترض ctx يحتوي على دوال htmlAttribute و htmlContent
        // وحاول استدعائها إذا موجودة (لو ANTLR ما يدعم ممكن تضيفها للبرزر)

        try {
            // الصفات
            var attrList = (List<?>) ctx.getClass().getMethod("htmlAttribute").invoke(ctx);
            for (Object attrCtx : attrList) {
                HtmlAttributeNode attrNode = (HtmlAttributeNode) builder.visit((ParserRuleContext) attrCtx);
                this.addAttribute(attrNode);
            }
        } catch (Exception e) {
            // اذا الميثود مش موجودة، تجاهل الصفات
        }

        try {
            // المحتوى (الأطفال)
            var contentList = (List<?>) ctx.getClass().getMethod("htmlContent").invoke(ctx);
            for (Object childCtx : contentList) {
                Node childNode = builder.visit((ParserRuleContext) childCtx);
                if (childNode != null) this.addChild(childNode);
            }
        } catch (Exception e) {
            // اذا الميثود مش موجودة، تجاهل الأطفال
        }
    }
}
