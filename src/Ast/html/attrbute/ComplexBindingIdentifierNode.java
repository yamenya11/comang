package Ast.html.attrbute;



import Ast.Node;

import java.util.List;

public class ComplexBindingIdentifierNode extends BindingIdentifierNode {
    private List<String> parts;

    public ComplexBindingIdentifierNode(List<String> parts) {
        this.parts = parts;
    }

    public List<String> getParts() {
        return parts;
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
