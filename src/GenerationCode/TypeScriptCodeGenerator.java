package GenerationCode;

import Ast.AngularASTBuilder;
import Ast.ClassBodyNode;
import Ast.Node;
import Ast.SelectedProductNode;
import Ast.application.ApplicationNode;
import Ast.application.ImportStatementNode;
import Ast.application.InjectableLabelNode;
import Ast.components.ComponentNode;
import Ast.components.Injectable;
import Ast.declarations.ClassDeclarationNode;
import Ast.expressions.EqualsExpressionNode;
import Ast.expressions.ExpressionNode;
import Ast.expressions.FunctionCallNode;
import Ast.forms.AddProductFunctionNode;
import Ast.forms.FormGroupAssignmentNode;
import Ast.forms.FormGroupFieldNode;
import Ast.function.NGOnInit;
import Ast.html.HtmlContentNode;
import Ast.html.StandardHtmlElementNode;
import Ast.html.TextNode;
import Ast.metadata.HtmlMetadataNode;
import Ast.metadata.MetadataNode;
import Ast.metadata.SelectorNode;
import Ast.methods.*;
import Ast.ngmodul.NgModuleDecorator;
import Ast.properties.BehaviorSubjectPropertyNode;
import Ast.properties.ObservablePropertyNode;
import Ast.property.RegularPropertyNode;
import Ast.routing.RouteDefinitionNode;
import Ast.routing.RouteItemNode;
import Ast.statements.ExpressionStatementNode;
import Ast.statements.StatementNode;
import Ast.types.OnInitNode;
import SymbolTable.SymbolTable;
import seminticerror.*;

public class TypeScriptCodeGenerator extends AngularASTBuilder {

    public TypeScriptCodeGenerator(SymbolTable symbolTable) {
        super(
                symbolTable,
                new SelectorSymbolTable(),
                new ClassSymbolTable(),
                new ErrorHandler(),
                new Import(),
                new HtmlSymbolTable(),
                new FunctionSymbolTable()
        );
    }

