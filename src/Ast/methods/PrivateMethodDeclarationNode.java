package Ast.methods;

import Ast.Node;
import Ast.expressions.ExpressionNode;

public class PrivateMethodDeclarationNode extends Node {
    private String modifier;
    private String methodName;
    private String returnType; // اختياري
    private ExpressionNode returnValue;

    public PrivateMethodDeclarationNode(String modifier, String methodName, String returnType, ExpressionNode returnValue) {
        this.modifier = modifier;
        this.methodName = methodName;
        this.returnType = returnType;
        this.returnValue = returnValue;
    }

    public String getModifier() {
        return modifier;
    }

    public String getMethodName() {
        return methodName;
    }

    public String getReturnType() {
        return returnType;
    }

    public ExpressionNode getReturnValue() {
        return returnValue;
    }

    @Override
    public String toString() {
        return "PrivateMethodDeclarationNode{" +
                "modifier='" + modifier + '\'' +
                ", methodName='" + methodName + '\'' +
                ", returnType='" + returnType + '\'' +
                ", returnValue=" + returnValue +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
