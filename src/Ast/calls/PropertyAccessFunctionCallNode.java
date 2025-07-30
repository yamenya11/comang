package Ast.calls;

import Ast.Node;
import Ast.expressions.ExpressionNode;
import java.util.List;

public class PropertyAccessFunctionCallNode extends Node {
    private String objectName;    // في حالتك ROUTER_MODULE مثلا
    private String functionName;  // IDENTIFIER بعد DOT
    private List<ExpressionNode> arguments;

    public PropertyAccessFunctionCallNode(String objectName, String functionName, List<ExpressionNode> arguments) {
        this.objectName = objectName;
        this.functionName = functionName;
        this.arguments = arguments;
    }

    public String getObjectName() {
        return objectName;
    }

    public String getFunctionName() {
        return functionName;
    }

    public List<ExpressionNode> getArguments() {
        return arguments;
    }

    @Override
    public String toString() {
        return "PropertyAccessFunctionCallNode{" +
                "objectName='" + objectName + '\'' +
                ", functionName='" + functionName + '\'' +
                ", arguments=" + arguments +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
