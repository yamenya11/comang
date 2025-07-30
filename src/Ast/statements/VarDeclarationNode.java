package Ast.statements;

import Ast.Node;
import Ast.expressions.ExpressionNode;

public class VarDeclarationNode extends StatementNode {
    private final String identifier;
    private final ExpressionNode expression;

    public VarDeclarationNode(String identifier, ExpressionNode expression) {
        this.identifier = identifier;
        this.expression = expression;
    }

    public String getIdentifier() {
        return identifier;
    }

    public ExpressionNode getExpression() {
        return expression;
    }

    @Override
    public String toString() {
        return "VarDeclarationNode{" +
                "identifier='" + identifier + '\'' +
                ", expression=" + expression +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
