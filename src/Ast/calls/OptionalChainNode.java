package Ast.calls;

import Ast.Node;
import java.util.List;

public class OptionalChainNode extends Node {
    private Node base;
    private List<String> optionalProperties;

    public OptionalChainNode(Node base, List<String> optionalProperties) {
        this.base = base;
        this.optionalProperties = optionalProperties;
    }

    public Node getBase() { return base; }
    public List<String> getOptionalProperties() { return optionalProperties; }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
