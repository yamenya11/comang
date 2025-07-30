package Ast.forms;

import Ast.Node;
import Ast.html.attrbute.HtmlAttributeNode;
import java.util.ArrayList;
import java.util.List;

public class FormElementNode extends Node {
    private List<HtmlAttributeNode> attributes = new ArrayList<>();
    private List<Node> children = new ArrayList<>();
    private List<FormControlElementNode> formControls = new ArrayList<>(); // قائمة خاصة بعناصر التحكم

    public void addAttribute(HtmlAttributeNode attr) {
        attributes.add(attr);
    }

    // إضافة عنصر تحكم إلى القائمة الخاصة
    public void addFormControl(FormControlElementNode control) {
        formControls.add(control);
        children.add(control); // إضافته أيضًا إلى القائمة العامة للأطفال
    }

    // إضافة أي عنصر آخر
    public void addChild(Node child) {
        children.add(child);
    }

    public List<FormControlElementNode> getFormControls() {
        return formControls;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<form");

        for (HtmlAttributeNode attr : attributes) {
            sb.append(" ").append(attr);
        }

        sb.append(">");

        for (Node child : children) {
            sb.append(child.toString());
        }

        sb.append("</form>");
        return sb.toString();
    }



    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}