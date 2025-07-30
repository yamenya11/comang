package Ast.forms;

import Ast.Node;

public class AddProductFunctionNode extends Node {
    private Node functionBody;

    public AddProductFunctionNode(Node functionBody) {
        this.functionBody = functionBody;
    }

    public Node getFunctionBody() {
        return functionBody;
    }

    public void setFunctionBody(Node functionBody) {
        this.functionBody = functionBody;
    }

    @Override
    public String toString() {
        return "AddProductFunctionNode{" +
                "functionBody=" + functionBody +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
