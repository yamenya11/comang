package Ast.css;

public class PseudoClassSelectorNode extends SelectorNode {
    public final ClassSelectorNode baseSelector;
    public final String pseudo;
    public PseudoClassSelectorNode(ClassSelectorNode baseSelector, String pseudo) {
        this.baseSelector = baseSelector;
        this.pseudo = pseudo;
    }


    @Override
    public String toString() {
        return "PseudoClassSelectorNode{" +
                "baseSelector=" + baseSelector +
                ", pseudo='" + pseudo + '\'' +
                '}';
    }
}
