package Ast.properties;

import Ast.Node;

public class ServiceAssignmentNode extends Node {
    private String variable;
    private String service;

    public ServiceAssignmentNode(String variable, String service) {
        this.variable = variable;
        this.service = service;
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    @Override
    public String toString() {
        return "ServiceAssignmentNode{" +
                "variable='" + variable + '\'' +
                ", service='" + service + '\'' +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }

    // Getters, toString, etc.
}
