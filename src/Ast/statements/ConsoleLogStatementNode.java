package Ast.statements;

import Ast.Node;
import Ast.expressions.ExpressionNode;
import java.util.List;

public class ConsoleLogStatementNode extends Node {
    private List<ExpressionNode> arguments;

    public ConsoleLogStatementNode(List<ExpressionNode> arguments) {
        this.arguments = arguments;
    }

    public List<ExpressionNode> getArguments() {
        return arguments;
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }

    @Override
    public String toString() {
        return "ConsoleLogStatementNode{" +
                "arguments=" + arguments +
                '}';
    }
}
