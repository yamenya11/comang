package Ast.types;

public class IdentifierValueNode extends BaseValueNode {
    private final String name;

    public IdentifierValueNode(String name) {
        this.name = name;
    }

    @Override
    public String getValue() {
        return name;
    }

    @Override
    public String toString() {
        return "IdentifierValueNode{value='" + name + "'}";
    }
}
