package Ast.html.attrbute;

public class EventBindingNode extends AngularAttributeNode {
    public EventBindingNode(String eventName, String expression) {
        super("(" + eventName + ")", expression);
    }

    @Override
    public String toString() {
        return "EventBindingNode{name='" + name + "', expression='" + value + "'}";
    }
}
