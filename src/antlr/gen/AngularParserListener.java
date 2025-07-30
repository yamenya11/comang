// Generated from AngularParser.g4 by ANTLR 4.10.1
package antlr.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AngularParser}.
 */
public interface AngularParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(AngularParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(AngularParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IMPORTLABEL}
	 * labeled alternative in {@link AngularParser#application}.
	 * @param ctx the parse tree
	 */
	void enterIMPORTLABEL(AngularParser.IMPORTLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IMPORTLABEL}
	 * labeled alternative in {@link AngularParser#application}.
	 * @param ctx the parse tree
	 */
	void exitIMPORTLABEL(AngularParser.IMPORTLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code COMPONENTLABEL}
	 * labeled alternative in {@link AngularParser#application}.
	 * @param ctx the parse tree
	 */
	void enterCOMPONENTLABEL(AngularParser.COMPONENTLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code COMPONENTLABEL}
	 * labeled alternative in {@link AngularParser#application}.
	 * @param ctx the parse tree
	 */
	void exitCOMPONENTLABEL(AngularParser.COMPONENTLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CLASSLABEL}
	 * labeled alternative in {@link AngularParser#application}.
	 * @param ctx the parse tree
	 */
	void enterCLASSLABEL(AngularParser.CLASSLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CLASSLABEL}
	 * labeled alternative in {@link AngularParser#application}.
	 * @param ctx the parse tree
	 */
	void exitCLASSLABEL(AngularParser.CLASSLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code INJECTABLELABEL}
	 * labeled alternative in {@link AngularParser#application}.
	 * @param ctx the parse tree
	 */
	void enterINJECTABLELABEL(AngularParser.INJECTABLELABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code INJECTABLELABEL}
	 * labeled alternative in {@link AngularParser#application}.
	 * @param ctx the parse tree
	 */
	void exitINJECTABLELABEL(AngularParser.INJECTABLELABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ROUTELABEL}
	 * labeled alternative in {@link AngularParser#application}.
	 * @param ctx the parse tree
	 */
	void enterROUTELABEL(AngularParser.ROUTELABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ROUTELABEL}
	 * labeled alternative in {@link AngularParser#application}.
	 * @param ctx the parse tree
	 */
	void exitROUTELABEL(AngularParser.ROUTELABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NGMODULLABEL}
	 * labeled alternative in {@link AngularParser#application}.
	 * @param ctx the parse tree
	 */
	void enterNGMODULLABEL(AngularParser.NGMODULLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NGMODULLABEL}
	 * labeled alternative in {@link AngularParser#application}.
	 * @param ctx the parse tree
	 */
	void exitNGMODULLABEL(AngularParser.NGMODULLABELContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code KEYIMPORTLABEL}
	 * labeled alternative in {@link AngularParser#keyimport}.
	 * @param ctx the parse tree
	 */
	void enterKEYIMPORTLABEL(AngularParser.KEYIMPORTLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code KEYIMPORTLABEL}
	 * labeled alternative in {@link AngularParser#keyimport}.
	 * @param ctx the parse tree
	 */
	void exitKEYIMPORTLABEL(AngularParser.KEYIMPORTLABELContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#component}.
	 * @param ctx the parse tree
	 */
	void enterComponent(AngularParser.ComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#component}.
	 * @param ctx the parse tree
	 */
	void exitComponent(AngularParser.ComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#injectable}.
	 * @param ctx the parse tree
	 */
	void enterInjectable(AngularParser.InjectableContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#injectable}.
	 * @param ctx the parse tree
	 */
	void exitInjectable(AngularParser.InjectableContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#ngModuleDecorator}.
	 * @param ctx the parse tree
	 */
	void enterNgModuleDecorator(AngularParser.NgModuleDecoratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#ngModuleDecorator}.
	 * @param ctx the parse tree
	 */
	void exitNgModuleDecorator(AngularParser.NgModuleDecoratorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IMPORTS_PROPERTY}
	 * labeled alternative in {@link AngularParser#ngModuleProperty}.
	 * @param ctx the parse tree
	 */
	void enterIMPORTS_PROPERTY(AngularParser.IMPORTS_PROPERTYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IMPORTS_PROPERTY}
	 * labeled alternative in {@link AngularParser#ngModuleProperty}.
	 * @param ctx the parse tree
	 */
	void exitIMPORTS_PROPERTY(AngularParser.IMPORTS_PROPERTYContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EXPORTS_PROPERTY}
	 * labeled alternative in {@link AngularParser#ngModuleProperty}.
	 * @param ctx the parse tree
	 */
	void enterEXPORTS_PROPERTY(AngularParser.EXPORTS_PROPERTYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EXPORTS_PROPERTY}
	 * labeled alternative in {@link AngularParser#ngModuleProperty}.
	 * @param ctx the parse tree
	 */
	void exitEXPORTS_PROPERTY(AngularParser.EXPORTS_PROPERTYContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#ngModuleValue}.
	 * @param ctx the parse tree
	 */
	void enterNgModuleValue(AngularParser.NgModuleValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#ngModuleValue}.
	 * @param ctx the parse tree
	 */
	void exitNgModuleValue(AngularParser.NgModuleValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MODULE_FUNCTION_CALL}
	 * labeled alternative in {@link AngularParser#ngModuleElement}.
	 * @param ctx the parse tree
	 */
	void enterMODULE_FUNCTION_CALL(AngularParser.MODULE_FUNCTION_CALLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MODULE_FUNCTION_CALL}
	 * labeled alternative in {@link AngularParser#ngModuleElement}.
	 * @param ctx the parse tree
	 */
	void exitMODULE_FUNCTION_CALL(AngularParser.MODULE_FUNCTION_CALLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MODULE_IDENTIFIER}
	 * labeled alternative in {@link AngularParser#ngModuleElement}.
	 * @param ctx the parse tree
	 */
	void enterMODULE_IDENTIFIER(AngularParser.MODULE_IDENTIFIERContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MODULE_IDENTIFIER}
	 * labeled alternative in {@link AngularParser#ngModuleElement}.
	 * @param ctx the parse tree
	 */
	void exitMODULE_IDENTIFIER(AngularParser.MODULE_IDENTIFIERContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ROUTEMOUDLELBEL}
	 * labeled alternative in {@link AngularParser#ngModuleElement}.
	 * @param ctx the parse tree
	 */
	void enterROUTEMOUDLELBEL(AngularParser.ROUTEMOUDLELBELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ROUTEMOUDLELBEL}
	 * labeled alternative in {@link AngularParser#ngModuleElement}.
	 * @param ctx the parse tree
	 */
	void exitROUTEMOUDLELBEL(AngularParser.ROUTEMOUDLELBELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ROUTELINKLABEL}
	 * labeled alternative in {@link AngularParser#ngModuleElement}.
	 * @param ctx the parse tree
	 */
	void enterROUTELINKLABEL(AngularParser.ROUTELINKLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ROUTELINKLABEL}
	 * labeled alternative in {@link AngularParser#ngModuleElement}.
	 * @param ctx the parse tree
	 */
	void exitROUTELINKLABEL(AngularParser.ROUTELINKLABELContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#propertyAccessFunctionCall}.
	 * @param ctx the parse tree
	 */
	void enterPropertyAccessFunctionCall(AngularParser.PropertyAccessFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#propertyAccessFunctionCall}.
	 * @param ctx the parse tree
	 */
	void exitPropertyAccessFunctionCall(AngularParser.PropertyAccessFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#routeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterRouteDefinition(AngularParser.RouteDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#routeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitRouteDefinition(AngularParser.RouteDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#routeItem}.
	 * @param ctx the parse tree
	 */
	void enterRouteItem(AngularParser.RouteItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#routeItem}.
	 * @param ctx the parse tree
	 */
	void exitRouteItem(AngularParser.RouteItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#metadata}.
	 * @param ctx the parse tree
	 */
	void enterMetadata(AngularParser.MetadataContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#metadata}.
	 * @param ctx the parse tree
	 */
	void exitMetadata(AngularParser.MetadataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BasicMetadataLabel}
	 * labeled alternative in {@link AngularParser#metadataEntry}.
	 * @param ctx the parse tree
	 */
	void enterBasicMetadataLabel(AngularParser.BasicMetadataLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BasicMetadataLabel}
	 * labeled alternative in {@link AngularParser#metadataEntry}.
	 * @param ctx the parse tree
	 */
	void exitBasicMetadataLabel(AngularParser.BasicMetadataLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlMetadataLabel}
	 * labeled alternative in {@link AngularParser#metadataEntry}.
	 * @param ctx the parse tree
	 */
	void enterHtmlMetadataLabel(AngularParser.HtmlMetadataLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlMetadataLabel}
	 * labeled alternative in {@link AngularParser#metadataEntry}.
	 * @param ctx the parse tree
	 */
	void exitHtmlMetadataLabel(AngularParser.HtmlMetadataLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SELECTORLABEL}
	 * labeled alternative in {@link AngularParser#metadataEntry}.
	 * @param ctx the parse tree
	 */
	void enterSELECTORLABEL(AngularParser.SELECTORLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SELECTORLABEL}
	 * labeled alternative in {@link AngularParser#metadataEntry}.
	 * @param ctx the parse tree
	 */
	void exitSELECTORLABEL(AngularParser.SELECTORLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TAMPLATEURLLABEL}
	 * labeled alternative in {@link AngularParser#metadataEntry}.
	 * @param ctx the parse tree
	 */
	void enterTAMPLATEURLLABEL(AngularParser.TAMPLATEURLLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TAMPLATEURLLABEL}
	 * labeled alternative in {@link AngularParser#metadataEntry}.
	 * @param ctx the parse tree
	 */
	void exitTAMPLATEURLLABEL(AngularParser.TAMPLATEURLLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PROVIDINLABEL}
	 * labeled alternative in {@link AngularParser#metadataEntry}.
	 * @param ctx the parse tree
	 */
	void enterPROVIDINLABEL(AngularParser.PROVIDINLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PROVIDINLABEL}
	 * labeled alternative in {@link AngularParser#metadataEntry}.
	 * @param ctx the parse tree
	 */
	void exitPROVIDINLABEL(AngularParser.PROVIDINLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STYLEURLLABEL}
	 * labeled alternative in {@link AngularParser#metadataEntry}.
	 * @param ctx the parse tree
	 */
	void enterSTYLEURLLABEL(AngularParser.STYLEURLLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STYLEURLLABEL}
	 * labeled alternative in {@link AngularParser#metadataEntry}.
	 * @param ctx the parse tree
	 */
	void exitSTYLEURLLABEL(AngularParser.STYLEURLLABELContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#providin}.
	 * @param ctx the parse tree
	 */
	void enterProvidin(AngularParser.ProvidinContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#providin}.
	 * @param ctx the parse tree
	 */
	void exitProvidin(AngularParser.ProvidinContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#templateurl}.
	 * @param ctx the parse tree
	 */
	void enterTemplateurl(AngularParser.TemplateurlContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#templateurl}.
	 * @param ctx the parse tree
	 */
	void exitTemplateurl(AngularParser.TemplateurlContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(AngularParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(AngularParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#basicMetadata}.
	 * @param ctx the parse tree
	 */
	void enterBasicMetadata(AngularParser.BasicMetadataContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#basicMetadata}.
	 * @param ctx the parse tree
	 */
	void exitBasicMetadata(AngularParser.BasicMetadataContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlMetadata}.
	 * @param ctx the parse tree
	 */
	void enterHtmlMetadata(AngularParser.HtmlMetadataContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlMetadata}.
	 * @param ctx the parse tree
	 */
	void exitHtmlMetadata(AngularParser.HtmlMetadataContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#styleUrl}.
	 * @param ctx the parse tree
	 */
	void enterStyleUrl(AngularParser.StyleUrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#styleUrl}.
	 * @param ctx the parse tree
	 */
	void exitStyleUrl(AngularParser.StyleUrlContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(AngularParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(AngularParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EXTENDSLABEL}
	 * labeled alternative in {@link AngularParser#classInheritance}.
	 * @param ctx the parse tree
	 */
	void enterEXTENDSLABEL(AngularParser.EXTENDSLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EXTENDSLABEL}
	 * labeled alternative in {@link AngularParser#classInheritance}.
	 * @param ctx the parse tree
	 */
	void exitEXTENDSLABEL(AngularParser.EXTENDSLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IMPLEMITIONLABEL}
	 * labeled alternative in {@link AngularParser#classInheritance}.
	 * @param ctx the parse tree
	 */
	void enterIMPLEMITIONLABEL(AngularParser.IMPLEMITIONLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IMPLEMITIONLABEL}
	 * labeled alternative in {@link AngularParser#classInheritance}.
	 * @param ctx the parse tree
	 */
	void exitIMPLEMITIONLABEL(AngularParser.IMPLEMITIONLABELContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#extendClause}.
	 * @param ctx the parse tree
	 */
	void enterExtendClause(AngularParser.ExtendClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#extendClause}.
	 * @param ctx the parse tree
	 */
	void exitExtendClause(AngularParser.ExtendClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#implementClause}.
	 * @param ctx the parse tree
	 */
	void enterImplementClause(AngularParser.ImplementClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#implementClause}.
	 * @param ctx the parse tree
	 */
	void exitImplementClause(AngularParser.ImplementClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#getproduct}.
	 * @param ctx the parse tree
	 */
	void enterGetproduct(AngularParser.GetproductContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#getproduct}.
	 * @param ctx the parse tree
	 */
	void exitGetproduct(AngularParser.GetproductContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#privateMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPrivateMethodDeclaration(AngularParser.PrivateMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#privateMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPrivateMethodDeclaration(AngularParser.PrivateMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#products}.
	 * @param ctx the parse tree
	 */
	void enterProducts(AngularParser.ProductsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#products}.
	 * @param ctx the parse tree
	 */
	void exitProducts(AngularParser.ProductsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#elementList}.
	 * @param ctx the parse tree
	 */
	void enterElementList(AngularParser.ElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#elementList}.
	 * @param ctx the parse tree
	 */
	void exitElementList(AngularParser.ElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(AngularParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(AngularParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(AngularParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(AngularParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BASEvalueLABEL}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void enterBASEvalueLABEL(AngularParser.BASEvalueLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BASEvalueLABEL}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void exitBASEvalueLABEL(AngularParser.BASEvalueLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ARRAYTAYPELABEL}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void enterARRAYTAYPELABEL(AngularParser.ARRAYTAYPELABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ARRAYTAYPELABEL}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void exitARRAYTAYPELABEL(AngularParser.ARRAYTAYPELABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IDENTIFIRELABEL}
	 * labeled alternative in {@link AngularParser#basevalue}.
	 * @param ctx the parse tree
	 */
	void enterIDENTIFIRELABEL(AngularParser.IDENTIFIRELABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IDENTIFIRELABEL}
	 * labeled alternative in {@link AngularParser#basevalue}.
	 * @param ctx the parse tree
	 */
	void exitIDENTIFIRELABEL(AngularParser.IDENTIFIRELABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STRINGLABEL}
	 * labeled alternative in {@link AngularParser#basevalue}.
	 * @param ctx the parse tree
	 */
	void enterSTRINGLABEL(AngularParser.STRINGLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STRINGLABEL}
	 * labeled alternative in {@link AngularParser#basevalue}.
	 * @param ctx the parse tree
	 */
	void exitSTRINGLABEL(AngularParser.STRINGLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NUMBERLABEL}
	 * labeled alternative in {@link AngularParser#basevalue}.
	 * @param ctx the parse tree
	 */
	void enterNUMBERLABEL(AngularParser.NUMBERLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NUMBERLABEL}
	 * labeled alternative in {@link AngularParser#basevalue}.
	 * @param ctx the parse tree
	 */
	void exitNUMBERLABEL(AngularParser.NUMBERLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ANYLABEL}
	 * labeled alternative in {@link AngularParser#basevalue}.
	 * @param ctx the parse tree
	 */
	void enterANYLABEL(AngularParser.ANYLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ANYLABEL}
	 * labeled alternative in {@link AngularParser#basevalue}.
	 * @param ctx the parse tree
	 */
	void exitANYLABEL(AngularParser.ANYLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VOIDLABEL}
	 * labeled alternative in {@link AngularParser#basevalue}.
	 * @param ctx the parse tree
	 */
	void enterVOIDLABEL(AngularParser.VOIDLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VOIDLABEL}
	 * labeled alternative in {@link AngularParser#basevalue}.
	 * @param ctx the parse tree
	 */
	void exitVOIDLABEL(AngularParser.VOIDLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ONINITLABEL}
	 * labeled alternative in {@link AngularParser#basevalue}.
	 * @param ctx the parse tree
	 */
	void enterONINITLABEL(AngularParser.ONINITLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ONINITLABEL}
	 * labeled alternative in {@link AngularParser#basevalue}.
	 * @param ctx the parse tree
	 */
	void exitONINITLABEL(AngularParser.ONINITLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NULLLABEL}
	 * labeled alternative in {@link AngularParser#basevalue}.
	 * @param ctx the parse tree
	 */
	void enterNULLLABEL(AngularParser.NULLLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NULLLABEL}
	 * labeled alternative in {@link AngularParser#basevalue}.
	 * @param ctx the parse tree
	 */
	void exitNULLLABEL(AngularParser.NULLLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FORMGROUPLABEL}
	 * labeled alternative in {@link AngularParser#basevalue}.
	 * @param ctx the parse tree
	 */
	void enterFORMGROUPLABEL(AngularParser.FORMGROUPLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FORMGROUPLABEL}
	 * labeled alternative in {@link AngularParser#basevalue}.
	 * @param ctx the parse tree
	 */
	void exitFORMGROUPLABEL(AngularParser.FORMGROUPLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FORMCONTROLLABEL}
	 * labeled alternative in {@link AngularParser#basevalue}.
	 * @param ctx the parse tree
	 */
	void enterFORMCONTROLLABEL(AngularParser.FORMCONTROLLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FORMCONTROLLABEL}
	 * labeled alternative in {@link AngularParser#basevalue}.
	 * @param ctx the parse tree
	 */
	void exitFORMCONTROLLABEL(AngularParser.FORMCONTROLLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassBodyLabel}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyLabel(AngularParser.ClassBodyLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassBodyLabel}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyLabel(AngularParser.ClassBodyLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#addProductMethod}.
	 * @param ctx the parse tree
	 */
	void enterAddProductMethod(AngularParser.AddProductMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#addProductMethod}.
	 * @param ctx the parse tree
	 */
	void exitAddProductMethod(AngularParser.AddProductMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(AngularParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(AngularParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(AngularParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(AngularParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(AngularParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(AngularParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#deleteProductMethod}.
	 * @param ctx the parse tree
	 */
	void enterDeleteProductMethod(AngularParser.DeleteProductMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#deleteProductMethod}.
	 * @param ctx the parse tree
	 */
	void exitDeleteProductMethod(AngularParser.DeleteProductMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#productParameter}.
	 * @param ctx the parse tree
	 */
	void enterProductParameter(AngularParser.ProductParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#productParameter}.
	 * @param ctx the parse tree
	 */
	void exitProductParameter(AngularParser.ProductParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#constStatement}.
	 * @param ctx the parse tree
	 */
	void enterConstStatement(AngularParser.ConstStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#constStatement}.
	 * @param ctx the parse tree
	 */
	void exitConstStatement(AngularParser.ConstStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#subjectNextStatement}.
	 * @param ctx the parse tree
	 */
	void enterSubjectNextStatement(AngularParser.SubjectNextStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#subjectNextStatement}.
	 * @param ctx the parse tree
	 */
	void exitSubjectNextStatement(AngularParser.SubjectNextStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#spreadExpression}.
	 * @param ctx the parse tree
	 */
	void enterSpreadExpression(AngularParser.SpreadExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#spreadExpression}.
	 * @param ctx the parse tree
	 */
	void exitSpreadExpression(AngularParser.SpreadExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#arrayElements}.
	 * @param ctx the parse tree
	 */
	void enterArrayElements(AngularParser.ArrayElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#arrayElements}.
	 * @param ctx the parse tree
	 */
	void exitArrayElements(AngularParser.ArrayElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#subjectFilterStatement}.
	 * @param ctx the parse tree
	 */
	void enterSubjectFilterStatement(AngularParser.SubjectFilterStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#subjectFilterStatement}.
	 * @param ctx the parse tree
	 */
	void exitSubjectFilterStatement(AngularParser.SubjectFilterStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#filterAssignment}.
	 * @param ctx the parse tree
	 */
	void enterFilterAssignment(AngularParser.FilterAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#filterAssignment}.
	 * @param ctx the parse tree
	 */
	void exitFilterAssignment(AngularParser.FilterAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#simpleNextCall}.
	 * @param ctx the parse tree
	 */
	void enterSimpleNextCall(AngularParser.SimpleNextCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#simpleNextCall}.
	 * @param ctx the parse tree
	 */
	void exitSimpleNextCall(AngularParser.SimpleNextCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#filterExpression}.
	 * @param ctx the parse tree
	 */
	void enterFilterExpression(AngularParser.FilterExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#filterExpression}.
	 * @param ctx the parse tree
	 */
	void exitFilterExpression(AngularParser.FilterExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#euals}.
	 * @param ctx the parse tree
	 */
	void enterEuals(AngularParser.EualsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#euals}.
	 * @param ctx the parse tree
	 */
	void exitEuals(AngularParser.EualsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(AngularParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(AngularParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#propertyAccessChain}.
	 * @param ctx the parse tree
	 */
	void enterPropertyAccessChain(AngularParser.PropertyAccessChainContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#propertyAccessChain}.
	 * @param ctx the parse tree
	 */
	void exitPropertyAccessChain(AngularParser.PropertyAccessChainContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#idParameter}.
	 * @param ctx the parse tree
	 */
	void enterIdParameter(AngularParser.IdParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#idParameter}.
	 * @param ctx the parse tree
	 */
	void exitIdParameter(AngularParser.IdParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PROPIRTYLABEL}
	 * labeled alternative in {@link AngularParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPROPIRTYLABEL(AngularParser.PROPIRTYLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PROPIRTYLABEL}
	 * labeled alternative in {@link AngularParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPROPIRTYLABEL(AngularParser.PROPIRTYLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VARIBALLABEL}
	 * labeled alternative in {@link AngularParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVARIBALLABEL(AngularParser.VARIBALLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VARIBALLABEL}
	 * labeled alternative in {@link AngularParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVARIBALLABEL(AngularParser.VARIBALLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DDD}
	 * labeled alternative in {@link AngularParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDDD(AngularParser.DDDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DDD}
	 * labeled alternative in {@link AngularParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDDD(AngularParser.DDDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OBSERVABLE_PROPERTY}
	 * labeled alternative in {@link AngularParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterOBSERVABLE_PROPERTY(AngularParser.OBSERVABLE_PROPERTYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OBSERVABLE_PROPERTY}
	 * labeled alternative in {@link AngularParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitOBSERVABLE_PROPERTY(AngularParser.OBSERVABLE_PROPERTYContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BEHAVIOR_SUBJECT_PROPERTY}
	 * labeled alternative in {@link AngularParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterBEHAVIOR_SUBJECT_PROPERTY(AngularParser.BEHAVIOR_SUBJECT_PROPERTYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BEHAVIOR_SUBJECT_PROPERTY}
	 * labeled alternative in {@link AngularParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitBEHAVIOR_SUBJECT_PROPERTY(AngularParser.BEHAVIOR_SUBJECT_PROPERTYContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#observablePropertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterObservablePropertyDeclaration(AngularParser.ObservablePropertyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#observablePropertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitObservablePropertyDeclaration(AngularParser.ObservablePropertyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#observableExpression}.
	 * @param ctx the parse tree
	 */
	void enterObservableExpression(AngularParser.ObservableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#observableExpression}.
	 * @param ctx the parse tree
	 */
	void exitObservableExpression(AngularParser.ObservableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#observableMethod}.
	 * @param ctx the parse tree
	 */
	void enterObservableMethod(AngularParser.ObservableMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#observableMethod}.
	 * @param ctx the parse tree
	 */
	void exitObservableMethod(AngularParser.ObservableMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#behaviorSubjectDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterBehaviorSubjectDeclaration(AngularParser.BehaviorSubjectDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#behaviorSubjectDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitBehaviorSubjectDeclaration(AngularParser.BehaviorSubjectDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TYPEANYLABELSE}
	 * labeled alternative in {@link AngularParser#typeSpec}.
	 * @param ctx the parse tree
	 */
	void enterTYPEANYLABELSE(AngularParser.TYPEANYLABELSEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TYPEANYLABELSE}
	 * labeled alternative in {@link AngularParser#typeSpec}.
	 * @param ctx the parse tree
	 */
	void exitTYPEANYLABELSE(AngularParser.TYPEANYLABELSEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TYPEIDENTFIRE}
	 * labeled alternative in {@link AngularParser#typeSpec}.
	 * @param ctx the parse tree
	 */
	void enterTYPEIDENTFIRE(AngularParser.TYPEIDENTFIREContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TYPEIDENTFIRE}
	 * labeled alternative in {@link AngularParser#typeSpec}.
	 * @param ctx the parse tree
	 */
	void exitTYPEIDENTFIRE(AngularParser.TYPEIDENTFIREContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#typeany}.
	 * @param ctx the parse tree
	 */
	void enterTypeany(AngularParser.TypeanyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#typeany}.
	 * @param ctx the parse tree
	 */
	void exitTypeany(AngularParser.TypeanyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#typeidintfir}.
	 * @param ctx the parse tree
	 */
	void enterTypeidintfir(AngularParser.TypeidintfirContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#typeidintfir}.
	 * @param ctx the parse tree
	 */
	void exitTypeidintfir(AngularParser.TypeidintfirContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#initialValue}.
	 * @param ctx the parse tree
	 */
	void enterInitialValue(AngularParser.InitialValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#initialValue}.
	 * @param ctx the parse tree
	 */
	void exitInitialValue(AngularParser.InitialValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#regularProperty}.
	 * @param ctx the parse tree
	 */
	void enterRegularProperty(AngularParser.RegularPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#regularProperty}.
	 * @param ctx the parse tree
	 */
	void exitRegularProperty(AngularParser.RegularPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#letDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLetDeclaration(AngularParser.LetDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#letDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLetDeclaration(AngularParser.LetDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LETTERMINALLABEL}
	 * labeled alternative in {@link AngularParser#typeVarible}.
	 * @param ctx the parse tree
	 */
	void enterLETTERMINALLABEL(AngularParser.LETTERMINALLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LETTERMINALLABEL}
	 * labeled alternative in {@link AngularParser#typeVarible}.
	 * @param ctx the parse tree
	 */
	void exitLETTERMINALLABEL(AngularParser.LETTERMINALLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VARTERMINALLABEL}
	 * labeled alternative in {@link AngularParser#typeVarible}.
	 * @param ctx the parse tree
	 */
	void enterVARTERMINALLABEL(AngularParser.VARTERMINALLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VARTERMINALLABEL}
	 * labeled alternative in {@link AngularParser#typeVarible}.
	 * @param ctx the parse tree
	 */
	void exitVARTERMINALLABEL(AngularParser.VARTERMINALLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CONSTTERMINALLABEL}
	 * labeled alternative in {@link AngularParser#typeVarible}.
	 * @param ctx the parse tree
	 */
	void enterCONSTTERMINALLABEL(AngularParser.CONSTTERMINALLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CONSTTERMINALLABEL}
	 * labeled alternative in {@link AngularParser#typeVarible}.
	 * @param ctx the parse tree
	 */
	void exitCONSTTERMINALLABEL(AngularParser.CONSTTERMINALLABELContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#emptyArrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEmptyArrayDeclaration(AngularParser.EmptyArrayDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#emptyArrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEmptyArrayDeclaration(AngularParser.EmptyArrayDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(AngularParser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(AngularParser.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#serviceAssignment}.
	 * @param ctx the parse tree
	 */
	void enterServiceAssignment(AngularParser.ServiceAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#serviceAssignment}.
	 * @param ctx the parse tree
	 */
	void exitServiceAssignment(AngularParser.ServiceAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#serviceCall}.
	 * @param ctx the parse tree
	 */
	void enterServiceCall(AngularParser.ServiceCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#serviceCall}.
	 * @param ctx the parse tree
	 */
	void exitServiceCall(AngularParser.ServiceCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation(AngularParser.MethodInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation(AngularParser.MethodInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#getProductByIdMethod}.
	 * @param ctx the parse tree
	 */
	void enterGetProductByIdMethod(AngularParser.GetProductByIdMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#getProductByIdMethod}.
	 * @param ctx the parse tree
	 */
	void exitGetProductByIdMethod(AngularParser.GetProductByIdMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TYPESPRCLABEL}
	 * labeled alternative in {@link AngularParser#returnType}.
	 * @param ctx the parse tree
	 */
	void enterTYPESPRCLABEL(AngularParser.TYPESPRCLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TYPESPRCLABEL}
	 * labeled alternative in {@link AngularParser#returnType}.
	 * @param ctx the parse tree
	 */
	void exitTYPESPRCLABEL(AngularParser.TYPESPRCLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VOIDLABELSINGLE}
	 * labeled alternative in {@link AngularParser#returnType}.
	 * @param ctx the parse tree
	 */
	void enterVOIDLABELSINGLE(AngularParser.VOIDLABELSINGLEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VOIDLABELSINGLE}
	 * labeled alternative in {@link AngularParser#returnType}.
	 * @param ctx the parse tree
	 */
	void exitVOIDLABELSINGLE(AngularParser.VOIDLABELSINGLEContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#viewdetails}.
	 * @param ctx the parse tree
	 */
	void enterViewdetails(AngularParser.ViewdetailsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#viewdetails}.
	 * @param ctx the parse tree
	 */
	void exitViewdetails(AngularParser.ViewdetailsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FORCLASSIC}
	 * labeled alternative in {@link AngularParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterFORCLASSIC(AngularParser.FORCLASSICContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FORCLASSIC}
	 * labeled alternative in {@link AngularParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitFORCLASSIC(AngularParser.FORCLASSICContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FORIN}
	 * labeled alternative in {@link AngularParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterFORIN(AngularParser.FORINContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FORIN}
	 * labeled alternative in {@link AngularParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitFORIN(AngularParser.FORINContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(AngularParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(AngularParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(AngularParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(AngularParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(AngularParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(AngularParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyAccessCondition}
	 * labeled alternative in {@link AngularParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void enterPropertyAccessCondition(AngularParser.PropertyAccessConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyAccessCondition}
	 * labeled alternative in {@link AngularParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void exitPropertyAccessCondition(AngularParser.PropertyAccessConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualityCondition}
	 * labeled alternative in {@link AngularParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void enterEqualityCondition(AngularParser.EqualityConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualityCondition}
	 * labeled alternative in {@link AngularParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void exitEqualityCondition(AngularParser.EqualityConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StrictEquality}
	 * labeled alternative in {@link AngularParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterStrictEquality(AngularParser.StrictEqualityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StrictEquality}
	 * labeled alternative in {@link AngularParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitStrictEquality(AngularParser.StrictEqualityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LooseEquality}
	 * labeled alternative in {@link AngularParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterLooseEquality(AngularParser.LooseEqualityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LooseEquality}
	 * labeled alternative in {@link AngularParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitLooseEquality(AngularParser.LooseEqualityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotEquality}
	 * labeled alternative in {@link AngularParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotEquality(AngularParser.NotEqualityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotEquality}
	 * labeled alternative in {@link AngularParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotEquality(AngularParser.NotEqualityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StrictNotEquality}
	 * labeled alternative in {@link AngularParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterStrictNotEquality(AngularParser.StrictNotEqualityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StrictNotEquality}
	 * labeled alternative in {@link AngularParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitStrictNotEquality(AngularParser.StrictNotEqualityContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#caseClause}.
	 * @param ctx the parse tree
	 */
	void enterCaseClause(AngularParser.CaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#caseClause}.
	 * @param ctx the parse tree
	 */
	void exitCaseClause(AngularParser.CaseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#functionB}.
	 * @param ctx the parse tree
	 */
	void enterFunctionB(AngularParser.FunctionBContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#functionB}.
	 * @param ctx the parse tree
	 */
	void exitFunctionB(AngularParser.FunctionBContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#propertystatment}.
	 * @param ctx the parse tree
	 */
	void enterPropertystatment(AngularParser.PropertystatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#propertystatment}.
	 * @param ctx the parse tree
	 */
	void exitPropertystatment(AngularParser.PropertystatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(AngularParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(AngularParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(AngularParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(AngularParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TYPEFUN}
	 * labeled alternative in {@link AngularParser#modifiers}.
	 * @param ctx the parse tree
	 */
	void enterTYPEFUN(AngularParser.TYPEFUNContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TYPEFUN}
	 * labeled alternative in {@link AngularParser#modifiers}.
	 * @param ctx the parse tree
	 */
	void exitTYPEFUN(AngularParser.TYPEFUNContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ADDSUBMITLABEL}
	 * labeled alternative in {@link AngularParser#addProductFunction}.
	 * @param ctx the parse tree
	 */
	void enterADDSUBMITLABEL(AngularParser.ADDSUBMITLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ADDSUBMITLABEL}
	 * labeled alternative in {@link AngularParser#addProductFunction}.
	 * @param ctx the parse tree
	 */
	void exitADDSUBMITLABEL(AngularParser.ADDSUBMITLABELContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#formGroupDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFormGroupDeclaration(AngularParser.FormGroupDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#formGroupDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFormGroupDeclaration(AngularParser.FormGroupDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#formGroupAssignment}.
	 * @param ctx the parse tree
	 */
	void enterFormGroupAssignment(AngularParser.FormGroupAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#formGroupAssignment}.
	 * @param ctx the parse tree
	 */
	void exitFormGroupAssignment(AngularParser.FormGroupAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FROMFAILDLABEL}
	 * labeled alternative in {@link AngularParser#formGroupFields}.
	 * @param ctx the parse tree
	 */
	void enterFROMFAILDLABEL(AngularParser.FROMFAILDLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FROMFAILDLABEL}
	 * labeled alternative in {@link AngularParser#formGroupFields}.
	 * @param ctx the parse tree
	 */
	void exitFROMFAILDLABEL(AngularParser.FROMFAILDLABELContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#formGroupField}.
	 * @param ctx the parse tree
	 */
	void enterFormGroupField(AngularParser.FormGroupFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#formGroupField}.
	 * @param ctx the parse tree
	 */
	void exitFormGroupField(AngularParser.FormGroupFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#formControlInit}.
	 * @param ctx the parse tree
	 */
	void enterFormControlInit(AngularParser.FormControlInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#formControlInit}.
	 * @param ctx the parse tree
	 */
	void exitFormControlInit(AngularParser.FormControlInitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LABELED_STATEMENT}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterLABELED_STATEMENT(AngularParser.LABELED_STATEMENTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LABELED_STATEMENT}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitLABELED_STATEMENT(AngularParser.LABELED_STATEMENTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EXPRESSION_STATEMENT}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterEXPRESSION_STATEMENT(AngularParser.EXPRESSION_STATEMENTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EXPRESSION_STATEMENT}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitEXPRESSION_STATEMENT(AngularParser.EXPRESSION_STATEMENTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IF_STATEMENT}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIF_STATEMENT(AngularParser.IF_STATEMENTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IF_STATEMENT}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIF_STATEMENT(AngularParser.IF_STATEMENTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LOOP_STATEMENT}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterLOOP_STATEMENT(AngularParser.LOOP_STATEMENTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LOOP_STATEMENT}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitLOOP_STATEMENT(AngularParser.LOOP_STATEMENTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SWITCH_STATEMENT}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSWITCH_STATEMENT(AngularParser.SWITCH_STATEMENTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SWITCH_STATEMENT}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSWITCH_STATEMENT(AngularParser.SWITCH_STATEMENTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code METHOD_DECLARATION_STATEMENT}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterMETHOD_DECLARATION_STATEMENT(AngularParser.METHOD_DECLARATION_STATEMENTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code METHOD_DECLARATION_STATEMENT}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitMETHOD_DECLARATION_STATEMENT(AngularParser.METHOD_DECLARATION_STATEMENTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PROPERTY_DECLARATION_STATEMENT}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPROPERTY_DECLARATION_STATEMENT(AngularParser.PROPERTY_DECLARATION_STATEMENTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PROPERTY_DECLARATION_STATEMENT}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPROPERTY_DECLARATION_STATEMENT(AngularParser.PROPERTY_DECLARATION_STATEMENTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FUNCTION_CALL_STATEMENT}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFUNCTION_CALL_STATEMENT(AngularParser.FUNCTION_CALL_STATEMENTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FUNCTION_CALL_STATEMENT}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFUNCTION_CALL_STATEMENT(AngularParser.FUNCTION_CALL_STATEMENTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ASSIGNMENT_STATEMENT}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterASSIGNMENT_STATEMENT(AngularParser.ASSIGNMENT_STATEMENTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ASSIGNMENT_STATEMENT}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitASSIGNMENT_STATEMENT(AngularParser.ASSIGNMENT_STATEMENTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RETURN_STATEMENT}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRETURN_STATEMENT(AngularParser.RETURN_STATEMENTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RETURN_STATEMENT}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRETURN_STATEMENT(AngularParser.RETURN_STATEMENTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PROPERTY_ACCESS_STATEMENT}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPROPERTY_ACCESS_STATEMENT(AngularParser.PROPERTY_ACCESS_STATEMENTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PROPERTY_ACCESS_STATEMENT}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPROPERTY_ACCESS_STATEMENT(AngularParser.PROPERTY_ACCESS_STATEMENTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CONSOLE_STATEMENT}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCONSOLE_STATEMENT(AngularParser.CONSOLE_STATEMENTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CONSOLE_STATEMENT}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCONSOLE_STATEMENT(AngularParser.CONSOLE_STATEMENTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VAR_DECLARATION_STATEMENT}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVAR_DECLARATION_STATEMENT(AngularParser.VAR_DECLARATION_STATEMENTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VAR_DECLARATION_STATEMENT}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVAR_DECLARATION_STATEMENT(AngularParser.VAR_DECLARATION_STATEMENTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FROMGROUPLABEL}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFROMGROUPLABEL(AngularParser.FROMGROUPLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FROMGROUPLABEL}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFROMGROUPLABEL(AngularParser.FROMGROUPLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DDDDEE}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDDDDEE(AngularParser.DDDDEEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DDDDEE}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDDDDEE(AngularParser.DDDDEEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DDDDDDDDDDD}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDDDDDDDDDDD(AngularParser.DDDDDDDDDDDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DDDDDDDDDDD}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDDDDDDDDDDD(AngularParser.DDDDDDDDDDDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EEEEEEEEEEEE}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterEEEEEEEEEEEE(AngularParser.EEEEEEEEEEEEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EEEEEEEEEEEE}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitEEEEEEEEEEEE(AngularParser.EEEEEEEEEEEEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GHJJK}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGHJJK(AngularParser.GHJJKContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GHJJK}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGHJJK(AngularParser.GHJJKContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EXP_STRICT_EQUAL}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEXP_STRICT_EQUAL(AngularParser.EXP_STRICT_EQUALContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EXP_STRICT_EQUAL}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEXP_STRICT_EQUAL(AngularParser.EXP_STRICT_EQUALContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryOperation}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperation(AngularParser.UnaryOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryOperation}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperation(AngularParser.UnaryOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryOperation}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperation(AngularParser.BinaryOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryOperation}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperation(AngularParser.BinaryOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EXPSEMIRAT}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEXPSEMIRAT(AngularParser.EXPSEMIRATContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EXPSEMIRAT}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEXPSEMIRAT(AngularParser.EXPSEMIRATContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EXPSTAR}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEXPSTAR(AngularParser.EXPSTARContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EXPSTAR}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEXPSTAR(AngularParser.EXPSTARContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EXPMINUS}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEXPMINUS(AngularParser.EXPMINUSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EXPMINUS}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEXPMINUS(AngularParser.EXPMINUSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EXPPRO}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEXPPRO(AngularParser.EXPPROContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EXPPRO}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEXPPRO(AngularParser.EXPPROContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EXP_NOT_EQUAL}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEXP_NOT_EQUAL(AngularParser.EXP_NOT_EQUALContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EXP_NOT_EQUAL}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEXP_NOT_EQUAL(AngularParser.EXP_NOT_EQUALContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FUNCTIONCALLLABEL}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFUNCTIONCALLLABEL(AngularParser.FUNCTIONCALLLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FUNCTIONCALLLABEL}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFUNCTIONCALLLABEL(AngularParser.FUNCTIONCALLLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EXPPAREN}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEXPPAREN(AngularParser.EXPPARENContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EXPPAREN}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEXPPAREN(AngularParser.EXPPARENContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EXPPLUS}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEXPPLUS(AngularParser.EXPPLUSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EXPPLUS}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEXPPLUS(AngularParser.EXPPLUSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EXPLESS}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEXPLESS(AngularParser.EXPLESSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EXPLESS}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEXPLESS(AngularParser.EXPLESSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayLiteralExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteralExpr(AngularParser.ArrayLiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayLiteralExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteralExpr(AngularParser.ArrayLiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code KLGILGVIL}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterKLGILGVIL(AngularParser.KLGILGVILContext ctx);
	/**
	 * Exit a parse tree produced by the {@code KLGILGVIL}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitKLGILGVIL(AngularParser.KLGILGVILContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpr(AngularParser.PrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpr(AngularParser.PrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EXPEQUALS}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEXPEQUALS(AngularParser.EXPEQUALSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EXPEQUALS}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEXPEQUALS(AngularParser.EXPEQUALSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EXP_LOOSE_EQUAL}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEXP_LOOSE_EQUAL(AngularParser.EXP_LOOSE_EQUALContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EXP_LOOSE_EQUAL}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEXP_LOOSE_EQUAL(AngularParser.EXP_LOOSE_EQUALContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EXPGREATER}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEXPGREATER(AngularParser.EXPGREATERContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EXPGREATER}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEXPGREATER(AngularParser.EXPGREATERContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JJJJKKKK}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterJJJJKKKK(AngularParser.JJJJKKKKContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JJJJKKKK}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitJJJJKKKK(AngularParser.JJJJKKKKContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectLiteralExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteralExpr(AngularParser.ObjectLiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectLiteralExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteralExpr(AngularParser.ObjectLiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LambdaExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpr(AngularParser.LambdaExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LambdaExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpr(AngularParser.LambdaExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EXPMINMIN}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEXPMINMIN(AngularParser.EXPMINMINContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EXPMINMIN}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEXPMINMIN(AngularParser.EXPMINMINContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EXP_STRICT_NOT_EQUAL}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEXP_STRICT_NOT_EQUAL(AngularParser.EXP_STRICT_NOT_EQUALContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EXP_STRICT_NOT_EQUAL}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEXP_STRICT_NOT_EQUAL(AngularParser.EXP_STRICT_NOT_EQUALContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EXPID}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEXPID(AngularParser.EXPIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EXPID}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEXPID(AngularParser.EXPIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EXPNUMBER}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEXPNUMBER(AngularParser.EXPNUMBERContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EXPNUMBER}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEXPNUMBER(AngularParser.EXPNUMBERContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EXPINTEGER}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEXPINTEGER(AngularParser.EXPINTEGERContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EXPINTEGER}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEXPINTEGER(AngularParser.EXPINTEGERContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EXPPLUSPLUS}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEXPPLUSPLUS(AngularParser.EXPPLUSPLUSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EXPPLUSPLUS}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEXPPLUSPLUS(AngularParser.EXPPLUSPLUSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EXPDIVIDE}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEXPDIVIDE(AngularParser.EXPDIVIDEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EXPDIVIDE}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEXPDIVIDE(AngularParser.EXPDIVIDEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PROP_CHAIN}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPROP_CHAIN(AngularParser.PROP_CHAINContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PROP_CHAIN}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPROP_CHAIN(AngularParser.PROP_CHAINContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EXPSTRING}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEXPSTRING(AngularParser.EXPSTRINGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EXPSTRING}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEXPSTRING(AngularParser.EXPSTRINGContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EXPMOD}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEXPMOD(AngularParser.EXPMODContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EXPMOD}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEXPMOD(AngularParser.EXPMODContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(AngularParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(AngularParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#optionalChain}.
	 * @param ctx the parse tree
	 */
	void enterOptionalChain(AngularParser.OptionalChainContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#optionalChain}.
	 * @param ctx the parse tree
	 */
	void exitOptionalChain(AngularParser.OptionalChainContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteral(AngularParser.ObjectLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteral(AngularParser.ObjectLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#objectProperty}.
	 * @param ctx the parse tree
	 */
	void enterObjectProperty(AngularParser.ObjectPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#objectProperty}.
	 * @param ctx the parse tree
	 */
	void exitObjectProperty(AngularParser.ObjectPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropAccessExpr}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPropAccessExpr(AngularParser.PropAccessExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropAccessExpr}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPropAccessExpr(AngularParser.PropAccessExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(AngularParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(AngularParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThisExprL}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterThisExprL(AngularParser.ThisExprLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThisExprL}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitThisExprL(AngularParser.ThisExprLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StrExpr}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterStrExpr(AngularParser.StrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StrExpr}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitStrExpr(AngularParser.StrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumExpr}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterNumExpr(AngularParser.NumExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumExpr}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitNumExpr(AngularParser.NumExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExprL}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenExprL(AngularParser.ParenExprLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExprL}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenExprL(AngularParser.ParenExprLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryOpe}
	 * labeled alternative in {@link AngularParser#binaryOp}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOpe(AngularParser.BinaryOpeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryOpe}
	 * labeled alternative in {@link AngularParser#binaryOp}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOpe(AngularParser.BinaryOpeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#unaryOp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOp(AngularParser.UnaryOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#unaryOp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOp(AngularParser.UnaryOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CALFUNLABEL}
	 * labeled alternative in {@link AngularParser#propertyAccess}.
	 * @param ctx the parse tree
	 */
	void enterCALFUNLABEL(AngularParser.CALFUNLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CALFUNLABEL}
	 * labeled alternative in {@link AngularParser#propertyAccess}.
	 * @param ctx the parse tree
	 */
	void exitCALFUNLABEL(AngularParser.CALFUNLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IDDOTLABEL}
	 * labeled alternative in {@link AngularParser#propertyAccess}.
	 * @param ctx the parse tree
	 */
	void enterIDDOTLABEL(AngularParser.IDDOTLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IDDOTLABEL}
	 * labeled alternative in {@link AngularParser#propertyAccess}.
	 * @param ctx the parse tree
	 */
	void exitIDDOTLABEL(AngularParser.IDDOTLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FUNCTHISLABEL}
	 * labeled alternative in {@link AngularParser#propertyAccess}.
	 * @param ctx the parse tree
	 */
	void enterFUNCTHISLABEL(AngularParser.FUNCTHISLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FUNCTHISLABEL}
	 * labeled alternative in {@link AngularParser#propertyAccess}.
	 * @param ctx the parse tree
	 */
	void exitFUNCTHISLABEL(AngularParser.FUNCTHISLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AS_OBSERVABLE_CALL}
	 * labeled alternative in {@link AngularParser#propertyAccess}.
	 * @param ctx the parse tree
	 */
	void enterAS_OBSERVABLE_CALL(AngularParser.AS_OBSERVABLE_CALLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AS_OBSERVABLE_CALL}
	 * labeled alternative in {@link AngularParser#propertyAccess}.
	 * @param ctx the parse tree
	 */
	void exitAS_OBSERVABLE_CALL(AngularParser.AS_OBSERVABLE_CALLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FUNDETAILSLAB}
	 * labeled alternative in {@link AngularParser#propertyAccess}.
	 * @param ctx the parse tree
	 */
	void enterFUNDETAILSLAB(AngularParser.FUNDETAILSLABContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FUNDETAILSLAB}
	 * labeled alternative in {@link AngularParser#propertyAccess}.
	 * @param ctx the parse tree
	 */
	void exitFUNDETAILSLAB(AngularParser.FUNDETAILSLABContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FUNCTIOND}
	 * labeled alternative in {@link AngularParser#propertyAccess}.
	 * @param ctx the parse tree
	 */
	void enterFUNCTIOND(AngularParser.FUNCTIONDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FUNCTIOND}
	 * labeled alternative in {@link AngularParser#propertyAccess}.
	 * @param ctx the parse tree
	 */
	void exitFUNCTIOND(AngularParser.FUNCTIONDContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#fundetails}.
	 * @param ctx the parse tree
	 */
	void enterFundetails(AngularParser.FundetailsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#fundetails}.
	 * @param ctx the parse tree
	 */
	void exitFundetails(AngularParser.FundetailsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#fundetd}.
	 * @param ctx the parse tree
	 */
	void enterFundetd(AngularParser.FundetdContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#fundetd}.
	 * @param ctx the parse tree
	 */
	void exitFundetd(AngularParser.FundetdContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#asObservableCall}.
	 * @param ctx the parse tree
	 */
	void enterAsObservableCall(AngularParser.AsObservableCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#asObservableCall}.
	 * @param ctx the parse tree
	 */
	void exitAsObservableCall(AngularParser.AsObservableCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#calfun}.
	 * @param ctx the parse tree
	 */
	void enterCalfun(AngularParser.CalfunContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#calfun}.
	 * @param ctx the parse tree
	 */
	void exitCalfun(AngularParser.CalfunContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#iddot}.
	 * @param ctx the parse tree
	 */
	void enterIddot(AngularParser.IddotContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#iddot}.
	 * @param ctx the parse tree
	 */
	void exitIddot(AngularParser.IddotContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#functhis}.
	 * @param ctx the parse tree
	 */
	void enterFuncthis(AngularParser.FuncthisContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#functhis}.
	 * @param ctx the parse tree
	 */
	void exitFuncthis(AngularParser.FuncthisContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(AngularParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(AngularParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SELECTPRODUCTLABEL}
	 * labeled alternative in {@link AngularParser#selectProduct}.
	 * @param ctx the parse tree
	 */
	void enterSELECTPRODUCTLABEL(AngularParser.SELECTPRODUCTLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SELECTPRODUCTLABEL}
	 * labeled alternative in {@link AngularParser#selectProduct}.
	 * @param ctx the parse tree
	 */
	void exitSELECTPRODUCTLABEL(AngularParser.SELECTPRODUCTLABELContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(AngularParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(AngularParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(AngularParser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(AngularParser.ArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(AngularParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(AngularParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(AngularParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(AngularParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#interfaceMember}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMember(AngularParser.InterfaceMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#interfaceMember}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMember(AngularParser.InterfaceMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#propertySignature}.
	 * @param ctx the parse tree
	 */
	void enterPropertySignature(AngularParser.PropertySignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#propertySignature}.
	 * @param ctx the parse tree
	 */
	void exitPropertySignature(AngularParser.PropertySignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#methodSignature}.
	 * @param ctx the parse tree
	 */
	void enterMethodSignature(AngularParser.MethodSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#methodSignature}.
	 * @param ctx the parse tree
	 */
	void exitMethodSignature(AngularParser.MethodSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(AngularParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(AngularParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#parameter2}.
	 * @param ctx the parse tree
	 */
	void enterParameter2(AngularParser.Parameter2Context ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#parameter2}.
	 * @param ctx the parse tree
	 */
	void exitParameter2(AngularParser.Parameter2Context ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#onbutton}.
	 * @param ctx the parse tree
	 */
	void enterOnbutton(AngularParser.OnbuttonContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#onbutton}.
	 * @param ctx the parse tree
	 */
	void exitOnbutton(AngularParser.OnbuttonContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#arrayvalue}.
	 * @param ctx the parse tree
	 */
	void enterArrayvalue(AngularParser.ArrayvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#arrayvalue}.
	 * @param ctx the parse tree
	 */
	void exitArrayvalue(AngularParser.ArrayvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#decorator}.
	 * @param ctx the parse tree
	 */
	void enterDecorator(AngularParser.DecoratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#decorator}.
	 * @param ctx the parse tree
	 */
	void exitDecorator(AngularParser.DecoratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertyAssignment(AngularParser.PropertyAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertyAssignment(AngularParser.PropertyAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(AngularParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(AngularParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#ngOnInit}.
	 * @param ctx the parse tree
	 */
	void enterNgOnInit(AngularParser.NgOnInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#ngOnInit}.
	 * @param ctx the parse tree
	 */
	void exitNgOnInit(AngularParser.NgOnInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#routeParamAssignment}.
	 * @param ctx the parse tree
	 */
	void enterRouteParamAssignment(AngularParser.RouteParamAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#routeParamAssignment}.
	 * @param ctx the parse tree
	 */
	void exitRouteParamAssignment(AngularParser.RouteParamAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#indexAccess}.
	 * @param ctx the parse tree
	 */
	void enterIndexAccess(AngularParser.IndexAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#indexAccess}.
	 * @param ctx the parse tree
	 */
	void exitIndexAccess(AngularParser.IndexAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#unaryPlus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPlus(AngularParser.UnaryPlusContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#unaryPlus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPlus(AngularParser.UnaryPlusContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#formGroupInitialization}.
	 * @param ctx the parse tree
	 */
	void enterFormGroupInitialization(AngularParser.FormGroupInitializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#formGroupInitialization}.
	 * @param ctx the parse tree
	 */
	void exitFormGroupInitialization(AngularParser.FormGroupInitializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#formGroupBody}.
	 * @param ctx the parse tree
	 */
	void enterFormGroupBody(AngularParser.FormGroupBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#formGroupBody}.
	 * @param ctx the parse tree
	 */
	void exitFormGroupBody(AngularParser.FormGroupBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#formControlFields}.
	 * @param ctx the parse tree
	 */
	void enterFormControlFields(AngularParser.FormControlFieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#formControlFields}.
	 * @param ctx the parse tree
	 */
	void exitFormControlFields(AngularParser.FormControlFieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#formControlField}.
	 * @param ctx the parse tree
	 */
	void enterFormControlField(AngularParser.FormControlFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#formControlField}.
	 * @param ctx the parse tree
	 */
	void exitFormControlField(AngularParser.FormControlFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#formControlArgs}.
	 * @param ctx the parse tree
	 */
	void enterFormControlArgs(AngularParser.FormControlArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#formControlArgs}.
	 * @param ctx the parse tree
	 */
	void exitFormControlArgs(AngularParser.FormControlArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#validatorExpression}.
	 * @param ctx the parse tree
	 */
	void enterValidatorExpression(AngularParser.ValidatorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#validatorExpression}.
	 * @param ctx the parse tree
	 */
	void exitValidatorExpression(AngularParser.ValidatorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#validator}.
	 * @param ctx the parse tree
	 */
	void enterValidator(AngularParser.ValidatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#validator}.
	 * @param ctx the parse tree
	 */
	void exitValidator(AngularParser.ValidatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LambdaExpressionExpr}
	 * labeled alternative in {@link AngularParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpressionExpr(AngularParser.LambdaExpressionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LambdaExpressionExpr}
	 * labeled alternative in {@link AngularParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpressionExpr(AngularParser.LambdaExpressionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LambdaExpressionBlock}
	 * labeled alternative in {@link AngularParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpressionBlock(AngularParser.LambdaExpressionBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LambdaExpressionBlock}
	 * labeled alternative in {@link AngularParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpressionBlock(AngularParser.LambdaExpressionBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(AngularParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(AngularParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(AngularParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(AngularParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(AngularParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(AngularParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(AngularParser.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(AngularParser.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STANDERHTMLELEMNT}
	 * labeled alternative in {@link AngularParser#htmlElementassist}.
	 * @param ctx the parse tree
	 */
	void enterSTANDERHTMLELEMNT(AngularParser.STANDERHTMLELEMNTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STANDERHTMLELEMNT}
	 * labeled alternative in {@link AngularParser#htmlElementassist}.
	 * @param ctx the parse tree
	 */
	void exitSTANDERHTMLELEMNT(AngularParser.STANDERHTMLELEMNTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SELFCLOSEHTMLELEMNT}
	 * labeled alternative in {@link AngularParser#htmlElementassist}.
	 * @param ctx the parse tree
	 */
	void enterSELFCLOSEHTMLELEMNT(AngularParser.SELFCLOSEHTMLELEMNTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SELFCLOSEHTMLELEMNT}
	 * labeled alternative in {@link AngularParser#htmlElementassist}.
	 * @param ctx the parse tree
	 */
	void exitSELFCLOSEHTMLELEMNT(AngularParser.SELFCLOSEHTMLELEMNTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FIXEDHTMLELEMNT}
	 * labeled alternative in {@link AngularParser#htmlElementassist}.
	 * @param ctx the parse tree
	 */
	void enterFIXEDHTMLELEMNT(AngularParser.FIXEDHTMLELEMNTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FIXEDHTMLELEMNT}
	 * labeled alternative in {@link AngularParser#htmlElementassist}.
	 * @param ctx the parse tree
	 */
	void exitFIXEDHTMLELEMNT(AngularParser.FIXEDHTMLELEMNTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ANGULARBUTTONLABEL}
	 * labeled alternative in {@link AngularParser#htmlElementassist}.
	 * @param ctx the parse tree
	 */
	void enterANGULARBUTTONLABEL(AngularParser.ANGULARBUTTONLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ANGULARBUTTONLABEL}
	 * labeled alternative in {@link AngularParser#htmlElementassist}.
	 * @param ctx the parse tree
	 */
	void exitANGULARBUTTONLABEL(AngularParser.ANGULARBUTTONLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FORMELEMENTLABEL}
	 * labeled alternative in {@link AngularParser#htmlElementassist}.
	 * @param ctx the parse tree
	 */
	void enterFORMELEMENTLABEL(AngularParser.FORMELEMENTLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FORMELEMENTLABEL}
	 * labeled alternative in {@link AngularParser#htmlElementassist}.
	 * @param ctx the parse tree
	 */
	void exitFORMELEMENTLABEL(AngularParser.FORMELEMENTLABELContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#formElement}.
	 * @param ctx the parse tree
	 */
	void enterFormElement(AngularParser.FormElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#formElement}.
	 * @param ctx the parse tree
	 */
	void exitFormElement(AngularParser.FormElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#formControlElement}.
	 * @param ctx the parse tree
	 */
	void enterFormControlElement(AngularParser.FormControlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#formControlElement}.
	 * @param ctx the parse tree
	 */
	void exitFormControlElement(AngularParser.FormControlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#fixedtqg}.
	 * @param ctx the parse tree
	 */
	void enterFixedtqg(AngularParser.FixedtqgContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#fixedtqg}.
	 * @param ctx the parse tree
	 */
	void exitFixedtqg(AngularParser.FixedtqgContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#closefixedtag}.
	 * @param ctx the parse tree
	 */
	void enterClosefixedtag(AngularParser.ClosefixedtagContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#closefixedtag}.
	 * @param ctx the parse tree
	 */
	void exitClosefixedtag(AngularParser.ClosefixedtagContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#standardHtmlElement}.
	 * @param ctx the parse tree
	 */
	void enterStandardHtmlElement(AngularParser.StandardHtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#standardHtmlElement}.
	 * @param ctx the parse tree
	 */
	void exitStandardHtmlElement(AngularParser.StandardHtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#selfClosingHtmlElement}.
	 * @param ctx the parse tree
	 */
	void enterSelfClosingHtmlElement(AngularParser.SelfClosingHtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#selfClosingHtmlElement}.
	 * @param ctx the parse tree
	 */
	void exitSelfClosingHtmlElement(AngularParser.SelfClosingHtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#fixedHtmlElement}.
	 * @param ctx the parse tree
	 */
	void enterFixedHtmlElement(AngularParser.FixedHtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#fixedHtmlElement}.
	 * @param ctx the parse tree
	 */
	void exitFixedHtmlElement(AngularParser.FixedHtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#angularButton}.
	 * @param ctx the parse tree
	 */
	void enterAngularButton(AngularParser.AngularButtonContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#angularButton}.
	 * @param ctx the parse tree
	 */
	void exitAngularButton(AngularParser.AngularButtonContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#opentag}.
	 * @param ctx the parse tree
	 */
	void enterOpentag(AngularParser.OpentagContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#opentag}.
	 * @param ctx the parse tree
	 */
	void exitOpentag(AngularParser.OpentagContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#closetag}.
	 * @param ctx the parse tree
	 */
	void enterClosetag(AngularParser.ClosetagContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#closetag}.
	 * @param ctx the parse tree
	 */
	void exitClosetag(AngularParser.ClosetagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TagH1}
	 * labeled alternative in {@link AngularParser#fixedTagName}.
	 * @param ctx the parse tree
	 */
	void enterTagH1(AngularParser.TagH1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code TagH1}
	 * labeled alternative in {@link AngularParser#fixedTagName}.
	 * @param ctx the parse tree
	 */
	void exitTagH1(AngularParser.TagH1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code TagH2}
	 * labeled alternative in {@link AngularParser#fixedTagName}.
	 * @param ctx the parse tree
	 */
	void enterTagH2(AngularParser.TagH2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code TagH2}
	 * labeled alternative in {@link AngularParser#fixedTagName}.
	 * @param ctx the parse tree
	 */
	void exitTagH2(AngularParser.TagH2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code TagP}
	 * labeled alternative in {@link AngularParser#fixedTagName}.
	 * @param ctx the parse tree
	 */
	void enterTagP(AngularParser.TagPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TagP}
	 * labeled alternative in {@link AngularParser#fixedTagName}.
	 * @param ctx the parse tree
	 */
	void exitTagP(AngularParser.TagPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TagDiv}
	 * labeled alternative in {@link AngularParser#fixedTagName}.
	 * @param ctx the parse tree
	 */
	void enterTagDiv(AngularParser.TagDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TagDiv}
	 * labeled alternative in {@link AngularParser#fixedTagName}.
	 * @param ctx the parse tree
	 */
	void exitTagDiv(AngularParser.TagDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TagUl}
	 * labeled alternative in {@link AngularParser#fixedTagName}.
	 * @param ctx the parse tree
	 */
	void enterTagUl(AngularParser.TagUlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TagUl}
	 * labeled alternative in {@link AngularParser#fixedTagName}.
	 * @param ctx the parse tree
	 */
	void exitTagUl(AngularParser.TagUlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TagLi}
	 * labeled alternative in {@link AngularParser#fixedTagName}.
	 * @param ctx the parse tree
	 */
	void enterTagLi(AngularParser.TagLiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TagLi}
	 * labeled alternative in {@link AngularParser#fixedTagName}.
	 * @param ctx the parse tree
	 */
	void exitTagLi(AngularParser.TagLiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TagSpan}
	 * labeled alternative in {@link AngularParser#fixedTagName}.
	 * @param ctx the parse tree
	 */
	void enterTagSpan(AngularParser.TagSpanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TagSpan}
	 * labeled alternative in {@link AngularParser#fixedTagName}.
	 * @param ctx the parse tree
	 */
	void exitTagSpan(AngularParser.TagSpanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TagImg}
	 * labeled alternative in {@link AngularParser#fixedTagName}.
	 * @param ctx the parse tree
	 */
	void enterTagImg(AngularParser.TagImgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TagImg}
	 * labeled alternative in {@link AngularParser#fixedTagName}.
	 * @param ctx the parse tree
	 */
	void exitTagImg(AngularParser.TagImgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FORMLABEL}
	 * labeled alternative in {@link AngularParser#fixedTagName}.
	 * @param ctx the parse tree
	 */
	void enterFORMLABEL(AngularParser.FORMLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FORMLABEL}
	 * labeled alternative in {@link AngularParser#fixedTagName}.
	 * @param ctx the parse tree
	 */
	void exitFORMLABEL(AngularParser.FORMLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code INPUTLABEL}
	 * labeled alternative in {@link AngularParser#fixedTagName}.
	 * @param ctx the parse tree
	 */
	void enterINPUTLABEL(AngularParser.INPUTLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code INPUTLABEL}
	 * labeled alternative in {@link AngularParser#fixedTagName}.
	 * @param ctx the parse tree
	 */
	void exitINPUTLABEL(AngularParser.INPUTLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TEXTAREALABEL}
	 * labeled alternative in {@link AngularParser#fixedTagName}.
	 * @param ctx the parse tree
	 */
	void enterTEXTAREALABEL(AngularParser.TEXTAREALABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TEXTAREALABEL}
	 * labeled alternative in {@link AngularParser#fixedTagName}.
	 * @param ctx the parse tree
	 */
	void exitTEXTAREALABEL(AngularParser.TEXTAREALABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BUTTONLABEL}
	 * labeled alternative in {@link AngularParser#fixedTagName}.
	 * @param ctx the parse tree
	 */
	void enterBUTTONLABEL(AngularParser.BUTTONLABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BUTTONLABEL}
	 * labeled alternative in {@link AngularParser#fixedTagName}.
	 * @param ctx the parse tree
	 */
	void exitBUTTONLABEL(AngularParser.BUTTONLABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ALABEL}
	 * labeled alternative in {@link AngularParser#fixedTagName}.
	 * @param ctx the parse tree
	 */
	void enterALABEL(AngularParser.ALABELContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ALABEL}
	 * labeled alternative in {@link AngularParser#fixedTagName}.
	 * @param ctx the parse tree
	 */
	void exitALABEL(AngularParser.ALABELContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FORMCONTROL_ATTRIBUTE}
	 * labeled alternative in {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterFORMCONTROL_ATTRIBUTE(AngularParser.FORMCONTROL_ATTRIBUTEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FORMCONTROL_ATTRIBUTE}
	 * labeled alternative in {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitFORMCONTROL_ATTRIBUTE(AngularParser.FORMCONTROL_ATTRIBUTEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FORMGROUP_ATTRIBUTE}
	 * labeled alternative in {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterFORMGROUP_ATTRIBUTE(AngularParser.FORMGROUP_ATTRIBUTEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FORMGROUP_ATTRIBUTE}
	 * labeled alternative in {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitFORMGROUP_ATTRIBUTE(AngularParser.FORMGROUP_ATTRIBUTEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NGSUBMIT_ATTRIBUTE}
	 * labeled alternative in {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterNGSUBMIT_ATTRIBUTE(AngularParser.NGSUBMIT_ATTRIBUTEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NGSUBMIT_ATTRIBUTE}
	 * labeled alternative in {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitNGSUBMIT_ATTRIBUTE(AngularParser.NGSUBMIT_ATTRIBUTEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PROPERTYBINDING_ATTRIBUTE}
	 * labeled alternative in {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterPROPERTYBINDING_ATTRIBUTE(AngularParser.PROPERTYBINDING_ATTRIBUTEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PROPERTYBINDING_ATTRIBUTE}
	 * labeled alternative in {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitPROPERTYBINDING_ATTRIBUTE(AngularParser.PROPERTYBINDING_ATTRIBUTEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EVENTBINDING_ATTRIBUTE}
	 * labeled alternative in {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterEVENTBINDING_ATTRIBUTE(AngularParser.EVENTBINDING_ATTRIBUTEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EVENTBINDING_ATTRIBUTE}
	 * labeled alternative in {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitEVENTBINDING_ATTRIBUTE(AngularParser.EVENTBINDING_ATTRIBUTEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NGIF_ATTRIBUTE}
	 * labeled alternative in {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterNGIF_ATTRIBUTE(AngularParser.NGIF_ATTRIBUTEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NGIF_ATTRIBUTE}
	 * labeled alternative in {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitNGIF_ATTRIBUTE(AngularParser.NGIF_ATTRIBUTEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NGFOR_ATTRIBUTE}
	 * labeled alternative in {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterNGFOR_ATTRIBUTE(AngularParser.NGFOR_ATTRIBUTEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NGFOR_ATTRIBUTE}
	 * labeled alternative in {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitNGFOR_ATTRIBUTE(AngularParser.NGFOR_ATTRIBUTEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BINDING_SYNTAX}
	 * labeled alternative in {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterBINDING_SYNTAX(AngularParser.BINDING_SYNTAXContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BINDING_SYNTAX}
	 * labeled alternative in {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitBINDING_SYNTAX(AngularParser.BINDING_SYNTAXContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RAW_INPUT_ELEMENT}
	 * labeled alternative in {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterRAW_INPUT_ELEMENT(AngularParser.RAW_INPUT_ELEMENTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RAW_INPUT_ELEMENT}
	 * labeled alternative in {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitRAW_INPUT_ELEMENT(AngularParser.RAW_INPUT_ELEMENTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CLASS_ATTRIBUTE}
	 * labeled alternative in {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterCLASS_ATTRIBUTE(AngularParser.CLASS_ATTRIBUTEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CLASS_ATTRIBUTE}
	 * labeled alternative in {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitCLASS_ATTRIBUTE(AngularParser.CLASS_ATTRIBUTEContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#bindingSyntax}.
	 * @param ctx the parse tree
	 */
	void enterBindingSyntax(AngularParser.BindingSyntaxContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#bindingSyntax}.
	 * @param ctx the parse tree
	 */
	void exitBindingSyntax(AngularParser.BindingSyntaxContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#ff}.
	 * @param ctx the parse tree
	 */
	void enterFf(AngularParser.FfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#ff}.
	 * @param ctx the parse tree
	 */
	void exitFf(AngularParser.FfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#propertyBinding}.
	 * @param ctx the parse tree
	 */
	void enterPropertyBinding(AngularParser.PropertyBindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#propertyBinding}.
	 * @param ctx the parse tree
	 */
	void exitPropertyBinding(AngularParser.PropertyBindingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierChainBinding}
	 * labeled alternative in {@link AngularParser#bindingIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierChainBinding(AngularParser.IdentifierChainBindingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierChainBinding}
	 * labeled alternative in {@link AngularParser#bindingIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierChainBinding(AngularParser.IdentifierChainBindingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FormGroupAttributeBinding}
	 * labeled alternative in {@link AngularParser#bindingIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterFormGroupAttributeBinding(AngularParser.FormGroupAttributeBindingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FormGroupAttributeBinding}
	 * labeled alternative in {@link AngularParser#bindingIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitFormGroupAttributeBinding(AngularParser.FormGroupAttributeBindingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FormControlNameBinding}
	 * labeled alternative in {@link AngularParser#bindingIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterFormControlNameBinding(AngularParser.FormControlNameBindingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FormControlNameBinding}
	 * labeled alternative in {@link AngularParser#bindingIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitFormControlNameBinding(AngularParser.FormControlNameBindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#ngIf}.
	 * @param ctx the parse tree
	 */
	void enterNgIf(AngularParser.NgIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#ngIf}.
	 * @param ctx the parse tree
	 */
	void exitNgIf(AngularParser.NgIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#ngfor}.
	 * @param ctx the parse tree
	 */
	void enterNgfor(AngularParser.NgforContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#ngfor}.
	 * @param ctx the parse tree
	 */
	void exitNgfor(AngularParser.NgforContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent(AngularParser.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(AngularParser.HtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#errorNode}.
	 * @param ctx the parse tree
	 */
	void enterErrorNode(AngularParser.ErrorNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#errorNode}.
	 * @param ctx the parse tree
	 */
	void exitErrorNode(AngularParser.ErrorNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#interp}.
	 * @param ctx the parse tree
	 */
	void enterInterp(AngularParser.InterpContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#interp}.
	 * @param ctx the parse tree
	 */
	void exitInterp(AngularParser.InterpContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#identifierChain}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierChain(AngularParser.IdentifierChainContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#identifierChain}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierChain(AngularParser.IdentifierChainContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#eventBinding}.
	 * @param ctx the parse tree
	 */
	void enterEventBinding(AngularParser.EventBindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#eventBinding}.
	 * @param ctx the parse tree
	 */
	void exitEventBinding(AngularParser.EventBindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#textNode}.
	 * @param ctx the parse tree
	 */
	void enterTextNode(AngularParser.TextNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#textNode}.
	 * @param ctx the parse tree
	 */
	void exitTextNode(AngularParser.TextNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void enterStylesheet(AngularParser.StylesheetContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void exitStylesheet(AngularParser.StylesheetContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#ruleSet}.
	 * @param ctx the parse tree
	 */
	void enterRuleSet(AngularParser.RuleSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#ruleSet}.
	 * @param ctx the parse tree
	 */
	void exitRuleSet(AngularParser.RuleSetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classSelectorLabel}
	 * labeled alternative in {@link AngularParser#selector1}.
	 * @param ctx the parse tree
	 */
	void enterClassSelectorLabel(AngularParser.ClassSelectorLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classSelectorLabel}
	 * labeled alternative in {@link AngularParser#selector1}.
	 * @param ctx the parse tree
	 */
	void exitClassSelectorLabel(AngularParser.ClassSelectorLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idSelectorLabel}
	 * labeled alternative in {@link AngularParser#selector1}.
	 * @param ctx the parse tree
	 */
	void enterIdSelectorLabel(AngularParser.IdSelectorLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idSelectorLabel}
	 * labeled alternative in {@link AngularParser#selector1}.
	 * @param ctx the parse tree
	 */
	void exitIdSelectorLabel(AngularParser.IdSelectorLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pseudoClassSelectorLabel}
	 * labeled alternative in {@link AngularParser#selector1}.
	 * @param ctx the parse tree
	 */
	void enterPseudoClassSelectorLabel(AngularParser.PseudoClassSelectorLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pseudoClassSelectorLabel}
	 * labeled alternative in {@link AngularParser#selector1}.
	 * @param ctx the parse tree
	 */
	void exitPseudoClassSelectorLabel(AngularParser.PseudoClassSelectorLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#classSelector}.
	 * @param ctx the parse tree
	 */
	void enterClassSelector(AngularParser.ClassSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#classSelector}.
	 * @param ctx the parse tree
	 */
	void exitClassSelector(AngularParser.ClassSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#idSelector}.
	 * @param ctx the parse tree
	 */
	void enterIdSelector(AngularParser.IdSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#idSelector}.
	 * @param ctx the parse tree
	 */
	void exitIdSelector(AngularParser.IdSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#pseudoClassSelector}.
	 * @param ctx the parse tree
	 */
	void enterPseudoClassSelector(AngularParser.PseudoClassSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#pseudoClassSelector}.
	 * @param ctx the parse tree
	 */
	void exitPseudoClassSelector(AngularParser.PseudoClassSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(AngularParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(AngularParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(AngularParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(AngularParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberValueLabel}
	 * labeled alternative in {@link AngularParser#value1}.
	 * @param ctx the parse tree
	 */
	void enterNumberValueLabel(AngularParser.NumberValueLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberValueLabel}
	 * labeled alternative in {@link AngularParser#value1}.
	 * @param ctx the parse tree
	 */
	void exitNumberValueLabel(AngularParser.NumberValueLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code colorValueLabel}
	 * labeled alternative in {@link AngularParser#value1}.
	 * @param ctx the parse tree
	 */
	void enterColorValueLabel(AngularParser.ColorValueLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code colorValueLabel}
	 * labeled alternative in {@link AngularParser#value1}.
	 * @param ctx the parse tree
	 */
	void exitColorValueLabel(AngularParser.ColorValueLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierValueLabel}
	 * labeled alternative in {@link AngularParser#value1}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierValueLabel(AngularParser.IdentifierValueLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierValueLabel}
	 * labeled alternative in {@link AngularParser#value1}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierValueLabel(AngularParser.IdentifierValueLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringValueLabel}
	 * labeled alternative in {@link AngularParser#value1}.
	 * @param ctx the parse tree
	 */
	void enterStringValueLabel(AngularParser.StringValueLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringValueLabel}
	 * labeled alternative in {@link AngularParser#value1}.
	 * @param ctx the parse tree
	 */
	void exitStringValueLabel(AngularParser.StringValueLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cssFunctionValueLabel}
	 * labeled alternative in {@link AngularParser#value1}.
	 * @param ctx the parse tree
	 */
	void enterCssFunctionValueLabel(AngularParser.CssFunctionValueLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cssFunctionValueLabel}
	 * labeled alternative in {@link AngularParser#value1}.
	 * @param ctx the parse tree
	 */
	void exitCssFunctionValueLabel(AngularParser.CssFunctionValueLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#cssFunction}.
	 * @param ctx the parse tree
	 */
	void enterCssFunction(AngularParser.CssFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#cssFunction}.
	 * @param ctx the parse tree
	 */
	void exitCssFunction(AngularParser.CssFunctionContext ctx);
}