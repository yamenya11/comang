package Ast.interfacee;

import Ast.Node;

public class PropertyDeclarationNode extends Node {
    private String type;
    private String name;
    private String value;

    public PropertyDeclarationNode(String type, String name, String value) {
        this.type = type;
        this.name = name;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "PropertyDeclarationNode{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }


}
