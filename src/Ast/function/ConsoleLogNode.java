package Ast.function;

import Ast.Node;

public class ConsoleLogNode extends Node {

    private Node expression;

    public ConsoleLogNode(Node expression) {
        this.expression = expression;
    }

    public Node getExpression() {
        return expression;
    }

    @Override
    public String toString() {
        return "ConsoleLogNode{" +
                "expression=" + expression +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
