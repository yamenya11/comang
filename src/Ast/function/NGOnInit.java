package Ast.function;

import Ast.Node;
import java.util.List;

public class NGOnInit extends Node {
    private String functionName;
    private String returnType;
    private List<Node> bodyStatements;

    public NGOnInit(String functionName, String returnType, List<Node> bodyStatements) {
        this.functionName = functionName;
        this.returnType = returnType;
        this.bodyStatements = bodyStatements;
    }

    public String getFunctionName() {
        return functionName;
    }

    public String getReturnType() {
        return returnType;
    }

    public List<Node> getBodyStatements() {
        return bodyStatements;
    }

    @Override
    public String toString() {
        return "NGOnInit{" +
                "functionName='" + functionName + '\'' +
                ", returnType='" + returnType + '\'' +
                ", bodyStatements=" + bodyStatements +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
