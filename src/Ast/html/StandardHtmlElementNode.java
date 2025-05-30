package Ast.html;

import Ast.Node;
import Ast.html.attrbute.HtmlAttributeNode;

import java.util.List;

public class StandardHtmlElementNode extends HtmlElementNode {
    public StandardHtmlElementNode(String tagName) {
        this.tagName = tagName;
    }

    @Override
    public String toString() {
        return "StandardHtmlElementNode{" +
                "tagName='" + tagName + '\'' +
                ", attributes=" + attributes +
                ", children=" + children +
                '}';
    }
}