package Ast.metadata;

//import Ast.html.HtmlElementAssist;
import Ast.Node;
import Ast.html.HtmlElementNode;

import java.util.ArrayList;
import java.util.List;

public class TemplateUrlNode extends MetadataEntryNode {
    private String templatePath;
    private List<HtmlElementNode> elementNodes;


    public TemplateUrlNode(String templatePath,List<HtmlElementNode> elementNodes) {
        this.templatePath = templatePath;
        this.elementNodes = elementNodes;
    }

    public String getTemplatePath() {
        return templatePath;
    }

    public void addElement(HtmlElementNode element) {
        if (this.elementNodes == null) {
            this.elementNodes = new ArrayList<>();
        }
        this.elementNodes.add(element);
    }

    public List<HtmlElementNode> getElements() {
        if (elementNodes == null) {
            elementNodes = new ArrayList<>();
        }
        return elementNodes;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TemplateUrlNode{templatePath='").append(templatePath).append("', elements=\n");

        for (HtmlElementNode element : elementNodes) {
            sb.append("\t").append(element.toString().replace("\n", "\n\t")).append("\n");
        }

        sb.append("}");
        return sb.toString();
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
        for (HtmlElementNode element : elementNodes) {
            element.accept(visitor);
        }
    }
}
