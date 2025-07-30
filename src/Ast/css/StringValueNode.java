package Ast.css;

public class StringValueNode extends ValueNode {
    public final String value;

    public StringValueNode(String value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return "StringValueNode{" +
                "value='" + value + '\'' +
                '}';
    }
}