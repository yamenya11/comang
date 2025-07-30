package Ast.methods;
import Ast.Node;
import java.util.List;

public class DeleteProductMethodNode extends Node {
    private Node idParameter;
    private Node filterAssignment;
    private Node simpleNextCall;

    public DeleteProductMethodNode(Node idParameter, Node filterAssignment, Node simpleNextCall) {
        this.idParameter = idParameter;
        this.filterAssignment = filterAssignment;
        this.simpleNextCall = simpleNextCall;
    }

    public Node getIdParameter() { return idParameter; }
    public Node getFilterAssignment() { return filterAssignment; }
    public Node getSimpleNextCall() { return simpleNextCall; }

    @Override
    public String toString() {
        return "DeleteProductMethodNode{" +
                "idParameter=" + idParameter +
                ", filterAssignment=" + filterAssignment +
                ", simpleNextCall=" + simpleNextCall +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
