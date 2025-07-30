package Ast.forms;

import Ast.Node;

public class FormControlFieldNode extends Node {
    private final String name;
    private final FormControlArgsNode init;

    public FormControlFieldNode(String name, FormControlArgsNode init) {
        this.name = name;
        this.init = init;
    }

    @Override
    public String toString() {
        return name + ": " + init;
    }

    // Getters
    public String getName() {
        return name;
    }

    public FormControlArgsNode getInit() {
        return init;
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}