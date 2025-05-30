package Ast.html;

public class AngularButtonNode extends HtmlElementNode {
    private String identifier;
    private String expression;
    private String buttonText;

    public AngularButtonNode(String identifier, String expression, String buttonText) {
        this.tagName = "button";
        this.identifier = identifier;
        this.expression = expression;
        this.buttonText = buttonText;
    }

    @Override
    public String toString() {
        return "<button " + identifier + "=\"" + expression + "\">" + buttonText + "</button>";
    }
}
