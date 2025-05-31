package Ast.expressions;

import Ast.Node;

public class MultiplicationExpressionNode extends ExpressionNode {
    public MultiplicationExpressionNode(ExpressionNode left, ExpressionNode right) {
        addExpression(left);
        addExpression(right);
    }


    @Override
    public void accept(Node visitor) {
      visitor.accept(this);
    }

    @Override
    public String toString() {
        return "MultiplicationExpressionNode{" +
                "left=" + expressions.get(0) +
                ", right=" + expressions.get(1) +
                '}';
    }
}