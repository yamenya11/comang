//package Ast.html;
//
//import Ast.Node;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class HtmlElementAssist extends HtmlElementNode{
//    private String tagName;
//    private List<HtmlAttributeNode> attributes;
//    private List<Node> children;
//
//    private String ngIfExpression;
//    private String ngForExpression;
//    private Map<String, String> eventBindings;
//
//    public HtmlElementAssist(String tagName, String value) {
//        this.tagName = tagName != null ? tagName : "div"; // إعداد العلامة الافتراضية
//        this.attributes = new ArrayList<>();
//        this.children = new ArrayList<>();
//        this.eventBindings = new HashMap<>();
//        this.ngIfExpression = value; // إضافة value كـ ngIfExpression
//    }
//
//
//
//    //
//    public List<HtmlAttributeNode> getAttributes() {
//        return attributes;
//    }
//
//
//    // ngIf و ngFor
//    public void setNgIfExpression(String ngIfExpression) {
//        this.ngIfExpression = ngIfExpression;
//    }
//
//    public void setNgForExpression(String ngForExpression) {
//        this.ngForExpression = ngForExpression;
//    }
//
//
//    public void addEventBinding(String eventName, String expression) {
//        if (!eventBindings.containsKey(eventName)) {
//            eventBindings.put(eventName, expression);
//        } else {
//            System.out.println("Warning: Duplicate event binding for event: " + eventName);
//        }
//    }
//
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("HtmlElementNode{")
//                .append("tagName='").append(tagName).append('\'')
//                .append(", ngIfExpression='").append(ngIfExpression).append('\'')
//                .append(", ngForExpression='").append(ngForExpression).append('\'')
//                .append(", eventBindings=").append(eventBindings)
//                .append(", attributes=").append(attributes)
//                .append(", children=[\n");
//
//        for (Node child : children) {
//            sb.append("\t").append(child.toString().replace("\n", "\n\t")).append("\n");
//        }
//
//        sb.append("]}");
//        return sb.toString();
//    }
//}
