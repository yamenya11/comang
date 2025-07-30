package Ast.statements;

import Ast.Node;

public class FormGroupInitializationNode extends StatementNode {
    private final String identifier;
    private final Node formGroup;

    public FormGroupInitializationNode(String identifier, Node formGroup) {
        this.identifier = identifier;
        this.formGroup = formGroup;
    }

    public String getIdentifier() {
        return identifier;
    }

    public Node getFormGroup() {
        return formGroup;
    }

    @Override
    public String toString() {
        return "FormGroupInitializationNode{" +
                "identifier='" + identifier + '\'' +
                ", formGroup=" + formGroup +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
