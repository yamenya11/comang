package Ast.types;

public class OnInitNode extends BaseValueNode {


    private final String value;

    public OnInitNode(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "OnInitNode{}";
    }
}
