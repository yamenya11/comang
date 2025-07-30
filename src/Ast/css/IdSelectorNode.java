package Ast.css;

public class IdSelectorNode extends SelectorNode {
    public final String id;
    public IdSelectorNode(String id) { this.id = id; }


    @Override
    public String toString() {
        return "IdSelectorNode{" +
                "id='" + id + '\'' +
                '}';
    }
}
