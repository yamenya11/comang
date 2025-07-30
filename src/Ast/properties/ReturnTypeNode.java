package Ast.properties;

import Ast.Node;

public class ReturnTypeNode extends Node {
    private String returnType;
    private boolean isVoid;

    public ReturnTypeNode(String returnType, boolean isVoid) {
        this.returnType = returnType;
        this.isVoid = isVoid;
    }

    public String getReturnType() {
        return returnType;
    }

    public boolean isVoid() {
        return isVoid;
    }

    @Override
    public String toString() {
        return "ReturnTypeNode{" +
                "returnType='" + returnType + '\'' +
                ", isVoid=" + isVoid +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
