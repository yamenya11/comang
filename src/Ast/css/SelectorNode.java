package Ast.css;

import Ast.Node;

public abstract class SelectorNode extends CssNode {
    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
