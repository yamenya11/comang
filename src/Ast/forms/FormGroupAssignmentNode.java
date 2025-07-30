package Ast.forms;

import Ast.Node;

import java.util.List;

public class FormGroupAssignmentNode extends Node {
    private String name;
    private List<FormGroupFieldNode> fields;

    public FormGroupAssignmentNode(String name, List<FormGroupFieldNode> fields) {
        this.name = name;
        this.fields = fields;
    }

    public String getName() {
        return name;
    }

    public List<FormGroupFieldNode> getFields() {
        return fields;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FormGroup ").append(name).append(" {\n");
        for (FormGroupFieldNode field : fields) {
            sb.append("  ").append(field).append(",\n");
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
