package Ast.metadata;

import Ast.Node;

public class TemplateUrlNode extends MetadataEntryNode {
    String key;
    private String value;

    public TemplateUrlNode(String identifier, String value) {
       this.key=identifier;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "BasicMetadataNode{" +
                "templateurl='" + key + '\'' +'\n'+
                ", value='" + value + '\'' +'\n'+
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
