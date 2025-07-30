package Ast.methods;

import Ast.Node;
import Ast.statements.StatementNode;

import java.util.List;

public class MethodDeclarationNode extends Node {
    private final String methodName;
    private final List<ParameterNode> parameters;
    private final String returnType;
    private final List<StatementNode> body;

    public MethodDeclarationNode(String methodName, List<ParameterNode> parameters, String returnType, List<StatementNode> body) {
        this.methodName = methodName;
        this.parameters = parameters;
        this.returnType = returnType;
        this.body = body;
    }

    public String getMethodName() {
        return methodName;
    }

    public List<ParameterNode> getParameters() {
        return parameters;
    }

    public String getReturnType() {
        return returnType;
    }

    public List<StatementNode> getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "MethodDeclarationNode{" +
                "methodName='" + methodName + '\'' +
                ", parameters=" + parameters +
                ", returnType='" + returnType + '\'' +
                ", body=" + body +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
