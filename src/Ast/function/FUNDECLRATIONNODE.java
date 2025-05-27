package Ast.function;

import Ast.Node;
import Ast.methods.ParameterNode;

import java.util.List;

public class FUNDECLRATIONNODE extends Node {

    private String functionName;
    private List<ParameterNode> parameters;
    private String returnType;
    private FunctionBodyNode body;

    public FUNDECLRATIONNODE(String functionName, List<ParameterNode> parameters, String returnType, FunctionBodyNode body) {

        this.functionName = functionName;
        this.parameters = parameters;
        this.returnType = returnType;
        this.body = body;
    }

    @Override
    public String toString() {
        return "FUNDECLRATIONNODE{" +
                "functionName='" + functionName + '\'' +
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
