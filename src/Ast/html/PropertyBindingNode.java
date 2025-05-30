package Ast.html;

import Ast.html.attrbute.AngularAttributeNode;

public class PropertyBindingNode extends AngularAttributeNode {
    public PropertyBindingNode(String propertyName, String expression) {
        super("[" + propertyName + "]", expression);
    }

    @Override
    public String toString() {
        return "PropertyBindingNode{name='" + name + "', expression='" + value + "'}";
    }
}
