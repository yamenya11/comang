package Ast.types;

import Ast.Node;

public abstract class BaseValueNode extends Node {
    public abstract String getValue();

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}