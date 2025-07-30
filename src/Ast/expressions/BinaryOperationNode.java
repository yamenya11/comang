package Ast.expressions;

import Ast.Node;

public class BinaryOperationNode extends ExpressionNode {
    public Node left;
    public String operator;
    public Node right;

    public BinaryOperationNode(Node left, String operator, Node right) {
        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    @Override
    public String toString() {
        return "(" + left + " " + operator + " " + right + ")";
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }

}
