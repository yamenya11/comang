package Ast.statements;

import Ast.Node;

public class ReturnNode extends Node {
    private Node returnExpression;

    public ReturnNode(Node returnExpression) {
        this.returnExpression = returnExpression;
    }

    public Node getReturnExpression() {
        return returnExpression;
    }

    @Override
    public String toString() {
        return "ReturnNode{" +
                "returnExpression=" + returnExpression +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
