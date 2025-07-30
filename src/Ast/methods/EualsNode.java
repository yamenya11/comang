package Ast.methods;

import Ast.Node;
import java.util.List;

public class EualsNode extends Node {
    private String operator;

    public EualsNode(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}