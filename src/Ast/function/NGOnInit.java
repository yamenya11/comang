package Ast.function;

import Ast.Node;
import Ast.expressions.ExpressionNode;

public class NGOnInit extends Node {
String fun;

ExpressionNode expressionNode;
String isvoid;

    public NGOnInit(String fun, ExpressionNode expressionNode, String isvoid) {
        this.fun = fun;
        this.expressionNode = expressionNode;
        this.isvoid = isvoid;
    }

    @Override
    public String toString() {
        return "NGOnInit{" +
                "fun='" + fun + '\'' +
                ", expressionNode=" + expressionNode +
                ", isvoid='" + isvoid + '\'' +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
