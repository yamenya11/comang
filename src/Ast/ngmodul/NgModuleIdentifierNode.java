package Ast.ngmodul;

public class NgModuleIdentifierNode extends NgModuleValue {
    public NgModuleIdentifierNode(String value) {
        super(value);
    }

    @Override
    public String toString() {
        return "NgModuleIdentifierNode{" + getValue() + '}';
    }
}
