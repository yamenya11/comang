package Ast.forms;

import Ast.Node;

public class FormGroupFieldNode extends Node {
    private String name;
    private FormControlInitNode controlInit;

    public FormGroupFieldNode(String name, FormControlInitNode controlInit) {
        this.name = name;
        this.controlInit = controlInit;
    }

    public String getName() {
        return name;
    }

    public FormControlInitNode getControlInit() {
        return controlInit;
    }
    @Override
    public String toString() {
        return String.format("%s: %s", name, controlInit);
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
