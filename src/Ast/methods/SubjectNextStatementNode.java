package Ast.methods;
import Ast.Node;
import java.util.List;
public class SubjectNextStatementNode extends Node {
    private Node propertyAccess;
    private Node spreadExpression;

    public SubjectNextStatementNode(Node propertyAccess, Node spreadExpression) {
        this.propertyAccess = propertyAccess;
        this.spreadExpression = spreadExpression;
    }

    public Node getPropertyAccess() { return propertyAccess; }
    public Node getSpreadExpression() { return spreadExpression; }

    @Override
    public String toString() {
        return "SubjectNextStatementNode{" +
                "propertyAccess=" + propertyAccess +
                ", spreadExpression=" + spreadExpression +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}