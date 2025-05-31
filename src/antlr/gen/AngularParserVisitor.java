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
	 * Visit a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#keyimport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyimport(AngularParser.KeyimportContext ctx);
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
	 * Visit a parse tree produced by the {@code ClassBodyLabel}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyLabel(AngularParser.ClassBodyLabelContext ctx);
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
	 * Visit a parse tree produced by {@link AngularParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatement(AngularParser.LoopStatementContext ctx);
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
	 * Visit a parse tree produced by {@link AngularParser#modifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifiers(AngularParser.ModifiersContext ctx);
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
	 * Visit a parse tree produced by the {@code EXPMINMIN}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEXPMINMIN(AngularParser.EXPMINMINContext ctx);
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
	 * Visit a parse tree produced by the {@code EXPID}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEXPID(AngularParser.EXPIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FUNCTIONCALLLABEL}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFUNCTIONCALLLABEL(AngularParser.FUNCTIONCALLLABELContext ctx);
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
	 * Visit a parse tree produced by the {@code EXPDIVIDE}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEXPDIVIDE(AngularParser.EXPDIVIDEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EXPLESS}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEXPLESS(AngularParser.EXPLESSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EXPSTRING}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEXPSTRING(AngularParser.EXPSTRINGContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EXPEQUALS}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEXPEQUALS(AngularParser.EXPEQUALSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EXPMOD}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEXPMOD(AngularParser.EXPMODContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EXPGREATER}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEXPGREATER(AngularParser.EXPGREATERContext ctx);
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
	 * Visit a parse tree produced by {@link AngularParser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(AngularParser.LambdaExpressionContext ctx);
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
	 * Visit a parse tree produced by the {@code NORMALATTRIBUTE}
	 * labeled alternative in {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNORMALATTRIBUTE(AngularParser.NORMALATTRIBUTEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SIMPLEATTRIBUTE}
	 * labeled alternative in {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSIMPLEATTRIBUTE(AngularParser.SIMPLEATTRIBUTEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NGFORATTRIBUTE}
	 * labeled alternative in {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNGFORATTRIBUTE(AngularParser.NGFORATTRIBUTEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NGIFATTRIBUTE}
	 * labeled alternative in {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNGIFATTRIBUTE(AngularParser.NGIFATTRIBUTEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EVENTATTRIBUTE}
	 * labeled alternative in {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEVENTATTRIBUTE(AngularParser.EVENTATTRIBUTEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ANGULARBUTTONATTRIBUTE}
	 * labeled alternative in {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitANGULARBUTTONATTRIBUTE(AngularParser.ANGULARBUTTONATTRIBUTEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PROPERTYBINDINGATTRIBUTE}
	 * labeled alternative in {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPROPERTYBINDINGATTRIBUTE(AngularParser.PROPERTYBINDINGATTRIBUTEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EVENTBINDINGATTRIBUTE}
	 * labeled alternative in {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEVENTBINDINGATTRIBUTE(AngularParser.EVENTBINDINGATTRIBUTEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EMPTYPROPERTYBINDINGATTRIBUTE}
	 * labeled alternative in {@link AngularParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEMPTYPROPERTYBINDINGATTRIBUTE(AngularParser.EMPTYPROPERTYBINDINGATTRIBUTEContext ctx);
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
	 * Visit a parse tree produced by {@link AngularParser#selector1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector1(AngularParser.Selector1Context ctx);
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
	 * Visit a parse tree produced by {@link AngularParser#value1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue1(AngularParser.Value1Context ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#cssFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssFunction(AngularParser.CssFunctionContext ctx);
}