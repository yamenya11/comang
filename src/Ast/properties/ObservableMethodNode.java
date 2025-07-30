package Ast.properties;

import Ast.Node;
import Ast.expressions.ExpressionNode;

import java.util.List;

public class ObservableMethodNode extends Node {
    private String name;
    private List<ExpressionNode> arguments;

    public ObservableMethodNode(String name, List<ExpressionNode> arguments) {
        this.name = name;
        this.arguments = arguments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ExpressionNode> getArguments() {
        return arguments;
    }

    public void setArguments(List<ExpressionNode> arguments) {
        this.arguments = arguments;
    }

    @Override
    public String toString() {
        return "ObservableMethodNode{" +
                "name='" + name + '\'' +
                ", arguments=" + arguments +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }

    // Getters, toString, etc.
}
