package Ast.properties;

import Ast.Node;
import Ast.expressions.ExpressionNode;

public class RegularPropertyNode extends Node {
    private final String name;
    private final String type;
    private final ExpressionNode initializer;

    public RegularPropertyNode(String name, String type, ExpressionNode initializer) {
        this.name = name;
        this.type = type;
        this.initializer = initializer;
    }

    @Override
    public String toString() {
        return "RegularPropertyNode{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", initializer=" + initializer +
                '}';
    }

    public String getName() { return name; }
    public String getType() { return type; }
    public ExpressionNode getInitializer() { return initializer; }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
