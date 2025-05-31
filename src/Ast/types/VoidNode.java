package Ast.types;

public class VoidNode extends BaseValueNode {
    @Override
    public String getValue() {
        return "void";
    }

    @Override
    public String toString() {
        return "VoidNode{}";
    }
}
