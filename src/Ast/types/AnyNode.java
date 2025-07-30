package Ast.types;

public class AnyNode extends BaseValueNode {
    private final String value;

    public AnyNode(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "AnyNode{}";
    }
}
