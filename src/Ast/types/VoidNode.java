package Ast.types;

public class VoidNode extends BaseValueNode {
    private final String value;

    public VoidNode(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "VoidNode{}";
    }
}
