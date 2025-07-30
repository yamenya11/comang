package Ast.expressions;

import Ast.Node;

public class ThisExprNode extends Node {

    public ThisExprNode() {
        // constructor empty for 'this' expression
    }

    @Override
    public String toString() {
        return "ThisExprNode{}";
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
