package Ast.html;

import Ast.Node;
import java.util.List;

public class IdentifierChainNode extends Node {
    private List<String> identifiers;

    public IdentifierChainNode(List<String> identifiers) {
        this.identifiers = identifiers;
    }

    public List<String> getIdentifiers() {
        return identifiers;
    }

    @Override
    public String toString() {
        return "IdentifierChainNode{" + identifiers + "}";
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
