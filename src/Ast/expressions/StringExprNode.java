package Ast.expressions;

import Ast.Node;

public class StringExprNode extends Node {
    private String value;

    public StringExprNode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "StringExprNode{" +
                "value='" + value + '\'' +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
