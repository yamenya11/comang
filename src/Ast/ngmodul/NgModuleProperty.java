package Ast.ngmodul;

import Ast.Node;

import java.util.List;

public class NgModuleProperty extends Node {
    private String propertyName;
    private List<NgModuleValue> values;

    public NgModuleProperty(String propertyName, List<NgModuleValue> values) {
        this.propertyName = propertyName;
        this.values = values;
    }

    // Getters
    public String getPropertyName() {
        return propertyName;
    }

    public List<NgModuleValue> getValues() {
        return values;
    }

    // Setters
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public void setValues(List<NgModuleValue> values) {
        this.values = values;
    }

    @Override
    public String toString() {
        return "NgModuleProperty{" +
                "propertyName='" + propertyName + '\'' +
                ", values=" + values +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
