package Ast.statements;

import Ast.Node;
import java.util.List;

public class FunctionBlockNode extends Node {
    private List<Node> statements;

    public FunctionBlockNode(List<Node> statements) {
        this.statements = statements;
    }

    public List<Node> getStatements() {
        return statements;
    }


    @Override
    public String toString() {
        return "FunctionBlockNode{" +
                "statements=" + statements +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
