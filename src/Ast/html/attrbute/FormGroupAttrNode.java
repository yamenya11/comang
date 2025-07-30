package Ast.html.attrbute;


import Ast.Node;

public class FormGroupAttrNode extends BindingIdentifierNode {
    private String name;

    public FormGroupAttrNode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}

