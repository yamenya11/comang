package Ast.methods;
import Ast.Node;
import java.util.List;

public class ProductParameterNode extends Node {
    private String name;
    private String type;

    public ProductParameterNode(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() { return name; }
    public String getType() { return type; }

    @Override
    public String toString() {
        return "ProductParameterNode{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}