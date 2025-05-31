package Ast.statements;

import Ast.expressions.ExpressionNode;

import java.util.List;

public class ForLoopStatementNode extends StatementNode {
    private String variableName;
    private ExpressionNode initExpression;
    private ExpressionNode condition;
    private String updateOperation;
    private List<StatementNode> body;

    public ForLoopStatementNode(String variableName, ExpressionNode initExpression, ExpressionNode condition,
                                String updateOperation, List<StatementNode> body) {
        this.variableName = variableName;
        this.initExpression = initExpression;
        this.condition = condition;
        this.updateOperation = updateOperation;
        this.body = body;
    }

    public String getVariableName() { return variableName; }
    public ExpressionNode getInitExpression() { return initExpression; }
    public ExpressionNode getCondition() { return condition; }
    public String getUpdateOperation() { return updateOperation; }
    public List<StatementNode> getBody() { return body; }

    @Override
    public String toString() {
        return "ForLoopStatementNode{" +
                "variableName='" + variableName + '\'' +
                ", initExpression=" + initExpression +
                ", condition=" + condition +
                ", updateOperation='" + updateOperation + '\'' +
                ", body=" + body +
                '}';
    }


}
