package Ast.properties;

import Ast.Node;

public class TypeSpecNode extends Node {
    private String type;
    private boolean isArray;

    public TypeSpecNode(String type, boolean isArray) {
        this.type = type;
        this.isArray = isArray;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isArray() {
        return isArray;
    }

    public void setArray(boolean array) {
        isArray = array;
    }

    @Override
    public String toString() {
        return "TypeSpecNode{" +
                "type='" + type + '\'' +
                ", isArray=" + isArray +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }

    // Getters, toString, etc.
}
