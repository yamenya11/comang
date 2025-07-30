package Ast.expressions;

import Ast.Node;
import java.util.List;

public class ArrayLiteralNode extends ExpressionNode  {
    private final List<ExpressionNode> elements;

    public ArrayLiteralNode(List<ExpressionNode> elements) {
        this.elements = elements;
    }

    public List<ExpressionNode> getElements() {
        return elements;
    }
    @Override
    public String toString() {
        return elements.toString();
    }


    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
