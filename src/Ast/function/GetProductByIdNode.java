package Ast.function;

import Ast.Node;

import java.util.List;

public class GetProductByIdNode extends Node {
    String name;
List<Node>Idparameter;
List<Node>returnType;
    Node returnExpression;


    public GetProductByIdNode(String name, Node returnExpression, List<Node> idparameter, List<Node> returnType) {
        this.name = name;
        this.returnExpression = returnExpression;
        Idparameter = idparameter;
        this.returnType = returnType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<Node> getReturnType() {
        return returnType;
    }

    public void setReturnType(List<Node> returnType) {
        this.returnType = returnType;
    }

    public List<Node> getIdparameter() {
        return Idparameter;
    }

    public void setIdparameter(List<Node> idparameter) {
        Idparameter = idparameter;
    }

    @Override
    public String toString() {
        return "GetProductByIdNode{" +
                "name='" + name + '\'' +
                ", Idparameter=" + Idparameter +
                ", returnType=" + returnType +
                ", returnExpression=" + returnExpression +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
