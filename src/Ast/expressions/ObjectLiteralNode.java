package Ast.expressions;


import Ast.Node;

import java.util.Map;

public class ObjectLiteralNode extends Node {
    public Map<String, Node> properties;

    public ObjectLiteralNode(Map<String, Node> properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return properties.toString();
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
