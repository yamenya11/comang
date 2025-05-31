package Ast.expressions;

import Ast.Node;

public class StrictEqualityNode  extends ExpressionNode {
    private ExpressionNode left;
    private ExpressionNode right;

    public StrictEqualityNode(ExpressionNode left, ExpressionNode right) {
        this.left = left;
        this.right = right;
    }

    public ExpressionNode getLeft() { return left; }
    public ExpressionNode getRight() { return right; }



    @Override
    public String toString() {
        return "StrictEqualityNode{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
