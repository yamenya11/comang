package Ast.expressions;

import Ast.Node;

public class DecrementExpressionNode extends ExpressionNode {
    public DecrementExpressionNode(ExpressionNode expression) {
        addExpression(expression);
    }


    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }

    @Override
    public String toString() {
        return "DecrementExpressionNode{" +
                "expression=" + expressions.get(0) +
                '}';
    }
}
