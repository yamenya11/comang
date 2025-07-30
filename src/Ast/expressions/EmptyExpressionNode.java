package Ast.expressions;

import Ast.Node;

public class EmptyExpressionNode extends ExpressionNode {
    public EmptyExpressionNode() {
        super();
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }

    @Override
    public String toString() {
        return "EmptyExpression";
    }

    // لو عندك دوال evaluate أو generate، طبقها بما يناسب
}