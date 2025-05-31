package Ast.declarations;

import Ast.Node;

public class ExtendClauseNode extends Node {
    private final String superClassName;

    public ExtendClauseNode(String superClassName) {
        this.superClassName = superClassName;
    }

    public String getSuperClassName() {
        return superClassName;
    }

    @Override
    public String toString() {
        return "ExtendClauseNode { superClass = '" + superClassName + "' }";
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
