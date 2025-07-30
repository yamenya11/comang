package Ast;

import java.util.List;

public class BlockNode extends Node {
    private final List<Node> statements;

    public BlockNode(List<Node> statements) {
        this.statements = statements;
    }

    public List<Node> getStatements() {
        return statements;
    }

    @Override
    public String toString() {
        return "{ " + statements + " }";
    }
    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
