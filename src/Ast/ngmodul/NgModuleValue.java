package Ast.ngmodul;

import Ast.Node;

public class NgModuleValue extends Node {
    private String value;

    public NgModuleValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }


    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}