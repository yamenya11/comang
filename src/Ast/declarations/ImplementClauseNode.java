package Ast.declarations;

import Ast.Node;

import java.util.List;

public class ImplementClauseNode  extends Node {
    private final List<String> interfaceNames;

    public ImplementClauseNode(List<String> interfaceNames) {
        this.interfaceNames = interfaceNames;
    }

    public List<String> getInterfaceNames() {
        return interfaceNames;
    }

    @Override
    public String toString() {
        return "ImplementClauseNode { interfaces = " + interfaceNames + " }";
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
