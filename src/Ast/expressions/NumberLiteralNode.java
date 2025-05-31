package Ast.expressions;

import Ast.Node;

public class NumberLiteralNode extends ExpressionNode {
    private final double value;

    public NumberLiteralNode(double value) {
        this.value = value;
    }


    public double getValue() {
        return value;
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }

    @Override
    public String toString() {
        return "NumberLiteralNode{" +
                "value=" + value +
                '}';
    }
}
