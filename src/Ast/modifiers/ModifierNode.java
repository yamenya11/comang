package Ast.modifiers;

import Ast.Node;

public class ModifierNode extends Node {
    private String modifier;

    public ModifierNode(String modifier) {
        this.modifier = modifier;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    @Override
    public String toString() {
        return "ModifierNode{" +
                "modifier='" + modifier + '\'' +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
