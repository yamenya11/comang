package Ast.methods;

import Ast.Node;
import java.util.List;

public class MethodBodyNode extends Node {
    private List<Node> statements;

    public MethodBodyNode(List<Node> statements) {
        this.statements = statements;
    }

    public List<Node> getStatements() {
        return statements;
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
