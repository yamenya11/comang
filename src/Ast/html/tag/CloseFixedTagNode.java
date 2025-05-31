package Ast.html.tag;

import Ast.Node;

public class CloseFixedTagNode extends Node {
    private final String tagName;

    public CloseFixedTagNode(String tagName) {
        this.tagName = tagName;
    }

    @Override
    public String toString() {
        return "CloseFixedTag: </" + tagName + ">";
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
