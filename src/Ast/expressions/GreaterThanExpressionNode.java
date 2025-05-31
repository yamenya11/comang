package Ast.expressions;

import Ast.Node;

public class GreaterThanExpressionNode extends ExpressionNode {
    public GreaterThanExpressionNode(ExpressionNode left, ExpressionNode right) {
        addExpression(left);
        addExpression(right);
    }


    @Override
    public void accept(Node visitor) {
visitor.accept(this);
    }

    @Override
    public String toString() {
        return "GreaterThanExpressionNode{" +
                "left=" + expressions.get(0) +
                ", right=" + expressions.get(1) +
                '}';
    }
}
