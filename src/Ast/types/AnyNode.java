package Ast.types;

public class AnyNode extends BaseValueNode {
    @Override
    public String getValue() {
        return "any";
    }

    @Override
    public String toString() {
        return "AnyNode{}";
    }
}
