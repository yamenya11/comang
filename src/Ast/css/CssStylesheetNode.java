package Ast.css;

import Ast.Node;

import java.util.List;

public class CssStylesheetNode extends CssNode {
    public final List<Node> rules;
    public CssStylesheetNode(List<Node> rules) { this.rules = rules; }


    @Override
    public String toString() {
        return "CssStylesheetNode{" +
                "rules=" + rules +
                '}';
    }
}
