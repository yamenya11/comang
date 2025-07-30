package Ast.calls;

import Ast.Node;
import Ast.expressions.ExpressionNode;
import java.util.List;


public class LambdaExpressionNode extends Node {
    private List<String> parameters;
    private Node expressionBody;        // body إن كان تعبير واحد
    private List<Node> blockBody;       // body إن كان بلوك من جمل (statements)

    // constructor للتعبير الواحد
    public LambdaExpressionNode(List<String> parameters, Node expressionBody) {
        this.parameters = parameters;
        this.expressionBody = expressionBody;
        this.blockBody = null;
    }

    // constructor للبلوك
    public LambdaExpressionNode(List<String> parameters, List<Node> blockBody) {
        this.parameters = parameters;
        this.blockBody = blockBody;
        this.expressionBody = null;
    }

    public List<String> getParameters() {
        return parameters;
    }

    public Node getExpressionBody() {
        return expressionBody;
    }

    public List<Node> getBlockBody() {
        return blockBody;
    }

    @Override
    public String toString() {
        if (expressionBody != null) {
            return "LambdaExpression(" + parameters + ") => " + expressionBody;
        } else {
            return "LambdaExpression(" + parameters + ") => Block" + blockBody;
        }
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}

