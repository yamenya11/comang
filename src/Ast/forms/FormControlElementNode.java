package Ast.forms;

import Ast.Node;
import Ast.html.attrbute.HtmlAttributeNode;

import java.util.ArrayList;
import java.util.List;

public class FormControlElementNode extends Node {
    private String tagName;
    private List<HtmlAttributeNode> attributes = new ArrayList<>();

    public FormControlElementNode(String tagName) {
        this.tagName = tagName;
    }

    public void addAttribute(HtmlAttributeNode attr) {
        attributes.add(attr);
    }

    public String getTagName() {
        return tagName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<").append(tagName);

        for (HtmlAttributeNode attr : attributes) {
            sb.append(" ").append(attr);
        }

        if ("input".equals(tagName) || "img".equals(tagName)) {
            sb.append(" />");
        } else {
            sb.append("></").append(tagName).append(">");
        }

        return sb.toString();
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
