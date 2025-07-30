package Ast.ngmodul;

import Ast.Node;
import SymbolTable.SymbolType;

public class NgModuleElement extends Node {
    private  String name;
    private SymbolType type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SymbolType getType() {
        return type;
    }

    public void setType(SymbolType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "NgModuleElement{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
