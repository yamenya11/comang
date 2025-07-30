package Ast.expressions;

import Ast.Node;


public class LambdaExprExpressionNode extends LambdaExprNode {
    private Node expressionBody;

    public LambdaExprExpressionNode(ParametersNode parameters, Node expressionBody) {
        super(parameters);
        this.expressionBody = expressionBody;
    }

    public Node getExpressionBody() {
        return expressionBody;
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }

    @Override
    public String toString() {
        return "LambdaExprExpressionNode(" + parameters + " => " + expressionBody + ")";
    }
}
