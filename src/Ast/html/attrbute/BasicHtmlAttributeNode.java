package Ast.html.attrbute;

public class BasicHtmlAttributeNode extends HtmlAttributeNode {
    public BasicHtmlAttributeNode(String name, String value) {
        super(name, value);
    }

    @Override
    public String toString() {
        return "BasicHtmlAttributeNode{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}