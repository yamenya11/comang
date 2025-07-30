package Ast.types;

public class FormGroupValueNode extends BaseValueNode {

    private final String value;

    public FormGroupValueNode(String value) {
        this.value = value;
    }


    @Override
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "FormGroupValueNode{value='FormGroup'}";
    }
}
