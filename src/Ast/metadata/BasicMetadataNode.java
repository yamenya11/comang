package Ast.metadata;

import Ast.Node;

// BasicMetadataNode يجب أن يرث من MetadataEntryNode
public class BasicMetadataNode extends MetadataEntryNode {
    String key;
    private String value;

    public BasicMetadataNode(String identifier, String value) {

        this.key=identifier;

        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "BasicMetadataNode{" +
                "identifier='" + key + '\'' +  // نستخدم key من class الأب MetadataEntryNode
                ", value='" + value + '\'' +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
