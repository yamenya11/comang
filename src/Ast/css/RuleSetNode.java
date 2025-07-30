package Ast.css;

import Ast.Node;
import Ast.metadata.SelectorNode;

import java.util.List;

public class RuleSetNode extends CssNode {
    public final CssNode  selector;
    public final List<DeclarationNode> declarations;

    public RuleSetNode(CssNode selector, List<DeclarationNode> declarations) {
        this.selector = selector;
        this.declarations = declarations;
    }


    @Override
    public String toString() {
        return "RuleSetNode{" +
                "selector=" + selector +
                ", declarations=" + declarations +
                '}';
    }
}

