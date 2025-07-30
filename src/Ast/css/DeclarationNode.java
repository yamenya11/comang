package Ast.css;


public class DeclarationNode extends CssNode {
    public final String property;
    public final ValueNode value;

    public DeclarationNode(String property, ValueNode value) {
        this.property = property;
        this.value = value;
    }



    @Override
    public String toString() {
        return "DeclarationNode{" +
                "property='" + property + '\'' +
                ", value=" + value +
                '}';
    }
}
