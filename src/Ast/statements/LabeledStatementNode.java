package Ast.statements;

import Ast.Node;

public class LabeledStatementNode extends Node {
    private final String label;
    private final Node statement;

    public LabeledStatementNode(String label, Node statement) {
        this.label = label;
        this.statement = statement;
    }

    public String getLabel() {
        return label;
    }

    public Node getStatement() {
        return statement;
    }

    @Override
    public String toString() {
        return "LabeledStatementNode{" +
                "label='" + label + '\'' +
                ", statement=" + statement +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
