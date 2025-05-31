package Ast.html.attrbute;

import Ast.Node;
import Ast.expressions.ExpressionNode;

public class NgForNode  extends AngularAttributeNode {

    private String itemVar;
    private Node expressionNode;

    public NgForNode(String itemVar, Node expressionNode) {
        super("*ngFor", expressionNode.toString());  // أو القيمة المناسبة
        this.itemVar = itemVar;
        this.expressionNode = expressionNode;
    }

    public String getItemVar() {
        return itemVar;
    }

    public Node getExpressionNode() {
        return expressionNode;
    }

    @Override
    public String toString() {
        return "NgForNode{itemVar='" + itemVar + "', expression=" + expressionNode + "}";
    }
}
