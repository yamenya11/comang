package Ast.application;

import Ast.Node;
import Ast.metadata.MetadataEntryNode;

import java.util.List;

public class InjectableLabelNode extends Node {
    private String injectableName;
    private List<MetadataEntryNode> metadata;

    public InjectableLabelNode(String injectableName, List<MetadataEntryNode> metadata) {
        this.injectableName = injectableName;
        this.metadata = metadata;
    }

    @Override
    public String toString() {
        return "InjectableLabelNode{" +
                "injectableName='" + injectableName + '\'' +
                ", metadata=" + metadata +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
