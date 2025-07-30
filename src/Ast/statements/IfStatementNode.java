package Ast.statements;

import Ast.Node;
import Ast.expressions.ExpressionNode;
import java.util.List;

public class IfStatementNode extends StatementNode {
    private ExpressionNode condition;
    private List<StatementNode> ifStatements;
    private List<StatementNode> elseStatements;

    public IfStatementNode(ExpressionNode condition, List<StatementNode> ifStatements, List<StatementNode> elseStatements) {
        this.condition = condition;
        this.ifStatements = ifStatements;
        this.elseStatements = elseStatements;
    }

    public ExpressionNode getCondition() {
        return condition;
    }

    public List<StatementNode> getIfStatements() {
        return ifStatements;
    }

    public List<StatementNode> getElseStatements() {
        return elseStatements;
    }

    public void setCondition(ExpressionNode condition) {
        this.condition = condition;
    }

    public void setIfStatements(List<StatementNode> ifStatements) {
        this.ifStatements = ifStatements;
    }

    public void setElseStatements(List<StatementNode> elseStatements) {
        this.elseStatements = elseStatements;
    }

    @Override
    public String toString() {
        return "IfStatementNode{" +
                "condition=" + condition +
                ", ifStatements=" + ifStatements +
                ", elseStatements=" + elseStatements +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
