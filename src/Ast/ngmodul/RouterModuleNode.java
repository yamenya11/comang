package Ast.ngmodul;

public class RouterModuleNode extends NgModuleValue {
    public RouterModuleNode(String value) {
        super(value);
    }

    @Override
    public String toString() {
        return "RouterModuleNode{" + getValue() + '}';
    }
}
