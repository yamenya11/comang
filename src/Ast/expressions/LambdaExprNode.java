package Ast.expressions;

import Ast.Node;



import java.util.List;

public abstract class LambdaExprNode extends Node {
    protected ParametersNode parameters;

    public LambdaExprNode(ParametersNode parameters) {
        this.parameters = parameters;
    }

    public ParametersNode getParameters() {
        return parameters;
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }


}
