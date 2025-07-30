package Ast.application;

import Ast.Node;

public class KeyImportNode extends Node {
    private final String key;

    public KeyImportNode(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }

    @Override
    public String toString() {
        return "KeyImportNode{" +
                "key='" + key + '\'' +
                '}';
    }
}
