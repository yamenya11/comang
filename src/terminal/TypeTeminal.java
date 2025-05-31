package terminal;

import Ast.Node;

public class TypeTeminal extends Node {
    String type;

    public TypeTeminal(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "typeVaribal{" +
                "type='" + type + '\'' +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
