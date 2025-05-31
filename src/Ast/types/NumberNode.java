package Ast.types;

public class NumberNode extends BaseValueNode {
    private String number;

    public NumberNode(String number) {
        this.number = number;
    }

    @Override
    public String getValue() {
        return number;
    }

    @Override
    public String toString() {
        return "NumberNode{" + "number='" + number + '\'' + '}';
    }
}
