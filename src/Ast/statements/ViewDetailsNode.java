package Ast.statements;

import Ast.Node;

public class ViewDetailsNode extends Node {
    private Node idParameter;
    private Node functionCall;

    public ViewDetailsNode(Node idParameter, Node functionCall) {
        this.idParameter = idParameter;
        this.functionCall = functionCall;
    }

    public Node getIdParameter() {
        return idParameter;
    }

    public Node getFunctionCall() {
        return functionCall;
    }

    @Override
    public String toString() {
        return "ViewDetailsNode{" +
                "idParameter=" + idParameter +
                ", functionCall=" + functionCall +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
