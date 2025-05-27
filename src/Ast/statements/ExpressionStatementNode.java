package Ast.statements;

import Ast.Node;

public class ExpressionStatementNode extends StatementNode {
    private Node expression;

    public ExpressionStatementNode(Node expression) {
        super(expression);
      //  this.expression = expression;
    }

    public Node getExpression() {
        return expression;
    }

    @Override
    public String toString() {
        return "ExpressionStatementNode{" +
                "expression=" + expression +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
