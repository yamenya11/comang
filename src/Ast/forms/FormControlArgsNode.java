package Ast.forms;

import Ast.Node;
import java.util.List;

public class FormControlArgsNode extends Node {
    private final String initialValue;
    private final List<ValidatorNode> validators;

    public FormControlArgsNode(String initialValue, List<ValidatorNode> validators) {
        this.initialValue = initialValue;
        this.validators = validators;
    }

    // Getters
    public String getInitialValue() {
        return initialValue;
    }

    public List<ValidatorNode> getValidators() {
        return validators;
    }

    @Override
    public String toString() {
        return "new FormControl(" + initialValue +
                (validators.isEmpty() ? "" : ", " + validators) + ")";
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }

}