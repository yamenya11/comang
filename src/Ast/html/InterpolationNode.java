package Ast.html;

import Ast.Node;

import java.util.List;

class InterpolationNode extends Node {
    private List<String> identifiers;

    public InterpolationNode(List<String> identifiers) {
        this.identifiers = identifiers;
    }

    public List<String> getIdentifiers() {
        return identifiers;
    }

    @Override
    public String toString() {
        return "InterpolationNode{{ " + identifiers + " }}";
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}

