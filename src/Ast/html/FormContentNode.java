package Ast.html;

import Ast.Node;

import java.util.List;

public class FormContentNode extends Node {
    private List<FormField> fields;

    public FormContentNode(List<FormField> fields) {
        this.fields = fields;
    }

    public List<FormField> getFields() {
        return fields;
    }

    @Override
    public String toString() {
        return "FormContentNode{" +
                "fields=" + fields +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
