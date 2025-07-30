package Ast.routing;

import Ast.Node;
import java.util.HashMap;
import java.util.Map;

public class RouteItemNode extends Node {
    private String path;
    private Map<String, String> properties; // لتخزين باقي الخصائص (مثل redirectTo, pathMatch, أو خصائص إضافية)

    public RouteItemNode() {
        this.properties = new HashMap<>();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperty(String key, String value) {
        this.properties.put(key, value);
    }

    @Override
    public String toString() {
        return "RouteItemNode{" +
                "path='" + path + '\'' +
                ", properties=" + properties +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
