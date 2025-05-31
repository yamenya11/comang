package Ast.html.attrbute;

import Ast.Node;

public class NgIfNode  extends AngularAttributeNode {

    private Node condition;
    private Node body;

    public NgIfNode(Node condition, Node body) {
        super("*ngIf", condition.toString());
        this.condition = condition;
        this.body = body;
    }

    public Node getCondition() {
        return condition;
    }

    public Node getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "NgIfNode{condition=" + condition + ", body=" + body + "}";
    }
}
