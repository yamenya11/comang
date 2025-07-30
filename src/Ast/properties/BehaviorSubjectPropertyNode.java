package Ast.properties;

import Ast.Node;
import Ast.expressions.ExpressionNode;

public class BehaviorSubjectPropertyNode extends Node {
    private final boolean isPrivate;
    private final String name;
    private final String genericType;
    private final ExpressionNode initialValue;

    public BehaviorSubjectPropertyNode(boolean isPrivate, String name, String genericType, ExpressionNode initialValue) {
        this.isPrivate = isPrivate;
        this.name = name;
        this.genericType = genericType;
        this.initialValue = initialValue;
    }

    public boolean isPrivate() { return isPrivate; }
    public String getName() { return name; }
    public String getGenericType() { return genericType; }
    public ExpressionNode getInitialValue() { return initialValue; }

    @Override
    public String toString() {
        return "BehaviorSubjectPropertyNode{" +
                "isPrivate=" + isPrivate +
                ", name='" + name + '\'' +
                ", genericType='" + genericType + '\'' +
                ", initialValue=" + initialValue +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
