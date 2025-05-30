package Ast.html.attrbute;

import Ast.Node;
import Ast.expressions.ExpressionNode;

import java.util.List;

public abstract  class HtmlAttributeNode extends Node {
    protected String name;
    protected String value;

            ;

    public HtmlAttributeNode(String name, String valu) {
        this.name = name;
        this.value = value;

    }





    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
