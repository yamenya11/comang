// Generated from AngularParser.g4 by ANTLR 4.10.1
package antlr.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AngularParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AngularParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(AngularParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IMPORTLABEL}
	 * labeled alternative in {@link AngularParser#application}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIMPORTLABEL(AngularParser.IMPORTLABELContext ctx);
	/**
	 * Visit a parse tree produced by the {@code COMPONENTLABEL}
	 * labeled alternative in {@link AngularParser#application}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCOMPONENTLABEL(AngularParser.COMPONENTLABELContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CLASSLABEL}
	 * labeled alternative in {@link AngularParser#application}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCLASSLABEL(AngularParser.CLASSLABELContext ctx);
	/**
	 * Visit a parse tree produced by the {@code INJECTABLELABEL}
	 * labeled alternative in {@link AngularParser#application}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitINJECTABLELABEL(AngularParser.INJECTABLELABELContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ROUTELABEL}
	 * labeled alternative in {@link AngularParser#application}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitROUTELABEL(AngularParser.ROUTELABELContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NGMODULLABEL}
	 * labeled alternative in {@link AngularParser#application}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNGMODULLABEL(AngularParser.NGMODULLABELContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code KEYIMPORTLABEL}
	 * labeled alternative in {@link AngularParser#keyimport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKEYIMPORTLABEL(AngularParser.KEYIMPORTLABELContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent(AngularParser.ComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#injectable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInjectable(AngularParser.InjectableContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#ngModuleDecorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgModuleDecorator(AngularParser.NgModuleDecoratorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IMPORTS_PROPERTY}
	 * labeled alternative in {@link AngularParser#ngModuleProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIMPORTS_PROPERTY(AngularParser.IMPORTS_PROPERTYContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EXPORTS_PROPERTY}
	 * labeled alternative in {@link AngularParser#ngModuleProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEXPORTS_PROPERTY(AngularParser.EXPORTS_PROPERTYContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#ngModuleValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgModuleValue(AngularParser.NgModuleValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MODULE_FUNCTION_CALL}
	 * labeled alternative in {@link AngularParser#ngModuleElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMODULE_FUNCTION_CALL(AngularParser.MODULE_FUNCTION_CALLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MODULE_IDENTIFIER}
	 * labeled alternative in {@link AngularParser#ngModuleElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMODULE_IDENTIFIER(AngularParser.MODULE_IDENTIFIERContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ROUTEMOUDLELBEL}
	 * labeled alternative in {@link AngularParser#ngModuleElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitROUTEMOUDLELBEL(AngularParser.ROUTEMOUDLELBELContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ROUTELINKLABEL}
	 * labeled alternative in {@link AngularParser#ngModuleElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitROUTELINKLABEL(AngularParser.ROUTELINKLABELContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#propertyAccessFunctionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyAccessFunctionCall(AngularParser.PropertyAccessFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#routeDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRouteDefinition(AngularParser.RouteDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#routeItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRouteItem(AngularParser.RouteItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#metadata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetadata(AngularParser.MetadataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BasicMetadataLabel}
	 * labeled alternative in {@link AngularParser#metadataEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicMetadataLabel(AngularParser.BasicMetadataLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlMetadataLabel}
	 * labeled alternative in {@link AngularParser#metadataEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlMetadataLabel(AngularParser.HtmlMetadataLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SELECTORLABEL}
	 * labeled alternative in {@link AngularParser#metadataEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSELECTORLABEL(AngularParser.SELECTORLABELContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TAMPLATEURLLABEL}
	 * labeled alternative in {@link AngularParser#metadataEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTAMPLATEURLLABEL(AngularParser.TAMPLATEURLLABELContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PROVIDINLABEL}
	 * labeled alternative in {@link AngularParser#metadataEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPROVIDINLABEL(AngularParser.PROVIDINLABELContext ctx);
	/**
	 * Visit a parse tree produced by the {@code STYLEURLLABEL}
	 * labeled alternative in {@link AngularParser#metadataEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSTYLEURLLABEL(AngularParser.STYLEURLLABELContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#providin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProvidin(AngularParser.ProvidinContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#templateurl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateurl(AngularParser.TemplateurlContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(AngularParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#basicMetadata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicMetadata(AngularParser.BasicMetadataContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlMetadata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlMetadata(AngularParser.HtmlMetadataContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#styleUrl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleUrl(AngularParser.StyleUrlContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(AngularParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EXTENDSLABEL}
	 * labeled alternative in {@link AngularParser#classInheritance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEXTENDSLABEL(AngularParser.EXTENDSLABELContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IMPLEMITIONLABEL}
	 * labeled alternative in {@link AngularParser#classInheritance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIMPLEMITIONLABEL(AngularParser.IMPLEMITIONLABELContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#extendClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendClause(AngularParser.ExtendClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#implementClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplementClause(AngularParser.ImplementClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#getproduct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetproduct(AngularParser.GetproductContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#privateMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivateMethodDeclaration(AngularParser.PrivateMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#products}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProducts(AngularParser.ProductsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#elementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementList(AngularParser.ElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(AngularParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair(AngularParser.PairContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BASEvalueLABEL}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBASEvalueLABEL(AngularParser.BASEvalueLABELContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ARRAYTAYPELABEL}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitARRAYTAYPELABEL(AngularParser.ARRAYTAYPELABELContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IDENTIFIRELABEL}
	 * labeled alternative in {@link AngularParser#basevalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIDENTIFIRELABEL(AngularParser.IDENTIFIRELABELContext ctx);
	/**
	 * Visit a parse tree produced by the {@code STRINGLABEL}
	 * labeled alternative in {@link AngularParser#basevalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSTRINGLABEL(AngularParser.STRINGLABELContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NUMBERLABEL}
	 * labeled alternative in {@link AngularParser#basevalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNUMBERLABEL(AngularParser.NUMBERLABELContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ANYLABEL}
	 * labeled alternative in {@link AngularParser#basevalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitANYLABEL(AngularParser.ANYLABELContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VOIDLABEL}
	 * labeled alternative in {@link AngularParser#basevalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVOIDLABEL(AngularParser.VOIDLABELContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ONINITLABEL}
	 * labeled alternative in {@link AngularParser#basevalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitONINITLABEL(AngularParser.ONINITLABELContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NULLLABEL}
	 * labeled alternative in {@link AngularParser#basevalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNULLLABEL(AngularParser.NULLLABELContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FORMGROUPLABEL}
	 * labeled alternative in {@link AngularParser#basevalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFORMGROUPLABEL(AngularParser.FORMGROUPLABELContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FORMCONTROLLABEL}
	 * labeled alternative in {@link AngularParser#basevalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFORMCONTROLLABEL(AngularParser.FORMCONTROLLABELContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassBodyLabel}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyLabel(AngularParser.ClassBodyLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#addProductMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddProductMethod(AngularParser.AddProductMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(AngularParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(AngularParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(AngularParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#deleteProductMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteProductMethod(AngularParser.DeleteProductMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#productParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProductParameter(AngularParser.ProductParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#constStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstStatement(AngularParser.ConstStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#subjectNextStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubjectNextStatement(AngularParser.SubjectNextStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#spreadExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpreadExpression(AngularParser.SpreadExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#arrayElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElements(AngularParser.ArrayElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#subjectFilterStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubjectFilterStatement(AngularParser.SubjectFilterStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#filterAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterAssignment(AngularParser.FilterAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#simpleNextCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleNextCall(AngularParser.SimpleNextCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#filterExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterExpression(AngularParser.FilterExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#euals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEuals(AngularParser.EualsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(AngularParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#propertyAccessChain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyAccessChain(AngularParser.PropertyAccessChainContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#idParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdParameter(AngularParser.IdParameterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PROPIRTYLABEL}
	 * labeled alternative in {@link AngularParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPROPIRTYLABEL(AngularParser.PROPIRTYLABELContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VARIBALLABEL}
	 * labeled alternative in {@link AngularParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVARIBALLABEL(AngularParser.VARIBALLABELContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DDD}
	 * labeled alternative in {@link AngularParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDDD(AngularParser.DDDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OBSERVABLE_PROPERTY}
	 * labeled alternative in {@link AngularParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOBSERVABLE_PROPERTY(AngularParser.OBSERVABLE_PROPERTYContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BEHAVIOR_SUBJECT_PROPERTY}
	 * labeled alternative in {@link AngularParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBEHAVIOR_SUBJECT_PROPERTY(AngularParser.BEHAVIOR_SUBJECT_PROPERTYContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#observablePropertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObservablePropertyDeclaration(AngularParser.ObservablePropertyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#observableExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObservableExpression(AngularParser.ObservableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#observableMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObservableMethod(AngularParser.ObservableMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#behaviorSubjectDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBehaviorSubjectDeclaration(AngularParser.BehaviorSubjectDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TYPEANYLABELSE}
	 * labeled alternative in {@link AngularParser#typeSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTYPEANYLABELSE(AngularParser.TYPEANYLABELSEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TYPEIDENTFIRE}
	 * labeled alternative in {@link AngularParser#typeSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTYPEIDENTFIRE(AngularParser.TYPEIDENTFIREContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#typeany}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeany(AngularParser.TypeanyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#typeidintfir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeidintfir(AngularParser.TypeidintfirContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#initialValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialValue(AngularParser.InitialValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#regularProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularProperty(AngularParser.RegularPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#letDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetDeclaration(AngularParser.LetDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LETTERMINALLABEL}
	 * labeled alternative in {@link AngularParser#typeVarible}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLETTERMINALLABEL(AngularParser.LETTERMINALLABELContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VARTERMINALLABEL}
	 * labeled alternative in {@link AngularParser#typeVarible}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVARTERMINALLABEL(AngularParser.VARTERMINALLABELContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CONSTTERMINALLABEL}
	 * labeled alternative in {@link AngularParser#typeVarible}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCONSTTERMINALLABEL(AngularParser.CONSTTERMINALLABELContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#emptyArrayDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyArrayDeclaration(AngularParser.EmptyArrayDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(AngularParser.ConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#serviceAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServiceAssignment(AngularParser.ServiceAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#serviceCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServiceCall(AngularParser.ServiceCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#methodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation(AngularParser.MethodInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#getProductByIdMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetProductByIdMethod(AngularParser.GetProductByIdMethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TYPESPRCLABEL}
	 * labeled alternative in {@link AngularParser#returnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTYPESPRCLABEL(AngularParser.TYPESPRCLABELContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VOIDLABELSINGLE}
	 * labeled alternative in {@link AngularParser#returnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVOIDLABELSINGLE(AngularParser.VOIDLABELSINGLEContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#viewdetails}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitViewdetails(AngularParser.ViewdetailsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FORCLASSIC}
	 * labeled alternative in {@link AngularParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFORCLASSIC(AngularParser.FORCLASSICContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FORIN}
	 * labeled alternative in {@link AngularParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFORIN(AngularParser.FORINContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(AngularParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(AngularParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(AngularParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PropertyAccessCondition}
	 * labeled alternative in {@link AngularParser#ifCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyAccessCondition(AngularParser.PropertyAccessConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualityCondition}
	 * labeled alternative in {@link AngularParser#ifCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityCondition(AngularParser.EqualityConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StrictEquality}
	 * labeled alternative in {@link AngularParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrictEquality(AngularParser.StrictEqualityContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LooseEquality}
	 * labeled alternative in {@link AngularParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLooseEquality(AngularParser.LooseEqualityContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotEquality}
	 * labeled alternative in {@link AngularParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEquality(AngularParser.NotEqualityContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StrictNotEquality}
	 * labeled alternative in {@link AngularParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrictNotEquality(AngularParser.StrictNotEqualityContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#caseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseClause(AngularParser.CaseClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#functionB}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionB(AngularParser.FunctionBContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#propertystatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertystatment(AngularParser.PropertystatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(AngularParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(AngularParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TYPEFUN}
	 * labeled alternative in {@link AngularParser#modifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTYPEFUN(AngularParser.TYPEFUNContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ADDSUBMITLABEL}
	 * labeled alternative in {@link AngularParser#addProductFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitADDSUBMITLABEL(AngularParser.ADDSUBMITLABELContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#formGroupDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormGroupDeclaration(AngularParser.FormGroupDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#formGroupAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormGroupAssignment(AngularParser.FormGroupAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FROMFAILDLABEL}
	 * labeled alternative in {@link AngularParser#formGroupFields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFROMFAILDLABEL(AngularParser.FROMFAILDLABELContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#formGroupField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormGroupField(AngularParser.FormGroupFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#formControlInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormControlInit(AngularParser.FormControlInitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LABELED_STATEMENT}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLABELED_STATEMENT(AngularParser.LABELED_STATEMENTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EXPRESSION_STATEMENT}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEXPRESSION_STATEMENT(AngularParser.EXPRESSION_STATEMENTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IF_STATEMENT}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIF_STATEMENT(AngularParser.IF_STATEMENTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LOOP_STATEMENT}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLOOP_STATEMENT(AngularParser.LOOP_STATEMENTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SWITCH_STATEMENT}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSWITCH_STATEMENT(AngularParser.SWITCH_STATEMENTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code METHOD_DECLARATION_STATEMENT}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMETHOD_DECLARATION_STATEMENT(AngularParser.METHOD_DECLARATION_STATEMENTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PROPERTY_DECLARATION_STATEMENT}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPROPERTY_DECLARATION_STATEMENT(AngularParser.PROPERTY_DECLARATION_STATEMENTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FUNCTION_CALL_STATEMENT}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFUNCTION_CALL_STATEMENT(AngularParser.FUNCTION_CALL_STATEMENTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ASSIGNMENT_STATEMENT}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitASSIGNMENT_STATEMENT(AngularParser.ASSIGNMENT_STATEMENTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RETURN_STATEMENT}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRETURN_STATEMENT(AngularParser.RETURN_STATEMENTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PROPERTY_ACCESS_STATEMENT}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPROPERTY_ACCESS_STATEMENT(AngularParser.PROPERTY_ACCESS_STATEMENTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CONSOLE_STATEMENT}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCONSOLE_STATEMENT(AngularParser.CONSOLE_STATEMENTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VAR_DECLARATION_STATEMENT}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVAR_DECLARATION_STATEMENT(AngularParser.VAR_DECLARATION_STATEMENTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FROMGROUPLABEL}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFROMGROUPLABEL(AngularParser.FROMGROUPLABELContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DDDDEE}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDDDDEE(AngularParser.DDDDEEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DDDDDDDDDDD}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDDDDDDDDDDD(AngularParser.DDDDDDDDDDDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EEEEEEEEEEEE}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEEEEEEEEEEEE(AngularParser.EEEEEEEEEEEEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GHJJK}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGHJJK(AngularParser.GHJJKContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EXP_STRICT_EQUAL}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEXP_STRICT_EQUAL(AngularParser.EXP_STRICT_EQUALContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryOperation}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperation(AngularParser.UnaryOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryOperation}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOperation(AngularParser.BinaryOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EXPSEMIRAT}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEXPSEMIRAT(AngularParser.EXPSEMIRATContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EXPSTAR}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEXPSTAR(AngularParser.EXPSTARContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EXPMINUS}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEXPMINUS(AngularParser.EXPMINUSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EXPPRO}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEXPPRO(AngularParser.EXPPROContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EXP_NOT_EQUAL}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEXP_NOT_EQUAL(AngularParser.EXP_NOT_EQUALContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FUNCTIONCALLLABEL}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFUNCTIONCALLLABEL(AngularParser.FUNCTIONCALLLABELContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EXPPAREN}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEXPPAREN(AngularParser.EXPPARENContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EXPPLUS}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEXPPLUS(AngularParser.EXPPLUSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EXPLESS}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEXPLESS(AngularParser.EXPLESSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayLiteralExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteralExpr(AngularParser.ArrayLiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code KLGILGVIL}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKLGILGVIL(AngularParser.KLGILGVILContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpr(AngularParser.PrimaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EXPEQUALS}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEXPEQUALS(AngularParser.EXPEQUALSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EXP_LOOSE_EQUAL}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEXP_LOOSE_EQUAL(AngularParser.EXP_LOOSE_EQUALContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EXPGREATER}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEXPGREATER(AngularParser.EXPGREATERContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JJJJKKKK}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJJJJKKKK(AngularParser.JJJJKKKKContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectLiteralExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteralExpr(AngularParser.ObjectLiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LambdaExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpr(AngularParser.LambdaExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EXPMINMIN}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEXPMINMIN(AngularParser.EXPMINMINContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EXP_STRICT_NOT_EQUAL}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEXP_STRICT_NOT_EQUAL(AngularParser.EXP_STRICT_NOT_EQUALContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EXPID}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEXPID(AngularParser.EXPIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EXPNUMBER}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEXPNUMBER(AngularParser.EXPNUMBERContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EXPINTEGER}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEXPINTEGER(AngularParser.EXPINTEGERContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EXPPLUSPLUS}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEXPPLUSPLUS(AngularParser.EXPPLUSPLUSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EXPDIVIDE}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEXPDIVIDE(AngularParser.EXPDIVIDEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PROP_CHAIN}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPROP_CHAIN(AngularParser.PROP_CHAINContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EXPSTRING}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEXPSTRING(AngularParser.EXPSTRINGContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EXPMOD}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEXPMOD(AngularParser.EXPMODContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(AngularParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#optionalChain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalChain(AngularParser.OptionalChainContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#objectLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteral(AngularParser.ObjectLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#objectProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectProperty(AngularParser.ObjectPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PropAccessExpr}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropAccessExpr(AngularParser.PropAccessExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(AngularParser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThisExprL}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisExprL(AngularParser.ThisExprLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StrExpr}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrExpr(AngularParser.StrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumExpr}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumExpr(AngularParser.NumExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExprL}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExprL(AngularParser.ParenExprLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryOpe}
	 * labeled alternative in {@link AngularParser#binaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOpe(AngularParser.BinaryOpeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#unaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOp(AngularParser.UnaryOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CALFUNLABEL}
	 * labeled alternative in {@link AngularParser#propertyAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCALFUNLABEL(AngularParser.CALFUNLABELContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IDDOTLABEL}
	 * labeled alternative in {@link AngularParser#propertyAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIDDOTLABEL(AngularParser.IDDOTLABELContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FUNCTHISLABEL}
	 * labeled alternative in {@link AngularParser#propertyAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFUNCTHISLABEL(AngularParser.FUNCTHISLABELContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AS_OBSERVABLE_CALL}
	 * labeled alternative in {@link AngularParser#propertyAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAS_OBSERVABLE_CALL(AngularParser.AS_OBSERVABLE_CALLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FUNDETAILSLAB}
	 * labeled alternative in {@link AngularParser#propertyAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFUNDETAILSLAB(AngularParser.FUNDETAILSLABContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FUNCTIOND}
	 * labeled alternative in {@link AngularParser#propertyAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFUNCTIOND(AngularParser.FUNCTIONDContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#fundetails}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFundetails(AngularParser.FundetailsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#fundetd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFundetd(AngularParser.FundetdContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#asObservableCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsObservableCall(AngularParser.AsObservableCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#calfun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalfun(AngularParser.CalfunContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#iddot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIddot(AngularParser.IddotContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#functhis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncthis(AngularParser.FuncthisContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(AngularParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SELECTPRODUCTLABEL}
	 * labeled alternative in {@link AngularParser#selectProduct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSELECTPRODUCTLABEL(AngularParser.SELECTPRODUCTLABELContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(AngularParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteral(AngularParser.ArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(AngularParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(AngularParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#interfaceMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMember(AngularParser.InterfaceMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#propertySignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertySignature(AngularParser.PropertySignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#methodSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodSignature(AngularParser.MethodSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(AngularParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#parameter2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter2(AngularParser.Parameter2Context ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#onbutton}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnbutton(AngularParser.OnbuttonContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#arrayvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayvalue(AngularParser.ArrayvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#decorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorator(AngularParser.DecoratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#propertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyAssignment(AngularParser.PropertyAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(AngularParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#ngOnInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgOnInit(AngularParser.NgOnInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#routeParamAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRouteParamAssignment(AngularParser.RouteParamAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#indexAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexAccess(AngularParser.IndexAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#unaryPlus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryPlus(AngularParser.UnaryPlusContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#formGroupInitialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormGroupInitialization(AngularParser.FormGroupInitializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#formGroupBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormGroupBody(AngularParser.FormGroupBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#formControlFields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormControlFields(AngularParser.FormControlFieldsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#formControlField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormControlField(AngularParser.FormControlFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#formControlArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormControlArgs(AngularParser.FormControlArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#validatorExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidatorExpression(AngularParser.ValidatorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#validator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidator(AngularParser.ValidatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LambdaExpressionExpr}
	 * labeled alternative in {@link AngularParser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpressionExpr(AngularParser.LambdaExpressionExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LambdaExpressionBlock}
	 * labeled alternative in {@link AngularParser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpressionBlock(AngularParser.LambdaExpressionBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(AngularParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(AngularParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(AngularParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElement(AngularParser.HtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code STANDERHTMLELEMNT}
	 * labeled alternative in {@link AngularParser#htmlElementassist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSTANDERHTMLELEMNT(AngularParser.STANDERHTMLELEMNTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SELFCLOSEHTMLELEMNT}
	 * labeled alternative in {@link AngularParser#htmlElementassist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSELFCLOSEHTMLELEMNT(AngularParser.SELFCLOSEHTMLELEMNTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FIXEDHTMLELEMNT}
	 * labeled alternative in {@link AngularParser#htmlElementassist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFIXEDHTMLELEMNT(AngularParser.FIXEDHTMLELEMNTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ANGULARBUTTONLABEL}
	 * labeled alternative in {@link AngularParser#htmlElementassist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitANGULARBUTTONLABEL(AngularParser.ANGULARBUTTONLABELContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FORMELEMENTLABEL}
	 * labeled alternative in {@link AngularParser#htmlElementassist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFORMELEMENTLABEL(AngularParser.FORMELEMENTLABELContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#formElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormElement(AngularParser.FormElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#formControlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormControlElement(AngularParser.FormControlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#fixedtqg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFixedtqg(AngularParser.FixedtqgContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#closefixedtag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosefixedtag(AngularParser.ClosefixedtagContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#standardHtmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandardHtmlElement(AngularParser.StandardHtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#selfClosingHtmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosingHtmlElement(AngularParser.SelfClosingHtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#fixedHtmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFixedHtmlElement(AngularParser.FixedHtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#angularButton}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAngularButton(AngularParser.AngularButtonContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#opentag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpentag(AngularParser.OpentagContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#closetag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosetag(AngularParser.ClosetagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TagH1}
	 * labeled alternative in {@link AngularParser#fixedTagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagH1(AngularParser.TagH1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code TagH2}
	 * labeled alternative in {@link AngularParser#fixedTagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagH2(AngularParser.TagH2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code TagP}
	 * labeled alternative in {@link AngularParser#fixedTagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagP(AngularParser.TagPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TagDiv}
	 * labeled alternative in {@link AngularParser#fixedTagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagDiv(AngularParser.TagDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TagUl}
	 * labeled alternative in {@link AngularParser#fixedTagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagUl(AngularParser.TagUlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TagLi}
	 * labeled alternative in {@link AngularParser#fixedTagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagLi(AngularParser.TagLiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TagSpan}
	 * labeled alternative in {@link AngularParser#fixedTagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagSpan(AngularParser.TagSpanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TagImg}
	 * labeled alternative in {@link AngularParser#fixedTagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagImg(AngularParser.TagImgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FORMLABEL}
	 * labeled alternative in {@link AngularParser#fixedTagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFORMLABEL(AngularParser.FORMLABELContext ctx);
	/**
	 * Visit a parse tree produced by the {@code INPUTLABEL}
	 * labeled alternative in {@link AngularParser#fixedTagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitINPUTLABEL(AngularParser.INPUTLABELContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TEXTAREALABEL}
	 * labeled alternative in {@link AngularParser#fixedTagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTEXTAREALABEL(AngularParser.TEXTAREALABELContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BUTTONLABEL}
	 * labeled alternative in {@link AngularParser#fixedTagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBUTTONLABEL(AngularParser.BUTTONLABELContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ALABEL}
	 * labeled alternative in {@link AngularParser#fixedTagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitALABEL(AngularParser.ALABELContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FORMCONTROL_ATTRIBUTE}
	 * labeled alternative in {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFORMCONTROL_ATTRIBUTE(AngularParser.FORMCONTROL_ATTRIBUTEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FORMGROUP_ATTRIBUTE}
	 * labeled alternative in {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFORMGROUP_ATTRIBUTE(AngularParser.FORMGROUP_ATTRIBUTEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NGSUBMIT_ATTRIBUTE}
	 * labeled alternative in {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNGSUBMIT_ATTRIBUTE(AngularParser.NGSUBMIT_ATTRIBUTEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PROPERTYBINDING_ATTRIBUTE}
	 * labeled alternative in {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPROPERTYBINDING_ATTRIBUTE(AngularParser.PROPERTYBINDING_ATTRIBUTEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EVENTBINDING_ATTRIBUTE}
	 * labeled alternative in {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEVENTBINDING_ATTRIBUTE(AngularParser.EVENTBINDING_ATTRIBUTEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NGIF_ATTRIBUTE}
	 * labeled alternative in {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNGIF_ATTRIBUTE(AngularParser.NGIF_ATTRIBUTEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NGFOR_ATTRIBUTE}
	 * labeled alternative in {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNGFOR_ATTRIBUTE(AngularParser.NGFOR_ATTRIBUTEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BINDING_SYNTAX}
	 * labeled alternative in {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBINDING_SYNTAX(AngularParser.BINDING_SYNTAXContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RAW_INPUT_ELEMENT}
	 * labeled alternative in {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRAW_INPUT_ELEMENT(AngularParser.RAW_INPUT_ELEMENTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CLASS_ATTRIBUTE}
	 * labeled alternative in {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCLASS_ATTRIBUTE(AngularParser.CLASS_ATTRIBUTEContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#bindingSyntax}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBindingSyntax(AngularParser.BindingSyntaxContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#ff}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFf(AngularParser.FfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#propertyBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyBinding(AngularParser.PropertyBindingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierChainBinding}
	 * labeled alternative in {@link AngularParser#bindingIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierChainBinding(AngularParser.IdentifierChainBindingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FormGroupAttributeBinding}
	 * labeled alternative in {@link AngularParser#bindingIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormGroupAttributeBinding(AngularParser.FormGroupAttributeBindingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FormControlNameBinding}
	 * labeled alternative in {@link AngularParser#bindingIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormControlNameBinding(AngularParser.FormControlNameBindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#ngIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgIf(AngularParser.NgIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#ngfor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgfor(AngularParser.NgforContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContent(AngularParser.HtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#errorNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorNode(AngularParser.ErrorNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#interp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterp(AngularParser.InterpContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#identifierChain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierChain(AngularParser.IdentifierChainContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#eventBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventBinding(AngularParser.EventBindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#textNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextNode(AngularParser.TextNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#stylesheet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStylesheet(AngularParser.StylesheetContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#ruleSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleSet(AngularParser.RuleSetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classSelectorLabel}
	 * labeled alternative in {@link AngularParser#selector1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassSelectorLabel(AngularParser.ClassSelectorLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idSelectorLabel}
	 * labeled alternative in {@link AngularParser#selector1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdSelectorLabel(AngularParser.IdSelectorLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pseudoClassSelectorLabel}
	 * labeled alternative in {@link AngularParser#selector1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudoClassSelectorLabel(AngularParser.PseudoClassSelectorLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#classSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassSelector(AngularParser.ClassSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#idSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdSelector(AngularParser.IdSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#pseudoClassSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudoClassSelector(AngularParser.PseudoClassSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(AngularParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(AngularParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberValueLabel}
	 * labeled alternative in {@link AngularParser#value1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberValueLabel(AngularParser.NumberValueLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code colorValueLabel}
	 * labeled alternative in {@link AngularParser#value1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColorValueLabel(AngularParser.ColorValueLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierValueLabel}
	 * labeled alternative in {@link AngularParser#value1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierValueLabel(AngularParser.IdentifierValueLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringValueLabel}
	 * labeled alternative in {@link AngularParser#value1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringValueLabel(AngularParser.StringValueLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cssFunctionValueLabel}
	 * labeled alternative in {@link AngularParser#value1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssFunctionValueLabel(AngularParser.CssFunctionValueLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#cssFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssFunction(AngularParser.CssFunctionContext ctx);
}