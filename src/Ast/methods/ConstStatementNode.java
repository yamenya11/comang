package Ast.methods;
import Ast.Node;
import java.util.List;
public class ConstStatementNode extends Node {
    private String identifier;
    private Node propertyAccessNode;

    public ConstStatementNode(String identifier, Node propertyAccessNode) {
        this.identifier = identifier;
        this.propertyAccessNode = propertyAccessNode;
    }

    public String getIdentifier() {
        return identifier;
    }

    public Node getPropertyAccessNode() {
        return propertyAccessNode;
    }

    @Override
    public String toString() {
        return "ConstStatementNode{" +
                "identifier='" + identifier + '\'' +
                ", propertyAccessNode=" + propertyAccessNode +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}