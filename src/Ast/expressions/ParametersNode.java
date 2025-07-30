package Ast.expressions;

import Ast.Node;
import Ast.methods.ParameterNode;

import java.util.List;

public class ParametersNode extends Node {
    private List<ParameterNode> parameters;

    public ParametersNode(List<ParameterNode> parameters) {
        this.parameters = parameters;
    }

    public List<ParameterNode> getParameters() {
        return parameters;
    }

    @Override
    public String toString() {
        return "(" + parameters + ")";
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}