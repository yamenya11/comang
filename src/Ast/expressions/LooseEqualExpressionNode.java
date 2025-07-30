package Ast.expressions;

import Ast.Node;

public class LooseEqualExpressionNode extends ExpressionNode {
    private Node left;
    private Node right;

    public LooseEqualExpressionNode(Node left, Node right) {
        this.left = left;
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    @Override
    public String toString() {
        return "(" + left + " == " + right + ")";
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
