package Ast.ngmodul;

public class RouterLinkNode extends NgModuleValue {
    public RouterLinkNode(String value) {
        super(value);
    }

    @Override
    public String toString() {
        return "RouterLinkNode{" + getValue() + '}';
    }
}
