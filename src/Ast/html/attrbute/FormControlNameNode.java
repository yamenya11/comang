package Ast.html.attrbute;


import Ast.Node;

public class FormControlNameNode extends BindingIdentifierNode {
    private String name;

    public FormControlNameNode(String name) {
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
