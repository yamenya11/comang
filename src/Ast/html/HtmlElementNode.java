// تعديل الكلاس
package Ast.html;

import Ast.Node;
import Ast.html.attrbute.HtmlAttributeNode;

import java.util.ArrayList;
import java.util.List;

public abstract class HtmlElementNode extends Node {

    protected String tagName;
    protected List<HtmlAttributeNode> attributes = new ArrayList<>();
    protected List<Node> children = new ArrayList<>();


    public String getTagName() {
        return tagName;
    }

    public void addAttribute(HtmlAttributeNode attr) {
        attributes.add(attr);
    }

    public List<HtmlAttributeNode> getAttributes() {
        return attributes;
    }

    public void addChild(Node child) {
        children.add(child);
    }

    public List<Node> getChildren() {
        return children;
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
