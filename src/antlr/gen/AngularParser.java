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
		IMPORT=1, COMPONENT=2, FROM=3, EXPORT=4, CLASS=5, FOR=6, FUNICTION=7, 
		CONSOLE=8, LOG=9, WHILE=10, SWITCH=11, CASE=12, DEFAULT=13, INTERFACE=14, 
		LET=15, CONST=16, VAR=17, IN=18, IF=19, ELSE=20, AT=21, PROVIDEDIN=22, 
		SELECTOR=23, TEMPLATE=24, TEMPLATEURL=25, STYLEURLS=26, ANY=27, CONSTRUCTOR=28, 
		SELECTPRODUCT=29, NGONINIT=30, THIS=31, ARRAY=32, PRIVATE=33, PUBLIC=34, 
		PROTECTED=35, EXPORTAS=36, INJECTABLE=37, GET_PRODUCTS=38, ONBUTTONCLICK=39, 
		VOID=40, RETURN=41, INPUT=42, OUTPUT=43, Input=44, NEW=45, UNIT=46, IMPLEMENTS=47, 
		EXTENDS=48, ONINIT=49, OPEN_CURLY=50, CLOSE_CURLY=51, OPEN_DOUBLE_CURLY=52, 
		CLOSE_DOUBLE_CURLY=53, OPEN_SQUARE=54, CLOSE_SQUARE=55, OPEN_PAREN=56, 
		CLOSE_PAREN=57, COLON=58, COMMA=59, SEMICOLON=60, EQUALS=61, OR_OPERATOR=62, 
		COLOR=63, HASH=64, NOT_EQUAL=65, STRICT_NOT_EQUAL=66, BACKTICK=67, HHH=68, 
		ARROW=69, STRING=70, PLUS_PLUS=71, MINUS_MINUS=72, NUMBER=73, INTEGER=74, 
		PRICE=75, IDENTIFIER=76, LINE_COMMENT=77, BLOCK_COMMENT=78, WS=79, BUTTON=80, 
		LESS_THAN=81, GREATER_THAN=82, STAR=83, DIVIDE=84, MOD=85, PLUS=86, MINUS=87, 
		DOT=88, LS=89, Product=90, NG=91, FIXEDTAGNAME=92, NI=93, NULL=94, ATTVALUE_VALUE=95, 
		GG=96, ARABIC_TEXT=97;
	public static final int
		RULE_program = 0, RULE_application = 1, RULE_importStatement = 2, RULE_keyimport = 3, 
		RULE_component = 4, RULE_injectable = 5, RULE_metadata = 6, RULE_metadataEntry = 7, 
		RULE_providin = 8, RULE_templateurl = 9, RULE_selector = 10, RULE_basicMetadata = 11, 
		RULE_htmlMetadata = 12, RULE_styleUrl = 13, RULE_classDeclaration = 14, 
		RULE_classInheritance = 15, RULE_extendClause = 16, RULE_implementClause = 17, 
		RULE_getproduct = 18, RULE_products = 19, RULE_elementList = 20, RULE_element = 21, 
		RULE_pair = 22, RULE_value = 23, RULE_basevalue = 24, RULE_classBody = 25, 
		RULE_propertyDeclaration = 26, RULE_regularProperty = 27, RULE_letDeclaration = 28, 
		RULE_typeVarible = 29, RULE_emptyArrayDeclaration = 30, RULE_constructor = 31, 
		RULE_loopStatement = 32, RULE_whileStatement = 33, RULE_switchStatement = 34, 
		RULE_ifStatement = 35, RULE_equalityExpression = 36, RULE_caseClause = 37, 
		RULE_functionDeclaration = 38, RULE_functionB = 39, RULE_propertystatment = 40, 
		RULE_methodDeclaration = 41, RULE_parameter = 42, RULE_modifiers = 43, 
		RULE_statement = 44, RULE_expression = 45, RULE_propertyAccess = 46, RULE_calfun = 47, 
		RULE_iddot = 48, RULE_functhis = 49, RULE_functionCall = 50, RULE_selectProduct = 51, 
		RULE_argumentList = 52, RULE_arrayLiteral = 53, RULE_interfaceDeclaration = 54, 
		RULE_interfaceBody = 55, RULE_interfaceMember = 56, RULE_propertySignature = 57, 
		RULE_methodSignature = 58, RULE_parameterList = 59, RULE_parameter2 = 60, 
		RULE_onbutton = 61, RULE_arrayvalue = 62, RULE_decorator = 63, RULE_propertyAssignment = 64, 
		RULE_expressionList = 65, RULE_ngOnInit = 66, RULE_lambdaExpression = 67, 
		RULE_functionBody = 68, RULE_returnStatement = 69, RULE_htmlElement = 70, 
		RULE_htmlElementassist = 71, RULE_standardHtmlElement = 72, RULE_selfClosingHtmlElement = 73, 
		RULE_fixedHtmlElement = 74, RULE_angularButton = 75, RULE_opentag = 76, 
		RULE_closetag = 77, RULE_fixedtqg = 78, RULE_closefixedtag = 79, RULE_htmlAttribute = 80, 
		RULE_ngIf = 81, RULE_ngfor = 82, RULE_htmlContent = 83, RULE_interp = 84, 
		RULE_identifierChain = 85, RULE_eventBinding = 86, RULE_textNode = 87, 
		RULE_stylesheet = 88, RULE_ruleSet = 89, RULE_selector1 = 90, RULE_classSelector = 91, 
		RULE_idSelector = 92, RULE_pseudoClassSelector = 93, RULE_declaration = 94, 
		RULE_property = 95, RULE_value1 = 96, RULE_cssFunction = 97;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "application", "importStatement", "keyimport", "component", 
			"injectable", "metadata", "metadataEntry", "providin", "templateurl", 
			"selector", "basicMetadata", "htmlMetadata", "styleUrl", "classDeclaration", 
			"classInheritance", "extendClause", "implementClause", "getproduct", 
			"products", "elementList", "element", "pair", "value", "basevalue", "classBody", 
			"propertyDeclaration", "regularProperty", "letDeclaration", "typeVarible", 
			"emptyArrayDeclaration", "constructor", "loopStatement", "whileStatement", 
			"switchStatement", "ifStatement", "equalityExpression", "caseClause", 
			"functionDeclaration", "functionB", "propertystatment", "methodDeclaration", 
			"parameter", "modifiers", "statement", "expression", "propertyAccess", 
			"calfun", "iddot", "functhis", "functionCall", "selectProduct", "argumentList", 
			"arrayLiteral", "interfaceDeclaration", "interfaceBody", "interfaceMember", 
			"propertySignature", "methodSignature", "parameterList", "parameter2", 
			"onbutton", "arrayvalue", "decorator", "propertyAssignment", "expressionList", 
			"ngOnInit", "lambdaExpression", "functionBody", "returnStatement", "htmlElement", 
			"htmlElementassist", "standardHtmlElement", "selfClosingHtmlElement", 
			"fixedHtmlElement", "angularButton", "opentag", "closetag", "fixedtqg", 
			"closefixedtag", "htmlAttribute", "ngIf", "ngfor", "htmlContent", "interp", 
			"identifierChain", "eventBinding", "textNode", "stylesheet", "ruleSet", 
			"selector1", "classSelector", "idSelector", "pseudoClassSelector", "declaration", 
			"property", "value1", "cssFunction"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", null, "'from'", "'export'", "'class'", "'for'", "'function'", 
			"'console'", "'log'", "'while'", "'switch'", "'case'", "'default'", "'interface'", 
			"'let'", "'const'", "'var'", "'in'", "'if'", "'else'", "'@'", "'providedIn'", 
			"'selector'", "'template'", "'templateUrl'", "'styleUrls'", "'any'", 
			"'constructor'", "'selectProduct'", "'ngOnInit'", "'this'", "'array'", 
			"'private'", "'public'", "'protected'", "'exportas'", "'@Injectable'", 
			"'getProducts'", "'onButtonClick'", "'void'", "'return'", "'@Input'", 
			"'@Output'", "'input'", "'new'", null, "'implements'", "'extends'", "'OnInit'", 
			"'{'", "'}'", "'{{'", "'}}'", "'['", "']'", "'('", "')'", "':'", "','", 
			"';'", "'='", "'|'", null, "'#'", "'!='", "'!=='", "'`'", "'/>'", "'=>'", 
			null, "'++'", "'--'", null, null, null, null, null, null, null, "'button'", 
			"'<'", "'>'", "'*'", "'/'", "'%'", "'+'", "'-'", "'.'", null, "'product'", 
			"'*ngFor'", null, "'*ngIf'", "'null'", "'attvalue_value'", "'</'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMPORT", "COMPONENT", "FROM", "EXPORT", "CLASS", "FOR", "FUNICTION", 
			"CONSOLE", "LOG", "WHILE", "SWITCH", "CASE", "DEFAULT", "INTERFACE", 
			"LET", "CONST", "VAR", "IN", "IF", "ELSE", "AT", "PROVIDEDIN", "SELECTOR", 
			"TEMPLATE", "TEMPLATEURL", "STYLEURLS", "ANY", "CONSTRUCTOR", "SELECTPRODUCT", 
			"NGONINIT", "THIS", "ARRAY", "PRIVATE", "PUBLIC", "PROTECTED", "EXPORTAS", 
			"INJECTABLE", "GET_PRODUCTS", "ONBUTTONCLICK", "VOID", "RETURN", "INPUT", 
			"OUTPUT", "Input", "NEW", "UNIT", "IMPLEMENTS", "EXTENDS", "ONINIT", 
			"OPEN_CURLY", "CLOSE_CURLY", "OPEN_DOUBLE_CURLY", "CLOSE_DOUBLE_CURLY", 
			"OPEN_SQUARE", "CLOSE_SQUARE", "OPEN_PAREN", "CLOSE_PAREN", "COLON", 
			"COMMA", "SEMICOLON", "EQUALS", "OR_OPERATOR", "COLOR", "HASH", "NOT_EQUAL", 
			"STRICT_NOT_EQUAL", "BACKTICK", "HHH", "ARROW", "STRING", "PLUS_PLUS", 
			"MINUS_MINUS", "NUMBER", "INTEGER", "PRICE", "IDENTIFIER", "LINE_COMMENT", 
			"BLOCK_COMMENT", "WS", "BUTTON", "LESS_THAN", "GREATER_THAN", "STAR", 
			"DIVIDE", "MOD", "PLUS", "MINUS", "DOT", "LS", "Product", "NG", "FIXEDTAGNAME", 
			"NI", "NULL", "ATTVALUE_VALUE", "GG", "ARABIC_TEXT"
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
		public TerminalNode EOF() { return getToken(AngularParser.EOF, 0); }
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
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IMPORT) | (1L << COMPONENT) | (1L << EXPORT) | (1L << INJECTABLE))) != 0)) {
				{
				{
				setState(196);
				application();
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
			match(EOF);
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
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				_localctx = new IMPORTLABELContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				importStatement();
				}
				break;
			case COMPONENT:
				_localctx = new COMPONENTLABELContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				component();
				}
				break;
			case EXPORT:
				_localctx = new CLASSLABELContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				classDeclaration();
				}
				break;
			case INJECTABLE:
				_localctx = new INJECTABLELABELContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(207);
				injectable();
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
			setState(210);
			match(IMPORT);
			setState(211);
			match(OPEN_CURLY);
			setState(212);
			keyimport();
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(213);
				match(COMMA);
				setState(214);
				keyimport();
				}
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(220);
			match(CLOSE_CURLY);
			setState(221);
			match(FROM);
			setState(222);
			match(STRING);
			setState(223);
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
		public TerminalNode ONINIT() { return getToken(AngularParser.ONINIT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public KeyimportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyimport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterKeyimport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitKeyimport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitKeyimport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyimportContext keyimport() throws RecognitionException {
		KeyimportContext _localctx = new KeyimportContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_keyimport);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_la = _input.LA(1);
			if ( !(((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & ((1L << (ONINIT - 49)) | (1L << (STRING - 49)) | (1L << (IDENTIFIER - 49)))) != 0)) ) {
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
			setState(227);
			match(COMPONENT);
			setState(228);
			match(OPEN_PAREN);
			setState(229);
			match(OPEN_CURLY);
			setState(230);
			metadata();
			setState(231);
			match(CLOSE_CURLY);
			setState(232);
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
			setState(234);
			match(INJECTABLE);
			setState(235);
			match(OPEN_PAREN);
			setState(236);
			match(OPEN_CURLY);
			setState(237);
			metadata();
			setState(238);
			match(CLOSE_CURLY);
			setState(239);
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
		enterRule(_localctx, 12, RULE_metadata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PROVIDEDIN) | (1L << SELECTOR) | (1L << TEMPLATE) | (1L << TEMPLATEURL) | (1L << STYLEURLS))) != 0)) {
				{
				setState(241);
				metadataEntry();
				}
			}

			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(244);
				match(COMMA);
				setState(245);
				metadataEntry();
				}
				}
				setState(250);
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
		enterRule(_localctx, 14, RULE_metadataEntry);
		try {
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new BasicMetadataLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				basicMetadata();
				}
				break;
			case 2:
				_localctx = new HtmlMetadataLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				htmlMetadata();
				}
				break;
			case 3:
				_localctx = new SELECTORLABELContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(253);
				selector();
				}
				break;
			case 4:
				_localctx = new TAMPLATEURLLABELContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(254);
				templateurl();
				}
				break;
			case 5:
				_localctx = new PROVIDINLABELContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(255);
				providin();
				}
				break;
			case 6:
				_localctx = new STYLEURLLABELContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(256);
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
		enterRule(_localctx, 16, RULE_providin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(PROVIDEDIN);
			setState(260);
			match(COLON);
			setState(261);
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
		enterRule(_localctx, 18, RULE_templateurl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(TEMPLATEURL);
			setState(264);
			match(COLON);
			setState(265);
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
		enterRule(_localctx, 20, RULE_selector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(SELECTOR);
			setState(268);
			match(COLON);
			setState(269);
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
		enterRule(_localctx, 22, RULE_basicMetadata);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(TEMPLATE);
			setState(272);
			match(COLON);
			setState(273);
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
		enterRule(_localctx, 24, RULE_htmlMetadata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(TEMPLATE);
			setState(276);
			match(COLON);
			setState(277);
			match(BACKTICK);
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LESS_THAN) {
				{
				{
				setState(278);
				htmlElement();
				}
				}
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(284);
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
		public StylesheetContext stylesheet() {
			return getRuleContext(StylesheetContext.class,0);
		}
		public TerminalNode CLOSE_SQUARE() { return getToken(AngularParser.CLOSE_SQUARE, 0); }
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
		enterRule(_localctx, 26, RULE_styleUrl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(STYLEURLS);
			setState(287);
			match(COLON);
			setState(288);
			match(OPEN_SQUARE);
			setState(289);
			match(BACKTICK);
			setState(290);
			stylesheet();
			setState(291);
			match(BACKTICK);
			setState(292);
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
		enterRule(_localctx, 28, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(EXPORT);
			setState(295);
			match(CLASS);
			setState(296);
			match(IDENTIFIER);
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS || _la==EXTENDS) {
				{
				setState(297);
				classInheritance();
				}
			}

			setState(300);
			match(OPEN_CURLY);
			setState(301);
			classBody();
			setState(302);
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
		enterRule(_localctx, 30, RULE_classInheritance);
		try {
			setState(306);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXTENDS:
				_localctx = new EXTENDSLABELContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				extendClause();
				}
				break;
			case IMPLEMENTS:
				_localctx = new IMPLEMITIONLABELContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
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
		enterRule(_localctx, 32, RULE_extendClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(EXTENDS);
			setState(309);
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
		enterRule(_localctx, 34, RULE_implementClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(IMPLEMENTS);
			setState(312);
			value();
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(313);
				match(COMMA);
				setState(314);
				match(IDENTIFIER);
				}
				}
				setState(319);
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
		public TerminalNode RETURN() { return getToken(AngularParser.RETURN, 0); }
		public TerminalNode OPEN_SQUARE() { return getToken(AngularParser.OPEN_SQUARE, 0); }
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public TerminalNode CLOSE_SQUARE() { return getToken(AngularParser.CLOSE_SQUARE, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(AngularParser.CLOSE_CURLY, 0); }
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
		enterRule(_localctx, 36, RULE_getproduct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(GET_PRODUCTS);
			setState(321);
			match(OPEN_PAREN);
			setState(322);
			match(CLOSE_PAREN);
			setState(323);
			match(OPEN_CURLY);
			setState(324);
			match(RETURN);
			setState(325);
			match(OPEN_SQUARE);
			setState(326);
			elementList();
			setState(327);
			match(CLOSE_SQUARE);
			setState(328);
			match(SEMICOLON);
			setState(329);
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
		enterRule(_localctx, 38, RULE_products);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(IDENTIFIER);
			setState(332);
			match(EQUALS);
			setState(333);
			match(OPEN_SQUARE);
			setState(334);
			elementList();
			setState(335);
			match(CLOSE_SQUARE);
			setState(336);
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
		enterRule(_localctx, 40, RULE_elementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			element();
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(339);
				match(COMMA);
				setState(340);
				element();
				}
				}
				setState(345);
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
		enterRule(_localctx, 42, RULE_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(OPEN_CURLY);
			setState(347);
			pair();
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(348);
				match(COMMA);
				setState(349);
				pair();
				}
				}
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(355);
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
		enterRule(_localctx, 44, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			basevalue();
			setState(358);
			match(COLON);
			setState(359);
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
		enterRule(_localctx, 46, RULE_value);
		try {
			setState(363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new BASEvalueLABELContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(361);
				basevalue();
				}
				break;
			case 2:
				_localctx = new ARRAYTAYPELABELContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(362);
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
		enterRule(_localctx, 48, RULE_basevalue);
		try {
			setState(372);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new IDENTIFIRELABELContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				match(IDENTIFIER);
				}
				break;
			case STRING:
				_localctx = new STRINGLABELContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
				match(STRING);
				}
				break;
			case NUMBER:
				_localctx = new NUMBERLABELContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(367);
				match(NUMBER);
				}
				break;
			case ANY:
				_localctx = new ANYLABELContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(368);
				match(ANY);
				}
				break;
			case VOID:
				_localctx = new VOIDLABELContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(369);
				match(VOID);
				}
				break;
			case ONINIT:
				_localctx = new ONINITLABELContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(370);
				match(ONINIT);
				}
				break;
			case NULL:
				_localctx = new NULLLABELContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(371);
				match(NULL);
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
		enterRule(_localctx, 50, RULE_classBody);
		int _la;
		try {
			_localctx = new ClassBodyLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << FUNICTION) | (1L << CONSOLE) | (1L << WHILE) | (1L << SWITCH) | (1L << LET) | (1L << CONST) | (1L << VAR) | (1L << IF) | (1L << CONSTRUCTOR) | (1L << SELECTPRODUCT) | (1L << NGONINIT) | (1L << THIS) | (1L << GET_PRODUCTS) | (1L << ONBUTTONCLICK) | (1L << RETURN) | (1L << OUTPUT) | (1L << OPEN_PAREN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (STRING - 70)) | (1L << (NUMBER - 70)) | (1L << (INTEGER - 70)) | (1L << (IDENTIFIER - 70)))) != 0)) {
				{
				setState(388);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(374);
					propertyDeclaration();
					}
					break;
				case 2:
					{
					setState(375);
					methodDeclaration();
					}
					break;
				case 3:
					{
					setState(376);
					constructor();
					}
					break;
				case 4:
					{
					setState(377);
					statement();
					}
					break;
				case 5:
					{
					setState(378);
					decorator();
					}
					break;
				case 6:
					{
					setState(379);
					ngOnInit();
					}
					break;
				case 7:
					{
					setState(380);
					selectProduct();
					}
					break;
				case 8:
					{
					setState(381);
					onbutton();
					}
					break;
				case 9:
					{
					setState(382);
					getproduct();
					}
					break;
				case 10:
					{
					setState(383);
					products();
					}
					break;
				case 11:
					{
					setState(384);
					lambdaExpression();
					}
					break;
				case 12:
					{
					setState(385);
					propertyAccess();
					}
					break;
				case 13:
					{
					setState(386);
					functionDeclaration();
					}
					break;
				case 14:
					{
					setState(387);
					whileStatement();
					}
					break;
				}
				}
				setState(392);
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

	public final PropertyDeclarationContext propertyDeclaration() throws RecognitionException {
		PropertyDeclarationContext _localctx = new PropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_propertyDeclaration);
		try {
			setState(396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new PROPIRTYLABELContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(393);
				regularProperty();
				}
				break;
			case 2:
				_localctx = new VARIBALLABELContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(394);
				letDeclaration();
				}
				break;
			case 3:
				_localctx = new DDDContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(395);
				emptyArrayDeclaration();
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
		enterRule(_localctx, 54, RULE_regularProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(IDENTIFIER);
			setState(399);
			match(COLON);
			setState(400);
			value();
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(401);
				match(EQUALS);
				setState(402);
				expression(0);
				}
			}

			setState(405);
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
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 56, RULE_letDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			typeVarible();
			setState(408);
			match(IDENTIFIER);
			setState(409);
			match(COLON);
			setState(410);
			value();
			setState(411);
			match(EQUALS);
			setState(412);
			value();
			setState(413);
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
		enterRule(_localctx, 58, RULE_typeVarible);
		try {
			setState(418);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
				_localctx = new LETTERMINALLABELContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(415);
				match(LET);
				}
				break;
			case VAR:
				_localctx = new VARTERMINALLABELContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(416);
				match(VAR);
				}
				break;
			case CONST:
				_localctx = new CONSTTERMINALLABELContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(417);
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
		enterRule(_localctx, 60, RULE_emptyArrayDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(IDENTIFIER);
			setState(421);
			match(COLON);
			setState(422);
			value();
			setState(423);
			match(OPEN_SQUARE);
			setState(424);
			match(CLOSE_SQUARE);
			setState(425);
			match(EQUALS);
			setState(426);
			match(OPEN_SQUARE);
			setState(427);
			match(CLOSE_SQUARE);
			setState(428);
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
		enterRule(_localctx, 62, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(CONSTRUCTOR);
			setState(431);
			match(OPEN_PAREN);
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 33)) & ~0x3f) == 0 && ((1L << (_la - 33)) & ((1L << (PRIVATE - 33)) | (1L << (PUBLIC - 33)) | (1L << (PROTECTED - 33)) | (1L << (IDENTIFIER - 33)))) != 0)) {
				{
				setState(432);
				parameter();
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(433);
					match(COMMA);
					setState(434);
					parameter();
					}
					}
					setState(439);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(442);
			match(CLOSE_PAREN);
			setState(443);
			match(OPEN_CURLY);
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << CONST) | (1L << VAR) | (1L << IF) | (1L << THIS) | (1L << RETURN) | (1L << OPEN_PAREN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (STRING - 70)) | (1L << (NUMBER - 70)) | (1L << (INTEGER - 70)) | (1L << (IDENTIFIER - 70)))) != 0)) {
				{
				{
				setState(444);
				statement();
				}
				}
				setState(449);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(450);
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
		public TerminalNode IN() { return getToken(AngularParser.IN, 0); }
		public List<TerminalNode> DOT() { return getTokens(AngularParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AngularParser.DOT, i);
		}
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLoopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_loopStatement);
		int _la;
		try {
			setState(505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(452);
				match(FOR);
				setState(453);
				match(OPEN_PAREN);
				setState(454);
				match(LET);
				setState(455);
				match(IDENTIFIER);
				setState(456);
				match(EQUALS);
				setState(457);
				expression(0);
				setState(458);
				match(SEMICOLON);
				setState(459);
				expression(0);
				setState(460);
				match(SEMICOLON);
				setState(461);
				match(IDENTIFIER);
				setState(462);
				_la = _input.LA(1);
				if ( !(_la==PLUS_PLUS || _la==MINUS_MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(463);
				match(CLOSE_PAREN);
				setState(464);
				match(OPEN_CURLY);
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << CONST) | (1L << VAR) | (1L << IF) | (1L << THIS) | (1L << RETURN) | (1L << OPEN_PAREN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (STRING - 70)) | (1L << (NUMBER - 70)) | (1L << (INTEGER - 70)) | (1L << (IDENTIFIER - 70)))) != 0)) {
					{
					{
					setState(465);
					statement();
					}
					}
					setState(470);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(471);
				match(CLOSE_CURLY);
				setState(481);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(472);
					match(ELSE);
					setState(473);
					match(OPEN_CURLY);
					setState(477);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << CONST) | (1L << VAR) | (1L << IF) | (1L << THIS) | (1L << RETURN) | (1L << OPEN_PAREN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (STRING - 70)) | (1L << (NUMBER - 70)) | (1L << (INTEGER - 70)) | (1L << (IDENTIFIER - 70)))) != 0)) {
						{
						{
						setState(474);
						statement();
						}
						}
						setState(479);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(480);
					match(CLOSE_CURLY);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(483);
				match(FOR);
				setState(484);
				match(OPEN_PAREN);
				setState(485);
				match(LET);
				setState(486);
				match(IDENTIFIER);
				setState(487);
				match(IN);
				setState(488);
				match(IDENTIFIER);
				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(489);
					match(DOT);
					setState(490);
					match(IDENTIFIER);
					}
					}
					setState(495);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(496);
				match(CLOSE_PAREN);
				setState(497);
				match(OPEN_CURLY);
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << CONST) | (1L << VAR) | (1L << IF) | (1L << THIS) | (1L << RETURN) | (1L << OPEN_PAREN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (STRING - 70)) | (1L << (NUMBER - 70)) | (1L << (INTEGER - 70)) | (1L << (IDENTIFIER - 70)))) != 0)) {
					{
					{
					setState(498);
					statement();
					}
					}
					setState(503);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(504);
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
		enterRule(_localctx, 66, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			match(WHILE);
			setState(508);
			match(OPEN_PAREN);
			setState(509);
			expression(0);
			setState(510);
			match(CLOSE_PAREN);
			setState(511);
			match(OPEN_CURLY);
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << CONST) | (1L << VAR) | (1L << IF) | (1L << THIS) | (1L << RETURN) | (1L << OPEN_PAREN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (STRING - 70)) | (1L << (NUMBER - 70)) | (1L << (INTEGER - 70)) | (1L << (IDENTIFIER - 70)))) != 0)) {
				{
				{
				setState(512);
				statement();
				}
				}
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(518);
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
		enterRule(_localctx, 68, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			match(SWITCH);
			setState(521);
			match(OPEN_PAREN);
			setState(522);
			expression(0);
			setState(523);
			match(CLOSE_PAREN);
			setState(524);
			match(OPEN_CURLY);
			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(525);
				caseClause();
				}
				}
				setState(530);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(531);
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
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
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
		enterRule(_localctx, 70, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			match(IF);
			setState(534);
			match(OPEN_PAREN);
			setState(535);
			equalityExpression();
			setState(536);
			match(CLOSE_PAREN);
			setState(537);
			match(OPEN_CURLY);
			setState(541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << CONST) | (1L << VAR) | (1L << IF) | (1L << THIS) | (1L << RETURN) | (1L << OPEN_PAREN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (STRING - 70)) | (1L << (NUMBER - 70)) | (1L << (INTEGER - 70)) | (1L << (IDENTIFIER - 70)))) != 0)) {
				{
				{
				setState(538);
				statement();
				}
				}
				setState(543);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(544);
			match(CLOSE_CURLY);
			setState(554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(545);
				match(ELSE);
				setState(546);
				match(OPEN_CURLY);
				setState(550);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << CONST) | (1L << VAR) | (1L << IF) | (1L << THIS) | (1L << RETURN) | (1L << OPEN_PAREN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (STRING - 70)) | (1L << (NUMBER - 70)) | (1L << (INTEGER - 70)) | (1L << (IDENTIFIER - 70)))) != 0)) {
					{
					{
					setState(547);
					statement();
					}
					}
					setState(552);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(553);
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
		enterRule(_localctx, 72, RULE_equalityExpression);
		try {
			setState(575);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				_localctx = new StrictEqualityContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(556);
				expression(0);
				setState(557);
				match(EQUALS);
				setState(558);
				match(EQUALS);
				setState(559);
				match(EQUALS);
				setState(560);
				expression(0);
				}
				break;
			case 2:
				_localctx = new LooseEqualityContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(562);
				expression(0);
				setState(563);
				match(EQUALS);
				setState(564);
				match(EQUALS);
				setState(565);
				expression(0);
				}
				break;
			case 3:
				_localctx = new NotEqualityContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(567);
				expression(0);
				setState(568);
				match(NOT_EQUAL);
				setState(569);
				expression(0);
				}
				break;
			case 4:
				_localctx = new StrictNotEqualityContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(571);
				expression(0);
				setState(572);
				match(STRICT_NOT_EQUAL);
				setState(573);
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
		enterRule(_localctx, 74, RULE_caseClause);
		int _la;
		try {
			setState(594);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(577);
				match(CASE);
				setState(578);
				expression(0);
				setState(579);
				match(COLON);
				setState(583);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << CONST) | (1L << VAR) | (1L << IF) | (1L << THIS) | (1L << RETURN) | (1L << OPEN_PAREN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (STRING - 70)) | (1L << (NUMBER - 70)) | (1L << (INTEGER - 70)) | (1L << (IDENTIFIER - 70)))) != 0)) {
					{
					{
					setState(580);
					statement();
					}
					}
					setState(585);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(586);
				match(DEFAULT);
				setState(587);
				match(COLON);
				setState(591);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << CONST) | (1L << VAR) | (1L << IF) | (1L << THIS) | (1L << RETURN) | (1L << OPEN_PAREN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (STRING - 70)) | (1L << (NUMBER - 70)) | (1L << (INTEGER - 70)) | (1L << (IDENTIFIER - 70)))) != 0)) {
					{
					{
					setState(588);
					statement();
					}
					}
					setState(593);
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
		enterRule(_localctx, 76, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			match(FUNICTION);
			setState(597);
			match(IDENTIFIER);
			setState(598);
			match(OPEN_PAREN);
			setState(600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(599);
				parameterList();
				}
			}

			setState(602);
			match(CLOSE_PAREN);
			setState(603);
			match(COLON);
			setState(604);
			value();
			setState(605);
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
		enterRule(_localctx, 78, RULE_functionB);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			match(OPEN_CURLY);
			setState(611);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << CONST) | (1L << VAR) | (1L << IF) | (1L << THIS) | (1L << RETURN) | (1L << OPEN_PAREN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (STRING - 70)) | (1L << (NUMBER - 70)) | (1L << (INTEGER - 70)) | (1L << (IDENTIFIER - 70)))) != 0)) {
				{
				{
				setState(608);
				statement();
				}
				}
				setState(613);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(614);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 80, RULE_propertystatment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			match(CONSOLE);
			setState(617);
			match(DOT);
			setState(618);
			match(LOG);
			setState(619);
			match(OPEN_PAREN);
			setState(620);
			expression(0);
			setState(621);
			match(CLOSE_PAREN);
			setState(622);
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
		enterRule(_localctx, 82, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			match(IDENTIFIER);
			setState(625);
			match(OPEN_PAREN);
			setState(626);
			parameter();
			setState(631);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(627);
				match(COMMA);
				setState(628);
				parameter();
				}
				}
				setState(633);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(634);
			match(CLOSE_PAREN);
			setState(635);
			match(COLON);
			setState(636);
			value();
			setState(637);
			match(OPEN_CURLY);
			setState(641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << CONST) | (1L << VAR) | (1L << IF) | (1L << THIS) | (1L << RETURN) | (1L << OPEN_PAREN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (STRING - 70)) | (1L << (NUMBER - 70)) | (1L << (INTEGER - 70)) | (1L << (IDENTIFIER - 70)))) != 0)) {
				{
				{
				setState(638);
				statement();
				}
				}
				setState(643);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(644);
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
		enterRule(_localctx, 84, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PUBLIC) | (1L << PROTECTED))) != 0)) {
				{
				setState(646);
				modifiers();
				}
			}

			setState(649);
			match(IDENTIFIER);
			setState(650);
			match(COLON);
			setState(651);
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
		public TerminalNode PRIVATE() { return getToken(AngularParser.PRIVATE, 0); }
		public TerminalNode PUBLIC() { return getToken(AngularParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(AngularParser.PROTECTED, 0); }
		public ModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifiersContext modifiers() throws RecognitionException {
		ModifiersContext _localctx = new ModifiersContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_modifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PUBLIC) | (1L << PROTECTED))) != 0)) ) {
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

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_statement);
		try {
			setState(677);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				_localctx = new LABELED_STATEMENTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(655);
				match(IDENTIFIER);
				setState(656);
				match(COLON);
				setState(657);
				statement();
				}
				break;
			case 2:
				_localctx = new EXPRESSION_STATEMENTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(658);
				expression(0);
				setState(659);
				match(SEMICOLON);
				}
				break;
			case 3:
				_localctx = new IF_STATEMENTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(661);
				ifStatement();
				}
				break;
			case 4:
				_localctx = new LOOP_STATEMENTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(662);
				loopStatement();
				}
				break;
			case 5:
				_localctx = new SWITCH_STATEMENTContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(663);
				switchStatement();
				}
				break;
			case 6:
				_localctx = new METHOD_DECLARATION_STATEMENTContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(664);
				methodDeclaration();
				}
				break;
			case 7:
				_localctx = new PROPERTY_DECLARATION_STATEMENTContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(665);
				propertyDeclaration();
				}
				break;
			case 8:
				_localctx = new FUNCTION_CALL_STATEMENTContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(666);
				functionCall();
				setState(667);
				match(SEMICOLON);
				}
				break;
			case 9:
				_localctx = new ASSIGNMENT_STATEMENTContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(669);
				match(IDENTIFIER);
				setState(670);
				match(EQUALS);
				setState(671);
				expression(0);
				setState(672);
				match(SEMICOLON);
				}
				break;
			case 10:
				_localctx = new RETURN_STATEMENTContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(674);
				returnStatement();
				}
				break;
			case 11:
				_localctx = new PROPERTY_ACCESS_STATEMENTContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(675);
				propertyAccess();
				}
				break;
			case 12:
				_localctx = new CONSOLE_STATEMENTContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(676);
				propertystatment();
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

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 90;
		enterRecursionRule(_localctx, 90, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				_localctx = new FUNCTIONCALLLABELContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(680);
				functionCall();
				}
				break;
			case 2:
				{
				_localctx = new EXPPROContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(681);
				propertyAccess();
				}
				break;
			case 3:
				{
				_localctx = new EXPPARENContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(682);
				match(OPEN_PAREN);
				setState(683);
				expression(0);
				setState(684);
				match(CLOSE_PAREN);
				}
				break;
			case 4:
				{
				_localctx = new EXPIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(686);
				match(IDENTIFIER);
				}
				break;
			case 5:
				{
				_localctx = new EXPSTRINGContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(687);
				match(STRING);
				}
				break;
			case 6:
				{
				_localctx = new EXPNUMBERContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(688);
				match(NUMBER);
				}
				break;
			case 7:
				{
				_localctx = new EXPINTEGERContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(689);
				match(INTEGER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(722);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(720);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
					case 1:
						{
						_localctx = new EXPPLUSContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(692);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(693);
						match(PLUS);
						setState(694);
						expression(18);
						}
						break;
					case 2:
						{
						_localctx = new EXPMINUSContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(695);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(696);
						match(MINUS);
						setState(697);
						expression(17);
						}
						break;
					case 3:
						{
						_localctx = new EXPEQUALSContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(698);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(699);
						match(EQUALS);
						setState(700);
						expression(16);
						}
						break;
					case 4:
						{
						_localctx = new EXPLESSContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(701);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(702);
						match(LESS_THAN);
						setState(703);
						expression(15);
						}
						break;
					case 5:
						{
						_localctx = new EXPGREATERContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(704);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(705);
						match(GREATER_THAN);
						setState(706);
						expression(14);
						}
						break;
					case 6:
						{
						_localctx = new EXPSTARContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(707);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(708);
						match(STAR);
						setState(709);
						expression(13);
						}
						break;
					case 7:
						{
						_localctx = new EXPDIVIDEContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(710);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(711);
						match(DIVIDE);
						setState(712);
						expression(12);
						}
						break;
					case 8:
						{
						_localctx = new EXPMODContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(713);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(714);
						match(MOD);
						setState(715);
						expression(11);
						}
						break;
					case 9:
						{
						_localctx = new EXPPLUSPLUSContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(716);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(717);
						match(PLUS_PLUS);
						}
						break;
					case 10:
						{
						_localctx = new EXPMINMINContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(718);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(719);
						match(MINUS_MINUS);
						}
						break;
					}
					} 
				}
				setState(724);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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
		enterRule(_localctx, 92, RULE_propertyAccess);
		try {
			setState(728);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				_localctx = new CALFUNLABELContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(725);
				calfun();
				}
				break;
			case 2:
				_localctx = new IDDOTLABELContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(726);
				iddot();
				}
				break;
			case 3:
				_localctx = new FUNCTHISLABELContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(727);
				functhis();
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
		enterRule(_localctx, 94, RULE_calfun);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(730);
			match(THIS);
			setState(731);
			match(DOT);
			setState(732);
			match(IDENTIFIER);
			setState(737);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(733);
					match(DOT);
					setState(734);
					match(IDENTIFIER);
					}
					} 
				}
				setState(739);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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
		enterRule(_localctx, 96, RULE_iddot);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
			match(IDENTIFIER);
			setState(743); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(741);
					match(DOT);
					setState(742);
					match(IDENTIFIER);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(745); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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
		enterRule(_localctx, 98, RULE_functhis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			match(THIS);
			setState(748);
			match(DOT);
			setState(749);
			match(IDENTIFIER);
			setState(750);
			match(DOT);
			setState(751);
			match(GET_PRODUCTS);
			setState(752);
			match(OPEN_PAREN);
			setState(753);
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
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 100, RULE_functionCall);
		int _la;
		try {
			setState(794);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(755);
				propertyAccess();
				setState(756);
				match(OPEN_PAREN);
				setState(765);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (THIS - 31)) | (1L << (OPEN_PAREN - 31)) | (1L << (STRING - 31)) | (1L << (NUMBER - 31)) | (1L << (INTEGER - 31)) | (1L << (IDENTIFIER - 31)))) != 0)) {
					{
					setState(757);
					expression(0);
					setState(762);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(758);
						match(COMMA);
						setState(759);
						expression(0);
						}
						}
						setState(764);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(767);
				match(CLOSE_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(769);
				match(IDENTIFIER);
				setState(770);
				match(OPEN_PAREN);
				setState(779);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (THIS - 31)) | (1L << (OPEN_PAREN - 31)) | (1L << (STRING - 31)) | (1L << (NUMBER - 31)) | (1L << (INTEGER - 31)) | (1L << (IDENTIFIER - 31)))) != 0)) {
					{
					setState(771);
					expression(0);
					setState(776);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(772);
						match(COMMA);
						setState(773);
						expression(0);
						}
						}
						setState(778);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(781);
				match(CLOSE_PAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(782);
				propertyAccess();
				setState(783);
				match(OPEN_PAREN);
				setState(785);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (THIS - 31)) | (1L << (OPEN_PAREN - 31)) | (1L << (STRING - 31)) | (1L << (NUMBER - 31)) | (1L << (INTEGER - 31)) | (1L << (IDENTIFIER - 31)))) != 0)) {
					{
					setState(784);
					argumentList();
					}
				}

				setState(787);
				match(CLOSE_PAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(789);
				propertyAccess();
				setState(790);
				match(OPEN_PAREN);
				setState(791);
				match(CLOSE_PAREN);
				setState(792);
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
		enterRule(_localctx, 102, RULE_selectProduct);
		int _la;
		try {
			_localctx = new SELECTPRODUCTLABELContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			match(SELECTPRODUCT);
			setState(797);
			match(OPEN_PAREN);
			setState(798);
			parameter();
			setState(803);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(799);
				match(COMMA);
				setState(800);
				parameter();
				}
				}
				setState(805);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(806);
			match(CLOSE_PAREN);
			setState(809);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(807);
				match(COLON);
				setState(808);
				match(VOID);
				}
			}

			setState(811);
			match(OPEN_CURLY);
			setState(815);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << CONST) | (1L << VAR) | (1L << IF) | (1L << THIS) | (1L << RETURN) | (1L << OPEN_PAREN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (STRING - 70)) | (1L << (NUMBER - 70)) | (1L << (INTEGER - 70)) | (1L << (IDENTIFIER - 70)))) != 0)) {
				{
				{
				setState(812);
				statement();
				}
				}
				setState(817);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(818);
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
		enterRule(_localctx, 104, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(820);
			expression(0);
			setState(825);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(821);
				match(COMMA);
				setState(822);
				expression(0);
				}
				}
				setState(827);
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
		enterRule(_localctx, 106, RULE_arrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
			match(OPEN_SQUARE);
			setState(837);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (THIS - 31)) | (1L << (OPEN_PAREN - 31)) | (1L << (STRING - 31)) | (1L << (NUMBER - 31)) | (1L << (INTEGER - 31)) | (1L << (IDENTIFIER - 31)))) != 0)) {
				{
				setState(829);
				expression(0);
				setState(834);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(830);
					match(COMMA);
					setState(831);
					expression(0);
					}
					}
					setState(836);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(839);
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
		enterRule(_localctx, 108, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(841);
				match(EXPORT);
				}
			}

			setState(844);
			match(INTERFACE);
			setState(845);
			match(IDENTIFIER);
			setState(846);
			match(OPEN_CURLY);
			setState(847);
			interfaceBody();
			setState(848);
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
		enterRule(_localctx, 110, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(853);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(850);
				interfaceMember();
				}
				}
				setState(855);
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
		enterRule(_localctx, 112, RULE_interfaceMember);
		try {
			setState(858);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(856);
				propertySignature();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(857);
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
		enterRule(_localctx, 114, RULE_propertySignature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(860);
			match(IDENTIFIER);
			setState(861);
			match(COLON);
			setState(862);
			value();
			setState(863);
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
		enterRule(_localctx, 116, RULE_methodSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(865);
			match(IDENTIFIER);
			setState(866);
			match(OPEN_PAREN);
			setState(868);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(867);
				parameterList();
				}
			}

			setState(870);
			match(CLOSE_PAREN);
			setState(871);
			match(COLON);
			setState(872);
			value();
			setState(873);
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
		enterRule(_localctx, 118, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(875);
			parameter2();
			setState(880);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(876);
				match(COMMA);
				setState(877);
				parameter2();
				}
				}
				setState(882);
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
		enterRule(_localctx, 120, RULE_parameter2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(883);
			match(IDENTIFIER);
			setState(884);
			match(COLON);
			setState(885);
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
		enterRule(_localctx, 122, RULE_onbutton);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(887);
			match(ONBUTTONCLICK);
			setState(888);
			match(OPEN_PAREN);
			setState(889);
			match(CLOSE_PAREN);
			setState(890);
			match(OPEN_CURLY);
			setState(891);
			basevalue();
			setState(892);
			match(OPEN_PAREN);
			setState(893);
			expression(0);
			setState(894);
			match(CLOSE_PAREN);
			setState(895);
			match(SEMICOLON);
			setState(896);
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
		enterRule(_localctx, 124, RULE_arrayvalue);
		try {
			setState(907);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANY:
			case VOID:
			case ONINIT:
			case STRING:
			case NUMBER:
			case IDENTIFIER:
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(898);
				basevalue();
				setState(899);
				match(OPEN_SQUARE);
				setState(900);
				match(CLOSE_SQUARE);
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 2);
				{
				setState(902);
				match(ARRAY);
				setState(903);
				match(LESS_THAN);
				setState(904);
				basevalue();
				setState(905);
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
		enterRule(_localctx, 126, RULE_decorator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(909);
			match(OUTPUT);
			setState(910);
			match(OPEN_PAREN);
			setState(911);
			match(CLOSE_PAREN);
			setState(912);
			propertyAssignment();
			setState(913);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public TerminalNode NEW() { return getToken(AngularParser.NEW, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public TerminalNode LESS_THAN() { return getToken(AngularParser.LESS_THAN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode GREATER_THAN() { return getToken(AngularParser.GREATER_THAN, 0); }
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
		enterRule(_localctx, 128, RULE_propertyAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(915);
			match(IDENTIFIER);
			setState(916);
			match(EQUALS);
			setState(917);
			match(NEW);
			setState(918);
			match(IDENTIFIER);
			setState(923);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(919);
				match(LESS_THAN);
				setState(920);
				value();
				setState(921);
				match(GREATER_THAN);
				}
			}

			setState(925);
			match(OPEN_PAREN);
			setState(926);
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
		enterRule(_localctx, 130, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(928);
			expression(0);
			setState(933);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(929);
				match(COMMA);
				setState(930);
				expression(0);
				}
				}
				setState(935);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 132, RULE_ngOnInit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(936);
			match(NGONINIT);
			setState(937);
			match(OPEN_PAREN);
			setState(938);
			match(CLOSE_PAREN);
			setState(939);
			match(COLON);
			setState(940);
			match(VOID);
			setState(941);
			match(OPEN_CURLY);
			{
			setState(942);
			expression(0);
			setState(943);
			match(SEMICOLON);
			}
			setState(945);
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

	public static class LambdaExpressionContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public TerminalNode ARROW() { return getToken(AngularParser.ARROW, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLambdaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLambdaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLambdaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_lambdaExpression);
		int _la;
		try {
			setState(961);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(947);
				match(IDENTIFIER);
				setState(948);
				match(EQUALS);
				setState(949);
				match(OPEN_PAREN);
				setState(950);
				match(IDENTIFIER);
				setState(951);
				match(CLOSE_PAREN);
				setState(952);
				match(ARROW);
				setState(953);
				functionBody();
				}
				break;
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(954);
				match(OPEN_PAREN);
				setState(956);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(955);
					parameterList();
					}
				}

				setState(958);
				match(CLOSE_PAREN);
				setState(959);
				match(ARROW);
				setState(960);
				functionBody();
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
		enterRule(_localctx, 136, RULE_functionBody);
		int _la;
		try {
			setState(972);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
			case OPEN_PAREN:
			case STRING:
			case NUMBER:
			case INTEGER:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(963);
				expression(0);
				}
				break;
			case OPEN_CURLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(964);
				match(OPEN_CURLY);
				setState(968);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << CONST) | (1L << VAR) | (1L << IF) | (1L << THIS) | (1L << RETURN) | (1L << OPEN_PAREN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (STRING - 70)) | (1L << (NUMBER - 70)) | (1L << (INTEGER - 70)) | (1L << (IDENTIFIER - 70)))) != 0)) {
					{
					{
					setState(965);
					statement();
					}
					}
					setState(970);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(971);
				match(CLOSE_CURLY);
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
		enterRule(_localctx, 138, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(974);
			match(RETURN);
			setState(977);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(975);
				expressionList();
				}
				break;
			case 2:
				{
				setState(976);
				expression(0);
				}
				break;
			}
			setState(979);
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
		enterRule(_localctx, 140, RULE_htmlElement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(982); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(981);
					htmlElementassist();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(984); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
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
		enterRule(_localctx, 142, RULE_htmlElementassist);
		try {
			setState(990);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				_localctx = new STANDERHTMLELEMNTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(986);
				standardHtmlElement();
				}
				break;
			case 2:
				_localctx = new SELFCLOSEHTMLELEMNTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(987);
				selfClosingHtmlElement();
				}
				break;
			case 3:
				_localctx = new FIXEDHTMLELEMNTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(988);
				fixedHtmlElement();
				}
				break;
			case 4:
				_localctx = new ANGULARBUTTONLABELContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(989);
				angularButton();
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

	public static class StandardHtmlElementContext extends ParserRuleContext {
		public OpentagContext opentag() {
			return getRuleContext(OpentagContext.class,0);
		}
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
		enterRule(_localctx, 144, RULE_standardHtmlElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(992);
			opentag();
			setState(996);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (OPEN_SQUARE - 54)) | (1L << (OPEN_PAREN - 54)) | (1L << (IDENTIFIER - 54)) | (1L << (LESS_THAN - 54)) | (1L << (NG - 54)) | (1L << (NI - 54)))) != 0)) {
				{
				{
				setState(993);
				htmlAttribute();
				}
				}
				setState(998);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(999);
			match(GREATER_THAN);
			setState(1003);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (OPEN_DOUBLE_CURLY - 52)) | (1L << (COLON - 52)) | (1L << (STRING - 52)) | (1L << (WS - 52)) | (1L << (LESS_THAN - 52)) | (1L << (LS - 52)) | (1L << (ARABIC_TEXT - 52)))) != 0)) {
				{
				{
				setState(1000);
				htmlContent();
				}
				}
				setState(1005);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1006);
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
		public OpentagContext opentag() {
			return getRuleContext(OpentagContext.class,0);
		}
		public TerminalNode HHH() { return getToken(AngularParser.HHH, 0); }
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
		enterRule(_localctx, 146, RULE_selfClosingHtmlElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1008);
			opentag();
			setState(1012);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (OPEN_SQUARE - 54)) | (1L << (OPEN_PAREN - 54)) | (1L << (IDENTIFIER - 54)) | (1L << (LESS_THAN - 54)) | (1L << (NG - 54)) | (1L << (NI - 54)))) != 0)) {
				{
				{
				setState(1009);
				htmlAttribute();
				}
				}
				setState(1014);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1015);
			match(HHH);
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
		enterRule(_localctx, 148, RULE_fixedHtmlElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1017);
			fixedtqg();
			setState(1021);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (OPEN_SQUARE - 54)) | (1L << (OPEN_PAREN - 54)) | (1L << (IDENTIFIER - 54)) | (1L << (LESS_THAN - 54)) | (1L << (NG - 54)) | (1L << (NI - 54)))) != 0)) {
				{
				{
				setState(1018);
				htmlAttribute();
				}
				}
				setState(1023);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1024);
			match(GREATER_THAN);
			setState(1028);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (OPEN_DOUBLE_CURLY - 52)) | (1L << (COLON - 52)) | (1L << (STRING - 52)) | (1L << (WS - 52)) | (1L << (LESS_THAN - 52)) | (1L << (LS - 52)) | (1L << (ARABIC_TEXT - 52)))) != 0)) {
				{
				{
				setState(1025);
				htmlContent();
				}
				}
				setState(1030);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1031);
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
		enterRule(_localctx, 150, RULE_angularButton);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1033);
			match(LESS_THAN);
			setState(1034);
			match(BUTTON);
			setState(1038);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (OPEN_SQUARE - 54)) | (1L << (OPEN_PAREN - 54)) | (1L << (IDENTIFIER - 54)) | (1L << (LESS_THAN - 54)) | (1L << (NG - 54)) | (1L << (NI - 54)))) != 0)) {
				{
				{
				setState(1035);
				htmlAttribute();
				}
				}
				setState(1040);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1041);
			match(GREATER_THAN);
			setState(1045);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (OPEN_DOUBLE_CURLY - 52)) | (1L << (COLON - 52)) | (1L << (STRING - 52)) | (1L << (WS - 52)) | (1L << (LESS_THAN - 52)) | (1L << (LS - 52)) | (1L << (ARABIC_TEXT - 52)))) != 0)) {
				{
				{
				setState(1042);
				htmlContent();
				}
				}
				setState(1047);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1048);
			match(GG);
			setState(1049);
			match(BUTTON);
			setState(1050);
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
		enterRule(_localctx, 152, RULE_opentag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1052);
			match(LESS_THAN);
			setState(1053);
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
		enterRule(_localctx, 154, RULE_closetag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1055);
			match(GG);
			setState(1056);
			match(IDENTIFIER);
			setState(1057);
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

	public static class FixedtqgContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(AngularParser.LESS_THAN, 0); }
		public TerminalNode FIXEDTAGNAME() { return getToken(AngularParser.FIXEDTAGNAME, 0); }
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
		enterRule(_localctx, 156, RULE_fixedtqg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1059);
			match(LESS_THAN);
			setState(1060);
			match(FIXEDTAGNAME);
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
		public TerminalNode FIXEDTAGNAME() { return getToken(AngularParser.FIXEDTAGNAME, 0); }
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
		enterRule(_localctx, 158, RULE_closefixedtag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1062);
			match(GG);
			setState(1063);
			match(FIXEDTAGNAME);
			setState(1064);
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
	public static class EMPTYPROPERTYBINDINGATTRIBUTEContext extends HtmlAttributeContext {
		public TerminalNode OPEN_SQUARE() { return getToken(AngularParser.OPEN_SQUARE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode CLOSE_SQUARE() { return getToken(AngularParser.CLOSE_SQUARE, 0); }
		public EMPTYPROPERTYBINDINGATTRIBUTEContext(HtmlAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEMPTYPROPERTYBINDINGATTRIBUTE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEMPTYPROPERTYBINDINGATTRIBUTE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEMPTYPROPERTYBINDINGATTRIBUTE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NORMALATTRIBUTEContext extends HtmlAttributeContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public NORMALATTRIBUTEContext(HtmlAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNORMALATTRIBUTE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNORMALATTRIBUTE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNORMALATTRIBUTE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SIMPLEATTRIBUTEContext extends HtmlAttributeContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public SIMPLEATTRIBUTEContext(HtmlAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSIMPLEATTRIBUTE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSIMPLEATTRIBUTE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSIMPLEATTRIBUTE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EVENTATTRIBUTEContext extends HtmlAttributeContext {
		public EventBindingContext eventBinding() {
			return getRuleContext(EventBindingContext.class,0);
		}
		public EVENTATTRIBUTEContext(HtmlAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEVENTATTRIBUTE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEVENTATTRIBUTE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEVENTATTRIBUTE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ANGULARBUTTONATTRIBUTEContext extends HtmlAttributeContext {
		public AngularButtonContext angularButton() {
			return getRuleContext(AngularButtonContext.class,0);
		}
		public ANGULARBUTTONATTRIBUTEContext(HtmlAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterANGULARBUTTONATTRIBUTE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitANGULARBUTTONATTRIBUTE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitANGULARBUTTONATTRIBUTE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EVENTBINDINGATTRIBUTEContext extends HtmlAttributeContext {
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EVENTBINDINGATTRIBUTEContext(HtmlAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEVENTBINDINGATTRIBUTE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEVENTBINDINGATTRIBUTE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEVENTBINDINGATTRIBUTE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NGFORATTRIBUTEContext extends HtmlAttributeContext {
		public NgforContext ngfor() {
			return getRuleContext(NgforContext.class,0);
		}
		public NGFORATTRIBUTEContext(HtmlAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNGFORATTRIBUTE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNGFORATTRIBUTE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNGFORATTRIBUTE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NGIFATTRIBUTEContext extends HtmlAttributeContext {
		public NgIfContext ngIf() {
			return getRuleContext(NgIfContext.class,0);
		}
		public NGIFATTRIBUTEContext(HtmlAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNGIFATTRIBUTE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNGIFATTRIBUTE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNGIFATTRIBUTE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PROPERTYBINDINGATTRIBUTEContext extends HtmlAttributeContext {
		public TerminalNode OPEN_SQUARE() { return getToken(AngularParser.OPEN_SQUARE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode CLOSE_SQUARE() { return getToken(AngularParser.CLOSE_SQUARE, 0); }
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PROPERTYBINDINGATTRIBUTEContext(HtmlAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPROPERTYBINDINGATTRIBUTE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPROPERTYBINDINGATTRIBUTE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPROPERTYBINDINGATTRIBUTE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeContext htmlAttribute() throws RecognitionException {
		HtmlAttributeContext _localctx = new HtmlAttributeContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_htmlAttribute);
		try {
			setState(1087);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				_localctx = new NORMALATTRIBUTEContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1066);
				match(IDENTIFIER);
				setState(1067);
				match(EQUALS);
				setState(1068);
				match(STRING);
				}
				break;
			case 2:
				_localctx = new SIMPLEATTRIBUTEContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1069);
				match(IDENTIFIER);
				}
				break;
			case 3:
				_localctx = new NGFORATTRIBUTEContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1070);
				ngfor();
				}
				break;
			case 4:
				_localctx = new NGIFATTRIBUTEContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1071);
				ngIf();
				}
				break;
			case 5:
				_localctx = new EVENTATTRIBUTEContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1072);
				eventBinding();
				}
				break;
			case 6:
				_localctx = new ANGULARBUTTONATTRIBUTEContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1073);
				angularButton();
				}
				break;
			case 7:
				_localctx = new PROPERTYBINDINGATTRIBUTEContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1074);
				match(OPEN_SQUARE);
				setState(1075);
				match(IDENTIFIER);
				setState(1076);
				match(CLOSE_SQUARE);
				setState(1077);
				match(EQUALS);
				setState(1078);
				expression(0);
				}
				break;
			case 8:
				_localctx = new EVENTBINDINGATTRIBUTEContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1079);
				match(OPEN_PAREN);
				setState(1080);
				match(IDENTIFIER);
				setState(1081);
				match(CLOSE_PAREN);
				setState(1082);
				match(EQUALS);
				setState(1083);
				expression(0);
				}
				break;
			case 9:
				_localctx = new EMPTYPROPERTYBINDINGATTRIBUTEContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1084);
				match(OPEN_SQUARE);
				setState(1085);
				match(IDENTIFIER);
				setState(1086);
				match(CLOSE_SQUARE);
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
		enterRule(_localctx, 162, RULE_ngIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1089);
			match(NI);
			setState(1090);
			match(EQUALS);
			setState(1091);
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
		enterRule(_localctx, 164, RULE_ngfor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1093);
			match(NG);
			setState(1094);
			match(EQUALS);
			setState(1095);
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
		enterRule(_localctx, 166, RULE_htmlContent);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1100); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(1100);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LESS_THAN:
						{
						setState(1097);
						htmlElement();
						}
						break;
					case COLON:
					case STRING:
					case WS:
					case LS:
					case ARABIC_TEXT:
						{
						setState(1098);
						textNode();
						}
						break;
					case OPEN_DOUBLE_CURLY:
						{
						setState(1099);
						interp();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1102); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
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
		enterRule(_localctx, 168, RULE_interp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1104);
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
		enterRule(_localctx, 170, RULE_identifierChain);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1106);
			match(OPEN_DOUBLE_CURLY);
			setState(1107);
			match(IDENTIFIER);
			setState(1112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(1108);
				match(DOT);
				setState(1109);
				match(IDENTIFIER);
				}
				}
				setState(1114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1115);
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
		enterRule(_localctx, 172, RULE_eventBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1117);
			match(OPEN_PAREN);
			setState(1118);
			match(IDENTIFIER);
			setState(1119);
			match(CLOSE_PAREN);
			setState(1120);
			match(EQUALS);
			setState(1121);
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
		enterRule(_localctx, 174, RULE_textNode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1123);
			_la = _input.LA(1);
			if ( !(((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (COLON - 58)) | (1L << (STRING - 58)) | (1L << (WS - 58)) | (1L << (LS - 58)) | (1L << (ARABIC_TEXT - 58)))) != 0)) ) {
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
		enterRule(_localctx, 176, RULE_stylesheet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1126); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1125);
				ruleSet();
				}
				}
				setState(1128); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==HASH || _la==DOT );
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
		enterRule(_localctx, 178, RULE_ruleSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1130);
			selector1();
			setState(1131);
			match(OPEN_CURLY);
			setState(1133); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1132);
				declaration();
				}
				}
				setState(1135); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(1137);
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
		public ClassSelectorContext classSelector() {
			return getRuleContext(ClassSelectorContext.class,0);
		}
		public IdSelectorContext idSelector() {
			return getRuleContext(IdSelectorContext.class,0);
		}
		public PseudoClassSelectorContext pseudoClassSelector() {
			return getRuleContext(PseudoClassSelectorContext.class,0);
		}
		public Selector1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSelector1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSelector1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSelector1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Selector1Context selector1() throws RecognitionException {
		Selector1Context _localctx = new Selector1Context(_ctx, getState());
		enterRule(_localctx, 180, RULE_selector1);
		try {
			setState(1142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1139);
				classSelector();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1140);
				idSelector();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1141);
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
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 182, RULE_classSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1144);
			match(DOT);
			setState(1145);
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
		enterRule(_localctx, 184, RULE_idSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1147);
			match(HASH);
			setState(1148);
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
		enterRule(_localctx, 186, RULE_pseudoClassSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1150);
			classSelector();
			setState(1151);
			match(COLON);
			setState(1152);
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
		enterRule(_localctx, 188, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1154);
			property();
			setState(1155);
			match(COLON);
			setState(1156);
			value1();
			setState(1157);
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
		enterRule(_localctx, 190, RULE_property);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1159);
			match(IDENTIFIER);
			setState(1164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MINUS) {
				{
				{
				setState(1160);
				match(MINUS);
				setState(1161);
				match(IDENTIFIER);
				}
				}
				setState(1166);
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
		public TerminalNode NUMBER() { return getToken(AngularParser.NUMBER, 0); }
		public TerminalNode UNIT() { return getToken(AngularParser.UNIT, 0); }
		public TerminalNode COLOR() { return getToken(AngularParser.COLOR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public CssFunctionContext cssFunction() {
			return getRuleContext(CssFunctionContext.class,0);
		}
		public Value1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterValue1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitValue1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitValue1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value1Context value1() throws RecognitionException {
		Value1Context _localctx = new Value1Context(_ctx, getState());
		enterRule(_localctx, 192, RULE_value1);
		int _la;
		try {
			setState(1175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1167);
				match(NUMBER);
				setState(1169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNIT) {
					{
					setState(1168);
					match(UNIT);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1171);
				match(COLOR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1172);
				match(IDENTIFIER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1173);
				match(STRING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1174);
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
		enterRule(_localctx, 194, RULE_cssFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1177);
			match(IDENTIFIER);
			setState(1178);
			match(OPEN_PAREN);
			setState(1179);
			value1();
			setState(1180);
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
		case 45:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 17);
		case 1:
			return precpred(_ctx, 16);
		case 2:
			return precpred(_ctx, 15);
		case 3:
			return precpred(_ctx, 14);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 12);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 10);
		case 8:
			return precpred(_ctx, 7);
		case 9:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001a\u049f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0002"+
		"P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007T\u0002"+
		"U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007Y\u0002"+
		"Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007^\u0002"+
		"_\u0007_\u0002`\u0007`\u0002a\u0007a\u0001\u0000\u0005\u0000\u00c6\b\u0000"+
		"\n\u0000\f\u0000\u00c9\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u00d1\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u00d8\b\u0002\n"+
		"\u0002\f\u0002\u00db\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0003\u0006\u00f3\b\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00f7"+
		"\b\u0006\n\u0006\f\u0006\u00fa\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0102\b\u0007\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0005\f\u0118\b\f\n\f\f\f\u011b\t\f\u0001\f"+
		"\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u012b\b"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u0133\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u013c\b\u0011\n"+
		"\u0011\f\u0011\u013f\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0005"+
		"\u0014\u0156\b\u0014\n\u0014\f\u0014\u0159\t\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0005\u0015\u015f\b\u0015\n\u0015\f\u0015\u0162"+
		"\t\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0003\u0017\u016c\b\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u0175\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0185\b\u0019\n"+
		"\u0019\f\u0019\u0188\t\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0003"+
		"\u001a\u018d\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0003\u001b\u0194\b\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u01a3\b\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u01b4\b\u001f\n\u001f\f\u001f"+
		"\u01b7\t\u001f\u0003\u001f\u01b9\b\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0005\u001f\u01be\b\u001f\n\u001f\f\u001f\u01c1\t\u001f\u0001\u001f"+
		"\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0005 \u01d3\b \n \f \u01d6\t \u0001"+
		" \u0001 \u0001 \u0001 \u0005 \u01dc\b \n \f \u01df\t \u0001 \u0003 \u01e2"+
		"\b \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0005 \u01ec"+
		"\b \n \f \u01ef\t \u0001 \u0001 \u0001 \u0005 \u01f4\b \n \f \u01f7\t"+
		" \u0001 \u0003 \u01fa\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0005"+
		"!\u0202\b!\n!\f!\u0205\t!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0005\"\u020f\b\"\n\"\f\"\u0212\t\"\u0001\"\u0001\""+
		"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0005#\u021c\b#\n#\f#\u021f"+
		"\t#\u0001#\u0001#\u0001#\u0001#\u0005#\u0225\b#\n#\f#\u0228\t#\u0001#"+
		"\u0003#\u022b\b#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0003$\u0240\b$\u0001%\u0001%\u0001%\u0001%\u0005%\u0246\b%\n"+
		"%\f%\u0249\t%\u0001%\u0001%\u0001%\u0005%\u024e\b%\n%\f%\u0251\t%\u0003"+
		"%\u0253\b%\u0001&\u0001&\u0001&\u0001&\u0003&\u0259\b&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001\'\u0001\'\u0005\'\u0262\b\'\n\'\f\'\u0265\t\'\u0001"+
		"\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0005)\u0276\b)\n)\f)\u0279\t)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0005)\u0280\b)\n)\f)\u0283\t)\u0001)\u0001)\u0001"+
		"*\u0003*\u0288\b*\u0001*\u0001*\u0001*\u0001*\u0001+\u0001+\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0003,\u02a6\b,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0003-\u02b3\b-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0005-\u02d1\b-\n-\f-\u02d4\t-\u0001.\u0001.\u0001"+
		".\u0003.\u02d9\b.\u0001/\u0001/\u0001/\u0001/\u0001/\u0005/\u02e0\b/\n"+
		"/\f/\u02e3\t/\u00010\u00010\u00010\u00040\u02e8\b0\u000b0\f0\u02e9\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00012\u00012\u0001"+
		"2\u00012\u00012\u00052\u02f9\b2\n2\f2\u02fc\t2\u00032\u02fe\b2\u00012"+
		"\u00012\u00012\u00012\u00012\u00012\u00012\u00052\u0307\b2\n2\f2\u030a"+
		"\t2\u00032\u030c\b2\u00012\u00012\u00012\u00012\u00032\u0312\b2\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00032\u031b\b2\u00013\u0001"+
		"3\u00013\u00013\u00013\u00053\u0322\b3\n3\f3\u0325\t3\u00013\u00013\u0001"+
		"3\u00033\u032a\b3\u00013\u00013\u00053\u032e\b3\n3\f3\u0331\t3\u00013"+
		"\u00013\u00014\u00014\u00014\u00054\u0338\b4\n4\f4\u033b\t4\u00015\u0001"+
		"5\u00015\u00015\u00055\u0341\b5\n5\f5\u0344\t5\u00035\u0346\b5\u00015"+
		"\u00015\u00016\u00036\u034b\b6\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00017\u00057\u0354\b7\n7\f7\u0357\t7\u00018\u00018\u00038\u035b\b8"+
		"\u00019\u00019\u00019\u00019\u00019\u0001:\u0001:\u0001:\u0003:\u0365"+
		"\b:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001;\u0001;\u0001;\u0005;\u036f"+
		"\b;\n;\f;\u0372\t;\u0001<\u0001<\u0001<\u0001<\u0001=\u0001=\u0001=\u0001"+
		"=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001>\u0001>\u0001"+
		">\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0003>\u038c\b>\u0001?\u0001"+
		"?\u0001?\u0001?\u0001?\u0001?\u0001@\u0001@\u0001@\u0001@\u0001@\u0001"+
		"@\u0001@\u0001@\u0003@\u039c\b@\u0001@\u0001@\u0001@\u0001A\u0001A\u0001"+
		"A\u0005A\u03a4\bA\nA\fA\u03a7\tA\u0001B\u0001B\u0001B\u0001B\u0001B\u0001"+
		"B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001C\u0001C\u0001C\u0001C\u0001"+
		"C\u0001C\u0001C\u0001C\u0001C\u0003C\u03bd\bC\u0001C\u0001C\u0001C\u0003"+
		"C\u03c2\bC\u0001D\u0001D\u0001D\u0005D\u03c7\bD\nD\fD\u03ca\tD\u0001D"+
		"\u0003D\u03cd\bD\u0001E\u0001E\u0001E\u0003E\u03d2\bE\u0001E\u0001E\u0001"+
		"F\u0004F\u03d7\bF\u000bF\fF\u03d8\u0001G\u0001G\u0001G\u0001G\u0003G\u03df"+
		"\bG\u0001H\u0001H\u0005H\u03e3\bH\nH\fH\u03e6\tH\u0001H\u0001H\u0005H"+
		"\u03ea\bH\nH\fH\u03ed\tH\u0001H\u0001H\u0001I\u0001I\u0005I\u03f3\bI\n"+
		"I\fI\u03f6\tI\u0001I\u0001I\u0001J\u0001J\u0005J\u03fc\bJ\nJ\fJ\u03ff"+
		"\tJ\u0001J\u0001J\u0005J\u0403\bJ\nJ\fJ\u0406\tJ\u0001J\u0001J\u0001K"+
		"\u0001K\u0001K\u0005K\u040d\bK\nK\fK\u0410\tK\u0001K\u0001K\u0005K\u0414"+
		"\bK\nK\fK\u0417\tK\u0001K\u0001K\u0001K\u0001K\u0001L\u0001L\u0001L\u0001"+
		"M\u0001M\u0001M\u0001M\u0001N\u0001N\u0001N\u0001O\u0001O\u0001O\u0001"+
		"O\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001"+
		"P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001"+
		"P\u0001P\u0003P\u0440\bP\u0001Q\u0001Q\u0001Q\u0001Q\u0001R\u0001R\u0001"+
		"R\u0001R\u0001S\u0001S\u0001S\u0004S\u044d\bS\u000bS\fS\u044e\u0001T\u0001"+
		"T\u0001U\u0001U\u0001U\u0001U\u0005U\u0457\bU\nU\fU\u045a\tU\u0001U\u0001"+
		"U\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001W\u0001W\u0001X\u0004"+
		"X\u0467\bX\u000bX\fX\u0468\u0001Y\u0001Y\u0001Y\u0004Y\u046e\bY\u000b"+
		"Y\fY\u046f\u0001Y\u0001Y\u0001Z\u0001Z\u0001Z\u0003Z\u0477\bZ\u0001[\u0001"+
		"[\u0001[\u0001\\\u0001\\\u0001\\\u0001]\u0001]\u0001]\u0001]\u0001^\u0001"+
		"^\u0001^\u0001^\u0001^\u0001_\u0001_\u0001_\u0005_\u048b\b_\n_\f_\u048e"+
		"\t_\u0001`\u0001`\u0003`\u0492\b`\u0001`\u0001`\u0001`\u0001`\u0003`\u0498"+
		"\b`\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0000\u0001Zb\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6"+
		"\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u0000\u0004\u0003\u000011FFLL\u0001"+
		"\u0000GH\u0001\u0000!#\u0005\u0000::FFOOYYaa\u04dc\u0000\u00c7\u0001\u0000"+
		"\u0000\u0000\u0002\u00d0\u0001\u0000\u0000\u0000\u0004\u00d2\u0001\u0000"+
		"\u0000\u0000\u0006\u00e1\u0001\u0000\u0000\u0000\b\u00e3\u0001\u0000\u0000"+
		"\u0000\n\u00ea\u0001\u0000\u0000\u0000\f\u00f2\u0001\u0000\u0000\u0000"+
		"\u000e\u0101\u0001\u0000\u0000\u0000\u0010\u0103\u0001\u0000\u0000\u0000"+
		"\u0012\u0107\u0001\u0000\u0000\u0000\u0014\u010b\u0001\u0000\u0000\u0000"+
		"\u0016\u010f\u0001\u0000\u0000\u0000\u0018\u0113\u0001\u0000\u0000\u0000"+
		"\u001a\u011e\u0001\u0000\u0000\u0000\u001c\u0126\u0001\u0000\u0000\u0000"+
		"\u001e\u0132\u0001\u0000\u0000\u0000 \u0134\u0001\u0000\u0000\u0000\""+
		"\u0137\u0001\u0000\u0000\u0000$\u0140\u0001\u0000\u0000\u0000&\u014b\u0001"+
		"\u0000\u0000\u0000(\u0152\u0001\u0000\u0000\u0000*\u015a\u0001\u0000\u0000"+
		"\u0000,\u0165\u0001\u0000\u0000\u0000.\u016b\u0001\u0000\u0000\u00000"+
		"\u0174\u0001\u0000\u0000\u00002\u0186\u0001\u0000\u0000\u00004\u018c\u0001"+
		"\u0000\u0000\u00006\u018e\u0001\u0000\u0000\u00008\u0197\u0001\u0000\u0000"+
		"\u0000:\u01a2\u0001\u0000\u0000\u0000<\u01a4\u0001\u0000\u0000\u0000>"+
		"\u01ae\u0001\u0000\u0000\u0000@\u01f9\u0001\u0000\u0000\u0000B\u01fb\u0001"+
		"\u0000\u0000\u0000D\u0208\u0001\u0000\u0000\u0000F\u0215\u0001\u0000\u0000"+
		"\u0000H\u023f\u0001\u0000\u0000\u0000J\u0252\u0001\u0000\u0000\u0000L"+
		"\u0254\u0001\u0000\u0000\u0000N\u025f\u0001\u0000\u0000\u0000P\u0268\u0001"+
		"\u0000\u0000\u0000R\u0270\u0001\u0000\u0000\u0000T\u0287\u0001\u0000\u0000"+
		"\u0000V\u028d\u0001\u0000\u0000\u0000X\u02a5\u0001\u0000\u0000\u0000Z"+
		"\u02b2\u0001\u0000\u0000\u0000\\\u02d8\u0001\u0000\u0000\u0000^\u02da"+
		"\u0001\u0000\u0000\u0000`\u02e4\u0001\u0000\u0000\u0000b\u02eb\u0001\u0000"+
		"\u0000\u0000d\u031a\u0001\u0000\u0000\u0000f\u031c\u0001\u0000\u0000\u0000"+
		"h\u0334\u0001\u0000\u0000\u0000j\u033c\u0001\u0000\u0000\u0000l\u034a"+
		"\u0001\u0000\u0000\u0000n\u0355\u0001\u0000\u0000\u0000p\u035a\u0001\u0000"+
		"\u0000\u0000r\u035c\u0001\u0000\u0000\u0000t\u0361\u0001\u0000\u0000\u0000"+
		"v\u036b\u0001\u0000\u0000\u0000x\u0373\u0001\u0000\u0000\u0000z\u0377"+
		"\u0001\u0000\u0000\u0000|\u038b\u0001\u0000\u0000\u0000~\u038d\u0001\u0000"+
		"\u0000\u0000\u0080\u0393\u0001\u0000\u0000\u0000\u0082\u03a0\u0001\u0000"+
		"\u0000\u0000\u0084\u03a8\u0001\u0000\u0000\u0000\u0086\u03c1\u0001\u0000"+
		"\u0000\u0000\u0088\u03cc\u0001\u0000\u0000\u0000\u008a\u03ce\u0001\u0000"+
		"\u0000\u0000\u008c\u03d6\u0001\u0000\u0000\u0000\u008e\u03de\u0001\u0000"+
		"\u0000\u0000\u0090\u03e0\u0001\u0000\u0000\u0000\u0092\u03f0\u0001\u0000"+
		"\u0000\u0000\u0094\u03f9\u0001\u0000\u0000\u0000\u0096\u0409\u0001\u0000"+
		"\u0000\u0000\u0098\u041c\u0001\u0000\u0000\u0000\u009a\u041f\u0001\u0000"+
		"\u0000\u0000\u009c\u0423\u0001\u0000\u0000\u0000\u009e\u0426\u0001\u0000"+
		"\u0000\u0000\u00a0\u043f\u0001\u0000\u0000\u0000\u00a2\u0441\u0001\u0000"+
		"\u0000\u0000\u00a4\u0445\u0001\u0000\u0000\u0000\u00a6\u044c\u0001\u0000"+
		"\u0000\u0000\u00a8\u0450\u0001\u0000\u0000\u0000\u00aa\u0452\u0001\u0000"+
		"\u0000\u0000\u00ac\u045d\u0001\u0000\u0000\u0000\u00ae\u0463\u0001\u0000"+
		"\u0000\u0000\u00b0\u0466\u0001\u0000\u0000\u0000\u00b2\u046a\u0001\u0000"+
		"\u0000\u0000\u00b4\u0476\u0001\u0000\u0000\u0000\u00b6\u0478\u0001\u0000"+
		"\u0000\u0000\u00b8\u047b\u0001\u0000\u0000\u0000\u00ba\u047e\u0001\u0000"+
		"\u0000\u0000\u00bc\u0482\u0001\u0000\u0000\u0000\u00be\u0487\u0001\u0000"+
		"\u0000\u0000\u00c0\u0497\u0001\u0000\u0000\u0000\u00c2\u0499\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c6\u0003\u0002\u0001\u0000\u00c5\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00ca\u0001\u0000"+
		"\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005\u0000"+
		"\u0000\u0001\u00cb\u0001\u0001\u0000\u0000\u0000\u00cc\u00d1\u0003\u0004"+
		"\u0002\u0000\u00cd\u00d1\u0003\b\u0004\u0000\u00ce\u00d1\u0003\u001c\u000e"+
		"\u0000\u00cf\u00d1\u0003\n\u0005\u0000\u00d0\u00cc\u0001\u0000\u0000\u0000"+
		"\u00d0\u00cd\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000"+
		"\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d1\u0003\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d3\u0005\u0001\u0000\u0000\u00d3\u00d4\u00052\u0000\u0000\u00d4"+
		"\u00d9\u0003\u0006\u0003\u0000\u00d5\u00d6\u0005;\u0000\u0000\u00d6\u00d8"+
		"\u0003\u0006\u0003\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d8\u00db"+
		"\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00d9\u00da"+
		"\u0001\u0000\u0000\u0000\u00da\u00dc\u0001\u0000\u0000\u0000\u00db\u00d9"+
		"\u0001\u0000\u0000\u0000\u00dc\u00dd\u00053\u0000\u0000\u00dd\u00de\u0005"+
		"\u0003\u0000\u0000\u00de\u00df\u0005F\u0000\u0000\u00df\u00e0\u0005<\u0000"+
		"\u0000\u00e0\u0005\u0001\u0000\u0000\u0000\u00e1\u00e2\u0007\u0000\u0000"+
		"\u0000\u00e2\u0007\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005\u0002\u0000"+
		"\u0000\u00e4\u00e5\u00058\u0000\u0000\u00e5\u00e6\u00052\u0000\u0000\u00e6"+
		"\u00e7\u0003\f\u0006\u0000\u00e7\u00e8\u00053\u0000\u0000\u00e8\u00e9"+
		"\u00059\u0000\u0000\u00e9\t\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005"+
		"%\u0000\u0000\u00eb\u00ec\u00058\u0000\u0000\u00ec\u00ed\u00052\u0000"+
		"\u0000\u00ed\u00ee\u0003\f\u0006\u0000\u00ee\u00ef\u00053\u0000\u0000"+
		"\u00ef\u00f0\u00059\u0000\u0000\u00f0\u000b\u0001\u0000\u0000\u0000\u00f1"+
		"\u00f3\u0003\u000e\u0007\u0000\u00f2\u00f1\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f8\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f5\u0005;\u0000\u0000\u00f5\u00f7\u0003\u000e\u0007\u0000\u00f6\u00f4"+
		"\u0001\u0000\u0000\u0000\u00f7\u00fa\u0001\u0000\u0000\u0000\u00f8\u00f6"+
		"\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\r\u0001"+
		"\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fb\u0102\u0003"+
		"\u0016\u000b\u0000\u00fc\u0102\u0003\u0018\f\u0000\u00fd\u0102\u0003\u0014"+
		"\n\u0000\u00fe\u0102\u0003\u0012\t\u0000\u00ff\u0102\u0003\u0010\b\u0000"+
		"\u0100\u0102\u0003\u001a\r\u0000\u0101\u00fb\u0001\u0000\u0000\u0000\u0101"+
		"\u00fc\u0001\u0000\u0000\u0000\u0101\u00fd\u0001\u0000\u0000\u0000\u0101"+
		"\u00fe\u0001\u0000\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0101"+
		"\u0100\u0001\u0000\u0000\u0000\u0102\u000f\u0001\u0000\u0000\u0000\u0103"+
		"\u0104\u0005\u0016\u0000\u0000\u0104\u0105\u0005:\u0000\u0000\u0105\u0106"+
		"\u0005F\u0000\u0000\u0106\u0011\u0001\u0000\u0000\u0000\u0107\u0108\u0005"+
		"\u0019\u0000\u0000\u0108\u0109\u0005:\u0000\u0000\u0109\u010a\u0005F\u0000"+
		"\u0000\u010a\u0013\u0001\u0000\u0000\u0000\u010b\u010c\u0005\u0017\u0000"+
		"\u0000\u010c\u010d\u0005:\u0000\u0000\u010d\u010e\u0005F\u0000\u0000\u010e"+
		"\u0015\u0001\u0000\u0000\u0000\u010f\u0110\u0005\u0018\u0000\u0000\u0110"+
		"\u0111\u0005:\u0000\u0000\u0111\u0112\u0005F\u0000\u0000\u0112\u0017\u0001"+
		"\u0000\u0000\u0000\u0113\u0114\u0005\u0018\u0000\u0000\u0114\u0115\u0005"+
		":\u0000\u0000\u0115\u0119\u0005C\u0000\u0000\u0116\u0118\u0003\u008cF"+
		"\u0000\u0117\u0116\u0001\u0000\u0000\u0000\u0118\u011b\u0001\u0000\u0000"+
		"\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000"+
		"\u0000\u011a\u011c\u0001\u0000\u0000\u0000\u011b\u0119\u0001\u0000\u0000"+
		"\u0000\u011c\u011d\u0005C\u0000\u0000\u011d\u0019\u0001\u0000\u0000\u0000"+
		"\u011e\u011f\u0005\u001a\u0000\u0000\u011f\u0120\u0005:\u0000\u0000\u0120"+
		"\u0121\u00056\u0000\u0000\u0121\u0122\u0005C\u0000\u0000\u0122\u0123\u0003"+
		"\u00b0X\u0000\u0123\u0124\u0005C\u0000\u0000\u0124\u0125\u00057\u0000"+
		"\u0000\u0125\u001b\u0001\u0000\u0000\u0000\u0126\u0127\u0005\u0004\u0000"+
		"\u0000\u0127\u0128\u0005\u0005\u0000\u0000\u0128\u012a\u0005L\u0000\u0000"+
		"\u0129\u012b\u0003\u001e\u000f\u0000\u012a\u0129\u0001\u0000\u0000\u0000"+
		"\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000"+
		"\u012c\u012d\u00052\u0000\u0000\u012d\u012e\u00032\u0019\u0000\u012e\u012f"+
		"\u00053\u0000\u0000\u012f\u001d\u0001\u0000\u0000\u0000\u0130\u0133\u0003"+
		" \u0010\u0000\u0131\u0133\u0003\"\u0011\u0000\u0132\u0130\u0001\u0000"+
		"\u0000\u0000\u0132\u0131\u0001\u0000\u0000\u0000\u0133\u001f\u0001\u0000"+
		"\u0000\u0000\u0134\u0135\u00050\u0000\u0000\u0135\u0136\u0005L\u0000\u0000"+
		"\u0136!\u0001\u0000\u0000\u0000\u0137\u0138\u0005/\u0000\u0000\u0138\u013d"+
		"\u0003.\u0017\u0000\u0139\u013a\u0005;\u0000\u0000\u013a\u013c\u0005L"+
		"\u0000\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013c\u013f\u0001\u0000"+
		"\u0000\u0000\u013d\u013b\u0001\u0000\u0000\u0000\u013d\u013e\u0001\u0000"+
		"\u0000\u0000\u013e#\u0001\u0000\u0000\u0000\u013f\u013d\u0001\u0000\u0000"+
		"\u0000\u0140\u0141\u0005&\u0000\u0000\u0141\u0142\u00058\u0000\u0000\u0142"+
		"\u0143\u00059\u0000\u0000\u0143\u0144\u00052\u0000\u0000\u0144\u0145\u0005"+
		")\u0000\u0000\u0145\u0146\u00056\u0000\u0000\u0146\u0147\u0003(\u0014"+
		"\u0000\u0147\u0148\u00057\u0000\u0000\u0148\u0149\u0005<\u0000\u0000\u0149"+
		"\u014a\u00053\u0000\u0000\u014a%\u0001\u0000\u0000\u0000\u014b\u014c\u0005"+
		"L\u0000\u0000\u014c\u014d\u0005=\u0000\u0000\u014d\u014e\u00056\u0000"+
		"\u0000\u014e\u014f\u0003(\u0014\u0000\u014f\u0150\u00057\u0000\u0000\u0150"+
		"\u0151\u0005<\u0000\u0000\u0151\'\u0001\u0000\u0000\u0000\u0152\u0157"+
		"\u0003*\u0015\u0000\u0153\u0154\u0005;\u0000\u0000\u0154\u0156\u0003*"+
		"\u0015\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0156\u0159\u0001\u0000"+
		"\u0000\u0000\u0157\u0155\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000"+
		"\u0000\u0000\u0158)\u0001\u0000\u0000\u0000\u0159\u0157\u0001\u0000\u0000"+
		"\u0000\u015a\u015b\u00052\u0000\u0000\u015b\u0160\u0003,\u0016\u0000\u015c"+
		"\u015d\u0005;\u0000\u0000\u015d\u015f\u0003,\u0016\u0000\u015e\u015c\u0001"+
		"\u0000\u0000\u0000\u015f\u0162\u0001\u0000\u0000\u0000\u0160\u015e\u0001"+
		"\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000\u0161\u0163\u0001"+
		"\u0000\u0000\u0000\u0162\u0160\u0001\u0000\u0000\u0000\u0163\u0164\u0005"+
		"3\u0000\u0000\u0164+\u0001\u0000\u0000\u0000\u0165\u0166\u00030\u0018"+
		"\u0000\u0166\u0167\u0005:\u0000\u0000\u0167\u0168\u0003.\u0017\u0000\u0168"+
		"-\u0001\u0000\u0000\u0000\u0169\u016c\u00030\u0018\u0000\u016a\u016c\u0003"+
		"|>\u0000\u016b\u0169\u0001\u0000\u0000\u0000\u016b\u016a\u0001\u0000\u0000"+
		"\u0000\u016c/\u0001\u0000\u0000\u0000\u016d\u0175\u0005L\u0000\u0000\u016e"+
		"\u0175\u0005F\u0000\u0000\u016f\u0175\u0005I\u0000\u0000\u0170\u0175\u0005"+
		"\u001b\u0000\u0000\u0171\u0175\u0005(\u0000\u0000\u0172\u0175\u00051\u0000"+
		"\u0000\u0173\u0175\u0005^\u0000\u0000\u0174\u016d\u0001\u0000\u0000\u0000"+
		"\u0174\u016e\u0001\u0000\u0000\u0000\u0174\u016f\u0001\u0000\u0000\u0000"+
		"\u0174\u0170\u0001\u0000\u0000\u0000\u0174\u0171\u0001\u0000\u0000\u0000"+
		"\u0174\u0172\u0001\u0000\u0000\u0000\u0174\u0173\u0001\u0000\u0000\u0000"+
		"\u01751\u0001\u0000\u0000\u0000\u0176\u0185\u00034\u001a\u0000\u0177\u0185"+
		"\u0003R)\u0000\u0178\u0185\u0003>\u001f\u0000\u0179\u0185\u0003X,\u0000"+
		"\u017a\u0185\u0003~?\u0000\u017b\u0185\u0003\u0084B\u0000\u017c\u0185"+
		"\u0003f3\u0000\u017d\u0185\u0003z=\u0000\u017e\u0185\u0003$\u0012\u0000"+
		"\u017f\u0185\u0003&\u0013\u0000\u0180\u0185\u0003\u0086C\u0000\u0181\u0185"+
		"\u0003\\.\u0000\u0182\u0185\u0003L&\u0000\u0183\u0185\u0003B!\u0000\u0184"+
		"\u0176\u0001\u0000\u0000\u0000\u0184\u0177\u0001\u0000\u0000\u0000\u0184"+
		"\u0178\u0001\u0000\u0000\u0000\u0184\u0179\u0001\u0000\u0000\u0000\u0184"+
		"\u017a\u0001\u0000\u0000\u0000\u0184\u017b\u0001\u0000\u0000\u0000\u0184"+
		"\u017c\u0001\u0000\u0000\u0000\u0184\u017d\u0001\u0000\u0000\u0000\u0184"+
		"\u017e\u0001\u0000\u0000\u0000\u0184\u017f\u0001\u0000\u0000\u0000\u0184"+
		"\u0180\u0001\u0000\u0000\u0000\u0184\u0181\u0001\u0000\u0000\u0000\u0184"+
		"\u0182\u0001\u0000\u0000\u0000\u0184\u0183\u0001\u0000\u0000\u0000\u0185"+
		"\u0188\u0001\u0000\u0000\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0186"+
		"\u0187\u0001\u0000\u0000\u0000\u01873\u0001\u0000\u0000\u0000\u0188\u0186"+
		"\u0001\u0000\u0000\u0000\u0189\u018d\u00036\u001b\u0000\u018a\u018d\u0003"+
		"8\u001c\u0000\u018b\u018d\u0003<\u001e\u0000\u018c\u0189\u0001\u0000\u0000"+
		"\u0000\u018c\u018a\u0001\u0000\u0000\u0000\u018c\u018b\u0001\u0000\u0000"+
		"\u0000\u018d5\u0001\u0000\u0000\u0000\u018e\u018f\u0005L\u0000\u0000\u018f"+
		"\u0190\u0005:\u0000\u0000\u0190\u0193\u0003.\u0017\u0000\u0191\u0192\u0005"+
		"=\u0000\u0000\u0192\u0194\u0003Z-\u0000\u0193\u0191\u0001\u0000\u0000"+
		"\u0000\u0193\u0194\u0001\u0000\u0000\u0000\u0194\u0195\u0001\u0000\u0000"+
		"\u0000\u0195\u0196\u0005<\u0000\u0000\u01967\u0001\u0000\u0000\u0000\u0197"+
		"\u0198\u0003:\u001d\u0000\u0198\u0199\u0005L\u0000\u0000\u0199\u019a\u0005"+
		":\u0000\u0000\u019a\u019b\u0003.\u0017\u0000\u019b\u019c\u0005=\u0000"+
		"\u0000\u019c\u019d\u0003.\u0017\u0000\u019d\u019e\u0005<\u0000\u0000\u019e"+
		"9\u0001\u0000\u0000\u0000\u019f\u01a3\u0005\u000f\u0000\u0000\u01a0\u01a3"+
		"\u0005\u0011\u0000\u0000\u01a1\u01a3\u0005\u0010\u0000\u0000\u01a2\u019f"+
		"\u0001\u0000\u0000\u0000\u01a2\u01a0\u0001\u0000\u0000\u0000\u01a2\u01a1"+
		"\u0001\u0000\u0000\u0000\u01a3;\u0001\u0000\u0000\u0000\u01a4\u01a5\u0005"+
		"L\u0000\u0000\u01a5\u01a6\u0005:\u0000\u0000\u01a6\u01a7\u0003.\u0017"+
		"\u0000\u01a7\u01a8\u00056\u0000\u0000\u01a8\u01a9\u00057\u0000\u0000\u01a9"+
		"\u01aa\u0005=\u0000\u0000\u01aa\u01ab\u00056\u0000\u0000\u01ab\u01ac\u0005"+
		"7\u0000\u0000\u01ac\u01ad\u0005<\u0000\u0000\u01ad=\u0001\u0000\u0000"+
		"\u0000\u01ae\u01af\u0005\u001c\u0000\u0000\u01af\u01b8\u00058\u0000\u0000"+
		"\u01b0\u01b5\u0003T*\u0000\u01b1\u01b2\u0005;\u0000\u0000\u01b2\u01b4"+
		"\u0003T*\u0000\u01b3\u01b1\u0001\u0000\u0000\u0000\u01b4\u01b7\u0001\u0000"+
		"\u0000\u0000\u01b5\u01b3\u0001\u0000\u0000\u0000\u01b5\u01b6\u0001\u0000"+
		"\u0000\u0000\u01b6\u01b9\u0001\u0000\u0000\u0000\u01b7\u01b5\u0001\u0000"+
		"\u0000\u0000\u01b8\u01b0\u0001\u0000\u0000\u0000\u01b8\u01b9\u0001\u0000"+
		"\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba\u01bb\u00059\u0000"+
		"\u0000\u01bb\u01bf\u00052\u0000\u0000\u01bc\u01be\u0003X,\u0000\u01bd"+
		"\u01bc\u0001\u0000\u0000\u0000\u01be\u01c1\u0001\u0000\u0000\u0000\u01bf"+
		"\u01bd\u0001\u0000\u0000\u0000\u01bf\u01c0\u0001\u0000\u0000\u0000\u01c0"+
		"\u01c2\u0001\u0000\u0000\u0000\u01c1\u01bf\u0001\u0000\u0000\u0000\u01c2"+
		"\u01c3\u00053\u0000\u0000\u01c3?\u0001\u0000\u0000\u0000\u01c4\u01c5\u0005"+
		"\u0006\u0000\u0000\u01c5\u01c6\u00058\u0000\u0000\u01c6\u01c7\u0005\u000f"+
		"\u0000\u0000\u01c7\u01c8\u0005L\u0000\u0000\u01c8\u01c9\u0005=\u0000\u0000"+
		"\u01c9\u01ca\u0003Z-\u0000\u01ca\u01cb\u0005<\u0000\u0000\u01cb\u01cc"+
		"\u0003Z-\u0000\u01cc\u01cd\u0005<\u0000\u0000\u01cd\u01ce\u0005L\u0000"+
		"\u0000\u01ce\u01cf\u0007\u0001\u0000\u0000\u01cf\u01d0\u00059\u0000\u0000"+
		"\u01d0\u01d4\u00052\u0000\u0000\u01d1\u01d3\u0003X,\u0000\u01d2\u01d1"+
		"\u0001\u0000\u0000\u0000\u01d3\u01d6\u0001\u0000\u0000\u0000\u01d4\u01d2"+
		"\u0001\u0000\u0000\u0000\u01d4\u01d5\u0001\u0000\u0000\u0000\u01d5\u01d7"+
		"\u0001\u0000\u0000\u0000\u01d6\u01d4\u0001\u0000\u0000\u0000\u01d7\u01e1"+
		"\u00053\u0000\u0000\u01d8\u01d9\u0005\u0014\u0000\u0000\u01d9\u01dd\u0005"+
		"2\u0000\u0000\u01da\u01dc\u0003X,\u0000\u01db\u01da\u0001\u0000\u0000"+
		"\u0000\u01dc\u01df\u0001\u0000\u0000\u0000\u01dd\u01db\u0001\u0000\u0000"+
		"\u0000\u01dd\u01de\u0001\u0000\u0000\u0000\u01de\u01e0\u0001\u0000\u0000"+
		"\u0000\u01df\u01dd\u0001\u0000\u0000\u0000\u01e0\u01e2\u00053\u0000\u0000"+
		"\u01e1\u01d8\u0001\u0000\u0000\u0000\u01e1\u01e2\u0001\u0000\u0000\u0000"+
		"\u01e2\u01fa\u0001\u0000\u0000\u0000\u01e3\u01e4\u0005\u0006\u0000\u0000"+
		"\u01e4\u01e5\u00058\u0000\u0000\u01e5\u01e6\u0005\u000f\u0000\u0000\u01e6"+
		"\u01e7\u0005L\u0000\u0000\u01e7\u01e8\u0005\u0012\u0000\u0000\u01e8\u01ed"+
		"\u0005L\u0000\u0000\u01e9\u01ea\u0005X\u0000\u0000\u01ea\u01ec\u0005L"+
		"\u0000\u0000\u01eb\u01e9\u0001\u0000\u0000\u0000\u01ec\u01ef\u0001\u0000"+
		"\u0000\u0000\u01ed\u01eb\u0001\u0000\u0000\u0000\u01ed\u01ee\u0001\u0000"+
		"\u0000\u0000\u01ee\u01f0\u0001\u0000\u0000\u0000\u01ef\u01ed\u0001\u0000"+
		"\u0000\u0000\u01f0\u01f1\u00059\u0000\u0000\u01f1\u01f5\u00052\u0000\u0000"+
		"\u01f2\u01f4\u0003X,\u0000\u01f3\u01f2\u0001\u0000\u0000\u0000\u01f4\u01f7"+
		"\u0001\u0000\u0000\u0000\u01f5\u01f3\u0001\u0000\u0000\u0000\u01f5\u01f6"+
		"\u0001\u0000\u0000\u0000\u01f6\u01f8\u0001\u0000\u0000\u0000\u01f7\u01f5"+
		"\u0001\u0000\u0000\u0000\u01f8\u01fa\u00053\u0000\u0000\u01f9\u01c4\u0001"+
		"\u0000\u0000\u0000\u01f9\u01e3\u0001\u0000\u0000\u0000\u01faA\u0001\u0000"+
		"\u0000\u0000\u01fb\u01fc\u0005\n\u0000\u0000\u01fc\u01fd\u00058\u0000"+
		"\u0000\u01fd\u01fe\u0003Z-\u0000\u01fe\u01ff\u00059\u0000\u0000\u01ff"+
		"\u0203\u00052\u0000\u0000\u0200\u0202\u0003X,\u0000\u0201\u0200\u0001"+
		"\u0000\u0000\u0000\u0202\u0205\u0001\u0000\u0000\u0000\u0203\u0201\u0001"+
		"\u0000\u0000\u0000\u0203\u0204\u0001\u0000\u0000\u0000\u0204\u0206\u0001"+
		"\u0000\u0000\u0000\u0205\u0203\u0001\u0000\u0000\u0000\u0206\u0207\u0005"+
		"3\u0000\u0000\u0207C\u0001\u0000\u0000\u0000\u0208\u0209\u0005\u000b\u0000"+
		"\u0000\u0209\u020a\u00058\u0000\u0000\u020a\u020b\u0003Z-\u0000\u020b"+
		"\u020c\u00059\u0000\u0000\u020c\u0210\u00052\u0000\u0000\u020d\u020f\u0003"+
		"J%\u0000\u020e\u020d\u0001\u0000\u0000\u0000\u020f\u0212\u0001\u0000\u0000"+
		"\u0000\u0210\u020e\u0001\u0000\u0000\u0000\u0210\u0211\u0001\u0000\u0000"+
		"\u0000\u0211\u0213\u0001\u0000\u0000\u0000\u0212\u0210\u0001\u0000\u0000"+
		"\u0000\u0213\u0214\u00053\u0000\u0000\u0214E\u0001\u0000\u0000\u0000\u0215"+
		"\u0216\u0005\u0013\u0000\u0000\u0216\u0217\u00058\u0000\u0000\u0217\u0218"+
		"\u0003H$\u0000\u0218\u0219\u00059\u0000\u0000\u0219\u021d\u00052\u0000"+
		"\u0000\u021a\u021c\u0003X,\u0000\u021b\u021a\u0001\u0000\u0000\u0000\u021c"+
		"\u021f\u0001\u0000\u0000\u0000\u021d\u021b\u0001\u0000\u0000\u0000\u021d"+
		"\u021e\u0001\u0000\u0000\u0000\u021e\u0220\u0001\u0000\u0000\u0000\u021f"+
		"\u021d\u0001\u0000\u0000\u0000\u0220\u022a\u00053\u0000\u0000\u0221\u0222"+
		"\u0005\u0014\u0000\u0000\u0222\u0226\u00052\u0000\u0000\u0223\u0225\u0003"+
		"X,\u0000\u0224\u0223\u0001\u0000\u0000\u0000\u0225\u0228\u0001\u0000\u0000"+
		"\u0000\u0226\u0224\u0001\u0000\u0000\u0000\u0226\u0227\u0001\u0000\u0000"+
		"\u0000\u0227\u0229\u0001\u0000\u0000\u0000\u0228\u0226\u0001\u0000\u0000"+
		"\u0000\u0229\u022b\u00053\u0000\u0000\u022a\u0221\u0001\u0000\u0000\u0000"+
		"\u022a\u022b\u0001\u0000\u0000\u0000\u022bG\u0001\u0000\u0000\u0000\u022c"+
		"\u022d\u0003Z-\u0000\u022d\u022e\u0005=\u0000\u0000\u022e\u022f\u0005"+
		"=\u0000\u0000\u022f\u0230\u0005=\u0000\u0000\u0230\u0231\u0003Z-\u0000"+
		"\u0231\u0240\u0001\u0000\u0000\u0000\u0232\u0233\u0003Z-\u0000\u0233\u0234"+
		"\u0005=\u0000\u0000\u0234\u0235\u0005=\u0000\u0000\u0235\u0236\u0003Z"+
		"-\u0000\u0236\u0240\u0001\u0000\u0000\u0000\u0237\u0238\u0003Z-\u0000"+
		"\u0238\u0239\u0005A\u0000\u0000\u0239\u023a\u0003Z-\u0000\u023a\u0240"+
		"\u0001\u0000\u0000\u0000\u023b\u023c\u0003Z-\u0000\u023c\u023d\u0005B"+
		"\u0000\u0000\u023d\u023e\u0003Z-\u0000\u023e\u0240\u0001\u0000\u0000\u0000"+
		"\u023f\u022c\u0001\u0000\u0000\u0000\u023f\u0232\u0001\u0000\u0000\u0000"+
		"\u023f\u0237\u0001\u0000\u0000\u0000\u023f\u023b\u0001\u0000\u0000\u0000"+
		"\u0240I\u0001\u0000\u0000\u0000\u0241\u0242\u0005\f\u0000\u0000\u0242"+
		"\u0243\u0003Z-\u0000\u0243\u0247\u0005:\u0000\u0000\u0244\u0246\u0003"+
		"X,\u0000\u0245\u0244\u0001\u0000\u0000\u0000\u0246\u0249\u0001\u0000\u0000"+
		"\u0000\u0247\u0245\u0001\u0000\u0000\u0000\u0247\u0248\u0001\u0000\u0000"+
		"\u0000\u0248\u0253\u0001\u0000\u0000\u0000\u0249\u0247\u0001\u0000\u0000"+
		"\u0000\u024a\u024b\u0005\r\u0000\u0000\u024b\u024f\u0005:\u0000\u0000"+
		"\u024c\u024e\u0003X,\u0000\u024d\u024c\u0001\u0000\u0000\u0000\u024e\u0251"+
		"\u0001\u0000\u0000\u0000\u024f\u024d\u0001\u0000\u0000\u0000\u024f\u0250"+
		"\u0001\u0000\u0000\u0000\u0250\u0253\u0001\u0000\u0000\u0000\u0251\u024f"+
		"\u0001\u0000\u0000\u0000\u0252\u0241\u0001\u0000\u0000\u0000\u0252\u024a"+
		"\u0001\u0000\u0000\u0000\u0253K\u0001\u0000\u0000\u0000\u0254\u0255\u0005"+
		"\u0007\u0000\u0000\u0255\u0256\u0005L\u0000\u0000\u0256\u0258\u00058\u0000"+
		"\u0000\u0257\u0259\u0003v;\u0000\u0258\u0257\u0001\u0000\u0000\u0000\u0258"+
		"\u0259\u0001\u0000\u0000\u0000\u0259\u025a\u0001\u0000\u0000\u0000\u025a"+
		"\u025b\u00059\u0000\u0000\u025b\u025c\u0005:\u0000\u0000\u025c\u025d\u0003"+
		".\u0017\u0000\u025d\u025e\u0003N\'\u0000\u025eM\u0001\u0000\u0000\u0000"+
		"\u025f\u0263\u00052\u0000\u0000\u0260\u0262\u0003X,\u0000\u0261\u0260"+
		"\u0001\u0000\u0000\u0000\u0262\u0265\u0001\u0000\u0000\u0000\u0263\u0261"+
		"\u0001\u0000\u0000\u0000\u0263\u0264\u0001\u0000\u0000\u0000\u0264\u0266"+
		"\u0001\u0000\u0000\u0000\u0265\u0263\u0001\u0000\u0000\u0000\u0266\u0267"+
		"\u00053\u0000\u0000\u0267O\u0001\u0000\u0000\u0000\u0268\u0269\u0005\b"+
		"\u0000\u0000\u0269\u026a\u0005X\u0000\u0000\u026a\u026b\u0005\t\u0000"+
		"\u0000\u026b\u026c\u00058\u0000\u0000\u026c\u026d\u0003Z-\u0000\u026d"+
		"\u026e\u00059\u0000\u0000\u026e\u026f\u0005<\u0000\u0000\u026fQ\u0001"+
		"\u0000\u0000\u0000\u0270\u0271\u0005L\u0000\u0000\u0271\u0272\u00058\u0000"+
		"\u0000\u0272\u0277\u0003T*\u0000\u0273\u0274\u0005;\u0000\u0000\u0274"+
		"\u0276\u0003T*\u0000\u0275\u0273\u0001\u0000\u0000\u0000\u0276\u0279\u0001"+
		"\u0000\u0000\u0000\u0277\u0275\u0001\u0000\u0000\u0000\u0277\u0278\u0001"+
		"\u0000\u0000\u0000\u0278\u027a\u0001\u0000\u0000\u0000\u0279\u0277\u0001"+
		"\u0000\u0000\u0000\u027a\u027b\u00059\u0000\u0000\u027b\u027c\u0005:\u0000"+
		"\u0000\u027c\u027d\u0003.\u0017\u0000\u027d\u0281\u00052\u0000\u0000\u027e"+
		"\u0280\u0003X,\u0000\u027f\u027e\u0001\u0000\u0000\u0000\u0280\u0283\u0001"+
		"\u0000\u0000\u0000\u0281\u027f\u0001\u0000\u0000\u0000\u0281\u0282\u0001"+
		"\u0000\u0000\u0000\u0282\u0284\u0001\u0000\u0000\u0000\u0283\u0281\u0001"+
		"\u0000\u0000\u0000\u0284\u0285\u00053\u0000\u0000\u0285S\u0001\u0000\u0000"+
		"\u0000\u0286\u0288\u0003V+\u0000\u0287\u0286\u0001\u0000\u0000\u0000\u0287"+
		"\u0288\u0001\u0000\u0000\u0000\u0288\u0289\u0001\u0000\u0000\u0000\u0289"+
		"\u028a\u0005L\u0000\u0000\u028a\u028b\u0005:\u0000\u0000\u028b\u028c\u0003"+
		".\u0017\u0000\u028cU\u0001\u0000\u0000\u0000\u028d\u028e\u0007\u0002\u0000"+
		"\u0000\u028eW\u0001\u0000\u0000\u0000\u028f\u0290\u0005L\u0000\u0000\u0290"+
		"\u0291\u0005:\u0000\u0000\u0291\u02a6\u0003X,\u0000\u0292\u0293\u0003"+
		"Z-\u0000\u0293\u0294\u0005<\u0000\u0000\u0294\u02a6\u0001\u0000\u0000"+
		"\u0000\u0295\u02a6\u0003F#\u0000\u0296\u02a6\u0003@ \u0000\u0297\u02a6"+
		"\u0003D\"\u0000\u0298\u02a6\u0003R)\u0000\u0299\u02a6\u00034\u001a\u0000"+
		"\u029a\u029b\u0003d2\u0000\u029b\u029c\u0005<\u0000\u0000\u029c\u02a6"+
		"\u0001\u0000\u0000\u0000\u029d\u029e\u0005L\u0000\u0000\u029e\u029f\u0005"+
		"=\u0000\u0000\u029f\u02a0\u0003Z-\u0000\u02a0\u02a1\u0005<\u0000\u0000"+
		"\u02a1\u02a6\u0001\u0000\u0000\u0000\u02a2\u02a6\u0003\u008aE\u0000\u02a3"+
		"\u02a6\u0003\\.\u0000\u02a4\u02a6\u0003P(\u0000\u02a5\u028f\u0001\u0000"+
		"\u0000\u0000\u02a5\u0292\u0001\u0000\u0000\u0000\u02a5\u0295\u0001\u0000"+
		"\u0000\u0000\u02a5\u0296\u0001\u0000\u0000\u0000\u02a5\u0297\u0001\u0000"+
		"\u0000\u0000\u02a5\u0298\u0001\u0000\u0000\u0000\u02a5\u0299\u0001\u0000"+
		"\u0000\u0000\u02a5\u029a\u0001\u0000\u0000\u0000\u02a5\u029d\u0001\u0000"+
		"\u0000\u0000\u02a5\u02a2\u0001\u0000\u0000\u0000\u02a5\u02a3\u0001\u0000"+
		"\u0000\u0000\u02a5\u02a4\u0001\u0000\u0000\u0000\u02a6Y\u0001\u0000\u0000"+
		"\u0000\u02a7\u02a8\u0006-\uffff\uffff\u0000\u02a8\u02b3\u0003d2\u0000"+
		"\u02a9\u02b3\u0003\\.\u0000\u02aa\u02ab\u00058\u0000\u0000\u02ab\u02ac"+
		"\u0003Z-\u0000\u02ac\u02ad\u00059\u0000\u0000\u02ad\u02b3\u0001\u0000"+
		"\u0000\u0000\u02ae\u02b3\u0005L\u0000\u0000\u02af\u02b3\u0005F\u0000\u0000"+
		"\u02b0\u02b3\u0005I\u0000\u0000\u02b1\u02b3\u0005J\u0000\u0000\u02b2\u02a7"+
		"\u0001\u0000\u0000\u0000\u02b2\u02a9\u0001\u0000\u0000\u0000\u02b2\u02aa"+
		"\u0001\u0000\u0000\u0000\u02b2\u02ae\u0001\u0000\u0000\u0000\u02b2\u02af"+
		"\u0001\u0000\u0000\u0000\u02b2\u02b0\u0001\u0000\u0000\u0000\u02b2\u02b1"+
		"\u0001\u0000\u0000\u0000\u02b3\u02d2\u0001\u0000\u0000\u0000\u02b4\u02b5"+
		"\n\u0011\u0000\u0000\u02b5\u02b6\u0005V\u0000\u0000\u02b6\u02d1\u0003"+
		"Z-\u0012\u02b7\u02b8\n\u0010\u0000\u0000\u02b8\u02b9\u0005W\u0000\u0000"+
		"\u02b9\u02d1\u0003Z-\u0011\u02ba\u02bb\n\u000f\u0000\u0000\u02bb\u02bc"+
		"\u0005=\u0000\u0000\u02bc\u02d1\u0003Z-\u0010\u02bd\u02be\n\u000e\u0000"+
		"\u0000\u02be\u02bf\u0005Q\u0000\u0000\u02bf\u02d1\u0003Z-\u000f\u02c0"+
		"\u02c1\n\r\u0000\u0000\u02c1\u02c2\u0005R\u0000\u0000\u02c2\u02d1\u0003"+
		"Z-\u000e\u02c3\u02c4\n\f\u0000\u0000\u02c4\u02c5\u0005S\u0000\u0000\u02c5"+
		"\u02d1\u0003Z-\r\u02c6\u02c7\n\u000b\u0000\u0000\u02c7\u02c8\u0005T\u0000"+
		"\u0000\u02c8\u02d1\u0003Z-\f\u02c9\u02ca\n\n\u0000\u0000\u02ca\u02cb\u0005"+
		"U\u0000\u0000\u02cb\u02d1\u0003Z-\u000b\u02cc\u02cd\n\u0007\u0000\u0000"+
		"\u02cd\u02d1\u0005G\u0000\u0000\u02ce\u02cf\n\u0006\u0000\u0000\u02cf"+
		"\u02d1\u0005H\u0000\u0000\u02d0\u02b4\u0001\u0000\u0000\u0000\u02d0\u02b7"+
		"\u0001\u0000\u0000\u0000\u02d0\u02ba\u0001\u0000\u0000\u0000\u02d0\u02bd"+
		"\u0001\u0000\u0000\u0000\u02d0\u02c0\u0001\u0000\u0000\u0000\u02d0\u02c3"+
		"\u0001\u0000\u0000\u0000\u02d0\u02c6\u0001\u0000\u0000\u0000\u02d0\u02c9"+
		"\u0001\u0000\u0000\u0000\u02d0\u02cc\u0001\u0000\u0000\u0000\u02d0\u02ce"+
		"\u0001\u0000\u0000\u0000\u02d1\u02d4\u0001\u0000\u0000\u0000\u02d2\u02d0"+
		"\u0001\u0000\u0000\u0000\u02d2\u02d3\u0001\u0000\u0000\u0000\u02d3[\u0001"+
		"\u0000\u0000\u0000\u02d4\u02d2\u0001\u0000\u0000\u0000\u02d5\u02d9\u0003"+
		"^/\u0000\u02d6\u02d9\u0003`0\u0000\u02d7\u02d9\u0003b1\u0000\u02d8\u02d5"+
		"\u0001\u0000\u0000\u0000\u02d8\u02d6\u0001\u0000\u0000\u0000\u02d8\u02d7"+
		"\u0001\u0000\u0000\u0000\u02d9]\u0001\u0000\u0000\u0000\u02da\u02db\u0005"+
		"\u001f\u0000\u0000\u02db\u02dc\u0005X\u0000\u0000\u02dc\u02e1\u0005L\u0000"+
		"\u0000\u02dd\u02de\u0005X\u0000\u0000\u02de\u02e0\u0005L\u0000\u0000\u02df"+
		"\u02dd\u0001\u0000\u0000\u0000\u02e0\u02e3\u0001\u0000\u0000\u0000\u02e1"+
		"\u02df\u0001\u0000\u0000\u0000\u02e1\u02e2\u0001\u0000\u0000\u0000\u02e2"+
		"_\u0001\u0000\u0000\u0000\u02e3\u02e1\u0001\u0000\u0000\u0000\u02e4\u02e7"+
		"\u0005L\u0000\u0000\u02e5\u02e6\u0005X\u0000\u0000\u02e6\u02e8\u0005L"+
		"\u0000\u0000\u02e7\u02e5\u0001\u0000\u0000\u0000\u02e8\u02e9\u0001\u0000"+
		"\u0000\u0000\u02e9\u02e7\u0001\u0000\u0000\u0000\u02e9\u02ea\u0001\u0000"+
		"\u0000\u0000\u02eaa\u0001\u0000\u0000\u0000\u02eb\u02ec\u0005\u001f\u0000"+
		"\u0000\u02ec\u02ed\u0005X\u0000\u0000\u02ed\u02ee\u0005L\u0000\u0000\u02ee"+
		"\u02ef\u0005X\u0000\u0000\u02ef\u02f0\u0005&\u0000\u0000\u02f0\u02f1\u0005"+
		"8\u0000\u0000\u02f1\u02f2\u00059\u0000\u0000\u02f2c\u0001\u0000\u0000"+
		"\u0000\u02f3\u02f4\u0003\\.\u0000\u02f4\u02fd\u00058\u0000\u0000\u02f5"+
		"\u02fa\u0003Z-\u0000\u02f6\u02f7\u0005;\u0000\u0000\u02f7\u02f9\u0003"+
		"Z-\u0000\u02f8\u02f6\u0001\u0000\u0000\u0000\u02f9\u02fc\u0001\u0000\u0000"+
		"\u0000\u02fa\u02f8\u0001\u0000\u0000\u0000\u02fa\u02fb\u0001\u0000\u0000"+
		"\u0000\u02fb\u02fe\u0001\u0000\u0000\u0000\u02fc\u02fa\u0001\u0000\u0000"+
		"\u0000\u02fd\u02f5\u0001\u0000\u0000\u0000\u02fd\u02fe\u0001\u0000\u0000"+
		"\u0000\u02fe\u02ff\u0001\u0000\u0000\u0000\u02ff\u0300\u00059\u0000\u0000"+
		"\u0300\u031b\u0001\u0000\u0000\u0000\u0301\u0302\u0005L\u0000\u0000\u0302"+
		"\u030b\u00058\u0000\u0000\u0303\u0308\u0003Z-\u0000\u0304\u0305\u0005"+
		";\u0000\u0000\u0305\u0307\u0003Z-\u0000\u0306\u0304\u0001\u0000\u0000"+
		"\u0000\u0307\u030a\u0001\u0000\u0000\u0000\u0308\u0306\u0001\u0000\u0000"+
		"\u0000\u0308\u0309\u0001\u0000\u0000\u0000\u0309\u030c\u0001\u0000\u0000"+
		"\u0000\u030a\u0308\u0001\u0000\u0000\u0000\u030b\u0303\u0001\u0000\u0000"+
		"\u0000\u030b\u030c\u0001\u0000\u0000\u0000\u030c\u030d\u0001\u0000\u0000"+
		"\u0000\u030d\u031b\u00059\u0000\u0000\u030e\u030f\u0003\\.\u0000\u030f"+
		"\u0311\u00058\u0000\u0000\u0310\u0312\u0003h4\u0000\u0311\u0310\u0001"+
		"\u0000\u0000\u0000\u0311\u0312\u0001\u0000\u0000\u0000\u0312\u0313\u0001"+
		"\u0000\u0000\u0000\u0313\u0314\u00059\u0000\u0000\u0314\u031b\u0001\u0000"+
		"\u0000\u0000\u0315\u0316\u0003\\.\u0000\u0316\u0317\u00058\u0000\u0000"+
		"\u0317\u0318\u00059\u0000\u0000\u0318\u0319\u0005<\u0000\u0000\u0319\u031b"+
		"\u0001\u0000\u0000\u0000\u031a\u02f3\u0001\u0000\u0000\u0000\u031a\u0301"+
		"\u0001\u0000\u0000\u0000\u031a\u030e\u0001\u0000\u0000\u0000\u031a\u0315"+
		"\u0001\u0000\u0000\u0000\u031be\u0001\u0000\u0000\u0000\u031c\u031d\u0005"+
		"\u001d\u0000\u0000\u031d\u031e\u00058\u0000\u0000\u031e\u0323\u0003T*"+
		"\u0000\u031f\u0320\u0005;\u0000\u0000\u0320\u0322\u0003T*\u0000\u0321"+
		"\u031f\u0001\u0000\u0000\u0000\u0322\u0325\u0001\u0000\u0000\u0000\u0323"+
		"\u0321\u0001\u0000\u0000\u0000\u0323\u0324\u0001\u0000\u0000\u0000\u0324"+
		"\u0326\u0001\u0000\u0000\u0000\u0325\u0323\u0001\u0000\u0000\u0000\u0326"+
		"\u0329\u00059\u0000\u0000\u0327\u0328\u0005:\u0000\u0000\u0328\u032a\u0005"+
		"(\u0000\u0000\u0329\u0327\u0001\u0000\u0000\u0000\u0329\u032a\u0001\u0000"+
		"\u0000\u0000\u032a\u032b\u0001\u0000\u0000\u0000\u032b\u032f\u00052\u0000"+
		"\u0000\u032c\u032e\u0003X,\u0000\u032d\u032c\u0001\u0000\u0000\u0000\u032e"+
		"\u0331\u0001\u0000\u0000\u0000\u032f\u032d\u0001\u0000\u0000\u0000\u032f"+
		"\u0330\u0001\u0000\u0000\u0000\u0330\u0332\u0001\u0000\u0000\u0000\u0331"+
		"\u032f\u0001\u0000\u0000\u0000\u0332\u0333\u00053\u0000\u0000\u0333g\u0001"+
		"\u0000\u0000\u0000\u0334\u0339\u0003Z-\u0000\u0335\u0336\u0005;\u0000"+
		"\u0000\u0336\u0338\u0003Z-\u0000\u0337\u0335\u0001\u0000\u0000\u0000\u0338"+
		"\u033b\u0001\u0000\u0000\u0000\u0339\u0337\u0001\u0000\u0000\u0000\u0339"+
		"\u033a\u0001\u0000\u0000\u0000\u033ai\u0001\u0000\u0000\u0000\u033b\u0339"+
		"\u0001\u0000\u0000\u0000\u033c\u0345\u00056\u0000\u0000\u033d\u0342\u0003"+
		"Z-\u0000\u033e\u033f\u0005;\u0000\u0000\u033f\u0341\u0003Z-\u0000\u0340"+
		"\u033e\u0001\u0000\u0000\u0000\u0341\u0344\u0001\u0000\u0000\u0000\u0342"+
		"\u0340\u0001\u0000\u0000\u0000\u0342\u0343\u0001\u0000\u0000\u0000\u0343"+
		"\u0346\u0001\u0000\u0000\u0000\u0344\u0342\u0001\u0000\u0000\u0000\u0345"+
		"\u033d\u0001\u0000\u0000\u0000\u0345\u0346\u0001\u0000\u0000\u0000\u0346"+
		"\u0347\u0001\u0000\u0000\u0000\u0347\u0348\u00057\u0000\u0000\u0348k\u0001"+
		"\u0000\u0000\u0000\u0349\u034b\u0005\u0004\u0000\u0000\u034a\u0349\u0001"+
		"\u0000\u0000\u0000\u034a\u034b\u0001\u0000\u0000\u0000\u034b\u034c\u0001"+
		"\u0000\u0000\u0000\u034c\u034d\u0005\u000e\u0000\u0000\u034d\u034e\u0005"+
		"L\u0000\u0000\u034e\u034f\u00052\u0000\u0000\u034f\u0350\u0003n7\u0000"+
		"\u0350\u0351\u00053\u0000\u0000\u0351m\u0001\u0000\u0000\u0000\u0352\u0354"+
		"\u0003p8\u0000\u0353\u0352\u0001\u0000\u0000\u0000\u0354\u0357\u0001\u0000"+
		"\u0000\u0000\u0355\u0353\u0001\u0000\u0000\u0000\u0355\u0356\u0001\u0000"+
		"\u0000\u0000\u0356o\u0001\u0000\u0000\u0000\u0357\u0355\u0001\u0000\u0000"+
		"\u0000\u0358\u035b\u0003r9\u0000\u0359\u035b\u0003t:\u0000\u035a\u0358"+
		"\u0001\u0000\u0000\u0000\u035a\u0359\u0001\u0000\u0000\u0000\u035bq\u0001"+
		"\u0000\u0000\u0000\u035c\u035d\u0005L\u0000\u0000\u035d\u035e\u0005:\u0000"+
		"\u0000\u035e\u035f\u0003.\u0017\u0000\u035f\u0360\u0005<\u0000\u0000\u0360"+
		"s\u0001\u0000\u0000\u0000\u0361\u0362\u0005L\u0000\u0000\u0362\u0364\u0005"+
		"8\u0000\u0000\u0363\u0365\u0003v;\u0000\u0364\u0363\u0001\u0000\u0000"+
		"\u0000\u0364\u0365\u0001\u0000\u0000\u0000\u0365\u0366\u0001\u0000\u0000"+
		"\u0000\u0366\u0367\u00059\u0000\u0000\u0367\u0368\u0005:\u0000\u0000\u0368"+
		"\u0369\u0003.\u0017\u0000\u0369\u036a\u0005<\u0000\u0000\u036au\u0001"+
		"\u0000\u0000\u0000\u036b\u0370\u0003x<\u0000\u036c\u036d\u0005;\u0000"+
		"\u0000\u036d\u036f\u0003x<\u0000\u036e\u036c\u0001\u0000\u0000\u0000\u036f"+
		"\u0372\u0001\u0000\u0000\u0000\u0370\u036e\u0001\u0000\u0000\u0000\u0370"+
		"\u0371\u0001\u0000\u0000\u0000\u0371w\u0001\u0000\u0000\u0000\u0372\u0370"+
		"\u0001\u0000\u0000\u0000\u0373\u0374\u0005L\u0000\u0000\u0374\u0375\u0005"+
		":\u0000\u0000\u0375\u0376\u0003.\u0017\u0000\u0376y\u0001\u0000\u0000"+
		"\u0000\u0377\u0378\u0005\'\u0000\u0000\u0378\u0379\u00058\u0000\u0000"+
		"\u0379\u037a\u00059\u0000\u0000\u037a\u037b\u00052\u0000\u0000\u037b\u037c"+
		"\u00030\u0018\u0000\u037c\u037d\u00058\u0000\u0000\u037d\u037e\u0003Z"+
		"-\u0000\u037e\u037f\u00059\u0000\u0000\u037f\u0380\u0005<\u0000\u0000"+
		"\u0380\u0381\u00053\u0000\u0000\u0381{\u0001\u0000\u0000\u0000\u0382\u0383"+
		"\u00030\u0018\u0000\u0383\u0384\u00056\u0000\u0000\u0384\u0385\u00057"+
		"\u0000\u0000\u0385\u038c\u0001\u0000\u0000\u0000\u0386\u0387\u0005 \u0000"+
		"\u0000\u0387\u0388\u0005Q\u0000\u0000\u0388\u0389\u00030\u0018\u0000\u0389"+
		"\u038a\u0005R\u0000\u0000\u038a\u038c\u0001\u0000\u0000\u0000\u038b\u0382"+
		"\u0001\u0000\u0000\u0000\u038b\u0386\u0001\u0000\u0000\u0000\u038c}\u0001"+
		"\u0000\u0000\u0000\u038d\u038e\u0005+\u0000\u0000\u038e\u038f\u00058\u0000"+
		"\u0000\u038f\u0390\u00059\u0000\u0000\u0390\u0391\u0003\u0080@\u0000\u0391"+
		"\u0392\u0005<\u0000\u0000\u0392\u007f\u0001\u0000\u0000\u0000\u0393\u0394"+
		"\u0005L\u0000\u0000\u0394\u0395\u0005=\u0000\u0000\u0395\u0396\u0005-"+
		"\u0000\u0000\u0396\u039b\u0005L\u0000\u0000\u0397\u0398\u0005Q\u0000\u0000"+
		"\u0398\u0399\u0003.\u0017\u0000\u0399\u039a\u0005R\u0000\u0000\u039a\u039c"+
		"\u0001\u0000\u0000\u0000\u039b\u0397\u0001\u0000\u0000\u0000\u039b\u039c"+
		"\u0001\u0000\u0000\u0000\u039c\u039d\u0001\u0000\u0000\u0000\u039d\u039e"+
		"\u00058\u0000\u0000\u039e\u039f\u00059\u0000\u0000\u039f\u0081\u0001\u0000"+
		"\u0000\u0000\u03a0\u03a5\u0003Z-\u0000\u03a1\u03a2\u0005;\u0000\u0000"+
		"\u03a2\u03a4\u0003Z-\u0000\u03a3\u03a1\u0001\u0000\u0000\u0000\u03a4\u03a7"+
		"\u0001\u0000\u0000\u0000\u03a5\u03a3\u0001\u0000\u0000\u0000\u03a5\u03a6"+
		"\u0001\u0000\u0000\u0000\u03a6\u0083\u0001\u0000\u0000\u0000\u03a7\u03a5"+
		"\u0001\u0000\u0000\u0000\u03a8\u03a9\u0005\u001e\u0000\u0000\u03a9\u03aa"+
		"\u00058\u0000\u0000\u03aa\u03ab\u00059\u0000\u0000\u03ab\u03ac\u0005:"+
		"\u0000\u0000\u03ac\u03ad\u0005(\u0000\u0000\u03ad\u03ae\u00052\u0000\u0000"+
		"\u03ae\u03af\u0003Z-\u0000\u03af\u03b0\u0005<\u0000\u0000\u03b0\u03b1"+
		"\u0001\u0000\u0000\u0000\u03b1\u03b2\u00053\u0000\u0000\u03b2\u0085\u0001"+
		"\u0000\u0000\u0000\u03b3\u03b4\u0005L\u0000\u0000\u03b4\u03b5\u0005=\u0000"+
		"\u0000\u03b5\u03b6\u00058\u0000\u0000\u03b6\u03b7\u0005L\u0000\u0000\u03b7"+
		"\u03b8\u00059\u0000\u0000\u03b8\u03b9\u0005E\u0000\u0000\u03b9\u03c2\u0003"+
		"\u0088D\u0000\u03ba\u03bc\u00058\u0000\u0000\u03bb\u03bd\u0003v;\u0000"+
		"\u03bc\u03bb\u0001\u0000\u0000\u0000\u03bc\u03bd\u0001\u0000\u0000\u0000"+
		"\u03bd\u03be\u0001\u0000\u0000\u0000\u03be\u03bf\u00059\u0000\u0000\u03bf"+
		"\u03c0\u0005E\u0000\u0000\u03c0\u03c2\u0003\u0088D\u0000\u03c1\u03b3\u0001"+
		"\u0000\u0000\u0000\u03c1\u03ba\u0001\u0000\u0000\u0000\u03c2\u0087\u0001"+
		"\u0000\u0000\u0000\u03c3\u03cd\u0003Z-\u0000\u03c4\u03c8\u00052\u0000"+
		"\u0000\u03c5\u03c7\u0003X,\u0000\u03c6\u03c5\u0001\u0000\u0000\u0000\u03c7"+
		"\u03ca\u0001\u0000\u0000\u0000\u03c8\u03c6\u0001\u0000\u0000\u0000\u03c8"+
		"\u03c9\u0001\u0000\u0000\u0000\u03c9\u03cb\u0001\u0000\u0000\u0000\u03ca"+
		"\u03c8\u0001\u0000\u0000\u0000\u03cb\u03cd\u00053\u0000\u0000\u03cc\u03c3"+
		"\u0001\u0000\u0000\u0000\u03cc\u03c4\u0001\u0000\u0000\u0000\u03cd\u0089"+
		"\u0001\u0000\u0000\u0000\u03ce\u03d1\u0005)\u0000\u0000\u03cf\u03d2\u0003"+
		"\u0082A\u0000\u03d0\u03d2\u0003Z-\u0000\u03d1\u03cf\u0001\u0000\u0000"+
		"\u0000\u03d1\u03d0\u0001\u0000\u0000\u0000\u03d2\u03d3\u0001\u0000\u0000"+
		"\u0000\u03d3\u03d4\u0005<\u0000\u0000\u03d4\u008b\u0001\u0000\u0000\u0000"+
		"\u03d5\u03d7\u0003\u008eG\u0000\u03d6\u03d5\u0001\u0000\u0000\u0000\u03d7"+
		"\u03d8\u0001\u0000\u0000\u0000\u03d8\u03d6\u0001\u0000\u0000\u0000\u03d8"+
		"\u03d9\u0001\u0000\u0000\u0000\u03d9\u008d\u0001\u0000\u0000\u0000\u03da"+
		"\u03df\u0003\u0090H\u0000\u03db\u03df\u0003\u0092I\u0000\u03dc\u03df\u0003"+
		"\u0094J\u0000\u03dd\u03df\u0003\u0096K\u0000\u03de\u03da\u0001\u0000\u0000"+
		"\u0000\u03de\u03db\u0001\u0000\u0000\u0000\u03de\u03dc\u0001\u0000\u0000"+
		"\u0000\u03de\u03dd\u0001\u0000\u0000\u0000\u03df\u008f\u0001\u0000\u0000"+
		"\u0000\u03e0\u03e4\u0003\u0098L\u0000\u03e1\u03e3\u0003\u00a0P\u0000\u03e2"+
		"\u03e1\u0001\u0000\u0000\u0000\u03e3\u03e6\u0001\u0000\u0000\u0000\u03e4"+
		"\u03e2\u0001\u0000\u0000\u0000\u03e4\u03e5\u0001\u0000\u0000\u0000\u03e5"+
		"\u03e7\u0001\u0000\u0000\u0000\u03e6\u03e4\u0001\u0000\u0000\u0000\u03e7"+
		"\u03eb\u0005R\u0000\u0000\u03e8\u03ea\u0003\u00a6S\u0000\u03e9\u03e8\u0001"+
		"\u0000\u0000\u0000\u03ea\u03ed\u0001\u0000\u0000\u0000\u03eb\u03e9\u0001"+
		"\u0000\u0000\u0000\u03eb\u03ec\u0001\u0000\u0000\u0000\u03ec\u03ee\u0001"+
		"\u0000\u0000\u0000\u03ed\u03eb\u0001\u0000\u0000\u0000\u03ee\u03ef\u0003"+
		"\u009aM\u0000\u03ef\u0091\u0001\u0000\u0000\u0000\u03f0\u03f4\u0003\u0098"+
		"L\u0000\u03f1\u03f3\u0003\u00a0P\u0000\u03f2\u03f1\u0001\u0000\u0000\u0000"+
		"\u03f3\u03f6\u0001\u0000\u0000\u0000\u03f4\u03f2\u0001\u0000\u0000\u0000"+
		"\u03f4\u03f5\u0001\u0000\u0000\u0000\u03f5\u03f7\u0001\u0000\u0000\u0000"+
		"\u03f6\u03f4\u0001\u0000\u0000\u0000\u03f7\u03f8\u0005D\u0000\u0000\u03f8"+
		"\u0093\u0001\u0000\u0000\u0000\u03f9\u03fd\u0003\u009cN\u0000\u03fa\u03fc"+
		"\u0003\u00a0P\u0000\u03fb\u03fa\u0001\u0000\u0000\u0000\u03fc\u03ff\u0001"+
		"\u0000\u0000\u0000\u03fd\u03fb\u0001\u0000\u0000\u0000\u03fd\u03fe\u0001"+
		"\u0000\u0000\u0000\u03fe\u0400\u0001\u0000\u0000\u0000\u03ff\u03fd\u0001"+
		"\u0000\u0000\u0000\u0400\u0404\u0005R\u0000\u0000\u0401\u0403\u0003\u00a6"+
		"S\u0000\u0402\u0401\u0001\u0000\u0000\u0000\u0403\u0406\u0001\u0000\u0000"+
		"\u0000\u0404\u0402\u0001\u0000\u0000\u0000\u0404\u0405\u0001\u0000\u0000"+
		"\u0000\u0405\u0407\u0001\u0000\u0000\u0000\u0406\u0404\u0001\u0000\u0000"+
		"\u0000\u0407\u0408\u0003\u009eO\u0000\u0408\u0095\u0001\u0000\u0000\u0000"+
		"\u0409\u040a\u0005Q\u0000\u0000\u040a\u040e\u0005P\u0000\u0000\u040b\u040d"+
		"\u0003\u00a0P\u0000\u040c\u040b\u0001\u0000\u0000\u0000\u040d\u0410\u0001"+
		"\u0000\u0000\u0000\u040e\u040c\u0001\u0000\u0000\u0000\u040e\u040f\u0001"+
		"\u0000\u0000\u0000\u040f\u0411\u0001\u0000\u0000\u0000\u0410\u040e\u0001"+
		"\u0000\u0000\u0000\u0411\u0415\u0005R\u0000\u0000\u0412\u0414\u0003\u00a6"+
		"S\u0000\u0413\u0412\u0001\u0000\u0000\u0000\u0414\u0417\u0001\u0000\u0000"+
		"\u0000\u0415\u0413\u0001\u0000\u0000\u0000\u0415\u0416\u0001\u0000\u0000"+
		"\u0000\u0416\u0418\u0001\u0000\u0000\u0000\u0417\u0415\u0001\u0000\u0000"+
		"\u0000\u0418\u0419\u0005`\u0000\u0000\u0419\u041a\u0005P\u0000\u0000\u041a"+
		"\u041b\u0005R\u0000\u0000\u041b\u0097\u0001\u0000\u0000\u0000\u041c\u041d"+
		"\u0005Q\u0000\u0000\u041d\u041e\u0005L\u0000\u0000\u041e\u0099\u0001\u0000"+
		"\u0000\u0000\u041f\u0420\u0005`\u0000\u0000\u0420\u0421\u0005L\u0000\u0000"+
		"\u0421\u0422\u0005R\u0000\u0000\u0422\u009b\u0001\u0000\u0000\u0000\u0423"+
		"\u0424\u0005Q\u0000\u0000\u0424\u0425\u0005\\\u0000\u0000\u0425\u009d"+
		"\u0001\u0000\u0000\u0000\u0426\u0427\u0005`\u0000\u0000\u0427\u0428\u0005"+
		"\\\u0000\u0000\u0428\u0429\u0005R\u0000\u0000\u0429\u009f\u0001\u0000"+
		"\u0000\u0000\u042a\u042b\u0005L\u0000\u0000\u042b\u042c\u0005=\u0000\u0000"+
		"\u042c\u0440\u0005F\u0000\u0000\u042d\u0440\u0005L\u0000\u0000\u042e\u0440"+
		"\u0003\u00a4R\u0000\u042f\u0440\u0003\u00a2Q\u0000\u0430\u0440\u0003\u00ac"+
		"V\u0000\u0431\u0440\u0003\u0096K\u0000\u0432\u0433\u00056\u0000\u0000"+
		"\u0433\u0434\u0005L\u0000\u0000\u0434\u0435\u00057\u0000\u0000\u0435\u0436"+
		"\u0005=\u0000\u0000\u0436\u0440\u0003Z-\u0000\u0437\u0438\u00058\u0000"+
		"\u0000\u0438\u0439\u0005L\u0000\u0000\u0439\u043a\u00059\u0000\u0000\u043a"+
		"\u043b\u0005=\u0000\u0000\u043b\u0440\u0003Z-\u0000\u043c\u043d\u0005"+
		"6\u0000\u0000\u043d\u043e\u0005L\u0000\u0000\u043e\u0440\u00057\u0000"+
		"\u0000\u043f\u042a\u0001\u0000\u0000\u0000\u043f\u042d\u0001\u0000\u0000"+
		"\u0000\u043f\u042e\u0001\u0000\u0000\u0000\u043f\u042f\u0001\u0000\u0000"+
		"\u0000\u043f\u0430\u0001\u0000\u0000\u0000\u043f\u0431\u0001\u0000\u0000"+
		"\u0000\u043f\u0432\u0001\u0000\u0000\u0000\u043f\u0437\u0001\u0000\u0000"+
		"\u0000\u043f\u043c\u0001\u0000\u0000\u0000\u0440\u00a1\u0001\u0000\u0000"+
		"\u0000\u0441\u0442\u0005]\u0000\u0000\u0442\u0443\u0005=\u0000\u0000\u0443"+
		"\u0444\u0003Z-\u0000\u0444\u00a3\u0001\u0000\u0000\u0000\u0445\u0446\u0005"+
		"[\u0000\u0000\u0446\u0447\u0005=\u0000\u0000\u0447\u0448\u0003Z-\u0000"+
		"\u0448\u00a5\u0001\u0000\u0000\u0000\u0449\u044d\u0003\u008cF\u0000\u044a"+
		"\u044d\u0003\u00aeW\u0000\u044b\u044d\u0003\u00a8T\u0000\u044c\u0449\u0001"+
		"\u0000\u0000\u0000\u044c\u044a\u0001\u0000\u0000\u0000\u044c\u044b\u0001"+
		"\u0000\u0000\u0000\u044d\u044e\u0001\u0000\u0000\u0000\u044e\u044c\u0001"+
		"\u0000\u0000\u0000\u044e\u044f\u0001\u0000\u0000\u0000\u044f\u00a7\u0001"+
		"\u0000\u0000\u0000\u0450\u0451\u0003\u00aaU\u0000\u0451\u00a9\u0001\u0000"+
		"\u0000\u0000\u0452\u0453\u00054\u0000\u0000\u0453\u0458\u0005L\u0000\u0000"+
		"\u0454\u0455\u0005X\u0000\u0000\u0455\u0457\u0005L\u0000\u0000\u0456\u0454"+
		"\u0001\u0000\u0000\u0000\u0457\u045a\u0001\u0000\u0000\u0000\u0458\u0456"+
		"\u0001\u0000\u0000\u0000\u0458\u0459\u0001\u0000\u0000\u0000\u0459\u045b"+
		"\u0001\u0000\u0000\u0000\u045a\u0458\u0001\u0000\u0000\u0000\u045b\u045c"+
		"\u00055\u0000\u0000\u045c\u00ab\u0001\u0000\u0000\u0000\u045d\u045e\u0005"+
		"8\u0000\u0000\u045e\u045f\u0005L\u0000\u0000\u045f\u0460\u00059\u0000"+
		"\u0000\u0460\u0461\u0005=\u0000\u0000\u0461\u0462\u0003Z-\u0000\u0462"+
		"\u00ad\u0001\u0000\u0000\u0000\u0463\u0464\u0007\u0003\u0000\u0000\u0464"+
		"\u00af\u0001\u0000\u0000\u0000\u0465\u0467\u0003\u00b2Y\u0000\u0466\u0465"+
		"\u0001\u0000\u0000\u0000\u0467\u0468\u0001\u0000\u0000\u0000\u0468\u0466"+
		"\u0001\u0000\u0000\u0000\u0468\u0469\u0001\u0000\u0000\u0000\u0469\u00b1"+
		"\u0001\u0000\u0000\u0000\u046a\u046b\u0003\u00b4Z\u0000\u046b\u046d\u0005"+
		"2\u0000\u0000\u046c\u046e\u0003\u00bc^\u0000\u046d\u046c\u0001\u0000\u0000"+
		"\u0000\u046e\u046f\u0001\u0000\u0000\u0000\u046f\u046d\u0001\u0000\u0000"+
		"\u0000\u046f\u0470\u0001\u0000\u0000\u0000\u0470\u0471\u0001\u0000\u0000"+
		"\u0000\u0471\u0472\u00053\u0000\u0000\u0472\u00b3\u0001\u0000\u0000\u0000"+
		"\u0473\u0477\u0003\u00b6[\u0000\u0474\u0477\u0003\u00b8\\\u0000\u0475"+
		"\u0477\u0003\u00ba]\u0000\u0476\u0473\u0001\u0000\u0000\u0000\u0476\u0474"+
		"\u0001\u0000\u0000\u0000\u0476\u0475\u0001\u0000\u0000\u0000\u0477\u00b5"+
		"\u0001\u0000\u0000\u0000\u0478\u0479\u0005X\u0000\u0000\u0479\u047a\u0005"+
		"L\u0000\u0000\u047a\u00b7\u0001\u0000\u0000\u0000\u047b\u047c\u0005@\u0000"+
		"\u0000\u047c\u047d\u0005L\u0000\u0000\u047d\u00b9\u0001\u0000\u0000\u0000"+
		"\u047e\u047f\u0003\u00b6[\u0000\u047f\u0480\u0005:\u0000\u0000\u0480\u0481"+
		"\u0005L\u0000\u0000\u0481\u00bb\u0001\u0000\u0000\u0000\u0482\u0483\u0003"+
		"\u00be_\u0000\u0483\u0484\u0005:\u0000\u0000\u0484\u0485\u0003\u00c0`"+
		"\u0000\u0485\u0486\u0005<\u0000\u0000\u0486\u00bd\u0001\u0000\u0000\u0000"+
		"\u0487\u048c\u0005L\u0000\u0000\u0488\u0489\u0005W\u0000\u0000\u0489\u048b"+
		"\u0005L\u0000\u0000\u048a\u0488\u0001\u0000\u0000\u0000\u048b\u048e\u0001"+
		"\u0000\u0000\u0000\u048c\u048a\u0001\u0000\u0000\u0000\u048c\u048d\u0001"+
		"\u0000\u0000\u0000\u048d\u00bf\u0001\u0000\u0000\u0000\u048e\u048c\u0001"+
		"\u0000\u0000\u0000\u048f\u0491\u0005I\u0000\u0000\u0490\u0492\u0005.\u0000"+
		"\u0000\u0491\u0490\u0001\u0000\u0000\u0000\u0491\u0492\u0001\u0000\u0000"+
		"\u0000\u0492\u0498\u0001\u0000\u0000\u0000\u0493\u0498\u0005?\u0000\u0000"+
		"\u0494\u0498\u0005L\u0000\u0000\u0495\u0498\u0005F\u0000\u0000\u0496\u0498"+
		"\u0003\u00c2a\u0000\u0497\u048f\u0001\u0000\u0000\u0000\u0497\u0493\u0001"+
		"\u0000\u0000\u0000\u0497\u0494\u0001\u0000\u0000\u0000\u0497\u0495\u0001"+
		"\u0000\u0000\u0000\u0497\u0496\u0001\u0000\u0000\u0000\u0498\u00c1\u0001"+
		"\u0000\u0000\u0000\u0499\u049a\u0005L\u0000\u0000\u049a\u049b\u00058\u0000"+
		"\u0000\u049b\u049c\u0003\u00c0`\u0000\u049c\u049d\u00059\u0000\u0000\u049d"+
		"\u00c3\u0001\u0000\u0000\u0000]\u00c7\u00d0\u00d9\u00f2\u00f8\u0101\u0119"+
		"\u012a\u0132\u013d\u0157\u0160\u016b\u0174\u0184\u0186\u018c\u0193\u01a2"+
		"\u01b5\u01b8\u01bf\u01d4\u01dd\u01e1\u01ed\u01f5\u01f9\u0203\u0210\u021d"+
		"\u0226\u022a\u023f\u0247\u024f\u0252\u0258\u0263\u0277\u0281\u0287\u02a5"+
		"\u02b2\u02d0\u02d2\u02d8\u02e1\u02e9\u02fa\u02fd\u0308\u030b\u0311\u031a"+
		"\u0323\u0329\u032f\u0339\u0342\u0345\u034a\u0355\u035a\u0364\u0370\u038b"+
		"\u039b\u03a5\u03bc\u03c1\u03c8\u03cc\u03d1\u03d8\u03de\u03e4\u03eb\u03f4"+
		"\u03fd\u0404\u040e\u0415\u043f\u044c\u044e\u0458\u0468\u046f\u0476\u048c"+
		"\u0491\u0497";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}