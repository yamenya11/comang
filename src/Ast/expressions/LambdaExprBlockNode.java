package Ast.expressions;

import Ast.Node;
import Ast.expressions.LambdaExprNode;
import Ast.expressions.ParametersNode;
import Ast.statements.StatementNode;

import java.util.List;


public class LambdaExprBlockNode extends LambdaExprNode {
    private List<StatementNode> bodyStatements;

    public LambdaExprBlockNode(ParametersNode parameters, List<StatementNode> bodyStatements) {
        super(parameters);
        this.bodyStatements = bodyStatements;
    }

    public List<StatementNode> getBodyStatements() {
        return bodyStatements;
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }

    @Override
    public String toString() {
        return "LambdaExprBlockNode(" + parameters + " => BlockStatements" + bodyStatements + ")";
    }
}
