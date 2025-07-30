package Ast.expressions;

import Ast.Node;

public class UnaryFormGroupNode extends ExpressionNode {
    private final String operator; // مثلاً "!"
    private final String formGroupType; // دائماً "FormGroup"

    public UnaryFormGroupNode(String operator, String formGroupType) {
        this.operator = operator;
        this.formGroupType = formGroupType;
    }

    public String getOperator() {
        return operator;
    }

    public String getFormGroupType() {
        return formGroupType;
    }

    @Override
    public String toString() {
        return operator + formGroupType;
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
