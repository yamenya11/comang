package Ast.html.tag;

import Ast.Node;
import java.util.List;

public class OpenTagNode extends Node {
    private final String tagName;

    public OpenTagNode(String tagName) {
        this.tagName = tagName;

    }

    @Override
    public String toString() {
        return "OpenTag: <" + tagName + " "  + ">";
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
