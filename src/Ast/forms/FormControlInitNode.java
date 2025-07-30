package Ast.forms;

import Ast.Node;

import java.util.List;

public class FormControlInitNode extends Node {
    private String initialValue;  // مثال: "fqwd"
    private List<String> validators; // مثال: ["Validators.required", "Validators.min(0)"]

    public FormControlInitNode(String initialValue, List<String> validators) {
        this.initialValue = initialValue;
        this.validators = validators;
    }

    public String getInitialValue() {
        return initialValue;
    }

    public List<String> getValidators() {
        return validators;
    }

    public String getValidatorsAsString() {
        return validators.isEmpty() ? "" : "[" + String.join(", ", validators) + "]";
    }

    @Override
    public String toString() {
        if (validators.isEmpty()) {
            return String.format("new FormControl(%s)",
                    initialValue.isEmpty() ? "" : initialValue);
        }
        return String.format("new FormControl(%s, %s)",
                initialValue, getValidatorsAsString());
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
