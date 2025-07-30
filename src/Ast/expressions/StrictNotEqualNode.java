package Ast.expressions;

import Ast.Node;

public class StrictNotEqualNode  extends ExpressionNode {
    private final ExpressionNode left;
    private final ExpressionNode right;

    public StrictNotEqualNode(ExpressionNode left, ExpressionNode right) {
        this.left = left;
        this.right = right;
    }

    public ExpressionNode getLeft() {
        return left;
    }

    public ExpressionNode getRight() {
        return right;
    }

    @Override
    public String toString() {
        return "(" + left + " !== " + right + ")";
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
