package Ast.types;

public class NullNode extends BaseValueNode {

    private final String value;

    public NullNode(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "NullNode{}";
    }
}
