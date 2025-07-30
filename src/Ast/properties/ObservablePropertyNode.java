package Ast.properties;

import Ast.Node;
import java.util.List;

public class ObservablePropertyNode extends Node {
    private final String name;
    private final List<String> methodChain;

    public ObservablePropertyNode(String name, List<String> methodChain) {
        this.name = name;
        this.methodChain = methodChain;
    }

    public String getName() { return name; }
    public List<String> getMethodChain() { return methodChain; }

    @Override
    public String toString() {
        return "ObservablePropertyNode{" +
                "name='" + name + '\'' +
                ", methodChain=" + methodChain +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
