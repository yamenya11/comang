package Ast.html.attrbute;

public class EventBindingAttributeNode extends HtmlAttributeNode {
    public EventBindingAttributeNode(String eventName, String expression) {
        super(eventName, expression);
    }

    @Override
    public String toString() {
        return "EventBinding: " + name + " = " + value;
    }
}
