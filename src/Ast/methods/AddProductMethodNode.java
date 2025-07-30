package Ast.methods;

import Ast.Node;
import java.util.List;

// AddProductMethodNode
public class AddProductMethodNode extends Node {
    private ProductParameterNode productParameter;
    private List<Node> statements;

    public AddProductMethodNode(ProductParameterNode productParameter, List<Node> statements) {
        this.productParameter = productParameter;
        this.statements = statements;
    }

    public ProductParameterNode getProductParameter() {
        return productParameter;
    }

    public List<Node> getStatements() {
        return statements;
    }

    @Override
    public String toString() {
        return "AddProductMethodNode{" +
                "productParameter=" + productParameter +
                ", statements=" + statements +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}