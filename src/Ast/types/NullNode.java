package Ast.types;

public class NullNode extends BaseValueNode {
    @Override
    public String getValue() {
        return "null";
    }

    @Override
    public String toString() {
        return "NullNode{}";
    }
}
