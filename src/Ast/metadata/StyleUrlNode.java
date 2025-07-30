package Ast.metadata;

import Ast.Node;
import Ast.css.CssStylesheetNode;

import java.util.List;

public class StyleUrlNode  extends MetadataEntryNode {
    private final List<CssStylesheetNode> stylesheets;

    public StyleUrlNode(List<CssStylesheetNode> stylesheets) {
        this.stylesheets = stylesheets;
    }

    public List<CssStylesheetNode> getStylesheets() {
        return stylesheets;
    }

    @Override
    public String toString() {
        return "StyleUrlNode{" +
                "stylesheets=" + stylesheets +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
