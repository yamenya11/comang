package Ast.expressions;

import Ast.Node;
import java.util.List;
import java.util.ArrayList;

public class ArgumentListNode extends Node {
    private List<Node> arguments;  // قائمة التعبيرات (expressions) أو الـ Nodes للوسائط

    public ArgumentListNode() {
        this.arguments = new ArrayList<>();
    }

    public ArgumentListNode(List<Node> arguments) {
        this.arguments = arguments;
    }

    public List<Node> getArguments() {
        return arguments;
    }

    public void setArguments(List<Node> arguments) {
        this.arguments = arguments;
    }

    public void addArgument(Node argument) {
        this.arguments.add(argument);
    }

    @Override
    public String toString() {
        return "ArgumentListNode{" +
                "arguments=" + arguments +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
