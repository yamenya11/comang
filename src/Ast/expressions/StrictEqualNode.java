package Ast.expressions;

import Ast.Node;

public class StrictEqualNode extends Node {
    private Node left;
    private Node right;

    public StrictEqualNode(Node left, Node right) {
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
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
