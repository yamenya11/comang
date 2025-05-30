package Ast.html.attrbute;

import Ast.expressions.ExpressionNode;

public class NgForNode  extends AngularAttributeNode {

    public NgForNode(String expres) {
        super("*ngFor",expres);
    }

    @Override
    public String toString() {
        return "NgForNode{expression='" + value + "'}";
    }
}
