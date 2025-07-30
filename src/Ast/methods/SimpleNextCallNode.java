package Ast.methods;
import Ast.Node;
import java.util.List;
public class SimpleNextCallNode extends Node {
    private String identifier;
    private Node expression; // ✅ أضف هذا الحقل

    public SimpleNextCallNode(String identifier, Node expression) {
        this.identifier = identifier;
        this.expression = expression;
    }

    public String getIdentifier() {
        return identifier;
    }

    public Node getExpression() {
        return expression;
    }

    @Override
    public String toString() {
        return "SimpleNextCallNode{" +
                "identifier='" + identifier + '\'' +
                ", expression=" + expression +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
