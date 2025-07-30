package Ast.css;

import Ast.Node;

public abstract class CssNode extends Node {
    // ممكن تضيف وظائف مشتركة هنا مثل accept(visitor)

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}