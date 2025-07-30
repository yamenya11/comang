package Ast.methods;
import Ast.Node;
import java.util.List;
public class ArrayElementsNode extends Node {
    private List<Node> elements;

    public ArrayElementsNode(List<Node> elements) {
        this.elements = elements;
    }

    public List<Node> getElements() { return elements; }

    @Override
    public String toString() {
        return "ArrayElementsNode{" +
                "elements=" + elements +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
