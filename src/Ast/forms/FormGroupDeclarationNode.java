package Ast.forms;

import Ast.Node;

public class FormGroupDeclarationNode extends Node {
    private String name;
    private Node elementList;

    public FormGroupDeclarationNode(String name, Node elementList) {
        this.name = name;
        this.elementList = elementList;
    }

    public String getName() {
        return name;
    }

    public Node getElementList() {
        return elementList;
    }

    @Override
    public String toString() {
        return "FormGroupDeclarationNode{" +
                "name='" + name + '\'' +
                ", elementList=" + elementList +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
