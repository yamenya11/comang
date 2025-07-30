package Ast.methods;
import Ast.Node;
import java.util.List;
public class SpreadExpressionNode extends Node {
    private Node expression;

    public SpreadExpressionNode(Node expression) {
        this.expression = expression;
    }

    public Node getExpression() { return expression; }

    @Override
    public String toString() {
        return "SpreadExpressionNode{" +
                "expression=" + expression +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}