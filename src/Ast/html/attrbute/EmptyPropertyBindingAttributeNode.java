package Ast.html.attrbute;

import Ast.Node;

public class EmptyPropertyBindingAttributeNode extends Node {
    private final String attributeName;

    public EmptyPropertyBindingAttributeNode(String attributeName) {
        this.attributeName = attributeName;
    }

    @Override
    public String toString() {
        return "EmptyPropertyBinding{" + attributeName + '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
