package Ast.expressions;

import Ast.Node;

public class StringLiteralNode extends ExpressionNode {
    private final String value;

    public StringLiteralNode(String value) {
        this.value = value;
    }


    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }

    @Override
    public String toString() {
        return "StringLiteralNode{" +
                "value=" + value +
                '}';
    }
}
