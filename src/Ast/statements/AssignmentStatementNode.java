package Ast.statements;

import Ast.Node;
import Ast.expressions.ExpressionNode;

public class AssignmentStatementNode extends Node {
    private final String identifier;
    private final ExpressionNode expression;

    public AssignmentStatementNode(String identifier, ExpressionNode expression) {
        this.identifier = identifier;
        this.expression = expression;
    }

    public String getIdentifier() {
        return identifier;
    }

    public ExpressionNode getExpression() {
        return expression;
    }

    @Override
    public String toString() {
        return "AssignmentStatementNode{" +
                "identifier='" + identifier + '\'' +
                ", expression=" + expression +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
