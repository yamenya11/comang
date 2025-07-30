package Ast.css;

public class PropertyNode extends CssNode {
    private final String name;

    public PropertyNode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "PropertyNode{name='" + name + "'}";
    }


}