    public String generate(Node node) {
        if (node == null) {
            return "";
        }

        if (node instanceof ApplicationNode) {
            StringBuilder sb = new StringBuilder();
            for (Node child : ((ApplicationNode) node).getApplicationnode()) {
                sb.append(generate(child)).append("\n");
            }
            return sb.toString();

        } else if (node instanceof ImportStatementNode) {
            return generateImport((ImportStatementNode) node);

        } else if (node instanceof ComponentNode) {
            return generateComponent((ComponentNode) node);

        }else if (node instanceof ClassDeclarationNode) {
            ClassDeclarationNode cls = (ClassDeclarationNode) node;
            StringBuilder sb = new StringBuilder();
            sb.append("export class ").append(cls.getClassName());
            if (cls.getSuperClass() != null) {
                sb.append(" ").append(cls.getSuperClass());
            }
            sb.append(" {\n");

            for (Node member : cls.getClassBodyElements()) {
                sb.append("  ").append(generate(member)).append("\n");
            }

            sb.append("}");
            return sb.toString();
        } else if (node instanceof ConstructorNode) {
            return generateConstructor((ConstructorNode) node);

        } else if (node instanceof AddProductFunctionNode) {
            return generateAddProductFunction((AddProductFunctionNode) node);

        } else if (node instanceof FormGroupAssignmentNode) {
            return generateFormGroupAssignment((FormGroupAssignmentNode) node);

        } else if (node instanceof HtmlContentNode || node instanceof StandardHtmlElementNode || node instanceof TextNode) {
            // توليد HTML
            return generateHtml(node);

        } else if (node instanceof SelectorNode) {
            return "// selector: '" + ((SelectorNode) node).getValue() + "'";

        } else if (node instanceof HtmlMetadataNode) {
            StringBuilder sb = new StringBuilder();
            sb.append("// HTML Metadata\n");
            for (Node child : ((HtmlMetadataNode) node).getBody()) {
                sb.append(generateHtml(child));
            }


            return sb.toString();
        }else if (node instanceof ClassBodyNode) {
            return generateClassBody((ClassBodyNode) node);
        }else if (node instanceof Injectable) {
            Injectable injectableNode = (Injectable) node;
            MetadataNode metadata = injectableNode.getMetadata();

            if (metadata != null && !metadata.getEntries().isEmpty()) {
                StringBuilder metaBuilder = new StringBuilder();
                metaBuilder.append("@Injectable({\n");
                for (var entry : metadata.getEntries()) {
                    metaBuilder.append("  ")
                            .append(entry.getClass()) // تحتاج getKey(), getValue() في MetadataEntryNode
                            .append(": ")
                            .append(entry.getClass())
                            .append(",\n");
                }
                metaBuilder.append("})");
                return metaBuilder.toString();
            }

            return "@Injectable()";
        }
        else if (node instanceof BehaviorSubjectPropertyNode) {
            BehaviorSubjectPropertyNode bsNode = (BehaviorSubjectPropertyNode) node;
            return "private " + bsNode.getName() + " = new BehaviorSubject<" + bsNode.getGenericType() + ">(" + bsNode.getInitialValue() + ");";
        }else if (node instanceof ObservablePropertyNode) {
            ObservablePropertyNode obsNode = (ObservablePropertyNode) node;
            return "public " + obsNode.getName() + " = this." + obsNode.getMethodChain() + ".asObservable();";
        }else if (node instanceof PrivateMethodDeclarationNode) {
            PrivateMethodDeclarationNode method = (PrivateMethodDeclarationNode) node;
            StringBuilder sb = new StringBuilder();
            sb.append("private ").append(method.getModifier()).append("() {\n");
            sb.append("  ").append(method.getReturnType()).append("\n");
            sb.append("}\n");
            return sb.toString();
        }
        else if (node instanceof GetProductMethodNode) {
            GetProductMethodNode method = (GetProductMethodNode) node;
            return "getProducts() {\n" +
                    "  return this." + method.getElementList() + ".getValue();\n" +
                    "}";
        } else if (node instanceof AddProductMethodNode) {
            AddProductMethodNode method = (AddProductMethodNode) node;
            return "addProduct(product: " + method.getProductParameter() + ") {\n" +
                    "  const current = this." + method.getStatements() + ".getValue();\n" +
                    "  this." + method.getStatements() + ".next([...current, product]);\n" +
                    "}";
        } else if (node instanceof DeleteProductMethodNode) {
            DeleteProductMethodNode method = (DeleteProductMethodNode) node;
            return "deleteProduct(id: number) {\n" +
                    "  const updated = this." + method.getFilterAssignment() + ".getValue()\n" +
                    "    .filter(p => p.id !== id);\n" +
                    "  this." + method.getSimpleNextCall() + ".next(updated);\n" +
                    "}";
        }
        else if (node instanceof FunctionCallNode) {
            FunctionCallNode call = (FunctionCallNode) node;
            StringBuilder sb = new StringBuilder();
            sb.append(call.getFunctionName()).append("(");
            if (call.getArguments() != null && !call.getArguments().isEmpty()) {
                for (int i = 0; i < call.getArguments().size(); i++) {
                    sb.append(generate(call.getArguments().get(i)));
                    if (i < call.getArguments().size() - 1) sb.append(", ");
                }
            }
            sb.append(")");
            return sb.toString();
        }


        else if (node instanceof ProductParameterNode) {
            ProductParameterNode param = (ProductParameterNode) node;
            return param.getName() + ": " + param.getType();
        }
        else if (node instanceof ExpressionStNode) {
            ExpressionStNode exprNode = (ExpressionStNode) node;
            return generate(exprNode.getExpression()); // ✅ استخدم التعبير الداخلي
        }
        else if (node instanceof FilterAssignmentNode) {
            FilterAssignmentNode fNode = (FilterAssignmentNode) node;
            return generate(fNode.getFilterExpression()) + ".filter(" + fNode.getName() + ")";
        }
        else if (node instanceof SimpleNextCallNode) {
            SimpleNextCallNode nextNode = (SimpleNextCallNode) node;
            return nextNode.getIdentifier() + ".next(" + generate(nextNode.getExpression()) + ");";
        }
     else if (node instanceof RouteDefinitionNode) {
        RouteDefinitionNode routeDef = (RouteDefinitionNode) node;
        StringBuilder sb = new StringBuilder();
        sb.append("const routes: Routes = [\n");
        for (RouteItemNode item : routeDef.getRouteItems()) {
            sb.append("  { path: '")
                    .append(item.getPath())
                    .append("', component: ")
                    .append(item.getProperties())
                    .append(" },\n");
        }
        sb.append("];\n");
        return sb.toString();
    }
        else if (node instanceof NgModuleDecorator) {
            NgModuleDecorator ngModule = (NgModuleDecorator) node;
            StringBuilder sb = new StringBuilder();
            sb.append("@NgModule({\n");
            sb.append("  imports: [RouterModule.forRoot(routes)],\n");
            sb.append("  exports: [RouterModule]\n");
            sb.append("})\n");
            return sb.toString();
        }
        else if (node instanceof ExpressionStatementNode) {
            ExpressionStatementNode exprNode = (ExpressionStatementNode) node;
            // توليد التعبير نفسه (تحتاج لتوليد ExpressionNode بشكل منفصل)
            return generate(exprNode.getExpression()) + ";";
        }

        else if (node instanceof RegularPropertyNode) {
            RegularPropertyNode prop = (RegularPropertyNode) node;
            String init = prop.getInitializer() != null ? " = " + generate(prop.getInitializer()) : "";
            return prop.getName() + ": " + prop.getType() + init + ";";
        }

        else if (node instanceof SelectedProductNode) {
            SelectedProductNode spNode = (SelectedProductNode) node;
            StringBuilder sb = new StringBuilder();
            sb.append(spNode.isVoid() ? "void " : "public ");
            sb.append(spNode.getName()).append("(");

            if (spNode.getParameters() != null && !spNode.getParameters().isEmpty()) {
                for (int i = 0; i < spNode.getParameters().size(); i++) {
                    ParameterNode param = spNode.getParameters().get(i);
                    sb.append(param.getName()).append(": ").append(param.getType());
                    if (i < spNode.getParameters().size() - 1) sb.append(", ");
                }
            }

            sb.append(") {\n");

            if (spNode.getStatements() != null) {
                for (StatementNode stmt : spNode.getStatements()) {
                    sb.append("  ").append(generate(stmt)).append("\n");
                }
            }

            sb.append("}\n");
            return sb.toString();
        }

        else if (node instanceof NGOnInit) {
            NGOnInit ng = (NGOnInit) node;
            StringBuilder sb = new StringBuilder();
            sb.append("ngOnInit(): ").append(ng.getReturnType()).append(" {\n");
            for (Node stmt : ng.getBodyStatements()) {
                sb.append("  ").append(generate(stmt)).append("\n");
            }
            sb.append("}");
            return sb.toString();
        }
        else if (node instanceof EqualsExpressionNode) {
            EqualsExpressionNode equalsNode = (EqualsExpressionNode) node;
            // نفترض أن expressions هي قائمة في ExpressionNode يمكن الوصول لها
            ExpressionNode left = equalsNode.getExpressions().get(0);
            ExpressionNode right = equalsNode.getExpressions().get(1);
            return generate(left) + " = " + generate(right) + ";";

        }

        return "// ⚠️ غير مدعوم: " + node.getClass().getSimpleName();
    }
    private String visitBehaviorSubjectPropertyNode(BehaviorSubjectPropertyNode node) {
        return "<div><b>BehaviorSubject:</b> " + node.getName() + " : " + node.getGenericType() + "</div>";
    }



