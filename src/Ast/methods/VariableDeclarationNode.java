package Ast.methods;
import Ast.Node;
import java.util.List;

public class VariableDeclarationNode extends Node {
    private String name;
    private Node initializer;

    public VariableDeclarationNode(String name, Node initializer) {
        this.name = name;
        this.initializer = initializer;
    }

    public String getName() { return name; }
    public Node getInitializer() { return initializer; }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}