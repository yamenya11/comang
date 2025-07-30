package Ast.forms;

import Ast.Node;

public class ValidatorNode extends Node {
    private final String validatorName;
    private final String arguments;

    public ValidatorNode(String validatorName, String arguments) {
        this.validatorName = validatorName;
        this.arguments = arguments;
    }

    // Getters
    public String getValidatorName() {
        return validatorName;
    }

    public String getArguments() {
        return arguments;
    }

    @Override
    public String toString() {
        return validatorName + (arguments != null ? "(" + arguments + ")" : "");
    }
    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}