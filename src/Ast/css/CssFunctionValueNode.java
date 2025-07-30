package Ast.css;

public class CssFunctionValueNode extends ValueNode {
    public final String functionName;
    public final ValueNode argument;

    public CssFunctionValueNode(String functionName, ValueNode argument) {
        this.functionName = functionName;
        this.argument = argument;
    }


    @Override
    public String toString() {
        return "CssFunctionValueNode{" +
                "functionName='" + functionName + '\'' +
                ", argument=" + argument +
                '}';
    }
}
