package Ast.methods;

import Ast.Node;
import java.util.List;

public class FilterAssignmentNode extends Node {
    private String name;
    private Node filterExpression;

    public FilterAssignmentNode(String name, Node filterExpression) {
        this.name = name;
        this.filterExpression = filterExpression;
    }

    public String getName() { return name; }
    public Node getFilterExpression() { return filterExpression; }

    @Override
    public String toString() {
        return "FilterAssignmentNode{" +
                "name='" + name + '\'' +
                ", filterExpression=" + filterExpression +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}