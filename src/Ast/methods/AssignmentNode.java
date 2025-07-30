package Ast.methods;
import Ast.Node;
import java.util.List;

public class AssignmentNode extends Node {
    private Node left;
    private Node right;

    public AssignmentNode(Node left, Node right) {
        this.left = left;
        this.right = right;
    }

    public Node getLeft() { return left; }
    public Node getRight() { return right; }

    @Override
    public String toString() {
        return "AssignmentNode{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}