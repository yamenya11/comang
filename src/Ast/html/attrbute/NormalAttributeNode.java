package Ast.html.attrbute;

public class NormalAttributeNode extends HtmlAttributeNode {
    public NormalAttributeNode(String name, String value) {
        super(name, value);
    }

    @Override
    public String toString() {
        return "NormalAttributeNode{name='" + name + "', value='" + value + "'}";
    }

}
