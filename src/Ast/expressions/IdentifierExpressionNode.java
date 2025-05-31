package Ast.expressions;

import Ast.Node;

public class IdentifierExpressionNode extends ExpressionNode {
    private final String name;

    public IdentifierExpressionNode(String name) {
        this.name = name;
    }


    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }

    @Override
    public String toString() {
        return "IdentifierExpressionNode{" +
                "name='" + name + '\'' +
                '}';
    }
}
