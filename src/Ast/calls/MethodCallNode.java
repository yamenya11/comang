package Ast.calls;

import Ast.Node;
import java.util.List;

public class MethodCallNode extends Node {
    private Node caller;
    private List<Node> arguments;

    public MethodCallNode(Node caller, List<Node> arguments) {
        this.caller = caller;
        this.arguments = arguments;
    }

    public Node getCaller() { return caller; }
    public List<Node> getArguments() { return arguments; }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
