package Ast.html.tag;

import Ast.Node;

public class FixedTagNode extends Node {
    private final String tagName;

    public FixedTagNode(String tagName) {
        this.tagName = tagName;
    }

    @Override
    public String toString() {
        return "FixedTag: <" + tagName + ">";
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
