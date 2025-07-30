package Ast.expressions;

import Ast.Node;
import Ast.calls.PropertyAccessNode;

import java.util.ArrayList;
import java.util.List;

public class FunctionCallNode extends ExpressionNode {
    private PropertyAccessNode functionName;
    private List<ExpressionNode> arguments;

    public FunctionCallNode(PropertyAccessNode functionName, List<ExpressionNode> arguments) {
        this.functionName = functionName;
        this.arguments = arguments != null ? arguments : new ArrayList<>();
    }

    public PropertyAccessNode getFunctionName() {
        return functionName;
    }

    public List<ExpressionNode> getArguments() {
        return arguments;
    }

    @Override
    public String toString() {
        return "FunctionCallNode{" +
                "functionName=" + functionName +
                ", arguments=" + arguments +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