    private String visitInjectableLabelNode(InjectableLabelNode node) {
        return "<div>Injectable: class Ast.application.InjectableLabelNode</div>";
    }

    private String generateClassBody(ClassBodyNode node) {
        StringBuilder sb = new StringBuilder();
        for (Node child : node.getClassElements()) {
            sb.append(generate(child)).append("\n");
        }
        return sb.toString();
    }


    private String generateImport(ImportStatementNode node) {
        return "import " + node.getImported() + " from '" + node.getSource() + "';";
    }

    private String generateComponent(ComponentNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append("@Component({\n");
        if (node.getMetadata() != null) {
            for (Node meta : node.getMetadata()) {
                if (meta instanceof SelectorNode) {
                    sb.append("  selector: '").append(((SelectorNode) meta).getValue()).append("',\n");
                } else if (meta instanceof HtmlMetadataNode) {
                    HtmlMetadataNode htmlMeta = (HtmlMetadataNode) meta;
                    sb.append("  template: `");
                    for (Node bodyNode : htmlMeta.getBody()) {
                        sb.append(generateHtml(bodyNode));
                    }
                    sb.append("`,\n");
                }
            }
        }
        sb.append("})\n");
        return sb.toString();
    }

    private String generateClass(ClassDeclarationNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append("export class ").append(node.getClassName()).append(" {\n");

        if (node.getClassBodyElements() != null) {
            for (Node element : node.getClassBodyElements()) {
                sb.append(generateClassElement(element));
            }
        }

        sb.append("}\n");
        return sb.toString();
    }


