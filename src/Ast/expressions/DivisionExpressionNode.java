package Ast.expressions;

import Ast.Node;

public class DivisionExpressionNode extends ExpressionNode {
    public DivisionExpressionNode(ExpressionNode left, ExpressionNode right) {
        addExpression(left);
        addExpression(right);
    }


    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }

    @Override
    public String toString() {
        return "DivisionExpressionNode{" +
                "left=" + expressions.get(0) +
                ", right=" + expressions.get(1) +
                '}';
    }
}

