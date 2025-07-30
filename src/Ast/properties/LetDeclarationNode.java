package Ast.properties;

import Ast.Node;
import Ast.expressions.ExpressionNode;

public class LetDeclarationNode extends Node {
    private final String keyword; // let / var / const
    private final String name;
    private final String type; // nullable
    private final ExpressionNode value;

    public LetDeclarationNode(String keyword, String name, String type, ExpressionNode value) {
        this.keyword = keyword;
        this.name = name;
        this.type = type;
        this.value = value;
    }

    public String getKeyword() { return keyword; }
    public String getName() { return name; }
    public String getType() { return type; }
    public ExpressionNode getValue() { return value; }

    @Override
    public String toString() {
        return "LetDeclarationNode{" +
                "keyword='" + keyword + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", value=" + value +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
