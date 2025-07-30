package Ast.expressions;

import Ast.Node;

import java.util.List;

public class PropertyAccessChainNode extends ExpressionNode {
    private List<String> chain;

    public PropertyAccessChainNode(List<String> chain) {
        this.chain = chain;
    }

    public List<String> getChain() {
        return chain;
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }

    @Override
    public String toString() {
        return String.join(".", chain);
    }
}
