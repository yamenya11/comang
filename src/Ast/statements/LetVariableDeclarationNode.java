package Ast.statements;

import Ast.Node;
import terminal.TypeTeminal;

import java.util.List;

public class LetVariableDeclarationNode extends Node {
    private  List<TypeTeminal> type;
    private String name;
    private String value;
    private String assignedType; // لأن القيمة هي type مو expression

    public LetVariableDeclarationNode( List<TypeTeminal> type,String name, String  value, String assignedType) {
       this.type=type;
        this.name = name;
        this.value = value;
        this.assignedType = assignedType;

    }

    // Getters
    public String getName() { return name; }
    public List<TypeTeminal> getType() { return type; }
    public String getAssignedType() { return assignedType; }

    @Override
    public String toString() {
        return "LetVariableDeclarationNode{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", value='" + value + '\'' +
                ", assignedType='" + assignedType + '\'' +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
