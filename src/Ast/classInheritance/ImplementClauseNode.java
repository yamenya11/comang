package Ast.classInheritance;

import Ast.Node;
import java.util.List;

public class ImplementClauseNode extends Node {
    private List<String> interfaces;

    public ImplementClauseNode(List<String> interfaces) {
        this.interfaces = interfaces;
    }

    public List<String> getInterfaces() {
        return interfaces;
    }

    public void setInterfaces(List<String> interfaces) {
        this.interfaces = interfaces;
    }

    @Override
    public String toString() {
        return "ImplementClauseNode{" +
                "interfaces=" + interfaces +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
