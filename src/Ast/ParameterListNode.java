package Ast;

import Ast.methods.ParameterNode;

import java.util.List;

public class ParameterListNode extends Node {
    private List<ParameterNode> parameters;

    public ParameterListNode(List<ParameterNode> parameters) {
        this.parameters = parameters;
    }

    public List<ParameterNode> getParameters() {
        return parameters;
    }

    @Override
    public String toString() {
        return "ParameterListNode{" + "parameters=" + parameters + '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
