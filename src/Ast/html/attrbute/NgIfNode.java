package Ast.html.attrbute;

public class NgIfNode  extends AngularAttributeNode {

    public NgIfNode(String expression) {
        super("*ngIf", expression);
    }

    @Override
    public String toString() {
        return "NgIfNode{expression='" + value + "'}";
    }
}
