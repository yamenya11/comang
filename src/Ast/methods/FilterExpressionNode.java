package Ast.methods;
import Ast.Node;
import java.util.List;
public class FilterExpressionNode extends Node {
    private String left;
    private String operator;
    private String right;

    public FilterExpressionNode(String left, String operator, String right) {
        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    public String getLeft() { return left; }
    public String getOperator() { return operator; }
    public String getRight() { return right; }

    @Override
    public String toString() {
        return "FilterExpressionNode{" +
                "left='" + left + '\'' +
                ", operator='" + operator + '\'' +
                ", right='" + right + '\'' +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}