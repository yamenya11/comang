package Ast.classInheritance;

import Ast.Node;

public class ExtendClauseNode extends Node {
    private String baseClassName;

    public ExtendClauseNode(String baseClassName) {
        this.baseClassName = baseClassName;
    }

    public String getBaseClassName() {
        return baseClassName;
    }

    public void setBaseClassName(String baseClassName) {
        this.baseClassName = baseClassName;
    }

    @Override
    public String toString() {
        return "ExtendClauseNode{" +
                "baseClassName='" + baseClassName + '\'' +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
