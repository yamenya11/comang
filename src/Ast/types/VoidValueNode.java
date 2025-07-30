package Ast.types;

public class VoidValueNode extends BaseValueNode {
    private final String value;

    public VoidValueNode(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "VoidValueNode{" + value + '}';
    }
}
