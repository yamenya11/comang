package Ast.html;

import Ast.Node;
import java.util.List;
import java.util.ArrayList;

public class FixedHtmlElementNode extends HtmlElementNode {
    public FixedHtmlElementNode(String tagName) {
        this.tagName = tagName;
    }

    @Override
    public String toString() {
        return "FixedHtmlElementNode{" +
                "tagName='" + tagName + '\'' +
                ", attributes=" + attributes +
                ", children=" + children +
                '}';
    }
}
