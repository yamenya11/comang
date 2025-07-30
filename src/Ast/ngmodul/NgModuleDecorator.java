package Ast.ngmodul;

import Ast.Node;

import java.util.List;

public class NgModuleDecorator extends Node {
    String name;
    List<NgModuleProperty> ng;

    public NgModuleDecorator(String name, List<NgModuleProperty> ng) {
        this.name = name;
        this.ng = ng;
    }

    public List<NgModuleProperty> getNg() {
        return ng;
    }

    public void setNg(List<NgModuleProperty> ng) {
        this.ng = ng;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "NgModuleDecorator{" +
                "name='" + name + '\'' +
                ", ng=" + ng +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
