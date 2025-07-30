package Ast.methods;

import Ast.Node;

import java.util.List;

public class ServiceCallNode extends Node {

    private List<Node> propertyAccessChain;
    private List<Node> argumentList;

    public ServiceCallNode(List<Node> propertyAccessChain, List<Node> argumentList) {
        this.propertyAccessChain = propertyAccessChain;
        this.argumentList = argumentList;
    }

    public List<Node> getPropertyAccessChain() {
        return propertyAccessChain;
    }

    public void setPropertyAccessChain(List<Node> propertyAccessChain) {
        this.propertyAccessChain = propertyAccessChain;
    }

    public List<Node> getArgumentList() {
        return argumentList;
    }

    public void setArgumentList(List<Node> argumentList) {
        this.argumentList = argumentList;
    }

    @Override
    public String toString() {
        return "ServiceCallNode{" +
                "propertyAccessChain=" + propertyAccessChain +
                ", argumentList=" + argumentList +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
