package Ast.methods;

import Ast.Node;
import Ast.expressions.ExpressionNode;
import java.util.List;

public class GetProductMethodNode extends Node {
    private List<ExpressionNode> elementList;
    private ExpressionNode returnValue;

    public GetProductMethodNode(List<ExpressionNode> elementList) {
        this.elementList = elementList;
    }

    public GetProductMethodNode(ExpressionNode returnValue) {
        this.returnValue = returnValue;
    }

    public List<ExpressionNode> getElementList() {
        return elementList;
    }

    public ExpressionNode getReturnValue() {
        return returnValue;
    }

    @Override
    public String toString() {
        return "GetProductMethodNode{" +
                "elementList=" + elementList +
                ", returnValue=" + returnValue +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
