package Ast.expressions;

import Ast.Node;

public class IncrementExpressionNode extends ExpressionNode {
    public IncrementExpressionNode(ExpressionNode expression) {
        addExpression(expression);
    }


    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }

    @Override
    public String toString() {
        return "IncrementExpressionNode{" +
                "expression=" + expressions.get(0) +
                '}';
    }
}
