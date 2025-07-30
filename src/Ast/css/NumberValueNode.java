package Ast.css;

public class NumberValueNode extends ValueNode {
    public final String number;
    public final String unit; // يمكن أن تكون null

    public NumberValueNode(String number, String unit) {
        this.number = number;
        this.unit = unit;
    }


    @Override
    public String toString() {
        return "NumberValueNode{" +
                "number='" + number + '\'' +
                ", unit='" + unit + '\'' +
                '}';
    }
}