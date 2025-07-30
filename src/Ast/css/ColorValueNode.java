package Ast.css;


public class ColorValueNode extends ValueNode {
    public final String color;

    public ColorValueNode(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "ColorValueNode{" +
                "color='" + color + '\'' +
                '}';
    }
}
