package Ast.methods;
import Ast.Node;
import java.util.List;
public class SubjectFilterStatementNode extends Node {
    private Node propertyAccessChainNode;
    private Node filterExpressionNode;

    public SubjectFilterStatementNode(Node propertyAccessChainNode, Node filterExpressionNode) {
        this.propertyAccessChainNode = propertyAccessChainNode;
        this.filterExpressionNode = filterExpressionNode;
    }

    public Node getPropertyAccessChainNode() {
        return propertyAccessChainNode;
    }

    public Node getFilterExpressionNode() {
        return filterExpressionNode;
    }

    @Override
    public String toString() {
        return "SubjectFilterStatementNode{" +
                "propertyAccessChainNode=" + propertyAccessChainNode +
                ", filterExpressionNode=" + filterExpressionNode +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}