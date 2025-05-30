package Ast.html;

public class SelfClosingHtmlElementNode extends HtmlElementNode {
    public SelfClosingHtmlElementNode(String tagName) {
        this.tagName = tagName;
    }

    @Override
    public String toString() {
        return "SelfClosingHtmlElementNode{" +
                "tagName='" + tagName + '\'' +
                ", attributes=" + attributes +
                '}';
    }
}