package Ast.ngmodul;

import Ast.Node;
import Ast.expressions.FunctionCallNode;

public class NgModuleFunctionCallNode extends NgModuleValue {
    private FunctionCallNode functionCall;

    public NgModuleFunctionCallNode(FunctionCallNode functionCall) {
        super(functionCall.getFunctionName().getProperty());
        this.functionCall = functionCall;
    }

    public FunctionCallNode getFunctionCall() {
        return functionCall;
    }

    @Override
    public String toString() {
        return "NgModuleFunctionCallNode{" +
                "functionCall=" + functionCall +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
