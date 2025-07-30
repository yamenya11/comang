// Generated from AngularParser.g4 by ANTLR 4.10.1
package antlr.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AngularParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IMPORT=1, COMPONENT=2, ROUTES=3, FROM=4, EXPORT=5, CLASS=6, FOR=7, NG_MODULE=8, 
		IMPORTS=9, EXPORTS=10, FUNICTION=11, CONSOLE=12, LOG=13, WHILE=14, SWITCH=15, 
		CASE=16, DEFAULT=17, INTERFACE=18, LET=19, CONST=20, VAR=21, IN=22, IF=23, 
		ELSE=24, VIEWDETAILS=25, AT=26, ARROW=27, Input=28, BEHAVIOR_SUBJECT=29, 
		FORMCONTROLNAME=30, FORMGROUPATTR=31, PLACEHOLDER=32, PROVIDEDIN=33, SELECTOR=34, 
		TEMPLATE=35, TEMPLATEURL=36, STYLEURLS=37, ANY=38, QUESTION_DOT=39, CONSTRUCTOR=40, 
		SELECTPRODUCT=41, NGONINIT=42, THIS=43, ARRAY=44, PRIVATE=45, PUBLIC=46, 
		FORMGROUP=47, FORMCONTROL=48, ONSUBMIT=49, NEXT=50, FILTER=51, ADDPRODUCT=52, 
		DELETPRODUCT=53, PATH_MATCH=54, REDIRECT_TO=55, FULL=56, ROUTER_MODULE=57, 
		GETPRODUCTBYID=58, ROUTER_LINK=59, NAVIGATE=60, PATH=61, OBSERVABLE=62, 
		AS_OBSERVABLE=63, VALIDATORS=64, PROTECTED=65, TEXTAREA=66, EXPORTAS=67, 
		INJECTABLE=68, GET_PRODUCTS=69, ONBUTTONCLICK=70, BUTTON=71, SNAPSHOT=72, 
		PARAMS=73, VOID=74, RETURN=75, INPUT=76, OUTPUT=77, NEW=78, UNIT=79, IMPLEMENTS=80, 
		EXTENDS=81, ONINIT=82, OPEN_CURLY=83, CLOSE_CURLY=84, OPEN_DOUBLE_CURLY=85, 
		CLOSE_DOUBLE_CURLY=86, OPEN_SQUARE=87, CLOSE_SQUARE=88, OPEN_PAREN=89, 
		CLOSE_PAREN=90, COLON=91, COMMA=92, SEMICOLON=93, SEMIRATE=94, EQUALS=95, 
		OR_OPERATOR=96, COLOR=97, HASH=98, NOT_EQUAL=99, STRICT_NOT_EQUAL=100, 
		BACKTICK=101, HHH=102, STRING=103, PLUS_PLUS=104, MINUS_MINUS=105, NUMBER=106, 
		INTEGER=107, PRICE=108, IDENTIFIER=109, LINE_COMMENT=110, BLOCK_COMMENT=111, 
		WS=112, LESS_THAN=113, GREATER_THAN=114, STAR=115, DIVIDE=116, MOD=117, 
		PLUS=118, MINUS=119, DOT=120, SPREAD=121, LS=122, Product=123, NG=124, 
		H1=125, H2=126, P=127, DIV=128, UL=129, LI=130, SPAN=131, IMG=132, FORM=133, 
		A=134, NG_SUBMIT=135, NI=136, NULL=137, ATTVALUE_VALUE=138, GG=139, ARABIC_TEXT=140;
	public static final int
		RULE_program = 0, RULE_application = 1, RULE_importStatement = 2, RULE_keyimport = 3, 
		RULE_component = 4, RULE_injectable = 5, RULE_ngModuleDecorator = 6, RULE_ngModuleProperty = 7, 
		RULE_ngModuleValue = 8, RULE_ngModuleElement = 9, RULE_propertyAccessFunctionCall = 10, 
		RULE_routeDefinition = 11, RULE_routeItem = 12, RULE_metadata = 13, RULE_metadataEntry = 14, 
		RULE_providin = 15, RULE_templateurl = 16, RULE_selector = 17, RULE_basicMetadata = 18, 
		RULE_htmlMetadata = 19, RULE_styleUrl = 20, RULE_classDeclaration = 21, 
		RULE_classInheritance = 22, RULE_extendClause = 23, RULE_implementClause = 24, 
		RULE_getproduct = 25, RULE_privateMethodDeclaration = 26, RULE_products = 27, 
		RULE_elementList = 28, RULE_element = 29, RULE_pair = 30, RULE_value = 31, 
		RULE_basevalue = 32, RULE_classBody = 33, RULE_addProductMethod = 34, 
		RULE_variableDeclaration = 35, RULE_expressionStatement = 36, RULE_assignment = 37, 
		RULE_deleteProductMethod = 38, RULE_productParameter = 39, RULE_constStatement = 40, 
		RULE_subjectNextStatement = 41, RULE_spreadExpression = 42, RULE_arrayElements = 43, 
		RULE_subjectFilterStatement = 44, RULE_filterAssignment = 45, RULE_simpleNextCall = 46, 
		RULE_filterExpression = 47, RULE_euals = 48, RULE_methodBody = 49, RULE_propertyAccessChain = 50, 
		RULE_idParameter = 51, RULE_propertyDeclaration = 52, RULE_observablePropertyDeclaration = 53, 
		RULE_observableExpression = 54, RULE_observableMethod = 55, RULE_behaviorSubjectDeclaration = 56, 
		RULE_typeSpec = 57, RULE_typeany = 58, RULE_typeidintfir = 59, RULE_initialValue = 60, 
		RULE_regularProperty = 61, RULE_letDeclaration = 62, RULE_typeVarible = 63, 
		RULE_emptyArrayDeclaration = 64, RULE_constructor = 65, RULE_serviceAssignment = 66, 
		RULE_serviceCall = 67, RULE_methodInvocation = 68, RULE_getProductByIdMethod = 69, 
		RULE_returnType = 70, RULE_viewdetails = 71, RULE_loopStatement = 72, 
		RULE_whileStatement = 73, RULE_switchStatement = 74, RULE_ifStatement = 75, 
		RULE_ifCondition = 76, RULE_equalityExpression = 77, RULE_caseClause = 78, 
		RULE_functionDeclaration = 79, RULE_functionB = 80, RULE_propertystatment = 81, 
		RULE_methodDeclaration = 82, RULE_parameter = 83, RULE_modifiers = 84, 
		RULE_addProductFunction = 85, RULE_formGroupDeclaration = 86, RULE_formGroupAssignment = 87, 
		RULE_formGroupFields = 88, RULE_formGroupField = 89, RULE_formControlInit = 90, 
		RULE_statement = 91, RULE_expression = 92, RULE_methodCall = 93, RULE_optionalChain = 94, 
		RULE_objectLiteral = 95, RULE_objectProperty = 96, RULE_primaryExpression = 97, 
		RULE_binaryOp = 98, RULE_unaryOp = 99, RULE_propertyAccess = 100, RULE_fundetails = 101, 
		RULE_fundetd = 102, RULE_asObservableCall = 103, RULE_calfun = 104, RULE_iddot = 105, 
		RULE_functhis = 106, RULE_functionCall = 107, RULE_selectProduct = 108, 
		RULE_argumentList = 109, RULE_arrayLiteral = 110, RULE_interfaceDeclaration = 111, 
		RULE_interfaceBody = 112, RULE_interfaceMember = 113, RULE_propertySignature = 114, 
		RULE_methodSignature = 115, RULE_parameterList = 116, RULE_parameter2 = 117, 
		RULE_onbutton = 118, RULE_arrayvalue = 119, RULE_decorator = 120, RULE_propertyAssignment = 121, 
		RULE_expressionList = 122, RULE_ngOnInit = 123, RULE_routeParamAssignment = 124, 
		RULE_indexAccess = 125, RULE_unaryPlus = 126, RULE_formGroupInitialization = 127, 
		RULE_formGroupBody = 128, RULE_formControlFields = 129, RULE_formControlField = 130, 
		RULE_formControlArgs = 131, RULE_validatorExpression = 132, RULE_validator = 133, 
		RULE_lambdaExpression = 134, RULE_parameters = 135, RULE_functionBody = 136, 
		RULE_returnStatement = 137, RULE_htmlElement = 138, RULE_htmlElementassist = 139, 
		RULE_formElement = 140, RULE_formControlElement = 141, RULE_fixedtqg = 142, 
		RULE_closefixedtag = 143, RULE_standardHtmlElement = 144, RULE_selfClosingHtmlElement = 145, 
		RULE_fixedHtmlElement = 146, RULE_angularButton = 147, RULE_opentag = 148, 
		RULE_closetag = 149, RULE_fixedTagName = 150, RULE_htmlAttribute = 151, 
		RULE_bindingSyntax = 152, RULE_ff = 153, RULE_propertyBinding = 154, RULE_bindingIdentifier = 155, 
		RULE_ngIf = 156, RULE_ngfor = 157, RULE_htmlContent = 158, RULE_errorNode = 159, 
		RULE_interp = 160, RULE_identifierChain = 161, RULE_eventBinding = 162, 
		RULE_textNode = 163, RULE_stylesheet = 164, RULE_ruleSet = 165, RULE_selector1 = 166, 
		RULE_classSelector = 167, RULE_idSelector = 168, RULE_pseudoClassSelector = 169, 
		RULE_declaration = 170, RULE_property = 171, RULE_value1 = 172, RULE_cssFunction = 173;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "application", "importStatement", "keyimport", "component", 
			"injectable", "ngModuleDecorator", "ngModuleProperty", "ngModuleValue", 
			"ngModuleElement", "propertyAccessFunctionCall", "routeDefinition", "routeItem", 
			"metadata", "metadataEntry", "providin", "templateurl", "selector", "basicMetadata", 
			"htmlMetadata", "styleUrl", "classDeclaration", "classInheritance", "extendClause", 
			"implementClause", "getproduct", "privateMethodDeclaration", "products", 
			"elementList", "element", "pair", "value", "basevalue", "classBody", 
			"addProductMethod", "variableDeclaration", "expressionStatement", "assignment", 
			"deleteProductMethod", "productParameter", "constStatement", "subjectNextStatement", 
			"spreadExpression", "arrayElements", "subjectFilterStatement", "filterAssignment", 
			"simpleNextCall", "filterExpression", "euals", "methodBody", "propertyAccessChain", 
			"idParameter", "propertyDeclaration", "observablePropertyDeclaration", 
			"observableExpression", "observableMethod", "behaviorSubjectDeclaration", 
			"typeSpec", "typeany", "typeidintfir", "initialValue", "regularProperty", 
			"letDeclaration", "typeVarible", "emptyArrayDeclaration", "constructor", 
			"serviceAssignment", "serviceCall", "methodInvocation", "getProductByIdMethod", 
			"returnType", "viewdetails", "loopStatement", "whileStatement", "switchStatement", 
			"ifStatement", "ifCondition", "equalityExpression", "caseClause", "functionDeclaration", 
			"functionB", "propertystatment", "methodDeclaration", "parameter", "modifiers", 
			"addProductFunction", "formGroupDeclaration", "formGroupAssignment", 
			"formGroupFields", "formGroupField", "formControlInit", "statement", 
			"expression", "methodCall", "optionalChain", "objectLiteral", "objectProperty", 
			"primaryExpression", "binaryOp", "unaryOp", "propertyAccess", "fundetails", 
			"fundetd", "asObservableCall", "calfun", "iddot", "functhis", "functionCall", 
			"selectProduct", "argumentList", "arrayLiteral", "interfaceDeclaration", 
			"interfaceBody", "interfaceMember", "propertySignature", "methodSignature", 
			"parameterList", "parameter2", "onbutton", "arrayvalue", "decorator", 
			"propertyAssignment", "expressionList", "ngOnInit", "routeParamAssignment", 
			"indexAccess", "unaryPlus", "formGroupInitialization", "formGroupBody", 
			"formControlFields", "formControlField", "formControlArgs", "validatorExpression", 
			"validator", "lambdaExpression", "parameters", "functionBody", "returnStatement", 
			"htmlElement", "htmlElementassist", "formElement", "formControlElement", 
			"fixedtqg", "closefixedtag", "standardHtmlElement", "selfClosingHtmlElement", 
			"fixedHtmlElement", "angularButton", "opentag", "closetag", "fixedTagName", 
			"htmlAttribute", "bindingSyntax", "ff", "propertyBinding", "bindingIdentifier", 
			"ngIf", "ngfor", "htmlContent", "errorNode", "interp", "identifierChain", 
			"eventBinding", "textNode", "stylesheet", "ruleSet", "selector1", "classSelector", 
			"idSelector", "pseudoClassSelector", "declaration", "property", "value1", 
			"cssFunction"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", null, "'Routes'", "'from'", "'export'", "'class'", 
			"'for'", null, "'imports'", "'exports'", "'function'", "'console'", "'log'", 
			"'while'", "'switch'", "'case'", "'default'", "'interface'", "'let'", 
			"'const'", "'var'", "'in'", "'if'", "'else'", "'viewDetails'", "'@'", 
			"'=>'", "'input'", "'BehaviorSubject'", "'formControlName'", "'formGroup'", 
			"'placeholder'", "'providedIn'", "'selector'", "'template'", "'templateUrl'", 
			"'styleUrls'", "'any'", "'?.'", "'constructor'", "'selectProduct'", "'ngOnInit'", 
			"'this'", "'array'", "'private'", "'public'", "'FormGroup'", "'FormControl'", 
			"'onSubmit'", "'next'", "'filter'", "'addProduct'", "'deleteProduct'", 
			"'pathMatch'", "'redirectTo'", "'full'", "'RouterModule'", "'getProductById'", 
			"'routerLink'", "'navigate'", "'path'", "'Observable'", "'asObservable'", 
			"'Validators'", "'protected'", "'textarea'", "'exportas'", "'@Injectable'", 
			"'getProducts'", "'onButtonClick'", "'button'", "'snapshot'", "'params'", 
			"'void'", "'return'", "'@Input'", "'@Output'", "'new'", null, "'implements'", 
			"'extends'", "'OnInit'", "'{'", "'}'", "'{{'", "'}}'", "'['", "']'", 
			"'('", "')'", "':'", "','", "';'", "'!'", "'='", "'|'", null, "'#'", 
			"'!='", "'!=='", "'`'", "'/>'", null, "'++'", "'--'", null, null, null, 
			null, null, null, null, "'<'", "'>'", "'*'", "'/'", "'%'", "'+'", "'-'", 
			"'.'", "'...'", null, "'product'", "'*ngFor'", "'h1'", "'h2'", "'p'", 
			"'div'", "'ul'", "'li'", "'span'", "'img'", "'form'", "'a'", "'(ngSubmit)'", 
			"'*ngIf'", "'null'", "'attvalue_value'", "'</'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMPORT", "COMPONENT", "ROUTES", "FROM", "EXPORT", "CLASS", "FOR", 
			"NG_MODULE", "IMPORTS", "EXPORTS", "FUNICTION", "CONSOLE", "LOG", "WHILE", 
			"SWITCH", "CASE", "DEFAULT", "INTERFACE", "LET", "CONST", "VAR", "IN", 
			"IF", "ELSE", "VIEWDETAILS", "AT", "ARROW", "Input", "BEHAVIOR_SUBJECT", 
			"FORMCONTROLNAME", "FORMGROUPATTR", "PLACEHOLDER", "PROVIDEDIN", "SELECTOR", 
			"TEMPLATE", "TEMPLATEURL", "STYLEURLS", "ANY", "QUESTION_DOT", "CONSTRUCTOR", 
			"SELECTPRODUCT", "NGONINIT", "THIS", "ARRAY", "PRIVATE", "PUBLIC", "FORMGROUP", 
			"FORMCONTROL", "ONSUBMIT", "NEXT", "FILTER", "ADDPRODUCT", "DELETPRODUCT", 
			"PATH_MATCH", "REDIRECT_TO", "FULL", "ROUTER_MODULE", "GETPRODUCTBYID", 
			"ROUTER_LINK", "NAVIGATE", "PATH", "OBSERVABLE", "AS_OBSERVABLE", "VALIDATORS", 
			"PROTECTED", "TEXTAREA", "EXPORTAS", "INJECTABLE", "GET_PRODUCTS", "ONBUTTONCLICK", 
			"BUTTON", "SNAPSHOT", "PARAMS", "VOID", "RETURN", "INPUT", "OUTPUT", 
			"NEW", "UNIT", "IMPLEMENTS", "EXTENDS", "ONINIT", "OPEN_CURLY", "CLOSE_CURLY", 
			"OPEN_DOUBLE_CURLY", "CLOSE_DOUBLE_CURLY", "OPEN_SQUARE", "CLOSE_SQUARE", 
			"OPEN_PAREN", "CLOSE_PAREN", "COLON", "COMMA", "SEMICOLON", "SEMIRATE", 
			"EQUALS", "OR_OPERATOR", "COLOR", "HASH", "NOT_EQUAL", "STRICT_NOT_EQUAL", 
			"BACKTICK", "HHH", "STRING", "PLUS_PLUS", "MINUS_MINUS", "NUMBER", "INTEGER", 
			"PRICE", "IDENTIFIER", "LINE_COMMENT", "BLOCK_COMMENT", "WS", "LESS_THAN", 
			"GREATER_THAN", "STAR", "DIVIDE", "MOD", "PLUS", "MINUS", "DOT", "SPREAD", 
			"LS", "Product", "NG", "H1", "H2", "P", "DIV", "UL", "LI", "SPAN", "IMG", 
			"FORM", "A", "NG_SUBMIT", "NI", "NULL", "ATTVALUE_VALUE", "GG", "ARABIC_TEXT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "AngularParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AngularParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<ApplicationContext> application() {
			return getRuleContexts(ApplicationContext.class);
		}
		public ApplicationContext application(int i) {
			return getRuleContext(ApplicationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IMPORT) | (1L << COMPONENT) | (1L << EXPORT) | (1L << NG_MODULE) | (1L << CONST))) != 0) || _la==INJECTABLE) {
				{
				{
				setState(348);
				application();
				}
				}
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ApplicationContext extends ParserRuleContext {
		public ApplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_application; }
	 
		public ApplicationContext() { }
		public void copyFrom(ApplicationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class INJECTABLELABELContext extends ApplicationContext {
		public InjectableContext injectable() {
			return getRuleContext(InjectableContext.class,0);
		}
		public INJECTABLELABELContext(ApplicationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterINJECTABLELABEL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitINJECTABLELABEL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitINJECTABLELABEL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ROUTELABELContext extends ApplicationContext {
		public RouteDefinitionContext routeDefinition() {
			return getRuleContext(RouteDefinitionContext.class,0);
		}
		public ROUTELABELContext(ApplicationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterROUTELABEL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitROUTELABEL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitROUTELABEL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CLASSLABELContext extends ApplicationContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public CLASSLABELContext(ApplicationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCLASSLABEL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCLASSLABEL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCLASSLABEL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NGMODULLABELContext extends ApplicationContext {
		public NgModuleDecoratorContext ngModuleDecorator() {
			return getRuleContext(NgModuleDecoratorContext.class,0);
		}
		public NGMODULLABELContext(ApplicationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNGMODULLABEL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNGMODULLABEL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNGMODULLABEL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class COMPONENTLABELContext extends ApplicationContext {
		public ComponentContext component() {
			return getRuleContext(ComponentContext.class,0);
		}
		public COMPONENTLABELContext(ApplicationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCOMPONENTLABEL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCOMPONENTLABEL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCOMPONENTLABEL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IMPORTLABELContext extends ApplicationContext {
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public IMPORTLABELContext(ApplicationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIMPORTLABEL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIMPORTLABEL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIMPORTLABEL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApplicationContext application() throws RecognitionException {
		ApplicationContext _localctx = new ApplicationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_application);
		try {
			setState(360);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				_localctx = new IMPORTLABELContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				importStatement();
				}
				break;
			case COMPONENT:
				_localctx = new COMPONENTLABELContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				component();
				}
				break;
			case EXPORT:
				_localctx = new CLASSLABELContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(356);
				classDeclaration();
				}
				break;
			case INJECTABLE:
				_localctx = new INJECTABLELABELContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(357);
				injectable();
				}
				break;
			case CONST:
				_localctx = new ROUTELABELContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(358);
				routeDefinition();
				}
				break;
			case NG_MODULE:
				_localctx = new NGMODULLABELContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(359);
				ngModuleDecorator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(AngularParser.IMPORT, 0); }
		public TerminalNode OPEN_CURLY() { return getToken(AngularParser.OPEN_CURLY, 0); }
		public List<KeyimportContext> keyimport() {
			return getRuleContexts(KeyimportContext.class);
		}
		public KeyimportContext keyimport(int i) {
			return getRuleContext(KeyimportContext.class,i);
		}
		public TerminalNode CLOSE_CURLY() { return getToken(AngularParser.CLOSE_CURLY, 0); }
		public TerminalNode FROM() { return getToken(AngularParser.FROM, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(IMPORT);
			setState(363);
			match(OPEN_CURLY);
			setState(364);
			keyimport();
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(365);
				match(COMMA);
				setState(366);
				keyimport();
				}
				}
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(372);
			match(CLOSE_CURLY);
			setState(373);
			match(FROM);
			setState(374);
			match(STRING);
			setState(375);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyimportContext extends ParserRuleContext {
		public KeyimportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyimport; }
	 
		public KeyimportContext() { }
		public void copyFrom(KeyimportContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class KEYIMPORTLABELContext extends KeyimportContext {
		public TerminalNode ONINIT() { return getToken(AngularParser.ONINIT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TerminalNode FORMGROUP() { return getToken(AngularParser.FORMGROUP, 0); }
		public TerminalNode FORMCONTROL() { return getToken(AngularParser.FORMCONTROL, 0); }
		public TerminalNode VALIDATORS() { return getToken(AngularParser.VALIDATORS, 0); }
		public TerminalNode BEHAVIOR_SUBJECT() { return getToken(AngularParser.BEHAVIOR_SUBJECT, 0); }
		public TerminalNode ROUTER_MODULE() { return getToken(AngularParser.ROUTER_MODULE, 0); }
		public TerminalNode ROUTES() { return getToken(AngularParser.ROUTES, 0); }
		public KEYIMPORTLABELContext(KeyimportContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterKEYIMPORTLABEL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitKEYIMPORTLABEL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitKEYIMPORTLABEL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyimportContext keyimport() throws RecognitionException {
		KeyimportContext _localctx = new KeyimportContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_keyimport);
		try {
			setState(386);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ONINIT:
				_localctx = new KEYIMPORTLABELContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				match(ONINIT);
				}
				break;
			case IDENTIFIER:
				_localctx = new KEYIMPORTLABELContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(378);
				match(IDENTIFIER);
				}
				break;
			case STRING:
				_localctx = new KEYIMPORTLABELContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(379);
				match(STRING);
				}
				break;
			case FORMGROUP:
				_localctx = new KEYIMPORTLABELContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(380);
				match(FORMGROUP);
				}
				break;
			case FORMCONTROL:
				_localctx = new KEYIMPORTLABELContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(381);
				match(FORMCONTROL);
				}
				break;
			case VALIDATORS:
				_localctx = new KEYIMPORTLABELContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(382);
				match(VALIDATORS);
				}
				break;
			case BEHAVIOR_SUBJECT:
				_localctx = new KEYIMPORTLABELContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(383);
				match(BEHAVIOR_SUBJECT);
				}
				break;
			case ROUTER_MODULE:
				_localctx = new KEYIMPORTLABELContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(384);
				match(ROUTER_MODULE);
				}
				break;
			case ROUTES:
				_localctx = new KEYIMPORTLABELContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(385);
				match(ROUTES);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComponentContext extends ParserRuleContext {
		public TerminalNode COMPONENT() { return getToken(AngularParser.COMPONENT, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public TerminalNode OPEN_CURLY() { return getToken(AngularParser.OPEN_CURLY, 0); }
		public MetadataContext metadata() {
			return getRuleContext(MetadataContext.class,0);
		}
		public TerminalNode CLOSE_CURLY() { return getToken(AngularParser.CLOSE_CURLY, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public ComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentContext component() throws RecognitionException {
		ComponentContext _localctx = new ComponentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_component);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(COMPONENT);
			setState(389);
			match(OPEN_PAREN);
			setState(390);
			match(OPEN_CURLY);
			setState(391);
			metadata();
			setState(392);
			match(CLOSE_CURLY);
			setState(393);
			match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InjectableContext extends ParserRuleContext {
		public TerminalNode INJECTABLE() { return getToken(AngularParser.INJECTABLE, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public TerminalNode OPEN_CURLY() { return getToken(AngularParser.OPEN_CURLY, 0); }
		public MetadataContext metadata() {
			return getRuleContext(MetadataContext.class,0);
		}
		public TerminalNode CLOSE_CURLY() { return getToken(AngularParser.CLOSE_CURLY, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public InjectableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_injectable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInjectable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInjectable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInjectable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InjectableContext injectable() throws RecognitionException {
		InjectableContext _localctx = new InjectableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_injectable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(INJECTABLE);
			setState(396);
			match(OPEN_PAREN);
			setState(397);
			match(OPEN_CURLY);
			setState(398);
			metadata();
			setState(399);
			match(CLOSE_CURLY);
			setState(400);
			match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NgModuleDecoratorContext extends ParserRuleContext {
		public TerminalNode NG_MODULE() { return getToken(AngularParser.NG_MODULE, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public TerminalNode OPEN_CURLY() { return getToken(AngularParser.OPEN_CURLY, 0); }
		public List<NgModulePropertyContext> ngModuleProperty() {
			return getRuleContexts(NgModulePropertyContext.class);
		}
		public NgModulePropertyContext ngModuleProperty(int i) {
			return getRuleContext(NgModulePropertyContext.class,i);
		}
		public TerminalNode CLOSE_CURLY() { return getToken(AngularParser.CLOSE_CURLY, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public NgModuleDecoratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngModuleDecorator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNgModuleDecorator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNgModuleDecorator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNgModuleDecorator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgModuleDecoratorContext ngModuleDecorator() throws RecognitionException {
		NgModuleDecoratorContext _localctx = new NgModuleDecoratorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ngModuleDecorator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(NG_MODULE);
			setState(403);
			match(OPEN_PAREN);
			setState(404);
			match(OPEN_CURLY);
			setState(405);
			ngModuleProperty();
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(406);
				match(COMMA);
				setState(407);
				ngModuleProperty();
				}
				}
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(413);
			match(CLOSE_CURLY);
			setState(414);
			match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NgModulePropertyContext extends ParserRuleContext {
		public NgModulePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngModuleProperty; }
	 
		public NgModulePropertyContext() { }
		public void copyFrom(NgModulePropertyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EXPORTS_PROPERTYContext extends NgModulePropertyContext {
		public TerminalNode EXPORTS() { return getToken(AngularParser.EXPORTS, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public NgModuleValueContext ngModuleValue() {
			return getRuleContext(NgModuleValueContext.class,0);
		}
		public EXPORTS_PROPERTYContext(NgModulePropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEXPORTS_PROPERTY(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEXPORTS_PROPERTY(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEXPORTS_PROPERTY(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IMPORTS_PROPERTYContext extends NgModulePropertyContext {
		public TerminalNode IMPORTS() { return getToken(AngularParser.IMPORTS, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public NgModuleValueContext ngModuleValue() {
			return getRuleContext(NgModuleValueContext.class,0);
		}
		public IMPORTS_PROPERTYContext(NgModulePropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIMPORTS_PROPERTY(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIMPORTS_PROPERTY(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIMPORTS_PROPERTY(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgModulePropertyContext ngModuleProperty() throws RecognitionException {
		NgModulePropertyContext _localctx = new NgModulePropertyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ngModuleProperty);
		try {
			setState(422);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORTS:
				_localctx = new IMPORTS_PROPERTYContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(416);
				match(IMPORTS);
				setState(417);
				match(COLON);
				setState(418);
				ngModuleValue();
				}
				break;
			case EXPORTS:
				_localctx = new EXPORTS_PROPERTYContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(419);
				match(EXPORTS);
				setState(420);
				match(COLON);
				setState(421);
				ngModuleValue();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NgModuleValueContext extends ParserRuleContext {
		public TerminalNode OPEN_SQUARE() { return getToken(AngularParser.OPEN_SQUARE, 0); }
		public List<NgModuleElementContext> ngModuleElement() {
			return getRuleContexts(NgModuleElementContext.class);
		}
		public NgModuleElementContext ngModuleElement(int i) {
			return getRuleContext(NgModuleElementContext.class,i);
		}
		public TerminalNode CLOSE_SQUARE() { return getToken(AngularParser.CLOSE_SQUARE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public NgModuleValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngModuleValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNgModuleValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNgModuleValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNgModuleValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgModuleValueContext ngModuleValue() throws RecognitionException {
		NgModuleValueContext _localctx = new NgModuleValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ngModuleValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(OPEN_SQUARE);
			setState(425);
			ngModuleElement();
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(426);
				match(COMMA);
				setState(427);
				ngModuleElement();
				}
				}
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(433);
			match(CLOSE_SQUARE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NgModuleElementContext extends ParserRuleContext {
		public NgModuleElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngModuleElement; }
	 
		public NgModuleElementContext() { }
		public void copyFrom(NgModuleElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ROUTELINKLABELContext extends NgModuleElementContext {
		public TerminalNode ROUTER_LINK() { return getToken(AngularParser.ROUTER_LINK, 0); }
		public ROUTELINKLABELContext(NgModuleElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterROUTELINKLABEL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitROUTELINKLABEL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitROUTELINKLABEL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MODULE_IDENTIFIERContext extends NgModuleElementContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public MODULE_IDENTIFIERContext(NgModuleElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMODULE_IDENTIFIER(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMODULE_IDENTIFIER(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMODULE_IDENTIFIER(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ROUTEMOUDLELBELContext extends NgModuleElementContext {
		public TerminalNode ROUTER_MODULE() { return getToken(AngularParser.ROUTER_MODULE, 0); }
		public ROUTEMOUDLELBELContext(NgModuleElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterROUTEMOUDLELBEL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitROUTEMOUDLELBEL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitROUTEMOUDLELBEL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MODULE_FUNCTION_CALLContext extends NgModuleElementContext {
		public PropertyAccessFunctionCallContext propertyAccessFunctionCall() {
			return getRuleContext(PropertyAccessFunctionCallContext.class,0);
		}
		public MODULE_FUNCTION_CALLContext(NgModuleElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMODULE_FUNCTION_CALL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMODULE_FUNCTION_CALL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMODULE_FUNCTION_CALL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgModuleElementContext ngModuleElement() throws RecognitionException {
		NgModuleElementContext _localctx = new NgModuleElementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ngModuleElement);
		try {
			setState(439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new MODULE_FUNCTION_CALLContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(435);
				propertyAccessFunctionCall();
				}
				break;
			case 2:
				_localctx = new MODULE_IDENTIFIERContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(436);
				match(IDENTIFIER);
				}
				break;
			case 3:
				_localctx = new ROUTEMOUDLELBELContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(437);
				match(ROUTER_MODULE);
				}
				break;
			case 4:
				_localctx = new ROUTELINKLABELContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(438);
				match(ROUTER_LINK);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyAccessFunctionCallContext extends ParserRuleContext {
		public TerminalNode ROUTER_MODULE() { return getToken(AngularParser.ROUTER_MODULE, 0); }
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public PropertyAccessFunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAccessFunctionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPropertyAccessFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPropertyAccessFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPropertyAccessFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyAccessFunctionCallContext propertyAccessFunctionCall() throws RecognitionException {
		PropertyAccessFunctionCallContext _localctx = new PropertyAccessFunctionCallContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_propertyAccessFunctionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(ROUTER_MODULE);
			setState(442);
			match(DOT);
			setState(443);
			match(IDENTIFIER);
			setState(444);
			match(OPEN_PAREN);
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THIS || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (OPEN_CURLY - 83)) | (1L << (OPEN_SQUARE - 83)) | (1L << (OPEN_PAREN - 83)) | (1L << (STRING - 83)) | (1L << (PLUS_PLUS - 83)) | (1L << (MINUS_MINUS - 83)) | (1L << (NUMBER - 83)) | (1L << (INTEGER - 83)) | (1L << (IDENTIFIER - 83)) | (1L << (SPREAD - 83)))) != 0)) {
				{
				setState(445);
				argumentList();
				}
			}

			setState(448);
			match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RouteDefinitionContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(AngularParser.CONST, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode ROUTES() { return getToken(AngularParser.ROUTES, 0); }
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public TerminalNode OPEN_SQUARE() { return getToken(AngularParser.OPEN_SQUARE, 0); }
		public List<RouteItemContext> routeItem() {
			return getRuleContexts(RouteItemContext.class);
		}
		public RouteItemContext routeItem(int i) {
			return getRuleContext(RouteItemContext.class,i);
		}
		public TerminalNode CLOSE_SQUARE() { return getToken(AngularParser.CLOSE_SQUARE, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public RouteDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routeDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterRouteDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitRouteDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitRouteDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RouteDefinitionContext routeDefinition() throws RecognitionException {
		RouteDefinitionContext _localctx = new RouteDefinitionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_routeDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(CONST);
			setState(451);
			match(IDENTIFIER);
			setState(452);
			match(COLON);
			setState(453);
			match(ROUTES);
			setState(454);
			match(EQUALS);
			setState(455);
			match(OPEN_SQUARE);
			setState(456);
			routeItem();
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(457);
				match(COMMA);
				setState(458);
				routeItem();
				}
				}
				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(464);
			match(CLOSE_SQUARE);
			setState(465);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RouteItemContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY() { return getToken(AngularParser.OPEN_CURLY, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(AngularParser.CLOSE_CURLY, 0); }
		public TerminalNode PATH() { return getToken(AngularParser.PATH, 0); }
		public List<TerminalNode> COLON() { return getTokens(AngularParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(AngularParser.COLON, i);
		}
		public List<TerminalNode> STRING() { return getTokens(AngularParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(AngularParser.STRING, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public TerminalNode REDIRECT_TO() { return getToken(AngularParser.REDIRECT_TO, 0); }
		public TerminalNode PATH_MATCH() { return getToken(AngularParser.PATH_MATCH, 0); }
		public RouteItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routeItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterRouteItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitRouteItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitRouteItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RouteItemContext routeItem() throws RecognitionException {
		RouteItemContext _localctx = new RouteItemContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_routeItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			match(OPEN_CURLY);
			{
			{
			setState(468);
			match(PATH);
			setState(469);
			match(COLON);
			setState(470);
			match(STRING);
			setState(471);
			match(COMMA);
			}
			setState(483);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				{
				setState(473);
				match(IDENTIFIER);
				setState(474);
				match(COLON);
				setState(475);
				match(IDENTIFIER);
				}
				}
				break;
			case REDIRECT_TO:
				{
				{
				setState(476);
				match(REDIRECT_TO);
				setState(477);
				match(COLON);
				setState(478);
				match(STRING);
				setState(479);
				match(COMMA);
				setState(480);
				match(PATH_MATCH);
				setState(481);
				match(COLON);
				setState(482);
				match(STRING);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			setState(485);
			match(CLOSE_CURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MetadataContext extends ParserRuleContext {
		public List<MetadataEntryContext> metadataEntry() {
			return getRuleContexts(MetadataEntryContext.class);
		}
		public MetadataEntryContext metadataEntry(int i) {
			return getRuleContext(MetadataEntryContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public MetadataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metadata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMetadata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMetadata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMetadata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetadataContext metadata() throws RecognitionException {
		MetadataContext _localctx = new MetadataContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_metadata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PROVIDEDIN) | (1L << SELECTOR) | (1L << TEMPLATE) | (1L << TEMPLATEURL) | (1L << STYLEURLS))) != 0)) {
				{
				setState(487);
				metadataEntry();
				}
			}

			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(490);
				match(COMMA);
				setState(491);
				metadataEntry();
				}
				}
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MetadataEntryContext extends ParserRuleContext {
		public MetadataEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metadataEntry; }
	 
		public MetadataEntryContext() { }
		public void copyFrom(MetadataEntryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PROVIDINLABELContext extends MetadataEntryContext {
		public ProvidinContext providin() {
			return getRuleContext(ProvidinContext.class,0);
		}
		public PROVIDINLABELContext(MetadataEntryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPROVIDINLABEL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPROVIDINLABEL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPROVIDINLABEL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class STYLEURLLABELContext extends MetadataEntryContext {
		public StyleUrlContext styleUrl() {
			return getRuleContext(StyleUrlContext.class,0);
		}
		public STYLEURLLABELContext(MetadataEntryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSTYLEURLLABEL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSTYLEURLLABEL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSTYLEURLLABEL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SELECTORLABELContext extends MetadataEntryContext {
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public SELECTORLABELContext(MetadataEntryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSELECTORLABEL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSELECTORLABEL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSELECTORLABEL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HtmlMetadataLabelContext extends MetadataEntryContext {
		public HtmlMetadataContext htmlMetadata() {
			return getRuleContext(HtmlMetadataContext.class,0);
		}
		public HtmlMetadataLabelContext(MetadataEntryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlMetadataLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlMetadataLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlMetadataLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BasicMetadataLabelContext extends MetadataEntryContext {
		public BasicMetadataContext basicMetadata() {
			return getRuleContext(BasicMetadataContext.class,0);
		}
		public BasicMetadataLabelContext(MetadataEntryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBasicMetadataLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBasicMetadataLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBasicMetadataLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TAMPLATEURLLABELContext extends MetadataEntryContext {
		public TemplateurlContext templateurl() {
			return getRuleContext(TemplateurlContext.class,0);
		}
		public TAMPLATEURLLABELContext(MetadataEntryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTAMPLATEURLLABEL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTAMPLATEURLLABEL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTAMPLATEURLLABEL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetadataEntryContext metadataEntry() throws RecognitionException {
		MetadataEntryContext _localctx = new MetadataEntryContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_metadataEntry);
		try {
			setState(503);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new BasicMetadataLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(497);
				basicMetadata();
				}
				break;
			case 2:
				_localctx = new HtmlMetadataLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(498);
				htmlMetadata();
				}
				break;
			case 3:
				_localctx = new SELECTORLABELContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(499);
				selector();
				}
				break;
			case 4:
				_localctx = new TAMPLATEURLLABELContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(500);
				templateurl();
				}
				break;
			case 5:
				_localctx = new PROVIDINLABELContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(501);
				providin();
				}
				break;
			case 6:
				_localctx = new STYLEURLLABELContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(502);
				styleUrl();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProvidinContext extends ParserRuleContext {
		public TerminalNode PROVIDEDIN() { return getToken(AngularParser.PROVIDEDIN, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public ProvidinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_providin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterProvidin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitProvidin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitProvidin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProvidinContext providin() throws RecognitionException {
		ProvidinContext _localctx = new ProvidinContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_providin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(PROVIDEDIN);
			setState(506);
			match(COLON);
			setState(507);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateurlContext extends ParserRuleContext {
		public TerminalNode TEMPLATEURL() { return getToken(AngularParser.TEMPLATEURL, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TemplateurlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateurl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTemplateurl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTemplateurl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTemplateurl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateurlContext templateurl() throws RecognitionException {
		TemplateurlContext _localctx = new TemplateurlContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_templateurl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			match(TEMPLATEURL);
			setState(510);
			match(COLON);
			setState(511);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectorContext extends ParserRuleContext {
		public TerminalNode SELECTOR() { return getToken(AngularParser.SELECTOR, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_selector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			match(SELECTOR);
			setState(514);
			match(COLON);
			setState(515);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicMetadataContext extends ParserRuleContext {
		public TerminalNode TEMPLATE() { return getToken(AngularParser.TEMPLATE, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public BasicMetadataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicMetadata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBasicMetadata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBasicMetadata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBasicMetadata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicMetadataContext basicMetadata() throws RecognitionException {
		BasicMetadataContext _localctx = new BasicMetadataContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_basicMetadata);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			match(TEMPLATE);
			setState(518);
			match(COLON);
			setState(519);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlMetadataContext extends ParserRuleContext {
		public TerminalNode TEMPLATE() { return getToken(AngularParser.TEMPLATE, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public List<TerminalNode> BACKTICK() { return getTokens(AngularParser.BACKTICK); }
		public TerminalNode BACKTICK(int i) {
			return getToken(AngularParser.BACKTICK, i);
		}
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public HtmlMetadataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlMetadata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlMetadata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlMetadata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlMetadata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlMetadataContext htmlMetadata() throws RecognitionException {
		HtmlMetadataContext _localctx = new HtmlMetadataContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_htmlMetadata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			match(TEMPLATE);
			setState(522);
			match(COLON);
			setState(523);
			match(BACKTICK);
			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LESS_THAN) {
				{
				{
				setState(524);
				htmlElement();
				}
				}
				setState(529);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(530);
			match(BACKTICK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StyleUrlContext extends ParserRuleContext {
		public TerminalNode STYLEURLS() { return getToken(AngularParser.STYLEURLS, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode OPEN_SQUARE() { return getToken(AngularParser.OPEN_SQUARE, 0); }
		public List<TerminalNode> BACKTICK() { return getTokens(AngularParser.BACKTICK); }
		public TerminalNode BACKTICK(int i) {
			return getToken(AngularParser.BACKTICK, i);
		}
		public TerminalNode CLOSE_SQUARE() { return getToken(AngularParser.CLOSE_SQUARE, 0); }
		public List<StylesheetContext> stylesheet() {
			return getRuleContexts(StylesheetContext.class);
		}
		public StylesheetContext stylesheet(int i) {
			return getRuleContext(StylesheetContext.class,i);
		}
		public StyleUrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleUrl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStyleUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStyleUrl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStyleUrl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleUrlContext styleUrl() throws RecognitionException {
		StyleUrlContext _localctx = new StyleUrlContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_styleUrl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			match(STYLEURLS);
			setState(533);
			match(COLON);
			setState(534);
			match(OPEN_SQUARE);
			setState(535);
			match(BACKTICK);
			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HASH || _la==DOT) {
				{
				{
				setState(536);
				stylesheet();
				}
				}
				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(542);
			match(BACKTICK);
			setState(543);
			match(CLOSE_SQUARE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode EXPORT() { return getToken(AngularParser.EXPORT, 0); }
		public TerminalNode CLASS() { return getToken(AngularParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_CURLY() { return getToken(AngularParser.OPEN_CURLY, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode CLOSE_CURLY() { return getToken(AngularParser.CLOSE_CURLY, 0); }
		public ClassInheritanceContext classInheritance() {
			return getRuleContext(ClassInheritanceContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			match(EXPORT);
			setState(546);
			match(CLASS);
			setState(547);
			match(IDENTIFIER);
			setState(549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS || _la==EXTENDS) {
				{
				setState(548);
				classInheritance();
				}
			}

			setState(551);
			match(OPEN_CURLY);
			setState(552);
			classBody();
			setState(553);
			match(CLOSE_CURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInheritanceContext extends ParserRuleContext {
		public ClassInheritanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInheritance; }
	 
		public ClassInheritanceContext() { }
		public void copyFrom(ClassInheritanceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EXTENDSLABELContext extends ClassInheritanceContext {
		public ExtendClauseContext extendClause() {
			return getRuleContext(ExtendClauseContext.class,0);
		}
		public EXTENDSLABELContext(ClassInheritanceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEXTENDSLABEL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEXTENDSLABEL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEXTENDSLABEL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IMPLEMITIONLABELContext extends ClassInheritanceContext {
		public ImplementClauseContext implementClause() {
			return getRuleContext(ImplementClauseContext.class,0);
		}
		public IMPLEMITIONLABELContext(ClassInheritanceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIMPLEMITIONLABEL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIMPLEMITIONLABEL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIMPLEMITIONLABEL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassInheritanceContext classInheritance() throws RecognitionException {
		ClassInheritanceContext _localctx = new ClassInheritanceContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_classInheritance);
		try {
			setState(557);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXTENDS:
				_localctx = new EXTENDSLABELContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(555);
				extendClause();
				}
				break;
			case IMPLEMENTS:
				_localctx = new IMPLEMITIONLABELContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(556);
				implementClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtendClauseContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(AngularParser.EXTENDS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public ExtendClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExtendClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExtendClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExtendClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendClauseContext extendClause() throws RecognitionException {
		ExtendClauseContext _localctx = new ExtendClauseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_extendClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			match(EXTENDS);
			setState(560);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImplementClauseContext extends ParserRuleContext {
		public TerminalNode IMPLEMENTS() { return getToken(AngularParser.IMPLEMENTS, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public ImplementClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImplementClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImplementClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImplementClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplementClauseContext implementClause() throws RecognitionException {
		ImplementClauseContext _localctx = new ImplementClauseContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_implementClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			match(IMPLEMENTS);
			setState(563);
			value();
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(564);
				match(COMMA);
				setState(565);
				match(IDENTIFIER);
				}
				}
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GetproductContext extends ParserRuleContext {
		public TerminalNode GET_PRODUCTS() { return getToken(AngularParser.GET_PRODUCTS, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_CURLY() { return getToken(AngularParser.OPEN_CURLY, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(AngularParser.CLOSE_CURLY, 0); }
		public TerminalNode RETURN() { return getToken(AngularParser.RETURN, 0); }
		public TerminalNode OPEN_SQUARE() { return getToken(AngularParser.OPEN_SQUARE, 0); }
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public TerminalNode CLOSE_SQUARE() { return getToken(AngularParser.CLOSE_SQUARE, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public PropertyAccessChainContext propertyAccessChain() {
			return getRuleContext(PropertyAccessChainContext.class,0);
		}
		public GetproductContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getproduct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterGetproduct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitGetproduct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitGetproduct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetproductContext getproduct() throws RecognitionException {
		GetproductContext _localctx = new GetproductContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_getproduct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			match(GET_PRODUCTS);
			setState(572);
			match(OPEN_PAREN);
			setState(573);
			match(CLOSE_PAREN);
			setState(574);
			match(OPEN_CURLY);
			setState(585);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(575);
				match(RETURN);
				setState(576);
				match(OPEN_SQUARE);
				setState(577);
				elementList();
				setState(578);
				match(CLOSE_SQUARE);
				setState(579);
				match(SEMICOLON);
				}
				break;
			case 2:
				{
				setState(581);
				match(RETURN);
				setState(582);
				propertyAccessChain();
				setState(583);
				match(SEMICOLON);
				}
				break;
			}
			setState(587);
			match(CLOSE_CURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrivateMethodDeclarationContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_CURLY() { return getToken(AngularParser.OPEN_CURLY, 0); }
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public TerminalNode CLOSE_CURLY() { return getToken(AngularParser.CLOSE_CURLY, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public BasevalueContext basevalue() {
			return getRuleContext(BasevalueContext.class,0);
		}
		public PrivateMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privateMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPrivateMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPrivateMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPrivateMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrivateMethodDeclarationContext privateMethodDeclaration() throws RecognitionException {
		PrivateMethodDeclarationContext _localctx = new PrivateMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_privateMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			modifiers();
			setState(590);
			match(IDENTIFIER);
			setState(591);
			match(OPEN_PAREN);
			setState(592);
			match(CLOSE_PAREN);
			setState(595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(593);
				match(COLON);
				setState(594);
				basevalue();
				}
			}

			setState(597);
			match(OPEN_CURLY);
			setState(598);
			returnStatement();
			setState(599);
			match(CLOSE_CURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProductsContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public TerminalNode OPEN_SQUARE() { return getToken(AngularParser.OPEN_SQUARE, 0); }
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public TerminalNode CLOSE_SQUARE() { return getToken(AngularParser.CLOSE_SQUARE, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public ProductsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_products; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterProducts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitProducts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitProducts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProductsContext products() throws RecognitionException {
		ProductsContext _localctx = new ProductsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_products);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			match(IDENTIFIER);
			setState(602);
			match(EQUALS);
			setState(603);
			match(OPEN_SQUARE);
			setState(604);
			elementList();
			setState(605);
			match(CLOSE_SQUARE);
			setState(606);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementListContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterElementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitElementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitElementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementListContext elementList() throws RecognitionException {
		ElementListContext _localctx = new ElementListContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_elementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			element();
			setState(613);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(609);
				match(COMMA);
				setState(610);
				element();
				}
				}
				setState(615);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY() { return getToken(AngularParser.OPEN_CURLY, 0); }
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public TerminalNode CLOSE_CURLY() { return getToken(AngularParser.CLOSE_CURLY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			match(OPEN_CURLY);
			setState(617);
			pair();
			setState(622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(618);
				match(COMMA);
				setState(619);
				pair();
				}
				}
				setState(624);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(625);
			match(CLOSE_CURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PairContext extends ParserRuleContext {
		public BasevalueContext basevalue() {
			return getRuleContext(BasevalueContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			basevalue();
			setState(628);
			match(COLON);
			setState(629);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BASEvalueLABELContext extends ValueContext {
		public BasevalueContext basevalue() {
			return getRuleContext(BasevalueContext.class,0);
		}
		public BASEvalueLABELContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBASEvalueLABEL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBASEvalueLABEL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBASEvalueLABEL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ARRAYTAYPELABELContext extends ValueContext {
		public ArrayvalueContext arrayvalue() {
			return getRuleContext(ArrayvalueContext.class,0);
		}
		public ARRAYTAYPELABELContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterARRAYTAYPELABEL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitARRAYTAYPELABEL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitARRAYTAYPELABEL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_value);
		try {
			setState(633);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new BASEvalueLABELContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(631);
				basevalue();
				}
				break;
			case 2:
				_localctx = new ARRAYTAYPELABELContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(632);
				arrayvalue();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasevalueContext extends ParserRuleContext {
		public BasevalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basevalue; }
	 
		public BasevalueContext() { }
		public void copyFrom(BasevalueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NUMBERLABELContext extends BasevalueContext {
		public TerminalNode NUMBER() { return getToken(AngularParser.NUMBER, 0); }
		public NUMBERLABELContext(BasevalueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNUMBERLABEL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNUMBERLABEL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNUMBERLABEL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ANYLABELContext extends BasevalueContext {
		public TerminalNode ANY() { return getToken(AngularParser.ANY, 0); }
		public ANYLABELContext(BasevalueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterANYLABEL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitANYLABEL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitANYLABEL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FORMGROUPLABELContext extends BasevalueContext {
		public TerminalNode FORMGROUP() { return getToken(AngularParser.FORMGROUP, 0); }
		public FORMGROUPLABELContext(BasevalueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFORMGROUPLABEL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFORMGROUPLABEL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFORMGROUPLABEL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FORMCONTROLLABELContext extends BasevalueContext {
		public TerminalNode FORMCONTROL() { return getToken(AngularParser.FORMCONTROL, 0); }
		public FORMCONTROLLABELContext(BasevalueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFORMCONTROLLABEL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFORMCONTROLLABEL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFORMCONTROLLABEL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VOIDLABELContext extends BasevalueContext {
		public TerminalNode VOID() { return getToken(AngularParser.VOID, 0); }
		public VOIDLABELContext(BasevalueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVOIDLABEL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVOIDLABEL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVOIDLABEL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NULLLABELContext extends BasevalueContext {
		public TerminalNode NULL() { return getToken(AngularParser.NULL, 0); }
		public NULLLABELContext(BasevalueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNULLLABEL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNULLLABEL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNULLLABEL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IDENTIFIRELABELContext extends BasevalueContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public IDENTIFIRELABELContext(BasevalueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIDENTIFIRELABEL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIDENTIFIRELABEL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIDENTIFIRELABEL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ONINITLABELContext extends BasevalueContext {
		public TerminalNode ONINIT() { return getToken(AngularParser.ONINIT, 0); }
		public ONINITLABELContext(BasevalueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterONINITLABEL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitONINITLABEL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitONINITLABEL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class STRINGLABELContext extends BasevalueContext {
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public STRINGLABELContext(BasevalueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSTRINGLABEL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSTRINGLABEL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSTRINGLABEL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasevalueContext basevalue() throws RecognitionException {
		BasevalueContext _localctx = new BasevalueContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_basevalue);
		try {
			setState(644);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new IDENTIFIRELABELContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(635);
				match(IDENTIFIER);
				}
				break;
			case STRING:
				_localctx = new STRINGLABELContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(636);
				match(STRING);
				}
				break;
			case NUMBER:
				_localctx = new NUMBERLABELContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(637);
				match(NUMBER);
				}
				break;
			case ANY:
				_localctx = new ANYLABELContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(638);
				match(ANY);
				}
				break;
			case VOID:
				_localctx = new VOIDLABELContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(639);
				match(VOID);
				}
				break;
			case ONINIT:
				_localctx = new ONINITLABELContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(640);
				match(ONINIT);
				}
				break;
			case NULL:
				_localctx = new NULLLABELContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(641);
				match(NULL);
				}
				break;
			case FORMGROUP:
				_localctx = new FORMGROUPLABELContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(642);
				match(FORMGROUP);
				}
				break;
			case FORMCONTROL:
				_localctx = new FORMCONTROLLABELContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(643);
				match(FORMCONTROL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
	 
		public ClassBodyContext() { }
		public void copyFrom(ClassBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ClassBodyLabelContext extends ClassBodyContext {
		public List<PropertyDeclarationContext> propertyDeclaration() {
			return getRuleContexts(PropertyDeclarationContext.class);
		}
		public PropertyDeclarationContext propertyDeclaration(int i) {
			return getRuleContext(PropertyDeclarationContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public List<ConstructorContext> constructor() {
			return getRuleContexts(ConstructorContext.class);
		}
		public ConstructorContext constructor(int i) {
			return getRuleContext(ConstructorContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<DecoratorContext> decorator() {
			return getRuleContexts(DecoratorContext.class);
		}
		public DecoratorContext decorator(int i) {
			return getRuleContext(DecoratorContext.class,i);
		}
		public List<NgOnInitContext> ngOnInit() {
			return getRuleContexts(NgOnInitContext.class);
		}
		public NgOnInitContext ngOnInit(int i) {
			return getRuleContext(NgOnInitContext.class,i);
		}
		public List<SelectProductContext> selectProduct() {
			return getRuleContexts(SelectProductContext.class);
		}
		public SelectProductContext selectProduct(int i) {
			return getRuleContext(SelectProductContext.class,i);
		}
		public List<OnbuttonContext> onbutton() {
			return getRuleContexts(OnbuttonContext.class);
		}
		public OnbuttonContext onbutton(int i) {
			return getRuleContext(OnbuttonContext.class,i);
		}
		public List<GetproductContext> getproduct() {
			return getRuleContexts(GetproductContext.class);
		}
		public GetproductContext getproduct(int i) {
			return getRuleContext(GetproductContext.class,i);
		}
		public List<ProductsContext> products() {
			return getRuleContexts(ProductsContext.class);
		}
		public ProductsContext products(int i) {
			return getRuleContext(ProductsContext.class,i);
		}
		public List<LambdaExpressionContext> lambdaExpression() {
			return getRuleContexts(LambdaExpressionContext.class);
		}
		public LambdaExpressionContext lambdaExpression(int i) {
			return getRuleContext(LambdaExpressionContext.class,i);
		}
		public List<PropertyAccessContext> propertyAccess() {
			return getRuleContexts(PropertyAccessContext.class);
		}
		public PropertyAccessContext propertyAccess(int i) {
			return getRuleContext(PropertyAccessContext.class,i);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public List<WhileStatementContext> whileStatement() {
			return getRuleContexts(WhileStatementContext.class);
		}
		public WhileStatementContext whileStatement(int i) {
			return getRuleContext(WhileStatementContext.class,i);
		}
		public List<AddProductFunctionContext> addProductFunction() {
			return getRuleContexts(AddProductFunctionContext.class);
		}
		public AddProductFunctionContext addProductFunction(int i) {
			return getRuleContext(AddProductFunctionContext.class,i);
		}
		public List<FormGroupDeclarationContext> formGroupDeclaration() {
			return getRuleContexts(FormGroupDeclarationContext.class);
		}
		public FormGroupDeclarationContext formGroupDeclaration(int i) {
			return getRuleContext(FormGroupDeclarationContext.class,i);
		}
		public List<AddProductMethodContext> addProductMethod() {
			return getRuleContexts(AddProductMethodContext.class);
		}
		public AddProductMethodContext addProductMethod(int i) {
			return getRuleContext(AddProductMethodContext.class,i);
		}
		public List<DeleteProductMethodContext> deleteProductMethod() {
			return getRuleContexts(DeleteProductMethodContext.class);
		}
		public DeleteProductMethodContext deleteProductMethod(int i) {
			return getRuleContext(DeleteProductMethodContext.class,i);
		}
		public List<PrivateMethodDeclarationContext> privateMethodDeclaration() {
			return getRuleContexts(PrivateMethodDeclarationContext.class);
		}
		public PrivateMethodDeclarationContext privateMethodDeclaration(int i) {
			return getRuleContext(PrivateMethodDeclarationContext.class,i);
		}
		public List<GetProductByIdMethodContext> getProductByIdMethod() {
			return getRuleContexts(GetProductByIdMethodContext.class);
		}
		public GetProductByIdMethodContext getProductByIdMethod(int i) {
			return getRuleContext(GetProductByIdMethodContext.class,i);
		}
		public List<ViewdetailsContext> viewdetails() {
			return getRuleContexts(ViewdetailsContext.class);
		}
		public ViewdetailsContext viewdetails(int i) {
			return getRuleContext(ViewdetailsContext.class,i);
		}
		public List<FormGroupAssignmentContext> formGroupAssignment() {
			return getRuleContexts(FormGroupAssignmentContext.class);
		}
		public FormGroupAssignmentContext formGroupAssignment(int i) {
			return getRuleContext(FormGroupAssignmentContext.class,i);
		}
		public ClassBodyLabelContext(ClassBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassBodyLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassBodyLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassBodyLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_classBody);
		int _la;
		try {
			_localctx = new ClassBodyLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << FUNICTION) | (1L << CONSOLE) | (1L << WHILE) | (1L << SWITCH) | (1L << LET) | (1L << CONST) | (1L << VAR) | (1L << IF) | (1L << VIEWDETAILS) | (1L << CONSTRUCTOR) | (1L << SELECTPRODUCT) | (1L << NGONINIT) | (1L << THIS) | (1L << PRIVATE) | (1L << PUBLIC) | (1L << ONSUBMIT) | (1L << ADDPRODUCT) | (1L << DELETPRODUCT) | (1L << GETPRODUCTBYID))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PROTECTED - 65)) | (1L << (GET_PRODUCTS - 65)) | (1L << (ONBUTTONCLICK - 65)) | (1L << (RETURN - 65)) | (1L << (OUTPUT - 65)) | (1L << (OPEN_CURLY - 65)) | (1L << (OPEN_SQUARE - 65)) | (1L << (OPEN_PAREN - 65)) | (1L << (STRING - 65)) | (1L << (PLUS_PLUS - 65)) | (1L << (MINUS_MINUS - 65)) | (1L << (NUMBER - 65)) | (1L << (INTEGER - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (SPREAD - 65)))) != 0)) {
				{
				setState(668);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(646);
					propertyDeclaration();
					}
					break;
				case 2:
					{
					setState(647);
					methodDeclaration();
					}
					break;
				case 3:
					{
					setState(648);
					constructor();
					}
					break;
				case 4:
					{
					setState(649);
					statement();
					}
					break;
				case 5:
					{
					setState(650);
					decorator();
					}
					break;
				case 6:
					{
					setState(651);
					ngOnInit();
					}
					break;
				case 7:
					{
					setState(652);
					selectProduct();
					}
					break;
				case 8:
					{
					setState(653);
					onbutton();
					}
					break;
				case 9:
					{
					setState(654);
					getproduct();
					}
					break;
				case 10:
					{
					setState(655);
					products();
					}
					break;
				case 11:
					{
					setState(656);
					lambdaExpression();
					}
					break;
				case 12:
					{
					setState(657);
					propertyAccess();
					}
					break;
				case 13:
					{
					setState(658);
					functionDeclaration();
					}
					break;
				case 14:
					{
					setState(659);
					whileStatement();
					}
					break;
				case 15:
					{
					setState(660);
					addProductFunction();
					}
					break;
				case 16:
					{
					setState(661);
					formGroupDeclaration();
					}
					break;
				case 17:
					{
					setState(662);
					addProductMethod();
					}
					break;
				case 18:
					{
					setState(663);
					deleteProductMethod();
					}
					break;
				case 19:
					{
					setState(664);
					privateMethodDeclaration();
					}
					break;
				case 20:
					{
					setState(665);
					getProductByIdMethod();
					}
					break;
				case 21:
					{
					setState(666);
					viewdetails();
					}
					break;
				case 22:
					{
					setState(667);
					formGroupAssignment();
					}
					break;
				}
				}
				setState(672);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddProductMethodContext extends ParserRuleContext {
		public TerminalNode ADDPRODUCT() { return getToken(AngularParser.ADDPRODUCT, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public ProductParameterContext productParameter() {
			return getRuleContext(ProductParameterContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_CURLY() { return getToken(AngularParser.OPEN_CURLY, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(AngularParser.CLOSE_CURLY, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode VOID() { return getToken(AngularParser.VOID, 0); }
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<ExpressionStatementContext> expressionStatement() {
			return getRuleContexts(ExpressionStatementContext.class);
		}
		public ExpressionStatementContext expressionStatement(int i) {
			return getRuleContext(ExpressionStatementContext.class,i);
		}
		public List<ReturnStatementContext> returnStatement() {
			return getRuleContexts(ReturnStatementContext.class);
		}
		public ReturnStatementContext returnStatement(int i) {
			return getRuleContext(ReturnStatementContext.class,i);
		}
		public AddProductMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addProductMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAddProductMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAddProductMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAddProductMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddProductMethodContext addProductMethod() throws RecognitionException {
		AddProductMethodContext _localctx = new AddProductMethodContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_addProductMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			match(ADDPRODUCT);
			setState(674);
			match(OPEN_PAREN);
			setState(675);
			productParameter();
			setState(676);
			match(CLOSE_PAREN);
			setState(679);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(677);
				match(COLON);
				setState(678);
				match(VOID);
				}
			}

			setState(681);
			match(OPEN_CURLY);
			setState(687);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONST || _la==THIS || _la==RETURN || _la==IDENTIFIER) {
				{
				setState(685);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONST:
					{
					setState(682);
					variableDeclaration();
					}
					break;
				case THIS:
				case IDENTIFIER:
					{
					setState(683);
					expressionStatement();
					}
					break;
				case RETURN:
					{
					setState(684);
					returnStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(689);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(690);
			match(CLOSE_CURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(AngularParser.CONST, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public PropertyAccessContext propertyAccess() {
			return getRuleContext(PropertyAccessContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			match(CONST);
			setState(693);
			match(IDENTIFIER);
			setState(694);
			match(EQUALS);
			setState(695);
			propertyAccess();
			setState(696);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_expressionStatement);
		try {
			setState(704);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(698);
				methodCall();
				setState(699);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(701);
				assignment();
				setState(702);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public PropertyAccessChainContext propertyAccessChain() {
			return getRuleContext(PropertyAccessChainContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			propertyAccessChain();
			setState(707);
			match(EQUALS);
			setState(708);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteProductMethodContext extends ParserRuleContext {
		public TerminalNode DELETPRODUCT() { return getToken(AngularParser.DELETPRODUCT, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public IdParameterContext idParameter() {
			return getRuleContext(IdParameterContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_CURLY() { return getToken(AngularParser.OPEN_CURLY, 0); }
		public FilterAssignmentContext filterAssignment() {
			return getRuleContext(FilterAssignmentContext.class,0);
		}
		public SimpleNextCallContext simpleNextCall() {
			return getRuleContext(SimpleNextCallContext.class,0);
		}
		public TerminalNode CLOSE_CURLY() { return getToken(AngularParser.CLOSE_CURLY, 0); }
		public DeleteProductMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteProductMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDeleteProductMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDeleteProductMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDeleteProductMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteProductMethodContext deleteProductMethod() throws RecognitionException {
		DeleteProductMethodContext _localctx = new DeleteProductMethodContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_deleteProductMethod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			match(DELETPRODUCT);
			setState(711);
			match(OPEN_PAREN);
			setState(712);
			idParameter();
			setState(713);
			match(CLOSE_PAREN);
			setState(714);
			match(OPEN_CURLY);
			setState(715);
			filterAssignment();
			setState(716);
			simpleNextCall();
			setState(717);
			match(CLOSE_CURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProductParameterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode ANY() { return getToken(AngularParser.ANY, 0); }
		public ProductParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_productParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterProductParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitProductParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitProductParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProductParameterContext productParameter() throws RecognitionException {
		ProductParameterContext _localctx = new ProductParameterContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_productParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			match(IDENTIFIER);
			setState(720);
			match(COLON);
			setState(721);
			match(ANY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstStatementContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(AngularParser.CONST, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public PropertyAccessContext propertyAccess() {
			return getRuleContext(PropertyAccessContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public TerminalNode FILTER() { return getToken(AngularParser.FILTER, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public FilterExpressionContext filterExpression() {
			return getRuleContext(FilterExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public ConstStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterConstStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitConstStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitConstStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstStatementContext constStatement() throws RecognitionException {
		ConstStatementContext _localctx = new ConstStatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_constStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			match(CONST);
			setState(724);
			match(IDENTIFIER);
			setState(725);
			match(EQUALS);
			setState(726);
			propertyAccess();
			setState(733);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(727);
				match(DOT);
				setState(728);
				match(FILTER);
				setState(729);
				match(OPEN_PAREN);
				setState(730);
				filterExpression();
				setState(731);
				match(CLOSE_PAREN);
				}
			}

			setState(735);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubjectNextStatementContext extends ParserRuleContext {
		public PropertyAccessContext propertyAccess() {
			return getRuleContext(PropertyAccessContext.class,0);
		}
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public TerminalNode NEXT() { return getToken(AngularParser.NEXT, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public SpreadExpressionContext spreadExpression() {
			return getRuleContext(SpreadExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public SubjectNextStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subjectNextStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSubjectNextStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSubjectNextStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSubjectNextStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubjectNextStatementContext subjectNextStatement() throws RecognitionException {
		SubjectNextStatementContext _localctx = new SubjectNextStatementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_subjectNextStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			propertyAccess();
			setState(738);
			match(DOT);
			setState(739);
			match(NEXT);
			setState(740);
			match(OPEN_PAREN);
			setState(741);
			spreadExpression();
			setState(742);
			match(CLOSE_PAREN);
			setState(743);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpreadExpressionContext extends ParserRuleContext {
		public TerminalNode SPREAD() { return getToken(AngularParser.SPREAD, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public PropertyAccessContext propertyAccess() {
			return getRuleContext(PropertyAccessContext.class,0);
		}
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public SpreadExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spreadExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSpreadExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSpreadExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSpreadExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpreadExpressionContext spreadExpression() throws RecognitionException {
		SpreadExpressionContext _localctx = new SpreadExpressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_spreadExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(745);
			match(SPREAD);
			setState(750);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(746);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(747);
				propertyAccess();
				}
				break;
			case 3:
				{
				setState(748);
				arrayLiteral();
				}
				break;
			case 4:
				{
				setState(749);
				objectLiteral();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayElementsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public List<TerminalNode> SPREAD() { return getTokens(AngularParser.SPREAD); }
		public TerminalNode SPREAD(int i) {
			return getToken(AngularParser.SPREAD, i);
		}
		public ArrayElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayElementsContext arrayElements() throws RecognitionException {
		ArrayElementsContext _localctx = new ArrayElementsContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_arrayElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			expression(0);
			setState(758);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(753);
				match(COMMA);
				setState(754);
				match(SPREAD);
				setState(755);
				expression(0);
				}
				}
				setState(760);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubjectFilterStatementContext extends ParserRuleContext {
		public List<PropertyAccessContext> propertyAccess() {
			return getRuleContexts(PropertyAccessContext.class);
		}
		public PropertyAccessContext propertyAccess(int i) {
			return getRuleContext(PropertyAccessContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(AngularParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AngularParser.DOT, i);
		}
		public TerminalNode NEXT() { return getToken(AngularParser.NEXT, 0); }
		public List<TerminalNode> OPEN_PAREN() { return getTokens(AngularParser.OPEN_PAREN); }
		public TerminalNode OPEN_PAREN(int i) {
			return getToken(AngularParser.OPEN_PAREN, i);
		}
		public TerminalNode FILTER() { return getToken(AngularParser.FILTER, 0); }
		public FilterExpressionContext filterExpression() {
			return getRuleContext(FilterExpressionContext.class,0);
		}
		public List<TerminalNode> CLOSE_PAREN() { return getTokens(AngularParser.CLOSE_PAREN); }
		public TerminalNode CLOSE_PAREN(int i) {
			return getToken(AngularParser.CLOSE_PAREN, i);
		}
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public SubjectFilterStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subjectFilterStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSubjectFilterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSubjectFilterStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSubjectFilterStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubjectFilterStatementContext subjectFilterStatement() throws RecognitionException {
		SubjectFilterStatementContext _localctx = new SubjectFilterStatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_subjectFilterStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
			propertyAccess();
			setState(762);
			match(DOT);
			setState(763);
			match(NEXT);
			setState(764);
			match(OPEN_PAREN);
			setState(765);
			propertyAccess();
			setState(766);
			match(DOT);
			setState(767);
			match(FILTER);
			setState(768);
			match(OPEN_PAREN);
			setState(769);
			filterExpression();
			setState(770);
			match(CLOSE_PAREN);
			setState(771);
			match(CLOSE_PAREN);
			setState(772);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilterAssignmentContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(AngularParser.CONST, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public PropertyAccessChainContext propertyAccessChain() {
			return getRuleContext(PropertyAccessChainContext.class,0);
		}
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public TerminalNode FILTER() { return getToken(AngularParser.FILTER, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public FilterExpressionContext filterExpression() {
			return getRuleContext(FilterExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public FilterAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFilterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFilterAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFilterAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterAssignmentContext filterAssignment() throws RecognitionException {
		FilterAssignmentContext _localctx = new FilterAssignmentContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_filterAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			match(CONST);
			setState(775);
			match(IDENTIFIER);
			setState(776);
			match(EQUALS);
			setState(777);
			propertyAccessChain();
			setState(778);
			match(DOT);
			setState(779);
			match(FILTER);
			setState(780);
			match(OPEN_PAREN);
			setState(781);
			filterExpression();
			setState(782);
			match(CLOSE_PAREN);
			setState(783);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleNextCallContext extends ParserRuleContext {
		public PropertyAccessContext propertyAccess() {
			return getRuleContext(PropertyAccessContext.class,0);
		}
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public TerminalNode NEXT() { return getToken(AngularParser.NEXT, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public SimpleNextCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleNextCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSimpleNextCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSimpleNextCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSimpleNextCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleNextCallContext simpleNextCall() throws RecognitionException {
		SimpleNextCallContext _localctx = new SimpleNextCallContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_simpleNextCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
			propertyAccess();
			setState(786);
			match(DOT);
			setState(787);
			match(NEXT);
			setState(788);
			match(OPEN_PAREN);
			setState(789);
			expression(0);
			setState(790);
			match(CLOSE_PAREN);
			setState(791);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilterExpressionContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public TerminalNode ARROW() { return getToken(AngularParser.ARROW, 0); }
		public PropertyAccessContext propertyAccess() {
			return getRuleContext(PropertyAccessContext.class,0);
		}
		public EualsContext euals() {
			return getRuleContext(EualsContext.class,0);
		}
		public FilterExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFilterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFilterExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFilterExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterExpressionContext filterExpression() throws RecognitionException {
		FilterExpressionContext _localctx = new FilterExpressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_filterExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			match(IDENTIFIER);
			setState(794);
			match(ARROW);
			setState(795);
			propertyAccess();
			{
			setState(796);
			euals();
			}
			setState(797);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EualsContext extends ParserRuleContext {
		public TerminalNode STRICT_NOT_EQUAL() { return getToken(AngularParser.STRICT_NOT_EQUAL, 0); }
		public List<TerminalNode> EQUALS() { return getTokens(AngularParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(AngularParser.EQUALS, i);
		}
		public TerminalNode NOT_EQUAL() { return getToken(AngularParser.NOT_EQUAL, 0); }
		public EualsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_euals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEuals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEuals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEuals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EualsContext euals() throws RecognitionException {
		EualsContext _localctx = new EualsContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_euals);
		try {
			setState(803);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRICT_NOT_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(799);
				match(STRICT_NOT_EQUAL);
				}
				break;
			case EQUALS:
				enterOuterAlt(_localctx, 2);
				{
				setState(800);
				match(EQUALS);
				setState(801);
				match(EQUALS);
				}
				break;
			case NOT_EQUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(802);
				match(NOT_EQUAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY() { return getToken(AngularParser.OPEN_CURLY, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(AngularParser.CLOSE_CURLY, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_methodBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			match(OPEN_CURLY);
			setState(809);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << CONST) | (1L << VAR) | (1L << IF) | (1L << THIS) | (1L << PRIVATE))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (RETURN - 75)) | (1L << (OPEN_CURLY - 75)) | (1L << (OPEN_SQUARE - 75)) | (1L << (OPEN_PAREN - 75)) | (1L << (STRING - 75)) | (1L << (PLUS_PLUS - 75)) | (1L << (MINUS_MINUS - 75)) | (1L << (NUMBER - 75)) | (1L << (INTEGER - 75)) | (1L << (IDENTIFIER - 75)) | (1L << (SPREAD - 75)))) != 0)) {
				{
				{
				setState(806);
				statement();
				}
				}
				setState(811);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(812);
			match(CLOSE_CURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyAccessChainContext extends ParserRuleContext {
		public PropertyAccessContext propertyAccess() {
			return getRuleContext(PropertyAccessContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(AngularParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AngularParser.DOT, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public List<TerminalNode> FILTER() { return getTokens(AngularParser.FILTER); }
		public TerminalNode FILTER(int i) {
			return getToken(AngularParser.FILTER, i);
		}
		public List<TerminalNode> NEXT() { return getTokens(AngularParser.NEXT); }
		public TerminalNode NEXT(int i) {
			return getToken(AngularParser.NEXT, i);
		}
		public PropertyAccessChainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAccessChain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPropertyAccessChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPropertyAccessChain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPropertyAccessChain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyAccessChainContext propertyAccessChain() throws RecognitionException {
		PropertyAccessChainContext _localctx = new PropertyAccessChainContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_propertyAccessChain);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			propertyAccess();
			setState(817); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(815);
					match(DOT);
					setState(816);
					_la = _input.LA(1);
					if ( !(((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & ((1L << (NEXT - 50)) | (1L << (FILTER - 50)) | (1L << (IDENTIFIER - 50)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(819); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdParameterContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public IdParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIdParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIdParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIdParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdParameterContext idParameter() throws RecognitionException {
		IdParameterContext _localctx = new IdParameterContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_idParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(821);
			match(IDENTIFIER);
			setState(822);
			match(COLON);
			setState(823);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyDeclarationContext extends ParserRuleContext {
		public PropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDeclaration; }
	 
		public PropertyDeclarationContext() { }
		public void copyFrom(PropertyDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VARIBALLABELContext extends PropertyDeclarationContext {
		public LetDeclarationContext letDeclaration() {
			return getRuleContext(LetDeclarationContext.class,0);
		}
		public VARIBALLABELContext(PropertyDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVARIBALLABEL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVARIBALLABEL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVARIBALLABEL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DDDContext extends PropertyDeclarationContext {
		public EmptyArrayDeclarationContext emptyArrayDeclaration() {
			return getRuleContext(EmptyArrayDeclarationContext.class,0);
		}
		public DDDContext(PropertyDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDDD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDDD(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDDD(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PROPIRTYLABELContext extends PropertyDeclarationContext {
		public RegularPropertyContext regularProperty() {
			return getRuleContext(RegularPropertyContext.class,0);
		}
		public PROPIRTYLABELContext(PropertyDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPROPIRTYLABEL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPROPIRTYLABEL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPROPIRTYLABEL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OBSERVABLE_PROPERTYContext extends PropertyDeclarationContext {
		public ObservablePropertyDeclarationContext observablePropertyDeclaration() {
			return getRuleContext(ObservablePropertyDeclarationContext.class,0);
		}
		public OBSERVABLE_PROPERTYContext(PropertyDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOBSERVABLE_PROPERTY(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOBSERVABLE_PROPERTY(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOBSERVABLE_PROPERTY(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BEHAVIOR_SUBJECT_PROPERTYContext extends PropertyDeclarationContext {
		public BehaviorSubjectDeclarationContext behaviorSubjectDeclaration() {
			return getRuleContext(BehaviorSubjectDeclarationContext.class,0);
		}
		public BEHAVIOR_SUBJECT_PROPERTYContext(PropertyDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBEHAVIOR_SUBJECT_PROPERTY(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBEHAVIOR_SUBJECT_PROPERTY(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBEHAVIOR_SUBJECT_PROPERTY(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyDeclarationContext propertyDeclaration() throws RecognitionException {
		PropertyDeclarationContext _localctx = new PropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_propertyDeclaration);
		try {
			setState(830);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				_localctx = new PROPIRTYLABELContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(825);
				regularProperty();
				}
				break;
			case 2:
				_localctx = new VARIBALLABELContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(826);
				letDeclaration();
				}
				break;
			case 3:
				_localctx = new DDDContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(827);
				emptyArrayDeclaration();
				}
				break;
			case 4:
				_localctx = new OBSERVABLE_PROPERTYContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(828);
				observablePropertyDeclaration();
				}
				break;
			case 5:
				_localctx = new BEHAVIOR_SUBJECT_PROPERTYContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(829);
				behaviorSubjectDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObservablePropertyDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public ObservableExpressionContext observableExpression() {
			return getRuleContext(ObservableExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public ObservablePropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_observablePropertyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObservablePropertyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObservablePropertyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObservablePropertyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObservablePropertyDeclarationContext observablePropertyDeclaration() throws RecognitionException {
		ObservablePropertyDeclarationContext _localctx = new ObservablePropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_observablePropertyDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832);
			match(IDENTIFIER);
			setState(833);
			match(EQUALS);
			setState(834);
			observableExpression();
			setState(835);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObservableExpressionContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(AngularParser.THIS, 0); }
		public List<TerminalNode> DOT() { return getTokens(AngularParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AngularParser.DOT, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public List<ObservableMethodContext> observableMethod() {
			return getRuleContexts(ObservableMethodContext.class);
		}
		public ObservableMethodContext observableMethod(int i) {
			return getRuleContext(ObservableMethodContext.class,i);
		}
		public ObservableExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_observableExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObservableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObservableExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObservableExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObservableExpressionContext observableExpression() throws RecognitionException {
		ObservableExpressionContext _localctx = new ObservableExpressionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_observableExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(837);
			match(THIS);
			setState(838);
			match(DOT);
			setState(839);
			match(IDENTIFIER);
			setState(844);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(840);
				match(DOT);
				setState(841);
				observableMethod();
				}
				}
				setState(846);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObservableMethodContext extends ParserRuleContext {
		public TerminalNode AS_OBSERVABLE() { return getToken(AngularParser.AS_OBSERVABLE, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ObservableMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_observableMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObservableMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObservableMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObservableMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObservableMethodContext observableMethod() throws RecognitionException {
		ObservableMethodContext _localctx = new ObservableMethodContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_observableMethod);
		int _la;
		try {
			setState(856);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AS_OBSERVABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(847);
				match(AS_OBSERVABLE);
				setState(848);
				match(OPEN_PAREN);
				setState(849);
				match(CLOSE_PAREN);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(850);
				match(IDENTIFIER);
				setState(851);
				match(OPEN_PAREN);
				setState(853);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THIS || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (OPEN_CURLY - 83)) | (1L << (OPEN_SQUARE - 83)) | (1L << (OPEN_PAREN - 83)) | (1L << (STRING - 83)) | (1L << (PLUS_PLUS - 83)) | (1L << (MINUS_MINUS - 83)) | (1L << (NUMBER - 83)) | (1L << (INTEGER - 83)) | (1L << (IDENTIFIER - 83)) | (1L << (SPREAD - 83)))) != 0)) {
					{
					setState(852);
					argumentList();
					}
				}

				setState(855);
				match(CLOSE_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BehaviorSubjectDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public TerminalNode NEW() { return getToken(AngularParser.NEW, 0); }
		public TerminalNode BEHAVIOR_SUBJECT() { return getToken(AngularParser.BEHAVIOR_SUBJECT, 0); }
		public TerminalNode LESS_THAN() { return getToken(AngularParser.LESS_THAN, 0); }
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public TerminalNode GREATER_THAN() { return getToken(AngularParser.GREATER_THAN, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public InitialValueContext initialValue() {
			return getRuleContext(InitialValueContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public TerminalNode PRIVATE() { return getToken(AngularParser.PRIVATE, 0); }
		public BehaviorSubjectDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_behaviorSubjectDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBehaviorSubjectDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBehaviorSubjectDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBehaviorSubjectDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BehaviorSubjectDeclarationContext behaviorSubjectDeclaration() throws RecognitionException {
		BehaviorSubjectDeclarationContext _localctx = new BehaviorSubjectDeclarationContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_behaviorSubjectDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(859);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIVATE) {
				{
				setState(858);
				match(PRIVATE);
				}
			}

			setState(861);
			match(IDENTIFIER);
			setState(862);
			match(EQUALS);
			setState(863);
			match(NEW);
			setState(864);
			match(BEHAVIOR_SUBJECT);
			setState(865);
			match(LESS_THAN);
			setState(866);
			typeSpec();
			setState(867);
			match(GREATER_THAN);
			setState(868);
			match(OPEN_PAREN);
			setState(869);
			initialValue();
			setState(870);
			match(CLOSE_PAREN);
			setState(871);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeSpecContext extends ParserRuleContext {
		public TypeSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpec; }
	 
		public TypeSpecContext() { }
		public void copyFrom(TypeSpecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TYPEIDENTFIREContext extends TypeSpecContext {
		public TypeidintfirContext typeidintfir() {
			return getRuleContext(TypeidintfirContext.class,0);
		}
		public TYPEIDENTFIREContext(TypeSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTYPEIDENTFIRE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTYPEIDENTFIRE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTYPEIDENTFIRE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TYPEANYLABELSEContext extends TypeSpecContext {
		public TypeanyContext typeany() {
			return getRuleContext(TypeanyContext.class,0);
		}
		public TYPEANYLABELSEContext(TypeSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTYPEANYLABELSE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTYPEANYLABELSE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTYPEANYLABELSE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSpecContext typeSpec() throws RecognitionException {
		TypeSpecContext _localctx = new TypeSpecContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_typeSpec);
		try {
			setState(875);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANY:
				_localctx = new TYPEANYLABELSEContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(873);
				typeany();
				}
				break;
			case IDENTIFIER:
				_localctx = new TYPEIDENTFIREContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(874);
				typeidintfir();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeanyContext extends ParserRuleContext {
		public TerminalNode ANY() { return getToken(AngularParser.ANY, 0); }
		public TerminalNode OPEN_SQUARE() { return getToken(AngularParser.OPEN_SQUARE, 0); }
		public TerminalNode CLOSE_SQUARE() { return getToken(AngularParser.CLOSE_SQUARE, 0); }
		public TypeanyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeany; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTypeany(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTypeany(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTypeany(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeanyContext typeany() throws RecognitionException {
		TypeanyContext _localctx = new TypeanyContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_typeany);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(877);
			match(ANY);
			setState(880);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_SQUARE) {
				{
				setState(878);
				match(OPEN_SQUARE);
				setState(879);
				match(CLOSE_SQUARE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeidintfirContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_SQUARE() { return getToken(AngularParser.OPEN_SQUARE, 0); }
		public TerminalNode CLOSE_SQUARE() { return getToken(AngularParser.CLOSE_SQUARE, 0); }
		public TypeidintfirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeidintfir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTypeidintfir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTypeidintfir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTypeidintfir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeidintfirContext typeidintfir() throws RecognitionException {
		TypeidintfirContext _localctx = new TypeidintfirContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_typeidintfir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(882);
			match(IDENTIFIER);
			setState(885);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_SQUARE) {
				{
				setState(883);
				match(OPEN_SQUARE);
				setState(884);
				match(CLOSE_SQUARE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitialValueContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(AngularParser.THIS, 0); }
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InitialValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInitialValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInitialValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInitialValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitialValueContext initialValue() throws RecognitionException {
		InitialValueContext _localctx = new InitialValueContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_initialValue);
		try {
			setState(891);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(887);
				match(THIS);
				setState(888);
				match(DOT);
				setState(889);
				functionCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(890);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegularPropertyContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RegularPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterRegularProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitRegularProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitRegularProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegularPropertyContext regularProperty() throws RecognitionException {
		RegularPropertyContext _localctx = new RegularPropertyContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_regularProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(893);
			match(IDENTIFIER);
			setState(894);
			match(COLON);
			setState(895);
			value();
			setState(898);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(896);
				match(EQUALS);
				setState(897);
				expression(0);
				}
			}

			setState(900);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetDeclarationContext extends ParserRuleContext {
		public TypeVaribleContext typeVarible() {
			return getRuleContext(TypeVaribleContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public LetDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLetDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLetDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLetDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetDeclarationContext letDeclaration() throws RecognitionException {
		LetDeclarationContext _localctx = new LetDeclarationContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_letDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(902);
			typeVarible();
			setState(903);
			match(IDENTIFIER);
			setState(906);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(904);
				match(COLON);
				setState(905);
				value();
				}
			}

			setState(908);
			match(EQUALS);
			setState(909);
			expression(0);
			setState(910);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeVaribleContext extends ParserRuleContext {
		public TypeVaribleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeVarible; }
	 
		public TypeVaribleContext() { }
		public void copyFrom(TypeVaribleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VARTERMINALLABELContext extends TypeVaribleContext {
		public TerminalNode VAR() { return getToken(AngularParser.VAR, 0); }
		public VARTERMINALLABELContext(TypeVaribleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVARTERMINALLABEL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVARTERMINALLABEL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVARTERMINALLABEL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CONSTTERMINALLABELContext extends TypeVaribleContext {
		public TerminalNode CONST() { return getToken(AngularParser.CONST, 0); }
		public CONSTTERMINALLABELContext(TypeVaribleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCONSTTERMINALLABEL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCONSTTERMINALLABEL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCONSTTERMINALLABEL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LETTERMINALLABELContext extends TypeVaribleContext {
		public TerminalNode LET() { return getToken(AngularParser.LET, 0); }
		public LETTERMINALLABELContext(TypeVaribleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLETTERMINALLABEL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLETTERMINALLABEL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLETTERMINALLABEL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeVaribleContext typeVarible() throws RecognitionException {
		TypeVaribleContext _localctx = new TypeVaribleContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_typeVarible);
		try {
			setState(915);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
				_localctx = new LETTERMINALLABELContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(912);
				match(LET);
				}
				break;
			case VAR:
				_localctx = new VARTERMINALLABELContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(913);
				match(VAR);
				}
				break;
			case CONST:
				_localctx = new CONSTTERMINALLABELContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(914);
				match(CONST);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyArrayDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public List<TerminalNode> OPEN_SQUARE() { return getTokens(AngularParser.OPEN_SQUARE); }
		public TerminalNode OPEN_SQUARE(int i) {
			return getToken(AngularParser.OPEN_SQUARE, i);
		}
		public List<TerminalNode> CLOSE_SQUARE() { return getTokens(AngularParser.CLOSE_SQUARE); }
		public TerminalNode CLOSE_SQUARE(int i) {
			return getToken(AngularParser.CLOSE_SQUARE, i);
		}
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public EmptyArrayDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyArrayDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEmptyArrayDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEmptyArrayDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEmptyArrayDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyArrayDeclarationContext emptyArrayDeclaration() throws RecognitionException {
		EmptyArrayDeclarationContext _localctx = new EmptyArrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_emptyArrayDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(917);
			match(IDENTIFIER);
			setState(918);
			match(COLON);
			setState(919);
			value();
			setState(920);
			match(OPEN_SQUARE);
			setState(921);
			match(CLOSE_SQUARE);
			setState(922);
			match(EQUALS);
			setState(923);
			match(OPEN_SQUARE);
			setState(924);
			match(CLOSE_SQUARE);
			setState(925);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorContext extends ParserRuleContext {
		public TerminalNode CONSTRUCTOR() { return getToken(AngularParser.CONSTRUCTOR, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_CURLY() { return getToken(AngularParser.OPEN_CURLY, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(AngularParser.CLOSE_CURLY, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<ServiceAssignmentContext> serviceAssignment() {
			return getRuleContexts(ServiceAssignmentContext.class);
		}
		public ServiceAssignmentContext serviceAssignment(int i) {
			return getRuleContext(ServiceAssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(927);
			match(CONSTRUCTOR);
			setState(928);
			match(OPEN_PAREN);
			setState(937);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIVATE || _la==PUBLIC || _la==PROTECTED || _la==IDENTIFIER) {
				{
				setState(929);
				parameter();
				setState(934);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(930);
					match(COMMA);
					setState(931);
					parameter();
					}
					}
					setState(936);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(939);
			match(CLOSE_PAREN);
			setState(940);
			match(OPEN_CURLY);
			setState(945);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << CONST) | (1L << VAR) | (1L << IF) | (1L << THIS) | (1L << PRIVATE))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (RETURN - 75)) | (1L << (OPEN_CURLY - 75)) | (1L << (OPEN_SQUARE - 75)) | (1L << (OPEN_PAREN - 75)) | (1L << (STRING - 75)) | (1L << (PLUS_PLUS - 75)) | (1L << (MINUS_MINUS - 75)) | (1L << (NUMBER - 75)) | (1L << (INTEGER - 75)) | (1L << (IDENTIFIER - 75)) | (1L << (SPREAD - 75)))) != 0)) {
				{
				setState(943);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(941);
					statement();
					}
					break;
				case 2:
					{
					setState(942);
					serviceAssignment();
					}
					break;
				}
				}
				setState(947);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(948);
			match(CLOSE_CURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ServiceAssignmentContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(AngularParser.THIS, 0); }
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public ServiceCallContext serviceCall() {
			return getRuleContext(ServiceCallContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ServiceAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serviceAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterServiceAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitServiceAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitServiceAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ServiceAssignmentContext serviceAssignment() throws RecognitionException {
		ServiceAssignmentContext _localctx = new ServiceAssignmentContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_serviceAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(950);
			match(THIS);
			setState(951);
			match(DOT);
			setState(952);
			match(IDENTIFIER);
			setState(953);
			match(EQUALS);
			setState(956);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(954);
				serviceCall();
				}
				break;
			case 2:
				{
				setState(955);
				expression(0);
				}
				break;
			}
			setState(958);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ServiceCallContext extends ParserRuleContext {
		public PropertyAccessChainContext propertyAccessChain() {
			return getRuleContext(PropertyAccessChainContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ServiceCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serviceCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterServiceCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitServiceCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitServiceCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ServiceCallContext serviceCall() throws RecognitionException {
		ServiceCallContext _localctx = new ServiceCallContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_serviceCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(960);
			propertyAccessChain();
			setState(961);
			match(OPEN_PAREN);
			setState(963);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THIS || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (OPEN_CURLY - 83)) | (1L << (OPEN_SQUARE - 83)) | (1L << (OPEN_PAREN - 83)) | (1L << (STRING - 83)) | (1L << (PLUS_PLUS - 83)) | (1L << (MINUS_MINUS - 83)) | (1L << (NUMBER - 83)) | (1L << (INTEGER - 83)) | (1L << (IDENTIFIER - 83)) | (1L << (SPREAD - 83)))) != 0)) {
				{
				setState(962);
				argumentList();
				}
			}

			setState(965);
			match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvocationContext extends ParserRuleContext {
		public PropertyAccessChainContext propertyAccessChain() {
			return getRuleContext(PropertyAccessChainContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public MethodInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMethodInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMethodInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMethodInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodInvocationContext methodInvocation() throws RecognitionException {
		MethodInvocationContext _localctx = new MethodInvocationContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_methodInvocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(967);
			propertyAccessChain();
			setState(968);
			match(OPEN_PAREN);
			setState(970);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THIS || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (OPEN_CURLY - 83)) | (1L << (OPEN_SQUARE - 83)) | (1L << (OPEN_PAREN - 83)) | (1L << (STRING - 83)) | (1L << (PLUS_PLUS - 83)) | (1L << (MINUS_MINUS - 83)) | (1L << (NUMBER - 83)) | (1L << (INTEGER - 83)) | (1L << (IDENTIFIER - 83)) | (1L << (SPREAD - 83)))) != 0)) {
				{
				setState(969);
				argumentList();
				}
			}

			setState(972);
			match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GetProductByIdMethodContext extends ParserRuleContext {
		public TerminalNode GETPRODUCTBYID() { return getToken(AngularParser.GETPRODUCTBYID, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public IdParameterContext idParameter() {
			return getRuleContext(IdParameterContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_CURLY() { return getToken(AngularParser.OPEN_CURLY, 0); }
		public TerminalNode RETURN() { return getToken(AngularParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(AngularParser.CLOSE_CURLY, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public GetProductByIdMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getProductByIdMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterGetProductByIdMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitGetProductByIdMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitGetProductByIdMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetProductByIdMethodContext getProductByIdMethod() throws RecognitionException {
		GetProductByIdMethodContext _localctx = new GetProductByIdMethodContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_getProductByIdMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(974);
			match(GETPRODUCTBYID);
			setState(975);
			match(OPEN_PAREN);
			setState(976);
			idParameter();
			setState(977);
			match(CLOSE_PAREN);
			setState(980);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(978);
				match(COLON);
				setState(979);
				returnType();
				}
			}

			setState(982);
			match(OPEN_CURLY);
			setState(983);
			match(RETURN);
			setState(984);
			expression(0);
			setState(985);
			match(SEMICOLON);
			setState(986);
			match(CLOSE_CURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnTypeContext extends ParserRuleContext {
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
	 
		public ReturnTypeContext() { }
		public void copyFrom(ReturnTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VOIDLABELSINGLEContext extends ReturnTypeContext {
		public TerminalNode VOID() { return getToken(AngularParser.VOID, 0); }
		public VOIDLABELSINGLEContext(ReturnTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVOIDLABELSINGLE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVOIDLABELSINGLE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVOIDLABELSINGLE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TYPESPRCLABELContext extends ReturnTypeContext {
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public TYPESPRCLABELContext(ReturnTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTYPESPRCLABEL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTYPESPRCLABEL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTYPESPRCLABEL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_returnType);
		try {
			setState(990);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANY:
			case IDENTIFIER:
				_localctx = new TYPESPRCLABELContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(988);
				typeSpec();
				}
				break;
			case VOID:
				_localctx = new VOIDLABELSINGLEContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(989);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ViewdetailsContext extends ParserRuleContext {
		public TerminalNode VIEWDETAILS() { return getToken(AngularParser.VIEWDETAILS, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public IdParameterContext idParameter() {
			return getRuleContext(IdParameterContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_CURLY() { return getToken(AngularParser.OPEN_CURLY, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(AngularParser.CLOSE_CURLY, 0); }
		public ViewdetailsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewdetails; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterViewdetails(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitViewdetails(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitViewdetails(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ViewdetailsContext viewdetails() throws RecognitionException {
		ViewdetailsContext _localctx = new ViewdetailsContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_viewdetails);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(992);
			match(VIEWDETAILS);
			setState(993);
			match(OPEN_PAREN);
			setState(994);
			idParameter();
			setState(995);
			match(CLOSE_PAREN);
			setState(996);
			match(OPEN_CURLY);
			setState(997);
			functionCall();
			setState(998);
			match(SEMICOLON);
			setState(999);
			match(CLOSE_CURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopStatementContext extends ParserRuleContext {
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
	 
		public LoopStatementContext() { }
		public void copyFrom(LoopStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FORINContext extends LoopStatementContext {
		public TerminalNode FOR() { return getToken(AngularParser.FOR, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public TerminalNode LET() { return getToken(AngularParser.LET, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public TerminalNode IN() { return getToken(AngularParser.IN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_CURLY() { return getToken(AngularParser.OPEN_CURLY, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(AngularParser.CLOSE_CURLY, 0); }
		public List<TerminalNode> DOT() { return getTokens(AngularParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AngularParser.DOT, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FORINContext(LoopStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFORIN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFORIN(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFORIN(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FORCLASSICContext extends LoopStatementContext {
		public TerminalNode FOR() { return getToken(AngularParser.FOR, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public TerminalNode LET() { return getToken(AngularParser.LET, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(AngularParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(AngularParser.SEMICOLON, i);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public List<TerminalNode> OPEN_CURLY() { return getTokens(AngularParser.OPEN_CURLY); }
		public TerminalNode OPEN_CURLY(int i) {
			return getToken(AngularParser.OPEN_CURLY, i);
		}
		public List<TerminalNode> CLOSE_CURLY() { return getTokens(AngularParser.CLOSE_CURLY); }
		public TerminalNode CLOSE_CURLY(int i) {
			return getToken(AngularParser.CLOSE_CURLY, i);
		}
		public TerminalNode PLUS_PLUS() { return getToken(AngularParser.PLUS_PLUS, 0); }
		public TerminalNode MINUS_MINUS() { return getToken(AngularParser.MINUS_MINUS, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(AngularParser.ELSE, 0); }
		public FORCLASSICContext(LoopStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFORCLASSIC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFORCLASSIC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFORCLASSIC(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_loopStatement);
		int _la;
		try {
			setState(1054);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				_localctx = new FORCLASSICContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1001);
				match(FOR);
				setState(1002);
				match(OPEN_PAREN);
				setState(1003);
				match(LET);
				setState(1004);
				match(IDENTIFIER);
				setState(1005);
				match(EQUALS);
				setState(1006);
				expression(0);
				setState(1007);
				match(SEMICOLON);
				setState(1008);
				expression(0);
				setState(1009);
				match(SEMICOLON);
				setState(1010);
				match(IDENTIFIER);
				setState(1011);
				_la = _input.LA(1);
				if ( !(_la==PLUS_PLUS || _la==MINUS_MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1012);
				match(CLOSE_PAREN);
				setState(1013);
				match(OPEN_CURLY);
				setState(1017);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << CONST) | (1L << VAR) | (1L << IF) | (1L << THIS) | (1L << PRIVATE))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (RETURN - 75)) | (1L << (OPEN_CURLY - 75)) | (1L << (OPEN_SQUARE - 75)) | (1L << (OPEN_PAREN - 75)) | (1L << (STRING - 75)) | (1L << (PLUS_PLUS - 75)) | (1L << (MINUS_MINUS - 75)) | (1L << (NUMBER - 75)) | (1L << (INTEGER - 75)) | (1L << (IDENTIFIER - 75)) | (1L << (SPREAD - 75)))) != 0)) {
					{
					{
					setState(1014);
					statement();
					}
					}
					setState(1019);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1020);
				match(CLOSE_CURLY);
				setState(1030);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1021);
					match(ELSE);
					setState(1022);
					match(OPEN_CURLY);
					setState(1026);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << CONST) | (1L << VAR) | (1L << IF) | (1L << THIS) | (1L << PRIVATE))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (RETURN - 75)) | (1L << (OPEN_CURLY - 75)) | (1L << (OPEN_SQUARE - 75)) | (1L << (OPEN_PAREN - 75)) | (1L << (STRING - 75)) | (1L << (PLUS_PLUS - 75)) | (1L << (MINUS_MINUS - 75)) | (1L << (NUMBER - 75)) | (1L << (INTEGER - 75)) | (1L << (IDENTIFIER - 75)) | (1L << (SPREAD - 75)))) != 0)) {
						{
						{
						setState(1023);
						statement();
						}
						}
						setState(1028);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1029);
					match(CLOSE_CURLY);
					}
				}

				}
				break;
			case 2:
				_localctx = new FORINContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1032);
				match(FOR);
				setState(1033);
				match(OPEN_PAREN);
				setState(1034);
				match(LET);
				setState(1035);
				match(IDENTIFIER);
				setState(1036);
				match(IN);
				setState(1037);
				match(IDENTIFIER);
				setState(1042);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(1038);
					match(DOT);
					setState(1039);
					match(IDENTIFIER);
					}
					}
					setState(1044);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1045);
				match(CLOSE_PAREN);
				setState(1046);
				match(OPEN_CURLY);
				setState(1050);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << CONST) | (1L << VAR) | (1L << IF) | (1L << THIS) | (1L << PRIVATE))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (RETURN - 75)) | (1L << (OPEN_CURLY - 75)) | (1L << (OPEN_SQUARE - 75)) | (1L << (OPEN_PAREN - 75)) | (1L << (STRING - 75)) | (1L << (PLUS_PLUS - 75)) | (1L << (MINUS_MINUS - 75)) | (1L << (NUMBER - 75)) | (1L << (INTEGER - 75)) | (1L << (IDENTIFIER - 75)) | (1L << (SPREAD - 75)))) != 0)) {
					{
					{
					setState(1047);
					statement();
					}
					}
					setState(1052);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1053);
				match(CLOSE_CURLY);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(AngularParser.WHILE, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_CURLY() { return getToken(AngularParser.OPEN_CURLY, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(AngularParser.CLOSE_CURLY, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
			match(WHILE);
			setState(1057);
			match(OPEN_PAREN);
			setState(1058);
			expression(0);
			setState(1059);
			match(CLOSE_PAREN);
			setState(1060);
			match(OPEN_CURLY);
			setState(1064);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << CONST) | (1L << VAR) | (1L << IF) | (1L << THIS) | (1L << PRIVATE))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (RETURN - 75)) | (1L << (OPEN_CURLY - 75)) | (1L << (OPEN_SQUARE - 75)) | (1L << (OPEN_PAREN - 75)) | (1L << (STRING - 75)) | (1L << (PLUS_PLUS - 75)) | (1L << (MINUS_MINUS - 75)) | (1L << (NUMBER - 75)) | (1L << (INTEGER - 75)) | (1L << (IDENTIFIER - 75)) | (1L << (SPREAD - 75)))) != 0)) {
				{
				{
				setState(1061);
				statement();
				}
				}
				setState(1066);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1067);
			match(CLOSE_CURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(AngularParser.SWITCH, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_CURLY() { return getToken(AngularParser.OPEN_CURLY, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(AngularParser.CLOSE_CURLY, 0); }
		public List<CaseClauseContext> caseClause() {
			return getRuleContexts(CaseClauseContext.class);
		}
		public CaseClauseContext caseClause(int i) {
			return getRuleContext(CaseClauseContext.class,i);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1069);
			match(SWITCH);
			setState(1070);
			match(OPEN_PAREN);
			setState(1071);
			expression(0);
			setState(1072);
			match(CLOSE_PAREN);
			setState(1073);
			match(OPEN_CURLY);
			setState(1077);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1074);
				caseClause();
				}
				}
				setState(1079);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1080);
			match(CLOSE_CURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(AngularParser.IF, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public IfConditionContext ifCondition() {
			return getRuleContext(IfConditionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public List<TerminalNode> OPEN_CURLY() { return getTokens(AngularParser.OPEN_CURLY); }
		public TerminalNode OPEN_CURLY(int i) {
			return getToken(AngularParser.OPEN_CURLY, i);
		}
		public List<TerminalNode> CLOSE_CURLY() { return getTokens(AngularParser.CLOSE_CURLY); }
		public TerminalNode CLOSE_CURLY(int i) {
			return getToken(AngularParser.CLOSE_CURLY, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(AngularParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1082);
			match(IF);
			setState(1083);
			match(OPEN_PAREN);
			setState(1084);
			ifCondition();
			setState(1085);
			match(CLOSE_PAREN);
			setState(1086);
			match(OPEN_CURLY);
			setState(1090);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << CONST) | (1L << VAR) | (1L << IF) | (1L << THIS) | (1L << PRIVATE))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (RETURN - 75)) | (1L << (OPEN_CURLY - 75)) | (1L << (OPEN_SQUARE - 75)) | (1L << (OPEN_PAREN - 75)) | (1L << (STRING - 75)) | (1L << (PLUS_PLUS - 75)) | (1L << (MINUS_MINUS - 75)) | (1L << (NUMBER - 75)) | (1L << (INTEGER - 75)) | (1L << (IDENTIFIER - 75)) | (1L << (SPREAD - 75)))) != 0)) {
				{
				{
				setState(1087);
				statement();
				}
				}
				setState(1092);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1093);
			match(CLOSE_CURLY);
			setState(1103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(1094);
				match(ELSE);
				setState(1095);
				match(OPEN_CURLY);
				setState(1099);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << CONST) | (1L << VAR) | (1L << IF) | (1L << THIS) | (1L << PRIVATE))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (RETURN - 75)) | (1L << (OPEN_CURLY - 75)) | (1L << (OPEN_SQUARE - 75)) | (1L << (OPEN_PAREN - 75)) | (1L << (STRING - 75)) | (1L << (PLUS_PLUS - 75)) | (1L << (MINUS_MINUS - 75)) | (1L << (NUMBER - 75)) | (1L << (INTEGER - 75)) | (1L << (IDENTIFIER - 75)) | (1L << (SPREAD - 75)))) != 0)) {
					{
					{
					setState(1096);
					statement();
					}
					}
					setState(1101);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1102);
				match(CLOSE_CURLY);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfConditionContext extends ParserRuleContext {
		public IfConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCondition; }
	 
		public IfConditionContext() { }
		public void copyFrom(IfConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EqualityConditionContext extends IfConditionContext {
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public EqualityConditionContext(IfConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEqualityCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEqualityCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEqualityCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PropertyAccessConditionContext extends IfConditionContext {
		public PropertyAccessContext propertyAccess() {
			return getRuleContext(PropertyAccessContext.class,0);
		}
		public PropertyAccessConditionContext(IfConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPropertyAccessCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPropertyAccessCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPropertyAccessCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfConditionContext ifCondition() throws RecognitionException {
		IfConditionContext _localctx = new IfConditionContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_ifCondition);
		try {
			setState(1107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				_localctx = new PropertyAccessConditionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1105);
				propertyAccess();
				}
				break;
			case 2:
				_localctx = new EqualityConditionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1106);
				equalityExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
	 
		public EqualityExpressionContext() { }
		public void copyFrom(EqualityExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NotEqualityContext extends EqualityExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOT_EQUAL() { return getToken(AngularParser.NOT_EQUAL, 0); }
		public NotEqualityContext(EqualityExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNotEquality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNotEquality(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNotEquality(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StrictEqualityContext extends EqualityExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(AngularParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(AngularParser.EQUALS, i);
		}
		public StrictEqualityContext(EqualityExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStrictEquality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStrictEquality(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStrictEquality(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StrictNotEqualityContext extends EqualityExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode STRICT_NOT_EQUAL() { return getToken(AngularParser.STRICT_NOT_EQUAL, 0); }
		public StrictNotEqualityContext(EqualityExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStrictNotEquality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStrictNotEquality(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStrictNotEquality(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LooseEqualityContext extends EqualityExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(AngularParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(AngularParser.EQUALS, i);
		}
		public LooseEqualityContext(EqualityExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLooseEquality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLooseEquality(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLooseEquality(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_equalityExpression);
		try {
			setState(1128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				_localctx = new StrictEqualityContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1109);
				expression(0);
				setState(1110);
				match(EQUALS);
				setState(1111);
				match(EQUALS);
				setState(1112);
				match(EQUALS);
				setState(1113);
				expression(0);
				}
				break;
			case 2:
				_localctx = new LooseEqualityContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1115);
				expression(0);
				setState(1116);
				match(EQUALS);
				setState(1117);
				match(EQUALS);
				setState(1118);
				expression(0);
				}
				break;
			case 3:
				_localctx = new NotEqualityContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1120);
				expression(0);
				setState(1121);
				match(NOT_EQUAL);
				setState(1122);
				expression(0);
				}
				break;
			case 4:
				_localctx = new StrictNotEqualityContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1124);
				expression(0);
				setState(1125);
				match(STRICT_NOT_EQUAL);
				setState(1126);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseClauseContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(AngularParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode DEFAULT() { return getToken(AngularParser.DEFAULT, 0); }
		public CaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCaseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCaseClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCaseClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseClauseContext caseClause() throws RecognitionException {
		CaseClauseContext _localctx = new CaseClauseContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_caseClause);
		int _la;
		try {
			setState(1147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1130);
				match(CASE);
				setState(1131);
				expression(0);
				setState(1132);
				match(COLON);
				setState(1136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << CONST) | (1L << VAR) | (1L << IF) | (1L << THIS) | (1L << PRIVATE))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (RETURN - 75)) | (1L << (OPEN_CURLY - 75)) | (1L << (OPEN_SQUARE - 75)) | (1L << (OPEN_PAREN - 75)) | (1L << (STRING - 75)) | (1L << (PLUS_PLUS - 75)) | (1L << (MINUS_MINUS - 75)) | (1L << (NUMBER - 75)) | (1L << (INTEGER - 75)) | (1L << (IDENTIFIER - 75)) | (1L << (SPREAD - 75)))) != 0)) {
					{
					{
					setState(1133);
					statement();
					}
					}
					setState(1138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1139);
				match(DEFAULT);
				setState(1140);
				match(COLON);
				setState(1144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << CONST) | (1L << VAR) | (1L << IF) | (1L << THIS) | (1L << PRIVATE))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (RETURN - 75)) | (1L << (OPEN_CURLY - 75)) | (1L << (OPEN_SQUARE - 75)) | (1L << (OPEN_PAREN - 75)) | (1L << (STRING - 75)) | (1L << (PLUS_PLUS - 75)) | (1L << (MINUS_MINUS - 75)) | (1L << (NUMBER - 75)) | (1L << (INTEGER - 75)) | (1L << (IDENTIFIER - 75)) | (1L << (SPREAD - 75)))) != 0)) {
					{
					{
					setState(1141);
					statement();
					}
					}
					setState(1146);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode FUNICTION() { return getToken(AngularParser.FUNICTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public FunctionBContext functionB() {
			return getRuleContext(FunctionBContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1149);
			match(FUNICTION);
			setState(1150);
			match(IDENTIFIER);
			setState(1151);
			match(OPEN_PAREN);
			setState(1153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(1152);
				parameterList();
				}
			}

			setState(1155);
			match(CLOSE_PAREN);
			setState(1156);
			match(COLON);
			setState(1157);
			value();
			setState(1158);
			functionB();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionBContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY() { return getToken(AngularParser.OPEN_CURLY, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(AngularParser.CLOSE_CURLY, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionBContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionB; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBContext functionB() throws RecognitionException {
		FunctionBContext _localctx = new FunctionBContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_functionB);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1160);
			match(OPEN_CURLY);
			setState(1164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << CONST) | (1L << VAR) | (1L << IF) | (1L << THIS) | (1L << PRIVATE))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (RETURN - 75)) | (1L << (OPEN_CURLY - 75)) | (1L << (OPEN_SQUARE - 75)) | (1L << (OPEN_PAREN - 75)) | (1L << (STRING - 75)) | (1L << (PLUS_PLUS - 75)) | (1L << (MINUS_MINUS - 75)) | (1L << (NUMBER - 75)) | (1L << (INTEGER - 75)) | (1L << (IDENTIFIER - 75)) | (1L << (SPREAD - 75)))) != 0)) {
				{
				{
				setState(1161);
				statement();
				}
				}
				setState(1166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1167);
			match(CLOSE_CURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertystatmentContext extends ParserRuleContext {
		public TerminalNode CONSOLE() { return getToken(AngularParser.CONSOLE, 0); }
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public TerminalNode LOG() { return getToken(AngularParser.LOG, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public PropertystatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertystatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPropertystatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPropertystatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPropertystatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertystatmentContext propertystatment() throws RecognitionException {
		PropertystatmentContext _localctx = new PropertystatmentContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_propertystatment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1169);
			match(CONSOLE);
			setState(1170);
			match(DOT);
			setState(1171);
			match(LOG);
			setState(1172);
			match(OPEN_PAREN);
			setState(1173);
			expressionList();
			setState(1174);
			match(CLOSE_PAREN);
			setState(1175);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode OPEN_CURLY() { return getToken(AngularParser.OPEN_CURLY, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(AngularParser.CLOSE_CURLY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1177);
			match(IDENTIFIER);
			setState(1178);
			match(OPEN_PAREN);
			setState(1179);
			parameter();
			setState(1184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1180);
				match(COMMA);
				setState(1181);
				parameter();
				}
				}
				setState(1186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1187);
			match(CLOSE_PAREN);
			setState(1188);
			match(COLON);
			setState(1189);
			value();
			setState(1190);
			match(OPEN_CURLY);
			setState(1194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << CONST) | (1L << VAR) | (1L << IF) | (1L << THIS) | (1L << PRIVATE))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (RETURN - 75)) | (1L << (OPEN_CURLY - 75)) | (1L << (OPEN_SQUARE - 75)) | (1L << (OPEN_PAREN - 75)) | (1L << (STRING - 75)) | (1L << (PLUS_PLUS - 75)) | (1L << (MINUS_MINUS - 75)) | (1L << (NUMBER - 75)) | (1L << (INTEGER - 75)) | (1L << (IDENTIFIER - 75)) | (1L << (SPREAD - 75)))) != 0)) {
				{
				{
				setState(1191);
				statement();
				}
				}
				setState(1196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1197);
			match(CLOSE_CURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (PRIVATE - 45)) | (1L << (PUBLIC - 45)) | (1L << (PROTECTED - 45)))) != 0)) {
				{
				setState(1199);
				modifiers();
				}
			}

			setState(1202);
			match(IDENTIFIER);
			setState(1203);
			match(COLON);
			setState(1204);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifiersContext extends ParserRuleContext {
		public ModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifiers; }
	 
		public ModifiersContext() { }
		public void copyFrom(ModifiersContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TYPEFUNContext extends ModifiersContext {
		public TerminalNode PRIVATE() { return getToken(AngularParser.PRIVATE, 0); }
		public TerminalNode PUBLIC() { return getToken(AngularParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(AngularParser.PROTECTED, 0); }
		public TYPEFUNContext(ModifiersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTYPEFUN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTYPEFUN(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTYPEFUN(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifiersContext modifiers() throws RecognitionException {
		ModifiersContext _localctx = new ModifiersContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_modifiers);
		try {
			setState(1209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIVATE:
				_localctx = new TYPEFUNContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1206);
				match(PRIVATE);
				}
				break;
			case PUBLIC:
				_localctx = new TYPEFUNContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1207);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				_localctx = new TYPEFUNContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1208);
				match(PROTECTED);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddProductFunctionContext extends ParserRuleContext {
		public AddProductFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addProductFunction; }
	 
		public AddProductFunctionContext() { }
		public void copyFrom(AddProductFunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ADDSUBMITLABELContext extends AddProductFunctionContext {
		public TerminalNode ONSUBMIT() { return getToken(AngularParser.ONSUBMIT, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public FunctionBContext functionB() {
			return getRuleContext(FunctionBContext.class,0);
		}
		public ADDSUBMITLABELContext(AddProductFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterADDSUBMITLABEL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitADDSUBMITLABEL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitADDSUBMITLABEL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddProductFunctionContext addProductFunction() throws RecognitionException {
		AddProductFunctionContext _localctx = new AddProductFunctionContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_addProductFunction);
		try {
			_localctx = new ADDSUBMITLABELContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1211);
			match(ONSUBMIT);
			setState(1212);
			match(OPEN_PAREN);
			setState(1213);
			match(CLOSE_PAREN);
			setState(1214);
			functionB();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormGroupDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public List<TerminalNode> FORMGROUP() { return getTokens(AngularParser.FORMGROUP); }
		public TerminalNode FORMGROUP(int i) {
			return getToken(AngularParser.FORMGROUP, i);
		}
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public TerminalNode NEW() { return getToken(AngularParser.NEW, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public FormGroupDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formGroupDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFormGroupDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFormGroupDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFormGroupDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormGroupDeclarationContext formGroupDeclaration() throws RecognitionException {
		FormGroupDeclarationContext _localctx = new FormGroupDeclarationContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_formGroupDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1216);
			match(IDENTIFIER);
			setState(1217);
			match(COLON);
			setState(1218);
			match(FORMGROUP);
			setState(1219);
			match(EQUALS);
			setState(1220);
			match(NEW);
			setState(1221);
			match(FORMGROUP);
			setState(1222);
			match(OPEN_PAREN);
			setState(1223);
			elementList();
			setState(1224);
			match(CLOSE_PAREN);
			setState(1225);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormGroupAssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public TerminalNode NEW() { return getToken(AngularParser.NEW, 0); }
		public TerminalNode FORMGROUP() { return getToken(AngularParser.FORMGROUP, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public TerminalNode OPEN_CURLY() { return getToken(AngularParser.OPEN_CURLY, 0); }
		public FormGroupFieldsContext formGroupFields() {
			return getRuleContext(FormGroupFieldsContext.class,0);
		}
		public TerminalNode CLOSE_CURLY() { return getToken(AngularParser.CLOSE_CURLY, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public FormGroupAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formGroupAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFormGroupAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFormGroupAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFormGroupAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormGroupAssignmentContext formGroupAssignment() throws RecognitionException {
		FormGroupAssignmentContext _localctx = new FormGroupAssignmentContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_formGroupAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1227);
			match(IDENTIFIER);
			setState(1228);
			match(EQUALS);
			setState(1229);
			match(NEW);
			setState(1230);
			match(FORMGROUP);
			setState(1231);
			match(OPEN_PAREN);
			setState(1232);
			match(OPEN_CURLY);
			setState(1233);
			formGroupFields();
			setState(1234);
			match(CLOSE_CURLY);
			setState(1235);
			match(CLOSE_PAREN);
			setState(1236);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormGroupFieldsContext extends ParserRuleContext {
		public FormGroupFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formGroupFields; }
	 
		public FormGroupFieldsContext() { }
		public void copyFrom(FormGroupFieldsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FROMFAILDLABELContext extends FormGroupFieldsContext {
		public List<FormGroupFieldContext> formGroupField() {
			return getRuleContexts(FormGroupFieldContext.class);
		}
		public FormGroupFieldContext formGroupField(int i) {
			return getRuleContext(FormGroupFieldContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public FROMFAILDLABELContext(FormGroupFieldsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFROMFAILDLABEL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFROMFAILDLABEL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFROMFAILDLABEL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormGroupFieldsContext formGroupFields() throws RecognitionException {
		FormGroupFieldsContext _localctx = new FormGroupFieldsContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_formGroupFields);
		int _la;
		try {
			_localctx = new FROMFAILDLABELContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1238);
			formGroupField();
			setState(1243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1239);
				match(COMMA);
				setState(1240);
				formGroupField();
				}
				}
				setState(1245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormGroupFieldContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public FormControlInitContext formControlInit() {
			return getRuleContext(FormControlInitContext.class,0);
		}
		public FormGroupFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formGroupField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFormGroupField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFormGroupField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFormGroupField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormGroupFieldContext formGroupField() throws RecognitionException {
		FormGroupFieldContext _localctx = new FormGroupFieldContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_formGroupField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1246);
			match(IDENTIFIER);
			setState(1247);
			match(COLON);
			setState(1248);
			formControlInit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormControlInitContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(AngularParser.NEW, 0); }
		public TerminalNode FORMCONTROL() { return getToken(AngularParser.FORMCONTROL, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public FormControlArgsContext formControlArgs() {
			return getRuleContext(FormControlArgsContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public FormControlInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formControlInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFormControlInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFormControlInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFormControlInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormControlInitContext formControlInit() throws RecognitionException {
		FormControlInitContext _localctx = new FormControlInitContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_formControlInit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1250);
			match(NEW);
			setState(1251);
			match(FORMCONTROL);
			setState(1252);
			match(OPEN_PAREN);
			setState(1253);
			formControlArgs();
			setState(1254);
			match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LABELED_STATEMENTContext extends StatementContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LABELED_STATEMENTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLABELED_STATEMENT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLABELED_STATEMENT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLABELED_STATEMENT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DDDDEEContext extends StatementContext {
		public ConstStatementContext constStatement() {
			return getRuleContext(ConstStatementContext.class,0);
		}
		public DDDDEEContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDDDDEE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDDDDEE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDDDDEE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RETURN_STATEMENTContext extends StatementContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public RETURN_STATEMENTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterRETURN_STATEMENT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitRETURN_STATEMENT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitRETURN_STATEMENT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DDDDDDDDDDDContext extends StatementContext {
		public SubjectNextStatementContext subjectNextStatement() {
			return getRuleContext(SubjectNextStatementContext.class,0);
		}
		public DDDDDDDDDDDContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDDDDDDDDDDD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDDDDDDDDDDD(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDDDDDDDDDDD(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IF_STATEMENTContext extends StatementContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public IF_STATEMENTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIF_STATEMENT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIF_STATEMENT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIF_STATEMENT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EEEEEEEEEEEEContext extends StatementContext {
		public SubjectFilterStatementContext subjectFilterStatement() {
			return getRuleContext(SubjectFilterStatementContext.class,0);
		}
		public EEEEEEEEEEEEContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEEEEEEEEEEEE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEEEEEEEEEEEE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEEEEEEEEEEEE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FUNCTION_CALL_STATEMENTContext extends StatementContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public FUNCTION_CALL_STATEMENTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFUNCTION_CALL_STATEMENT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFUNCTION_CALL_STATEMENT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFUNCTION_CALL_STATEMENT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EXPRESSION_STATEMENTContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public EXPRESSION_STATEMENTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEXPRESSION_STATEMENT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEXPRESSION_STATEMENT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEXPRESSION_STATEMENT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LOOP_STATEMENTContext extends StatementContext {
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public LOOP_STATEMENTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLOOP_STATEMENT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLOOP_STATEMENT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLOOP_STATEMENT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PROPERTY_ACCESS_STATEMENTContext extends StatementContext {
		public PropertyAccessContext propertyAccess() {
			return getRuleContext(PropertyAccessContext.class,0);
		}
		public PROPERTY_ACCESS_STATEMENTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPROPERTY_ACCESS_STATEMENT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPROPERTY_ACCESS_STATEMENT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPROPERTY_ACCESS_STATEMENT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PROPERTY_DECLARATION_STATEMENTContext extends StatementContext {
		public PropertyDeclarationContext propertyDeclaration() {
			return getRuleContext(PropertyDeclarationContext.class,0);
		}
		public PROPERTY_DECLARATION_STATEMENTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPROPERTY_DECLARATION_STATEMENT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPROPERTY_DECLARATION_STATEMENT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPROPERTY_DECLARATION_STATEMENT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class METHOD_DECLARATION_STATEMENTContext extends StatementContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public METHOD_DECLARATION_STATEMENTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMETHOD_DECLARATION_STATEMENT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMETHOD_DECLARATION_STATEMENT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMETHOD_DECLARATION_STATEMENT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CONSOLE_STATEMENTContext extends StatementContext {
		public PropertystatmentContext propertystatment() {
			return getRuleContext(PropertystatmentContext.class,0);
		}
		public CONSOLE_STATEMENTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCONSOLE_STATEMENT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCONSOLE_STATEMENT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCONSOLE_STATEMENT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SWITCH_STATEMENTContext extends StatementContext {
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public SWITCH_STATEMENTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSWITCH_STATEMENT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSWITCH_STATEMENT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSWITCH_STATEMENT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FROMGROUPLABELContext extends StatementContext {
		public FormGroupInitializationContext formGroupInitialization() {
			return getRuleContext(FormGroupInitializationContext.class,0);
		}
		public FROMGROUPLABELContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFROMGROUPLABEL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFROMGROUPLABEL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFROMGROUPLABEL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ASSIGNMENT_STATEMENTContext extends StatementContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public ASSIGNMENT_STATEMENTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterASSIGNMENT_STATEMENT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitASSIGNMENT_STATEMENT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitASSIGNMENT_STATEMENT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VAR_DECLARATION_STATEMENTContext extends StatementContext {
		public LetDeclarationContext letDeclaration() {
			return getRuleContext(LetDeclarationContext.class,0);
		}
		public VAR_DECLARATION_STATEMENTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVAR_DECLARATION_STATEMENT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVAR_DECLARATION_STATEMENT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVAR_DECLARATION_STATEMENT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_statement);
		try {
			setState(1283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				_localctx = new LABELED_STATEMENTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1256);
				match(IDENTIFIER);
				setState(1257);
				match(COLON);
				setState(1258);
				statement();
				}
				break;
			case 2:
				_localctx = new EXPRESSION_STATEMENTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1259);
				expression(0);
				setState(1260);
				match(SEMICOLON);
				}
				break;
			case 3:
				_localctx = new IF_STATEMENTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1262);
				ifStatement();
				}
				break;
			case 4:
				_localctx = new LOOP_STATEMENTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1263);
				loopStatement();
				}
				break;
			case 5:
				_localctx = new SWITCH_STATEMENTContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1264);
				switchStatement();
				}
				break;
			case 6:
				_localctx = new METHOD_DECLARATION_STATEMENTContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1265);
				methodDeclaration();
				}
				break;
			case 7:
				_localctx = new PROPERTY_DECLARATION_STATEMENTContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1266);
				propertyDeclaration();
				}
				break;
			case 8:
				_localctx = new FUNCTION_CALL_STATEMENTContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1267);
				functionCall();
				setState(1268);
				match(SEMICOLON);
				}
				break;
			case 9:
				_localctx = new ASSIGNMENT_STATEMENTContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1270);
				match(IDENTIFIER);
				setState(1271);
				match(EQUALS);
				setState(1272);
				expression(0);
				setState(1273);
				match(SEMICOLON);
				}
				break;
			case 10:
				_localctx = new RETURN_STATEMENTContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1275);
				returnStatement();
				}
				break;
			case 11:
				_localctx = new PROPERTY_ACCESS_STATEMENTContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1276);
				propertyAccess();
				}
				break;
			case 12:
				_localctx = new CONSOLE_STATEMENTContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(1277);
				propertystatment();
				}
				break;
			case 13:
				_localctx = new VAR_DECLARATION_STATEMENTContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(1278);
				letDeclaration();
				}
				break;
			case 14:
				_localctx = new FROMGROUPLABELContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(1279);
				formGroupInitialization();
				}
				break;
			case 15:
				_localctx = new DDDDEEContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(1280);
				constStatement();
				}
				break;
			case 16:
				_localctx = new DDDDDDDDDDDContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(1281);
				subjectNextStatement();
				}
				break;
			case 17:
				_localctx = new EEEEEEEEEEEEContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(1282);
				subjectFilterStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GHJJKContext extends ExpressionContext {
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public GHJJKContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterGHJJK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitGHJJK(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitGHJJK(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EXP_STRICT_EQUALContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(AngularParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(AngularParser.EQUALS, i);
		}
		public EXP_STRICT_EQUALContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEXP_STRICT_EQUAL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEXP_STRICT_EQUAL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEXP_STRICT_EQUAL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryOperationContext extends ExpressionContext {
		public UnaryOpContext unaryOp() {
			return getRuleContext(UnaryOpContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterUnaryOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitUnaryOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitUnaryOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryOperationContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BinaryOpContext binaryOp() {
			return getRuleContext(BinaryOpContext.class,0);
		}
		public BinaryOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBinaryOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBinaryOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBinaryOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EXPSEMIRATContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMIRATE() { return getToken(AngularParser.SEMIRATE, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode FORMGROUP() { return getToken(AngularParser.FORMGROUP, 0); }
		public EXPSEMIRATContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEXPSEMIRAT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEXPSEMIRAT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEXPSEMIRAT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EXPSTARContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode STAR() { return getToken(AngularParser.STAR, 0); }
		public EXPSTARContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEXPSTAR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEXPSTAR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEXPSTAR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EXPMINUSContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(AngularParser.MINUS, 0); }
		public EXPMINUSContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEXPMINUS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEXPMINUS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEXPMINUS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EXPPROContext extends ExpressionContext {
		public PropertyAccessContext propertyAccess() {
			return getRuleContext(PropertyAccessContext.class,0);
		}
		public EXPPROContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEXPPRO(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEXPPRO(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEXPPRO(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EXP_NOT_EQUALContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOT_EQUAL() { return getToken(AngularParser.NOT_EQUAL, 0); }
		public EXP_NOT_EQUALContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEXP_NOT_EQUAL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEXP_NOT_EQUAL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEXP_NOT_EQUAL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FUNCTIONCALLLABELContext extends ExpressionContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FUNCTIONCALLLABELContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFUNCTIONCALLLABEL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFUNCTIONCALLLABEL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFUNCTIONCALLLABEL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EXPPARENContext extends ExpressionContext {
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public EXPPARENContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEXPPAREN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEXPPAREN(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEXPPAREN(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EXPPLUSContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(AngularParser.PLUS, 0); }
		public EXPPLUSContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEXPPLUS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEXPPLUS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEXPPLUS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EXPLESSContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LESS_THAN() { return getToken(AngularParser.LESS_THAN, 0); }
		public EXPLESSContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEXPLESS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEXPLESS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEXPLESS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayLiteralExprContext extends ExpressionContext {
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ArrayLiteralExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayLiteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayLiteralExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayLiteralExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class KLGILGVILContext extends ExpressionContext {
		public SpreadExpressionContext spreadExpression() {
			return getRuleContext(SpreadExpressionContext.class,0);
		}
		public KLGILGVILContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterKLGILGVIL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitKLGILGVIL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitKLGILGVIL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimaryExprContext extends ExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public PrimaryExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPrimaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPrimaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPrimaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EXPEQUALSContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public EXPEQUALSContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEXPEQUALS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEXPEQUALS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEXPEQUALS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EXP_LOOSE_EQUALContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(AngularParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(AngularParser.EQUALS, i);
		}
		public EXP_LOOSE_EQUALContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEXP_LOOSE_EQUAL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEXP_LOOSE_EQUAL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEXP_LOOSE_EQUAL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EXPGREATERContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GREATER_THAN() { return getToken(AngularParser.GREATER_THAN, 0); }
		public EXPGREATERContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEXPGREATER(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEXPGREATER(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEXPGREATER(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JJJJKKKKContext extends ExpressionContext {
		public OptionalChainContext optionalChain() {
			return getRuleContext(OptionalChainContext.class,0);
		}
		public JJJJKKKKContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterJJJJKKKK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitJJJJKKKK(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitJJJJKKKK(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObjectLiteralExprContext extends ExpressionContext {
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public ObjectLiteralExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectLiteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectLiteralExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectLiteralExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaExprContext extends ExpressionContext {
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public LambdaExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLambdaExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLambdaExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLambdaExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EXPMINMINContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode MINUS_MINUS() { return getToken(AngularParser.MINUS_MINUS, 0); }
		public EXPMINMINContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEXPMINMIN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEXPMINMIN(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEXPMINMIN(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EXP_STRICT_NOT_EQUALContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode STRICT_NOT_EQUAL() { return getToken(AngularParser.STRICT_NOT_EQUAL, 0); }
		public EXP_STRICT_NOT_EQUALContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEXP_STRICT_NOT_EQUAL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEXP_STRICT_NOT_EQUAL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEXP_STRICT_NOT_EQUAL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EXPIDContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public EXPIDContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEXPID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEXPID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEXPID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EXPNUMBERContext extends ExpressionContext {
		public TerminalNode NUMBER() { return getToken(AngularParser.NUMBER, 0); }
		public EXPNUMBERContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEXPNUMBER(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEXPNUMBER(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEXPNUMBER(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EXPINTEGERContext extends ExpressionContext {
		public TerminalNode INTEGER() { return getToken(AngularParser.INTEGER, 0); }
		public EXPINTEGERContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEXPINTEGER(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEXPINTEGER(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEXPINTEGER(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EXPPLUSPLUSContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PLUS_PLUS() { return getToken(AngularParser.PLUS_PLUS, 0); }
		public EXPPLUSPLUSContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEXPPLUSPLUS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEXPPLUSPLUS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEXPPLUSPLUS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EXPDIVIDEContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DIVIDE() { return getToken(AngularParser.DIVIDE, 0); }
		public EXPDIVIDEContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEXPDIVIDE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEXPDIVIDE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEXPDIVIDE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PROP_CHAINContext extends ExpressionContext {
		public PropertyAccessChainContext propertyAccessChain() {
			return getRuleContext(PropertyAccessChainContext.class,0);
		}
		public PROP_CHAINContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPROP_CHAIN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPROP_CHAIN(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPROP_CHAIN(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EXPSTRINGContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public EXPSTRINGContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEXPSTRING(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEXPSTRING(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEXPSTRING(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EXPMODContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MOD() { return getToken(AngularParser.MOD, 0); }
		public EXPMODContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEXPMOD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEXPMOD(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEXPMOD(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 184;
		enterRecursionRule(_localctx, 184, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				_localctx = new LambdaExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1286);
				lambdaExpression();
				}
				break;
			case 2:
				{
				_localctx = new UnaryOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1287);
				unaryOp();
				setState(1288);
				expression(16);
				}
				break;
			case 3:
				{
				_localctx = new FUNCTIONCALLLABELContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1290);
				functionCall();
				}
				break;
			case 4:
				{
				_localctx = new EXPPROContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1291);
				propertyAccess();
				}
				break;
			case 5:
				{
				_localctx = new PROP_CHAINContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1292);
				propertyAccessChain();
				}
				break;
			case 6:
				{
				_localctx = new ObjectLiteralExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1293);
				objectLiteral();
				}
				break;
			case 7:
				{
				_localctx = new ArrayLiteralExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1294);
				arrayLiteral();
				}
				break;
			case 8:
				{
				_localctx = new PrimaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1295);
				primaryExpression();
				}
				break;
			case 9:
				{
				_localctx = new EXPPARENContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1296);
				match(OPEN_PAREN);
				setState(1297);
				expression(0);
				setState(1298);
				match(CLOSE_PAREN);
				}
				break;
			case 10:
				{
				_localctx = new EXPIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1300);
				match(IDENTIFIER);
				}
				break;
			case 11:
				{
				_localctx = new EXPSTRINGContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1301);
				match(STRING);
				}
				break;
			case 12:
				{
				_localctx = new EXPNUMBERContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1302);
				match(NUMBER);
				}
				break;
			case 13:
				{
				_localctx = new EXPINTEGERContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1303);
				match(INTEGER);
				}
				break;
			case 14:
				{
				_localctx = new KLGILGVILContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1304);
				spreadExpression();
				}
				break;
			case 15:
				{
				_localctx = new GHJJKContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1305);
				methodCall();
				}
				break;
			case 16:
				{
				_localctx = new JJJJKKKKContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1306);
				optionalChain();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1362);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1360);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
					case 1:
						{
						_localctx = new EXPPLUSContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1309);
						if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
						setState(1310);
						match(PLUS);
						setState(1311);
						expression(32);
						}
						break;
					case 2:
						{
						_localctx = new EXPMINUSContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1312);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(1313);
						match(MINUS);
						setState(1314);
						expression(31);
						}
						break;
					case 3:
						{
						_localctx = new EXPSTARContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1315);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(1316);
						match(STAR);
						setState(1317);
						expression(30);
						}
						break;
					case 4:
						{
						_localctx = new EXPDIVIDEContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1318);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(1319);
						match(DIVIDE);
						setState(1320);
						expression(29);
						}
						break;
					case 5:
						{
						_localctx = new EXPMODContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1321);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(1322);
						match(MOD);
						setState(1323);
						expression(28);
						}
						break;
					case 6:
						{
						_localctx = new EXPLESSContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1324);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(1325);
						match(LESS_THAN);
						setState(1326);
						expression(27);
						}
						break;
					case 7:
						{
						_localctx = new EXPGREATERContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1327);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1328);
						match(GREATER_THAN);
						setState(1329);
						expression(26);
						}
						break;
					case 8:
						{
						_localctx = new EXPEQUALSContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1330);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1331);
						match(EQUALS);
						setState(1332);
						expression(25);
						}
						break;
					case 9:
						{
						_localctx = new EXP_LOOSE_EQUALContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1333);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1334);
						match(EQUALS);
						setState(1335);
						match(EQUALS);
						setState(1336);
						expression(24);
						}
						break;
					case 10:
						{
						_localctx = new EXP_STRICT_EQUALContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1337);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1338);
						match(EQUALS);
						setState(1339);
						match(EQUALS);
						setState(1340);
						match(EQUALS);
						setState(1341);
						expression(23);
						}
						break;
					case 11:
						{
						_localctx = new EXP_NOT_EQUALContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1342);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1343);
						match(NOT_EQUAL);
						setState(1344);
						expression(22);
						}
						break;
					case 12:
						{
						_localctx = new EXP_STRICT_NOT_EQUALContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1345);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1346);
						match(STRICT_NOT_EQUAL);
						setState(1347);
						expression(21);
						}
						break;
					case 13:
						{
						_localctx = new BinaryOperationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1348);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1349);
						binaryOp();
						setState(1350);
						expression(18);
						}
						break;
					case 14:
						{
						_localctx = new EXPPLUSPLUSContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1352);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1353);
						match(PLUS_PLUS);
						}
						break;
					case 15:
						{
						_localctx = new EXPMINMINContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1354);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1355);
						match(MINUS_MINUS);
						}
						break;
					case 16:
						{
						_localctx = new EXPSEMIRATContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1356);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1357);
						match(SEMIRATE);
						setState(1358);
						match(COLON);
						setState(1359);
						match(FORMGROUP);
						}
						break;
					}
					} 
				}
				setState(1364);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MethodCallContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public PropertyAccessChainContext propertyAccessChain() {
			return getRuleContext(PropertyAccessChainContext.class,0);
		}
		public OptionalChainContext optionalChain() {
			return getRuleContext(OptionalChainContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(1365);
				propertyAccessChain();
				}
				break;
			case 2:
				{
				setState(1366);
				optionalChain();
				}
				break;
			}
			setState(1369);
			match(OPEN_PAREN);
			setState(1371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THIS || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (OPEN_CURLY - 83)) | (1L << (OPEN_SQUARE - 83)) | (1L << (OPEN_PAREN - 83)) | (1L << (STRING - 83)) | (1L << (PLUS_PLUS - 83)) | (1L << (MINUS_MINUS - 83)) | (1L << (NUMBER - 83)) | (1L << (INTEGER - 83)) | (1L << (IDENTIFIER - 83)) | (1L << (SPREAD - 83)))) != 0)) {
				{
				setState(1370);
				argumentList();
				}
			}

			setState(1373);
			match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionalChainContext extends ParserRuleContext {
		public PropertyAccessChainContext propertyAccessChain() {
			return getRuleContext(PropertyAccessChainContext.class,0);
		}
		public List<TerminalNode> QUESTION_DOT() { return getTokens(AngularParser.QUESTION_DOT); }
		public TerminalNode QUESTION_DOT(int i) {
			return getToken(AngularParser.QUESTION_DOT, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public OptionalChainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalChain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOptionalChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOptionalChain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOptionalChain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionalChainContext optionalChain() throws RecognitionException {
		OptionalChainContext _localctx = new OptionalChainContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_optionalChain);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1375);
			propertyAccessChain();
			setState(1378); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1376);
					match(QUESTION_DOT);
					setState(1377);
					match(IDENTIFIER);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1380); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectLiteralContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY() { return getToken(AngularParser.OPEN_CURLY, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(AngularParser.CLOSE_CURLY, 0); }
		public List<SpreadExpressionContext> spreadExpression() {
			return getRuleContexts(SpreadExpressionContext.class);
		}
		public SpreadExpressionContext spreadExpression(int i) {
			return getRuleContext(SpreadExpressionContext.class,i);
		}
		public List<ObjectPropertyContext> objectProperty() {
			return getRuleContexts(ObjectPropertyContext.class);
		}
		public ObjectPropertyContext objectProperty(int i) {
			return getRuleContext(ObjectPropertyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_objectLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1382);
			match(OPEN_CURLY);
			setState(1385);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SPREAD:
				{
				setState(1383);
				spreadExpression();
				}
				break;
			case IDENTIFIER:
				{
				setState(1384);
				objectProperty();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1387);
				match(COMMA);
				setState(1390);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SPREAD:
					{
					setState(1388);
					spreadExpression();
					}
					break;
				case IDENTIFIER:
					{
					setState(1389);
					objectProperty();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(1396);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1397);
			match(CLOSE_CURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectPropertyContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ObjectPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectPropertyContext objectProperty() throws RecognitionException {
		ObjectPropertyContext _localctx = new ObjectPropertyContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_objectProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1399);
			match(IDENTIFIER);
			setState(1400);
			match(COLON);
			setState(1401);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdExprContext extends PrimaryExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public IdExprContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIdExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIdExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIdExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumExprContext extends PrimaryExpressionContext {
		public TerminalNode NUMBER() { return getToken(AngularParser.NUMBER, 0); }
		public NumExprContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNumExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNumExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNumExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThisExprLContext extends PrimaryExpressionContext {
		public TerminalNode THIS() { return getToken(AngularParser.THIS, 0); }
		public ThisExprLContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterThisExprL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitThisExprL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitThisExprL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StrExprContext extends PrimaryExpressionContext {
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public StrExprContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PropAccessExprContext extends PrimaryExpressionContext {
		public PropertyAccessContext propertyAccess() {
			return getRuleContext(PropertyAccessContext.class,0);
		}
		public PropAccessExprContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPropAccessExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPropAccessExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPropAccessExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExprLContext extends PrimaryExpressionContext {
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public ParenExprLContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParenExprL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParenExprL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParenExprL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_primaryExpression);
		try {
			setState(1412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				_localctx = new PropAccessExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1403);
				propertyAccess();
				}
				break;
			case 2:
				_localctx = new IdExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1404);
				match(IDENTIFIER);
				}
				break;
			case 3:
				_localctx = new ThisExprLContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1405);
				match(THIS);
				}
				break;
			case 4:
				_localctx = new StrExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1406);
				match(STRING);
				}
				break;
			case 5:
				_localctx = new NumExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1407);
				match(NUMBER);
				}
				break;
			case 6:
				_localctx = new ParenExprLContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1408);
				match(OPEN_PAREN);
				setState(1409);
				expression(0);
				setState(1410);
				match(CLOSE_PAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryOpContext extends ParserRuleContext {
		public BinaryOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryOp; }
	 
		public BinaryOpContext() { }
		public void copyFrom(BinaryOpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BinaryOpeContext extends BinaryOpContext {
		public TerminalNode PLUS() { return getToken(AngularParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(AngularParser.MINUS, 0); }
		public TerminalNode STAR() { return getToken(AngularParser.STAR, 0); }
		public TerminalNode DIVIDE() { return getToken(AngularParser.DIVIDE, 0); }
		public TerminalNode MOD() { return getToken(AngularParser.MOD, 0); }
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public TerminalNode LESS_THAN() { return getToken(AngularParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(AngularParser.GREATER_THAN, 0); }
		public BinaryOpeContext(BinaryOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBinaryOpe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBinaryOpe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBinaryOpe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryOpContext binaryOp() throws RecognitionException {
		BinaryOpContext _localctx = new BinaryOpContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_binaryOp);
		try {
			setState(1422);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				_localctx = new BinaryOpeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1414);
				match(PLUS);
				}
				break;
			case MINUS:
				_localctx = new BinaryOpeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1415);
				match(MINUS);
				}
				break;
			case STAR:
				_localctx = new BinaryOpeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1416);
				match(STAR);
				}
				break;
			case DIVIDE:
				_localctx = new BinaryOpeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1417);
				match(DIVIDE);
				}
				break;
			case MOD:
				_localctx = new BinaryOpeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1418);
				match(MOD);
				}
				break;
			case EQUALS:
				_localctx = new BinaryOpeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1419);
				match(EQUALS);
				}
				break;
			case LESS_THAN:
				_localctx = new BinaryOpeContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1420);
				match(LESS_THAN);
				}
				break;
			case GREATER_THAN:
				_localctx = new BinaryOpeContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1421);
				match(GREATER_THAN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryOpContext extends ParserRuleContext {
		public TerminalNode PLUS_PLUS() { return getToken(AngularParser.PLUS_PLUS, 0); }
		public TerminalNode MINUS_MINUS() { return getToken(AngularParser.MINUS_MINUS, 0); }
		public UnaryOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterUnaryOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitUnaryOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitUnaryOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryOpContext unaryOp() throws RecognitionException {
		UnaryOpContext _localctx = new UnaryOpContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_unaryOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1424);
			_la = _input.LA(1);
			if ( !(_la==PLUS_PLUS || _la==MINUS_MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyAccessContext extends ParserRuleContext {
		public PropertyAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAccess; }
	 
		public PropertyAccessContext() { }
		public void copyFrom(PropertyAccessContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AS_OBSERVABLE_CALLContext extends PropertyAccessContext {
		public AsObservableCallContext asObservableCall() {
			return getRuleContext(AsObservableCallContext.class,0);
		}
		public AS_OBSERVABLE_CALLContext(PropertyAccessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAS_OBSERVABLE_CALL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAS_OBSERVABLE_CALL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAS_OBSERVABLE_CALL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FUNCTHISLABELContext extends PropertyAccessContext {
		public FuncthisContext functhis() {
			return getRuleContext(FuncthisContext.class,0);
		}
		public FUNCTHISLABELContext(PropertyAccessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFUNCTHISLABEL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFUNCTHISLABEL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFUNCTHISLABEL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IDDOTLABELContext extends PropertyAccessContext {
		public IddotContext iddot() {
			return getRuleContext(IddotContext.class,0);
		}
		public IDDOTLABELContext(PropertyAccessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIDDOTLABEL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIDDOTLABEL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIDDOTLABEL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FUNDETAILSLABContext extends PropertyAccessContext {
		public FundetailsContext fundetails() {
			return getRuleContext(FundetailsContext.class,0);
		}
		public FUNDETAILSLABContext(PropertyAccessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFUNDETAILSLAB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFUNDETAILSLAB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFUNDETAILSLAB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FUNCTIONDContext extends PropertyAccessContext {
		public FundetdContext fundetd() {
			return getRuleContext(FundetdContext.class,0);
		}
		public FUNCTIONDContext(PropertyAccessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFUNCTIOND(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFUNCTIOND(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFUNCTIOND(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CALFUNLABELContext extends PropertyAccessContext {
		public CalfunContext calfun() {
			return getRuleContext(CalfunContext.class,0);
		}
		public CALFUNLABELContext(PropertyAccessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCALFUNLABEL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCALFUNLABEL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCALFUNLABEL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyAccessContext propertyAccess() throws RecognitionException {
		PropertyAccessContext _localctx = new PropertyAccessContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_propertyAccess);
		try {
			setState(1432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				_localctx = new CALFUNLABELContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1426);
				calfun();
				}
				break;
			case 2:
				_localctx = new IDDOTLABELContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1427);
				iddot();
				}
				break;
			case 3:
				_localctx = new FUNCTHISLABELContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1428);
				functhis();
				}
				break;
			case 4:
				_localctx = new AS_OBSERVABLE_CALLContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1429);
				asObservableCall();
				}
				break;
			case 5:
				_localctx = new FUNDETAILSLABContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1430);
				fundetails();
				}
				break;
			case 6:
				_localctx = new FUNCTIONDContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1431);
				fundetd();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FundetailsContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public List<TerminalNode> DOT() { return getTokens(AngularParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AngularParser.DOT, i);
		}
		public TerminalNode NAVIGATE() { return getToken(AngularParser.NAVIGATE, 0); }
		public TerminalNode THIS() { return getToken(AngularParser.THIS, 0); }
		public FundetailsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fundetails; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFundetails(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFundetails(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFundetails(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FundetailsContext fundetails() throws RecognitionException {
		FundetailsContext _localctx = new FundetailsContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_fundetails);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THIS) {
				{
				setState(1434);
				match(THIS);
				setState(1435);
				match(DOT);
				}
			}

			setState(1438);
			match(IDENTIFIER);
			setState(1439);
			match(DOT);
			setState(1440);
			match(NAVIGATE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FundetdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public List<TerminalNode> DOT() { return getTokens(AngularParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AngularParser.DOT, i);
		}
		public TerminalNode ADDPRODUCT() { return getToken(AngularParser.ADDPRODUCT, 0); }
		public TerminalNode THIS() { return getToken(AngularParser.THIS, 0); }
		public FundetdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fundetd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFundetd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFundetd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFundetd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FundetdContext fundetd() throws RecognitionException {
		FundetdContext _localctx = new FundetdContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_fundetd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THIS) {
				{
				setState(1442);
				match(THIS);
				setState(1443);
				match(DOT);
				}
			}

			setState(1446);
			match(IDENTIFIER);
			setState(1447);
			match(DOT);
			setState(1448);
			match(ADDPRODUCT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsObservableCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public TerminalNode AS_OBSERVABLE() { return getToken(AngularParser.AS_OBSERVABLE, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public AsObservableCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asObservableCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAsObservableCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAsObservableCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAsObservableCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsObservableCallContext asObservableCall() throws RecognitionException {
		AsObservableCallContext _localctx = new AsObservableCallContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_asObservableCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1450);
			match(IDENTIFIER);
			setState(1451);
			match(DOT);
			setState(1452);
			match(AS_OBSERVABLE);
			setState(1453);
			match(OPEN_PAREN);
			setState(1454);
			match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CalfunContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(AngularParser.THIS, 0); }
		public List<TerminalNode> DOT() { return getTokens(AngularParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AngularParser.DOT, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public CalfunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calfun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCalfun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCalfun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCalfun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalfunContext calfun() throws RecognitionException {
		CalfunContext _localctx = new CalfunContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_calfun);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1456);
			match(THIS);
			setState(1457);
			match(DOT);
			setState(1458);
			match(IDENTIFIER);
			setState(1463);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1459);
					match(DOT);
					setState(1460);
					match(IDENTIFIER);
					}
					} 
				}
				setState(1465);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IddotContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(AngularParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AngularParser.DOT, i);
		}
		public IddotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iddot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIddot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIddot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIddot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IddotContext iddot() throws RecognitionException {
		IddotContext _localctx = new IddotContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_iddot);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1466);
			match(IDENTIFIER);
			setState(1469); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1467);
					match(DOT);
					setState(1468);
					match(IDENTIFIER);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1471); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncthisContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(AngularParser.THIS, 0); }
		public List<TerminalNode> DOT() { return getTokens(AngularParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AngularParser.DOT, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode GET_PRODUCTS() { return getToken(AngularParser.GET_PRODUCTS, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public FuncthisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functhis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFuncthis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFuncthis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFuncthis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncthisContext functhis() throws RecognitionException {
		FuncthisContext _localctx = new FuncthisContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_functhis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1473);
			match(THIS);
			setState(1474);
			match(DOT);
			setState(1475);
			match(IDENTIFIER);
			setState(1476);
			match(DOT);
			setState(1477);
			match(GET_PRODUCTS);
			setState(1478);
			match(OPEN_PAREN);
			setState(1479);
			match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public PropertyAccessContext propertyAccess() {
			return getRuleContext(PropertyAccessContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1481);
			propertyAccess();
			setState(1482);
			match(OPEN_PAREN);
			setState(1484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THIS || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (OPEN_CURLY - 83)) | (1L << (OPEN_SQUARE - 83)) | (1L << (OPEN_PAREN - 83)) | (1L << (STRING - 83)) | (1L << (PLUS_PLUS - 83)) | (1L << (MINUS_MINUS - 83)) | (1L << (NUMBER - 83)) | (1L << (INTEGER - 83)) | (1L << (IDENTIFIER - 83)) | (1L << (SPREAD - 83)))) != 0)) {
				{
				setState(1483);
				argumentList();
				}
			}

			setState(1486);
			match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectProductContext extends ParserRuleContext {
		public SelectProductContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectProduct; }
	 
		public SelectProductContext() { }
		public void copyFrom(SelectProductContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SELECTPRODUCTLABELContext extends SelectProductContext {
		public TerminalNode SELECTPRODUCT() { return getToken(AngularParser.SELECTPRODUCT, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_CURLY() { return getToken(AngularParser.OPEN_CURLY, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(AngularParser.CLOSE_CURLY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode VOID() { return getToken(AngularParser.VOID, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SELECTPRODUCTLABELContext(SelectProductContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSELECTPRODUCTLABEL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSELECTPRODUCTLABEL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSELECTPRODUCTLABEL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectProductContext selectProduct() throws RecognitionException {
		SelectProductContext _localctx = new SelectProductContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_selectProduct);
		int _la;
		try {
			_localctx = new SELECTPRODUCTLABELContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1488);
			match(SELECTPRODUCT);
			setState(1489);
			match(OPEN_PAREN);
			setState(1490);
			parameter();
			setState(1495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1491);
				match(COMMA);
				setState(1492);
				parameter();
				}
				}
				setState(1497);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1498);
			match(CLOSE_PAREN);
			setState(1501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1499);
				match(COLON);
				setState(1500);
				match(VOID);
				}
			}

			setState(1503);
			match(OPEN_CURLY);
			setState(1507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << CONST) | (1L << VAR) | (1L << IF) | (1L << THIS) | (1L << PRIVATE))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (RETURN - 75)) | (1L << (OPEN_CURLY - 75)) | (1L << (OPEN_SQUARE - 75)) | (1L << (OPEN_PAREN - 75)) | (1L << (STRING - 75)) | (1L << (PLUS_PLUS - 75)) | (1L << (MINUS_MINUS - 75)) | (1L << (NUMBER - 75)) | (1L << (INTEGER - 75)) | (1L << (IDENTIFIER - 75)) | (1L << (SPREAD - 75)))) != 0)) {
				{
				{
				setState(1504);
				statement();
				}
				}
				setState(1509);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1510);
			match(CLOSE_CURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentListContext extends ParserRuleContext {
		public List<SpreadExpressionContext> spreadExpression() {
			return getRuleContexts(SpreadExpressionContext.class);
		}
		public SpreadExpressionContext spreadExpression(int i) {
			return getRuleContext(SpreadExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1514);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(1512);
				spreadExpression();
				}
				break;
			case 2:
				{
				setState(1513);
				expression(0);
				}
				break;
			}
			setState(1523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1516);
				match(COMMA);
				setState(1519);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
				case 1:
					{
					setState(1517);
					spreadExpression();
					}
					break;
				case 2:
					{
					setState(1518);
					expression(0);
					}
					break;
				}
				}
				}
				setState(1525);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayLiteralContext extends ParserRuleContext {
		public TerminalNode OPEN_SQUARE() { return getToken(AngularParser.OPEN_SQUARE, 0); }
		public TerminalNode CLOSE_SQUARE() { return getToken(AngularParser.CLOSE_SQUARE, 0); }
		public List<SpreadExpressionContext> spreadExpression() {
			return getRuleContexts(SpreadExpressionContext.class);
		}
		public SpreadExpressionContext spreadExpression(int i) {
			return getRuleContext(SpreadExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_arrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1526);
			match(OPEN_SQUARE);
			setState(1529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(1527);
				spreadExpression();
				}
				break;
			case 2:
				{
				setState(1528);
				expression(0);
				}
				break;
			}
			setState(1538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1531);
				match(COMMA);
				setState(1534);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(1532);
					spreadExpression();
					}
					break;
				case 2:
					{
					setState(1533);
					expression(0);
					}
					break;
				}
				}
				}
				setState(1540);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1541);
			match(CLOSE_SQUARE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(AngularParser.INTERFACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_CURLY() { return getToken(AngularParser.OPEN_CURLY, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public TerminalNode CLOSE_CURLY() { return getToken(AngularParser.CLOSE_CURLY, 0); }
		public TerminalNode EXPORT() { return getToken(AngularParser.EXPORT, 0); }
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(1543);
				match(EXPORT);
				}
			}

			setState(1546);
			match(INTERFACE);
			setState(1547);
			match(IDENTIFIER);
			setState(1548);
			match(OPEN_CURLY);
			setState(1549);
			interfaceBody();
			setState(1550);
			match(CLOSE_CURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyContext extends ParserRuleContext {
		public List<InterfaceMemberContext> interfaceMember() {
			return getRuleContexts(InterfaceMemberContext.class);
		}
		public InterfaceMemberContext interfaceMember(int i) {
			return getRuleContext(InterfaceMemberContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInterfaceBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInterfaceBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(1552);
				interfaceMember();
				}
				}
				setState(1557);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMemberContext extends ParserRuleContext {
		public PropertySignatureContext propertySignature() {
			return getRuleContext(PropertySignatureContext.class,0);
		}
		public MethodSignatureContext methodSignature() {
			return getRuleContext(MethodSignatureContext.class,0);
		}
		public InterfaceMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInterfaceMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInterfaceMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInterfaceMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMemberContext interfaceMember() throws RecognitionException {
		InterfaceMemberContext _localctx = new InterfaceMemberContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_interfaceMember);
		try {
			setState(1560);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1558);
				propertySignature();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1559);
				methodSignature();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertySignatureContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public PropertySignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertySignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPropertySignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPropertySignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPropertySignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertySignatureContext propertySignature() throws RecognitionException {
		PropertySignatureContext _localctx = new PropertySignatureContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_propertySignature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1562);
			match(IDENTIFIER);
			setState(1563);
			match(COLON);
			setState(1564);
			value();
			setState(1565);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodSignatureContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public MethodSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMethodSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMethodSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMethodSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodSignatureContext methodSignature() throws RecognitionException {
		MethodSignatureContext _localctx = new MethodSignatureContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_methodSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1567);
			match(IDENTIFIER);
			setState(1568);
			match(OPEN_PAREN);
			setState(1570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(1569);
				parameterList();
				}
			}

			setState(1572);
			match(CLOSE_PAREN);
			setState(1573);
			match(COLON);
			setState(1574);
			value();
			setState(1575);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public List<Parameter2Context> parameter2() {
			return getRuleContexts(Parameter2Context.class);
		}
		public Parameter2Context parameter2(int i) {
			return getRuleContext(Parameter2Context.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1577);
			parameter2();
			setState(1582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1578);
				match(COMMA);
				setState(1579);
				parameter2();
				}
				}
				setState(1584);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter2Context extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Parameter2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParameter2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParameter2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParameter2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter2Context parameter2() throws RecognitionException {
		Parameter2Context _localctx = new Parameter2Context(_ctx, getState());
		enterRule(_localctx, 234, RULE_parameter2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1585);
			match(IDENTIFIER);
			setState(1586);
			match(COLON);
			setState(1587);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OnbuttonContext extends ParserRuleContext {
		public TerminalNode ONBUTTONCLICK() { return getToken(AngularParser.ONBUTTONCLICK, 0); }
		public List<TerminalNode> OPEN_PAREN() { return getTokens(AngularParser.OPEN_PAREN); }
		public TerminalNode OPEN_PAREN(int i) {
			return getToken(AngularParser.OPEN_PAREN, i);
		}
		public List<TerminalNode> CLOSE_PAREN() { return getTokens(AngularParser.CLOSE_PAREN); }
		public TerminalNode CLOSE_PAREN(int i) {
			return getToken(AngularParser.CLOSE_PAREN, i);
		}
		public TerminalNode OPEN_CURLY() { return getToken(AngularParser.OPEN_CURLY, 0); }
		public BasevalueContext basevalue() {
			return getRuleContext(BasevalueContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(AngularParser.CLOSE_CURLY, 0); }
		public OnbuttonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onbutton; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOnbutton(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOnbutton(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOnbutton(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnbuttonContext onbutton() throws RecognitionException {
		OnbuttonContext _localctx = new OnbuttonContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_onbutton);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1589);
			match(ONBUTTONCLICK);
			setState(1590);
			match(OPEN_PAREN);
			setState(1591);
			match(CLOSE_PAREN);
			setState(1592);
			match(OPEN_CURLY);
			setState(1593);
			basevalue();
			setState(1594);
			match(OPEN_PAREN);
			setState(1595);
			expression(0);
			setState(1596);
			match(CLOSE_PAREN);
			setState(1597);
			match(SEMICOLON);
			setState(1598);
			match(CLOSE_CURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayvalueContext extends ParserRuleContext {
		public BasevalueContext basevalue() {
			return getRuleContext(BasevalueContext.class,0);
		}
		public TerminalNode OPEN_SQUARE() { return getToken(AngularParser.OPEN_SQUARE, 0); }
		public TerminalNode CLOSE_SQUARE() { return getToken(AngularParser.CLOSE_SQUARE, 0); }
		public TerminalNode ARRAY() { return getToken(AngularParser.ARRAY, 0); }
		public TerminalNode LESS_THAN() { return getToken(AngularParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(AngularParser.GREATER_THAN, 0); }
		public ArrayvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayvalueContext arrayvalue() throws RecognitionException {
		ArrayvalueContext _localctx = new ArrayvalueContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_arrayvalue);
		try {
			setState(1609);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANY:
			case FORMGROUP:
			case FORMCONTROL:
			case VOID:
			case ONINIT:
			case STRING:
			case NUMBER:
			case IDENTIFIER:
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1600);
				basevalue();
				setState(1601);
				match(OPEN_SQUARE);
				setState(1602);
				match(CLOSE_SQUARE);
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1604);
				match(ARRAY);
				setState(1605);
				match(LESS_THAN);
				setState(1606);
				basevalue();
				setState(1607);
				match(GREATER_THAN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecoratorContext extends ParserRuleContext {
		public TerminalNode OUTPUT() { return getToken(AngularParser.OUTPUT, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public PropertyAssignmentContext propertyAssignment() {
			return getRuleContext(PropertyAssignmentContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public DecoratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDecorator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDecorator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDecorator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorContext decorator() throws RecognitionException {
		DecoratorContext _localctx = new DecoratorContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_decorator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1611);
			match(OUTPUT);
			setState(1612);
			match(OPEN_PAREN);
			setState(1613);
			match(CLOSE_PAREN);
			setState(1614);
			propertyAssignment();
			setState(1615);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyAssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode THIS() { return getToken(AngularParser.THIS, 0); }
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public PropertyAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPropertyAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPropertyAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPropertyAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyAssignmentContext propertyAssignment() throws RecognitionException {
		PropertyAssignmentContext _localctx = new PropertyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_propertyAssignment);
		try {
			setState(1633);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1617);
				match(IDENTIFIER);
				setState(1618);
				match(EQUALS);
				setState(1619);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1620);
				match(IDENTIFIER);
				setState(1621);
				match(COLON);
				setState(1622);
				value();
				setState(1623);
				match(EQUALS);
				setState(1624);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1626);
				match(THIS);
				setState(1627);
				match(DOT);
				setState(1628);
				match(IDENTIFIER);
				setState(1629);
				match(EQUALS);
				setState(1630);
				expression(0);
				setState(1631);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1635);
			expression(0);
			setState(1640);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1636);
				match(COMMA);
				setState(1637);
				expression(0);
				}
				}
				setState(1642);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NgOnInitContext extends ParserRuleContext {
		public TerminalNode NGONINIT() { return getToken(AngularParser.NGONINIT, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode VOID() { return getToken(AngularParser.VOID, 0); }
		public TerminalNode OPEN_CURLY() { return getToken(AngularParser.OPEN_CURLY, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(AngularParser.CLOSE_CURLY, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<RouteParamAssignmentContext> routeParamAssignment() {
			return getRuleContexts(RouteParamAssignmentContext.class);
		}
		public RouteParamAssignmentContext routeParamAssignment(int i) {
			return getRuleContext(RouteParamAssignmentContext.class,i);
		}
		public List<ServiceCallContext> serviceCall() {
			return getRuleContexts(ServiceCallContext.class);
		}
		public ServiceCallContext serviceCall(int i) {
			return getRuleContext(ServiceCallContext.class,i);
		}
		public NgOnInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngOnInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNgOnInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNgOnInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNgOnInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgOnInitContext ngOnInit() throws RecognitionException {
		NgOnInitContext _localctx = new NgOnInitContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_ngOnInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1643);
			match(NGONINIT);
			setState(1644);
			match(OPEN_PAREN);
			setState(1645);
			match(CLOSE_PAREN);
			setState(1646);
			match(COLON);
			setState(1647);
			match(VOID);
			setState(1648);
			match(OPEN_CURLY);
			setState(1654);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << CONST) | (1L << VAR) | (1L << IF) | (1L << THIS) | (1L << PRIVATE))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (RETURN - 75)) | (1L << (OPEN_CURLY - 75)) | (1L << (OPEN_SQUARE - 75)) | (1L << (OPEN_PAREN - 75)) | (1L << (STRING - 75)) | (1L << (PLUS_PLUS - 75)) | (1L << (MINUS_MINUS - 75)) | (1L << (NUMBER - 75)) | (1L << (INTEGER - 75)) | (1L << (IDENTIFIER - 75)) | (1L << (SPREAD - 75)))) != 0)) {
				{
				setState(1652);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
				case 1:
					{
					setState(1649);
					statement();
					}
					break;
				case 2:
					{
					setState(1650);
					routeParamAssignment();
					}
					break;
				case 3:
					{
					setState(1651);
					serviceCall();
					}
					break;
				}
				}
				setState(1656);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1657);
			match(CLOSE_CURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RouteParamAssignmentContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(AngularParser.CONST, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public TerminalNode THIS() { return getToken(AngularParser.THIS, 0); }
		public List<TerminalNode> DOT() { return getTokens(AngularParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AngularParser.DOT, i);
		}
		public TerminalNode SNAPSHOT() { return getToken(AngularParser.SNAPSHOT, 0); }
		public TerminalNode PARAMS() { return getToken(AngularParser.PARAMS, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public IndexAccessContext indexAccess() {
			return getRuleContext(IndexAccessContext.class,0);
		}
		public UnaryPlusContext unaryPlus() {
			return getRuleContext(UnaryPlusContext.class,0);
		}
		public RouteParamAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routeParamAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterRouteParamAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitRouteParamAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitRouteParamAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RouteParamAssignmentContext routeParamAssignment() throws RecognitionException {
		RouteParamAssignmentContext _localctx = new RouteParamAssignmentContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_routeParamAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1659);
			match(CONST);
			setState(1660);
			match(IDENTIFIER);
			setState(1661);
			match(EQUALS);
			setState(1663);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS) {
				{
				setState(1662);
				unaryPlus();
				}
			}

			setState(1665);
			match(THIS);
			setState(1666);
			match(DOT);
			setState(1667);
			match(IDENTIFIER);
			setState(1668);
			match(DOT);
			setState(1669);
			match(SNAPSHOT);
			setState(1670);
			match(DOT);
			setState(1671);
			match(PARAMS);
			setState(1675);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				{
				setState(1672);
				match(DOT);
				setState(1673);
				match(IDENTIFIER);
				}
				break;
			case OPEN_SQUARE:
				{
				setState(1674);
				indexAccess();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1677);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexAccessContext extends ParserRuleContext {
		public TerminalNode OPEN_SQUARE() { return getToken(AngularParser.OPEN_SQUARE, 0); }
		public TerminalNode CLOSE_SQUARE() { return getToken(AngularParser.CLOSE_SQUARE, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public IndexAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIndexAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIndexAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIndexAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexAccessContext indexAccess() throws RecognitionException {
		IndexAccessContext _localctx = new IndexAccessContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_indexAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1679);
			match(OPEN_SQUARE);
			setState(1680);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1681);
			match(CLOSE_SQUARE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryPlusContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(AngularParser.PLUS, 0); }
		public UnaryPlusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryPlus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterUnaryPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitUnaryPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitUnaryPlus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryPlusContext unaryPlus() throws RecognitionException {
		UnaryPlusContext _localctx = new UnaryPlusContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_unaryPlus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1683);
			match(PLUS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormGroupInitializationContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(AngularParser.THIS, 0); }
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public TerminalNode NEW() { return getToken(AngularParser.NEW, 0); }
		public TerminalNode FORMGROUP() { return getToken(AngularParser.FORMGROUP, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public FormGroupBodyContext formGroupBody() {
			return getRuleContext(FormGroupBodyContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public FormGroupInitializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formGroupInitialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFormGroupInitialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFormGroupInitialization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFormGroupInitialization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormGroupInitializationContext formGroupInitialization() throws RecognitionException {
		FormGroupInitializationContext _localctx = new FormGroupInitializationContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_formGroupInitialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1685);
			match(THIS);
			setState(1686);
			match(DOT);
			setState(1687);
			match(IDENTIFIER);
			setState(1688);
			match(EQUALS);
			setState(1689);
			match(NEW);
			setState(1690);
			match(FORMGROUP);
			setState(1691);
			match(OPEN_PAREN);
			setState(1692);
			formGroupBody();
			setState(1693);
			match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormGroupBodyContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY() { return getToken(AngularParser.OPEN_CURLY, 0); }
		public FormControlFieldsContext formControlFields() {
			return getRuleContext(FormControlFieldsContext.class,0);
		}
		public TerminalNode CLOSE_CURLY() { return getToken(AngularParser.CLOSE_CURLY, 0); }
		public FormGroupBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formGroupBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFormGroupBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFormGroupBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFormGroupBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormGroupBodyContext formGroupBody() throws RecognitionException {
		FormGroupBodyContext _localctx = new FormGroupBodyContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_formGroupBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1695);
			match(OPEN_CURLY);
			setState(1696);
			formControlFields();
			setState(1697);
			match(CLOSE_CURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormControlFieldsContext extends ParserRuleContext {
		public List<FormControlFieldContext> formControlField() {
			return getRuleContexts(FormControlFieldContext.class);
		}
		public FormControlFieldContext formControlField(int i) {
			return getRuleContext(FormControlFieldContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public FormControlFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formControlFields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFormControlFields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFormControlFields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFormControlFields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormControlFieldsContext formControlFields() throws RecognitionException {
		FormControlFieldsContext _localctx = new FormControlFieldsContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_formControlFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1699);
			formControlField();
			setState(1704);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1700);
				match(COMMA);
				setState(1701);
				formControlField();
				}
				}
				setState(1706);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormControlFieldContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode NEW() { return getToken(AngularParser.NEW, 0); }
		public TerminalNode FORMCONTROL() { return getToken(AngularParser.FORMCONTROL, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public FormControlArgsContext formControlArgs() {
			return getRuleContext(FormControlArgsContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public FormControlFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formControlField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFormControlField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFormControlField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFormControlField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormControlFieldContext formControlField() throws RecognitionException {
		FormControlFieldContext _localctx = new FormControlFieldContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_formControlField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1707);
			match(IDENTIFIER);
			setState(1708);
			match(COLON);
			setState(1709);
			match(NEW);
			setState(1710);
			match(FORMCONTROL);
			setState(1711);
			match(OPEN_PAREN);
			setState(1712);
			formControlArgs();
			setState(1713);
			match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormControlArgsContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TerminalNode COMMA() { return getToken(AngularParser.COMMA, 0); }
		public ValidatorExpressionContext validatorExpression() {
			return getRuleContext(ValidatorExpressionContext.class,0);
		}
		public FormControlArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formControlArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFormControlArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFormControlArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFormControlArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormControlArgsContext formControlArgs() throws RecognitionException {
		FormControlArgsContext _localctx = new FormControlArgsContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_formControlArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1715);
			match(STRING);
			setState(1718);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1716);
				match(COMMA);
				setState(1717);
				validatorExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValidatorExpressionContext extends ParserRuleContext {
		public TerminalNode VALIDATORS() { return getToken(AngularParser.VALIDATORS, 0); }
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_SQUARE() { return getToken(AngularParser.OPEN_SQUARE, 0); }
		public List<ValidatorContext> validator() {
			return getRuleContexts(ValidatorContext.class);
		}
		public ValidatorContext validator(int i) {
			return getRuleContext(ValidatorContext.class,i);
		}
		public TerminalNode CLOSE_SQUARE() { return getToken(AngularParser.CLOSE_SQUARE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ValidatorExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_validatorExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterValidatorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitValidatorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitValidatorExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValidatorExpressionContext validatorExpression() throws RecognitionException {
		ValidatorExpressionContext _localctx = new ValidatorExpressionContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_validatorExpression);
		int _la;
		try {
			setState(1734);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALIDATORS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1720);
				match(VALIDATORS);
				setState(1721);
				match(DOT);
				setState(1722);
				match(IDENTIFIER);
				}
				break;
			case OPEN_SQUARE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1723);
				match(OPEN_SQUARE);
				setState(1724);
				validator();
				setState(1729);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1725);
					match(COMMA);
					setState(1726);
					validator();
					}
					}
					setState(1731);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1732);
				match(CLOSE_SQUARE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValidatorContext extends ParserRuleContext {
		public TerminalNode VALIDATORS() { return getToken(AngularParser.VALIDATORS, 0); }
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public TerminalNode NUMBER() { return getToken(AngularParser.NUMBER, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public ValidatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_validator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterValidator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitValidator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitValidator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValidatorContext validator() throws RecognitionException {
		ValidatorContext _localctx = new ValidatorContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_validator);
		try {
			setState(1745);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1736);
				match(VALIDATORS);
				setState(1737);
				match(DOT);
				setState(1738);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1739);
				match(VALIDATORS);
				setState(1740);
				match(DOT);
				setState(1741);
				match(IDENTIFIER);
				setState(1742);
				match(OPEN_PAREN);
				setState(1743);
				match(NUMBER);
				setState(1744);
				match(CLOSE_PAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaExpressionContext extends ParserRuleContext {
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
	 
		public LambdaExpressionContext() { }
		public void copyFrom(LambdaExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LambdaExpressionExprContext extends LambdaExpressionContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(AngularParser.ARROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LambdaExpressionExprContext(LambdaExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLambdaExpressionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLambdaExpressionExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLambdaExpressionExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaExpressionBlockContext extends LambdaExpressionContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(AngularParser.ARROW, 0); }
		public TerminalNode OPEN_CURLY() { return getToken(AngularParser.OPEN_CURLY, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(AngularParser.CLOSE_CURLY, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public LambdaExpressionBlockContext(LambdaExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLambdaExpressionBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLambdaExpressionBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLambdaExpressionBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_lambdaExpression);
		int _la;
		try {
			setState(1762);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				_localctx = new LambdaExpressionExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1747);
				parameters();
				setState(1748);
				match(ARROW);
				setState(1749);
				expression(0);
				}
				break;
			case 2:
				_localctx = new LambdaExpressionBlockContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1751);
				parameters();
				setState(1752);
				match(ARROW);
				setState(1753);
				match(OPEN_CURLY);
				setState(1757);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << CONST) | (1L << VAR) | (1L << IF) | (1L << THIS) | (1L << PRIVATE))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (RETURN - 75)) | (1L << (OPEN_CURLY - 75)) | (1L << (OPEN_SQUARE - 75)) | (1L << (OPEN_PAREN - 75)) | (1L << (STRING - 75)) | (1L << (PLUS_PLUS - 75)) | (1L << (MINUS_MINUS - 75)) | (1L << (NUMBER - 75)) | (1L << (INTEGER - 75)) | (1L << (IDENTIFIER - 75)) | (1L << (SPREAD - 75)))) != 0)) {
					{
					{
					setState(1754);
					statement();
					}
					}
					setState(1759);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1760);
				match(CLOSE_CURLY);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_parameters);
		int _la;
		try {
			setState(1770);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1764);
				match(IDENTIFIER);
				}
				break;
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1765);
				match(OPEN_PAREN);
				setState(1767);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(1766);
					parameterList();
					}
				}

				setState(1769);
				match(CLOSE_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionBodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OPEN_CURLY() { return getToken(AngularParser.OPEN_CURLY, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(AngularParser.CLOSE_CURLY, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_functionBody);
		int _la;
		try {
			setState(1781);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1772);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1773);
				match(OPEN_CURLY);
				setState(1777);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << CONST) | (1L << VAR) | (1L << IF) | (1L << THIS) | (1L << PRIVATE))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (RETURN - 75)) | (1L << (OPEN_CURLY - 75)) | (1L << (OPEN_SQUARE - 75)) | (1L << (OPEN_PAREN - 75)) | (1L << (STRING - 75)) | (1L << (PLUS_PLUS - 75)) | (1L << (MINUS_MINUS - 75)) | (1L << (NUMBER - 75)) | (1L << (INTEGER - 75)) | (1L << (IDENTIFIER - 75)) | (1L << (SPREAD - 75)))) != 0)) {
					{
					{
					setState(1774);
					statement();
					}
					}
					setState(1779);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1780);
				match(CLOSE_CURLY);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(AngularParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1783);
			match(RETURN);
			setState(1786);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				{
				setState(1784);
				expressionList();
				}
				break;
			case 2:
				{
				setState(1785);
				expression(0);
				}
				break;
			}
			setState(1788);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlElementContext extends ParserRuleContext {
		public List<HtmlElementassistContext> htmlElementassist() {
			return getRuleContexts(HtmlElementassistContext.class);
		}
		public HtmlElementassistContext htmlElementassist(int i) {
			return getRuleContext(HtmlElementassistContext.class,i);
		}
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_htmlElement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1791); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1790);
					htmlElementassist();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1793); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlElementassistContext extends ParserRuleContext {
		public HtmlElementassistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElementassist; }
	 
		public HtmlElementassistContext() { }
		public void copyFrom(HtmlElementassistContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ANGULARBUTTONLABELContext extends HtmlElementassistContext {
		public AngularButtonContext angularButton() {
			return getRuleContext(AngularButtonContext.class,0);
		}
		public ANGULARBUTTONLABELContext(HtmlElementassistContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterANGULARBUTTONLABEL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitANGULARBUTTONLABEL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitANGULARBUTTONLABEL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SELFCLOSEHTMLELEMNTContext extends HtmlElementassistContext {
		public SelfClosingHtmlElementContext selfClosingHtmlElement() {
			return getRuleContext(SelfClosingHtmlElementContext.class,0);
		}
		public SELFCLOSEHTMLELEMNTContext(HtmlElementassistContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSELFCLOSEHTMLELEMNT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSELFCLOSEHTMLELEMNT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSELFCLOSEHTMLELEMNT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FIXEDHTMLELEMNTContext extends HtmlElementassistContext {
		public FixedHtmlElementContext fixedHtmlElement() {
			return getRuleContext(FixedHtmlElementContext.class,0);
		}
		public FIXEDHTMLELEMNTContext(HtmlElementassistContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFIXEDHTMLELEMNT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFIXEDHTMLELEMNT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFIXEDHTMLELEMNT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FORMELEMENTLABELContext extends HtmlElementassistContext {
		public FormElementContext formElement() {
			return getRuleContext(FormElementContext.class,0);
		}
		public FORMELEMENTLABELContext(HtmlElementassistContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFORMELEMENTLABEL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFORMELEMENTLABEL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFORMELEMENTLABEL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class STANDERHTMLELEMNTContext extends HtmlElementassistContext {
		public StandardHtmlElementContext standardHtmlElement() {
			return getRuleContext(StandardHtmlElementContext.class,0);
		}
		public STANDERHTMLELEMNTContext(HtmlElementassistContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSTANDERHTMLELEMNT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSTANDERHTMLELEMNT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSTANDERHTMLELEMNT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementassistContext htmlElementassist() throws RecognitionException {
		HtmlElementassistContext _localctx = new HtmlElementassistContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_htmlElementassist);
		try {
			setState(1800);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				_localctx = new STANDERHTMLELEMNTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1795);
				standardHtmlElement();
				}
				break;
			case 2:
				_localctx = new SELFCLOSEHTMLELEMNTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1796);
				selfClosingHtmlElement();
				}
				break;
			case 3:
				_localctx = new FIXEDHTMLELEMNTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1797);
				fixedHtmlElement();
				}
				break;
			case 4:
				_localctx = new ANGULARBUTTONLABELContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1798);
				angularButton();
				}
				break;
			case 5:
				_localctx = new FORMELEMENTLABELContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1799);
				formElement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormElementContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(AngularParser.LESS_THAN, 0); }
		public TerminalNode FORM() { return getToken(AngularParser.FORM, 0); }
		public TerminalNode GREATER_THAN() { return getToken(AngularParser.GREATER_THAN, 0); }
		public ClosetagContext closetag() {
			return getRuleContext(ClosetagContext.class,0);
		}
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public List<HtmlContentContext> htmlContent() {
			return getRuleContexts(HtmlContentContext.class);
		}
		public HtmlContentContext htmlContent(int i) {
			return getRuleContext(HtmlContentContext.class,i);
		}
		public List<FormControlElementContext> formControlElement() {
			return getRuleContexts(FormControlElementContext.class);
		}
		public FormControlElementContext formControlElement(int i) {
			return getRuleContext(FormControlElementContext.class,i);
		}
		public FormElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFormElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFormElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFormElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormElementContext formElement() throws RecognitionException {
		FormElementContext _localctx = new FormElementContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_formElement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1802);
			match(LESS_THAN);
			setState(1803);
			match(FORM);
			setState(1807);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << FORMCONTROLNAME) | (1L << FORMGROUPATTR))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (OPEN_SQUARE - 87)) | (1L << (OPEN_PAREN - 87)) | (1L << (LESS_THAN - 87)) | (1L << (NG - 87)) | (1L << (NG_SUBMIT - 87)) | (1L << (NI - 87)))) != 0)) {
				{
				{
				setState(1804);
				htmlAttribute();
				}
				}
				setState(1809);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1810);
			match(GREATER_THAN);
			setState(1815);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1813);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
					case 1:
						{
						setState(1811);
						htmlContent();
						}
						break;
					case 2:
						{
						setState(1812);
						formControlElement();
						}
						break;
					}
					} 
				}
				setState(1817);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			}
			setState(1818);
			closetag();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormControlElementContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(AngularParser.LESS_THAN, 0); }
		public TerminalNode Input() { return getToken(AngularParser.Input, 0); }
		public TerminalNode TEXTAREA() { return getToken(AngularParser.TEXTAREA, 0); }
		public TerminalNode DIVIDE() { return getToken(AngularParser.DIVIDE, 0); }
		public TerminalNode GREATER_THAN() { return getToken(AngularParser.GREATER_THAN, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public FormControlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formControlElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFormControlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFormControlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFormControlElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormControlElementContext formControlElement() throws RecognitionException {
		FormControlElementContext _localctx = new FormControlElementContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_formControlElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1820);
			match(LESS_THAN);
			setState(1821);
			_la = _input.LA(1);
			if ( !(_la==Input || _la==TEXTAREA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1825);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << FORMCONTROLNAME) | (1L << FORMGROUPATTR))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (OPEN_SQUARE - 87)) | (1L << (OPEN_PAREN - 87)) | (1L << (LESS_THAN - 87)) | (1L << (NG - 87)) | (1L << (NG_SUBMIT - 87)) | (1L << (NI - 87)))) != 0)) {
				{
				{
				setState(1822);
				htmlAttribute();
				}
				}
				setState(1827);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1831);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIVIDE:
				{
				setState(1828);
				match(DIVIDE);
				setState(1829);
				match(GREATER_THAN);
				}
				break;
			case GREATER_THAN:
				{
				setState(1830);
				match(GREATER_THAN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FixedtqgContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(AngularParser.LESS_THAN, 0); }
		public FixedTagNameContext fixedTagName() {
			return getRuleContext(FixedTagNameContext.class,0);
		}
		public FixedtqgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixedtqg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFixedtqg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFixedtqg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFixedtqg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FixedtqgContext fixedtqg() throws RecognitionException {
		FixedtqgContext _localctx = new FixedtqgContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_fixedtqg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1833);
			match(LESS_THAN);
			setState(1834);
			fixedTagName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClosefixedtagContext extends ParserRuleContext {
		public TerminalNode GG() { return getToken(AngularParser.GG, 0); }
		public FixedTagNameContext fixedTagName() {
			return getRuleContext(FixedTagNameContext.class,0);
		}
		public TerminalNode GREATER_THAN() { return getToken(AngularParser.GREATER_THAN, 0); }
		public ClosefixedtagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closefixedtag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClosefixedtag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClosefixedtag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClosefixedtag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClosefixedtagContext closefixedtag() throws RecognitionException {
		ClosefixedtagContext _localctx = new ClosefixedtagContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_closefixedtag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1836);
			match(GG);
			setState(1837);
			fixedTagName();
			setState(1838);
			match(GREATER_THAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StandardHtmlElementContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(AngularParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(AngularParser.GREATER_THAN, 0); }
		public ClosetagContext closetag() {
			return getRuleContext(ClosetagContext.class,0);
		}
		public FixedTagNameContext fixedTagName() {
			return getRuleContext(FixedTagNameContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public List<HtmlContentContext> htmlContent() {
			return getRuleContexts(HtmlContentContext.class);
		}
		public HtmlContentContext htmlContent(int i) {
			return getRuleContext(HtmlContentContext.class,i);
		}
		public StandardHtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standardHtmlElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStandardHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStandardHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStandardHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandardHtmlElementContext standardHtmlElement() throws RecognitionException {
		StandardHtmlElementContext _localctx = new StandardHtmlElementContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_standardHtmlElement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1840);
			match(LESS_THAN);
			setState(1843);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Input:
			case TEXTAREA:
			case BUTTON:
			case H1:
			case H2:
			case P:
			case DIV:
			case UL:
			case LI:
			case SPAN:
			case IMG:
			case FORM:
			case A:
				{
				setState(1841);
				fixedTagName();
				}
				break;
			case IDENTIFIER:
				{
				setState(1842);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1848);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << FORMCONTROLNAME) | (1L << FORMGROUPATTR))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (OPEN_SQUARE - 87)) | (1L << (OPEN_PAREN - 87)) | (1L << (LESS_THAN - 87)) | (1L << (NG - 87)) | (1L << (NG_SUBMIT - 87)) | (1L << (NI - 87)))) != 0)) {
				{
				{
				setState(1845);
				htmlAttribute();
				}
				}
				setState(1850);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1851);
			match(GREATER_THAN);
			setState(1855);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1852);
					htmlContent();
					}
					} 
				}
				setState(1857);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			}
			setState(1858);
			closetag();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelfClosingHtmlElementContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(AngularParser.LESS_THAN, 0); }
		public FixedTagNameContext fixedTagName() {
			return getRuleContext(FixedTagNameContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode DIVIDE() { return getToken(AngularParser.DIVIDE, 0); }
		public TerminalNode GREATER_THAN() { return getToken(AngularParser.GREATER_THAN, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public SelfClosingHtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfClosingHtmlElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSelfClosingHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSelfClosingHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSelfClosingHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfClosingHtmlElementContext selfClosingHtmlElement() throws RecognitionException {
		SelfClosingHtmlElementContext _localctx = new SelfClosingHtmlElementContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_selfClosingHtmlElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1860);
			match(LESS_THAN);
			setState(1863);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Input:
			case TEXTAREA:
			case BUTTON:
			case H1:
			case H2:
			case P:
			case DIV:
			case UL:
			case LI:
			case SPAN:
			case IMG:
			case FORM:
			case A:
				{
				setState(1861);
				fixedTagName();
				}
				break;
			case IDENTIFIER:
				{
				setState(1862);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1868);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << FORMCONTROLNAME) | (1L << FORMGROUPATTR))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (OPEN_SQUARE - 87)) | (1L << (OPEN_PAREN - 87)) | (1L << (LESS_THAN - 87)) | (1L << (NG - 87)) | (1L << (NG_SUBMIT - 87)) | (1L << (NI - 87)))) != 0)) {
				{
				{
				setState(1865);
				htmlAttribute();
				}
				}
				setState(1870);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1874);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIVIDE:
				{
				setState(1871);
				match(DIVIDE);
				setState(1872);
				match(GREATER_THAN);
				}
				break;
			case GREATER_THAN:
				{
				setState(1873);
				match(GREATER_THAN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FixedHtmlElementContext extends ParserRuleContext {
		public FixedtqgContext fixedtqg() {
			return getRuleContext(FixedtqgContext.class,0);
		}
		public TerminalNode GREATER_THAN() { return getToken(AngularParser.GREATER_THAN, 0); }
		public ClosefixedtagContext closefixedtag() {
			return getRuleContext(ClosefixedtagContext.class,0);
		}
		public List<HtmlContentContext> htmlContent() {
			return getRuleContexts(HtmlContentContext.class);
		}
		public HtmlContentContext htmlContent(int i) {
			return getRuleContext(HtmlContentContext.class,i);
		}
		public FixedHtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixedHtmlElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFixedHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFixedHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFixedHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FixedHtmlElementContext fixedHtmlElement() throws RecognitionException {
		FixedHtmlElementContext _localctx = new FixedHtmlElementContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_fixedHtmlElement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1876);
			fixedtqg();
			setState(1877);
			match(GREATER_THAN);
			setState(1881);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1878);
					htmlContent();
					}
					} 
				}
				setState(1883);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
			}
			setState(1884);
			closefixedtag();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AngularButtonContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(AngularParser.LESS_THAN, 0); }
		public List<TerminalNode> BUTTON() { return getTokens(AngularParser.BUTTON); }
		public TerminalNode BUTTON(int i) {
			return getToken(AngularParser.BUTTON, i);
		}
		public List<TerminalNode> GREATER_THAN() { return getTokens(AngularParser.GREATER_THAN); }
		public TerminalNode GREATER_THAN(int i) {
			return getToken(AngularParser.GREATER_THAN, i);
		}
		public TerminalNode GG() { return getToken(AngularParser.GG, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public List<HtmlContentContext> htmlContent() {
			return getRuleContexts(HtmlContentContext.class);
		}
		public HtmlContentContext htmlContent(int i) {
			return getRuleContext(HtmlContentContext.class,i);
		}
		public AngularButtonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_angularButton; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAngularButton(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAngularButton(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAngularButton(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AngularButtonContext angularButton() throws RecognitionException {
		AngularButtonContext _localctx = new AngularButtonContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_angularButton);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1886);
			match(LESS_THAN);
			setState(1887);
			match(BUTTON);
			setState(1891);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << FORMCONTROLNAME) | (1L << FORMGROUPATTR))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (OPEN_SQUARE - 87)) | (1L << (OPEN_PAREN - 87)) | (1L << (LESS_THAN - 87)) | (1L << (NG - 87)) | (1L << (NG_SUBMIT - 87)) | (1L << (NI - 87)))) != 0)) {
				{
				{
				setState(1888);
				htmlAttribute();
				}
				}
				setState(1893);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1894);
			match(GREATER_THAN);
			setState(1898);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1895);
					htmlContent();
					}
					} 
				}
				setState(1900);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
			}
			setState(1901);
			match(GG);
			setState(1902);
			match(BUTTON);
			setState(1903);
			match(GREATER_THAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpentagContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(AngularParser.LESS_THAN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public OpentagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opentag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOpentag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOpentag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOpentag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpentagContext opentag() throws RecognitionException {
		OpentagContext _localctx = new OpentagContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_opentag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1905);
			match(LESS_THAN);
			setState(1906);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClosetagContext extends ParserRuleContext {
		public TerminalNode GG() { return getToken(AngularParser.GG, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode GREATER_THAN() { return getToken(AngularParser.GREATER_THAN, 0); }
		public ClosetagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closetag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClosetag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClosetag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClosetag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClosetagContext closetag() throws RecognitionException {
		ClosetagContext _localctx = new ClosetagContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_closetag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1908);
			match(GG);
			setState(1909);
			match(IDENTIFIER);
			setState(1910);
			match(GREATER_THAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FixedTagNameContext extends ParserRuleContext {
		public FixedTagNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixedTagName; }
	 
		public FixedTagNameContext() { }
		public void copyFrom(FixedTagNameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TagSpanContext extends FixedTagNameContext {
		public TerminalNode SPAN() { return getToken(AngularParser.SPAN, 0); }
		public TagSpanContext(FixedTagNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTagSpan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTagSpan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTagSpan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BUTTONLABELContext extends FixedTagNameContext {
		public TerminalNode BUTTON() { return getToken(AngularParser.BUTTON, 0); }
		public BUTTONLABELContext(FixedTagNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBUTTONLABEL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBUTTONLABEL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBUTTONLABEL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TEXTAREALABELContext extends FixedTagNameContext {
		public TerminalNode TEXTAREA() { return getToken(AngularParser.TEXTAREA, 0); }
		public TEXTAREALABELContext(FixedTagNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTEXTAREALABEL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTEXTAREALABEL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTEXTAREALABEL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TagH2Context extends FixedTagNameContext {
		public TerminalNode H2() { return getToken(AngularParser.H2, 0); }
		public TagH2Context(FixedTagNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTagH2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTagH2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTagH2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TagDivContext extends FixedTagNameContext {
		public TerminalNode DIV() { return getToken(AngularParser.DIV, 0); }
		public TagDivContext(FixedTagNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTagDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTagDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTagDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ALABELContext extends FixedTagNameContext {
		public TerminalNode A() { return getToken(AngularParser.A, 0); }
		public ALABELContext(FixedTagNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterALABEL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitALABEL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitALABEL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TagH1Context extends FixedTagNameContext {
		public TerminalNode H1() { return getToken(AngularParser.H1, 0); }
		public TagH1Context(FixedTagNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTagH1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTagH1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTagH1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TagPContext extends FixedTagNameContext {
		public TerminalNode P() { return getToken(AngularParser.P, 0); }
		public TagPContext(FixedTagNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTagP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTagP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTagP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TagImgContext extends FixedTagNameContext {
		public TerminalNode IMG() { return getToken(AngularParser.IMG, 0); }
		public TagImgContext(FixedTagNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTagImg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTagImg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTagImg(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FORMLABELContext extends FixedTagNameContext {
		public TerminalNode FORM() { return getToken(AngularParser.FORM, 0); }
		public FORMLABELContext(FixedTagNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFORMLABEL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFORMLABEL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFORMLABEL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class INPUTLABELContext extends FixedTagNameContext {
		public TerminalNode Input() { return getToken(AngularParser.Input, 0); }
		public INPUTLABELContext(FixedTagNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterINPUTLABEL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitINPUTLABEL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitINPUTLABEL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TagLiContext extends FixedTagNameContext {
		public TerminalNode LI() { return getToken(AngularParser.LI, 0); }
		public TagLiContext(FixedTagNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTagLi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTagLi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTagLi(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TagUlContext extends FixedTagNameContext {
		public TerminalNode UL() { return getToken(AngularParser.UL, 0); }
		public TagUlContext(FixedTagNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTagUl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTagUl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTagUl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FixedTagNameContext fixedTagName() throws RecognitionException {
		FixedTagNameContext _localctx = new FixedTagNameContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_fixedTagName);
		try {
			setState(1925);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case H1:
				_localctx = new TagH1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1912);
				match(H1);
				}
				break;
			case H2:
				_localctx = new TagH2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1913);
				match(H2);
				}
				break;
			case P:
				_localctx = new TagPContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1914);
				match(P);
				}
				break;
			case DIV:
				_localctx = new TagDivContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1915);
				match(DIV);
				}
				break;
			case UL:
				_localctx = new TagUlContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1916);
				match(UL);
				}
				break;
			case LI:
				_localctx = new TagLiContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1917);
				match(LI);
				}
				break;
			case SPAN:
				_localctx = new TagSpanContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1918);
				match(SPAN);
				}
				break;
			case IMG:
				_localctx = new TagImgContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1919);
				match(IMG);
				}
				break;
			case FORM:
				_localctx = new FORMLABELContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1920);
				match(FORM);
				}
				break;
			case Input:
				_localctx = new INPUTLABELContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1921);
				match(Input);
				}
				break;
			case TEXTAREA:
				_localctx = new TEXTAREALABELContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1922);
				match(TEXTAREA);
				}
				break;
			case BUTTON:
				_localctx = new BUTTONLABELContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(1923);
				match(BUTTON);
				}
				break;
			case A:
				_localctx = new ALABELContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(1924);
				match(A);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlAttributeContext extends ParserRuleContext {
		public HtmlAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttribute; }
	 
		public HtmlAttributeContext() { }
		public void copyFrom(HtmlAttributeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NGSUBMIT_ATTRIBUTEContext extends HtmlAttributeContext {
		public TerminalNode NG_SUBMIT() { return getToken(AngularParser.NG_SUBMIT, 0); }
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NGSUBMIT_ATTRIBUTEContext(HtmlAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNGSUBMIT_ATTRIBUTE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNGSUBMIT_ATTRIBUTE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNGSUBMIT_ATTRIBUTE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FORMGROUP_ATTRIBUTEContext extends HtmlAttributeContext {
		public TerminalNode FORMGROUPATTR() { return getToken(AngularParser.FORMGROUPATTR, 0); }
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BindingSyntaxContext bindingSyntax() {
			return getRuleContext(BindingSyntaxContext.class,0);
		}
		public FORMGROUP_ATTRIBUTEContext(HtmlAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFORMGROUP_ATTRIBUTE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFORMGROUP_ATTRIBUTE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFORMGROUP_ATTRIBUTE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FORMCONTROL_ATTRIBUTEContext extends HtmlAttributeContext {
		public TerminalNode FORMCONTROLNAME() { return getToken(AngularParser.FORMCONTROLNAME, 0); }
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public FORMCONTROL_ATTRIBUTEContext(HtmlAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFORMCONTROL_ATTRIBUTE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFORMCONTROL_ATTRIBUTE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFORMCONTROL_ATTRIBUTE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NGIF_ATTRIBUTEContext extends HtmlAttributeContext {
		public NgIfContext ngIf() {
			return getRuleContext(NgIfContext.class,0);
		}
		public NGIF_ATTRIBUTEContext(HtmlAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNGIF_ATTRIBUTE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNGIF_ATTRIBUTE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNGIF_ATTRIBUTE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NGFOR_ATTRIBUTEContext extends HtmlAttributeContext {
		public NgforContext ngfor() {
			return getRuleContext(NgforContext.class,0);
		}
		public NGFOR_ATTRIBUTEContext(HtmlAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNGFOR_ATTRIBUTE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNGFOR_ATTRIBUTE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNGFOR_ATTRIBUTE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BINDING_SYNTAXContext extends HtmlAttributeContext {
		public BindingSyntaxContext bindingSyntax() {
			return getRuleContext(BindingSyntaxContext.class,0);
		}
		public BINDING_SYNTAXContext(HtmlAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBINDING_SYNTAX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBINDING_SYNTAX(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBINDING_SYNTAX(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RAW_INPUT_ELEMENTContext extends HtmlAttributeContext {
		public FfContext ff() {
			return getRuleContext(FfContext.class,0);
		}
		public RAW_INPUT_ELEMENTContext(HtmlAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterRAW_INPUT_ELEMENT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitRAW_INPUT_ELEMENT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitRAW_INPUT_ELEMENT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CLASS_ATTRIBUTEContext extends HtmlAttributeContext {
		public TerminalNode CLASS() { return getToken(AngularParser.CLASS, 0); }
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public CLASS_ATTRIBUTEContext(HtmlAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCLASS_ATTRIBUTE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCLASS_ATTRIBUTE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCLASS_ATTRIBUTE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PROPERTYBINDING_ATTRIBUTEContext extends HtmlAttributeContext {
		public PropertyBindingContext propertyBinding() {
			return getRuleContext(PropertyBindingContext.class,0);
		}
		public PROPERTYBINDING_ATTRIBUTEContext(HtmlAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPROPERTYBINDING_ATTRIBUTE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPROPERTYBINDING_ATTRIBUTE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPROPERTYBINDING_ATTRIBUTE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EVENTBINDING_ATTRIBUTEContext extends HtmlAttributeContext {
		public EventBindingContext eventBinding() {
			return getRuleContext(EventBindingContext.class,0);
		}
		public EVENTBINDING_ATTRIBUTEContext(HtmlAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEVENTBINDING_ATTRIBUTE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEVENTBINDING_ATTRIBUTE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEVENTBINDING_ATTRIBUTE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeContext htmlAttribute() throws RecognitionException {
		HtmlAttributeContext _localctx = new HtmlAttributeContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_htmlAttribute);
		try {
			setState(1948);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				_localctx = new FORMCONTROL_ATTRIBUTEContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1927);
				match(FORMCONTROLNAME);
				setState(1928);
				match(EQUALS);
				setState(1929);
				match(STRING);
				}
				break;
			case 2:
				_localctx = new FORMGROUP_ATTRIBUTEContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1930);
				match(FORMGROUPATTR);
				setState(1934);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EQUALS:
					{
					setState(1931);
					match(EQUALS);
					setState(1932);
					expression(0);
					}
					break;
				case OPEN_SQUARE:
				case OPEN_PAREN:
					{
					setState(1933);
					bindingSyntax();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				_localctx = new NGSUBMIT_ATTRIBUTEContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1936);
				match(NG_SUBMIT);
				setState(1937);
				match(EQUALS);
				setState(1938);
				expression(0);
				}
				break;
			case 4:
				_localctx = new PROPERTYBINDING_ATTRIBUTEContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1939);
				propertyBinding();
				}
				break;
			case 5:
				_localctx = new EVENTBINDING_ATTRIBUTEContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1940);
				eventBinding();
				}
				break;
			case 6:
				_localctx = new NGIF_ATTRIBUTEContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1941);
				ngIf();
				}
				break;
			case 7:
				_localctx = new NGFOR_ATTRIBUTEContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1942);
				ngfor();
				}
				break;
			case 8:
				_localctx = new BINDING_SYNTAXContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1943);
				bindingSyntax();
				}
				break;
			case 9:
				_localctx = new RAW_INPUT_ELEMENTContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1944);
				ff();
				}
				break;
			case 10:
				_localctx = new CLASS_ATTRIBUTEContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1945);
				match(CLASS);
				setState(1946);
				match(EQUALS);
				setState(1947);
				match(STRING);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BindingSyntaxContext extends ParserRuleContext {
		public TerminalNode OPEN_SQUARE() { return getToken(AngularParser.OPEN_SQUARE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode CLOSE_SQUARE() { return getToken(AngularParser.CLOSE_SQUARE, 0); }
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public BindingSyntaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bindingSyntax; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBindingSyntax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBindingSyntax(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBindingSyntax(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BindingSyntaxContext bindingSyntax() throws RecognitionException {
		BindingSyntaxContext _localctx = new BindingSyntaxContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_bindingSyntax);
		try {
			setState(1960);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_SQUARE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1950);
				match(OPEN_SQUARE);
				setState(1951);
				match(IDENTIFIER);
				setState(1952);
				match(CLOSE_SQUARE);
				setState(1953);
				match(EQUALS);
				setState(1954);
				expression(0);
				}
				break;
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1955);
				match(OPEN_PAREN);
				setState(1956);
				match(IDENTIFIER);
				setState(1957);
				match(CLOSE_PAREN);
				setState(1958);
				match(EQUALS);
				setState(1959);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FfContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(AngularParser.LESS_THAN, 0); }
		public TerminalNode INPUT() { return getToken(AngularParser.INPUT, 0); }
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TerminalNode GREATER_THAN() { return getToken(AngularParser.GREATER_THAN, 0); }
		public FfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ff; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FfContext ff() throws RecognitionException {
		FfContext _localctx = new FfContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_ff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1962);
			match(LESS_THAN);
			setState(1963);
			match(INPUT);
			setState(1964);
			match(EQUALS);
			setState(1965);
			match(STRING);
			setState(1966);
			match(GREATER_THAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyBindingContext extends ParserRuleContext {
		public TerminalNode OPEN_SQUARE() { return getToken(AngularParser.OPEN_SQUARE, 0); }
		public BindingIdentifierContext bindingIdentifier() {
			return getRuleContext(BindingIdentifierContext.class,0);
		}
		public TerminalNode CLOSE_SQUARE() { return getToken(AngularParser.CLOSE_SQUARE, 0); }
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PropertyBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPropertyBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPropertyBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPropertyBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyBindingContext propertyBinding() throws RecognitionException {
		PropertyBindingContext _localctx = new PropertyBindingContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_propertyBinding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1968);
			match(OPEN_SQUARE);
			setState(1969);
			bindingIdentifier();
			setState(1970);
			match(CLOSE_SQUARE);
			setState(1973);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(1971);
				match(EQUALS);
				setState(1972);
				expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BindingIdentifierContext extends ParserRuleContext {
		public BindingIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bindingIdentifier; }
	 
		public BindingIdentifierContext() { }
		public void copyFrom(BindingIdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FormControlNameBindingContext extends BindingIdentifierContext {
		public TerminalNode FORMCONTROLNAME() { return getToken(AngularParser.FORMCONTROLNAME, 0); }
		public FormControlNameBindingContext(BindingIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFormControlNameBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFormControlNameBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFormControlNameBinding(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierChainBindingContext extends BindingIdentifierContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(AngularParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AngularParser.DOT, i);
		}
		public IdentifierChainBindingContext(BindingIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIdentifierChainBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIdentifierChainBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIdentifierChainBinding(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FormGroupAttributeBindingContext extends BindingIdentifierContext {
		public TerminalNode FORMGROUPATTR() { return getToken(AngularParser.FORMGROUPATTR, 0); }
		public FormGroupAttributeBindingContext(BindingIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFormGroupAttributeBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFormGroupAttributeBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFormGroupAttributeBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BindingIdentifierContext bindingIdentifier() throws RecognitionException {
		BindingIdentifierContext _localctx = new BindingIdentifierContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_bindingIdentifier);
		int _la;
		try {
			setState(1985);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new IdentifierChainBindingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1975);
				match(IDENTIFIER);
				setState(1980);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(1976);
					match(DOT);
					setState(1977);
					match(IDENTIFIER);
					}
					}
					setState(1982);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case FORMGROUPATTR:
				_localctx = new FormGroupAttributeBindingContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1983);
				match(FORMGROUPATTR);
				}
				break;
			case FORMCONTROLNAME:
				_localctx = new FormControlNameBindingContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1984);
				match(FORMCONTROLNAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NgIfContext extends ParserRuleContext {
		public TerminalNode NI() { return getToken(AngularParser.NI, 0); }
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NgIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNgIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNgIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNgIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgIfContext ngIf() throws RecognitionException {
		NgIfContext _localctx = new NgIfContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_ngIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1987);
			match(NI);
			setState(1988);
			match(EQUALS);
			setState(1989);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NgforContext extends ParserRuleContext {
		public TerminalNode NG() { return getToken(AngularParser.NG, 0); }
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NgforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngfor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNgfor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNgfor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNgfor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgforContext ngfor() throws RecognitionException {
		NgforContext _localctx = new NgforContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_ngfor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1991);
			match(NG);
			setState(1992);
			match(EQUALS);
			setState(1993);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlContentContext extends ParserRuleContext {
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public List<TextNodeContext> textNode() {
			return getRuleContexts(TextNodeContext.class);
		}
		public TextNodeContext textNode(int i) {
			return getRuleContext(TextNodeContext.class,i);
		}
		public List<InterpContext> interp() {
			return getRuleContexts(InterpContext.class);
		}
		public InterpContext interp(int i) {
			return getRuleContext(InterpContext.class,i);
		}
		public List<ErrorNodeContext> errorNode() {
			return getRuleContexts(ErrorNodeContext.class);
		}
		public ErrorNodeContext errorNode(int i) {
			return getRuleContext(ErrorNodeContext.class,i);
		}
		public HtmlContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_htmlContent);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1999); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(1999);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
					case 1:
						{
						setState(1995);
						htmlElement();
						}
						break;
					case 2:
						{
						setState(1996);
						textNode();
						}
						break;
					case 3:
						{
						setState(1997);
						interp();
						}
						break;
					case 4:
						{
						setState(1998);
						errorNode();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2001); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorNodeContext extends ParserRuleContext {
		public ErrorNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterErrorNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitErrorNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitErrorNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorNodeContext errorNode() throws RecognitionException {
		ErrorNodeContext _localctx = new ErrorNodeContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_errorNode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2003);
			matchWildcard();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterpContext extends ParserRuleContext {
		public IdentifierChainContext identifierChain() {
			return getRuleContext(IdentifierChainContext.class,0);
		}
		public InterpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInterp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInterp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInterp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterpContext interp() throws RecognitionException {
		InterpContext _localctx = new InterpContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_interp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2005);
			identifierChain();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierChainContext extends ParserRuleContext {
		public TerminalNode OPEN_DOUBLE_CURLY() { return getToken(AngularParser.OPEN_DOUBLE_CURLY, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public TerminalNode CLOSE_DOUBLE_CURLY() { return getToken(AngularParser.CLOSE_DOUBLE_CURLY, 0); }
		public List<TerminalNode> DOT() { return getTokens(AngularParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AngularParser.DOT, i);
		}
		public IdentifierChainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierChain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIdentifierChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIdentifierChain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIdentifierChain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierChainContext identifierChain() throws RecognitionException {
		IdentifierChainContext _localctx = new IdentifierChainContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_identifierChain);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2007);
			match(OPEN_DOUBLE_CURLY);
			setState(2008);
			match(IDENTIFIER);
			setState(2013);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(2009);
				match(DOT);
				setState(2010);
				match(IDENTIFIER);
				}
				}
				setState(2015);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2016);
			match(CLOSE_DOUBLE_CURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventBindingContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EventBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEventBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEventBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEventBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventBindingContext eventBinding() throws RecognitionException {
		EventBindingContext _localctx = new EventBindingContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_eventBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2018);
			match(OPEN_PAREN);
			setState(2019);
			match(IDENTIFIER);
			setState(2020);
			match(CLOSE_PAREN);
			setState(2021);
			match(EQUALS);
			setState(2022);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextNodeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TerminalNode ARABIC_TEXT() { return getToken(AngularParser.ARABIC_TEXT, 0); }
		public TerminalNode WS() { return getToken(AngularParser.WS, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode LS() { return getToken(AngularParser.LS, 0); }
		public TextNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTextNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTextNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTextNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextNodeContext textNode() throws RecognitionException {
		TextNodeContext _localctx = new TextNodeContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_textNode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2024);
			_la = _input.LA(1);
			if ( !(((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (COLON - 91)) | (1L << (STRING - 91)) | (1L << (WS - 91)) | (1L << (LS - 91)) | (1L << (ARABIC_TEXT - 91)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StylesheetContext extends ParserRuleContext {
		public List<RuleSetContext> ruleSet() {
			return getRuleContexts(RuleSetContext.class);
		}
		public RuleSetContext ruleSet(int i) {
			return getRuleContext(RuleSetContext.class,i);
		}
		public StylesheetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stylesheet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStylesheet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStylesheet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStylesheet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StylesheetContext stylesheet() throws RecognitionException {
		StylesheetContext _localctx = new StylesheetContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_stylesheet);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2027); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2026);
					ruleSet();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2029); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleSetContext extends ParserRuleContext {
		public Selector1Context selector1() {
			return getRuleContext(Selector1Context.class,0);
		}
		public TerminalNode OPEN_CURLY() { return getToken(AngularParser.OPEN_CURLY, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(AngularParser.CLOSE_CURLY, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public RuleSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterRuleSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitRuleSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitRuleSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleSetContext ruleSet() throws RecognitionException {
		RuleSetContext _localctx = new RuleSetContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_ruleSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2031);
			selector1();
			setState(2032);
			match(OPEN_CURLY);
			setState(2034); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2033);
				declaration();
				}
				}
				setState(2036); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(2038);
			match(CLOSE_CURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Selector1Context extends ParserRuleContext {
		public Selector1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector1; }
	 
		public Selector1Context() { }
		public void copyFrom(Selector1Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ClassSelectorLabelContext extends Selector1Context {
		public ClassSelectorContext classSelector() {
			return getRuleContext(ClassSelectorContext.class,0);
		}
		public ClassSelectorLabelContext(Selector1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassSelectorLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassSelectorLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassSelectorLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdSelectorLabelContext extends Selector1Context {
		public IdSelectorContext idSelector() {
			return getRuleContext(IdSelectorContext.class,0);
		}
		public IdSelectorLabelContext(Selector1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIdSelectorLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIdSelectorLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIdSelectorLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PseudoClassSelectorLabelContext extends Selector1Context {
		public PseudoClassSelectorContext pseudoClassSelector() {
			return getRuleContext(PseudoClassSelectorContext.class,0);
		}
		public PseudoClassSelectorLabelContext(Selector1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPseudoClassSelectorLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPseudoClassSelectorLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPseudoClassSelectorLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Selector1Context selector1() throws RecognitionException {
		Selector1Context _localctx = new Selector1Context(_ctx, getState());
		enterRule(_localctx, 332, RULE_selector1);
		try {
			setState(2043);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				_localctx = new ClassSelectorLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2040);
				classSelector();
				}
				break;
			case 2:
				_localctx = new IdSelectorLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2041);
				idSelector();
				}
				break;
			case 3:
				_localctx = new PseudoClassSelectorLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2042);
				pseudoClassSelector();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassSelectorContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public BasevalueContext basevalue() {
			return getRuleContext(BasevalueContext.class,0);
		}
		public ClassSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassSelectorContext classSelector() throws RecognitionException {
		ClassSelectorContext _localctx = new ClassSelectorContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_classSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2045);
			match(DOT);
			setState(2046);
			basevalue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdSelectorContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(AngularParser.HASH, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public IdSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIdSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIdSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIdSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdSelectorContext idSelector() throws RecognitionException {
		IdSelectorContext _localctx = new IdSelectorContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_idSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2048);
			match(HASH);
			setState(2049);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PseudoClassSelectorContext extends ParserRuleContext {
		public ClassSelectorContext classSelector() {
			return getRuleContext(ClassSelectorContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public PseudoClassSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudoClassSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPseudoClassSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPseudoClassSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPseudoClassSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PseudoClassSelectorContext pseudoClassSelector() throws RecognitionException {
		PseudoClassSelectorContext _localctx = new PseudoClassSelectorContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_pseudoClassSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2051);
			classSelector();
			setState(2052);
			match(COLON);
			setState(2053);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public Value1Context value1() {
			return getRuleContext(Value1Context.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2055);
			property();
			setState(2056);
			match(COLON);
			setState(2057);
			value1();
			setState(2058);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(AngularParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(AngularParser.MINUS, i);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_property);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2060);
			match(IDENTIFIER);
			setState(2065);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MINUS) {
				{
				{
				setState(2061);
				match(MINUS);
				setState(2062);
				match(IDENTIFIER);
				}
				}
				setState(2067);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value1Context extends ParserRuleContext {
		public Value1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value1; }
	 
		public Value1Context() { }
		public void copyFrom(Value1Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringValueLabelContext extends Value1Context {
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public StringValueLabelContext(Value1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStringValueLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStringValueLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStringValueLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColorValueLabelContext extends Value1Context {
		public TerminalNode COLOR() { return getToken(AngularParser.COLOR, 0); }
		public ColorValueLabelContext(Value1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterColorValueLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitColorValueLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitColorValueLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CssFunctionValueLabelContext extends Value1Context {
		public CssFunctionContext cssFunction() {
			return getRuleContext(CssFunctionContext.class,0);
		}
		public CssFunctionValueLabelContext(Value1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCssFunctionValueLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCssFunctionValueLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCssFunctionValueLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberValueLabelContext extends Value1Context {
		public TerminalNode NUMBER() { return getToken(AngularParser.NUMBER, 0); }
		public TerminalNode UNIT() { return getToken(AngularParser.UNIT, 0); }
		public NumberValueLabelContext(Value1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNumberValueLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNumberValueLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNumberValueLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierValueLabelContext extends Value1Context {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public IdentifierValueLabelContext(Value1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIdentifierValueLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIdentifierValueLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIdentifierValueLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value1Context value1() throws RecognitionException {
		Value1Context _localctx = new Value1Context(_ctx, getState());
		enterRule(_localctx, 344, RULE_value1);
		int _la;
		try {
			setState(2076);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				_localctx = new NumberValueLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2068);
				match(NUMBER);
				setState(2070);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNIT) {
					{
					setState(2069);
					match(UNIT);
					}
				}

				}
				break;
			case 2:
				_localctx = new ColorValueLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2072);
				match(COLOR);
				}
				break;
			case 3:
				_localctx = new IdentifierValueLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2073);
				match(IDENTIFIER);
				}
				break;
			case 4:
				_localctx = new StringValueLabelContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2074);
				match(STRING);
				}
				break;
			case 5:
				_localctx = new CssFunctionValueLabelContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2075);
				cssFunction();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CssFunctionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public Value1Context value1() {
			return getRuleContext(Value1Context.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public CssFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCssFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCssFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCssFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssFunctionContext cssFunction() throws RecognitionException {
		CssFunctionContext _localctx = new CssFunctionContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_cssFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2078);
			match(IDENTIFIER);
			setState(2079);
			match(OPEN_PAREN);
			setState(2080);
			value1();
			setState(2081);
			match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 92:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 31);
		case 1:
			return precpred(_ctx, 30);
		case 2:
			return precpred(_ctx, 29);
		case 3:
			return precpred(_ctx, 28);
		case 4:
			return precpred(_ctx, 27);
		case 5:
			return precpred(_ctx, 26);
		case 6:
			return precpred(_ctx, 25);
		case 7:
			return precpred(_ctx, 24);
		case 8:
			return precpred(_ctx, 23);
		case 9:
			return precpred(_ctx, 22);
		case 10:
			return precpred(_ctx, 21);
		case 11:
			return precpred(_ctx, 20);
		case 12:
			return precpred(_ctx, 17);
		case 13:
			return precpred(_ctx, 19);
		case 14:
			return precpred(_ctx, 18);
		case 15:
			return precpred(_ctx, 15);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u008c\u0824\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"+
		"^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007"+
		"c\u0002d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007"+
		"h\u0002i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007"+
		"m\u0002n\u0007n\u0002o\u0007o\u0002p\u0007p\u0002q\u0007q\u0002r\u0007"+
		"r\u0002s\u0007s\u0002t\u0007t\u0002u\u0007u\u0002v\u0007v\u0002w\u0007"+
		"w\u0002x\u0007x\u0002y\u0007y\u0002z\u0007z\u0002{\u0007{\u0002|\u0007"+
		"|\u0002}\u0007}\u0002~\u0007~\u0002\u007f\u0007\u007f\u0002\u0080\u0007"+
		"\u0080\u0002\u0081\u0007\u0081\u0002\u0082\u0007\u0082\u0002\u0083\u0007"+
		"\u0083\u0002\u0084\u0007\u0084\u0002\u0085\u0007\u0085\u0002\u0086\u0007"+
		"\u0086\u0002\u0087\u0007\u0087\u0002\u0088\u0007\u0088\u0002\u0089\u0007"+
		"\u0089\u0002\u008a\u0007\u008a\u0002\u008b\u0007\u008b\u0002\u008c\u0007"+
		"\u008c\u0002\u008d\u0007\u008d\u0002\u008e\u0007\u008e\u0002\u008f\u0007"+
		"\u008f\u0002\u0090\u0007\u0090\u0002\u0091\u0007\u0091\u0002\u0092\u0007"+
		"\u0092\u0002\u0093\u0007\u0093\u0002\u0094\u0007\u0094\u0002\u0095\u0007"+
		"\u0095\u0002\u0096\u0007\u0096\u0002\u0097\u0007\u0097\u0002\u0098\u0007"+
		"\u0098\u0002\u0099\u0007\u0099\u0002\u009a\u0007\u009a\u0002\u009b\u0007"+
		"\u009b\u0002\u009c\u0007\u009c\u0002\u009d\u0007\u009d\u0002\u009e\u0007"+
		"\u009e\u0002\u009f\u0007\u009f\u0002\u00a0\u0007\u00a0\u0002\u00a1\u0007"+
		"\u00a1\u0002\u00a2\u0007\u00a2\u0002\u00a3\u0007\u00a3\u0002\u00a4\u0007"+
		"\u00a4\u0002\u00a5\u0007\u00a5\u0002\u00a6\u0007\u00a6\u0002\u00a7\u0007"+
		"\u00a7\u0002\u00a8\u0007\u00a8\u0002\u00a9\u0007\u00a9\u0002\u00aa\u0007"+
		"\u00aa\u0002\u00ab\u0007\u00ab\u0002\u00ac\u0007\u00ac\u0002\u00ad\u0007"+
		"\u00ad\u0001\u0000\u0005\u0000\u015e\b\u0000\n\u0000\f\u0000\u0161\t\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\u0169\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002\u0170\b\u0002\n\u0002\f\u0002\u0173\t\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u0183\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006\u0199\b\u0006\n\u0006\f\u0006\u019c\t\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u01a7\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0005\b\u01ad\b\b\n\b\f\b\u01b0\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u01b8\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u01bf\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u01cc\b\u000b\n\u000b\f\u000b\u01cf\t\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u01e4\b\f\u0001\f\u0001\f\u0001\r\u0003\r\u01e9\b\r\u0001\r\u0001\r"+
		"\u0005\r\u01ed\b\r\n\r\f\r\u01f0\t\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u01f8\b\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0005\u0013\u020e\b\u0013\n\u0013\f\u0013\u0211\t\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0005\u0014\u021a\b\u0014\n\u0014\f\u0014\u021d\t\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u0226\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u022e\b\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018"+
		"\u0237\b\u0018\n\u0018\f\u0018\u023a\t\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u024a\b\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0254\b\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0005\u001c\u0264\b\u001c\n\u001c\f\u001c\u0267\t\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u026d\b\u001d"+
		"\n\u001d\f\u001d\u0270\t\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0003\u001f\u027a"+
		"\b\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0003 \u0285\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0005!\u029d\b!\n!\f!\u02a0\t!\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u02a8\b\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0005\"\u02ae\b\"\n\"\f\"\u02b1\t\"\u0001\"\u0001\"\u0001#"+
		"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0003$\u02c1\b$\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0003(\u02de\b(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u02ef\b*\u0001"+
		"+\u0001+\u0001+\u0001+\u0005+\u02f5\b+\n+\f+\u02f8\t+\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u00010\u00010\u00010\u00010\u0003"+
		"0\u0324\b0\u00011\u00011\u00051\u0328\b1\n1\f1\u032b\t1\u00011\u00011"+
		"\u00012\u00012\u00012\u00042\u0332\b2\u000b2\f2\u0333\u00013\u00013\u0001"+
		"3\u00013\u00014\u00014\u00014\u00014\u00014\u00034\u033f\b4\u00015\u0001"+
		"5\u00015\u00015\u00015\u00016\u00016\u00016\u00016\u00016\u00056\u034b"+
		"\b6\n6\f6\u034e\t6\u00017\u00017\u00017\u00017\u00017\u00017\u00037\u0356"+
		"\b7\u00017\u00037\u0359\b7\u00018\u00038\u035c\b8\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"9\u00019\u00039\u036c\b9\u0001:\u0001:\u0001:\u0003:\u0371\b:\u0001;\u0001"+
		";\u0001;\u0003;\u0376\b;\u0001<\u0001<\u0001<\u0001<\u0003<\u037c\b<\u0001"+
		"=\u0001=\u0001=\u0001=\u0001=\u0003=\u0383\b=\u0001=\u0001=\u0001>\u0001"+
		">\u0001>\u0001>\u0003>\u038b\b>\u0001>\u0001>\u0001>\u0001>\u0001?\u0001"+
		"?\u0001?\u0003?\u0394\b?\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001"+
		"@\u0001@\u0001@\u0001@\u0001A\u0001A\u0001A\u0001A\u0001A\u0005A\u03a5"+
		"\bA\nA\fA\u03a8\tA\u0003A\u03aa\bA\u0001A\u0001A\u0001A\u0001A\u0005A"+
		"\u03b0\bA\nA\fA\u03b3\tA\u0001A\u0001A\u0001B\u0001B\u0001B\u0001B\u0001"+
		"B\u0001B\u0003B\u03bd\bB\u0001B\u0001B\u0001C\u0001C\u0001C\u0003C\u03c4"+
		"\bC\u0001C\u0001C\u0001D\u0001D\u0001D\u0003D\u03cb\bD\u0001D\u0001D\u0001"+
		"E\u0001E\u0001E\u0001E\u0001E\u0001E\u0003E\u03d5\bE\u0001E\u0001E\u0001"+
		"E\u0001E\u0001E\u0001E\u0001F\u0001F\u0003F\u03df\bF\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001H\u0001H\u0001H\u0001"+
		"H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001"+
		"H\u0005H\u03f8\bH\nH\fH\u03fb\tH\u0001H\u0001H\u0001H\u0001H\u0005H\u0401"+
		"\bH\nH\fH\u0404\tH\u0001H\u0003H\u0407\bH\u0001H\u0001H\u0001H\u0001H"+
		"\u0001H\u0001H\u0001H\u0001H\u0005H\u0411\bH\nH\fH\u0414\tH\u0001H\u0001"+
		"H\u0001H\u0005H\u0419\bH\nH\fH\u041c\tH\u0001H\u0003H\u041f\bH\u0001I"+
		"\u0001I\u0001I\u0001I\u0001I\u0001I\u0005I\u0427\bI\nI\fI\u042a\tI\u0001"+
		"I\u0001I\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0005J\u0434\bJ\nJ"+
		"\fJ\u0437\tJ\u0001J\u0001J\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0005"+
		"K\u0441\bK\nK\fK\u0444\tK\u0001K\u0001K\u0001K\u0001K\u0005K\u044a\bK"+
		"\nK\fK\u044d\tK\u0001K\u0003K\u0450\bK\u0001L\u0001L\u0003L\u0454\bL\u0001"+
		"M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001"+
		"M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0003M\u0469"+
		"\bM\u0001N\u0001N\u0001N\u0001N\u0005N\u046f\bN\nN\fN\u0472\tN\u0001N"+
		"\u0001N\u0001N\u0005N\u0477\bN\nN\fN\u047a\tN\u0003N\u047c\bN\u0001O\u0001"+
		"O\u0001O\u0001O\u0003O\u0482\bO\u0001O\u0001O\u0001O\u0001O\u0001O\u0001"+
		"P\u0001P\u0005P\u048b\bP\nP\fP\u048e\tP\u0001P\u0001P\u0001Q\u0001Q\u0001"+
		"Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001R\u0001R\u0001R\u0001R\u0001"+
		"R\u0005R\u049f\bR\nR\fR\u04a2\tR\u0001R\u0001R\u0001R\u0001R\u0001R\u0005"+
		"R\u04a9\bR\nR\fR\u04ac\tR\u0001R\u0001R\u0001S\u0003S\u04b1\bS\u0001S"+
		"\u0001S\u0001S\u0001S\u0001T\u0001T\u0001T\u0003T\u04ba\bT\u0001U\u0001"+
		"U\u0001U\u0001U\u0001U\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001"+
		"V\u0001V\u0001V\u0001V\u0001V\u0001W\u0001W\u0001W\u0001W\u0001W\u0001"+
		"W\u0001W\u0001W\u0001W\u0001W\u0001W\u0001X\u0001X\u0001X\u0005X\u04da"+
		"\bX\nX\fX\u04dd\tX\u0001Y\u0001Y\u0001Y\u0001Y\u0001Z\u0001Z\u0001Z\u0001"+
		"Z\u0001Z\u0001Z\u0001[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001"+
		"[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001"+
		"[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001[\u0003"+
		"[\u0504\b[\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001"+
		"\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001"+
		"\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0003\\\u051c\b\\\u0001\\\u0001"+
		"\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001"+
		"\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001"+
		"\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001"+
		"\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001"+
		"\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001"+
		"\\\u0001\\\u0001\\\u0001\\\u0001\\\u0005\\\u0551\b\\\n\\\f\\\u0554\t\\"+
		"\u0001]\u0001]\u0003]\u0558\b]\u0001]\u0001]\u0003]\u055c\b]\u0001]\u0001"+
		"]\u0001^\u0001^\u0001^\u0004^\u0563\b^\u000b^\f^\u0564\u0001_\u0001_\u0001"+
		"_\u0003_\u056a\b_\u0001_\u0001_\u0001_\u0003_\u056f\b_\u0005_\u0571\b"+
		"_\n_\f_\u0574\t_\u0001_\u0001_\u0001`\u0001`\u0001`\u0001`\u0001a\u0001"+
		"a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0003a\u0585\ba\u0001"+
		"b\u0001b\u0001b\u0001b\u0001b\u0001b\u0001b\u0001b\u0003b\u058f\bb\u0001"+
		"c\u0001c\u0001d\u0001d\u0001d\u0001d\u0001d\u0001d\u0003d\u0599\bd\u0001"+
		"e\u0001e\u0003e\u059d\be\u0001e\u0001e\u0001e\u0001e\u0001f\u0001f\u0003"+
		"f\u05a5\bf\u0001f\u0001f\u0001f\u0001f\u0001g\u0001g\u0001g\u0001g\u0001"+
		"g\u0001g\u0001h\u0001h\u0001h\u0001h\u0001h\u0005h\u05b6\bh\nh\fh\u05b9"+
		"\th\u0001i\u0001i\u0001i\u0004i\u05be\bi\u000bi\fi\u05bf\u0001j\u0001"+
		"j\u0001j\u0001j\u0001j\u0001j\u0001j\u0001j\u0001k\u0001k\u0001k\u0003"+
		"k\u05cd\bk\u0001k\u0001k\u0001l\u0001l\u0001l\u0001l\u0001l\u0005l\u05d6"+
		"\bl\nl\fl\u05d9\tl\u0001l\u0001l\u0001l\u0003l\u05de\bl\u0001l\u0001l"+
		"\u0005l\u05e2\bl\nl\fl\u05e5\tl\u0001l\u0001l\u0001m\u0001m\u0003m\u05eb"+
		"\bm\u0001m\u0001m\u0001m\u0003m\u05f0\bm\u0005m\u05f2\bm\nm\fm\u05f5\t"+
		"m\u0001n\u0001n\u0001n\u0003n\u05fa\bn\u0001n\u0001n\u0001n\u0003n\u05ff"+
		"\bn\u0005n\u0601\bn\nn\fn\u0604\tn\u0001n\u0001n\u0001o\u0003o\u0609\b"+
		"o\u0001o\u0001o\u0001o\u0001o\u0001o\u0001o\u0001p\u0005p\u0612\bp\np"+
		"\fp\u0615\tp\u0001q\u0001q\u0003q\u0619\bq\u0001r\u0001r\u0001r\u0001"+
		"r\u0001r\u0001s\u0001s\u0001s\u0003s\u0623\bs\u0001s\u0001s\u0001s\u0001"+
		"s\u0001s\u0001t\u0001t\u0001t\u0005t\u062d\bt\nt\ft\u0630\tt\u0001u\u0001"+
		"u\u0001u\u0001u\u0001v\u0001v\u0001v\u0001v\u0001v\u0001v\u0001v\u0001"+
		"v\u0001v\u0001v\u0001v\u0001w\u0001w\u0001w\u0001w\u0001w\u0001w\u0001"+
		"w\u0001w\u0001w\u0003w\u064a\bw\u0001x\u0001x\u0001x\u0001x\u0001x\u0001"+
		"x\u0001y\u0001y\u0001y\u0001y\u0001y\u0001y\u0001y\u0001y\u0001y\u0001"+
		"y\u0001y\u0001y\u0001y\u0001y\u0001y\u0001y\u0003y\u0662\by\u0001z\u0001"+
		"z\u0001z\u0005z\u0667\bz\nz\fz\u066a\tz\u0001{\u0001{\u0001{\u0001{\u0001"+
		"{\u0001{\u0001{\u0001{\u0001{\u0005{\u0675\b{\n{\f{\u0678\t{\u0001{\u0001"+
		"{\u0001|\u0001|\u0001|\u0001|\u0003|\u0680\b|\u0001|\u0001|\u0001|\u0001"+
		"|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0003|\u068c\b|\u0001|\u0001"+
		"|\u0001}\u0001}\u0001}\u0001}\u0001~\u0001~\u0001\u007f\u0001\u007f\u0001"+
		"\u007f\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u007f\u0001"+
		"\u007f\u0001\u007f\u0001\u0080\u0001\u0080\u0001\u0080\u0001\u0080\u0001"+
		"\u0081\u0001\u0081\u0001\u0081\u0005\u0081\u06a7\b\u0081\n\u0081\f\u0081"+
		"\u06aa\t\u0081\u0001\u0082\u0001\u0082\u0001\u0082\u0001\u0082\u0001\u0082"+
		"\u0001\u0082\u0001\u0082\u0001\u0082\u0001\u0083\u0001\u0083\u0001\u0083"+
		"\u0003\u0083\u06b7\b\u0083\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084"+
		"\u0001\u0084\u0001\u0084\u0001\u0084\u0005\u0084\u06c0\b\u0084\n\u0084"+
		"\f\u0084\u06c3\t\u0084\u0001\u0084\u0001\u0084\u0003\u0084\u06c7\b\u0084"+
		"\u0001\u0085\u0001\u0085\u0001\u0085\u0001\u0085\u0001\u0085\u0001\u0085"+
		"\u0001\u0085\u0001\u0085\u0001\u0085\u0003\u0085\u06d2\b\u0085\u0001\u0086"+
		"\u0001\u0086\u0001\u0086\u0001\u0086\u0001\u0086\u0001\u0086\u0001\u0086"+
		"\u0001\u0086\u0005\u0086\u06dc\b\u0086\n\u0086\f\u0086\u06df\t\u0086\u0001"+
		"\u0086\u0001\u0086\u0003\u0086\u06e3\b\u0086\u0001\u0087\u0001\u0087\u0001"+
		"\u0087\u0003\u0087\u06e8\b\u0087\u0001\u0087\u0003\u0087\u06eb\b\u0087"+
		"\u0001\u0088\u0001\u0088\u0001\u0088\u0005\u0088\u06f0\b\u0088\n\u0088"+
		"\f\u0088\u06f3\t\u0088\u0001\u0088\u0003\u0088\u06f6\b\u0088\u0001\u0089"+
		"\u0001\u0089\u0001\u0089\u0003\u0089\u06fb\b\u0089\u0001\u0089\u0001\u0089"+
		"\u0001\u008a\u0004\u008a\u0700\b\u008a\u000b\u008a\f\u008a\u0701\u0001"+
		"\u008b\u0001\u008b\u0001\u008b\u0001\u008b\u0001\u008b\u0003\u008b\u0709"+
		"\b\u008b\u0001\u008c\u0001\u008c\u0001\u008c\u0005\u008c\u070e\b\u008c"+
		"\n\u008c\f\u008c\u0711\t\u008c\u0001\u008c\u0001\u008c\u0001\u008c\u0005"+
		"\u008c\u0716\b\u008c\n\u008c\f\u008c\u0719\t\u008c\u0001\u008c\u0001\u008c"+
		"\u0001\u008d\u0001\u008d\u0001\u008d\u0005\u008d\u0720\b\u008d\n\u008d"+
		"\f\u008d\u0723\t\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0003\u008d"+
		"\u0728\b\u008d\u0001\u008e\u0001\u008e\u0001\u008e\u0001\u008f\u0001\u008f"+
		"\u0001\u008f\u0001\u008f\u0001\u0090\u0001\u0090\u0001\u0090\u0003\u0090"+
		"\u0734\b\u0090\u0001\u0090\u0005\u0090\u0737\b\u0090\n\u0090\f\u0090\u073a"+
		"\t\u0090\u0001\u0090\u0001\u0090\u0005\u0090\u073e\b\u0090\n\u0090\f\u0090"+
		"\u0741\t\u0090\u0001\u0090\u0001\u0090\u0001\u0091\u0001\u0091\u0001\u0091"+
		"\u0003\u0091\u0748\b\u0091\u0001\u0091\u0005\u0091\u074b\b\u0091\n\u0091"+
		"\f\u0091\u074e\t\u0091\u0001\u0091\u0001\u0091\u0001\u0091\u0003\u0091"+
		"\u0753\b\u0091\u0001\u0092\u0001\u0092\u0001\u0092\u0005\u0092\u0758\b"+
		"\u0092\n\u0092\f\u0092\u075b\t\u0092\u0001\u0092\u0001\u0092\u0001\u0093"+
		"\u0001\u0093\u0001\u0093\u0005\u0093\u0762\b\u0093\n\u0093\f\u0093\u0765"+
		"\t\u0093\u0001\u0093\u0001\u0093\u0005\u0093\u0769\b\u0093\n\u0093\f\u0093"+
		"\u076c\t\u0093\u0001\u0093\u0001\u0093\u0001\u0093\u0001\u0093\u0001\u0094"+
		"\u0001\u0094\u0001\u0094\u0001\u0095\u0001\u0095\u0001\u0095\u0001\u0095"+
		"\u0001\u0096\u0001\u0096\u0001\u0096\u0001\u0096\u0001\u0096\u0001\u0096"+
		"\u0001\u0096\u0001\u0096\u0001\u0096\u0001\u0096\u0001\u0096\u0001\u0096"+
		"\u0001\u0096\u0003\u0096\u0786\b\u0096\u0001\u0097\u0001\u0097\u0001\u0097"+
		"\u0001\u0097\u0001\u0097\u0001\u0097\u0001\u0097\u0003\u0097\u078f\b\u0097"+
		"\u0001\u0097\u0001\u0097\u0001\u0097\u0001\u0097\u0001\u0097\u0001\u0097"+
		"\u0001\u0097\u0001\u0097\u0001\u0097\u0001\u0097\u0001\u0097\u0001\u0097"+
		"\u0003\u0097\u079d\b\u0097\u0001\u0098\u0001\u0098\u0001\u0098\u0001\u0098"+
		"\u0001\u0098\u0001\u0098\u0001\u0098\u0001\u0098\u0001\u0098\u0001\u0098"+
		"\u0003\u0098\u07a9\b\u0098\u0001\u0099\u0001\u0099\u0001\u0099\u0001\u0099"+
		"\u0001\u0099\u0001\u0099\u0001\u009a\u0001\u009a\u0001\u009a\u0001\u009a"+
		"\u0001\u009a\u0003\u009a\u07b6\b\u009a\u0001\u009b\u0001\u009b\u0001\u009b"+
		"\u0005\u009b\u07bb\b\u009b\n\u009b\f\u009b\u07be\t\u009b\u0001\u009b\u0001"+
		"\u009b\u0003\u009b\u07c2\b\u009b\u0001\u009c\u0001\u009c\u0001\u009c\u0001"+
		"\u009c\u0001\u009d\u0001\u009d\u0001\u009d\u0001\u009d\u0001\u009e\u0001"+
		"\u009e\u0001\u009e\u0001\u009e\u0004\u009e\u07d0\b\u009e\u000b\u009e\f"+
		"\u009e\u07d1\u0001\u009f\u0001\u009f\u0001\u00a0\u0001\u00a0\u0001\u00a1"+
		"\u0001\u00a1\u0001\u00a1\u0001\u00a1\u0005\u00a1\u07dc\b\u00a1\n\u00a1"+
		"\f\u00a1\u07df\t\u00a1\u0001\u00a1\u0001\u00a1\u0001\u00a2\u0001\u00a2"+
		"\u0001\u00a2\u0001\u00a2\u0001\u00a2\u0001\u00a2\u0001\u00a3\u0001\u00a3"+
		"\u0001\u00a4\u0004\u00a4\u07ec\b\u00a4\u000b\u00a4\f\u00a4\u07ed\u0001"+
		"\u00a5\u0001\u00a5\u0001\u00a5\u0004\u00a5\u07f3\b\u00a5\u000b\u00a5\f"+
		"\u00a5\u07f4\u0001\u00a5\u0001\u00a5\u0001\u00a6\u0001\u00a6\u0001\u00a6"+
		"\u0003\u00a6\u07fc\b\u00a6\u0001\u00a7\u0001\u00a7\u0001\u00a7\u0001\u00a8"+
		"\u0001\u00a8\u0001\u00a8\u0001\u00a9\u0001\u00a9\u0001\u00a9\u0001\u00a9"+
		"\u0001\u00aa\u0001\u00aa\u0001\u00aa\u0001\u00aa\u0001\u00aa\u0001\u00ab"+
		"\u0001\u00ab\u0001\u00ab\u0005\u00ab\u0810\b\u00ab\n\u00ab\f\u00ab\u0813"+
		"\t\u00ab\u0001\u00ac\u0001\u00ac\u0003\u00ac\u0817\b\u00ac\u0001\u00ac"+
		"\u0001\u00ac\u0001\u00ac\u0001\u00ac\u0003\u00ac\u081d\b\u00ac\u0001\u00ad"+
		"\u0001\u00ad\u0001\u00ad\u0001\u00ad\u0001\u00ad\u0001\u00ad\u0000\u0001"+
		"\u00b8\u00ae\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprt"+
		"vxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
		"\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc"+
		"\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4"+
		"\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c"+
		"\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124"+
		"\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c"+
		"\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154"+
		"\u0156\u0158\u015a\u0000\u0005\u0002\u000023mm\u0001\u0000hi\u0002\u0000"+
		"ggmm\u0002\u0000\u001c\u001cBB\u0005\u0000[[ggppzz\u008c\u008c\u08a8\u0000"+
		"\u015f\u0001\u0000\u0000\u0000\u0002\u0168\u0001\u0000\u0000\u0000\u0004"+
		"\u016a\u0001\u0000\u0000\u0000\u0006\u0182\u0001\u0000\u0000\u0000\b\u0184"+
		"\u0001\u0000\u0000\u0000\n\u018b\u0001\u0000\u0000\u0000\f\u0192\u0001"+
		"\u0000\u0000\u0000\u000e\u01a6\u0001\u0000\u0000\u0000\u0010\u01a8\u0001"+
		"\u0000\u0000\u0000\u0012\u01b7\u0001\u0000\u0000\u0000\u0014\u01b9\u0001"+
		"\u0000\u0000\u0000\u0016\u01c2\u0001\u0000\u0000\u0000\u0018\u01d3\u0001"+
		"\u0000\u0000\u0000\u001a\u01e8\u0001\u0000\u0000\u0000\u001c\u01f7\u0001"+
		"\u0000\u0000\u0000\u001e\u01f9\u0001\u0000\u0000\u0000 \u01fd\u0001\u0000"+
		"\u0000\u0000\"\u0201\u0001\u0000\u0000\u0000$\u0205\u0001\u0000\u0000"+
		"\u0000&\u0209\u0001\u0000\u0000\u0000(\u0214\u0001\u0000\u0000\u0000*"+
		"\u0221\u0001\u0000\u0000\u0000,\u022d\u0001\u0000\u0000\u0000.\u022f\u0001"+
		"\u0000\u0000\u00000\u0232\u0001\u0000\u0000\u00002\u023b\u0001\u0000\u0000"+
		"\u00004\u024d\u0001\u0000\u0000\u00006\u0259\u0001\u0000\u0000\u00008"+
		"\u0260\u0001\u0000\u0000\u0000:\u0268\u0001\u0000\u0000\u0000<\u0273\u0001"+
		"\u0000\u0000\u0000>\u0279\u0001\u0000\u0000\u0000@\u0284\u0001\u0000\u0000"+
		"\u0000B\u029e\u0001\u0000\u0000\u0000D\u02a1\u0001\u0000\u0000\u0000F"+
		"\u02b4\u0001\u0000\u0000\u0000H\u02c0\u0001\u0000\u0000\u0000J\u02c2\u0001"+
		"\u0000\u0000\u0000L\u02c6\u0001\u0000\u0000\u0000N\u02cf\u0001\u0000\u0000"+
		"\u0000P\u02d3\u0001\u0000\u0000\u0000R\u02e1\u0001\u0000\u0000\u0000T"+
		"\u02e9\u0001\u0000\u0000\u0000V\u02f0\u0001\u0000\u0000\u0000X\u02f9\u0001"+
		"\u0000\u0000\u0000Z\u0306\u0001\u0000\u0000\u0000\\\u0311\u0001\u0000"+
		"\u0000\u0000^\u0319\u0001\u0000\u0000\u0000`\u0323\u0001\u0000\u0000\u0000"+
		"b\u0325\u0001\u0000\u0000\u0000d\u032e\u0001\u0000\u0000\u0000f\u0335"+
		"\u0001\u0000\u0000\u0000h\u033e\u0001\u0000\u0000\u0000j\u0340\u0001\u0000"+
		"\u0000\u0000l\u0345\u0001\u0000\u0000\u0000n\u0358\u0001\u0000\u0000\u0000"+
		"p\u035b\u0001\u0000\u0000\u0000r\u036b\u0001\u0000\u0000\u0000t\u036d"+
		"\u0001\u0000\u0000\u0000v\u0372\u0001\u0000\u0000\u0000x\u037b\u0001\u0000"+
		"\u0000\u0000z\u037d\u0001\u0000\u0000\u0000|\u0386\u0001\u0000\u0000\u0000"+
		"~\u0393\u0001\u0000\u0000\u0000\u0080\u0395\u0001\u0000\u0000\u0000\u0082"+
		"\u039f\u0001\u0000\u0000\u0000\u0084\u03b6\u0001\u0000\u0000\u0000\u0086"+
		"\u03c0\u0001\u0000\u0000\u0000\u0088\u03c7\u0001\u0000\u0000\u0000\u008a"+
		"\u03ce\u0001\u0000\u0000\u0000\u008c\u03de\u0001\u0000\u0000\u0000\u008e"+
		"\u03e0\u0001\u0000\u0000\u0000\u0090\u041e\u0001\u0000\u0000\u0000\u0092"+
		"\u0420\u0001\u0000\u0000\u0000\u0094\u042d\u0001\u0000\u0000\u0000\u0096"+
		"\u043a\u0001\u0000\u0000\u0000\u0098\u0453\u0001\u0000\u0000\u0000\u009a"+
		"\u0468\u0001\u0000\u0000\u0000\u009c\u047b\u0001\u0000\u0000\u0000\u009e"+
		"\u047d\u0001\u0000\u0000\u0000\u00a0\u0488\u0001\u0000\u0000\u0000\u00a2"+
		"\u0491\u0001\u0000\u0000\u0000\u00a4\u0499\u0001\u0000\u0000\u0000\u00a6"+
		"\u04b0\u0001\u0000\u0000\u0000\u00a8\u04b9\u0001\u0000\u0000\u0000\u00aa"+
		"\u04bb\u0001\u0000\u0000\u0000\u00ac\u04c0\u0001\u0000\u0000\u0000\u00ae"+
		"\u04cb\u0001\u0000\u0000\u0000\u00b0\u04d6\u0001\u0000\u0000\u0000\u00b2"+
		"\u04de\u0001\u0000\u0000\u0000\u00b4\u04e2\u0001\u0000\u0000\u0000\u00b6"+
		"\u0503\u0001\u0000\u0000\u0000\u00b8\u051b\u0001\u0000\u0000\u0000\u00ba"+
		"\u0557\u0001\u0000\u0000\u0000\u00bc\u055f\u0001\u0000\u0000\u0000\u00be"+
		"\u0566\u0001\u0000\u0000\u0000\u00c0\u0577\u0001\u0000\u0000\u0000\u00c2"+
		"\u0584\u0001\u0000\u0000\u0000\u00c4\u058e\u0001\u0000\u0000\u0000\u00c6"+
		"\u0590\u0001\u0000\u0000\u0000\u00c8\u0598\u0001\u0000\u0000\u0000\u00ca"+
		"\u059c\u0001\u0000\u0000\u0000\u00cc\u05a4\u0001\u0000\u0000\u0000\u00ce"+
		"\u05aa\u0001\u0000\u0000\u0000\u00d0\u05b0\u0001\u0000\u0000\u0000\u00d2"+
		"\u05ba\u0001\u0000\u0000\u0000\u00d4\u05c1\u0001\u0000\u0000\u0000\u00d6"+
		"\u05c9\u0001\u0000\u0000\u0000\u00d8\u05d0\u0001\u0000\u0000\u0000\u00da"+
		"\u05ea\u0001\u0000\u0000\u0000\u00dc\u05f6\u0001\u0000\u0000\u0000\u00de"+
		"\u0608\u0001\u0000\u0000\u0000\u00e0\u0613\u0001\u0000\u0000\u0000\u00e2"+
		"\u0618\u0001\u0000\u0000\u0000\u00e4\u061a\u0001\u0000\u0000\u0000\u00e6"+
		"\u061f\u0001\u0000\u0000\u0000\u00e8\u0629\u0001\u0000\u0000\u0000\u00ea"+
		"\u0631\u0001\u0000\u0000\u0000\u00ec\u0635\u0001\u0000\u0000\u0000\u00ee"+
		"\u0649\u0001\u0000\u0000\u0000\u00f0\u064b\u0001\u0000\u0000\u0000\u00f2"+
		"\u0661\u0001\u0000\u0000\u0000\u00f4\u0663\u0001\u0000\u0000\u0000\u00f6"+
		"\u066b\u0001\u0000\u0000\u0000\u00f8\u067b\u0001\u0000\u0000\u0000\u00fa"+
		"\u068f\u0001\u0000\u0000\u0000\u00fc\u0693\u0001\u0000\u0000\u0000\u00fe"+
		"\u0695\u0001\u0000\u0000\u0000\u0100\u069f\u0001\u0000\u0000\u0000\u0102"+
		"\u06a3\u0001\u0000\u0000\u0000\u0104\u06ab\u0001\u0000\u0000\u0000\u0106"+
		"\u06b3\u0001\u0000\u0000\u0000\u0108\u06c6\u0001\u0000\u0000\u0000\u010a"+
		"\u06d1\u0001\u0000\u0000\u0000\u010c\u06e2\u0001\u0000\u0000\u0000\u010e"+
		"\u06ea\u0001\u0000\u0000\u0000\u0110\u06f5\u0001\u0000\u0000\u0000\u0112"+
		"\u06f7\u0001\u0000\u0000\u0000\u0114\u06ff\u0001\u0000\u0000\u0000\u0116"+
		"\u0708\u0001\u0000\u0000\u0000\u0118\u070a\u0001\u0000\u0000\u0000\u011a"+
		"\u071c\u0001\u0000\u0000\u0000\u011c\u0729\u0001\u0000\u0000\u0000\u011e"+
		"\u072c\u0001\u0000\u0000\u0000\u0120\u0730\u0001\u0000\u0000\u0000\u0122"+
		"\u0744\u0001\u0000\u0000\u0000\u0124\u0754\u0001\u0000\u0000\u0000\u0126"+
		"\u075e\u0001\u0000\u0000\u0000\u0128\u0771\u0001\u0000\u0000\u0000\u012a"+
		"\u0774\u0001\u0000\u0000\u0000\u012c\u0785\u0001\u0000\u0000\u0000\u012e"+
		"\u079c\u0001\u0000\u0000\u0000\u0130\u07a8\u0001\u0000\u0000\u0000\u0132"+
		"\u07aa\u0001\u0000\u0000\u0000\u0134\u07b0\u0001\u0000\u0000\u0000\u0136"+
		"\u07c1\u0001\u0000\u0000\u0000\u0138\u07c3\u0001\u0000\u0000\u0000\u013a"+
		"\u07c7\u0001\u0000\u0000\u0000\u013c\u07cf\u0001\u0000\u0000\u0000\u013e"+
		"\u07d3\u0001\u0000\u0000\u0000\u0140\u07d5\u0001\u0000\u0000\u0000\u0142"+
		"\u07d7\u0001\u0000\u0000\u0000\u0144\u07e2\u0001\u0000\u0000\u0000\u0146"+
		"\u07e8\u0001\u0000\u0000\u0000\u0148\u07eb\u0001\u0000\u0000\u0000\u014a"+
		"\u07ef\u0001\u0000\u0000\u0000\u014c\u07fb\u0001\u0000\u0000\u0000\u014e"+
		"\u07fd\u0001\u0000\u0000\u0000\u0150\u0800\u0001\u0000\u0000\u0000\u0152"+
		"\u0803\u0001\u0000\u0000\u0000\u0154\u0807\u0001\u0000\u0000\u0000\u0156"+
		"\u080c\u0001\u0000\u0000\u0000\u0158\u081c\u0001\u0000\u0000\u0000\u015a"+
		"\u081e\u0001\u0000\u0000\u0000\u015c\u015e\u0003\u0002\u0001\u0000\u015d"+
		"\u015c\u0001\u0000\u0000\u0000\u015e\u0161\u0001\u0000\u0000\u0000\u015f"+
		"\u015d\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000\u0000\u0000\u0160"+
		"\u0001\u0001\u0000\u0000\u0000\u0161\u015f\u0001\u0000\u0000\u0000\u0162"+
		"\u0169\u0003\u0004\u0002\u0000\u0163\u0169\u0003\b\u0004\u0000\u0164\u0169"+
		"\u0003*\u0015\u0000\u0165\u0169\u0003\n\u0005\u0000\u0166\u0169\u0003"+
		"\u0016\u000b\u0000\u0167\u0169\u0003\f\u0006\u0000\u0168\u0162\u0001\u0000"+
		"\u0000\u0000\u0168\u0163\u0001\u0000\u0000\u0000\u0168\u0164\u0001\u0000"+
		"\u0000\u0000\u0168\u0165\u0001\u0000\u0000\u0000\u0168\u0166\u0001\u0000"+
		"\u0000\u0000\u0168\u0167\u0001\u0000\u0000\u0000\u0169\u0003\u0001\u0000"+
		"\u0000\u0000\u016a\u016b\u0005\u0001\u0000\u0000\u016b\u016c\u0005S\u0000"+
		"\u0000\u016c\u0171\u0003\u0006\u0003\u0000\u016d\u016e\u0005\\\u0000\u0000"+
		"\u016e\u0170\u0003\u0006\u0003\u0000\u016f\u016d\u0001\u0000\u0000\u0000"+
		"\u0170\u0173\u0001\u0000\u0000\u0000\u0171\u016f\u0001\u0000\u0000\u0000"+
		"\u0171\u0172\u0001\u0000\u0000\u0000\u0172\u0174\u0001\u0000\u0000\u0000"+
		"\u0173\u0171\u0001\u0000\u0000\u0000\u0174\u0175\u0005T\u0000\u0000\u0175"+
		"\u0176\u0005\u0004\u0000\u0000\u0176\u0177\u0005g\u0000\u0000\u0177\u0178"+
		"\u0005]\u0000\u0000\u0178\u0005\u0001\u0000\u0000\u0000\u0179\u0183\u0005"+
		"R\u0000\u0000\u017a\u0183\u0005m\u0000\u0000\u017b\u0183\u0005g\u0000"+
		"\u0000\u017c\u0183\u0005/\u0000\u0000\u017d\u0183\u00050\u0000\u0000\u017e"+
		"\u0183\u0005@\u0000\u0000\u017f\u0183\u0005\u001d\u0000\u0000\u0180\u0183"+
		"\u00059\u0000\u0000\u0181\u0183\u0005\u0003\u0000\u0000\u0182\u0179\u0001"+
		"\u0000\u0000\u0000\u0182\u017a\u0001\u0000\u0000\u0000\u0182\u017b\u0001"+
		"\u0000\u0000\u0000\u0182\u017c\u0001\u0000\u0000\u0000\u0182\u017d\u0001"+
		"\u0000\u0000\u0000\u0182\u017e\u0001\u0000\u0000\u0000\u0182\u017f\u0001"+
		"\u0000\u0000\u0000\u0182\u0180\u0001\u0000\u0000\u0000\u0182\u0181\u0001"+
		"\u0000\u0000\u0000\u0183\u0007\u0001\u0000\u0000\u0000\u0184\u0185\u0005"+
		"\u0002\u0000\u0000\u0185\u0186\u0005Y\u0000\u0000\u0186\u0187\u0005S\u0000"+
		"\u0000\u0187\u0188\u0003\u001a\r\u0000\u0188\u0189\u0005T\u0000\u0000"+
		"\u0189\u018a\u0005Z\u0000\u0000\u018a\t\u0001\u0000\u0000\u0000\u018b"+
		"\u018c\u0005D\u0000\u0000\u018c\u018d\u0005Y\u0000\u0000\u018d\u018e\u0005"+
		"S\u0000\u0000\u018e\u018f\u0003\u001a\r\u0000\u018f\u0190\u0005T\u0000"+
		"\u0000\u0190\u0191\u0005Z\u0000\u0000\u0191\u000b\u0001\u0000\u0000\u0000"+
		"\u0192\u0193\u0005\b\u0000\u0000\u0193\u0194\u0005Y\u0000\u0000\u0194"+
		"\u0195\u0005S\u0000\u0000\u0195\u019a\u0003\u000e\u0007\u0000\u0196\u0197"+
		"\u0005\\\u0000\u0000\u0197\u0199\u0003\u000e\u0007\u0000\u0198\u0196\u0001"+
		"\u0000\u0000\u0000\u0199\u019c\u0001\u0000\u0000\u0000\u019a\u0198\u0001"+
		"\u0000\u0000\u0000\u019a\u019b\u0001\u0000\u0000\u0000\u019b\u019d\u0001"+
		"\u0000\u0000\u0000\u019c\u019a\u0001\u0000\u0000\u0000\u019d\u019e\u0005"+
		"T\u0000\u0000\u019e\u019f\u0005Z\u0000\u0000\u019f\r\u0001\u0000\u0000"+
		"\u0000\u01a0\u01a1\u0005\t\u0000\u0000\u01a1\u01a2\u0005[\u0000\u0000"+
		"\u01a2\u01a7\u0003\u0010\b\u0000\u01a3\u01a4\u0005\n\u0000\u0000\u01a4"+
		"\u01a5\u0005[\u0000\u0000\u01a5\u01a7\u0003\u0010\b\u0000\u01a6\u01a0"+
		"\u0001\u0000\u0000\u0000\u01a6\u01a3\u0001\u0000\u0000\u0000\u01a7\u000f"+
		"\u0001\u0000\u0000\u0000\u01a8\u01a9\u0005W\u0000\u0000\u01a9\u01ae\u0003"+
		"\u0012\t\u0000\u01aa\u01ab\u0005\\\u0000\u0000\u01ab\u01ad\u0003\u0012"+
		"\t\u0000\u01ac\u01aa\u0001\u0000\u0000\u0000\u01ad\u01b0\u0001\u0000\u0000"+
		"\u0000\u01ae\u01ac\u0001\u0000\u0000\u0000\u01ae\u01af\u0001\u0000\u0000"+
		"\u0000\u01af\u01b1\u0001\u0000\u0000\u0000\u01b0\u01ae\u0001\u0000\u0000"+
		"\u0000\u01b1\u01b2\u0005X\u0000\u0000\u01b2\u0011\u0001\u0000\u0000\u0000"+
		"\u01b3\u01b8\u0003\u0014\n\u0000\u01b4\u01b8\u0005m\u0000\u0000\u01b5"+
		"\u01b8\u00059\u0000\u0000\u01b6\u01b8\u0005;\u0000\u0000\u01b7\u01b3\u0001"+
		"\u0000\u0000\u0000\u01b7\u01b4\u0001\u0000\u0000\u0000\u01b7\u01b5\u0001"+
		"\u0000\u0000\u0000\u01b7\u01b6\u0001\u0000\u0000\u0000\u01b8\u0013\u0001"+
		"\u0000\u0000\u0000\u01b9\u01ba\u00059\u0000\u0000\u01ba\u01bb\u0005x\u0000"+
		"\u0000\u01bb\u01bc\u0005m\u0000\u0000\u01bc\u01be\u0005Y\u0000\u0000\u01bd"+
		"\u01bf\u0003\u00dam\u0000\u01be\u01bd\u0001\u0000\u0000\u0000\u01be\u01bf"+
		"\u0001\u0000\u0000\u0000\u01bf\u01c0\u0001\u0000\u0000\u0000\u01c0\u01c1"+
		"\u0005Z\u0000\u0000\u01c1\u0015\u0001\u0000\u0000\u0000\u01c2\u01c3\u0005"+
		"\u0014\u0000\u0000\u01c3\u01c4\u0005m\u0000\u0000\u01c4\u01c5\u0005[\u0000"+
		"\u0000\u01c5\u01c6\u0005\u0003\u0000\u0000\u01c6\u01c7\u0005_\u0000\u0000"+
		"\u01c7\u01c8\u0005W\u0000\u0000\u01c8\u01cd\u0003\u0018\f\u0000\u01c9"+
		"\u01ca\u0005\\\u0000\u0000\u01ca\u01cc\u0003\u0018\f\u0000\u01cb\u01c9"+
		"\u0001\u0000\u0000\u0000\u01cc\u01cf\u0001\u0000\u0000\u0000\u01cd\u01cb"+
		"\u0001\u0000\u0000\u0000\u01cd\u01ce\u0001\u0000\u0000\u0000\u01ce\u01d0"+
		"\u0001\u0000\u0000\u0000\u01cf\u01cd\u0001\u0000\u0000\u0000\u01d0\u01d1"+
		"\u0005X\u0000\u0000\u01d1\u01d2\u0005]\u0000\u0000\u01d2\u0017\u0001\u0000"+
		"\u0000\u0000\u01d3\u01d4\u0005S\u0000\u0000\u01d4\u01d5\u0005=\u0000\u0000"+
		"\u01d5\u01d6\u0005[\u0000\u0000\u01d6\u01d7\u0005g\u0000\u0000\u01d7\u01d8"+
		"\u0005\\\u0000\u0000\u01d8\u01e3\u0001\u0000\u0000\u0000\u01d9\u01da\u0005"+
		"m\u0000\u0000\u01da\u01db\u0005[\u0000\u0000\u01db\u01e4\u0005m\u0000"+
		"\u0000\u01dc\u01dd\u00057\u0000\u0000\u01dd\u01de\u0005[\u0000\u0000\u01de"+
		"\u01df\u0005g\u0000\u0000\u01df\u01e0\u0005\\\u0000\u0000\u01e0\u01e1"+
		"\u00056\u0000\u0000\u01e1\u01e2\u0005[\u0000\u0000\u01e2\u01e4\u0005g"+
		"\u0000\u0000\u01e3\u01d9\u0001\u0000\u0000\u0000\u01e3\u01dc\u0001\u0000"+
		"\u0000\u0000\u01e4\u01e5\u0001\u0000\u0000\u0000\u01e5\u01e6\u0005T\u0000"+
		"\u0000\u01e6\u0019\u0001\u0000\u0000\u0000\u01e7\u01e9\u0003\u001c\u000e"+
		"\u0000\u01e8\u01e7\u0001\u0000\u0000\u0000\u01e8\u01e9\u0001\u0000\u0000"+
		"\u0000\u01e9\u01ee\u0001\u0000\u0000\u0000\u01ea\u01eb\u0005\\\u0000\u0000"+
		"\u01eb\u01ed\u0003\u001c\u000e\u0000\u01ec\u01ea\u0001\u0000\u0000\u0000"+
		"\u01ed\u01f0\u0001\u0000\u0000\u0000\u01ee\u01ec\u0001\u0000\u0000\u0000"+
		"\u01ee\u01ef\u0001\u0000\u0000\u0000\u01ef\u001b\u0001\u0000\u0000\u0000"+
		"\u01f0\u01ee\u0001\u0000\u0000\u0000\u01f1\u01f8\u0003$\u0012\u0000\u01f2"+
		"\u01f8\u0003&\u0013\u0000\u01f3\u01f8\u0003\"\u0011\u0000\u01f4\u01f8"+
		"\u0003 \u0010\u0000\u01f5\u01f8\u0003\u001e\u000f\u0000\u01f6\u01f8\u0003"+
		"(\u0014\u0000\u01f7\u01f1\u0001\u0000\u0000\u0000\u01f7\u01f2\u0001\u0000"+
		"\u0000\u0000\u01f7\u01f3\u0001\u0000\u0000\u0000\u01f7\u01f4\u0001\u0000"+
		"\u0000\u0000\u01f7\u01f5\u0001\u0000\u0000\u0000\u01f7\u01f6\u0001\u0000"+
		"\u0000\u0000\u01f8\u001d\u0001\u0000\u0000\u0000\u01f9\u01fa\u0005!\u0000"+
		"\u0000\u01fa\u01fb\u0005[\u0000\u0000\u01fb\u01fc\u0005g\u0000\u0000\u01fc"+
		"\u001f\u0001\u0000\u0000\u0000\u01fd\u01fe\u0005$\u0000\u0000\u01fe\u01ff"+
		"\u0005[\u0000\u0000\u01ff\u0200\u0005g\u0000\u0000\u0200!\u0001\u0000"+
		"\u0000\u0000\u0201\u0202\u0005\"\u0000\u0000\u0202\u0203\u0005[\u0000"+
		"\u0000\u0203\u0204\u0005g\u0000\u0000\u0204#\u0001\u0000\u0000\u0000\u0205"+
		"\u0206\u0005#\u0000\u0000\u0206\u0207\u0005[\u0000\u0000\u0207\u0208\u0005"+
		"g\u0000\u0000\u0208%\u0001\u0000\u0000\u0000\u0209\u020a\u0005#\u0000"+
		"\u0000\u020a\u020b\u0005[\u0000\u0000\u020b\u020f\u0005e\u0000\u0000\u020c"+
		"\u020e\u0003\u0114\u008a\u0000\u020d\u020c\u0001\u0000\u0000\u0000\u020e"+
		"\u0211\u0001\u0000\u0000\u0000\u020f\u020d\u0001\u0000\u0000\u0000\u020f"+
		"\u0210\u0001\u0000\u0000\u0000\u0210\u0212\u0001\u0000\u0000\u0000\u0211"+
		"\u020f\u0001\u0000\u0000\u0000\u0212\u0213\u0005e\u0000\u0000\u0213\'"+
		"\u0001\u0000\u0000\u0000\u0214\u0215\u0005%\u0000\u0000\u0215\u0216\u0005"+
		"[\u0000\u0000\u0216\u0217\u0005W\u0000\u0000\u0217\u021b\u0005e\u0000"+
		"\u0000\u0218\u021a\u0003\u0148\u00a4\u0000\u0219\u0218\u0001\u0000\u0000"+
		"\u0000\u021a\u021d\u0001\u0000\u0000\u0000\u021b\u0219\u0001\u0000\u0000"+
		"\u0000\u021b\u021c\u0001\u0000\u0000\u0000\u021c\u021e\u0001\u0000\u0000"+
		"\u0000\u021d\u021b\u0001\u0000\u0000\u0000\u021e\u021f\u0005e\u0000\u0000"+
		"\u021f\u0220\u0005X\u0000\u0000\u0220)\u0001\u0000\u0000\u0000\u0221\u0222"+
		"\u0005\u0005\u0000\u0000\u0222\u0223\u0005\u0006\u0000\u0000\u0223\u0225"+
		"\u0005m\u0000\u0000\u0224\u0226\u0003,\u0016\u0000\u0225\u0224\u0001\u0000"+
		"\u0000\u0000\u0225\u0226\u0001\u0000\u0000\u0000\u0226\u0227\u0001\u0000"+
		"\u0000\u0000\u0227\u0228\u0005S\u0000\u0000\u0228\u0229\u0003B!\u0000"+
		"\u0229\u022a\u0005T\u0000\u0000\u022a+\u0001\u0000\u0000\u0000\u022b\u022e"+
		"\u0003.\u0017\u0000\u022c\u022e\u00030\u0018\u0000\u022d\u022b\u0001\u0000"+
		"\u0000\u0000\u022d\u022c\u0001\u0000\u0000\u0000\u022e-\u0001\u0000\u0000"+
		"\u0000\u022f\u0230\u0005Q\u0000\u0000\u0230\u0231\u0005m\u0000\u0000\u0231"+
		"/\u0001\u0000\u0000\u0000\u0232\u0233\u0005P\u0000\u0000\u0233\u0238\u0003"+
		">\u001f\u0000\u0234\u0235\u0005\\\u0000\u0000\u0235\u0237\u0005m\u0000"+
		"\u0000\u0236\u0234\u0001\u0000\u0000\u0000\u0237\u023a\u0001\u0000\u0000"+
		"\u0000\u0238\u0236\u0001\u0000\u0000\u0000\u0238\u0239\u0001\u0000\u0000"+
		"\u0000\u02391\u0001\u0000\u0000\u0000\u023a\u0238\u0001\u0000\u0000\u0000"+
		"\u023b\u023c\u0005E\u0000\u0000\u023c\u023d\u0005Y\u0000\u0000\u023d\u023e"+
		"\u0005Z\u0000\u0000\u023e\u0249\u0005S\u0000\u0000\u023f\u0240\u0005K"+
		"\u0000\u0000\u0240\u0241\u0005W\u0000\u0000\u0241\u0242\u00038\u001c\u0000"+
		"\u0242\u0243\u0005X\u0000\u0000\u0243\u0244\u0005]\u0000\u0000\u0244\u024a"+
		"\u0001\u0000\u0000\u0000\u0245\u0246\u0005K\u0000\u0000\u0246\u0247\u0003"+
		"d2\u0000\u0247\u0248\u0005]\u0000\u0000\u0248\u024a\u0001\u0000\u0000"+
		"\u0000\u0249\u023f\u0001\u0000\u0000\u0000\u0249\u0245\u0001\u0000\u0000"+
		"\u0000\u024a\u024b\u0001\u0000\u0000\u0000\u024b\u024c\u0005T\u0000\u0000"+
		"\u024c3\u0001\u0000\u0000\u0000\u024d\u024e\u0003\u00a8T\u0000\u024e\u024f"+
		"\u0005m\u0000\u0000\u024f\u0250\u0005Y\u0000\u0000\u0250\u0253\u0005Z"+
		"\u0000\u0000\u0251\u0252\u0005[\u0000\u0000\u0252\u0254\u0003@ \u0000"+
		"\u0253\u0251\u0001\u0000\u0000\u0000\u0253\u0254\u0001\u0000\u0000\u0000"+
		"\u0254\u0255\u0001\u0000\u0000\u0000\u0255\u0256\u0005S\u0000\u0000\u0256"+
		"\u0257\u0003\u0112\u0089\u0000\u0257\u0258\u0005T\u0000\u0000\u02585\u0001"+
		"\u0000\u0000\u0000\u0259\u025a\u0005m\u0000\u0000\u025a\u025b\u0005_\u0000"+
		"\u0000\u025b\u025c\u0005W\u0000\u0000\u025c\u025d\u00038\u001c\u0000\u025d"+
		"\u025e\u0005X\u0000\u0000\u025e\u025f\u0005]\u0000\u0000\u025f7\u0001"+
		"\u0000\u0000\u0000\u0260\u0265\u0003:\u001d\u0000\u0261\u0262\u0005\\"+
		"\u0000\u0000\u0262\u0264\u0003:\u001d\u0000\u0263\u0261\u0001\u0000\u0000"+
		"\u0000\u0264\u0267\u0001\u0000\u0000\u0000\u0265\u0263\u0001\u0000\u0000"+
		"\u0000\u0265\u0266\u0001\u0000\u0000\u0000\u02669\u0001\u0000\u0000\u0000"+
		"\u0267\u0265\u0001\u0000\u0000\u0000\u0268\u0269\u0005S\u0000\u0000\u0269"+
		"\u026e\u0003<\u001e\u0000\u026a\u026b\u0005\\\u0000\u0000\u026b\u026d"+
		"\u0003<\u001e\u0000\u026c\u026a\u0001\u0000\u0000\u0000\u026d\u0270\u0001"+
		"\u0000\u0000\u0000\u026e\u026c\u0001\u0000\u0000\u0000\u026e\u026f\u0001"+
		"\u0000\u0000\u0000\u026f\u0271\u0001\u0000\u0000\u0000\u0270\u026e\u0001"+
		"\u0000\u0000\u0000\u0271\u0272\u0005T\u0000\u0000\u0272;\u0001\u0000\u0000"+
		"\u0000\u0273\u0274\u0003@ \u0000\u0274\u0275\u0005[\u0000\u0000\u0275"+
		"\u0276\u0003>\u001f\u0000\u0276=\u0001\u0000\u0000\u0000\u0277\u027a\u0003"+
		"@ \u0000\u0278\u027a\u0003\u00eew\u0000\u0279\u0277\u0001\u0000\u0000"+
		"\u0000\u0279\u0278\u0001\u0000\u0000\u0000\u027a?\u0001\u0000\u0000\u0000"+
		"\u027b\u0285\u0005m\u0000\u0000\u027c\u0285\u0005g\u0000\u0000\u027d\u0285"+
		"\u0005j\u0000\u0000\u027e\u0285\u0005&\u0000\u0000\u027f\u0285\u0005J"+
		"\u0000\u0000\u0280\u0285\u0005R\u0000\u0000\u0281\u0285\u0005\u0089\u0000"+
		"\u0000\u0282\u0285\u0005/\u0000\u0000\u0283\u0285\u00050\u0000\u0000\u0284"+
		"\u027b\u0001\u0000\u0000\u0000\u0284\u027c\u0001\u0000\u0000\u0000\u0284"+
		"\u027d\u0001\u0000\u0000\u0000\u0284\u027e\u0001\u0000\u0000\u0000\u0284"+
		"\u027f\u0001\u0000\u0000\u0000\u0284\u0280\u0001\u0000\u0000\u0000\u0284"+
		"\u0281\u0001\u0000\u0000\u0000\u0284\u0282\u0001\u0000\u0000\u0000\u0284"+
		"\u0283\u0001\u0000\u0000\u0000\u0285A\u0001\u0000\u0000\u0000\u0286\u029d"+
		"\u0003h4\u0000\u0287\u029d\u0003\u00a4R\u0000\u0288\u029d\u0003\u0082"+
		"A\u0000\u0289\u029d\u0003\u00b6[\u0000\u028a\u029d\u0003\u00f0x\u0000"+
		"\u028b\u029d\u0003\u00f6{\u0000\u028c\u029d\u0003\u00d8l\u0000\u028d\u029d"+
		"\u0003\u00ecv\u0000\u028e\u029d\u00032\u0019\u0000\u028f\u029d\u00036"+
		"\u001b\u0000\u0290\u029d\u0003\u010c\u0086\u0000\u0291\u029d\u0003\u00c8"+
		"d\u0000\u0292\u029d\u0003\u009eO\u0000\u0293\u029d\u0003\u0092I\u0000"+
		"\u0294\u029d\u0003\u00aaU\u0000\u0295\u029d\u0003\u00acV\u0000\u0296\u029d"+
		"\u0003D\"\u0000\u0297\u029d\u0003L&\u0000\u0298\u029d\u00034\u001a\u0000"+
		"\u0299\u029d\u0003\u008aE\u0000\u029a\u029d\u0003\u008eG\u0000\u029b\u029d"+
		"\u0003\u00aeW\u0000\u029c\u0286\u0001\u0000\u0000\u0000\u029c\u0287\u0001"+
		"\u0000\u0000\u0000\u029c\u0288\u0001\u0000\u0000\u0000\u029c\u0289\u0001"+
		"\u0000\u0000\u0000\u029c\u028a\u0001\u0000\u0000\u0000\u029c\u028b\u0001"+
		"\u0000\u0000\u0000\u029c\u028c\u0001\u0000\u0000\u0000\u029c\u028d\u0001"+
		"\u0000\u0000\u0000\u029c\u028e\u0001\u0000\u0000\u0000\u029c\u028f\u0001"+
		"\u0000\u0000\u0000\u029c\u0290\u0001\u0000\u0000\u0000\u029c\u0291\u0001"+
		"\u0000\u0000\u0000\u029c\u0292\u0001\u0000\u0000\u0000\u029c\u0293\u0001"+
		"\u0000\u0000\u0000\u029c\u0294\u0001\u0000\u0000\u0000\u029c\u0295\u0001"+
		"\u0000\u0000\u0000\u029c\u0296\u0001\u0000\u0000\u0000\u029c\u0297\u0001"+
		"\u0000\u0000\u0000\u029c\u0298\u0001\u0000\u0000\u0000\u029c\u0299\u0001"+
		"\u0000\u0000\u0000\u029c\u029a\u0001\u0000\u0000\u0000\u029c\u029b\u0001"+
		"\u0000\u0000\u0000\u029d\u02a0\u0001\u0000\u0000\u0000\u029e\u029c\u0001"+
		"\u0000\u0000\u0000\u029e\u029f\u0001\u0000\u0000\u0000\u029fC\u0001\u0000"+
		"\u0000\u0000\u02a0\u029e\u0001\u0000\u0000\u0000\u02a1\u02a2\u00054\u0000"+
		"\u0000\u02a2\u02a3\u0005Y\u0000\u0000\u02a3\u02a4\u0003N\'\u0000\u02a4"+
		"\u02a7\u0005Z\u0000\u0000\u02a5\u02a6\u0005[\u0000\u0000\u02a6\u02a8\u0005"+
		"J\u0000\u0000\u02a7\u02a5\u0001\u0000\u0000\u0000\u02a7\u02a8\u0001\u0000"+
		"\u0000\u0000\u02a8\u02a9\u0001\u0000\u0000\u0000\u02a9\u02af\u0005S\u0000"+
		"\u0000\u02aa\u02ae\u0003F#\u0000\u02ab\u02ae\u0003H$\u0000\u02ac\u02ae"+
		"\u0003\u0112\u0089\u0000\u02ad\u02aa\u0001\u0000\u0000\u0000\u02ad\u02ab"+
		"\u0001\u0000\u0000\u0000\u02ad\u02ac\u0001\u0000\u0000\u0000\u02ae\u02b1"+
		"\u0001\u0000\u0000\u0000\u02af\u02ad\u0001\u0000\u0000\u0000\u02af\u02b0"+
		"\u0001\u0000\u0000\u0000\u02b0\u02b2\u0001\u0000\u0000\u0000\u02b1\u02af"+
		"\u0001\u0000\u0000\u0000\u02b2\u02b3\u0005T\u0000\u0000\u02b3E\u0001\u0000"+
		"\u0000\u0000\u02b4\u02b5\u0005\u0014\u0000\u0000\u02b5\u02b6\u0005m\u0000"+
		"\u0000\u02b6\u02b7\u0005_\u0000\u0000\u02b7\u02b8\u0003\u00c8d\u0000\u02b8"+
		"\u02b9\u0005]\u0000\u0000\u02b9G\u0001\u0000\u0000\u0000\u02ba\u02bb\u0003"+
		"\u00ba]\u0000\u02bb\u02bc\u0005]\u0000\u0000\u02bc\u02c1\u0001\u0000\u0000"+
		"\u0000\u02bd\u02be\u0003J%\u0000\u02be\u02bf\u0005]\u0000\u0000\u02bf"+
		"\u02c1\u0001\u0000\u0000\u0000\u02c0\u02ba\u0001\u0000\u0000\u0000\u02c0"+
		"\u02bd\u0001\u0000\u0000\u0000\u02c1I\u0001\u0000\u0000\u0000\u02c2\u02c3"+
		"\u0003d2\u0000\u02c3\u02c4\u0005_\u0000\u0000\u02c4\u02c5\u0003\u00b8"+
		"\\\u0000\u02c5K\u0001\u0000\u0000\u0000\u02c6\u02c7\u00055\u0000\u0000"+
		"\u02c7\u02c8\u0005Y\u0000\u0000\u02c8\u02c9\u0003f3\u0000\u02c9\u02ca"+
		"\u0005Z\u0000\u0000\u02ca\u02cb\u0005S\u0000\u0000\u02cb\u02cc\u0003Z"+
		"-\u0000\u02cc\u02cd\u0003\\.\u0000\u02cd\u02ce\u0005T\u0000\u0000\u02ce"+
		"M\u0001\u0000\u0000\u0000\u02cf\u02d0\u0005m\u0000\u0000\u02d0\u02d1\u0005"+
		"[\u0000\u0000\u02d1\u02d2\u0005&\u0000\u0000\u02d2O\u0001\u0000\u0000"+
		"\u0000\u02d3\u02d4\u0005\u0014\u0000\u0000\u02d4\u02d5\u0005m\u0000\u0000"+
		"\u02d5\u02d6\u0005_\u0000\u0000\u02d6\u02dd\u0003\u00c8d\u0000\u02d7\u02d8"+
		"\u0005x\u0000\u0000\u02d8\u02d9\u00053\u0000\u0000\u02d9\u02da\u0005Y"+
		"\u0000\u0000\u02da\u02db\u0003^/\u0000\u02db\u02dc\u0005Z\u0000\u0000"+
		"\u02dc\u02de\u0001\u0000\u0000\u0000\u02dd\u02d7\u0001\u0000\u0000\u0000"+
		"\u02dd\u02de\u0001\u0000\u0000\u0000\u02de\u02df\u0001\u0000\u0000\u0000"+
		"\u02df\u02e0\u0005]\u0000\u0000\u02e0Q\u0001\u0000\u0000\u0000\u02e1\u02e2"+
		"\u0003\u00c8d\u0000\u02e2\u02e3\u0005x\u0000\u0000\u02e3\u02e4\u00052"+
		"\u0000\u0000\u02e4\u02e5\u0005Y\u0000\u0000\u02e5\u02e6\u0003T*\u0000"+
		"\u02e6\u02e7\u0005Z\u0000\u0000\u02e7\u02e8\u0005]\u0000\u0000\u02e8S"+
		"\u0001\u0000\u0000\u0000\u02e9\u02ee\u0005y\u0000\u0000\u02ea\u02ef\u0005"+
		"m\u0000\u0000\u02eb\u02ef\u0003\u00c8d\u0000\u02ec\u02ef\u0003\u00dcn"+
		"\u0000\u02ed\u02ef\u0003\u00be_\u0000\u02ee\u02ea\u0001\u0000\u0000\u0000"+
		"\u02ee\u02eb\u0001\u0000\u0000\u0000\u02ee\u02ec\u0001\u0000\u0000\u0000"+
		"\u02ee\u02ed\u0001\u0000\u0000\u0000\u02efU\u0001\u0000\u0000\u0000\u02f0"+
		"\u02f6\u0003\u00b8\\\u0000\u02f1\u02f2\u0005\\\u0000\u0000\u02f2\u02f3"+
		"\u0005y\u0000\u0000\u02f3\u02f5\u0003\u00b8\\\u0000\u02f4\u02f1\u0001"+
		"\u0000\u0000\u0000\u02f5\u02f8\u0001\u0000\u0000\u0000\u02f6\u02f4\u0001"+
		"\u0000\u0000\u0000\u02f6\u02f7\u0001\u0000\u0000\u0000\u02f7W\u0001\u0000"+
		"\u0000\u0000\u02f8\u02f6\u0001\u0000\u0000\u0000\u02f9\u02fa\u0003\u00c8"+
		"d\u0000\u02fa\u02fb\u0005x\u0000\u0000\u02fb\u02fc\u00052\u0000\u0000"+
		"\u02fc\u02fd\u0005Y\u0000\u0000\u02fd\u02fe\u0003\u00c8d\u0000\u02fe\u02ff"+
		"\u0005x\u0000\u0000\u02ff\u0300\u00053\u0000\u0000\u0300\u0301\u0005Y"+
		"\u0000\u0000\u0301\u0302\u0003^/\u0000\u0302\u0303\u0005Z\u0000\u0000"+
		"\u0303\u0304\u0005Z\u0000\u0000\u0304\u0305\u0005]\u0000\u0000\u0305Y"+
		"\u0001\u0000\u0000\u0000\u0306\u0307\u0005\u0014\u0000\u0000\u0307\u0308"+
		"\u0005m\u0000\u0000\u0308\u0309\u0005_\u0000\u0000\u0309\u030a\u0003d"+
		"2\u0000\u030a\u030b\u0005x\u0000\u0000\u030b\u030c\u00053\u0000\u0000"+
		"\u030c\u030d\u0005Y\u0000\u0000\u030d\u030e\u0003^/\u0000\u030e\u030f"+
		"\u0005Z\u0000\u0000\u030f\u0310\u0005]\u0000\u0000\u0310[\u0001\u0000"+
		"\u0000\u0000\u0311\u0312\u0003\u00c8d\u0000\u0312\u0313\u0005x\u0000\u0000"+
		"\u0313\u0314\u00052\u0000\u0000\u0314\u0315\u0005Y\u0000\u0000\u0315\u0316"+
		"\u0003\u00b8\\\u0000\u0316\u0317\u0005Z\u0000\u0000\u0317\u0318\u0005"+
		"]\u0000\u0000\u0318]\u0001\u0000\u0000\u0000\u0319\u031a\u0005m\u0000"+
		"\u0000\u031a\u031b\u0005\u001b\u0000\u0000\u031b\u031c\u0003\u00c8d\u0000"+
		"\u031c\u031d\u0003`0\u0000\u031d\u031e\u0005m\u0000\u0000\u031e_\u0001"+
		"\u0000\u0000\u0000\u031f\u0324\u0005d\u0000\u0000\u0320\u0321\u0005_\u0000"+
		"\u0000\u0321\u0324\u0005_\u0000\u0000\u0322\u0324\u0005c\u0000\u0000\u0323"+
		"\u031f\u0001\u0000\u0000\u0000\u0323\u0320\u0001\u0000\u0000\u0000\u0323"+
		"\u0322\u0001\u0000\u0000\u0000\u0324a\u0001\u0000\u0000\u0000\u0325\u0329"+
		"\u0005S\u0000\u0000\u0326\u0328\u0003\u00b6[\u0000\u0327\u0326\u0001\u0000"+
		"\u0000\u0000\u0328\u032b\u0001\u0000\u0000\u0000\u0329\u0327\u0001\u0000"+
		"\u0000\u0000\u0329\u032a\u0001\u0000\u0000\u0000\u032a\u032c\u0001\u0000"+
		"\u0000\u0000\u032b\u0329\u0001\u0000\u0000\u0000\u032c\u032d\u0005T\u0000"+
		"\u0000\u032dc\u0001\u0000\u0000\u0000\u032e\u0331\u0003\u00c8d\u0000\u032f"+
		"\u0330\u0005x\u0000\u0000\u0330\u0332\u0007\u0000\u0000\u0000\u0331\u032f"+
		"\u0001\u0000\u0000\u0000\u0332\u0333\u0001\u0000\u0000\u0000\u0333\u0331"+
		"\u0001\u0000\u0000\u0000\u0333\u0334\u0001\u0000\u0000\u0000\u0334e\u0001"+
		"\u0000\u0000\u0000\u0335\u0336\u0005m\u0000\u0000\u0336\u0337\u0005[\u0000"+
		"\u0000\u0337\u0338\u0005m\u0000\u0000\u0338g\u0001\u0000\u0000\u0000\u0339"+
		"\u033f\u0003z=\u0000\u033a\u033f\u0003|>\u0000\u033b\u033f\u0003\u0080"+
		"@\u0000\u033c\u033f\u0003j5\u0000\u033d\u033f\u0003p8\u0000\u033e\u0339"+
		"\u0001\u0000\u0000\u0000\u033e\u033a\u0001\u0000\u0000\u0000\u033e\u033b"+
		"\u0001\u0000\u0000\u0000\u033e\u033c\u0001\u0000\u0000\u0000\u033e\u033d"+
		"\u0001\u0000\u0000\u0000\u033fi\u0001\u0000\u0000\u0000\u0340\u0341\u0005"+
		"m\u0000\u0000\u0341\u0342\u0005_\u0000\u0000\u0342\u0343\u0003l6\u0000"+
		"\u0343\u0344\u0005]\u0000\u0000\u0344k\u0001\u0000\u0000\u0000\u0345\u0346"+
		"\u0005+\u0000\u0000\u0346\u0347\u0005x\u0000\u0000\u0347\u034c\u0005m"+
		"\u0000\u0000\u0348\u0349\u0005x\u0000\u0000\u0349\u034b\u0003n7\u0000"+
		"\u034a\u0348\u0001\u0000\u0000\u0000\u034b\u034e\u0001\u0000\u0000\u0000"+
		"\u034c\u034a\u0001\u0000\u0000\u0000\u034c\u034d\u0001\u0000\u0000\u0000"+
		"\u034dm\u0001\u0000\u0000\u0000\u034e\u034c\u0001\u0000\u0000\u0000\u034f"+
		"\u0350\u0005?\u0000\u0000\u0350\u0351\u0005Y\u0000\u0000\u0351\u0359\u0005"+
		"Z\u0000\u0000\u0352\u0353\u0005m\u0000\u0000\u0353\u0355\u0005Y\u0000"+
		"\u0000\u0354\u0356\u0003\u00dam\u0000\u0355\u0354\u0001\u0000\u0000\u0000"+
		"\u0355\u0356\u0001\u0000\u0000\u0000\u0356\u0357\u0001\u0000\u0000\u0000"+
		"\u0357\u0359\u0005Z\u0000\u0000\u0358\u034f\u0001\u0000\u0000\u0000\u0358"+
		"\u0352\u0001\u0000\u0000\u0000\u0359o\u0001\u0000\u0000\u0000\u035a\u035c"+
		"\u0005-\u0000\u0000\u035b\u035a\u0001\u0000\u0000\u0000\u035b\u035c\u0001"+
		"\u0000\u0000\u0000\u035c\u035d\u0001\u0000\u0000\u0000\u035d\u035e\u0005"+
		"m\u0000\u0000\u035e\u035f\u0005_\u0000\u0000\u035f\u0360\u0005N\u0000"+
		"\u0000\u0360\u0361\u0005\u001d\u0000\u0000\u0361\u0362\u0005q\u0000\u0000"+
		"\u0362\u0363\u0003r9\u0000\u0363\u0364\u0005r\u0000\u0000\u0364\u0365"+
		"\u0005Y\u0000\u0000\u0365\u0366\u0003x<\u0000\u0366\u0367\u0005Z\u0000"+
		"\u0000\u0367\u0368\u0005]\u0000\u0000\u0368q\u0001\u0000\u0000\u0000\u0369"+
		"\u036c\u0003t:\u0000\u036a\u036c\u0003v;\u0000\u036b\u0369\u0001\u0000"+
		"\u0000\u0000\u036b\u036a\u0001\u0000\u0000\u0000\u036cs\u0001\u0000\u0000"+
		"\u0000\u036d\u0370\u0005&\u0000\u0000\u036e\u036f\u0005W\u0000\u0000\u036f"+
		"\u0371\u0005X\u0000\u0000\u0370\u036e\u0001\u0000\u0000\u0000\u0370\u0371"+
		"\u0001\u0000\u0000\u0000\u0371u\u0001\u0000\u0000\u0000\u0372\u0375\u0005"+
		"m\u0000\u0000\u0373\u0374\u0005W\u0000\u0000\u0374\u0376\u0005X\u0000"+
		"\u0000\u0375\u0373\u0001\u0000\u0000\u0000\u0375\u0376\u0001\u0000\u0000"+
		"\u0000\u0376w\u0001\u0000\u0000\u0000\u0377\u0378\u0005+\u0000\u0000\u0378"+
		"\u0379\u0005x\u0000\u0000\u0379\u037c\u0003\u00d6k\u0000\u037a\u037c\u0003"+
		"\u00b8\\\u0000\u037b\u0377\u0001\u0000\u0000\u0000\u037b\u037a\u0001\u0000"+
		"\u0000\u0000\u037cy\u0001\u0000\u0000\u0000\u037d\u037e\u0005m\u0000\u0000"+
		"\u037e\u037f\u0005[\u0000\u0000\u037f\u0382\u0003>\u001f\u0000\u0380\u0381"+
		"\u0005_\u0000\u0000\u0381\u0383\u0003\u00b8\\\u0000\u0382\u0380\u0001"+
		"\u0000\u0000\u0000\u0382\u0383\u0001\u0000\u0000\u0000\u0383\u0384\u0001"+
		"\u0000\u0000\u0000\u0384\u0385\u0005]\u0000\u0000\u0385{\u0001\u0000\u0000"+
		"\u0000\u0386\u0387\u0003~?\u0000\u0387\u038a\u0005m\u0000\u0000\u0388"+
		"\u0389\u0005[\u0000\u0000\u0389\u038b\u0003>\u001f\u0000\u038a\u0388\u0001"+
		"\u0000\u0000\u0000\u038a\u038b\u0001\u0000\u0000\u0000\u038b\u038c\u0001"+
		"\u0000\u0000\u0000\u038c\u038d\u0005_\u0000\u0000\u038d\u038e\u0003\u00b8"+
		"\\\u0000\u038e\u038f\u0005]\u0000\u0000\u038f}\u0001\u0000\u0000\u0000"+
		"\u0390\u0394\u0005\u0013\u0000\u0000\u0391\u0394\u0005\u0015\u0000\u0000"+
		"\u0392\u0394\u0005\u0014\u0000\u0000\u0393\u0390\u0001\u0000\u0000\u0000"+
		"\u0393\u0391\u0001\u0000\u0000\u0000\u0393\u0392\u0001\u0000\u0000\u0000"+
		"\u0394\u007f\u0001\u0000\u0000\u0000\u0395\u0396\u0005m\u0000\u0000\u0396"+
		"\u0397\u0005[\u0000\u0000\u0397\u0398\u0003>\u001f\u0000\u0398\u0399\u0005"+
		"W\u0000\u0000\u0399\u039a\u0005X\u0000\u0000\u039a\u039b\u0005_\u0000"+
		"\u0000\u039b\u039c\u0005W\u0000\u0000\u039c\u039d\u0005X\u0000\u0000\u039d"+
		"\u039e\u0005]\u0000\u0000\u039e\u0081\u0001\u0000\u0000\u0000\u039f\u03a0"+
		"\u0005(\u0000\u0000\u03a0\u03a9\u0005Y\u0000\u0000\u03a1\u03a6\u0003\u00a6"+
		"S\u0000\u03a2\u03a3\u0005\\\u0000\u0000\u03a3\u03a5\u0003\u00a6S\u0000"+
		"\u03a4\u03a2\u0001\u0000\u0000\u0000\u03a5\u03a8\u0001\u0000\u0000\u0000"+
		"\u03a6\u03a4\u0001\u0000\u0000\u0000\u03a6\u03a7\u0001\u0000\u0000\u0000"+
		"\u03a7\u03aa\u0001\u0000\u0000\u0000\u03a8\u03a6\u0001\u0000\u0000\u0000"+
		"\u03a9\u03a1\u0001\u0000\u0000\u0000\u03a9\u03aa\u0001\u0000\u0000\u0000"+
		"\u03aa\u03ab\u0001\u0000\u0000\u0000\u03ab\u03ac\u0005Z\u0000\u0000\u03ac"+
		"\u03b1\u0005S\u0000\u0000\u03ad\u03b0\u0003\u00b6[\u0000\u03ae\u03b0\u0003"+
		"\u0084B\u0000\u03af\u03ad\u0001\u0000\u0000\u0000\u03af\u03ae\u0001\u0000"+
		"\u0000\u0000\u03b0\u03b3\u0001\u0000\u0000\u0000\u03b1\u03af\u0001\u0000"+
		"\u0000\u0000\u03b1\u03b2\u0001\u0000\u0000\u0000\u03b2\u03b4\u0001\u0000"+
		"\u0000\u0000\u03b3\u03b1\u0001\u0000\u0000\u0000\u03b4\u03b5\u0005T\u0000"+
		"\u0000\u03b5\u0083\u0001\u0000\u0000\u0000\u03b6\u03b7\u0005+\u0000\u0000"+
		"\u03b7\u03b8\u0005x\u0000\u0000\u03b8\u03b9\u0005m\u0000\u0000\u03b9\u03bc"+
		"\u0005_\u0000\u0000\u03ba\u03bd\u0003\u0086C\u0000\u03bb\u03bd\u0003\u00b8"+
		"\\\u0000\u03bc\u03ba\u0001\u0000\u0000\u0000\u03bc\u03bb\u0001\u0000\u0000"+
		"\u0000\u03bd\u03be\u0001\u0000\u0000\u0000\u03be\u03bf\u0005]\u0000\u0000"+
		"\u03bf\u0085\u0001\u0000\u0000\u0000\u03c0\u03c1\u0003d2\u0000\u03c1\u03c3"+
		"\u0005Y\u0000\u0000\u03c2\u03c4\u0003\u00dam\u0000\u03c3\u03c2\u0001\u0000"+
		"\u0000\u0000\u03c3\u03c4\u0001\u0000\u0000\u0000\u03c4\u03c5\u0001\u0000"+
		"\u0000\u0000\u03c5\u03c6\u0005Z\u0000\u0000\u03c6\u0087\u0001\u0000\u0000"+
		"\u0000\u03c7\u03c8\u0003d2\u0000\u03c8\u03ca\u0005Y\u0000\u0000\u03c9"+
		"\u03cb\u0003\u00dam\u0000\u03ca\u03c9\u0001\u0000\u0000\u0000\u03ca\u03cb"+
		"\u0001\u0000\u0000\u0000\u03cb\u03cc\u0001\u0000\u0000\u0000\u03cc\u03cd"+
		"\u0005Z\u0000\u0000\u03cd\u0089\u0001\u0000\u0000\u0000\u03ce\u03cf\u0005"+
		":\u0000\u0000\u03cf\u03d0\u0005Y\u0000\u0000\u03d0\u03d1\u0003f3\u0000"+
		"\u03d1\u03d4\u0005Z\u0000\u0000\u03d2\u03d3\u0005[\u0000\u0000\u03d3\u03d5"+
		"\u0003\u008cF\u0000\u03d4\u03d2\u0001\u0000\u0000\u0000\u03d4\u03d5\u0001"+
		"\u0000\u0000\u0000\u03d5\u03d6\u0001\u0000\u0000\u0000\u03d6\u03d7\u0005"+
		"S\u0000\u0000\u03d7\u03d8\u0005K\u0000\u0000\u03d8\u03d9\u0003\u00b8\\"+
		"\u0000\u03d9\u03da\u0005]\u0000\u0000\u03da\u03db\u0005T\u0000\u0000\u03db"+
		"\u008b\u0001\u0000\u0000\u0000\u03dc\u03df\u0003r9\u0000\u03dd\u03df\u0005"+
		"J\u0000\u0000\u03de\u03dc\u0001\u0000\u0000\u0000\u03de\u03dd\u0001\u0000"+
		"\u0000\u0000\u03df\u008d\u0001\u0000\u0000\u0000\u03e0\u03e1\u0005\u0019"+
		"\u0000\u0000\u03e1\u03e2\u0005Y\u0000\u0000\u03e2\u03e3\u0003f3\u0000"+
		"\u03e3\u03e4\u0005Z\u0000\u0000\u03e4\u03e5\u0005S\u0000\u0000\u03e5\u03e6"+
		"\u0003\u00d6k\u0000\u03e6\u03e7\u0005]\u0000\u0000\u03e7\u03e8\u0005T"+
		"\u0000\u0000\u03e8\u008f\u0001\u0000\u0000\u0000\u03e9\u03ea\u0005\u0007"+
		"\u0000\u0000\u03ea\u03eb\u0005Y\u0000\u0000\u03eb\u03ec\u0005\u0013\u0000"+
		"\u0000\u03ec\u03ed\u0005m\u0000\u0000\u03ed\u03ee\u0005_\u0000\u0000\u03ee"+
		"\u03ef\u0003\u00b8\\\u0000\u03ef\u03f0\u0005]\u0000\u0000\u03f0\u03f1"+
		"\u0003\u00b8\\\u0000\u03f1\u03f2\u0005]\u0000\u0000\u03f2\u03f3\u0005"+
		"m\u0000\u0000\u03f3\u03f4\u0007\u0001\u0000\u0000\u03f4\u03f5\u0005Z\u0000"+
		"\u0000\u03f5\u03f9\u0005S\u0000\u0000\u03f6\u03f8\u0003\u00b6[\u0000\u03f7"+
		"\u03f6\u0001\u0000\u0000\u0000\u03f8\u03fb\u0001\u0000\u0000\u0000\u03f9"+
		"\u03f7\u0001\u0000\u0000\u0000\u03f9\u03fa\u0001\u0000\u0000\u0000\u03fa"+
		"\u03fc\u0001\u0000\u0000\u0000\u03fb\u03f9\u0001\u0000\u0000\u0000\u03fc"+
		"\u0406\u0005T\u0000\u0000\u03fd\u03fe\u0005\u0018\u0000\u0000\u03fe\u0402"+
		"\u0005S\u0000\u0000\u03ff\u0401\u0003\u00b6[\u0000\u0400\u03ff\u0001\u0000"+
		"\u0000\u0000\u0401\u0404\u0001\u0000\u0000\u0000\u0402\u0400\u0001\u0000"+
		"\u0000\u0000\u0402\u0403\u0001\u0000\u0000\u0000\u0403\u0405\u0001\u0000"+
		"\u0000\u0000\u0404\u0402\u0001\u0000\u0000\u0000\u0405\u0407\u0005T\u0000"+
		"\u0000\u0406\u03fd\u0001\u0000\u0000\u0000\u0406\u0407\u0001\u0000\u0000"+
		"\u0000\u0407\u041f\u0001\u0000\u0000\u0000\u0408\u0409\u0005\u0007\u0000"+
		"\u0000\u0409\u040a\u0005Y\u0000\u0000\u040a\u040b\u0005\u0013\u0000\u0000"+
		"\u040b\u040c\u0005m\u0000\u0000\u040c\u040d\u0005\u0016\u0000\u0000\u040d"+
		"\u0412\u0005m\u0000\u0000\u040e\u040f\u0005x\u0000\u0000\u040f\u0411\u0005"+
		"m\u0000\u0000\u0410\u040e\u0001\u0000\u0000\u0000\u0411\u0414\u0001\u0000"+
		"\u0000\u0000\u0412\u0410\u0001\u0000\u0000\u0000\u0412\u0413\u0001\u0000"+
		"\u0000\u0000\u0413\u0415\u0001\u0000\u0000\u0000\u0414\u0412\u0001\u0000"+
		"\u0000\u0000\u0415\u0416\u0005Z\u0000\u0000\u0416\u041a\u0005S\u0000\u0000"+
		"\u0417\u0419\u0003\u00b6[\u0000\u0418\u0417\u0001\u0000\u0000\u0000\u0419"+
		"\u041c\u0001\u0000\u0000\u0000\u041a\u0418\u0001\u0000\u0000\u0000\u041a"+
		"\u041b\u0001\u0000\u0000\u0000\u041b\u041d\u0001\u0000\u0000\u0000\u041c"+
		"\u041a\u0001\u0000\u0000\u0000\u041d\u041f\u0005T\u0000\u0000\u041e\u03e9"+
		"\u0001\u0000\u0000\u0000\u041e\u0408\u0001\u0000\u0000\u0000\u041f\u0091"+
		"\u0001\u0000\u0000\u0000\u0420\u0421\u0005\u000e\u0000\u0000\u0421\u0422"+
		"\u0005Y\u0000\u0000\u0422\u0423\u0003\u00b8\\\u0000\u0423\u0424\u0005"+
		"Z\u0000\u0000\u0424\u0428\u0005S\u0000\u0000\u0425\u0427\u0003\u00b6["+
		"\u0000\u0426\u0425\u0001\u0000\u0000\u0000\u0427\u042a\u0001\u0000\u0000"+
		"\u0000\u0428\u0426\u0001\u0000\u0000\u0000\u0428\u0429\u0001\u0000\u0000"+
		"\u0000\u0429\u042b\u0001\u0000\u0000\u0000\u042a\u0428\u0001\u0000\u0000"+
		"\u0000\u042b\u042c\u0005T\u0000\u0000\u042c\u0093\u0001\u0000\u0000\u0000"+
		"\u042d\u042e\u0005\u000f\u0000\u0000\u042e\u042f\u0005Y\u0000\u0000\u042f"+
		"\u0430\u0003\u00b8\\\u0000\u0430\u0431\u0005Z\u0000\u0000\u0431\u0435"+
		"\u0005S\u0000\u0000\u0432\u0434\u0003\u009cN\u0000\u0433\u0432\u0001\u0000"+
		"\u0000\u0000\u0434\u0437\u0001\u0000\u0000\u0000\u0435\u0433\u0001\u0000"+
		"\u0000\u0000\u0435\u0436\u0001\u0000\u0000\u0000\u0436\u0438\u0001\u0000"+
		"\u0000\u0000\u0437\u0435\u0001\u0000\u0000\u0000\u0438\u0439\u0005T\u0000"+
		"\u0000\u0439\u0095\u0001\u0000\u0000\u0000\u043a\u043b\u0005\u0017\u0000"+
		"\u0000\u043b\u043c\u0005Y\u0000\u0000\u043c\u043d\u0003\u0098L\u0000\u043d"+
		"\u043e\u0005Z\u0000\u0000\u043e\u0442\u0005S\u0000\u0000\u043f\u0441\u0003"+
		"\u00b6[\u0000\u0440\u043f\u0001\u0000\u0000\u0000\u0441\u0444\u0001\u0000"+
		"\u0000\u0000\u0442\u0440\u0001\u0000\u0000\u0000\u0442\u0443\u0001\u0000"+
		"\u0000\u0000\u0443\u0445\u0001\u0000\u0000\u0000\u0444\u0442\u0001\u0000"+
		"\u0000\u0000\u0445\u044f\u0005T\u0000\u0000\u0446\u0447\u0005\u0018\u0000"+
		"\u0000\u0447\u044b\u0005S\u0000\u0000\u0448\u044a\u0003\u00b6[\u0000\u0449"+
		"\u0448\u0001\u0000\u0000\u0000\u044a\u044d\u0001\u0000\u0000\u0000\u044b"+
		"\u0449\u0001\u0000\u0000\u0000\u044b\u044c\u0001\u0000\u0000\u0000\u044c"+
		"\u044e\u0001\u0000\u0000\u0000\u044d\u044b\u0001\u0000\u0000\u0000\u044e"+
		"\u0450\u0005T\u0000\u0000\u044f\u0446\u0001\u0000\u0000\u0000\u044f\u0450"+
		"\u0001\u0000\u0000\u0000\u0450\u0097\u0001\u0000\u0000\u0000\u0451\u0454"+
		"\u0003\u00c8d\u0000\u0452\u0454\u0003\u009aM\u0000\u0453\u0451\u0001\u0000"+
		"\u0000\u0000\u0453\u0452\u0001\u0000\u0000\u0000\u0454\u0099\u0001\u0000"+
		"\u0000\u0000\u0455\u0456\u0003\u00b8\\\u0000\u0456\u0457\u0005_\u0000"+
		"\u0000\u0457\u0458\u0005_\u0000\u0000\u0458\u0459\u0005_\u0000\u0000\u0459"+
		"\u045a\u0003\u00b8\\\u0000\u045a\u0469\u0001\u0000\u0000\u0000\u045b\u045c"+
		"\u0003\u00b8\\\u0000\u045c\u045d\u0005_\u0000\u0000\u045d\u045e\u0005"+
		"_\u0000\u0000\u045e\u045f\u0003\u00b8\\\u0000\u045f\u0469\u0001\u0000"+
		"\u0000\u0000\u0460\u0461\u0003\u00b8\\\u0000\u0461\u0462\u0005c\u0000"+
		"\u0000\u0462\u0463\u0003\u00b8\\\u0000\u0463\u0469\u0001\u0000\u0000\u0000"+
		"\u0464\u0465\u0003\u00b8\\\u0000\u0465\u0466\u0005d\u0000\u0000\u0466"+
		"\u0467\u0003\u00b8\\\u0000\u0467\u0469\u0001\u0000\u0000\u0000\u0468\u0455"+
		"\u0001\u0000\u0000\u0000\u0468\u045b\u0001\u0000\u0000\u0000\u0468\u0460"+
		"\u0001\u0000\u0000\u0000\u0468\u0464\u0001\u0000\u0000\u0000\u0469\u009b"+
		"\u0001\u0000\u0000\u0000\u046a\u046b\u0005\u0010\u0000\u0000\u046b\u046c"+
		"\u0003\u00b8\\\u0000\u046c\u0470\u0005[\u0000\u0000\u046d\u046f\u0003"+
		"\u00b6[\u0000\u046e\u046d\u0001\u0000\u0000\u0000\u046f\u0472\u0001\u0000"+
		"\u0000\u0000\u0470\u046e\u0001\u0000\u0000\u0000\u0470\u0471\u0001\u0000"+
		"\u0000\u0000\u0471\u047c\u0001\u0000\u0000\u0000\u0472\u0470\u0001\u0000"+
		"\u0000\u0000\u0473\u0474\u0005\u0011\u0000\u0000\u0474\u0478\u0005[\u0000"+
		"\u0000\u0475\u0477\u0003\u00b6[\u0000\u0476\u0475\u0001\u0000\u0000\u0000"+
		"\u0477\u047a\u0001\u0000\u0000\u0000\u0478\u0476\u0001\u0000\u0000\u0000"+
		"\u0478\u0479\u0001\u0000\u0000\u0000\u0479\u047c\u0001\u0000\u0000\u0000"+
		"\u047a\u0478\u0001\u0000\u0000\u0000\u047b\u046a\u0001\u0000\u0000\u0000"+
		"\u047b\u0473\u0001\u0000\u0000\u0000\u047c\u009d\u0001\u0000\u0000\u0000"+
		"\u047d\u047e\u0005\u000b\u0000\u0000\u047e\u047f\u0005m\u0000\u0000\u047f"+
		"\u0481\u0005Y\u0000\u0000\u0480\u0482\u0003\u00e8t\u0000\u0481\u0480\u0001"+
		"\u0000\u0000\u0000\u0481\u0482\u0001\u0000\u0000\u0000\u0482\u0483\u0001"+
		"\u0000\u0000\u0000\u0483\u0484\u0005Z\u0000\u0000\u0484\u0485\u0005[\u0000"+
		"\u0000\u0485\u0486\u0003>\u001f\u0000\u0486\u0487\u0003\u00a0P\u0000\u0487"+
		"\u009f\u0001\u0000\u0000\u0000\u0488\u048c\u0005S\u0000\u0000\u0489\u048b"+
		"\u0003\u00b6[\u0000\u048a\u0489\u0001\u0000\u0000\u0000\u048b\u048e\u0001"+
		"\u0000\u0000\u0000\u048c\u048a\u0001\u0000\u0000\u0000\u048c\u048d\u0001"+
		"\u0000\u0000\u0000\u048d\u048f\u0001\u0000\u0000\u0000\u048e\u048c\u0001"+
		"\u0000\u0000\u0000\u048f\u0490\u0005T\u0000\u0000\u0490\u00a1\u0001\u0000"+
		"\u0000\u0000\u0491\u0492\u0005\f\u0000\u0000\u0492\u0493\u0005x\u0000"+
		"\u0000\u0493\u0494\u0005\r\u0000\u0000\u0494\u0495\u0005Y\u0000\u0000"+
		"\u0495\u0496\u0003\u00f4z\u0000\u0496\u0497\u0005Z\u0000\u0000\u0497\u0498"+
		"\u0005]\u0000\u0000\u0498\u00a3\u0001\u0000\u0000\u0000\u0499\u049a\u0005"+
		"m\u0000\u0000\u049a\u049b\u0005Y\u0000\u0000\u049b\u04a0\u0003\u00a6S"+
		"\u0000\u049c\u049d\u0005\\\u0000\u0000\u049d\u049f\u0003\u00a6S\u0000"+
		"\u049e\u049c\u0001\u0000\u0000\u0000\u049f\u04a2\u0001\u0000\u0000\u0000"+
		"\u04a0\u049e\u0001\u0000\u0000\u0000\u04a0\u04a1\u0001\u0000\u0000\u0000"+
		"\u04a1\u04a3\u0001\u0000\u0000\u0000\u04a2\u04a0\u0001\u0000\u0000\u0000"+
		"\u04a3\u04a4\u0005Z\u0000\u0000\u04a4\u04a5\u0005[\u0000\u0000\u04a5\u04a6"+
		"\u0003>\u001f\u0000\u04a6\u04aa\u0005S\u0000\u0000\u04a7\u04a9\u0003\u00b6"+
		"[\u0000\u04a8\u04a7\u0001\u0000\u0000\u0000\u04a9\u04ac\u0001\u0000\u0000"+
		"\u0000\u04aa\u04a8\u0001\u0000\u0000\u0000\u04aa\u04ab\u0001\u0000\u0000"+
		"\u0000\u04ab\u04ad\u0001\u0000\u0000\u0000\u04ac\u04aa\u0001\u0000\u0000"+
		"\u0000\u04ad\u04ae\u0005T\u0000\u0000\u04ae\u00a5\u0001\u0000\u0000\u0000"+
		"\u04af\u04b1\u0003\u00a8T\u0000\u04b0\u04af\u0001\u0000\u0000\u0000\u04b0"+
		"\u04b1\u0001\u0000\u0000\u0000\u04b1\u04b2\u0001\u0000\u0000\u0000\u04b2"+
		"\u04b3\u0005m\u0000\u0000\u04b3\u04b4\u0005[\u0000\u0000\u04b4\u04b5\u0003"+
		">\u001f\u0000\u04b5\u00a7\u0001\u0000\u0000\u0000\u04b6\u04ba\u0005-\u0000"+
		"\u0000\u04b7\u04ba\u0005.\u0000\u0000\u04b8\u04ba\u0005A\u0000\u0000\u04b9"+
		"\u04b6\u0001\u0000\u0000\u0000\u04b9\u04b7\u0001\u0000\u0000\u0000\u04b9"+
		"\u04b8\u0001\u0000\u0000\u0000\u04ba\u00a9\u0001\u0000\u0000\u0000\u04bb"+
		"\u04bc\u00051\u0000\u0000\u04bc\u04bd\u0005Y\u0000\u0000\u04bd\u04be\u0005"+
		"Z\u0000\u0000\u04be\u04bf\u0003\u00a0P\u0000\u04bf\u00ab\u0001\u0000\u0000"+
		"\u0000\u04c0\u04c1\u0005m\u0000\u0000\u04c1\u04c2\u0005[\u0000\u0000\u04c2"+
		"\u04c3\u0005/\u0000\u0000\u04c3\u04c4\u0005_\u0000\u0000\u04c4\u04c5\u0005"+
		"N\u0000\u0000\u04c5\u04c6\u0005/\u0000\u0000\u04c6\u04c7\u0005Y\u0000"+
		"\u0000\u04c7\u04c8\u00038\u001c\u0000\u04c8\u04c9\u0005Z\u0000\u0000\u04c9"+
		"\u04ca\u0005]\u0000\u0000\u04ca\u00ad\u0001\u0000\u0000\u0000\u04cb\u04cc"+
		"\u0005m\u0000\u0000\u04cc\u04cd\u0005_\u0000\u0000\u04cd\u04ce\u0005N"+
		"\u0000\u0000\u04ce\u04cf\u0005/\u0000\u0000\u04cf\u04d0\u0005Y\u0000\u0000"+
		"\u04d0\u04d1\u0005S\u0000\u0000\u04d1\u04d2\u0003\u00b0X\u0000\u04d2\u04d3"+
		"\u0005T\u0000\u0000\u04d3\u04d4\u0005Z\u0000\u0000\u04d4\u04d5\u0005]"+
		"\u0000\u0000\u04d5\u00af\u0001\u0000\u0000\u0000\u04d6\u04db\u0003\u00b2"+
		"Y\u0000\u04d7\u04d8\u0005\\\u0000\u0000\u04d8\u04da\u0003\u00b2Y\u0000"+
		"\u04d9\u04d7\u0001\u0000\u0000\u0000\u04da\u04dd\u0001\u0000\u0000\u0000"+
		"\u04db\u04d9\u0001\u0000\u0000\u0000\u04db\u04dc\u0001\u0000\u0000\u0000"+
		"\u04dc\u00b1\u0001\u0000\u0000\u0000\u04dd\u04db\u0001\u0000\u0000\u0000"+
		"\u04de\u04df\u0005m\u0000\u0000\u04df\u04e0\u0005[\u0000\u0000\u04e0\u04e1"+
		"\u0003\u00b4Z\u0000\u04e1\u00b3\u0001\u0000\u0000\u0000\u04e2\u04e3\u0005"+
		"N\u0000\u0000\u04e3\u04e4\u00050\u0000\u0000\u04e4\u04e5\u0005Y\u0000"+
		"\u0000\u04e5\u04e6\u0003\u0106\u0083\u0000\u04e6\u04e7\u0005Z\u0000\u0000"+
		"\u04e7\u00b5\u0001\u0000\u0000\u0000\u04e8\u04e9\u0005m\u0000\u0000\u04e9"+
		"\u04ea\u0005[\u0000\u0000\u04ea\u0504\u0003\u00b6[\u0000\u04eb\u04ec\u0003"+
		"\u00b8\\\u0000\u04ec\u04ed\u0005]\u0000\u0000\u04ed\u0504\u0001\u0000"+
		"\u0000\u0000\u04ee\u0504\u0003\u0096K\u0000\u04ef\u0504\u0003\u0090H\u0000"+
		"\u04f0\u0504\u0003\u0094J\u0000\u04f1\u0504\u0003\u00a4R\u0000\u04f2\u0504"+
		"\u0003h4\u0000\u04f3\u04f4\u0003\u00d6k\u0000\u04f4\u04f5\u0005]\u0000"+
		"\u0000\u04f5\u0504\u0001\u0000\u0000\u0000\u04f6\u04f7\u0005m\u0000\u0000"+
		"\u04f7\u04f8\u0005_\u0000\u0000\u04f8\u04f9\u0003\u00b8\\\u0000\u04f9"+
		"\u04fa\u0005]\u0000\u0000\u04fa\u0504\u0001\u0000\u0000\u0000\u04fb\u0504"+
		"\u0003\u0112\u0089\u0000\u04fc\u0504\u0003\u00c8d\u0000\u04fd\u0504\u0003"+
		"\u00a2Q\u0000\u04fe\u0504\u0003|>\u0000\u04ff\u0504\u0003\u00fe\u007f"+
		"\u0000\u0500\u0504\u0003P(\u0000\u0501\u0504\u0003R)\u0000\u0502\u0504"+
		"\u0003X,\u0000\u0503\u04e8\u0001\u0000\u0000\u0000\u0503\u04eb\u0001\u0000"+
		"\u0000\u0000\u0503\u04ee\u0001\u0000\u0000\u0000\u0503\u04ef\u0001\u0000"+
		"\u0000\u0000\u0503\u04f0\u0001\u0000\u0000\u0000\u0503\u04f1\u0001\u0000"+
		"\u0000\u0000\u0503\u04f2\u0001\u0000\u0000\u0000\u0503\u04f3\u0001\u0000"+
		"\u0000\u0000\u0503\u04f6\u0001\u0000\u0000\u0000\u0503\u04fb\u0001\u0000"+
		"\u0000\u0000\u0503\u04fc\u0001\u0000\u0000\u0000\u0503\u04fd\u0001\u0000"+
		"\u0000\u0000\u0503\u04fe\u0001\u0000\u0000\u0000\u0503\u04ff\u0001\u0000"+
		"\u0000\u0000\u0503\u0500\u0001\u0000\u0000\u0000\u0503\u0501\u0001\u0000"+
		"\u0000\u0000\u0503\u0502\u0001\u0000\u0000\u0000\u0504\u00b7\u0001\u0000"+
		"\u0000\u0000\u0505\u0506\u0006\\\uffff\uffff\u0000\u0506\u051c\u0003\u010c"+
		"\u0086\u0000\u0507\u0508\u0003\u00c6c\u0000\u0508\u0509\u0003\u00b8\\"+
		"\u0010\u0509\u051c\u0001\u0000\u0000\u0000\u050a\u051c\u0003\u00d6k\u0000"+
		"\u050b\u051c\u0003\u00c8d\u0000\u050c\u051c\u0003d2\u0000\u050d\u051c"+
		"\u0003\u00be_\u0000\u050e\u051c\u0003\u00dcn\u0000\u050f\u051c\u0003\u00c2"+
		"a\u0000\u0510\u0511\u0005Y\u0000\u0000\u0511\u0512\u0003\u00b8\\\u0000"+
		"\u0512\u0513\u0005Z\u0000\u0000\u0513\u051c\u0001\u0000\u0000\u0000\u0514"+
		"\u051c\u0005m\u0000\u0000\u0515\u051c\u0005g\u0000\u0000\u0516\u051c\u0005"+
		"j\u0000\u0000\u0517\u051c\u0005k\u0000\u0000\u0518\u051c\u0003T*\u0000"+
		"\u0519\u051c\u0003\u00ba]\u0000\u051a\u051c\u0003\u00bc^\u0000\u051b\u0505"+
		"\u0001\u0000\u0000\u0000\u051b\u0507\u0001\u0000\u0000\u0000\u051b\u050a"+
		"\u0001\u0000\u0000\u0000\u051b\u050b\u0001\u0000\u0000\u0000\u051b\u050c"+
		"\u0001\u0000\u0000\u0000\u051b\u050d\u0001\u0000\u0000\u0000\u051b\u050e"+
		"\u0001\u0000\u0000\u0000\u051b\u050f\u0001\u0000\u0000\u0000\u051b\u0510"+
		"\u0001\u0000\u0000\u0000\u051b\u0514\u0001\u0000\u0000\u0000\u051b\u0515"+
		"\u0001\u0000\u0000\u0000\u051b\u0516\u0001\u0000\u0000\u0000\u051b\u0517"+
		"\u0001\u0000\u0000\u0000\u051b\u0518\u0001\u0000\u0000\u0000\u051b\u0519"+
		"\u0001\u0000\u0000\u0000\u051b\u051a\u0001\u0000\u0000\u0000\u051c\u0552"+
		"\u0001\u0000\u0000\u0000\u051d\u051e\n\u001f\u0000\u0000\u051e\u051f\u0005"+
		"v\u0000\u0000\u051f\u0551\u0003\u00b8\\ \u0520\u0521\n\u001e\u0000\u0000"+
		"\u0521\u0522\u0005w\u0000\u0000\u0522\u0551\u0003\u00b8\\\u001f\u0523"+
		"\u0524\n\u001d\u0000\u0000\u0524\u0525\u0005s\u0000\u0000\u0525\u0551"+
		"\u0003\u00b8\\\u001e\u0526\u0527\n\u001c\u0000\u0000\u0527\u0528\u0005"+
		"t\u0000\u0000\u0528\u0551\u0003\u00b8\\\u001d\u0529\u052a\n\u001b\u0000"+
		"\u0000\u052a\u052b\u0005u\u0000\u0000\u052b\u0551\u0003\u00b8\\\u001c"+
		"\u052c\u052d\n\u001a\u0000\u0000\u052d\u052e\u0005q\u0000\u0000\u052e"+
		"\u0551\u0003\u00b8\\\u001b\u052f\u0530\n\u0019\u0000\u0000\u0530\u0531"+
		"\u0005r\u0000\u0000\u0531\u0551\u0003\u00b8\\\u001a\u0532\u0533\n\u0018"+
		"\u0000\u0000\u0533\u0534\u0005_\u0000\u0000\u0534\u0551\u0003\u00b8\\"+
		"\u0019\u0535\u0536\n\u0017\u0000\u0000\u0536\u0537\u0005_\u0000\u0000"+
		"\u0537\u0538\u0005_\u0000\u0000\u0538\u0551\u0003\u00b8\\\u0018\u0539"+
		"\u053a\n\u0016\u0000\u0000\u053a\u053b\u0005_\u0000\u0000\u053b\u053c"+
		"\u0005_\u0000\u0000\u053c\u053d\u0005_\u0000\u0000\u053d\u0551\u0003\u00b8"+
		"\\\u0017\u053e\u053f\n\u0015\u0000\u0000\u053f\u0540\u0005c\u0000\u0000"+
		"\u0540\u0551\u0003\u00b8\\\u0016\u0541\u0542\n\u0014\u0000\u0000\u0542"+
		"\u0543\u0005d\u0000\u0000\u0543\u0551\u0003\u00b8\\\u0015\u0544\u0545"+
		"\n\u0011\u0000\u0000\u0545\u0546\u0003\u00c4b\u0000\u0546\u0547\u0003"+
		"\u00b8\\\u0012\u0547\u0551\u0001\u0000\u0000\u0000\u0548\u0549\n\u0013"+
		"\u0000\u0000\u0549\u0551\u0005h\u0000\u0000\u054a\u054b\n\u0012\u0000"+
		"\u0000\u054b\u0551\u0005i\u0000\u0000\u054c\u054d\n\u000f\u0000\u0000"+
		"\u054d\u054e\u0005^\u0000\u0000\u054e\u054f\u0005[\u0000\u0000\u054f\u0551"+
		"\u0005/\u0000\u0000\u0550\u051d\u0001\u0000\u0000\u0000\u0550\u0520\u0001"+
		"\u0000\u0000\u0000\u0550\u0523\u0001\u0000\u0000\u0000\u0550\u0526\u0001"+
		"\u0000\u0000\u0000\u0550\u0529\u0001\u0000\u0000\u0000\u0550\u052c\u0001"+
		"\u0000\u0000\u0000\u0550\u052f\u0001\u0000\u0000\u0000\u0550\u0532\u0001"+
		"\u0000\u0000\u0000\u0550\u0535\u0001\u0000\u0000\u0000\u0550\u0539\u0001"+
		"\u0000\u0000\u0000\u0550\u053e\u0001\u0000\u0000\u0000\u0550\u0541\u0001"+
		"\u0000\u0000\u0000\u0550\u0544\u0001\u0000\u0000\u0000\u0550\u0548\u0001"+
		"\u0000\u0000\u0000\u0550\u054a\u0001\u0000\u0000\u0000\u0550\u054c\u0001"+
		"\u0000\u0000\u0000\u0551\u0554\u0001\u0000\u0000\u0000\u0552\u0550\u0001"+
		"\u0000\u0000\u0000\u0552\u0553\u0001\u0000\u0000\u0000\u0553\u00b9\u0001"+
		"\u0000\u0000\u0000\u0554\u0552\u0001\u0000\u0000\u0000\u0555\u0558\u0003"+
		"d2\u0000\u0556\u0558\u0003\u00bc^\u0000\u0557\u0555\u0001\u0000\u0000"+
		"\u0000\u0557\u0556\u0001\u0000\u0000\u0000\u0558\u0559\u0001\u0000\u0000"+
		"\u0000\u0559\u055b\u0005Y\u0000\u0000\u055a\u055c\u0003\u00dam\u0000\u055b"+
		"\u055a\u0001\u0000\u0000\u0000\u055b\u055c\u0001\u0000\u0000\u0000\u055c"+
		"\u055d\u0001\u0000\u0000\u0000\u055d\u055e\u0005Z\u0000\u0000\u055e\u00bb"+
		"\u0001\u0000\u0000\u0000\u055f\u0562\u0003d2\u0000\u0560\u0561\u0005\'"+
		"\u0000\u0000\u0561\u0563\u0005m\u0000\u0000\u0562\u0560\u0001\u0000\u0000"+
		"\u0000\u0563\u0564\u0001\u0000\u0000\u0000\u0564\u0562\u0001\u0000\u0000"+
		"\u0000\u0564\u0565\u0001\u0000\u0000\u0000\u0565\u00bd\u0001\u0000\u0000"+
		"\u0000\u0566\u0569\u0005S\u0000\u0000\u0567\u056a\u0003T*\u0000\u0568"+
		"\u056a\u0003\u00c0`\u0000\u0569\u0567\u0001\u0000\u0000\u0000\u0569\u0568"+
		"\u0001\u0000\u0000\u0000\u056a\u0572\u0001\u0000\u0000\u0000\u056b\u056e"+
		"\u0005\\\u0000\u0000\u056c\u056f\u0003T*\u0000\u056d\u056f\u0003\u00c0"+
		"`\u0000\u056e\u056c\u0001\u0000\u0000\u0000\u056e\u056d\u0001\u0000\u0000"+
		"\u0000\u056f\u0571\u0001\u0000\u0000\u0000\u0570\u056b\u0001\u0000\u0000"+
		"\u0000\u0571\u0574\u0001\u0000\u0000\u0000\u0572\u0570\u0001\u0000\u0000"+
		"\u0000\u0572\u0573\u0001\u0000\u0000\u0000\u0573\u0575\u0001\u0000\u0000"+
		"\u0000\u0574\u0572\u0001\u0000\u0000\u0000\u0575\u0576\u0005T\u0000\u0000"+
		"\u0576\u00bf\u0001\u0000\u0000\u0000\u0577\u0578\u0005m\u0000\u0000\u0578"+
		"\u0579\u0005[\u0000\u0000\u0579\u057a\u0003\u00b8\\\u0000\u057a\u00c1"+
		"\u0001\u0000\u0000\u0000\u057b\u0585\u0003\u00c8d\u0000\u057c\u0585\u0005"+
		"m\u0000\u0000\u057d\u0585\u0005+\u0000\u0000\u057e\u0585\u0005g\u0000"+
		"\u0000\u057f\u0585\u0005j\u0000\u0000\u0580\u0581\u0005Y\u0000\u0000\u0581"+
		"\u0582\u0003\u00b8\\\u0000\u0582\u0583\u0005Z\u0000\u0000\u0583\u0585"+
		"\u0001\u0000\u0000\u0000\u0584\u057b\u0001\u0000\u0000\u0000\u0584\u057c"+
		"\u0001\u0000\u0000\u0000\u0584\u057d\u0001\u0000\u0000\u0000\u0584\u057e"+
		"\u0001\u0000\u0000\u0000\u0584\u057f\u0001\u0000\u0000\u0000\u0584\u0580"+
		"\u0001\u0000\u0000\u0000\u0585\u00c3\u0001\u0000\u0000\u0000\u0586\u058f"+
		"\u0005v\u0000\u0000\u0587\u058f\u0005w\u0000\u0000\u0588\u058f\u0005s"+
		"\u0000\u0000\u0589\u058f\u0005t\u0000\u0000\u058a\u058f\u0005u\u0000\u0000"+
		"\u058b\u058f\u0005_\u0000\u0000\u058c\u058f\u0005q\u0000\u0000\u058d\u058f"+
		"\u0005r\u0000\u0000\u058e\u0586\u0001\u0000\u0000\u0000\u058e\u0587\u0001"+
		"\u0000\u0000\u0000\u058e\u0588\u0001\u0000\u0000\u0000\u058e\u0589\u0001"+
		"\u0000\u0000\u0000\u058e\u058a\u0001\u0000\u0000\u0000\u058e\u058b\u0001"+
		"\u0000\u0000\u0000\u058e\u058c\u0001\u0000\u0000\u0000\u058e\u058d\u0001"+
		"\u0000\u0000\u0000\u058f\u00c5\u0001\u0000\u0000\u0000\u0590\u0591\u0007"+
		"\u0001\u0000\u0000\u0591\u00c7\u0001\u0000\u0000\u0000\u0592\u0599\u0003"+
		"\u00d0h\u0000\u0593\u0599\u0003\u00d2i\u0000\u0594\u0599\u0003\u00d4j"+
		"\u0000\u0595\u0599\u0003\u00ceg\u0000\u0596\u0599\u0003\u00cae\u0000\u0597"+
		"\u0599\u0003\u00ccf\u0000\u0598\u0592\u0001\u0000\u0000\u0000\u0598\u0593"+
		"\u0001\u0000\u0000\u0000\u0598\u0594\u0001\u0000\u0000\u0000\u0598\u0595"+
		"\u0001\u0000\u0000\u0000\u0598\u0596\u0001\u0000\u0000\u0000\u0598\u0597"+
		"\u0001\u0000\u0000\u0000\u0599\u00c9\u0001\u0000\u0000\u0000\u059a\u059b"+
		"\u0005+\u0000\u0000\u059b\u059d\u0005x\u0000\u0000\u059c\u059a\u0001\u0000"+
		"\u0000\u0000\u059c\u059d\u0001\u0000\u0000\u0000\u059d\u059e\u0001\u0000"+
		"\u0000\u0000\u059e\u059f\u0005m\u0000\u0000\u059f\u05a0\u0005x\u0000\u0000"+
		"\u05a0\u05a1\u0005<\u0000\u0000\u05a1\u00cb\u0001\u0000\u0000\u0000\u05a2"+
		"\u05a3\u0005+\u0000\u0000\u05a3\u05a5\u0005x\u0000\u0000\u05a4\u05a2\u0001"+
		"\u0000\u0000\u0000\u05a4\u05a5\u0001\u0000\u0000\u0000\u05a5\u05a6\u0001"+
		"\u0000\u0000\u0000\u05a6\u05a7\u0005m\u0000\u0000\u05a7\u05a8\u0005x\u0000"+
		"\u0000\u05a8\u05a9\u00054\u0000\u0000\u05a9\u00cd\u0001\u0000\u0000\u0000"+
		"\u05aa\u05ab\u0005m\u0000\u0000\u05ab\u05ac\u0005x\u0000\u0000\u05ac\u05ad"+
		"\u0005?\u0000\u0000\u05ad\u05ae\u0005Y\u0000\u0000\u05ae\u05af\u0005Z"+
		"\u0000\u0000\u05af\u00cf\u0001\u0000\u0000\u0000\u05b0\u05b1\u0005+\u0000"+
		"\u0000\u05b1\u05b2\u0005x\u0000\u0000\u05b2\u05b7\u0005m\u0000\u0000\u05b3"+
		"\u05b4\u0005x\u0000\u0000\u05b4\u05b6\u0005m\u0000\u0000\u05b5\u05b3\u0001"+
		"\u0000\u0000\u0000\u05b6\u05b9\u0001\u0000\u0000\u0000\u05b7\u05b5\u0001"+
		"\u0000\u0000\u0000\u05b7\u05b8\u0001\u0000\u0000\u0000\u05b8\u00d1\u0001"+
		"\u0000\u0000\u0000\u05b9\u05b7\u0001\u0000\u0000\u0000\u05ba\u05bd\u0005"+
		"m\u0000\u0000\u05bb\u05bc\u0005x\u0000\u0000\u05bc\u05be\u0005m\u0000"+
		"\u0000\u05bd\u05bb\u0001\u0000\u0000\u0000\u05be\u05bf\u0001\u0000\u0000"+
		"\u0000\u05bf\u05bd\u0001\u0000\u0000\u0000\u05bf\u05c0\u0001\u0000\u0000"+
		"\u0000\u05c0\u00d3\u0001\u0000\u0000\u0000\u05c1\u05c2\u0005+\u0000\u0000"+
		"\u05c2\u05c3\u0005x\u0000\u0000\u05c3\u05c4\u0005m\u0000\u0000\u05c4\u05c5"+
		"\u0005x\u0000\u0000\u05c5\u05c6\u0005E\u0000\u0000\u05c6\u05c7\u0005Y"+
		"\u0000\u0000\u05c7\u05c8\u0005Z\u0000\u0000\u05c8\u00d5\u0001\u0000\u0000"+
		"\u0000\u05c9\u05ca\u0003\u00c8d\u0000\u05ca\u05cc\u0005Y\u0000\u0000\u05cb"+
		"\u05cd\u0003\u00dam\u0000\u05cc\u05cb\u0001\u0000\u0000\u0000\u05cc\u05cd"+
		"\u0001\u0000\u0000\u0000\u05cd\u05ce\u0001\u0000\u0000\u0000\u05ce\u05cf"+
		"\u0005Z\u0000\u0000\u05cf\u00d7\u0001\u0000\u0000\u0000\u05d0\u05d1\u0005"+
		")\u0000\u0000\u05d1\u05d2\u0005Y\u0000\u0000\u05d2\u05d7\u0003\u00a6S"+
		"\u0000\u05d3\u05d4\u0005\\\u0000\u0000\u05d4\u05d6\u0003\u00a6S\u0000"+
		"\u05d5\u05d3\u0001\u0000\u0000\u0000\u05d6\u05d9\u0001\u0000\u0000\u0000"+
		"\u05d7\u05d5\u0001\u0000\u0000\u0000\u05d7\u05d8\u0001\u0000\u0000\u0000"+
		"\u05d8\u05da\u0001\u0000\u0000\u0000\u05d9\u05d7\u0001\u0000\u0000\u0000"+
		"\u05da\u05dd\u0005Z\u0000\u0000\u05db\u05dc\u0005[\u0000\u0000\u05dc\u05de"+
		"\u0005J\u0000\u0000\u05dd\u05db\u0001\u0000\u0000\u0000\u05dd\u05de\u0001"+
		"\u0000\u0000\u0000\u05de\u05df\u0001\u0000\u0000\u0000\u05df\u05e3\u0005"+
		"S\u0000\u0000\u05e0\u05e2\u0003\u00b6[\u0000\u05e1\u05e0\u0001\u0000\u0000"+
		"\u0000\u05e2\u05e5\u0001\u0000\u0000\u0000\u05e3\u05e1\u0001\u0000\u0000"+
		"\u0000\u05e3\u05e4\u0001\u0000\u0000\u0000\u05e4\u05e6\u0001\u0000\u0000"+
		"\u0000\u05e5\u05e3\u0001\u0000\u0000\u0000\u05e6\u05e7\u0005T\u0000\u0000"+
		"\u05e7\u00d9\u0001\u0000\u0000\u0000\u05e8\u05eb\u0003T*\u0000\u05e9\u05eb"+
		"\u0003\u00b8\\\u0000\u05ea\u05e8\u0001\u0000\u0000\u0000\u05ea\u05e9\u0001"+
		"\u0000\u0000\u0000\u05eb\u05f3\u0001\u0000\u0000\u0000\u05ec\u05ef\u0005"+
		"\\\u0000\u0000\u05ed\u05f0\u0003T*\u0000\u05ee\u05f0\u0003\u00b8\\\u0000"+
		"\u05ef\u05ed\u0001\u0000\u0000\u0000\u05ef\u05ee\u0001\u0000\u0000\u0000"+
		"\u05f0\u05f2\u0001\u0000\u0000\u0000\u05f1\u05ec\u0001\u0000\u0000\u0000"+
		"\u05f2\u05f5\u0001\u0000\u0000\u0000\u05f3\u05f1\u0001\u0000\u0000\u0000"+
		"\u05f3\u05f4\u0001\u0000\u0000\u0000\u05f4\u00db\u0001\u0000\u0000\u0000"+
		"\u05f5\u05f3\u0001\u0000\u0000\u0000\u05f6\u05f9\u0005W\u0000\u0000\u05f7"+
		"\u05fa\u0003T*\u0000\u05f8\u05fa\u0003\u00b8\\\u0000\u05f9\u05f7\u0001"+
		"\u0000\u0000\u0000\u05f9\u05f8\u0001\u0000\u0000\u0000\u05fa\u0602\u0001"+
		"\u0000\u0000\u0000\u05fb\u05fe\u0005\\\u0000\u0000\u05fc\u05ff\u0003T"+
		"*\u0000\u05fd\u05ff\u0003\u00b8\\\u0000\u05fe\u05fc\u0001\u0000\u0000"+
		"\u0000\u05fe\u05fd\u0001\u0000\u0000\u0000\u05ff\u0601\u0001\u0000\u0000"+
		"\u0000\u0600\u05fb\u0001\u0000\u0000\u0000\u0601\u0604\u0001\u0000\u0000"+
		"\u0000\u0602\u0600\u0001\u0000\u0000\u0000\u0602\u0603\u0001\u0000\u0000"+
		"\u0000\u0603\u0605\u0001\u0000\u0000\u0000\u0604\u0602\u0001\u0000\u0000"+
		"\u0000\u0605\u0606\u0005X\u0000\u0000\u0606\u00dd\u0001\u0000\u0000\u0000"+
		"\u0607\u0609\u0005\u0005\u0000\u0000\u0608\u0607\u0001\u0000\u0000\u0000"+
		"\u0608\u0609\u0001\u0000\u0000\u0000\u0609\u060a\u0001\u0000\u0000\u0000"+
		"\u060a\u060b\u0005\u0012\u0000\u0000\u060b\u060c\u0005m\u0000\u0000\u060c"+
		"\u060d\u0005S\u0000\u0000\u060d\u060e\u0003\u00e0p\u0000\u060e\u060f\u0005"+
		"T\u0000\u0000\u060f\u00df\u0001\u0000\u0000\u0000\u0610\u0612\u0003\u00e2"+
		"q\u0000\u0611\u0610\u0001\u0000\u0000\u0000\u0612\u0615\u0001\u0000\u0000"+
		"\u0000\u0613\u0611\u0001\u0000\u0000\u0000\u0613\u0614\u0001\u0000\u0000"+
		"\u0000\u0614\u00e1\u0001\u0000\u0000\u0000\u0615\u0613\u0001\u0000\u0000"+
		"\u0000\u0616\u0619\u0003\u00e4r\u0000\u0617\u0619\u0003\u00e6s\u0000\u0618"+
		"\u0616\u0001\u0000\u0000\u0000\u0618\u0617\u0001\u0000\u0000\u0000\u0619"+
		"\u00e3\u0001\u0000\u0000\u0000\u061a\u061b\u0005m\u0000\u0000\u061b\u061c"+
		"\u0005[\u0000\u0000\u061c\u061d\u0003>\u001f\u0000\u061d\u061e\u0005]"+
		"\u0000\u0000\u061e\u00e5\u0001\u0000\u0000\u0000\u061f\u0620\u0005m\u0000"+
		"\u0000\u0620\u0622\u0005Y\u0000\u0000\u0621\u0623\u0003\u00e8t\u0000\u0622"+
		"\u0621\u0001\u0000\u0000\u0000\u0622\u0623\u0001\u0000\u0000\u0000\u0623"+
		"\u0624\u0001\u0000\u0000\u0000\u0624\u0625\u0005Z\u0000\u0000\u0625\u0626"+
		"\u0005[\u0000\u0000\u0626\u0627\u0003>\u001f\u0000\u0627\u0628\u0005]"+
		"\u0000\u0000\u0628\u00e7\u0001\u0000\u0000\u0000\u0629\u062e\u0003\u00ea"+
		"u\u0000\u062a\u062b\u0005\\\u0000\u0000\u062b\u062d\u0003\u00eau\u0000"+
		"\u062c\u062a\u0001\u0000\u0000\u0000\u062d\u0630\u0001\u0000\u0000\u0000"+
		"\u062e\u062c\u0001\u0000\u0000\u0000\u062e\u062f\u0001\u0000\u0000\u0000"+
		"\u062f\u00e9\u0001\u0000\u0000\u0000\u0630\u062e\u0001\u0000\u0000\u0000"+
		"\u0631\u0632\u0005m\u0000\u0000\u0632\u0633\u0005[\u0000\u0000\u0633\u0634"+
		"\u0003>\u001f\u0000\u0634\u00eb\u0001\u0000\u0000\u0000\u0635\u0636\u0005"+
		"F\u0000\u0000\u0636\u0637\u0005Y\u0000\u0000\u0637\u0638\u0005Z\u0000"+
		"\u0000\u0638\u0639\u0005S\u0000\u0000\u0639\u063a\u0003@ \u0000\u063a"+
		"\u063b\u0005Y\u0000\u0000\u063b\u063c\u0003\u00b8\\\u0000\u063c\u063d"+
		"\u0005Z\u0000\u0000\u063d\u063e\u0005]\u0000\u0000\u063e\u063f\u0005T"+
		"\u0000\u0000\u063f\u00ed\u0001\u0000\u0000\u0000\u0640\u0641\u0003@ \u0000"+
		"\u0641\u0642\u0005W\u0000\u0000\u0642\u0643\u0005X\u0000\u0000\u0643\u064a"+
		"\u0001\u0000\u0000\u0000\u0644\u0645\u0005,\u0000\u0000\u0645\u0646\u0005"+
		"q\u0000\u0000\u0646\u0647\u0003@ \u0000\u0647\u0648\u0005r\u0000\u0000"+
		"\u0648\u064a\u0001\u0000\u0000\u0000\u0649\u0640\u0001\u0000\u0000\u0000"+
		"\u0649\u0644\u0001\u0000\u0000\u0000\u064a\u00ef\u0001\u0000\u0000\u0000"+
		"\u064b\u064c\u0005M\u0000\u0000\u064c\u064d\u0005Y\u0000\u0000\u064d\u064e"+
		"\u0005Z\u0000\u0000\u064e\u064f\u0003\u00f2y\u0000\u064f\u0650\u0005]"+
		"\u0000\u0000\u0650\u00f1\u0001\u0000\u0000\u0000\u0651\u0652\u0005m\u0000"+
		"\u0000\u0652\u0653\u0005_\u0000\u0000\u0653\u0662\u0003\u00b8\\\u0000"+
		"\u0654\u0655\u0005m\u0000\u0000\u0655\u0656\u0005[\u0000\u0000\u0656\u0657"+
		"\u0003>\u001f\u0000\u0657\u0658\u0005_\u0000\u0000\u0658\u0659\u0003\u00b8"+
		"\\\u0000\u0659\u0662\u0001\u0000\u0000\u0000\u065a\u065b\u0005+\u0000"+
		"\u0000\u065b\u065c\u0005x\u0000\u0000\u065c\u065d\u0005m\u0000\u0000\u065d"+
		"\u065e\u0005_\u0000\u0000\u065e\u065f\u0003\u00b8\\\u0000\u065f\u0660"+
		"\u0005]\u0000\u0000\u0660\u0662\u0001\u0000\u0000\u0000\u0661\u0651\u0001"+
		"\u0000\u0000\u0000\u0661\u0654\u0001\u0000\u0000\u0000\u0661\u065a\u0001"+
		"\u0000\u0000\u0000\u0662\u00f3\u0001\u0000\u0000\u0000\u0663\u0668\u0003"+
		"\u00b8\\\u0000\u0664\u0665\u0005\\\u0000\u0000\u0665\u0667\u0003\u00b8"+
		"\\\u0000\u0666\u0664\u0001\u0000\u0000\u0000\u0667\u066a\u0001\u0000\u0000"+
		"\u0000\u0668\u0666\u0001\u0000\u0000\u0000\u0668\u0669\u0001\u0000\u0000"+
		"\u0000\u0669\u00f5\u0001\u0000\u0000\u0000\u066a\u0668\u0001\u0000\u0000"+
		"\u0000\u066b\u066c\u0005*\u0000\u0000\u066c\u066d\u0005Y\u0000\u0000\u066d"+
		"\u066e\u0005Z\u0000\u0000\u066e\u066f\u0005[\u0000\u0000\u066f\u0670\u0005"+
		"J\u0000\u0000\u0670\u0676\u0005S\u0000\u0000\u0671\u0675\u0003\u00b6["+
		"\u0000\u0672\u0675\u0003\u00f8|\u0000\u0673\u0675\u0003\u0086C\u0000\u0674"+
		"\u0671\u0001\u0000\u0000\u0000\u0674\u0672\u0001\u0000\u0000\u0000\u0674"+
		"\u0673\u0001\u0000\u0000\u0000\u0675\u0678\u0001\u0000\u0000\u0000\u0676"+
		"\u0674\u0001\u0000\u0000\u0000\u0676\u0677\u0001\u0000\u0000\u0000\u0677"+
		"\u0679\u0001\u0000\u0000\u0000\u0678\u0676\u0001\u0000\u0000\u0000\u0679"+
		"\u067a\u0005T\u0000\u0000\u067a\u00f7\u0001\u0000\u0000\u0000\u067b\u067c"+
		"\u0005\u0014\u0000\u0000\u067c\u067d\u0005m\u0000\u0000\u067d\u067f\u0005"+
		"_\u0000\u0000\u067e\u0680\u0003\u00fc~\u0000\u067f\u067e\u0001\u0000\u0000"+
		"\u0000\u067f\u0680\u0001\u0000\u0000\u0000\u0680\u0681\u0001\u0000\u0000"+
		"\u0000\u0681\u0682\u0005+\u0000\u0000\u0682\u0683\u0005x\u0000\u0000\u0683"+
		"\u0684\u0005m\u0000\u0000\u0684\u0685\u0005x\u0000\u0000\u0685\u0686\u0005"+
		"H\u0000\u0000\u0686\u0687\u0005x\u0000\u0000\u0687\u068b\u0005I\u0000"+
		"\u0000\u0688\u0689\u0005x\u0000\u0000\u0689\u068c\u0005m\u0000\u0000\u068a"+
		"\u068c\u0003\u00fa}\u0000\u068b\u0688\u0001\u0000\u0000\u0000\u068b\u068a"+
		"\u0001\u0000\u0000\u0000\u068c\u068d\u0001\u0000\u0000\u0000\u068d\u068e"+
		"\u0005]\u0000\u0000\u068e\u00f9\u0001\u0000\u0000\u0000\u068f\u0690\u0005"+
		"W\u0000\u0000\u0690\u0691\u0007\u0002\u0000\u0000\u0691\u0692\u0005X\u0000"+
		"\u0000\u0692\u00fb\u0001\u0000\u0000\u0000\u0693\u0694\u0005v\u0000\u0000"+
		"\u0694\u00fd\u0001\u0000\u0000\u0000\u0695\u0696\u0005+\u0000\u0000\u0696"+
		"\u0697\u0005x\u0000\u0000\u0697\u0698\u0005m\u0000\u0000\u0698\u0699\u0005"+
		"_\u0000\u0000\u0699\u069a\u0005N\u0000\u0000\u069a\u069b\u0005/\u0000"+
		"\u0000\u069b\u069c\u0005Y\u0000\u0000\u069c\u069d\u0003\u0100\u0080\u0000"+
		"\u069d\u069e\u0005Z\u0000\u0000\u069e\u00ff\u0001\u0000\u0000\u0000\u069f"+
		"\u06a0\u0005S\u0000\u0000\u06a0\u06a1\u0003\u0102\u0081\u0000\u06a1\u06a2"+
		"\u0005T\u0000\u0000\u06a2\u0101\u0001\u0000\u0000\u0000\u06a3\u06a8\u0003"+
		"\u0104\u0082\u0000\u06a4\u06a5\u0005\\\u0000\u0000\u06a5\u06a7\u0003\u0104"+
		"\u0082\u0000\u06a6\u06a4\u0001\u0000\u0000\u0000\u06a7\u06aa\u0001\u0000"+
		"\u0000\u0000\u06a8\u06a6\u0001\u0000\u0000\u0000\u06a8\u06a9\u0001\u0000"+
		"\u0000\u0000\u06a9\u0103\u0001\u0000\u0000\u0000\u06aa\u06a8\u0001\u0000"+
		"\u0000\u0000\u06ab\u06ac\u0005m\u0000\u0000\u06ac\u06ad\u0005[\u0000\u0000"+
		"\u06ad\u06ae\u0005N\u0000\u0000\u06ae\u06af\u00050\u0000\u0000\u06af\u06b0"+
		"\u0005Y\u0000\u0000\u06b0\u06b1\u0003\u0106\u0083\u0000\u06b1\u06b2\u0005"+
		"Z\u0000\u0000\u06b2\u0105\u0001\u0000\u0000\u0000\u06b3\u06b6\u0005g\u0000"+
		"\u0000\u06b4\u06b5\u0005\\\u0000\u0000\u06b5\u06b7\u0003\u0108\u0084\u0000"+
		"\u06b6\u06b4\u0001\u0000\u0000\u0000\u06b6\u06b7\u0001\u0000\u0000\u0000"+
		"\u06b7\u0107\u0001\u0000\u0000\u0000\u06b8\u06b9\u0005@\u0000\u0000\u06b9"+
		"\u06ba\u0005x\u0000\u0000\u06ba\u06c7\u0005m\u0000\u0000\u06bb\u06bc\u0005"+
		"W\u0000\u0000\u06bc\u06c1\u0003\u010a\u0085\u0000\u06bd\u06be\u0005\\"+
		"\u0000\u0000\u06be\u06c0\u0003\u010a\u0085\u0000\u06bf\u06bd\u0001\u0000"+
		"\u0000\u0000\u06c0\u06c3\u0001\u0000\u0000\u0000\u06c1\u06bf\u0001\u0000"+
		"\u0000\u0000\u06c1\u06c2\u0001\u0000\u0000\u0000\u06c2\u06c4\u0001\u0000"+
		"\u0000\u0000\u06c3\u06c1\u0001\u0000\u0000\u0000\u06c4\u06c5\u0005X\u0000"+
		"\u0000\u06c5\u06c7\u0001\u0000\u0000\u0000\u06c6\u06b8\u0001\u0000\u0000"+
		"\u0000\u06c6\u06bb\u0001\u0000\u0000\u0000\u06c7\u0109\u0001\u0000\u0000"+
		"\u0000\u06c8\u06c9\u0005@\u0000\u0000\u06c9\u06ca\u0005x\u0000\u0000\u06ca"+
		"\u06d2\u0005m\u0000\u0000\u06cb\u06cc\u0005@\u0000\u0000\u06cc\u06cd\u0005"+
		"x\u0000\u0000\u06cd\u06ce\u0005m\u0000\u0000\u06ce\u06cf\u0005Y\u0000"+
		"\u0000\u06cf\u06d0\u0005j\u0000\u0000\u06d0\u06d2\u0005Z\u0000\u0000\u06d1"+
		"\u06c8\u0001\u0000\u0000\u0000\u06d1\u06cb\u0001\u0000\u0000\u0000\u06d2"+
		"\u010b\u0001\u0000\u0000\u0000\u06d3\u06d4\u0003\u010e\u0087\u0000\u06d4"+
		"\u06d5\u0005\u001b\u0000\u0000\u06d5\u06d6\u0003\u00b8\\\u0000\u06d6\u06e3"+
		"\u0001\u0000\u0000\u0000\u06d7\u06d8\u0003\u010e\u0087\u0000\u06d8\u06d9"+
		"\u0005\u001b\u0000\u0000\u06d9\u06dd\u0005S\u0000\u0000\u06da\u06dc\u0003"+
		"\u00b6[\u0000\u06db\u06da\u0001\u0000\u0000\u0000\u06dc\u06df\u0001\u0000"+
		"\u0000\u0000\u06dd\u06db\u0001\u0000\u0000\u0000\u06dd\u06de\u0001\u0000"+
		"\u0000\u0000\u06de\u06e0\u0001\u0000\u0000\u0000\u06df\u06dd\u0001\u0000"+
		"\u0000\u0000\u06e0\u06e1\u0005T\u0000\u0000\u06e1\u06e3\u0001\u0000\u0000"+
		"\u0000\u06e2\u06d3\u0001\u0000\u0000\u0000\u06e2\u06d7\u0001\u0000\u0000"+
		"\u0000\u06e3\u010d\u0001\u0000\u0000\u0000\u06e4\u06eb\u0005m\u0000\u0000"+
		"\u06e5\u06e7\u0005Y\u0000\u0000\u06e6\u06e8\u0003\u00e8t\u0000\u06e7\u06e6"+
		"\u0001\u0000\u0000\u0000\u06e7\u06e8\u0001\u0000\u0000\u0000\u06e8\u06e9"+
		"\u0001\u0000\u0000\u0000\u06e9\u06eb\u0005Z\u0000\u0000\u06ea\u06e4\u0001"+
		"\u0000\u0000\u0000\u06ea\u06e5\u0001\u0000\u0000\u0000\u06eb\u010f\u0001"+
		"\u0000\u0000\u0000\u06ec\u06f6\u0003\u00b8\\\u0000\u06ed\u06f1\u0005S"+
		"\u0000\u0000\u06ee\u06f0\u0003\u00b6[\u0000\u06ef\u06ee\u0001\u0000\u0000"+
		"\u0000\u06f0\u06f3\u0001\u0000\u0000\u0000\u06f1\u06ef\u0001\u0000\u0000"+
		"\u0000\u06f1\u06f2\u0001\u0000\u0000\u0000\u06f2\u06f4\u0001\u0000\u0000"+
		"\u0000\u06f3\u06f1\u0001\u0000\u0000\u0000\u06f4\u06f6\u0005T\u0000\u0000"+
		"\u06f5\u06ec\u0001\u0000\u0000\u0000\u06f5\u06ed\u0001\u0000\u0000\u0000"+
		"\u06f6\u0111\u0001\u0000\u0000\u0000\u06f7\u06fa\u0005K\u0000\u0000\u06f8"+
		"\u06fb\u0003\u00f4z\u0000\u06f9\u06fb\u0003\u00b8\\\u0000\u06fa\u06f8"+
		"\u0001\u0000\u0000\u0000\u06fa\u06f9\u0001\u0000\u0000\u0000\u06fb\u06fc"+
		"\u0001\u0000\u0000\u0000\u06fc\u06fd\u0005]\u0000\u0000\u06fd\u0113\u0001"+
		"\u0000\u0000\u0000\u06fe\u0700\u0003\u0116\u008b\u0000\u06ff\u06fe\u0001"+
		"\u0000\u0000\u0000\u0700\u0701\u0001\u0000\u0000\u0000\u0701\u06ff\u0001"+
		"\u0000\u0000\u0000\u0701\u0702\u0001\u0000\u0000\u0000\u0702\u0115\u0001"+
		"\u0000\u0000\u0000\u0703\u0709\u0003\u0120\u0090\u0000\u0704\u0709\u0003"+
		"\u0122\u0091\u0000\u0705\u0709\u0003\u0124\u0092\u0000\u0706\u0709\u0003"+
		"\u0126\u0093\u0000\u0707\u0709\u0003\u0118\u008c\u0000\u0708\u0703\u0001"+
		"\u0000\u0000\u0000\u0708\u0704\u0001\u0000\u0000\u0000\u0708\u0705\u0001"+
		"\u0000\u0000\u0000\u0708\u0706\u0001\u0000\u0000\u0000\u0708\u0707\u0001"+
		"\u0000\u0000\u0000\u0709\u0117\u0001\u0000\u0000\u0000\u070a\u070b\u0005"+
		"q\u0000\u0000\u070b\u070f\u0005\u0085\u0000\u0000\u070c\u070e\u0003\u012e"+
		"\u0097\u0000\u070d\u070c\u0001\u0000\u0000\u0000\u070e\u0711\u0001\u0000"+
		"\u0000\u0000\u070f\u070d\u0001\u0000\u0000\u0000\u070f\u0710\u0001\u0000"+
		"\u0000\u0000\u0710\u0712\u0001\u0000\u0000\u0000\u0711\u070f\u0001\u0000"+
		"\u0000\u0000\u0712\u0717\u0005r\u0000\u0000\u0713\u0716\u0003\u013c\u009e"+
		"\u0000\u0714\u0716\u0003\u011a\u008d\u0000\u0715\u0713\u0001\u0000\u0000"+
		"\u0000\u0715\u0714\u0001\u0000\u0000\u0000\u0716\u0719\u0001\u0000\u0000"+
		"\u0000\u0717\u0715\u0001\u0000\u0000\u0000\u0717\u0718\u0001\u0000\u0000"+
		"\u0000\u0718\u071a\u0001\u0000\u0000\u0000\u0719\u0717\u0001\u0000\u0000"+
		"\u0000\u071a\u071b\u0003\u012a\u0095\u0000\u071b\u0119\u0001\u0000\u0000"+
		"\u0000\u071c\u071d\u0005q\u0000\u0000\u071d\u0721\u0007\u0003\u0000\u0000"+
		"\u071e\u0720\u0003\u012e\u0097\u0000\u071f\u071e\u0001\u0000\u0000\u0000"+
		"\u0720\u0723\u0001\u0000\u0000\u0000\u0721\u071f\u0001\u0000\u0000\u0000"+
		"\u0721\u0722\u0001\u0000\u0000\u0000\u0722\u0727\u0001\u0000\u0000\u0000"+
		"\u0723\u0721\u0001\u0000\u0000\u0000\u0724\u0725\u0005t\u0000\u0000\u0725"+
		"\u0728\u0005r\u0000\u0000\u0726\u0728\u0005r\u0000\u0000\u0727\u0724\u0001"+
		"\u0000\u0000\u0000\u0727\u0726\u0001\u0000\u0000\u0000\u0728\u011b\u0001"+
		"\u0000\u0000\u0000\u0729\u072a\u0005q\u0000\u0000\u072a\u072b\u0003\u012c"+
		"\u0096\u0000\u072b\u011d\u0001\u0000\u0000\u0000\u072c\u072d\u0005\u008b"+
		"\u0000\u0000\u072d\u072e\u0003\u012c\u0096\u0000\u072e\u072f\u0005r\u0000"+
		"\u0000\u072f\u011f\u0001\u0000\u0000\u0000\u0730\u0733\u0005q\u0000\u0000"+
		"\u0731\u0734\u0003\u012c\u0096\u0000\u0732\u0734\u0005m\u0000\u0000\u0733"+
		"\u0731\u0001\u0000\u0000\u0000\u0733\u0732\u0001\u0000\u0000\u0000\u0734"+
		"\u0738\u0001\u0000\u0000\u0000\u0735\u0737\u0003\u012e\u0097\u0000\u0736"+
		"\u0735\u0001\u0000\u0000\u0000\u0737\u073a\u0001\u0000\u0000\u0000\u0738"+
		"\u0736\u0001\u0000\u0000\u0000\u0738\u0739\u0001\u0000\u0000\u0000\u0739"+
		"\u073b\u0001\u0000\u0000\u0000\u073a\u0738\u0001\u0000\u0000\u0000\u073b"+
		"\u073f\u0005r\u0000\u0000\u073c\u073e\u0003\u013c\u009e\u0000\u073d\u073c"+
		"\u0001\u0000\u0000\u0000\u073e\u0741\u0001\u0000\u0000\u0000\u073f\u073d"+
		"\u0001\u0000\u0000\u0000\u073f\u0740\u0001\u0000\u0000\u0000\u0740\u0742"+
		"\u0001\u0000\u0000\u0000\u0741\u073f\u0001\u0000\u0000\u0000\u0742\u0743"+
		"\u0003\u012a\u0095\u0000\u0743\u0121\u0001\u0000\u0000\u0000\u0744\u0747"+
		"\u0005q\u0000\u0000\u0745\u0748\u0003\u012c\u0096\u0000\u0746\u0748\u0005"+
		"m\u0000\u0000\u0747\u0745\u0001\u0000\u0000\u0000\u0747\u0746\u0001\u0000"+
		"\u0000\u0000\u0748\u074c\u0001\u0000\u0000\u0000\u0749\u074b\u0003\u012e"+
		"\u0097\u0000\u074a\u0749\u0001\u0000\u0000\u0000\u074b\u074e\u0001\u0000"+
		"\u0000\u0000\u074c\u074a\u0001\u0000\u0000\u0000\u074c\u074d\u0001\u0000"+
		"\u0000\u0000\u074d\u0752\u0001\u0000\u0000\u0000\u074e\u074c\u0001\u0000"+
		"\u0000\u0000\u074f\u0750\u0005t\u0000\u0000\u0750\u0753\u0005r\u0000\u0000"+
		"\u0751\u0753\u0005r\u0000\u0000\u0752\u074f\u0001\u0000\u0000\u0000\u0752"+
		"\u0751\u0001\u0000\u0000\u0000\u0753\u0123\u0001\u0000\u0000\u0000\u0754"+
		"\u0755\u0003\u011c\u008e\u0000\u0755\u0759\u0005r\u0000\u0000\u0756\u0758"+
		"\u0003\u013c\u009e\u0000\u0757\u0756\u0001\u0000\u0000\u0000\u0758\u075b"+
		"\u0001\u0000\u0000\u0000\u0759\u0757\u0001\u0000\u0000\u0000\u0759\u075a"+
		"\u0001\u0000\u0000\u0000\u075a\u075c\u0001\u0000\u0000\u0000\u075b\u0759"+
		"\u0001\u0000\u0000\u0000\u075c\u075d\u0003\u011e\u008f\u0000\u075d\u0125"+
		"\u0001\u0000\u0000\u0000\u075e\u075f\u0005q\u0000\u0000\u075f\u0763\u0005"+
		"G\u0000\u0000\u0760\u0762\u0003\u012e\u0097\u0000\u0761\u0760\u0001\u0000"+
		"\u0000\u0000\u0762\u0765\u0001\u0000\u0000\u0000\u0763\u0761\u0001\u0000"+
		"\u0000\u0000\u0763\u0764\u0001\u0000\u0000\u0000\u0764\u0766\u0001\u0000"+
		"\u0000\u0000\u0765\u0763\u0001\u0000\u0000\u0000\u0766\u076a\u0005r\u0000"+
		"\u0000\u0767\u0769\u0003\u013c\u009e\u0000\u0768\u0767\u0001\u0000\u0000"+
		"\u0000\u0769\u076c\u0001\u0000\u0000\u0000\u076a\u0768\u0001\u0000\u0000"+
		"\u0000\u076a\u076b\u0001\u0000\u0000\u0000\u076b\u076d\u0001\u0000\u0000"+
		"\u0000\u076c\u076a\u0001\u0000\u0000\u0000\u076d\u076e\u0005\u008b\u0000"+
		"\u0000\u076e\u076f\u0005G\u0000\u0000\u076f\u0770\u0005r\u0000\u0000\u0770"+
		"\u0127\u0001\u0000\u0000\u0000\u0771\u0772\u0005q\u0000\u0000\u0772\u0773"+
		"\u0005m\u0000\u0000\u0773\u0129\u0001\u0000\u0000\u0000\u0774\u0775\u0005"+
		"\u008b\u0000\u0000\u0775\u0776\u0005m\u0000\u0000\u0776\u0777\u0005r\u0000"+
		"\u0000\u0777\u012b\u0001\u0000\u0000\u0000\u0778\u0786\u0005}\u0000\u0000"+
		"\u0779\u0786\u0005~\u0000\u0000\u077a\u0786\u0005\u007f\u0000\u0000\u077b"+
		"\u0786\u0005\u0080\u0000\u0000\u077c\u0786\u0005\u0081\u0000\u0000\u077d"+
		"\u0786\u0005\u0082\u0000\u0000\u077e\u0786\u0005\u0083\u0000\u0000\u077f"+
		"\u0786\u0005\u0084\u0000\u0000\u0780\u0786\u0005\u0085\u0000\u0000\u0781"+
		"\u0786\u0005\u001c\u0000\u0000\u0782\u0786\u0005B\u0000\u0000\u0783\u0786"+
		"\u0005G\u0000\u0000\u0784\u0786\u0005\u0086\u0000\u0000\u0785\u0778\u0001"+
		"\u0000\u0000\u0000\u0785\u0779\u0001\u0000\u0000\u0000\u0785\u077a\u0001"+
		"\u0000\u0000\u0000\u0785\u077b\u0001\u0000\u0000\u0000\u0785\u077c\u0001"+
		"\u0000\u0000\u0000\u0785\u077d\u0001\u0000\u0000\u0000\u0785\u077e\u0001"+
		"\u0000\u0000\u0000\u0785\u077f\u0001\u0000\u0000\u0000\u0785\u0780\u0001"+
		"\u0000\u0000\u0000\u0785\u0781\u0001\u0000\u0000\u0000\u0785\u0782\u0001"+
		"\u0000\u0000\u0000\u0785\u0783\u0001\u0000\u0000\u0000\u0785\u0784\u0001"+
		"\u0000\u0000\u0000\u0786\u012d\u0001\u0000\u0000\u0000\u0787\u0788\u0005"+
		"\u001e\u0000\u0000\u0788\u0789\u0005_\u0000\u0000\u0789\u079d\u0005g\u0000"+
		"\u0000\u078a\u078e\u0005\u001f\u0000\u0000\u078b\u078c\u0005_\u0000\u0000"+
		"\u078c\u078f\u0003\u00b8\\\u0000\u078d\u078f\u0003\u0130\u0098\u0000\u078e"+
		"\u078b\u0001\u0000\u0000\u0000\u078e\u078d\u0001\u0000\u0000\u0000\u078f"+
		"\u079d\u0001\u0000\u0000\u0000\u0790\u0791\u0005\u0087\u0000\u0000\u0791"+
		"\u0792\u0005_\u0000\u0000\u0792\u079d\u0003\u00b8\\\u0000\u0793\u079d"+
		"\u0003\u0134\u009a\u0000\u0794\u079d\u0003\u0144\u00a2\u0000\u0795\u079d"+
		"\u0003\u0138\u009c\u0000\u0796\u079d\u0003\u013a\u009d\u0000\u0797\u079d"+
		"\u0003\u0130\u0098\u0000\u0798\u079d\u0003\u0132\u0099\u0000\u0799\u079a"+
		"\u0005\u0006\u0000\u0000\u079a\u079b\u0005_\u0000\u0000\u079b\u079d\u0005"+
		"g\u0000\u0000\u079c\u0787\u0001\u0000\u0000\u0000\u079c\u078a\u0001\u0000"+
		"\u0000\u0000\u079c\u0790\u0001\u0000\u0000\u0000\u079c\u0793\u0001\u0000"+
		"\u0000\u0000\u079c\u0794\u0001\u0000\u0000\u0000\u079c\u0795\u0001\u0000"+
		"\u0000\u0000\u079c\u0796\u0001\u0000\u0000\u0000\u079c\u0797\u0001\u0000"+
		"\u0000\u0000\u079c\u0798\u0001\u0000\u0000\u0000\u079c\u0799\u0001\u0000"+
		"\u0000\u0000\u079d\u012f\u0001\u0000\u0000\u0000\u079e\u079f\u0005W\u0000"+
		"\u0000\u079f\u07a0\u0005m\u0000\u0000\u07a0\u07a1\u0005X\u0000\u0000\u07a1"+
		"\u07a2\u0005_\u0000\u0000\u07a2\u07a9\u0003\u00b8\\\u0000\u07a3\u07a4"+
		"\u0005Y\u0000\u0000\u07a4\u07a5\u0005m\u0000\u0000\u07a5\u07a6\u0005Z"+
		"\u0000\u0000\u07a6\u07a7\u0005_\u0000\u0000\u07a7\u07a9\u0003\u00b8\\"+
		"\u0000\u07a8\u079e\u0001\u0000\u0000\u0000\u07a8\u07a3\u0001\u0000\u0000"+
		"\u0000\u07a9\u0131\u0001\u0000\u0000\u0000\u07aa\u07ab\u0005q\u0000\u0000"+
		"\u07ab\u07ac\u0005L\u0000\u0000\u07ac\u07ad\u0005_\u0000\u0000\u07ad\u07ae"+
		"\u0005g\u0000\u0000\u07ae\u07af\u0005r\u0000\u0000\u07af\u0133\u0001\u0000"+
		"\u0000\u0000\u07b0\u07b1\u0005W\u0000\u0000\u07b1\u07b2\u0003\u0136\u009b"+
		"\u0000\u07b2\u07b5\u0005X\u0000\u0000\u07b3\u07b4\u0005_\u0000\u0000\u07b4"+
		"\u07b6\u0003\u00b8\\\u0000\u07b5\u07b3\u0001\u0000\u0000\u0000\u07b5\u07b6"+
		"\u0001\u0000\u0000\u0000\u07b6\u0135\u0001\u0000\u0000\u0000\u07b7\u07bc"+
		"\u0005m\u0000\u0000\u07b8\u07b9\u0005x\u0000\u0000\u07b9\u07bb\u0005m"+
		"\u0000\u0000\u07ba\u07b8\u0001\u0000\u0000\u0000\u07bb\u07be\u0001\u0000"+
		"\u0000\u0000\u07bc\u07ba\u0001\u0000\u0000\u0000\u07bc\u07bd\u0001\u0000"+
		"\u0000\u0000\u07bd\u07c2\u0001\u0000\u0000\u0000\u07be\u07bc\u0001\u0000"+
		"\u0000\u0000\u07bf\u07c2\u0005\u001f\u0000\u0000\u07c0\u07c2\u0005\u001e"+
		"\u0000\u0000\u07c1\u07b7\u0001\u0000\u0000\u0000\u07c1\u07bf\u0001\u0000"+
		"\u0000\u0000\u07c1\u07c0\u0001\u0000\u0000\u0000\u07c2\u0137\u0001\u0000"+
		"\u0000\u0000\u07c3\u07c4\u0005\u0088\u0000\u0000\u07c4\u07c5\u0005_\u0000"+
		"\u0000\u07c5\u07c6\u0003\u00b8\\\u0000\u07c6\u0139\u0001\u0000\u0000\u0000"+
		"\u07c7\u07c8\u0005|\u0000\u0000\u07c8\u07c9\u0005_\u0000\u0000\u07c9\u07ca"+
		"\u0003\u00b8\\\u0000\u07ca\u013b\u0001\u0000\u0000\u0000\u07cb\u07d0\u0003"+
		"\u0114\u008a\u0000\u07cc\u07d0\u0003\u0146\u00a3\u0000\u07cd\u07d0\u0003"+
		"\u0140\u00a0\u0000\u07ce\u07d0\u0003\u013e\u009f\u0000\u07cf\u07cb\u0001"+
		"\u0000\u0000\u0000\u07cf\u07cc\u0001\u0000\u0000\u0000\u07cf\u07cd\u0001"+
		"\u0000\u0000\u0000\u07cf\u07ce\u0001\u0000\u0000\u0000\u07d0\u07d1\u0001"+
		"\u0000\u0000\u0000\u07d1\u07cf\u0001\u0000\u0000\u0000\u07d1\u07d2\u0001"+
		"\u0000\u0000\u0000\u07d2\u013d\u0001\u0000\u0000\u0000\u07d3\u07d4\t\u0000"+
		"\u0000\u0000\u07d4\u013f\u0001\u0000\u0000\u0000\u07d5\u07d6\u0003\u0142"+
		"\u00a1\u0000\u07d6\u0141\u0001\u0000\u0000\u0000\u07d7\u07d8\u0005U\u0000"+
		"\u0000\u07d8\u07dd\u0005m\u0000\u0000\u07d9\u07da\u0005x\u0000\u0000\u07da"+
		"\u07dc\u0005m\u0000\u0000\u07db\u07d9\u0001\u0000\u0000\u0000\u07dc\u07df"+
		"\u0001\u0000\u0000\u0000\u07dd\u07db\u0001\u0000\u0000\u0000\u07dd\u07de"+
		"\u0001\u0000\u0000\u0000\u07de\u07e0\u0001\u0000\u0000\u0000\u07df\u07dd"+
		"\u0001\u0000\u0000\u0000\u07e0\u07e1\u0005V\u0000\u0000\u07e1\u0143\u0001"+
		"\u0000\u0000\u0000\u07e2\u07e3\u0005Y\u0000\u0000\u07e3\u07e4\u0005m\u0000"+
		"\u0000\u07e4\u07e5\u0005Z\u0000\u0000\u07e5\u07e6\u0005_\u0000\u0000\u07e6"+
		"\u07e7\u0003\u00b8\\\u0000\u07e7\u0145\u0001\u0000\u0000\u0000\u07e8\u07e9"+
		"\u0007\u0004\u0000\u0000\u07e9\u0147\u0001\u0000\u0000\u0000\u07ea\u07ec"+
		"\u0003\u014a\u00a5\u0000\u07eb\u07ea\u0001\u0000\u0000\u0000\u07ec\u07ed"+
		"\u0001\u0000\u0000\u0000\u07ed\u07eb\u0001\u0000\u0000\u0000\u07ed\u07ee"+
		"\u0001\u0000\u0000\u0000\u07ee\u0149\u0001\u0000\u0000\u0000\u07ef\u07f0"+
		"\u0003\u014c\u00a6\u0000\u07f0\u07f2\u0005S\u0000\u0000\u07f1\u07f3\u0003"+
		"\u0154\u00aa\u0000\u07f2\u07f1\u0001\u0000\u0000\u0000\u07f3\u07f4\u0001"+
		"\u0000\u0000\u0000\u07f4\u07f2\u0001\u0000\u0000\u0000\u07f4\u07f5\u0001"+
		"\u0000\u0000\u0000\u07f5\u07f6\u0001\u0000\u0000\u0000\u07f6\u07f7\u0005"+
		"T\u0000\u0000\u07f7\u014b\u0001\u0000\u0000\u0000\u07f8\u07fc\u0003\u014e"+
		"\u00a7\u0000\u07f9\u07fc\u0003\u0150\u00a8\u0000\u07fa\u07fc\u0003\u0152"+
		"\u00a9\u0000\u07fb\u07f8\u0001\u0000\u0000\u0000\u07fb\u07f9\u0001\u0000"+
		"\u0000\u0000\u07fb\u07fa\u0001\u0000\u0000\u0000\u07fc\u014d\u0001\u0000"+
		"\u0000\u0000\u07fd\u07fe\u0005x\u0000\u0000\u07fe\u07ff\u0003@ \u0000"+
		"\u07ff\u014f\u0001\u0000\u0000\u0000\u0800\u0801\u0005b\u0000\u0000\u0801"+
		"\u0802\u0005m\u0000\u0000\u0802\u0151\u0001\u0000\u0000\u0000\u0803\u0804"+
		"\u0003\u014e\u00a7\u0000\u0804\u0805\u0005[\u0000\u0000\u0805\u0806\u0005"+
		"m\u0000\u0000\u0806\u0153\u0001\u0000\u0000\u0000\u0807\u0808\u0003\u0156"+
		"\u00ab\u0000\u0808\u0809\u0005[\u0000\u0000\u0809\u080a\u0003\u0158\u00ac"+
		"\u0000\u080a\u080b\u0005]\u0000\u0000\u080b\u0155\u0001\u0000\u0000\u0000"+
		"\u080c\u0811\u0005m\u0000\u0000\u080d\u080e\u0005w\u0000\u0000\u080e\u0810"+
		"\u0005m\u0000\u0000\u080f\u080d\u0001\u0000\u0000\u0000\u0810\u0813\u0001"+
		"\u0000\u0000\u0000\u0811\u080f\u0001\u0000\u0000\u0000\u0811\u0812\u0001"+
		"\u0000\u0000\u0000\u0812\u0157\u0001\u0000\u0000\u0000\u0813\u0811\u0001"+
		"\u0000\u0000\u0000\u0814\u0816\u0005j\u0000\u0000\u0815\u0817\u0005O\u0000"+
		"\u0000\u0816\u0815\u0001\u0000\u0000\u0000\u0816\u0817\u0001\u0000\u0000"+
		"\u0000\u0817\u081d\u0001\u0000\u0000\u0000\u0818\u081d\u0005a\u0000\u0000"+
		"\u0819\u081d\u0005m\u0000\u0000\u081a\u081d\u0005g\u0000\u0000\u081b\u081d"+
		"\u0003\u015a\u00ad\u0000\u081c\u0814\u0001\u0000\u0000\u0000\u081c\u0818"+
		"\u0001\u0000\u0000\u0000\u081c\u0819\u0001\u0000\u0000\u0000\u081c\u081a"+
		"\u0001\u0000\u0000\u0000\u081c\u081b\u0001\u0000\u0000\u0000\u081d\u0159"+
		"\u0001\u0000\u0000\u0000\u081e\u081f\u0005m\u0000\u0000\u081f\u0820\u0005"+
		"Y\u0000\u0000\u0820\u0821\u0003\u0158\u00ac\u0000\u0821\u0822\u0005Z\u0000"+
		"\u0000\u0822\u015b\u0001\u0000\u0000\u0000\u00a4\u015f\u0168\u0171\u0182"+
		"\u019a\u01a6\u01ae\u01b7\u01be\u01cd\u01e3\u01e8\u01ee\u01f7\u020f\u021b"+
		"\u0225\u022d\u0238\u0249\u0253\u0265\u026e\u0279\u0284\u029c\u029e\u02a7"+
		"\u02ad\u02af\u02c0\u02dd\u02ee\u02f6\u0323\u0329\u0333\u033e\u034c\u0355"+
		"\u0358\u035b\u036b\u0370\u0375\u037b\u0382\u038a\u0393\u03a6\u03a9\u03af"+
		"\u03b1\u03bc\u03c3\u03ca\u03d4\u03de\u03f9\u0402\u0406\u0412\u041a\u041e"+
		"\u0428\u0435\u0442\u044b\u044f\u0453\u0468\u0470\u0478\u047b\u0481\u048c"+
		"\u04a0\u04aa\u04b0\u04b9\u04db\u0503\u051b\u0550\u0552\u0557\u055b\u0564"+
		"\u0569\u056e\u0572\u0584\u058e\u0598\u059c\u05a4\u05b7\u05bf\u05cc\u05d7"+
		"\u05dd\u05e3\u05ea\u05ef\u05f3\u05f9\u05fe\u0602\u0608\u0613\u0618\u0622"+
		"\u062e\u0649\u0661\u0668\u0674\u0676\u067f\u068b\u06a8\u06b6\u06c1\u06c6"+
		"\u06d1\u06dd\u06e2\u06e7\u06ea\u06f1\u06f5\u06fa\u0701\u0708\u070f\u0715"+
		"\u0717\u0721\u0727\u0733\u0738\u073f\u0747\u074c\u0752\u0759\u0763\u076a"+
		"\u0785\u078e\u079c\u07a8\u07b5\u07bc\u07c1\u07cf\u07d1\u07dd\u07ed\u07f4"+
		"\u07fb\u0811\u0816\u081c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}