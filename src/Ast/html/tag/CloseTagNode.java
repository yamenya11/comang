package Ast.html.tag;

import Ast.Node;

public class CloseTagNode extends Node {
    private final String tagName;

    public CloseTagNode(String tagName) {
        this.tagName = tagName;
    }

    @Override
    public String toString() {
        return "CloseTag: </" + tagName + ">";
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
