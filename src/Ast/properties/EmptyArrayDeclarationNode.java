package Ast.properties;

import Ast.Node;

public class EmptyArrayDeclarationNode extends Node {
    private final String name;
    private final String type;

    public EmptyArrayDeclarationNode(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() { return name; }
    public String getType() { return type; }

    @Override
    public String toString() {
        return "EmptyArrayDeclarationNode{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
