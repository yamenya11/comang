package Ast.routing;

import Ast.Node;
import java.util.ArrayList;
import java.util.List;

public class RouteDefinitionNode extends Node {
    private String identifier;
    private List<RouteItemNode> routeItems;

    public RouteDefinitionNode() {
        this.routeItems = new ArrayList<>();
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public List<RouteItemNode> getRouteItems() {
        return routeItems;
    }

    public void addRouteItem(RouteItemNode item) {
        this.routeItems.add(item);
    }

    @Override
    public String toString() {
        return "RouteDefinitionNode{" +
                "identifier='" + identifier + '\'' +
                ", routeItems=" + routeItems +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
