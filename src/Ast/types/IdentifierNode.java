package Ast.types;


import Ast.Node;
import Ast.expressions.ExpressionNode;

public class IdentifierNode extends ExpressionNode {
    private String name;

    public IdentifierNode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }

    @Override
    public String toString() {
        return "IdentifierNode{" + "name='" + name + '\'' + '}';
    }
}
