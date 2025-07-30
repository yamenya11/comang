package Ast.methods;
import Ast.Node;

public class ExpressionStNode extends Node {
    private Node expression;

    public ExpressionStNode(Node expression) {
        this.expression = expression;
    }

    public Node getExpression() {
        return expression;
    }

    @Override
    public String toString() {
        return "ExpressionStNode{" +
                "expression=" + expression +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}