package Ast.function;

import Ast.Node;
import Ast.statements.StatementNode;

import java.beans.Statement;
import java.util.List;

public class FunctionBodyNode extends Node {
    private List<StatementNode> statements;

    public FunctionBodyNode(List<StatementNode> statements) {
        this.statements = statements;
    }

    @Override
    public String toString() {
        return "FunctionBodyNode{" +
                "statements=" + statements +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
