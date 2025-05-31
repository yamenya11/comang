package Ast.types;

public class StringNode extends BaseValueNode {
    private String value;

    public StringNode(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "StringNode{" + "value='" + value + '\'' + '}';
    }
}