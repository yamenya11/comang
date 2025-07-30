package Ast.types;

public class FormControlValueNode extends BaseValueNode {

    private final String value;

    public FormControlValueNode(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "FormControlValueNode{value='FormControl'}";
    }
}
