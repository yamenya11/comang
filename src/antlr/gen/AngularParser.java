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
		LET=15, CONST=16, IN=17, IF=18, ELSE=19, AT=20, PROVIDEDIN=21, SELECTOR=22, 
		TEMPLATE=23, TEMPLATEURL=24, STYLEURLS=25, ANY=26, CONSTRUCTOR=27, SELECTPRODUCT=28, 
		NGONINIT=29, THIS=30, ARRAY=31, PRIVATE=32, PUBLIC=33, PROTECTED=34, EXPORTAS=35, 
		INJECTABLE=36, GET_PRODUCTS=37, ONBUTTONCLICK=38, VOID=39, RETURN=40, 
		INPUT=41, OUTPUT=42, Input=43, NEW=44, IMPLEMENTS=45, EXTENDS=46, ONINIT=47, 
		OPEN_CURLY=48, CLOSE_CURLY=49, OPEN_DOUBLE_CURLY=50, CLOSE_DOUBLE_CURLY=51, 
		OPEN_SQUARE=52, CLOSE_SQUARE=53, OPEN_PAREN=54, CLOSE_PAREN=55, COLON=56, 
		COMMA=57, SEMICOLON=58, EQUALS=59, OR_OPERATOR=60, NOT_EQUAL=61, STRICT_NOT_EQUAL=62, 
		BACKTICK=63, HHH=64, ARROW=65, STRING=66, PLUS_PLUS=67, MINUS_MINUS=68, 
		NUMBER=69, INTEGER=70, PRICE=71, IDENTIFIER=72, LINE_COMMENT=73, BLOCK_COMMENT=74, 
		WS=75, BUTTON=76, LESS_THAN=77, GREATER_THAN=78, STAR=79, DIVIDE=80, MOD=81, 
		PLUS=82, MINUS=83, DOT=84, LS=85, Product=86, NG=87, FIXEDTAGNAME=88, 
		NI=89, NULL=90, ATTVALUE_VALUE=91, GG=92, ARABIC_TEXT=93;
	public static final int
		RULE_program = 0, RULE_application = 1, RULE_importStatement = 2, RULE_keyimport = 3, 
		RULE_component = 4, RULE_injectable = 5, RULE_metadata = 6, RULE_metadataEntry = 7, 
		RULE_providin = 8, RULE_templateurl = 9, RULE_selector = 10, RULE_basicMetadata = 11, 
		RULE_htmlMetadata = 12, RULE_classDeclaration = 13, RULE_classInheritance = 14, 
		RULE_getproduct = 15, RULE_products = 16, RULE_elementList = 17, RULE_element = 18, 
		RULE_pair = 19, RULE_value = 20, RULE_basevalue = 21, RULE_classBody = 22, 
		RULE_propertyDeclaration = 23, RULE_regularProperty = 24, RULE_letDeclaration = 25, 
		RULE_emptyArrayDeclaration = 26, RULE_constructor = 27, RULE_loopStatement = 28, 
		RULE_whileStatement = 29, RULE_switchStatement = 30, RULE_ifStatement = 31, 
		RULE_equalityExpression = 32, RULE_caseClause = 33, RULE_functionDeclaration = 34, 
		RULE_functionB = 35, RULE_propertystatment = 36, RULE_methodDeclaration = 37, 
		RULE_parameter = 38, RULE_modifiers = 39, RULE_statement = 40, RULE_expression = 41, 
		RULE_propertyAccess = 42, RULE_calfun = 43, RULE_iddot = 44, RULE_functhis = 45, 
		RULE_functionCall = 46, RULE_selectProduct = 47, RULE_argumentList = 48, 
		RULE_arrayLiteral = 49, RULE_interfaceDeclaration = 50, RULE_interfaceBody = 51, 
		RULE_interfaceMember = 52, RULE_propertySignature = 53, RULE_methodSignature = 54, 
		RULE_parameterList = 55, RULE_parameter2 = 56, RULE_onbutton = 57, RULE_arrayvalue = 58, 
		RULE_decorator = 59, RULE_propertyAssignment = 60, RULE_expressionList = 61, 
		RULE_ngOnInit = 62, RULE_lambdaExpression = 63, RULE_functionBody = 64, 
		RULE_returnStatement = 65, RULE_htmlElement = 66, RULE_htmlElementassist = 67, 
		RULE_standardHtmlElement = 68, RULE_selfClosingHtmlElement = 69, RULE_fixedHtmlElement = 70, 
		RULE_angularButton = 71, RULE_opentag = 72, RULE_closetag = 73, RULE_fixedtqg = 74, 
		RULE_closefixedtag = 75, RULE_htmlAttribute = 76, RULE_ngIf = 77, RULE_ngfor = 78, 
		RULE_htmlContent = 79, RULE_interp = 80, RULE_identifierChain = 81, RULE_eventBinding = 82, 
		RULE_textNode = 83;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "application", "importStatement", "keyimport", "component", 
			"injectable", "metadata", "metadataEntry", "providin", "templateurl", 
			"selector", "basicMetadata", "htmlMetadata", "classDeclaration", "classInheritance", 
			"getproduct", "products", "elementList", "element", "pair", "value", 
			"basevalue", "classBody", "propertyDeclaration", "regularProperty", "letDeclaration", 
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
			"identifierChain", "eventBinding", "textNode"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", null, "'from'", "'export'", "'class'", "'for'", "'function'", 
			"'console'", "'log'", "'while'", "'switch'", "'case'", "'default'", "'interface'", 
			"'let'", "'const'", "'in'", "'if'", "'else'", "'@'", "'providedIn'", 
			"'selector'", "'template'", "'templateUrl'", "'styleUrls'", "'any'", 
			"'constructor'", "'selectProduct'", "'ngOnInit'", "'this'", "'array'", 
			"'private'", "'public'", "'protected'", "'exportas'", "'@Injectable'", 
			"'getProducts'", "'onButtonClick'", "'void'", "'return'", "'@Input'", 
			"'@Output'", "'input'", "'new'", "'implements'", "'extends'", "'OnInit'", 
			"'{'", "'}'", "'{{'", "'}}'", "'['", "']'", "'('", "')'", "':'", "','", 
			"';'", "'='", "'|'", "'!='", "'!=='", "'`'", "'/>'", "'=>'", null, "'++'", 
			"'--'", null, null, null, null, null, null, null, "'button'", "'<'", 
			"'>'", "'*'", "'/'", "'%'", "'+'", "'-'", "'.'", null, "'product'", "'*ngFor'", 
			null, "'*ngIf'", "'null'", "'attvalue_value'", "'</'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMPORT", "COMPONENT", "FROM", "EXPORT", "CLASS", "FOR", "FUNICTION", 
			"CONSOLE", "LOG", "WHILE", "SWITCH", "CASE", "DEFAULT", "INTERFACE", 
			"LET", "CONST", "IN", "IF", "ELSE", "AT", "PROVIDEDIN", "SELECTOR", "TEMPLATE", 
			"TEMPLATEURL", "STYLEURLS", "ANY", "CONSTRUCTOR", "SELECTPRODUCT", "NGONINIT", 
			"THIS", "ARRAY", "PRIVATE", "PUBLIC", "PROTECTED", "EXPORTAS", "INJECTABLE", 
			"GET_PRODUCTS", "ONBUTTONCLICK", "VOID", "RETURN", "INPUT", "OUTPUT", 
			"Input", "NEW", "IMPLEMENTS", "EXTENDS", "ONINIT", "OPEN_CURLY", "CLOSE_CURLY", 
			"OPEN_DOUBLE_CURLY", "CLOSE_DOUBLE_CURLY", "OPEN_SQUARE", "CLOSE_SQUARE", 
			"OPEN_PAREN", "CLOSE_PAREN", "COLON", "COMMA", "SEMICOLON", "EQUALS", 
			"OR_OPERATOR", "NOT_EQUAL", "STRICT_NOT_EQUAL", "BACKTICK", "HHH", "ARROW", 
			"STRING", "PLUS_PLUS", "MINUS_MINUS", "NUMBER", "INTEGER", "PRICE", "IDENTIFIER", 
			"LINE_COMMENT", "BLOCK_COMMENT", "WS", "BUTTON", "LESS_THAN", "GREATER_THAN", 
			"STAR", "DIVIDE", "MOD", "PLUS", "MINUS", "DOT", "LS", "Product", "NG", 
			"FIXEDTAGNAME", "NI", "NULL", "ATTVALUE_VALUE", "GG", "ARABIC_TEXT"
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
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IMPORT) | (1L << COMPONENT) | (1L << EXPORT) | (1L << INJECTABLE))) != 0)) {
				{
				{
				setState(168);
				application();
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(174);
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
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				_localctx = new IMPORTLABELContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				importStatement();
				}
				break;
			case COMPONENT:
				_localctx = new COMPONENTLABELContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				component();
				}
				break;
			case EXPORT:
				_localctx = new CLASSLABELContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				classDeclaration();
				}
				break;
			case INJECTABLE:
				_localctx = new INJECTABLELABELContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(179);
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
			setState(182);
			match(IMPORT);
			setState(183);
			match(OPEN_CURLY);
			setState(184);
			keyimport();
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(185);
				match(COMMA);
				setState(186);
				keyimport();
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(192);
			match(CLOSE_CURLY);
			setState(193);
			match(FROM);
			setState(194);
			match(STRING);
			setState(195);
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
			setState(197);
			_la = _input.LA(1);
			if ( !(((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (ONINIT - 47)) | (1L << (STRING - 47)) | (1L << (IDENTIFIER - 47)))) != 0)) ) {
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
			setState(199);
			match(COMPONENT);
			setState(200);
			match(OPEN_PAREN);
			setState(201);
			match(OPEN_CURLY);
			setState(202);
			metadata();
			setState(203);
			match(CLOSE_CURLY);
			setState(204);
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
			setState(206);
			match(INJECTABLE);
			setState(207);
			match(OPEN_PAREN);
			setState(208);
			match(OPEN_CURLY);
			setState(209);
			metadata();
			setState(210);
			match(CLOSE_CURLY);
			setState(211);
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
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PROVIDEDIN) | (1L << SELECTOR) | (1L << TEMPLATE) | (1L << TEMPLATEURL))) != 0)) {
				{
				setState(213);
				metadataEntry();
				}
			}

			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(216);
				match(COMMA);
				setState(217);
				metadataEntry();
				}
				}
				setState(222);
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
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new BasicMetadataLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				basicMetadata();
				}
				break;
			case 2:
				_localctx = new HtmlMetadataLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				htmlMetadata();
				}
				break;
			case 3:
				_localctx = new SELECTORLABELContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(225);
				selector();
				}
				break;
			case 4:
				_localctx = new TAMPLATEURLLABELContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(226);
				templateurl();
				}
				break;
			case 5:
				_localctx = new PROVIDINLABELContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(227);
				providin();
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
			setState(230);
			match(PROVIDEDIN);
			setState(231);
			match(COLON);
			setState(232);
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
			setState(234);
			match(TEMPLATEURL);
			setState(235);
			match(COLON);
			setState(236);
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
			setState(238);
			match(SELECTOR);
			setState(239);
			match(COLON);
			setState(240);
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
			setState(242);
			match(TEMPLATE);
			setState(243);
			match(COLON);
			setState(244);
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
			setState(246);
			match(TEMPLATE);
			setState(247);
			match(COLON);
			setState(248);
			match(BACKTICK);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LESS_THAN) {
				{
				{
				setState(249);
				htmlElement();
				}
				}
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(255);
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
		enterRule(_localctx, 26, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(EXPORT);
			setState(258);
			match(CLASS);
			setState(259);
			match(IDENTIFIER);
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS || _la==EXTENDS) {
				{
				setState(260);
				classInheritance();
				}
			}

			setState(263);
			match(OPEN_CURLY);
			setState(264);
			classBody();
			setState(265);
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
		public TerminalNode EXTENDS() { return getToken(AngularParser.EXTENDS, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public TerminalNode IMPLEMENTS() { return getToken(AngularParser.IMPLEMENTS, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ClassInheritanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInheritance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassInheritance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassInheritance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassInheritance(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassInheritanceContext classInheritance() throws RecognitionException {
		ClassInheritanceContext _localctx = new ClassInheritanceContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_classInheritance);
		int _la;
		try {
			setState(278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXTENDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				match(EXTENDS);
				setState(268);
				match(IDENTIFIER);
				}
				break;
			case IMPLEMENTS:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				match(IMPLEMENTS);
				setState(270);
				value();
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(271);
					match(COMMA);
					setState(272);
					match(IDENTIFIER);
					}
					}
					setState(277);
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
		enterRule(_localctx, 30, RULE_getproduct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(GET_PRODUCTS);
			setState(281);
			match(OPEN_PAREN);
			setState(282);
			match(CLOSE_PAREN);
			setState(283);
			match(OPEN_CURLY);
			setState(284);
			match(RETURN);
			setState(285);
			match(OPEN_SQUARE);
			setState(286);
			elementList();
			setState(287);
			match(CLOSE_SQUARE);
			setState(288);
			match(SEMICOLON);
			setState(289);
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
		enterRule(_localctx, 32, RULE_products);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(IDENTIFIER);
			setState(292);
			match(EQUALS);
			setState(293);
			match(OPEN_SQUARE);
			setState(294);
			elementList();
			setState(295);
			match(CLOSE_SQUARE);
			setState(296);
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
		enterRule(_localctx, 34, RULE_elementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			element();
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(299);
				match(COMMA);
				setState(300);
				element();
				}
				}
				setState(305);
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
		enterRule(_localctx, 36, RULE_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(OPEN_CURLY);
			setState(307);
			pair();
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(308);
				match(COMMA);
				setState(309);
				pair();
				}
				}
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(315);
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
		enterRule(_localctx, 38, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			basevalue();
			setState(318);
			match(COLON);
			setState(319);
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
		enterRule(_localctx, 40, RULE_value);
		try {
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new BASEvalueLABELContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				basevalue();
				}
				break;
			case 2:
				_localctx = new ARRAYTAYPELABELContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
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
		enterRule(_localctx, 42, RULE_basevalue);
		try {
			setState(332);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new IDENTIFIRELABELContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				match(IDENTIFIER);
				}
				break;
			case STRING:
				_localctx = new STRINGLABELContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				match(STRING);
				}
				break;
			case NUMBER:
				_localctx = new NUMBERLABELContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(327);
				match(NUMBER);
				}
				break;
			case ANY:
				_localctx = new ANYLABELContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(328);
				match(ANY);
				}
				break;
			case VOID:
				_localctx = new VOIDLABELContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(329);
				match(VOID);
				}
				break;
			case ONINIT:
				_localctx = new ONINITLABELContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(330);
				match(ONINIT);
				}
				break;
			case NULL:
				_localctx = new NULLLABELContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(331);
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
		enterRule(_localctx, 44, RULE_classBody);
		int _la;
		try {
			_localctx = new ClassBodyLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << FUNICTION) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << IF) | (1L << CONSTRUCTOR) | (1L << SELECTPRODUCT) | (1L << NGONINIT) | (1L << THIS) | (1L << GET_PRODUCTS) | (1L << ONBUTTONCLICK) | (1L << RETURN) | (1L << OUTPUT) | (1L << OPEN_PAREN))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (STRING - 66)) | (1L << (NUMBER - 66)) | (1L << (INTEGER - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
				{
				setState(347);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(334);
					propertyDeclaration();
					}
					break;
				case 2:
					{
					setState(335);
					methodDeclaration();
					}
					break;
				case 3:
					{
					setState(336);
					constructor();
					}
					break;
				case 4:
					{
					setState(337);
					statement();
					}
					break;
				case 5:
					{
					setState(338);
					decorator();
					}
					break;
				case 6:
					{
					setState(339);
					ngOnInit();
					}
					break;
				case 7:
					{
					setState(340);
					selectProduct();
					}
					break;
				case 8:
					{
					setState(341);
					onbutton();
					}
					break;
				case 9:
					{
					setState(342);
					getproduct();
					}
					break;
				case 10:
					{
					setState(343);
					products();
					}
					break;
				case 11:
					{
					setState(344);
					lambdaExpression();
					}
					break;
				case 12:
					{
					setState(345);
					propertyAccess();
					}
					break;
				case 13:
					{
					setState(346);
					functionDeclaration();
					}
					break;
				}
				}
				setState(351);
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
		enterRule(_localctx, 46, RULE_propertyDeclaration);
		try {
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new PROPIRTYLABELContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				regularProperty();
				}
				break;
			case 2:
				_localctx = new VARIBALLABELContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				letDeclaration();
				}
				break;
			case 3:
				_localctx = new DDDContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(354);
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
		enterRule(_localctx, 48, RULE_regularProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(IDENTIFIER);
			setState(358);
			match(COLON);
			setState(359);
			value();
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(360);
				match(EQUALS);
				setState(361);
				expression(0);
				}
			}

			setState(364);
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
		public TerminalNode LET() { return getToken(AngularParser.LET, 0); }
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
		enterRule(_localctx, 50, RULE_letDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(LET);
			setState(367);
			match(IDENTIFIER);
			setState(368);
			match(COLON);
			setState(369);
			value();
			setState(370);
			match(EQUALS);
			setState(371);
			value();
			setState(372);
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
		enterRule(_localctx, 52, RULE_emptyArrayDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(IDENTIFIER);
			setState(375);
			match(COLON);
			setState(376);
			value();
			setState(377);
			match(OPEN_SQUARE);
			setState(378);
			match(CLOSE_SQUARE);
			setState(379);
			match(EQUALS);
			setState(380);
			match(OPEN_SQUARE);
			setState(381);
			match(CLOSE_SQUARE);
			setState(382);
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
		enterRule(_localctx, 54, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(CONSTRUCTOR);
			setState(385);
			match(OPEN_PAREN);
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & ((1L << (PRIVATE - 32)) | (1L << (PUBLIC - 32)) | (1L << (PROTECTED - 32)) | (1L << (IDENTIFIER - 32)))) != 0)) {
				{
				setState(386);
				parameter();
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(387);
					match(COMMA);
					setState(388);
					parameter();
					}
					}
					setState(393);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(396);
			match(CLOSE_PAREN);
			setState(397);
			match(OPEN_CURLY);
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << IF) | (1L << THIS) | (1L << RETURN) | (1L << OPEN_PAREN))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (STRING - 66)) | (1L << (NUMBER - 66)) | (1L << (INTEGER - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
				{
				{
				setState(398);
				statement();
				}
				}
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(404);
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
		public TerminalNode OPEN_CURLY() { return getToken(AngularParser.OPEN_CURLY, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(AngularParser.CLOSE_CURLY, 0); }
		public TerminalNode PLUS_PLUS() { return getToken(AngularParser.PLUS_PLUS, 0); }
		public TerminalNode MINUS_MINUS() { return getToken(AngularParser.MINUS_MINUS, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
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
		enterRule(_localctx, 56, RULE_loopStatement);
		int _la;
		try {
			setState(449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				match(FOR);
				setState(407);
				match(OPEN_PAREN);
				setState(408);
				match(LET);
				setState(409);
				match(IDENTIFIER);
				setState(410);
				match(EQUALS);
				setState(411);
				expression(0);
				setState(412);
				match(SEMICOLON);
				setState(413);
				expression(0);
				setState(414);
				match(SEMICOLON);
				setState(415);
				match(IDENTIFIER);
				setState(416);
				_la = _input.LA(1);
				if ( !(_la==PLUS_PLUS || _la==MINUS_MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(417);
				match(CLOSE_PAREN);
				setState(418);
				match(OPEN_CURLY);
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << IF) | (1L << THIS) | (1L << RETURN) | (1L << OPEN_PAREN))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (STRING - 66)) | (1L << (NUMBER - 66)) | (1L << (INTEGER - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
					{
					{
					setState(419);
					statement();
					}
					}
					setState(424);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(425);
				match(CLOSE_CURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
				match(FOR);
				setState(428);
				match(OPEN_PAREN);
				setState(429);
				match(LET);
				setState(430);
				match(IDENTIFIER);
				setState(431);
				match(IN);
				setState(432);
				match(IDENTIFIER);
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(433);
					match(DOT);
					setState(434);
					match(IDENTIFIER);
					}
					}
					setState(439);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(440);
				match(CLOSE_PAREN);
				setState(441);
				match(OPEN_CURLY);
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << IF) | (1L << THIS) | (1L << RETURN) | (1L << OPEN_PAREN))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (STRING - 66)) | (1L << (NUMBER - 66)) | (1L << (INTEGER - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
					{
					{
					setState(442);
					statement();
					}
					}
					setState(447);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(448);
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
		enterRule(_localctx, 58, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(WHILE);
			setState(452);
			match(OPEN_PAREN);
			setState(453);
			expression(0);
			setState(454);
			match(CLOSE_PAREN);
			setState(455);
			match(OPEN_CURLY);
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << IF) | (1L << THIS) | (1L << RETURN) | (1L << OPEN_PAREN))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (STRING - 66)) | (1L << (NUMBER - 66)) | (1L << (INTEGER - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
				{
				{
				setState(456);
				statement();
				}
				}
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(462);
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
		enterRule(_localctx, 60, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			match(SWITCH);
			setState(465);
			match(OPEN_PAREN);
			setState(466);
			expression(0);
			setState(467);
			match(CLOSE_PAREN);
			setState(468);
			match(OPEN_CURLY);
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(469);
				caseClause();
				}
				}
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(475);
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
		enterRule(_localctx, 62, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(IF);
			setState(478);
			match(OPEN_PAREN);
			setState(479);
			equalityExpression();
			setState(480);
			match(CLOSE_PAREN);
			setState(481);
			match(OPEN_CURLY);
			setState(485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << IF) | (1L << THIS) | (1L << RETURN) | (1L << OPEN_PAREN))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (STRING - 66)) | (1L << (NUMBER - 66)) | (1L << (INTEGER - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
				{
				{
				setState(482);
				statement();
				}
				}
				setState(487);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(488);
			match(CLOSE_CURLY);
			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(489);
				match(ELSE);
				setState(490);
				match(OPEN_CURLY);
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << IF) | (1L << THIS) | (1L << RETURN) | (1L << OPEN_PAREN))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (STRING - 66)) | (1L << (NUMBER - 66)) | (1L << (INTEGER - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
					{
					{
					setState(491);
					statement();
					}
					}
					setState(496);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(497);
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
		enterRule(_localctx, 64, RULE_equalityExpression);
		try {
			setState(519);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				_localctx = new StrictEqualityContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(500);
				expression(0);
				setState(501);
				match(EQUALS);
				setState(502);
				match(EQUALS);
				setState(503);
				match(EQUALS);
				setState(504);
				expression(0);
				}
				break;
			case 2:
				_localctx = new LooseEqualityContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(506);
				expression(0);
				setState(507);
				match(EQUALS);
				setState(508);
				match(EQUALS);
				setState(509);
				expression(0);
				}
				break;
			case 3:
				_localctx = new NotEqualityContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(511);
				expression(0);
				setState(512);
				match(NOT_EQUAL);
				setState(513);
				expression(0);
				}
				break;
			case 4:
				_localctx = new StrictNotEqualityContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(515);
				expression(0);
				setState(516);
				match(STRICT_NOT_EQUAL);
				setState(517);
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
		enterRule(_localctx, 66, RULE_caseClause);
		int _la;
		try {
			setState(538);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(521);
				match(CASE);
				setState(522);
				expression(0);
				setState(523);
				match(COLON);
				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << IF) | (1L << THIS) | (1L << RETURN) | (1L << OPEN_PAREN))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (STRING - 66)) | (1L << (NUMBER - 66)) | (1L << (INTEGER - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
					{
					{
					setState(524);
					statement();
					}
					}
					setState(529);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(530);
				match(DEFAULT);
				setState(531);
				match(COLON);
				setState(535);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << IF) | (1L << THIS) | (1L << RETURN) | (1L << OPEN_PAREN))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (STRING - 66)) | (1L << (NUMBER - 66)) | (1L << (INTEGER - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
					{
					{
					setState(532);
					statement();
					}
					}
					setState(537);
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
		enterRule(_localctx, 68, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			match(FUNICTION);
			setState(541);
			match(IDENTIFIER);
			setState(542);
			match(OPEN_PAREN);
			setState(544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(543);
				parameterList();
				}
			}

			setState(546);
			match(CLOSE_PAREN);
			setState(547);
			match(COLON);
			setState(548);
			value();
			setState(549);
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
		enterRule(_localctx, 70, RULE_functionB);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			match(OPEN_CURLY);
			setState(555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << IF) | (1L << THIS) | (1L << RETURN) | (1L << OPEN_PAREN))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (STRING - 66)) | (1L << (NUMBER - 66)) | (1L << (INTEGER - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
				{
				{
				setState(552);
				statement();
				}
				}
				setState(557);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(558);
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
		enterRule(_localctx, 72, RULE_propertystatment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			match(CONSOLE);
			setState(561);
			match(DOT);
			setState(562);
			match(LOG);
			setState(563);
			match(OPEN_PAREN);
			setState(564);
			expression(0);
			setState(565);
			match(CLOSE_PAREN);
			setState(566);
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
		enterRule(_localctx, 74, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			match(IDENTIFIER);
			setState(569);
			match(OPEN_PAREN);
			setState(570);
			parameter();
			setState(575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(571);
				match(COMMA);
				setState(572);
				parameter();
				}
				}
				setState(577);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(578);
			match(CLOSE_PAREN);
			setState(579);
			match(COLON);
			setState(580);
			value();
			setState(581);
			match(OPEN_CURLY);
			setState(585);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << IF) | (1L << THIS) | (1L << RETURN) | (1L << OPEN_PAREN))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (STRING - 66)) | (1L << (NUMBER - 66)) | (1L << (INTEGER - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
				{
				{
				setState(582);
				statement();
				}
				}
				setState(587);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(588);
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
		enterRule(_localctx, 76, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PUBLIC) | (1L << PROTECTED))) != 0)) {
				{
				setState(590);
				modifiers();
				}
			}

			setState(593);
			match(IDENTIFIER);
			setState(594);
			match(COLON);
			setState(595);
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
		enterRule(_localctx, 78, RULE_modifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
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
		enterRule(_localctx, 80, RULE_statement);
		try {
			setState(621);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				_localctx = new LABELED_STATEMENTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(599);
				match(IDENTIFIER);
				setState(600);
				match(COLON);
				setState(601);
				statement();
				}
				break;
			case 2:
				_localctx = new EXPRESSION_STATEMENTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(602);
				expression(0);
				setState(603);
				match(SEMICOLON);
				}
				break;
			case 3:
				_localctx = new IF_STATEMENTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(605);
				ifStatement();
				}
				break;
			case 4:
				_localctx = new LOOP_STATEMENTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(606);
				loopStatement();
				}
				break;
			case 5:
				_localctx = new SWITCH_STATEMENTContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(607);
				switchStatement();
				}
				break;
			case 6:
				_localctx = new METHOD_DECLARATION_STATEMENTContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(608);
				methodDeclaration();
				}
				break;
			case 7:
				_localctx = new PROPERTY_DECLARATION_STATEMENTContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(609);
				propertyDeclaration();
				}
				break;
			case 8:
				_localctx = new FUNCTION_CALL_STATEMENTContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(610);
				functionCall();
				setState(611);
				match(SEMICOLON);
				}
				break;
			case 9:
				_localctx = new ASSIGNMENT_STATEMENTContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(613);
				match(IDENTIFIER);
				setState(614);
				match(EQUALS);
				setState(615);
				expression(0);
				setState(616);
				match(SEMICOLON);
				}
				break;
			case 10:
				_localctx = new RETURN_STATEMENTContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(618);
				returnStatement();
				}
				break;
			case 11:
				_localctx = new PROPERTY_ACCESS_STATEMENTContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(619);
				propertyAccess();
				}
				break;
			case 12:
				_localctx = new CONSOLE_STATEMENTContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(620);
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
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				_localctx = new FUNCTIONCALLLABELContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(624);
				functionCall();
				}
				break;
			case 2:
				{
				_localctx = new EXPPROContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(625);
				propertyAccess();
				}
				break;
			case 3:
				{
				_localctx = new EXPPARENContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(626);
				match(OPEN_PAREN);
				setState(627);
				expression(0);
				setState(628);
				match(CLOSE_PAREN);
				}
				break;
			case 4:
				{
				_localctx = new EXPIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(630);
				match(IDENTIFIER);
				}
				break;
			case 5:
				{
				_localctx = new EXPSTRINGContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(631);
				match(STRING);
				}
				break;
			case 6:
				{
				_localctx = new EXPNUMBERContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(632);
				match(NUMBER);
				}
				break;
			case 7:
				{
				_localctx = new EXPINTEGERContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(633);
				match(INTEGER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(666);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(664);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						_localctx = new EXPPLUSContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(636);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(637);
						match(PLUS);
						setState(638);
						expression(18);
						}
						break;
					case 2:
						{
						_localctx = new EXPMINUSContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(639);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(640);
						match(MINUS);
						setState(641);
						expression(17);
						}
						break;
					case 3:
						{
						_localctx = new EXPEQUALSContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(642);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(643);
						match(EQUALS);
						setState(644);
						expression(16);
						}
						break;
					case 4:
						{
						_localctx = new EXPLESSContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(645);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(646);
						match(LESS_THAN);
						setState(647);
						expression(15);
						}
						break;
					case 5:
						{
						_localctx = new EXPGREATERContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(648);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(649);
						match(GREATER_THAN);
						setState(650);
						expression(14);
						}
						break;
					case 6:
						{
						_localctx = new EXPSTARContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(651);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(652);
						match(STAR);
						setState(653);
						expression(13);
						}
						break;
					case 7:
						{
						_localctx = new EXPDIVIDEContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(654);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(655);
						match(DIVIDE);
						setState(656);
						expression(12);
						}
						break;
					case 8:
						{
						_localctx = new EXPMODContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(657);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(658);
						match(MOD);
						setState(659);
						expression(11);
						}
						break;
					case 9:
						{
						_localctx = new EXPPLUSPLUSContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(660);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(661);
						match(PLUS_PLUS);
						}
						break;
					case 10:
						{
						_localctx = new EXPMINMINContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(662);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(663);
						match(MINUS_MINUS);
						}
						break;
					}
					} 
				}
				setState(668);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
		enterRule(_localctx, 84, RULE_propertyAccess);
		try {
			setState(672);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				_localctx = new CALFUNLABELContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(669);
				calfun();
				}
				break;
			case 2:
				_localctx = new IDDOTLABELContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(670);
				iddot();
				}
				break;
			case 3:
				_localctx = new FUNCTHISLABELContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(671);
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
		enterRule(_localctx, 86, RULE_calfun);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			match(THIS);
			setState(675);
			match(DOT);
			setState(676);
			match(IDENTIFIER);
			setState(681);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(677);
					match(DOT);
					setState(678);
					match(IDENTIFIER);
					}
					} 
				}
				setState(683);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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
		enterRule(_localctx, 88, RULE_iddot);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			match(IDENTIFIER);
			setState(687); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(685);
					match(DOT);
					setState(686);
					match(IDENTIFIER);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(689); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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
		enterRule(_localctx, 90, RULE_functhis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			match(THIS);
			setState(692);
			match(DOT);
			setState(693);
			match(IDENTIFIER);
			setState(694);
			match(DOT);
			setState(695);
			match(GET_PRODUCTS);
			setState(696);
			match(OPEN_PAREN);
			setState(697);
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
		enterRule(_localctx, 92, RULE_functionCall);
		int _la;
		try {
			setState(738);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(699);
				propertyAccess();
				setState(700);
				match(OPEN_PAREN);
				setState(709);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (THIS - 30)) | (1L << (OPEN_PAREN - 30)) | (1L << (STRING - 30)) | (1L << (NUMBER - 30)) | (1L << (INTEGER - 30)) | (1L << (IDENTIFIER - 30)))) != 0)) {
					{
					setState(701);
					expression(0);
					setState(706);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(702);
						match(COMMA);
						setState(703);
						expression(0);
						}
						}
						setState(708);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(711);
				match(CLOSE_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(713);
				match(IDENTIFIER);
				setState(714);
				match(OPEN_PAREN);
				setState(723);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (THIS - 30)) | (1L << (OPEN_PAREN - 30)) | (1L << (STRING - 30)) | (1L << (NUMBER - 30)) | (1L << (INTEGER - 30)) | (1L << (IDENTIFIER - 30)))) != 0)) {
					{
					setState(715);
					expression(0);
					setState(720);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(716);
						match(COMMA);
						setState(717);
						expression(0);
						}
						}
						setState(722);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(725);
				match(CLOSE_PAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(726);
				propertyAccess();
				setState(727);
				match(OPEN_PAREN);
				setState(729);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (THIS - 30)) | (1L << (OPEN_PAREN - 30)) | (1L << (STRING - 30)) | (1L << (NUMBER - 30)) | (1L << (INTEGER - 30)) | (1L << (IDENTIFIER - 30)))) != 0)) {
					{
					setState(728);
					argumentList();
					}
				}

				setState(731);
				match(CLOSE_PAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(733);
				propertyAccess();
				setState(734);
				match(OPEN_PAREN);
				setState(735);
				match(CLOSE_PAREN);
				setState(736);
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
		enterRule(_localctx, 94, RULE_selectProduct);
		int _la;
		try {
			_localctx = new SELECTPRODUCTLABELContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
			match(SELECTPRODUCT);
			setState(741);
			match(OPEN_PAREN);
			setState(742);
			parameter();
			setState(747);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(743);
				match(COMMA);
				setState(744);
				parameter();
				}
				}
				setState(749);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(750);
			match(CLOSE_PAREN);
			setState(753);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(751);
				match(COLON);
				setState(752);
				match(VOID);
				}
			}

			setState(755);
			match(OPEN_CURLY);
			setState(759);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << IF) | (1L << THIS) | (1L << RETURN) | (1L << OPEN_PAREN))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (STRING - 66)) | (1L << (NUMBER - 66)) | (1L << (INTEGER - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
				{
				{
				setState(756);
				statement();
				}
				}
				setState(761);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(762);
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
		enterRule(_localctx, 96, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(764);
			expression(0);
			setState(769);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(765);
				match(COMMA);
				setState(766);
				expression(0);
				}
				}
				setState(771);
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
		enterRule(_localctx, 98, RULE_arrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			match(OPEN_SQUARE);
			setState(781);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (THIS - 30)) | (1L << (OPEN_PAREN - 30)) | (1L << (STRING - 30)) | (1L << (NUMBER - 30)) | (1L << (INTEGER - 30)) | (1L << (IDENTIFIER - 30)))) != 0)) {
				{
				setState(773);
				expression(0);
				setState(778);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(774);
					match(COMMA);
					setState(775);
					expression(0);
					}
					}
					setState(780);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(783);
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
		enterRule(_localctx, 100, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(786);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(785);
				match(EXPORT);
				}
			}

			setState(788);
			match(INTERFACE);
			setState(789);
			match(IDENTIFIER);
			setState(790);
			match(OPEN_CURLY);
			setState(791);
			interfaceBody();
			setState(792);
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
		enterRule(_localctx, 102, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(794);
				interfaceMember();
				}
				}
				setState(799);
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
		enterRule(_localctx, 104, RULE_interfaceMember);
		try {
			setState(802);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(800);
				propertySignature();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(801);
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
		enterRule(_localctx, 106, RULE_propertySignature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			match(IDENTIFIER);
			setState(805);
			match(COLON);
			setState(806);
			value();
			setState(807);
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
		enterRule(_localctx, 108, RULE_methodSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809);
			match(IDENTIFIER);
			setState(810);
			match(OPEN_PAREN);
			setState(812);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(811);
				parameterList();
				}
			}

			setState(814);
			match(CLOSE_PAREN);
			setState(815);
			match(COLON);
			setState(816);
			value();
			setState(817);
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
		enterRule(_localctx, 110, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
			parameter2();
			setState(824);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(820);
				match(COMMA);
				setState(821);
				parameter2();
				}
				}
				setState(826);
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
		enterRule(_localctx, 112, RULE_parameter2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
			match(IDENTIFIER);
			setState(828);
			match(COLON);
			setState(829);
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
		enterRule(_localctx, 114, RULE_onbutton);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
			match(ONBUTTONCLICK);
			setState(832);
			match(OPEN_PAREN);
			setState(833);
			match(CLOSE_PAREN);
			setState(834);
			match(OPEN_CURLY);
			setState(835);
			basevalue();
			setState(836);
			match(OPEN_PAREN);
			setState(837);
			expression(0);
			setState(838);
			match(CLOSE_PAREN);
			setState(839);
			match(SEMICOLON);
			setState(840);
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
		enterRule(_localctx, 116, RULE_arrayvalue);
		try {
			setState(851);
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
				setState(842);
				basevalue();
				setState(843);
				match(OPEN_SQUARE);
				setState(844);
				match(CLOSE_SQUARE);
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 2);
				{
				setState(846);
				match(ARRAY);
				setState(847);
				match(LESS_THAN);
				setState(848);
				basevalue();
				setState(849);
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
		enterRule(_localctx, 118, RULE_decorator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(853);
			match(OUTPUT);
			setState(854);
			match(OPEN_PAREN);
			setState(855);
			match(CLOSE_PAREN);
			setState(856);
			propertyAssignment();
			setState(857);
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
		enterRule(_localctx, 120, RULE_propertyAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(859);
			match(IDENTIFIER);
			setState(860);
			match(EQUALS);
			setState(861);
			match(NEW);
			setState(862);
			match(IDENTIFIER);
			setState(867);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(863);
				match(LESS_THAN);
				setState(864);
				value();
				setState(865);
				match(GREATER_THAN);
				}
			}

			setState(869);
			match(OPEN_PAREN);
			setState(870);
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
		enterRule(_localctx, 122, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(872);
			expression(0);
			setState(877);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(873);
				match(COMMA);
				setState(874);
				expression(0);
				}
				}
				setState(879);
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
		enterRule(_localctx, 124, RULE_ngOnInit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(880);
			match(NGONINIT);
			setState(881);
			match(OPEN_PAREN);
			setState(882);
			match(CLOSE_PAREN);
			setState(883);
			match(COLON);
			setState(884);
			match(VOID);
			setState(885);
			match(OPEN_CURLY);
			{
			setState(886);
			expression(0);
			}
			setState(887);
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
		enterRule(_localctx, 126, RULE_lambdaExpression);
		int _la;
		try {
			setState(903);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(889);
				match(IDENTIFIER);
				setState(890);
				match(EQUALS);
				setState(891);
				match(OPEN_PAREN);
				setState(892);
				match(IDENTIFIER);
				setState(893);
				match(CLOSE_PAREN);
				setState(894);
				match(ARROW);
				setState(895);
				functionBody();
				}
				break;
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(896);
				match(OPEN_PAREN);
				setState(898);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(897);
					parameterList();
					}
				}

				setState(900);
				match(CLOSE_PAREN);
				setState(901);
				match(ARROW);
				setState(902);
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
		enterRule(_localctx, 128, RULE_functionBody);
		int _la;
		try {
			setState(914);
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
				setState(905);
				expression(0);
				}
				break;
			case OPEN_CURLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(906);
				match(OPEN_CURLY);
				setState(910);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << IF) | (1L << THIS) | (1L << RETURN) | (1L << OPEN_PAREN))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (STRING - 66)) | (1L << (NUMBER - 66)) | (1L << (INTEGER - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
					{
					{
					setState(907);
					statement();
					}
					}
					setState(912);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(913);
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
		enterRule(_localctx, 130, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(916);
			match(RETURN);
			setState(919);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(917);
				expressionList();
				}
				break;
			case 2:
				{
				setState(918);
				expression(0);
				}
				break;
			}
			setState(921);
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
		enterRule(_localctx, 132, RULE_htmlElement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(924); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(923);
					htmlElementassist();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(926); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
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
		enterRule(_localctx, 134, RULE_htmlElementassist);
		try {
			setState(932);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				_localctx = new STANDERHTMLELEMNTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(928);
				standardHtmlElement();
				}
				break;
			case 2:
				_localctx = new SELFCLOSEHTMLELEMNTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(929);
				selfClosingHtmlElement();
				}
				break;
			case 3:
				_localctx = new FIXEDHTMLELEMNTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(930);
				fixedHtmlElement();
				}
				break;
			case 4:
				_localctx = new ANGULARBUTTONLABELContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(931);
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
		enterRule(_localctx, 136, RULE_standardHtmlElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(934);
			opentag();
			setState(938);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (OPEN_SQUARE - 52)) | (1L << (OPEN_PAREN - 52)) | (1L << (IDENTIFIER - 52)) | (1L << (LESS_THAN - 52)) | (1L << (NG - 52)) | (1L << (NI - 52)))) != 0)) {
				{
				{
				setState(935);
				htmlAttribute();
				}
				}
				setState(940);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(941);
			match(GREATER_THAN);
			setState(945);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & ((1L << (OPEN_DOUBLE_CURLY - 50)) | (1L << (COLON - 50)) | (1L << (STRING - 50)) | (1L << (WS - 50)) | (1L << (LESS_THAN - 50)) | (1L << (LS - 50)) | (1L << (ARABIC_TEXT - 50)))) != 0)) {
				{
				{
				setState(942);
				htmlContent();
				}
				}
				setState(947);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(948);
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
		enterRule(_localctx, 138, RULE_selfClosingHtmlElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(950);
			opentag();
			setState(954);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (OPEN_SQUARE - 52)) | (1L << (OPEN_PAREN - 52)) | (1L << (IDENTIFIER - 52)) | (1L << (LESS_THAN - 52)) | (1L << (NG - 52)) | (1L << (NI - 52)))) != 0)) {
				{
				{
				setState(951);
				htmlAttribute();
				}
				}
				setState(956);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(957);
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
		enterRule(_localctx, 140, RULE_fixedHtmlElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(959);
			fixedtqg();
			setState(963);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (OPEN_SQUARE - 52)) | (1L << (OPEN_PAREN - 52)) | (1L << (IDENTIFIER - 52)) | (1L << (LESS_THAN - 52)) | (1L << (NG - 52)) | (1L << (NI - 52)))) != 0)) {
				{
				{
				setState(960);
				htmlAttribute();
				}
				}
				setState(965);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(966);
			match(GREATER_THAN);
			setState(970);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & ((1L << (OPEN_DOUBLE_CURLY - 50)) | (1L << (COLON - 50)) | (1L << (STRING - 50)) | (1L << (WS - 50)) | (1L << (LESS_THAN - 50)) | (1L << (LS - 50)) | (1L << (ARABIC_TEXT - 50)))) != 0)) {
				{
				{
				setState(967);
				htmlContent();
				}
				}
				setState(972);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(973);
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
		enterRule(_localctx, 142, RULE_angularButton);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(975);
			match(LESS_THAN);
			setState(976);
			match(BUTTON);
			setState(980);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (OPEN_SQUARE - 52)) | (1L << (OPEN_PAREN - 52)) | (1L << (IDENTIFIER - 52)) | (1L << (LESS_THAN - 52)) | (1L << (NG - 52)) | (1L << (NI - 52)))) != 0)) {
				{
				{
				setState(977);
				htmlAttribute();
				}
				}
				setState(982);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(983);
			match(GREATER_THAN);
			setState(987);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & ((1L << (OPEN_DOUBLE_CURLY - 50)) | (1L << (COLON - 50)) | (1L << (STRING - 50)) | (1L << (WS - 50)) | (1L << (LESS_THAN - 50)) | (1L << (LS - 50)) | (1L << (ARABIC_TEXT - 50)))) != 0)) {
				{
				{
				setState(984);
				htmlContent();
				}
				}
				setState(989);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(990);
			match(GG);
			setState(991);
			match(BUTTON);
			setState(992);
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
		enterRule(_localctx, 144, RULE_opentag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(994);
			match(LESS_THAN);
			setState(995);
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
		enterRule(_localctx, 146, RULE_closetag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997);
			match(GG);
			setState(998);
			match(IDENTIFIER);
			setState(999);
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
		enterRule(_localctx, 148, RULE_fixedtqg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1001);
			match(LESS_THAN);
			setState(1002);
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
		enterRule(_localctx, 150, RULE_closefixedtag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1004);
			match(GG);
			setState(1005);
			match(FIXEDTAGNAME);
			setState(1006);
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
		enterRule(_localctx, 152, RULE_htmlAttribute);
		try {
			setState(1029);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				_localctx = new NORMALATTRIBUTEContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1008);
				match(IDENTIFIER);
				setState(1009);
				match(EQUALS);
				setState(1010);
				match(STRING);
				}
				break;
			case 2:
				_localctx = new SIMPLEATTRIBUTEContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1011);
				match(IDENTIFIER);
				}
				break;
			case 3:
				_localctx = new NGFORATTRIBUTEContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1012);
				ngfor();
				}
				break;
			case 4:
				_localctx = new NGIFATTRIBUTEContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1013);
				ngIf();
				}
				break;
			case 5:
				_localctx = new EVENTATTRIBUTEContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1014);
				eventBinding();
				}
				break;
			case 6:
				_localctx = new ANGULARBUTTONATTRIBUTEContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1015);
				angularButton();
				}
				break;
			case 7:
				_localctx = new PROPERTYBINDINGATTRIBUTEContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1016);
				match(OPEN_SQUARE);
				setState(1017);
				match(IDENTIFIER);
				setState(1018);
				match(CLOSE_SQUARE);
				setState(1019);
				match(EQUALS);
				setState(1020);
				expression(0);
				}
				break;
			case 8:
				_localctx = new EVENTBINDINGATTRIBUTEContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1021);
				match(OPEN_PAREN);
				setState(1022);
				match(IDENTIFIER);
				setState(1023);
				match(CLOSE_PAREN);
				setState(1024);
				match(EQUALS);
				setState(1025);
				expression(0);
				}
				break;
			case 9:
				_localctx = new EMPTYPROPERTYBINDINGATTRIBUTEContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1026);
				match(OPEN_SQUARE);
				setState(1027);
				match(IDENTIFIER);
				setState(1028);
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
		enterRule(_localctx, 154, RULE_ngIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1031);
			match(NI);
			setState(1032);
			match(EQUALS);
			setState(1033);
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
		enterRule(_localctx, 156, RULE_ngfor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1035);
			match(NG);
			setState(1036);
			match(EQUALS);
			setState(1037);
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
		enterRule(_localctx, 158, RULE_htmlContent);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1042); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(1042);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LESS_THAN:
						{
						setState(1039);
						htmlElement();
						}
						break;
					case COLON:
					case STRING:
					case WS:
					case LS:
					case ARABIC_TEXT:
						{
						setState(1040);
						textNode();
						}
						break;
					case OPEN_DOUBLE_CURLY:
						{
						setState(1041);
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
				setState(1044); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
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
		enterRule(_localctx, 160, RULE_interp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1046);
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
		enterRule(_localctx, 162, RULE_identifierChain);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1048);
			match(OPEN_DOUBLE_CURLY);
			setState(1049);
			match(IDENTIFIER);
			setState(1054);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(1050);
				match(DOT);
				setState(1051);
				match(IDENTIFIER);
				}
				}
				setState(1056);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1057);
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
		enterRule(_localctx, 164, RULE_eventBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1059);
			match(OPEN_PAREN);
			setState(1060);
			match(IDENTIFIER);
			setState(1061);
			match(CLOSE_PAREN);
			setState(1062);
			match(EQUALS);
			setState(1063);
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
		enterRule(_localctx, 166, RULE_textNode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1065);
			_la = _input.LA(1);
			if ( !(((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & ((1L << (COLON - 56)) | (1L << (STRING - 56)) | (1L << (WS - 56)) | (1L << (LS - 56)) | (1L << (ARABIC_TEXT - 56)))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 41:
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
		"\u0004\u0001]\u042c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0001\u0000\u0005\u0000"+
		"\u00aa\b\u0000\n\u0000\f\u0000\u00ad\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u00b5\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u00bc"+
		"\b\u0002\n\u0002\f\u0002\u00bf\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0003\u0006\u00d7\b\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"\u00db\b\u0006\n\u0006\f\u0006\u00de\t\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00e5\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0005\f\u00fb\b\f\n\f\f\f\u00fe\t\f\u0001\f\u0001\f"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0106\b\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0005\u000e\u0112\b\u000e\n\u000e\f\u000e\u0115\t\u000e\u0003"+
		"\u000e\u0117\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u012e"+
		"\b\u0011\n\u0011\f\u0011\u0131\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0005\u0012\u0137\b\u0012\n\u0012\f\u0012\u013a\t\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u0144\b\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u014d"+
		"\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0005\u0016\u015c\b\u0016\n\u0016\f\u0016\u015f\t\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0164\b\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u016b\b\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0005\u001b\u0186\b\u001b\n\u001b\f\u001b\u0189\t\u001b\u0003"+
		"\u001b\u018b\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u0190"+
		"\b\u001b\n\u001b\f\u001b\u0193\t\u001b\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0005\u001c\u01a5\b\u001c\n\u001c\f\u001c\u01a8\t\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u01b4\b\u001c\n"+
		"\u001c\f\u001c\u01b7\t\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005"+
		"\u001c\u01bc\b\u001c\n\u001c\f\u001c\u01bf\t\u001c\u0001\u001c\u0003\u001c"+
		"\u01c2\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0005\u001d\u01ca\b\u001d\n\u001d\f\u001d\u01cd\t\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0005\u001e\u01d7\b\u001e\n\u001e\f\u001e\u01da\t\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0005\u001f\u01e4\b\u001f\n\u001f\f\u001f\u01e7"+
		"\t\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u01ed"+
		"\b\u001f\n\u001f\f\u001f\u01f0\t\u001f\u0001\u001f\u0003\u001f\u01f3\b"+
		"\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 "+
		"\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0003 \u0208\b \u0001!\u0001!\u0001!\u0001!\u0005!\u020e\b!\n!\f!\u0211"+
		"\t!\u0001!\u0001!\u0001!\u0005!\u0216\b!\n!\f!\u0219\t!\u0003!\u021b\b"+
		"!\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u0221\b\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001#\u0001#\u0005#\u022a\b#\n#\f#\u022d\t#\u0001"+
		"#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0005%\u023e\b%\n%\f%\u0241\t%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0005%\u0248\b%\n%\f%\u024b\t%\u0001%\u0001%\u0001"+
		"&\u0003&\u0250\b&\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0003(\u026e\b(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0003)\u027b\b)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0005)\u0299\b)\n)\f)\u029c\t)\u0001*\u0001*\u0001"+
		"*\u0003*\u02a1\b*\u0001+\u0001+\u0001+\u0001+\u0001+\u0005+\u02a8\b+\n"+
		"+\f+\u02ab\t+\u0001,\u0001,\u0001,\u0004,\u02b0\b,\u000b,\f,\u02b1\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0005.\u02c1\b.\n.\f.\u02c4\t.\u0003.\u02c6\b.\u0001."+
		"\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0005.\u02cf\b.\n.\f.\u02d2"+
		"\t.\u0003.\u02d4\b.\u0001.\u0001.\u0001.\u0001.\u0003.\u02da\b.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0003.\u02e3\b.\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0005/\u02ea\b/\n/\f/\u02ed\t/\u0001/\u0001/\u0001"+
		"/\u0003/\u02f2\b/\u0001/\u0001/\u0005/\u02f6\b/\n/\f/\u02f9\t/\u0001/"+
		"\u0001/\u00010\u00010\u00010\u00050\u0300\b0\n0\f0\u0303\t0\u00011\u0001"+
		"1\u00011\u00011\u00051\u0309\b1\n1\f1\u030c\t1\u00031\u030e\b1\u00011"+
		"\u00011\u00012\u00032\u0313\b2\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00013\u00053\u031c\b3\n3\f3\u031f\t3\u00014\u00014\u00034\u0323\b4"+
		"\u00015\u00015\u00015\u00015\u00015\u00016\u00016\u00016\u00036\u032d"+
		"\b6\u00016\u00016\u00016\u00016\u00016\u00017\u00017\u00017\u00057\u0337"+
		"\b7\n7\f7\u033a\t7\u00018\u00018\u00018\u00018\u00019\u00019\u00019\u0001"+
		"9\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u0001:\u0001:\u0001"+
		":\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0003:\u0354\b:\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001<\u0001<\u0001<\u0001<\u0001<\u0001"+
		"<\u0001<\u0001<\u0003<\u0364\b<\u0001<\u0001<\u0001<\u0001=\u0001=\u0001"+
		"=\u0005=\u036c\b=\n=\f=\u036f\t=\u0001>\u0001>\u0001>\u0001>\u0001>\u0001"+
		">\u0001>\u0001>\u0001>\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001"+
		"?\u0001?\u0001?\u0003?\u0383\b?\u0001?\u0001?\u0001?\u0003?\u0388\b?\u0001"+
		"@\u0001@\u0001@\u0005@\u038d\b@\n@\f@\u0390\t@\u0001@\u0003@\u0393\b@"+
		"\u0001A\u0001A\u0001A\u0003A\u0398\bA\u0001A\u0001A\u0001B\u0004B\u039d"+
		"\bB\u000bB\fB\u039e\u0001C\u0001C\u0001C\u0001C\u0003C\u03a5\bC\u0001"+
		"D\u0001D\u0005D\u03a9\bD\nD\fD\u03ac\tD\u0001D\u0001D\u0005D\u03b0\bD"+
		"\nD\fD\u03b3\tD\u0001D\u0001D\u0001E\u0001E\u0005E\u03b9\bE\nE\fE\u03bc"+
		"\tE\u0001E\u0001E\u0001F\u0001F\u0005F\u03c2\bF\nF\fF\u03c5\tF\u0001F"+
		"\u0001F\u0005F\u03c9\bF\nF\fF\u03cc\tF\u0001F\u0001F\u0001G\u0001G\u0001"+
		"G\u0005G\u03d3\bG\nG\fG\u03d6\tG\u0001G\u0001G\u0005G\u03da\bG\nG\fG\u03dd"+
		"\tG\u0001G\u0001G\u0001G\u0001G\u0001H\u0001H\u0001H\u0001I\u0001I\u0001"+
		"I\u0001I\u0001J\u0001J\u0001J\u0001K\u0001K\u0001K\u0001K\u0001L\u0001"+
		"L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001"+
		"L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0003"+
		"L\u0406\bL\u0001M\u0001M\u0001M\u0001M\u0001N\u0001N\u0001N\u0001N\u0001"+
		"O\u0001O\u0001O\u0004O\u0413\bO\u000bO\fO\u0414\u0001P\u0001P\u0001Q\u0001"+
		"Q\u0001Q\u0001Q\u0005Q\u041d\bQ\nQ\fQ\u0420\tQ\u0001Q\u0001Q\u0001R\u0001"+
		"R\u0001R\u0001R\u0001R\u0001R\u0001S\u0001S\u0001S\u0000\u0001RT\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u0000\u0004\u0003\u0000//BBHH\u0001\u0000"+
		"CD\u0001\u0000 \"\u0005\u000088BBKKUU]]\u0467\u0000\u00ab\u0001\u0000"+
		"\u0000\u0000\u0002\u00b4\u0001\u0000\u0000\u0000\u0004\u00b6\u0001\u0000"+
		"\u0000\u0000\u0006\u00c5\u0001\u0000\u0000\u0000\b\u00c7\u0001\u0000\u0000"+
		"\u0000\n\u00ce\u0001\u0000\u0000\u0000\f\u00d6\u0001\u0000\u0000\u0000"+
		"\u000e\u00e4\u0001\u0000\u0000\u0000\u0010\u00e6\u0001\u0000\u0000\u0000"+
		"\u0012\u00ea\u0001\u0000\u0000\u0000\u0014\u00ee\u0001\u0000\u0000\u0000"+
		"\u0016\u00f2\u0001\u0000\u0000\u0000\u0018\u00f6\u0001\u0000\u0000\u0000"+
		"\u001a\u0101\u0001\u0000\u0000\u0000\u001c\u0116\u0001\u0000\u0000\u0000"+
		"\u001e\u0118\u0001\u0000\u0000\u0000 \u0123\u0001\u0000\u0000\u0000\""+
		"\u012a\u0001\u0000\u0000\u0000$\u0132\u0001\u0000\u0000\u0000&\u013d\u0001"+
		"\u0000\u0000\u0000(\u0143\u0001\u0000\u0000\u0000*\u014c\u0001\u0000\u0000"+
		"\u0000,\u015d\u0001\u0000\u0000\u0000.\u0163\u0001\u0000\u0000\u00000"+
		"\u0165\u0001\u0000\u0000\u00002\u016e\u0001\u0000\u0000\u00004\u0176\u0001"+
		"\u0000\u0000\u00006\u0180\u0001\u0000\u0000\u00008\u01c1\u0001\u0000\u0000"+
		"\u0000:\u01c3\u0001\u0000\u0000\u0000<\u01d0\u0001\u0000\u0000\u0000>"+
		"\u01dd\u0001\u0000\u0000\u0000@\u0207\u0001\u0000\u0000\u0000B\u021a\u0001"+
		"\u0000\u0000\u0000D\u021c\u0001\u0000\u0000\u0000F\u0227\u0001\u0000\u0000"+
		"\u0000H\u0230\u0001\u0000\u0000\u0000J\u0238\u0001\u0000\u0000\u0000L"+
		"\u024f\u0001\u0000\u0000\u0000N\u0255\u0001\u0000\u0000\u0000P\u026d\u0001"+
		"\u0000\u0000\u0000R\u027a\u0001\u0000\u0000\u0000T\u02a0\u0001\u0000\u0000"+
		"\u0000V\u02a2\u0001\u0000\u0000\u0000X\u02ac\u0001\u0000\u0000\u0000Z"+
		"\u02b3\u0001\u0000\u0000\u0000\\\u02e2\u0001\u0000\u0000\u0000^\u02e4"+
		"\u0001\u0000\u0000\u0000`\u02fc\u0001\u0000\u0000\u0000b\u0304\u0001\u0000"+
		"\u0000\u0000d\u0312\u0001\u0000\u0000\u0000f\u031d\u0001\u0000\u0000\u0000"+
		"h\u0322\u0001\u0000\u0000\u0000j\u0324\u0001\u0000\u0000\u0000l\u0329"+
		"\u0001\u0000\u0000\u0000n\u0333\u0001\u0000\u0000\u0000p\u033b\u0001\u0000"+
		"\u0000\u0000r\u033f\u0001\u0000\u0000\u0000t\u0353\u0001\u0000\u0000\u0000"+
		"v\u0355\u0001\u0000\u0000\u0000x\u035b\u0001\u0000\u0000\u0000z\u0368"+
		"\u0001\u0000\u0000\u0000|\u0370\u0001\u0000\u0000\u0000~\u0387\u0001\u0000"+
		"\u0000\u0000\u0080\u0392\u0001\u0000\u0000\u0000\u0082\u0394\u0001\u0000"+
		"\u0000\u0000\u0084\u039c\u0001\u0000\u0000\u0000\u0086\u03a4\u0001\u0000"+
		"\u0000\u0000\u0088\u03a6\u0001\u0000\u0000\u0000\u008a\u03b6\u0001\u0000"+
		"\u0000\u0000\u008c\u03bf\u0001\u0000\u0000\u0000\u008e\u03cf\u0001\u0000"+
		"\u0000\u0000\u0090\u03e2\u0001\u0000\u0000\u0000\u0092\u03e5\u0001\u0000"+
		"\u0000\u0000\u0094\u03e9\u0001\u0000\u0000\u0000\u0096\u03ec\u0001\u0000"+
		"\u0000\u0000\u0098\u0405\u0001\u0000\u0000\u0000\u009a\u0407\u0001\u0000"+
		"\u0000\u0000\u009c\u040b\u0001\u0000\u0000\u0000\u009e\u0412\u0001\u0000"+
		"\u0000\u0000\u00a0\u0416\u0001\u0000\u0000\u0000\u00a2\u0418\u0001\u0000"+
		"\u0000\u0000\u00a4\u0423\u0001\u0000\u0000\u0000\u00a6\u0429\u0001\u0000"+
		"\u0000\u0000\u00a8\u00aa\u0003\u0002\u0001\u0000\u00a9\u00a8\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ad\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00ae\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ae\u00af\u0005\u0000"+
		"\u0000\u0001\u00af\u0001\u0001\u0000\u0000\u0000\u00b0\u00b5\u0003\u0004"+
		"\u0002\u0000\u00b1\u00b5\u0003\b\u0004\u0000\u00b2\u00b5\u0003\u001a\r"+
		"\u0000\u00b3\u00b5\u0003\n\u0005\u0000\u00b4\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b1\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b5\u0003\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b7\u0005\u0001\u0000\u0000\u00b7\u00b8\u00050\u0000\u0000\u00b8"+
		"\u00bd\u0003\u0006\u0003\u0000\u00b9\u00ba\u00059\u0000\u0000\u00ba\u00bc"+
		"\u0003\u0006\u0003\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bc\u00bf"+
		"\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd\u00be"+
		"\u0001\u0000\u0000\u0000\u00be\u00c0\u0001\u0000\u0000\u0000\u00bf\u00bd"+
		"\u0001\u0000\u0000\u0000\u00c0\u00c1\u00051\u0000\u0000\u00c1\u00c2\u0005"+
		"\u0003\u0000\u0000\u00c2\u00c3\u0005B\u0000\u0000\u00c3\u00c4\u0005:\u0000"+
		"\u0000\u00c4\u0005\u0001\u0000\u0000\u0000\u00c5\u00c6\u0007\u0000\u0000"+
		"\u0000\u00c6\u0007\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005\u0002\u0000"+
		"\u0000\u00c8\u00c9\u00056\u0000\u0000\u00c9\u00ca\u00050\u0000\u0000\u00ca"+
		"\u00cb\u0003\f\u0006\u0000\u00cb\u00cc\u00051\u0000\u0000\u00cc\u00cd"+
		"\u00057\u0000\u0000\u00cd\t\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005"+
		"$\u0000\u0000\u00cf\u00d0\u00056\u0000\u0000\u00d0\u00d1\u00050\u0000"+
		"\u0000\u00d1\u00d2\u0003\f\u0006\u0000\u00d2\u00d3\u00051\u0000\u0000"+
		"\u00d3\u00d4\u00057\u0000\u0000\u00d4\u000b\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d7\u0003\u000e\u0007\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d7\u0001\u0000\u0000\u0000\u00d7\u00dc\u0001\u0000\u0000\u0000\u00d8"+
		"\u00d9\u00059\u0000\u0000\u00d9\u00db\u0003\u000e\u0007\u0000\u00da\u00d8"+
		"\u0001\u0000\u0000\u0000\u00db\u00de\u0001\u0000\u0000\u0000\u00dc\u00da"+
		"\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\r\u0001"+
		"\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00df\u00e5\u0003"+
		"\u0016\u000b\u0000\u00e0\u00e5\u0003\u0018\f\u0000\u00e1\u00e5\u0003\u0014"+
		"\n\u0000\u00e2\u00e5\u0003\u0012\t\u0000\u00e3\u00e5\u0003\u0010\b\u0000"+
		"\u00e4\u00df\u0001\u0000\u0000\u0000\u00e4\u00e0\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e1\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e5\u000f\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e7\u0005\u0015\u0000\u0000\u00e7\u00e8\u00058\u0000\u0000\u00e8"+
		"\u00e9\u0005B\u0000\u0000\u00e9\u0011\u0001\u0000\u0000\u0000\u00ea\u00eb"+
		"\u0005\u0018\u0000\u0000\u00eb\u00ec\u00058\u0000\u0000\u00ec\u00ed\u0005"+
		"B\u0000\u0000\u00ed\u0013\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005\u0016"+
		"\u0000\u0000\u00ef\u00f0\u00058\u0000\u0000\u00f0\u00f1\u0005B\u0000\u0000"+
		"\u00f1\u0015\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005\u0017\u0000\u0000"+
		"\u00f3\u00f4\u00058\u0000\u0000\u00f4\u00f5\u0005B\u0000\u0000\u00f5\u0017"+
		"\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005\u0017\u0000\u0000\u00f7\u00f8"+
		"\u00058\u0000\u0000\u00f8\u00fc\u0005?\u0000\u0000\u00f9\u00fb\u0003\u0084"+
		"B\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fe\u0001\u0000\u0000"+
		"\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000"+
		"\u0000\u00fd\u00ff\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000"+
		"\u0000\u00ff\u0100\u0005?\u0000\u0000\u0100\u0019\u0001\u0000\u0000\u0000"+
		"\u0101\u0102\u0005\u0004\u0000\u0000\u0102\u0103\u0005\u0005\u0000\u0000"+
		"\u0103\u0105\u0005H\u0000\u0000\u0104\u0106\u0003\u001c\u000e\u0000\u0105"+
		"\u0104\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106"+
		"\u0107\u0001\u0000\u0000\u0000\u0107\u0108\u00050\u0000\u0000\u0108\u0109"+
		"\u0003,\u0016\u0000\u0109\u010a\u00051\u0000\u0000\u010a\u001b\u0001\u0000"+
		"\u0000\u0000\u010b\u010c\u0005.\u0000\u0000\u010c\u0117\u0005H\u0000\u0000"+
		"\u010d\u010e\u0005-\u0000\u0000\u010e\u0113\u0003(\u0014\u0000\u010f\u0110"+
		"\u00059\u0000\u0000\u0110\u0112\u0005H\u0000\u0000\u0111\u010f\u0001\u0000"+
		"\u0000\u0000\u0112\u0115\u0001\u0000\u0000\u0000\u0113\u0111\u0001\u0000"+
		"\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u0117\u0001\u0000"+
		"\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0116\u010b\u0001\u0000"+
		"\u0000\u0000\u0116\u010d\u0001\u0000\u0000\u0000\u0117\u001d\u0001\u0000"+
		"\u0000\u0000\u0118\u0119\u0005%\u0000\u0000\u0119\u011a\u00056\u0000\u0000"+
		"\u011a\u011b\u00057\u0000\u0000\u011b\u011c\u00050\u0000\u0000\u011c\u011d"+
		"\u0005(\u0000\u0000\u011d\u011e\u00054\u0000\u0000\u011e\u011f\u0003\""+
		"\u0011\u0000\u011f\u0120\u00055\u0000\u0000\u0120\u0121\u0005:\u0000\u0000"+
		"\u0121\u0122\u00051\u0000\u0000\u0122\u001f\u0001\u0000\u0000\u0000\u0123"+
		"\u0124\u0005H\u0000\u0000\u0124\u0125\u0005;\u0000\u0000\u0125\u0126\u0005"+
		"4\u0000\u0000\u0126\u0127\u0003\"\u0011\u0000\u0127\u0128\u00055\u0000"+
		"\u0000\u0128\u0129\u0005:\u0000\u0000\u0129!\u0001\u0000\u0000\u0000\u012a"+
		"\u012f\u0003$\u0012\u0000\u012b\u012c\u00059\u0000\u0000\u012c\u012e\u0003"+
		"$\u0012\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012e\u0131\u0001\u0000"+
		"\u0000\u0000\u012f\u012d\u0001\u0000\u0000\u0000\u012f\u0130\u0001\u0000"+
		"\u0000\u0000\u0130#\u0001\u0000\u0000\u0000\u0131\u012f\u0001\u0000\u0000"+
		"\u0000\u0132\u0133\u00050\u0000\u0000\u0133\u0138\u0003&\u0013\u0000\u0134"+
		"\u0135\u00059\u0000\u0000\u0135\u0137\u0003&\u0013\u0000\u0136\u0134\u0001"+
		"\u0000\u0000\u0000\u0137\u013a\u0001\u0000\u0000\u0000\u0138\u0136\u0001"+
		"\u0000\u0000\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u0139\u013b\u0001"+
		"\u0000\u0000\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013b\u013c\u0005"+
		"1\u0000\u0000\u013c%\u0001\u0000\u0000\u0000\u013d\u013e\u0003*\u0015"+
		"\u0000\u013e\u013f\u00058\u0000\u0000\u013f\u0140\u0003(\u0014\u0000\u0140"+
		"\'\u0001\u0000\u0000\u0000\u0141\u0144\u0003*\u0015\u0000\u0142\u0144"+
		"\u0003t:\u0000\u0143\u0141\u0001\u0000\u0000\u0000\u0143\u0142\u0001\u0000"+
		"\u0000\u0000\u0144)\u0001\u0000\u0000\u0000\u0145\u014d\u0005H\u0000\u0000"+
		"\u0146\u014d\u0005B\u0000\u0000\u0147\u014d\u0005E\u0000\u0000\u0148\u014d"+
		"\u0005\u001a\u0000\u0000\u0149\u014d\u0005\'\u0000\u0000\u014a\u014d\u0005"+
		"/\u0000\u0000\u014b\u014d\u0005Z\u0000\u0000\u014c\u0145\u0001\u0000\u0000"+
		"\u0000\u014c\u0146\u0001\u0000\u0000\u0000\u014c\u0147\u0001\u0000\u0000"+
		"\u0000\u014c\u0148\u0001\u0000\u0000\u0000\u014c\u0149\u0001\u0000\u0000"+
		"\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014c\u014b\u0001\u0000\u0000"+
		"\u0000\u014d+\u0001\u0000\u0000\u0000\u014e\u015c\u0003.\u0017\u0000\u014f"+
		"\u015c\u0003J%\u0000\u0150\u015c\u00036\u001b\u0000\u0151\u015c\u0003"+
		"P(\u0000\u0152\u015c\u0003v;\u0000\u0153\u015c\u0003|>\u0000\u0154\u015c"+
		"\u0003^/\u0000\u0155\u015c\u0003r9\u0000\u0156\u015c\u0003\u001e\u000f"+
		"\u0000\u0157\u015c\u0003 \u0010\u0000\u0158\u015c\u0003~?\u0000\u0159"+
		"\u015c\u0003T*\u0000\u015a\u015c\u0003D\"\u0000\u015b\u014e\u0001\u0000"+
		"\u0000\u0000\u015b\u014f\u0001\u0000\u0000\u0000\u015b\u0150\u0001\u0000"+
		"\u0000\u0000\u015b\u0151\u0001\u0000\u0000\u0000\u015b\u0152\u0001\u0000"+
		"\u0000\u0000\u015b\u0153\u0001\u0000\u0000\u0000\u015b\u0154\u0001\u0000"+
		"\u0000\u0000\u015b\u0155\u0001\u0000\u0000\u0000\u015b\u0156\u0001\u0000"+
		"\u0000\u0000\u015b\u0157\u0001\u0000\u0000\u0000\u015b\u0158\u0001\u0000"+
		"\u0000\u0000\u015b\u0159\u0001\u0000\u0000\u0000\u015b\u015a\u0001\u0000"+
		"\u0000\u0000\u015c\u015f\u0001\u0000\u0000\u0000\u015d\u015b\u0001\u0000"+
		"\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000\u015e-\u0001\u0000\u0000"+
		"\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u0160\u0164\u00030\u0018\u0000"+
		"\u0161\u0164\u00032\u0019\u0000\u0162\u0164\u00034\u001a\u0000\u0163\u0160"+
		"\u0001\u0000\u0000\u0000\u0163\u0161\u0001\u0000\u0000\u0000\u0163\u0162"+
		"\u0001\u0000\u0000\u0000\u0164/\u0001\u0000\u0000\u0000\u0165\u0166\u0005"+
		"H\u0000\u0000\u0166\u0167\u00058\u0000\u0000\u0167\u016a\u0003(\u0014"+
		"\u0000\u0168\u0169\u0005;\u0000\u0000\u0169\u016b\u0003R)\u0000\u016a"+
		"\u0168\u0001\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000\u0000\u016b"+
		"\u016c\u0001\u0000\u0000\u0000\u016c\u016d\u0005:\u0000\u0000\u016d1\u0001"+
		"\u0000\u0000\u0000\u016e\u016f\u0005\u000f\u0000\u0000\u016f\u0170\u0005"+
		"H\u0000\u0000\u0170\u0171\u00058\u0000\u0000\u0171\u0172\u0003(\u0014"+
		"\u0000\u0172\u0173\u0005;\u0000\u0000\u0173\u0174\u0003(\u0014\u0000\u0174"+
		"\u0175\u0005:\u0000\u0000\u01753\u0001\u0000\u0000\u0000\u0176\u0177\u0005"+
		"H\u0000\u0000\u0177\u0178\u00058\u0000\u0000\u0178\u0179\u0003(\u0014"+
		"\u0000\u0179\u017a\u00054\u0000\u0000\u017a\u017b\u00055\u0000\u0000\u017b"+
		"\u017c\u0005;\u0000\u0000\u017c\u017d\u00054\u0000\u0000\u017d\u017e\u0005"+
		"5\u0000\u0000\u017e\u017f\u0005:\u0000\u0000\u017f5\u0001\u0000\u0000"+
		"\u0000\u0180\u0181\u0005\u001b\u0000\u0000\u0181\u018a\u00056\u0000\u0000"+
		"\u0182\u0187\u0003L&\u0000\u0183\u0184\u00059\u0000\u0000\u0184\u0186"+
		"\u0003L&\u0000\u0185\u0183\u0001\u0000\u0000\u0000\u0186\u0189\u0001\u0000"+
		"\u0000\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0187\u0188\u0001\u0000"+
		"\u0000\u0000\u0188\u018b\u0001\u0000\u0000\u0000\u0189\u0187\u0001\u0000"+
		"\u0000\u0000\u018a\u0182\u0001\u0000\u0000\u0000\u018a\u018b\u0001\u0000"+
		"\u0000\u0000\u018b\u018c\u0001\u0000\u0000\u0000\u018c\u018d\u00057\u0000"+
		"\u0000\u018d\u0191\u00050\u0000\u0000\u018e\u0190\u0003P(\u0000\u018f"+
		"\u018e\u0001\u0000\u0000\u0000\u0190\u0193\u0001\u0000\u0000\u0000\u0191"+
		"\u018f\u0001\u0000\u0000\u0000\u0191\u0192\u0001\u0000\u0000\u0000\u0192"+
		"\u0194\u0001\u0000\u0000\u0000\u0193\u0191\u0001\u0000\u0000\u0000\u0194"+
		"\u0195\u00051\u0000\u0000\u01957\u0001\u0000\u0000\u0000\u0196\u0197\u0005"+
		"\u0006\u0000\u0000\u0197\u0198\u00056\u0000\u0000\u0198\u0199\u0005\u000f"+
		"\u0000\u0000\u0199\u019a\u0005H\u0000\u0000\u019a\u019b\u0005;\u0000\u0000"+
		"\u019b\u019c\u0003R)\u0000\u019c\u019d\u0005:\u0000\u0000\u019d\u019e"+
		"\u0003R)\u0000\u019e\u019f\u0005:\u0000\u0000\u019f\u01a0\u0005H\u0000"+
		"\u0000\u01a0\u01a1\u0007\u0001\u0000\u0000\u01a1\u01a2\u00057\u0000\u0000"+
		"\u01a2\u01a6\u00050\u0000\u0000\u01a3\u01a5\u0003P(\u0000\u01a4\u01a3"+
		"\u0001\u0000\u0000\u0000\u01a5\u01a8\u0001\u0000\u0000\u0000\u01a6\u01a4"+
		"\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000\u0000\u01a7\u01a9"+
		"\u0001\u0000\u0000\u0000\u01a8\u01a6\u0001\u0000\u0000\u0000\u01a9\u01aa"+
		"\u00051\u0000\u0000\u01aa\u01c2\u0001\u0000\u0000\u0000\u01ab\u01ac\u0005"+
		"\u0006\u0000\u0000\u01ac\u01ad\u00056\u0000\u0000\u01ad\u01ae\u0005\u000f"+
		"\u0000\u0000\u01ae\u01af\u0005H\u0000\u0000\u01af\u01b0\u0005\u0011\u0000"+
		"\u0000\u01b0\u01b5\u0005H\u0000\u0000\u01b1\u01b2\u0005T\u0000\u0000\u01b2"+
		"\u01b4\u0005H\u0000\u0000\u01b3\u01b1\u0001\u0000\u0000\u0000\u01b4\u01b7"+
		"\u0001\u0000\u0000\u0000\u01b5\u01b3\u0001\u0000\u0000\u0000\u01b5\u01b6"+
		"\u0001\u0000\u0000\u0000\u01b6\u01b8\u0001\u0000\u0000\u0000\u01b7\u01b5"+
		"\u0001\u0000\u0000\u0000\u01b8\u01b9\u00057\u0000\u0000\u01b9\u01bd\u0005"+
		"0\u0000\u0000\u01ba\u01bc\u0003P(\u0000\u01bb\u01ba\u0001\u0000\u0000"+
		"\u0000\u01bc\u01bf\u0001\u0000\u0000\u0000\u01bd\u01bb\u0001\u0000\u0000"+
		"\u0000\u01bd\u01be\u0001\u0000\u0000\u0000\u01be\u01c0\u0001\u0000\u0000"+
		"\u0000\u01bf\u01bd\u0001\u0000\u0000\u0000\u01c0\u01c2\u00051\u0000\u0000"+
		"\u01c1\u0196\u0001\u0000\u0000\u0000\u01c1\u01ab\u0001\u0000\u0000\u0000"+
		"\u01c29\u0001\u0000\u0000\u0000\u01c3\u01c4\u0005\n\u0000\u0000\u01c4"+
		"\u01c5\u00056\u0000\u0000\u01c5\u01c6\u0003R)\u0000\u01c6\u01c7\u0005"+
		"7\u0000\u0000\u01c7\u01cb\u00050\u0000\u0000\u01c8\u01ca\u0003P(\u0000"+
		"\u01c9\u01c8\u0001\u0000\u0000\u0000\u01ca\u01cd\u0001\u0000\u0000\u0000"+
		"\u01cb\u01c9\u0001\u0000\u0000\u0000\u01cb\u01cc\u0001\u0000\u0000\u0000"+
		"\u01cc\u01ce\u0001\u0000\u0000\u0000\u01cd\u01cb\u0001\u0000\u0000\u0000"+
		"\u01ce\u01cf\u00051\u0000\u0000\u01cf;\u0001\u0000\u0000\u0000\u01d0\u01d1"+
		"\u0005\u000b\u0000\u0000\u01d1\u01d2\u00056\u0000\u0000\u01d2\u01d3\u0003"+
		"R)\u0000\u01d3\u01d4\u00057\u0000\u0000\u01d4\u01d8\u00050\u0000\u0000"+
		"\u01d5\u01d7\u0003B!\u0000\u01d6\u01d5\u0001\u0000\u0000\u0000\u01d7\u01da"+
		"\u0001\u0000\u0000\u0000\u01d8\u01d6\u0001\u0000\u0000\u0000\u01d8\u01d9"+
		"\u0001\u0000\u0000\u0000\u01d9\u01db\u0001\u0000\u0000\u0000\u01da\u01d8"+
		"\u0001\u0000\u0000\u0000\u01db\u01dc\u00051\u0000\u0000\u01dc=\u0001\u0000"+
		"\u0000\u0000\u01dd\u01de\u0005\u0012\u0000\u0000\u01de\u01df\u00056\u0000"+
		"\u0000\u01df\u01e0\u0003@ \u0000\u01e0\u01e1\u00057\u0000\u0000\u01e1"+
		"\u01e5\u00050\u0000\u0000\u01e2\u01e4\u0003P(\u0000\u01e3\u01e2\u0001"+
		"\u0000\u0000\u0000\u01e4\u01e7\u0001\u0000\u0000\u0000\u01e5\u01e3\u0001"+
		"\u0000\u0000\u0000\u01e5\u01e6\u0001\u0000\u0000\u0000\u01e6\u01e8\u0001"+
		"\u0000\u0000\u0000\u01e7\u01e5\u0001\u0000\u0000\u0000\u01e8\u01f2\u0005"+
		"1\u0000\u0000\u01e9\u01ea\u0005\u0013\u0000\u0000\u01ea\u01ee\u00050\u0000"+
		"\u0000\u01eb\u01ed\u0003P(\u0000\u01ec\u01eb\u0001\u0000\u0000\u0000\u01ed"+
		"\u01f0\u0001\u0000\u0000\u0000\u01ee\u01ec\u0001\u0000\u0000\u0000\u01ee"+
		"\u01ef\u0001\u0000\u0000\u0000\u01ef\u01f1\u0001\u0000\u0000\u0000\u01f0"+
		"\u01ee\u0001\u0000\u0000\u0000\u01f1\u01f3\u00051\u0000\u0000\u01f2\u01e9"+
		"\u0001\u0000\u0000\u0000\u01f2\u01f3\u0001\u0000\u0000\u0000\u01f3?\u0001"+
		"\u0000\u0000\u0000\u01f4\u01f5\u0003R)\u0000\u01f5\u01f6\u0005;\u0000"+
		"\u0000\u01f6\u01f7\u0005;\u0000\u0000\u01f7\u01f8\u0005;\u0000\u0000\u01f8"+
		"\u01f9\u0003R)\u0000\u01f9\u0208\u0001\u0000\u0000\u0000\u01fa\u01fb\u0003"+
		"R)\u0000\u01fb\u01fc\u0005;\u0000\u0000\u01fc\u01fd\u0005;\u0000\u0000"+
		"\u01fd\u01fe\u0003R)\u0000\u01fe\u0208\u0001\u0000\u0000\u0000\u01ff\u0200"+
		"\u0003R)\u0000\u0200\u0201\u0005=\u0000\u0000\u0201\u0202\u0003R)\u0000"+
		"\u0202\u0208\u0001\u0000\u0000\u0000\u0203\u0204\u0003R)\u0000\u0204\u0205"+
		"\u0005>\u0000\u0000\u0205\u0206\u0003R)\u0000\u0206\u0208\u0001\u0000"+
		"\u0000\u0000\u0207\u01f4\u0001\u0000\u0000\u0000\u0207\u01fa\u0001\u0000"+
		"\u0000\u0000\u0207\u01ff\u0001\u0000\u0000\u0000\u0207\u0203\u0001\u0000"+
		"\u0000\u0000\u0208A\u0001\u0000\u0000\u0000\u0209\u020a\u0005\f\u0000"+
		"\u0000\u020a\u020b\u0003R)\u0000\u020b\u020f\u00058\u0000\u0000\u020c"+
		"\u020e\u0003P(\u0000\u020d\u020c\u0001\u0000\u0000\u0000\u020e\u0211\u0001"+
		"\u0000\u0000\u0000\u020f\u020d\u0001\u0000\u0000\u0000\u020f\u0210\u0001"+
		"\u0000\u0000\u0000\u0210\u021b\u0001\u0000\u0000\u0000\u0211\u020f\u0001"+
		"\u0000\u0000\u0000\u0212\u0213\u0005\r\u0000\u0000\u0213\u0217\u00058"+
		"\u0000\u0000\u0214\u0216\u0003P(\u0000\u0215\u0214\u0001\u0000\u0000\u0000"+
		"\u0216\u0219\u0001\u0000\u0000\u0000\u0217\u0215\u0001\u0000\u0000\u0000"+
		"\u0217\u0218\u0001\u0000\u0000\u0000\u0218\u021b\u0001\u0000\u0000\u0000"+
		"\u0219\u0217\u0001\u0000\u0000\u0000\u021a\u0209\u0001\u0000\u0000\u0000"+
		"\u021a\u0212\u0001\u0000\u0000\u0000\u021bC\u0001\u0000\u0000\u0000\u021c"+
		"\u021d\u0005\u0007\u0000\u0000\u021d\u021e\u0005H\u0000\u0000\u021e\u0220"+
		"\u00056\u0000\u0000\u021f\u0221\u0003n7\u0000\u0220\u021f\u0001\u0000"+
		"\u0000\u0000\u0220\u0221\u0001\u0000\u0000\u0000\u0221\u0222\u0001\u0000"+
		"\u0000\u0000\u0222\u0223\u00057\u0000\u0000\u0223\u0224\u00058\u0000\u0000"+
		"\u0224\u0225\u0003(\u0014\u0000\u0225\u0226\u0003F#\u0000\u0226E\u0001"+
		"\u0000\u0000\u0000\u0227\u022b\u00050\u0000\u0000\u0228\u022a\u0003P("+
		"\u0000\u0229\u0228\u0001\u0000\u0000\u0000\u022a\u022d\u0001\u0000\u0000"+
		"\u0000\u022b\u0229\u0001\u0000\u0000\u0000\u022b\u022c\u0001\u0000\u0000"+
		"\u0000\u022c\u022e\u0001\u0000\u0000\u0000\u022d\u022b\u0001\u0000\u0000"+
		"\u0000\u022e\u022f\u00051\u0000\u0000\u022fG\u0001\u0000\u0000\u0000\u0230"+
		"\u0231\u0005\b\u0000\u0000\u0231\u0232\u0005T\u0000\u0000\u0232\u0233"+
		"\u0005\t\u0000\u0000\u0233\u0234\u00056\u0000\u0000\u0234\u0235\u0003"+
		"R)\u0000\u0235\u0236\u00057\u0000\u0000\u0236\u0237\u0005:\u0000\u0000"+
		"\u0237I\u0001\u0000\u0000\u0000\u0238\u0239\u0005H\u0000\u0000\u0239\u023a"+
		"\u00056\u0000\u0000\u023a\u023f\u0003L&\u0000\u023b\u023c\u00059\u0000"+
		"\u0000\u023c\u023e\u0003L&\u0000\u023d\u023b\u0001\u0000\u0000\u0000\u023e"+
		"\u0241\u0001\u0000\u0000\u0000\u023f\u023d\u0001\u0000\u0000\u0000\u023f"+
		"\u0240\u0001\u0000\u0000\u0000\u0240\u0242\u0001\u0000\u0000\u0000\u0241"+
		"\u023f\u0001\u0000\u0000\u0000\u0242\u0243\u00057\u0000\u0000\u0243\u0244"+
		"\u00058\u0000\u0000\u0244\u0245\u0003(\u0014\u0000\u0245\u0249\u00050"+
		"\u0000\u0000\u0246\u0248\u0003P(\u0000\u0247\u0246\u0001\u0000\u0000\u0000"+
		"\u0248\u024b\u0001\u0000\u0000\u0000\u0249\u0247\u0001\u0000\u0000\u0000"+
		"\u0249\u024a\u0001\u0000\u0000\u0000\u024a\u024c\u0001\u0000\u0000\u0000"+
		"\u024b\u0249\u0001\u0000\u0000\u0000\u024c\u024d\u00051\u0000\u0000\u024d"+
		"K\u0001\u0000\u0000\u0000\u024e\u0250\u0003N\'\u0000\u024f\u024e\u0001"+
		"\u0000\u0000\u0000\u024f\u0250\u0001\u0000\u0000\u0000\u0250\u0251\u0001"+
		"\u0000\u0000\u0000\u0251\u0252\u0005H\u0000\u0000\u0252\u0253\u00058\u0000"+
		"\u0000\u0253\u0254\u0003(\u0014\u0000\u0254M\u0001\u0000\u0000\u0000\u0255"+
		"\u0256\u0007\u0002\u0000\u0000\u0256O\u0001\u0000\u0000\u0000\u0257\u0258"+
		"\u0005H\u0000\u0000\u0258\u0259\u00058\u0000\u0000\u0259\u026e\u0003P"+
		"(\u0000\u025a\u025b\u0003R)\u0000\u025b\u025c\u0005:\u0000\u0000\u025c"+
		"\u026e\u0001\u0000\u0000\u0000\u025d\u026e\u0003>\u001f\u0000\u025e\u026e"+
		"\u00038\u001c\u0000\u025f\u026e\u0003<\u001e\u0000\u0260\u026e\u0003J"+
		"%\u0000\u0261\u026e\u0003.\u0017\u0000\u0262\u0263\u0003\\.\u0000\u0263"+
		"\u0264\u0005:\u0000\u0000\u0264\u026e\u0001\u0000\u0000\u0000\u0265\u0266"+
		"\u0005H\u0000\u0000\u0266\u0267\u0005;\u0000\u0000\u0267\u0268\u0003R"+
		")\u0000\u0268\u0269\u0005:\u0000\u0000\u0269\u026e\u0001\u0000\u0000\u0000"+
		"\u026a\u026e\u0003\u0082A\u0000\u026b\u026e\u0003T*\u0000\u026c\u026e"+
		"\u0003H$\u0000\u026d\u0257\u0001\u0000\u0000\u0000\u026d\u025a\u0001\u0000"+
		"\u0000\u0000\u026d\u025d\u0001\u0000\u0000\u0000\u026d\u025e\u0001\u0000"+
		"\u0000\u0000\u026d\u025f\u0001\u0000\u0000\u0000\u026d\u0260\u0001\u0000"+
		"\u0000\u0000\u026d\u0261\u0001\u0000\u0000\u0000\u026d\u0262\u0001\u0000"+
		"\u0000\u0000\u026d\u0265\u0001\u0000\u0000\u0000\u026d\u026a\u0001\u0000"+
		"\u0000\u0000\u026d\u026b\u0001\u0000\u0000\u0000\u026d\u026c\u0001\u0000"+
		"\u0000\u0000\u026eQ\u0001\u0000\u0000\u0000\u026f\u0270\u0006)\uffff\uffff"+
		"\u0000\u0270\u027b\u0003\\.\u0000\u0271\u027b\u0003T*\u0000\u0272\u0273"+
		"\u00056\u0000\u0000\u0273\u0274\u0003R)\u0000\u0274\u0275\u00057\u0000"+
		"\u0000\u0275\u027b\u0001\u0000\u0000\u0000\u0276\u027b\u0005H\u0000\u0000"+
		"\u0277\u027b\u0005B\u0000\u0000\u0278\u027b\u0005E\u0000\u0000\u0279\u027b"+
		"\u0005F\u0000\u0000\u027a\u026f\u0001\u0000\u0000\u0000\u027a\u0271\u0001"+
		"\u0000\u0000\u0000\u027a\u0272\u0001\u0000\u0000\u0000\u027a\u0276\u0001"+
		"\u0000\u0000\u0000\u027a\u0277\u0001\u0000\u0000\u0000\u027a\u0278\u0001"+
		"\u0000\u0000\u0000\u027a\u0279\u0001\u0000\u0000\u0000\u027b\u029a\u0001"+
		"\u0000\u0000\u0000\u027c\u027d\n\u0011\u0000\u0000\u027d\u027e\u0005R"+
		"\u0000\u0000\u027e\u0299\u0003R)\u0012\u027f\u0280\n\u0010\u0000\u0000"+
		"\u0280\u0281\u0005S\u0000\u0000\u0281\u0299\u0003R)\u0011\u0282\u0283"+
		"\n\u000f\u0000\u0000\u0283\u0284\u0005;\u0000\u0000\u0284\u0299\u0003"+
		"R)\u0010\u0285\u0286\n\u000e\u0000\u0000\u0286\u0287\u0005M\u0000\u0000"+
		"\u0287\u0299\u0003R)\u000f\u0288\u0289\n\r\u0000\u0000\u0289\u028a\u0005"+
		"N\u0000\u0000\u028a\u0299\u0003R)\u000e\u028b\u028c\n\f\u0000\u0000\u028c"+
		"\u028d\u0005O\u0000\u0000\u028d\u0299\u0003R)\r\u028e\u028f\n\u000b\u0000"+
		"\u0000\u028f\u0290\u0005P\u0000\u0000\u0290\u0299\u0003R)\f\u0291\u0292"+
		"\n\n\u0000\u0000\u0292\u0293\u0005Q\u0000\u0000\u0293\u0299\u0003R)\u000b"+
		"\u0294\u0295\n\u0007\u0000\u0000\u0295\u0299\u0005C\u0000\u0000\u0296"+
		"\u0297\n\u0006\u0000\u0000\u0297\u0299\u0005D\u0000\u0000\u0298\u027c"+
		"\u0001\u0000\u0000\u0000\u0298\u027f\u0001\u0000\u0000\u0000\u0298\u0282"+
		"\u0001\u0000\u0000\u0000\u0298\u0285\u0001\u0000\u0000\u0000\u0298\u0288"+
		"\u0001\u0000\u0000\u0000\u0298\u028b\u0001\u0000\u0000\u0000\u0298\u028e"+
		"\u0001\u0000\u0000\u0000\u0298\u0291\u0001\u0000\u0000\u0000\u0298\u0294"+
		"\u0001\u0000\u0000\u0000\u0298\u0296\u0001\u0000\u0000\u0000\u0299\u029c"+
		"\u0001\u0000\u0000\u0000\u029a\u0298\u0001\u0000\u0000\u0000\u029a\u029b"+
		"\u0001\u0000\u0000\u0000\u029bS\u0001\u0000\u0000\u0000\u029c\u029a\u0001"+
		"\u0000\u0000\u0000\u029d\u02a1\u0003V+\u0000\u029e\u02a1\u0003X,\u0000"+
		"\u029f\u02a1\u0003Z-\u0000\u02a0\u029d\u0001\u0000\u0000\u0000\u02a0\u029e"+
		"\u0001\u0000\u0000\u0000\u02a0\u029f\u0001\u0000\u0000\u0000\u02a1U\u0001"+
		"\u0000\u0000\u0000\u02a2\u02a3\u0005\u001e\u0000\u0000\u02a3\u02a4\u0005"+
		"T\u0000\u0000\u02a4\u02a9\u0005H\u0000\u0000\u02a5\u02a6\u0005T\u0000"+
		"\u0000\u02a6\u02a8\u0005H\u0000\u0000\u02a7\u02a5\u0001\u0000\u0000\u0000"+
		"\u02a8\u02ab\u0001\u0000\u0000\u0000\u02a9\u02a7\u0001\u0000\u0000\u0000"+
		"\u02a9\u02aa\u0001\u0000\u0000\u0000\u02aaW\u0001\u0000\u0000\u0000\u02ab"+
		"\u02a9\u0001\u0000\u0000\u0000\u02ac\u02af\u0005H\u0000\u0000\u02ad\u02ae"+
		"\u0005T\u0000\u0000\u02ae\u02b0\u0005H\u0000\u0000\u02af\u02ad\u0001\u0000"+
		"\u0000\u0000\u02b0\u02b1\u0001\u0000\u0000\u0000\u02b1\u02af\u0001\u0000"+
		"\u0000\u0000\u02b1\u02b2\u0001\u0000\u0000\u0000\u02b2Y\u0001\u0000\u0000"+
		"\u0000\u02b3\u02b4\u0005\u001e\u0000\u0000\u02b4\u02b5\u0005T\u0000\u0000"+
		"\u02b5\u02b6\u0005H\u0000\u0000\u02b6\u02b7\u0005T\u0000\u0000\u02b7\u02b8"+
		"\u0005%\u0000\u0000\u02b8\u02b9\u00056\u0000\u0000\u02b9\u02ba\u00057"+
		"\u0000\u0000\u02ba[\u0001\u0000\u0000\u0000\u02bb\u02bc\u0003T*\u0000"+
		"\u02bc\u02c5\u00056\u0000\u0000\u02bd\u02c2\u0003R)\u0000\u02be\u02bf"+
		"\u00059\u0000\u0000\u02bf\u02c1\u0003R)\u0000\u02c0\u02be\u0001\u0000"+
		"\u0000\u0000\u02c1\u02c4\u0001\u0000\u0000\u0000\u02c2\u02c0\u0001\u0000"+
		"\u0000\u0000\u02c2\u02c3\u0001\u0000\u0000\u0000\u02c3\u02c6\u0001\u0000"+
		"\u0000\u0000\u02c4\u02c2\u0001\u0000\u0000\u0000\u02c5\u02bd\u0001\u0000"+
		"\u0000\u0000\u02c5\u02c6\u0001\u0000\u0000\u0000\u02c6\u02c7\u0001\u0000"+
		"\u0000\u0000\u02c7\u02c8\u00057\u0000\u0000\u02c8\u02e3\u0001\u0000\u0000"+
		"\u0000\u02c9\u02ca\u0005H\u0000\u0000\u02ca\u02d3\u00056\u0000\u0000\u02cb"+
		"\u02d0\u0003R)\u0000\u02cc\u02cd\u00059\u0000\u0000\u02cd\u02cf\u0003"+
		"R)\u0000\u02ce\u02cc\u0001\u0000\u0000\u0000\u02cf\u02d2\u0001\u0000\u0000"+
		"\u0000\u02d0\u02ce\u0001\u0000\u0000\u0000\u02d0\u02d1\u0001\u0000\u0000"+
		"\u0000\u02d1\u02d4\u0001\u0000\u0000\u0000\u02d2\u02d0\u0001\u0000\u0000"+
		"\u0000\u02d3\u02cb\u0001\u0000\u0000\u0000\u02d3\u02d4\u0001\u0000\u0000"+
		"\u0000\u02d4\u02d5\u0001\u0000\u0000\u0000\u02d5\u02e3\u00057\u0000\u0000"+
		"\u02d6\u02d7\u0003T*\u0000\u02d7\u02d9\u00056\u0000\u0000\u02d8\u02da"+
		"\u0003`0\u0000\u02d9\u02d8\u0001\u0000\u0000\u0000\u02d9\u02da\u0001\u0000"+
		"\u0000\u0000\u02da\u02db\u0001\u0000\u0000\u0000\u02db\u02dc\u00057\u0000"+
		"\u0000\u02dc\u02e3\u0001\u0000\u0000\u0000\u02dd\u02de\u0003T*\u0000\u02de"+
		"\u02df\u00056\u0000\u0000\u02df\u02e0\u00057\u0000\u0000\u02e0\u02e1\u0005"+
		":\u0000\u0000\u02e1\u02e3\u0001\u0000\u0000\u0000\u02e2\u02bb\u0001\u0000"+
		"\u0000\u0000\u02e2\u02c9\u0001\u0000\u0000\u0000\u02e2\u02d6\u0001\u0000"+
		"\u0000\u0000\u02e2\u02dd\u0001\u0000\u0000\u0000\u02e3]\u0001\u0000\u0000"+
		"\u0000\u02e4\u02e5\u0005\u001c\u0000\u0000\u02e5\u02e6\u00056\u0000\u0000"+
		"\u02e6\u02eb\u0003L&\u0000\u02e7\u02e8\u00059\u0000\u0000\u02e8\u02ea"+
		"\u0003L&\u0000\u02e9\u02e7\u0001\u0000\u0000\u0000\u02ea\u02ed\u0001\u0000"+
		"\u0000\u0000\u02eb\u02e9\u0001\u0000\u0000\u0000\u02eb\u02ec\u0001\u0000"+
		"\u0000\u0000\u02ec\u02ee\u0001\u0000\u0000\u0000\u02ed\u02eb\u0001\u0000"+
		"\u0000\u0000\u02ee\u02f1\u00057\u0000\u0000\u02ef\u02f0\u00058\u0000\u0000"+
		"\u02f0\u02f2\u0005\'\u0000\u0000\u02f1\u02ef\u0001\u0000\u0000\u0000\u02f1"+
		"\u02f2\u0001\u0000\u0000\u0000\u02f2\u02f3\u0001\u0000\u0000\u0000\u02f3"+
		"\u02f7\u00050\u0000\u0000\u02f4\u02f6\u0003P(\u0000\u02f5\u02f4\u0001"+
		"\u0000\u0000\u0000\u02f6\u02f9\u0001\u0000\u0000\u0000\u02f7\u02f5\u0001"+
		"\u0000\u0000\u0000\u02f7\u02f8\u0001\u0000\u0000\u0000\u02f8\u02fa\u0001"+
		"\u0000\u0000\u0000\u02f9\u02f7\u0001\u0000\u0000\u0000\u02fa\u02fb\u0005"+
		"1\u0000\u0000\u02fb_\u0001\u0000\u0000\u0000\u02fc\u0301\u0003R)\u0000"+
		"\u02fd\u02fe\u00059\u0000\u0000\u02fe\u0300\u0003R)\u0000\u02ff\u02fd"+
		"\u0001\u0000\u0000\u0000\u0300\u0303\u0001\u0000\u0000\u0000\u0301\u02ff"+
		"\u0001\u0000\u0000\u0000\u0301\u0302\u0001\u0000\u0000\u0000\u0302a\u0001"+
		"\u0000\u0000\u0000\u0303\u0301\u0001\u0000\u0000\u0000\u0304\u030d\u0005"+
		"4\u0000\u0000\u0305\u030a\u0003R)\u0000\u0306\u0307\u00059\u0000\u0000"+
		"\u0307\u0309\u0003R)\u0000\u0308\u0306\u0001\u0000\u0000\u0000\u0309\u030c"+
		"\u0001\u0000\u0000\u0000\u030a\u0308\u0001\u0000\u0000\u0000\u030a\u030b"+
		"\u0001\u0000\u0000\u0000\u030b\u030e\u0001\u0000\u0000\u0000\u030c\u030a"+
		"\u0001\u0000\u0000\u0000\u030d\u0305\u0001\u0000\u0000\u0000\u030d\u030e"+
		"\u0001\u0000\u0000\u0000\u030e\u030f\u0001\u0000\u0000\u0000\u030f\u0310"+
		"\u00055\u0000\u0000\u0310c\u0001\u0000\u0000\u0000\u0311\u0313\u0005\u0004"+
		"\u0000\u0000\u0312\u0311\u0001\u0000\u0000\u0000\u0312\u0313\u0001\u0000"+
		"\u0000\u0000\u0313\u0314\u0001\u0000\u0000\u0000\u0314\u0315\u0005\u000e"+
		"\u0000\u0000\u0315\u0316\u0005H\u0000\u0000\u0316\u0317\u00050\u0000\u0000"+
		"\u0317\u0318\u0003f3\u0000\u0318\u0319\u00051\u0000\u0000\u0319e\u0001"+
		"\u0000\u0000\u0000\u031a\u031c\u0003h4\u0000\u031b\u031a\u0001\u0000\u0000"+
		"\u0000\u031c\u031f\u0001\u0000\u0000\u0000\u031d\u031b\u0001\u0000\u0000"+
		"\u0000\u031d\u031e\u0001\u0000\u0000\u0000\u031eg\u0001\u0000\u0000\u0000"+
		"\u031f\u031d\u0001\u0000\u0000\u0000\u0320\u0323\u0003j5\u0000\u0321\u0323"+
		"\u0003l6\u0000\u0322\u0320\u0001\u0000\u0000\u0000\u0322\u0321\u0001\u0000"+
		"\u0000\u0000\u0323i\u0001\u0000\u0000\u0000\u0324\u0325\u0005H\u0000\u0000"+
		"\u0325\u0326\u00058\u0000\u0000\u0326\u0327\u0003(\u0014\u0000\u0327\u0328"+
		"\u0005:\u0000\u0000\u0328k\u0001\u0000\u0000\u0000\u0329\u032a\u0005H"+
		"\u0000\u0000\u032a\u032c\u00056\u0000\u0000\u032b\u032d\u0003n7\u0000"+
		"\u032c\u032b\u0001\u0000\u0000\u0000\u032c\u032d\u0001\u0000\u0000\u0000"+
		"\u032d\u032e\u0001\u0000\u0000\u0000\u032e\u032f\u00057\u0000\u0000\u032f"+
		"\u0330\u00058\u0000\u0000\u0330\u0331\u0003(\u0014\u0000\u0331\u0332\u0005"+
		":\u0000\u0000\u0332m\u0001\u0000\u0000\u0000\u0333\u0338\u0003p8\u0000"+
		"\u0334\u0335\u00059\u0000\u0000\u0335\u0337\u0003p8\u0000\u0336\u0334"+
		"\u0001\u0000\u0000\u0000\u0337\u033a\u0001\u0000\u0000\u0000\u0338\u0336"+
		"\u0001\u0000\u0000\u0000\u0338\u0339\u0001\u0000\u0000\u0000\u0339o\u0001"+
		"\u0000\u0000\u0000\u033a\u0338\u0001\u0000\u0000\u0000\u033b\u033c\u0005"+
		"H\u0000\u0000\u033c\u033d\u00058\u0000\u0000\u033d\u033e\u0003(\u0014"+
		"\u0000\u033eq\u0001\u0000\u0000\u0000\u033f\u0340\u0005&\u0000\u0000\u0340"+
		"\u0341\u00056\u0000\u0000\u0341\u0342\u00057\u0000\u0000\u0342\u0343\u0005"+
		"0\u0000\u0000\u0343\u0344\u0003*\u0015\u0000\u0344\u0345\u00056\u0000"+
		"\u0000\u0345\u0346\u0003R)\u0000\u0346\u0347\u00057\u0000\u0000\u0347"+
		"\u0348\u0005:\u0000\u0000\u0348\u0349\u00051\u0000\u0000\u0349s\u0001"+
		"\u0000\u0000\u0000\u034a\u034b\u0003*\u0015\u0000\u034b\u034c\u00054\u0000"+
		"\u0000\u034c\u034d\u00055\u0000\u0000\u034d\u0354\u0001\u0000\u0000\u0000"+
		"\u034e\u034f\u0005\u001f\u0000\u0000\u034f\u0350\u0005M\u0000\u0000\u0350"+
		"\u0351\u0003*\u0015\u0000\u0351\u0352\u0005N\u0000\u0000\u0352\u0354\u0001"+
		"\u0000\u0000\u0000\u0353\u034a\u0001\u0000\u0000\u0000\u0353\u034e\u0001"+
		"\u0000\u0000\u0000\u0354u\u0001\u0000\u0000\u0000\u0355\u0356\u0005*\u0000"+
		"\u0000\u0356\u0357\u00056\u0000\u0000\u0357\u0358\u00057\u0000\u0000\u0358"+
		"\u0359\u0003x<\u0000\u0359\u035a\u0005:\u0000\u0000\u035aw\u0001\u0000"+
		"\u0000\u0000\u035b\u035c\u0005H\u0000\u0000\u035c\u035d\u0005;\u0000\u0000"+
		"\u035d\u035e\u0005,\u0000\u0000\u035e\u0363\u0005H\u0000\u0000\u035f\u0360"+
		"\u0005M\u0000\u0000\u0360\u0361\u0003(\u0014\u0000\u0361\u0362\u0005N"+
		"\u0000\u0000\u0362\u0364\u0001\u0000\u0000\u0000\u0363\u035f\u0001\u0000"+
		"\u0000\u0000\u0363\u0364\u0001\u0000\u0000\u0000\u0364\u0365\u0001\u0000"+
		"\u0000\u0000\u0365\u0366\u00056\u0000\u0000\u0366\u0367\u00057\u0000\u0000"+
		"\u0367y\u0001\u0000\u0000\u0000\u0368\u036d\u0003R)\u0000\u0369\u036a"+
		"\u00059\u0000\u0000\u036a\u036c\u0003R)\u0000\u036b\u0369\u0001\u0000"+
		"\u0000\u0000\u036c\u036f\u0001\u0000\u0000\u0000\u036d\u036b\u0001\u0000"+
		"\u0000\u0000\u036d\u036e\u0001\u0000\u0000\u0000\u036e{\u0001\u0000\u0000"+
		"\u0000\u036f\u036d\u0001\u0000\u0000\u0000\u0370\u0371\u0005\u001d\u0000"+
		"\u0000\u0371\u0372\u00056\u0000\u0000\u0372\u0373\u00057\u0000\u0000\u0373"+
		"\u0374\u00058\u0000\u0000\u0374\u0375\u0005\'\u0000\u0000\u0375\u0376"+
		"\u00050\u0000\u0000\u0376\u0377\u0003R)\u0000\u0377\u0378\u00051\u0000"+
		"\u0000\u0378}\u0001\u0000\u0000\u0000\u0379\u037a\u0005H\u0000\u0000\u037a"+
		"\u037b\u0005;\u0000\u0000\u037b\u037c\u00056\u0000\u0000\u037c\u037d\u0005"+
		"H\u0000\u0000\u037d\u037e\u00057\u0000\u0000\u037e\u037f\u0005A\u0000"+
		"\u0000\u037f\u0388\u0003\u0080@\u0000\u0380\u0382\u00056\u0000\u0000\u0381"+
		"\u0383\u0003n7\u0000\u0382\u0381\u0001\u0000\u0000\u0000\u0382\u0383\u0001"+
		"\u0000\u0000\u0000\u0383\u0384\u0001\u0000\u0000\u0000\u0384\u0385\u0005"+
		"7\u0000\u0000\u0385\u0386\u0005A\u0000\u0000\u0386\u0388\u0003\u0080@"+
		"\u0000\u0387\u0379\u0001\u0000\u0000\u0000\u0387\u0380\u0001\u0000\u0000"+
		"\u0000\u0388\u007f\u0001\u0000\u0000\u0000\u0389\u0393\u0003R)\u0000\u038a"+
		"\u038e\u00050\u0000\u0000\u038b\u038d\u0003P(\u0000\u038c\u038b\u0001"+
		"\u0000\u0000\u0000\u038d\u0390\u0001\u0000\u0000\u0000\u038e\u038c\u0001"+
		"\u0000\u0000\u0000\u038e\u038f\u0001\u0000\u0000\u0000\u038f\u0391\u0001"+
		"\u0000\u0000\u0000\u0390\u038e\u0001\u0000\u0000\u0000\u0391\u0393\u0005"+
		"1\u0000\u0000\u0392\u0389\u0001\u0000\u0000\u0000\u0392\u038a\u0001\u0000"+
		"\u0000\u0000\u0393\u0081\u0001\u0000\u0000\u0000\u0394\u0397\u0005(\u0000"+
		"\u0000\u0395\u0398\u0003z=\u0000\u0396\u0398\u0003R)\u0000\u0397\u0395"+
		"\u0001\u0000\u0000\u0000\u0397\u0396\u0001\u0000\u0000\u0000\u0398\u0399"+
		"\u0001\u0000\u0000\u0000\u0399\u039a\u0005:\u0000\u0000\u039a\u0083\u0001"+
		"\u0000\u0000\u0000\u039b\u039d\u0003\u0086C\u0000\u039c\u039b\u0001\u0000"+
		"\u0000\u0000\u039d\u039e\u0001\u0000\u0000\u0000\u039e\u039c\u0001\u0000"+
		"\u0000\u0000\u039e\u039f\u0001\u0000\u0000\u0000\u039f\u0085\u0001\u0000"+
		"\u0000\u0000\u03a0\u03a5\u0003\u0088D\u0000\u03a1\u03a5\u0003\u008aE\u0000"+
		"\u03a2\u03a5\u0003\u008cF\u0000\u03a3\u03a5\u0003\u008eG\u0000\u03a4\u03a0"+
		"\u0001\u0000\u0000\u0000\u03a4\u03a1\u0001\u0000\u0000\u0000\u03a4\u03a2"+
		"\u0001\u0000\u0000\u0000\u03a4\u03a3\u0001\u0000\u0000\u0000\u03a5\u0087"+
		"\u0001\u0000\u0000\u0000\u03a6\u03aa\u0003\u0090H\u0000\u03a7\u03a9\u0003"+
		"\u0098L\u0000\u03a8\u03a7\u0001\u0000\u0000\u0000\u03a9\u03ac\u0001\u0000"+
		"\u0000\u0000\u03aa\u03a8\u0001\u0000\u0000\u0000\u03aa\u03ab\u0001\u0000"+
		"\u0000\u0000\u03ab\u03ad\u0001\u0000\u0000\u0000\u03ac\u03aa\u0001\u0000"+
		"\u0000\u0000\u03ad\u03b1\u0005N\u0000\u0000\u03ae\u03b0\u0003\u009eO\u0000"+
		"\u03af\u03ae\u0001\u0000\u0000\u0000\u03b0\u03b3\u0001\u0000\u0000\u0000"+
		"\u03b1\u03af\u0001\u0000\u0000\u0000\u03b1\u03b2\u0001\u0000\u0000\u0000"+
		"\u03b2\u03b4\u0001\u0000\u0000\u0000\u03b3\u03b1\u0001\u0000\u0000\u0000"+
		"\u03b4\u03b5\u0003\u0092I\u0000\u03b5\u0089\u0001\u0000\u0000\u0000\u03b6"+
		"\u03ba\u0003\u0090H\u0000\u03b7\u03b9\u0003\u0098L\u0000\u03b8\u03b7\u0001"+
		"\u0000\u0000\u0000\u03b9\u03bc\u0001\u0000\u0000\u0000\u03ba\u03b8\u0001"+
		"\u0000\u0000\u0000\u03ba\u03bb\u0001\u0000\u0000\u0000\u03bb\u03bd\u0001"+
		"\u0000\u0000\u0000\u03bc\u03ba\u0001\u0000\u0000\u0000\u03bd\u03be\u0005"+
		"@\u0000\u0000\u03be\u008b\u0001\u0000\u0000\u0000\u03bf\u03c3\u0003\u0094"+
		"J\u0000\u03c0\u03c2\u0003\u0098L\u0000\u03c1\u03c0\u0001\u0000\u0000\u0000"+
		"\u03c2\u03c5\u0001\u0000\u0000\u0000\u03c3\u03c1\u0001\u0000\u0000\u0000"+
		"\u03c3\u03c4\u0001\u0000\u0000\u0000\u03c4\u03c6\u0001\u0000\u0000\u0000"+
		"\u03c5\u03c3\u0001\u0000\u0000\u0000\u03c6\u03ca\u0005N\u0000\u0000\u03c7"+
		"\u03c9\u0003\u009eO\u0000\u03c8\u03c7\u0001\u0000\u0000\u0000\u03c9\u03cc"+
		"\u0001\u0000\u0000\u0000\u03ca\u03c8\u0001\u0000\u0000\u0000\u03ca\u03cb"+
		"\u0001\u0000\u0000\u0000\u03cb\u03cd\u0001\u0000\u0000\u0000\u03cc\u03ca"+
		"\u0001\u0000\u0000\u0000\u03cd\u03ce\u0003\u0096K\u0000\u03ce\u008d\u0001"+
		"\u0000\u0000\u0000\u03cf\u03d0\u0005M\u0000\u0000\u03d0\u03d4\u0005L\u0000"+
		"\u0000\u03d1\u03d3\u0003\u0098L\u0000\u03d2\u03d1\u0001\u0000\u0000\u0000"+
		"\u03d3\u03d6\u0001\u0000\u0000\u0000\u03d4\u03d2\u0001\u0000\u0000\u0000"+
		"\u03d4\u03d5\u0001\u0000\u0000\u0000\u03d5\u03d7\u0001\u0000\u0000\u0000"+
		"\u03d6\u03d4\u0001\u0000\u0000\u0000\u03d7\u03db\u0005N\u0000\u0000\u03d8"+
		"\u03da\u0003\u009eO\u0000\u03d9\u03d8\u0001\u0000\u0000\u0000\u03da\u03dd"+
		"\u0001\u0000\u0000\u0000\u03db\u03d9\u0001\u0000\u0000\u0000\u03db\u03dc"+
		"\u0001\u0000\u0000\u0000\u03dc\u03de\u0001\u0000\u0000\u0000\u03dd\u03db"+
		"\u0001\u0000\u0000\u0000\u03de\u03df\u0005\\\u0000\u0000\u03df\u03e0\u0005"+
		"L\u0000\u0000\u03e0\u03e1\u0005N\u0000\u0000\u03e1\u008f\u0001\u0000\u0000"+
		"\u0000\u03e2\u03e3\u0005M\u0000\u0000\u03e3\u03e4\u0005H\u0000\u0000\u03e4"+
		"\u0091\u0001\u0000\u0000\u0000\u03e5\u03e6\u0005\\\u0000\u0000\u03e6\u03e7"+
		"\u0005H\u0000\u0000\u03e7\u03e8\u0005N\u0000\u0000\u03e8\u0093\u0001\u0000"+
		"\u0000\u0000\u03e9\u03ea\u0005M\u0000\u0000\u03ea\u03eb\u0005X\u0000\u0000"+
		"\u03eb\u0095\u0001\u0000\u0000\u0000\u03ec\u03ed\u0005\\\u0000\u0000\u03ed"+
		"\u03ee\u0005X\u0000\u0000\u03ee\u03ef\u0005N\u0000\u0000\u03ef\u0097\u0001"+
		"\u0000\u0000\u0000\u03f0\u03f1\u0005H\u0000\u0000\u03f1\u03f2\u0005;\u0000"+
		"\u0000\u03f2\u0406\u0005B\u0000\u0000\u03f3\u0406\u0005H\u0000\u0000\u03f4"+
		"\u0406\u0003\u009cN\u0000\u03f5\u0406\u0003\u009aM\u0000\u03f6\u0406\u0003"+
		"\u00a4R\u0000\u03f7\u0406\u0003\u008eG\u0000\u03f8\u03f9\u00054\u0000"+
		"\u0000\u03f9\u03fa\u0005H\u0000\u0000\u03fa\u03fb\u00055\u0000\u0000\u03fb"+
		"\u03fc\u0005;\u0000\u0000\u03fc\u0406\u0003R)\u0000\u03fd\u03fe\u0005"+
		"6\u0000\u0000\u03fe\u03ff\u0005H\u0000\u0000\u03ff\u0400\u00057\u0000"+
		"\u0000\u0400\u0401\u0005;\u0000\u0000\u0401\u0406\u0003R)\u0000\u0402"+
		"\u0403\u00054\u0000\u0000\u0403\u0404\u0005H\u0000\u0000\u0404\u0406\u0005"+
		"5\u0000\u0000\u0405\u03f0\u0001\u0000\u0000\u0000\u0405\u03f3\u0001\u0000"+
		"\u0000\u0000\u0405\u03f4\u0001\u0000\u0000\u0000\u0405\u03f5\u0001\u0000"+
		"\u0000\u0000\u0405\u03f6\u0001\u0000\u0000\u0000\u0405\u03f7\u0001\u0000"+
		"\u0000\u0000\u0405\u03f8\u0001\u0000\u0000\u0000\u0405\u03fd\u0001\u0000"+
		"\u0000\u0000\u0405\u0402\u0001\u0000\u0000\u0000\u0406\u0099\u0001\u0000"+
		"\u0000\u0000\u0407\u0408\u0005Y\u0000\u0000\u0408\u0409\u0005;\u0000\u0000"+
		"\u0409\u040a\u0003R)\u0000\u040a\u009b\u0001\u0000\u0000\u0000\u040b\u040c"+
		"\u0005W\u0000\u0000\u040c\u040d\u0005;\u0000\u0000\u040d\u040e\u0003R"+
		")\u0000\u040e\u009d\u0001\u0000\u0000\u0000\u040f\u0413\u0003\u0084B\u0000"+
		"\u0410\u0413\u0003\u00a6S\u0000\u0411\u0413\u0003\u00a0P\u0000\u0412\u040f"+
		"\u0001\u0000\u0000\u0000\u0412\u0410\u0001\u0000\u0000\u0000\u0412\u0411"+
		"\u0001\u0000\u0000\u0000\u0413\u0414\u0001\u0000\u0000\u0000\u0414\u0412"+
		"\u0001\u0000\u0000\u0000\u0414\u0415\u0001\u0000\u0000\u0000\u0415\u009f"+
		"\u0001\u0000\u0000\u0000\u0416\u0417\u0003\u00a2Q\u0000\u0417\u00a1\u0001"+
		"\u0000\u0000\u0000\u0418\u0419\u00052\u0000\u0000\u0419\u041e\u0005H\u0000"+
		"\u0000\u041a\u041b\u0005T\u0000\u0000\u041b\u041d\u0005H\u0000\u0000\u041c"+
		"\u041a\u0001\u0000\u0000\u0000\u041d\u0420\u0001\u0000\u0000\u0000\u041e"+
		"\u041c\u0001\u0000\u0000\u0000\u041e\u041f\u0001\u0000\u0000\u0000\u041f"+
		"\u0421\u0001\u0000\u0000\u0000\u0420\u041e\u0001\u0000\u0000\u0000\u0421"+
		"\u0422\u00053\u0000\u0000\u0422\u00a3\u0001\u0000\u0000\u0000\u0423\u0424"+
		"\u00056\u0000\u0000\u0424\u0425\u0005H\u0000\u0000\u0425\u0426\u00057"+
		"\u0000\u0000\u0426\u0427\u0005;\u0000\u0000\u0427\u0428\u0003R)\u0000"+
		"\u0428\u00a5\u0001\u0000\u0000\u0000\u0429\u042a\u0007\u0003\u0000\u0000"+
		"\u042a\u00a7\u0001\u0000\u0000\u0000T\u00ab\u00b4\u00bd\u00d6\u00dc\u00e4"+
		"\u00fc\u0105\u0113\u0116\u012f\u0138\u0143\u014c\u015b\u015d\u0163\u016a"+
		"\u0187\u018a\u0191\u01a6\u01b5\u01bd\u01c1\u01cb\u01d8\u01e5\u01ee\u01f2"+
		"\u0207\u020f\u0217\u021a\u0220\u022b\u023f\u0249\u024f\u026d\u027a\u0298"+
		"\u029a\u02a0\u02a9\u02b1\u02c2\u02c5\u02d0\u02d3\u02d9\u02e2\u02eb\u02f1"+
		"\u02f7\u0301\u030a\u030d\u0312\u031d\u0322\u032c\u0338\u0353\u0363\u036d"+
		"\u0382\u0387\u038e\u0392\u0397\u039e\u03a4\u03aa\u03b1\u03ba\u03c3\u03ca"+
		"\u03d4\u03db\u0405\u0412\u0414\u041e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}