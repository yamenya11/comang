package Ast.metadata;

import Ast.Node;

public class Provedin extends MetadataEntryNode{
    String key;
    private String value;

    public Provedin(String key, String value) {
        this.key=key;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "BasicMetadataNode{" +
                "providin='" + key + '\'' +'\n'+
                ", value='" + value + '\'' +'\n'+
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
