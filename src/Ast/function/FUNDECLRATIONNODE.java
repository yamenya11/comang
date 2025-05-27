package Ast.function;

import Ast.Node;

public class FUNDECLRATIONNODE extends Node {






    @Override
    public void accept(Node visitor) {
   visitor.accept(this);
    }
}
