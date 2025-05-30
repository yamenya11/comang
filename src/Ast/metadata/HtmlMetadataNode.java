package Ast.metadata;

import Ast.Node;
import Ast.expressions.ExpressionNode;
import Ast.html.HtmlElementNode;
import java.util.List;

// HtmlMetadataNode يجب أن يرث من MetadataEntryNode
public class HtmlMetadataNode extends MetadataEntryNode {
    String key;
    private List<Node> body;

    public HtmlMetadataNode(String key, List<Node> body) {
        this.key=key;
        this.body = body;
    }

    public List<Node> getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "HtmlMetadataNode{" +
                "key='" + key + '\'' +  // نستخدم key من class الأب MetadataEntryNode
                ", body=" + body +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
