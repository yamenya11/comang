package Ast.css;

public class IdentifierValueNode extends ValueNode {
    public final String name;

    public IdentifierValueNode(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "IdentifierValueNode{" +
                "name='" + name + '\'' +
                '}';
    }
}