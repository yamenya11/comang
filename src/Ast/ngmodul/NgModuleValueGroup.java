package Ast.ngmodul;

import Ast.Node;
import java.util.List;

public class NgModuleValueGroup extends Node {
    private List<NgModuleValue> values;

    public NgModuleValueGroup(List<NgModuleValue> values) {
        this.values = values;
    }

    public List<NgModuleValue> getValues() {
        return values;
    }

    public void setValues(List<NgModuleValue> values) {
        this.values = values;
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }

    @Override
    public String toString() {
        return "NgModuleValueGroup{" +
                "values=" + values +
                '}';
    }
}
