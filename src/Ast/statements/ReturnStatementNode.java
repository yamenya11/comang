package Ast.statements;

import Ast.Node;
import Ast.expressions.ExpressionNode;

public class ReturnStatementNode extends Node {
    private final ExpressionNode expression;

    public ReturnStatementNode(ExpressionNode expression) {
        this.expression = expression;
    }

    public ExpressionNode getExpression() {
        return expression;
    }

    @Override
    public String toString() {
        return "ReturnStatementNode{" +
                "expression=" + expression +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
