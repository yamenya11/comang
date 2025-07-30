package Ast.forms;

import Ast.Node;

import java.util.List;

public class FormGroupBodyNode extends Node {
    private List<FormControlFieldNode> controls;

    public FormGroupBodyNode(List<FormControlFieldNode> controls) {
        this.controls = controls;
    }

    public List<FormControlFieldNode> getControls() {
        return controls;
    }

    public void setControls(List<FormControlFieldNode> controls) {
        this.controls = controls;
    }

    @Override
    public String toString() {
        return "FormGroupBodyNode{" +
                "controls=" + controls +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
