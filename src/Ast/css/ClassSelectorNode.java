package Ast.css;

public class ClassSelectorNode extends SelectorNode {
    public final String className;
    public ClassSelectorNode(String className) { this.className = className; }

    @Override
    public String toString() {
        return "ClassSelectorNode{" +
                "className='" + className + '\'' +
                '}';
    }
}
