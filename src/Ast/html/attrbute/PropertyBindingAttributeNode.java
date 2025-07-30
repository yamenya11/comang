package Ast.html.attrbute;

public class PropertyBindingAttributeNode extends HtmlAttributeNode {
    private String expression;

    public PropertyBindingAttributeNode(String name, String expression) {
        super(name, expression);
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "PropertyBindingAttributeNode{" +
                "expression='" + expression + '\'' +
                ", name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    public String getExpression() {
        return expression;
    }
}
