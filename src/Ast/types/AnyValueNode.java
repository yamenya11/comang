package Ast.types;

public class AnyValueNode extends BaseValueNode {
    private final String value;

    public AnyValueNode(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