    private String generateClassElement(Node node) {
        switch (node.getClass().getSimpleName()) {
            case "FormGroupAssignmentNode":
                return "  " + generateFormGroupAssignment((FormGroupAssignmentNode) node) + "\n";
            case "ConstructorNode":
                return generateConstructor((ConstructorNode) node) + "\n";
            case "AddProductFunctionNode":
                return generateAddProductFunction((AddProductFunctionNode) node) + "\n";
            case "BehaviorSubjectPropertyNode":
            case "ObservablePropertyNode":
            case "PrivateMethodDeclarationNode":
            case "GetProductMethodNode":
            case "AddProductMethodNode":
            case "DeleteProductMethodNode":
                return generate(node) + "\n";
            default:
                return "  // غير معروف: " + node.getClass().getSimpleName() + "\n";
        }
    }


        private String generateFormGroupAssignment(FormGroupAssignmentNode node) {
            StringBuilder sb = new StringBuilder();
            sb.append(node.getName()).append(" = new FormGroup({\n");
            for (FormGroupFieldNode field : node.getFields()) {
                sb.append("    ").append(field.getName()).append(": new FormControl(");
                // حدد طريقة توليد الـ initial value والـ Validators
                sb.append(field.getControlInit().getInitialValue() != null ? "'" + field.getControlInit().getInitialValue() + "'" : "null");
                if (field.getControlInit().getValidators() != null) {
                    sb.append(", ").append("[").append(field.getControlInit().getValidatorsAsString()).append("]");
                }
                sb.append("),\n");
            }
            sb.append("  });");
            return sb.toString();
        }

    private String generateConstructor(ConstructorNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append("constructor(");
        if (node.getParameters() != null) {
            for (int i = 0; i < node.getParameters().size(); i++) {
                ParameterNode param = (ParameterNode) node.getParameters().get(i);
                sb.append(param.getModifier()).append(" ").append(param.getName()).append(": ").append(param.getType());
                if (i < node.getParameters().size() - 1) sb.append(", ");
            }
        }
        sb.append(") {\n");
        // يمكن توليد statements هنا لو موجودة
        sb.append("}\n");
        return sb.toString();
    }

    private String generateAddProductFunction(AddProductFunctionNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append("addProduct() {\n");
        sb.append("  if (this.productForm.valid) {\n");
        sb.append("    this.productService.addProduct(this.productForm.value)\n");
        sb.append("      .subscribe(() => {\n");
        sb.append("        this.router.navigate(['/products']);\n");
        sb.append("      });\n");
        sb.append("  }\n");
        sb.append("}\n");
        return sb.toString();
    }


    private String generateHtml(Node node) {
        if (node == null) return "";

        if (node instanceof StandardHtmlElementNode) {
            StandardHtmlElementNode htmlNode = (StandardHtmlElementNode) node;
            StringBuilder sb = new StringBuilder();

            // فتح التاج + الخصائص
            sb.append("<").append(htmlNode.getTagName());
            if (htmlNode.getAttributes() != null) {
                for (var attr : htmlNode.getAttributes()) {
                    sb.append(" ")
                            .append(attr.getName())
                            .append("=\"")
                            .append(attr.getValue())
                            .append("\"");
                }
            }
            sb.append(">");

            // المحتوى الداخلي
            if (htmlNode.getChildren() != null) {
                for (Node child : htmlNode.getChildren()) {
                    sb.append(generateHtml(child));
                }
            }

            // إغلاق التاج
            sb.append("</").append(htmlNode.getTagName()).append(">");
            return sb.toString();

        } else if (node instanceof TextNode) {
            return ((TextNode) node).getText();

        } else if (node instanceof HtmlContentNode) {
            StringBuilder contentSb = new StringBuilder();
            HtmlContentNode contentNode = (HtmlContentNode) node;
            for (Node child : contentNode.getChildren()) {
                contentSb.append(generateHtml(child));
            }
            return contentSb.toString();
        }

        return "";
    }
}
