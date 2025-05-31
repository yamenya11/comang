package Ast.types;

public class IdentifierNode extends BaseValueNode {
    private String name;

    public IdentifierNode(String name) {
        this.name = name;
    }

    @Override
    public String getValue() {
        return name;
    }

    @Override
    public String toString() {
        return "IdentifierNode{" + "name='" + name + '\'' + '}';
    }


}
