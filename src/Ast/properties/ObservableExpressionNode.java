package Ast.properties;

import Ast.Node;
import Ast.expressions.ExpressionNode;

import java.util.List;

public class ObservableExpressionNode extends ExpressionNode {
    private String base;
    private List<String> methodChain;

    public ObservableExpressionNode(String base, List<String> methodChain) {
        this.base = base;
        this.methodChain = methodChain;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public List<String> getMethodChain() {
        return methodChain;
    }

    public void setMethodChain(List<String> methodChain) {
        this.methodChain = methodChain;
    }

    @Override
    public String toString() {
        return "ObservableExpressionNode{" +
                "base='" + base + '\'' +
                ", methodChain=" + methodChain +
                ", expressions=" + expressions +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }

    // Getters, toString, etc.
}
