package Ast.expressions;

import Ast.Node;

public class NotEqualityNode extends ExpressionNode {
    private ExpressionNode left;
    private ExpressionNode right;

    public NotEqualityNode(ExpressionNode left, ExpressionNode right) {
        this.left = left;
        this.right = right;
    }

    public ExpressionNode getLeft() { return left; }
    public ExpressionNode getRight() { return right; }



    @Override
    public String toString() {
        return "NotEqualityNode{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
