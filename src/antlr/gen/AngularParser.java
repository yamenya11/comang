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
		VOID=40, RETURN=41, INPUT=42, OUTPUT=43, Input=44, NEW=45, IMPLEMENTS=46, 
		EXTENDS=47, ONINIT=48, OPEN_CURLY=49, CLOSE_CURLY=50, OPEN_DOUBLE_CURLY=51, 
		CLOSE_DOUBLE_CURLY=52, OPEN_SQUARE=53, CLOSE_SQUARE=54, OPEN_PAREN=55, 
		CLOSE_PAREN=56, COLON=57, COMMA=58, SEMICOLON=59, EQUALS=60, OR_OPERATOR=61, 
		NOT_EQUAL=62, STRICT_NOT_EQUAL=63, BACKTICK=64, HHH=65, ARROW=66, STRING=67, 
		PLUS_PLUS=68, MINUS_MINUS=69, NUMBER=70, INTEGER=71, PRICE=72, IDENTIFIER=73, 
		LINE_COMMENT=74, BLOCK_COMMENT=75, WS=76, BUTTON=77, LESS_THAN=78, GREATER_THAN=79, 
		STAR=80, DIVIDE=81, MOD=82, PLUS=83, MINUS=84, DOT=85, LS=86, Product=87, 
		NG=88, FIXEDTAGNAME=89, NI=90, NULL=91, ATTVALUE_VALUE=92, GG=93, ARABIC_TEXT=94;
	public static final int
		RULE_program = 0, RULE_application = 1, RULE_importStatement = 2, RULE_keyimport = 3, 
		RULE_component = 4, RULE_injectable = 5, RULE_metadata = 6, RULE_metadataEntry = 7, 
		RULE_providin = 8, RULE_templateurl = 9, RULE_selector = 10, RULE_basicMetadata = 11, 
		RULE_htmlMetadata = 12, RULE_classDeclaration = 13, RULE_classInheritance = 14, 
		RULE_extendClause = 15, RULE_implementClause = 16, RULE_getproduct = 17, 
		RULE_products = 18, RULE_elementList = 19, RULE_element = 20, RULE_pair = 21, 
		RULE_value = 22, RULE_basevalue = 23, RULE_classBody = 24, RULE_propertyDeclaration = 25, 
		RULE_regularProperty = 26, RULE_letDeclaration = 27, RULE_typeVarible = 28, 
		RULE_emptyArrayDeclaration = 29, RULE_constructor = 30, RULE_loopStatement = 31, 
		RULE_whileStatement = 32, RULE_switchStatement = 33, RULE_ifStatement = 34, 
		RULE_equalityExpression = 35, RULE_caseClause = 36, RULE_functionDeclaration = 37, 
		RULE_functionB = 38, RULE_propertystatment = 39, RULE_methodDeclaration = 40, 
		RULE_parameter = 41, RULE_modifiers = 42, RULE_statement = 43, RULE_expression = 44, 
		RULE_propertyAccess = 45, RULE_calfun = 46, RULE_iddot = 47, RULE_functhis = 48, 
		RULE_functionCall = 49, RULE_selectProduct = 50, RULE_argumentList = 51, 
		RULE_arrayLiteral = 52, RULE_interfaceDeclaration = 53, RULE_interfaceBody = 54, 
		RULE_interfaceMember = 55, RULE_propertySignature = 56, RULE_methodSignature = 57, 
		RULE_parameterList = 58, RULE_parameter2 = 59, RULE_onbutton = 60, RULE_arrayvalue = 61, 
		RULE_decorator = 62, RULE_propertyAssignment = 63, RULE_expressionList = 64, 
		RULE_ngOnInit = 65, RULE_lambdaExpression = 66, RULE_functionBody = 67, 
		RULE_returnStatement = 68, RULE_htmlElement = 69, RULE_htmlElementassist = 70, 
		RULE_standardHtmlElement = 71, RULE_selfClosingHtmlElement = 72, RULE_fixedHtmlElement = 73, 
		RULE_angularButton = 74, RULE_opentag = 75, RULE_closetag = 76, RULE_fixedtqg = 77, 
		RULE_closefixedtag = 78, RULE_htmlAttribute = 79, RULE_ngIf = 80, RULE_ngfor = 81, 
		RULE_htmlContent = 82, RULE_interp = 83, RULE_identifierChain = 84, RULE_eventBinding = 85, 
		RULE_textNode = 86;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "application", "importStatement", "keyimport", "component", 
			"injectable", "metadata", "metadataEntry", "providin", "templateurl", 
			"selector", "basicMetadata", "htmlMetadata", "classDeclaration", "classInheritance", 
			"extendClause", "implementClause", "getproduct", "products", "elementList", 
			"element", "pair", "value", "basevalue", "classBody", "propertyDeclaration", 
			"regularProperty", "letDeclaration", "typeVarible", "emptyArrayDeclaration", 
			"constructor", "loopStatement", "whileStatement", "switchStatement", 
			"ifStatement", "equalityExpression", "caseClause", "functionDeclaration", 
			"functionB", "propertystatment", "methodDeclaration", "parameter", "modifiers", 
			"statement", "expression", "propertyAccess", "calfun", "iddot", "functhis", 
			"functionCall", "selectProduct", "argumentList", "arrayLiteral", "interfaceDeclaration", 
			"interfaceBody", "interfaceMember", "propertySignature", "methodSignature", 
			"parameterList", "parameter2", "onbutton", "arrayvalue", "decorator", 
			"propertyAssignment", "expressionList", "ngOnInit", "lambdaExpression", 
			"functionBody", "returnStatement", "htmlElement", "htmlElementassist", 
			"standardHtmlElement", "selfClosingHtmlElement", "fixedHtmlElement", 
			"angularButton", "opentag", "closetag", "fixedtqg", "closefixedtag", 
			"htmlAttribute", "ngIf", "ngfor", "htmlContent", "interp", "identifierChain", 
			"eventBinding", "textNode"
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
			"LET", "CONST", "VAR", "IN", "IF", "ELSE", "AT", "PROVIDEDIN", "SELECTOR", 
			"TEMPLATE", "TEMPLATEURL", "STYLEURLS", "ANY", "CONSTRUCTOR", "SELECTPRODUCT", 
			"NGONINIT", "THIS", "ARRAY", "PRIVATE", "PUBLIC", "PROTECTED", "EXPORTAS", 
			"INJECTABLE", "GET_PRODUCTS", "ONBUTTONCLICK", "VOID", "RETURN", "INPUT", 
			"OUTPUT", "Input", "NEW", "IMPLEMENTS", "EXTENDS", "ONINIT", "OPEN_CURLY", 
			"CLOSE_CURLY", "OPEN_DOUBLE_CURLY", "CLOSE_DOUBLE_CURLY", "OPEN_SQUARE", 
			"CLOSE_SQUARE", "OPEN_PAREN", "CLOSE_PAREN", "COLON", "COMMA", "SEMICOLON", 
			"EQUALS", "OR_OPERATOR", "NOT_EQUAL", "STRICT_NOT_EQUAL", "BACKTICK", 
			"HHH", "ARROW", "STRING", "PLUS_PLUS", "MINUS_MINUS", "NUMBER", "INTEGER", 
			"PRICE", "IDENTIFIER", "LINE_COMMENT", "BLOCK_COMMENT", "WS", "BUTTON", 
			"LESS_THAN", "GREATER_THAN", "STAR", "DIVIDE", "MOD", "PLUS", "MINUS", 
			"DOT", "LS", "Product", "NG", "FIXEDTAGNAME", "NI", "NULL", "ATTVALUE_VALUE", 
			"GG", "ARABIC_TEXT"
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
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IMPORT) | (1L << COMPONENT) | (1L << EXPORT) | (1L << INJECTABLE))) != 0)) {
				{
				{
				setState(174);
				application();
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180);
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
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				_localctx = new IMPORTLABELContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				importStatement();
				}
				break;
			case COMPONENT:
				_localctx = new COMPONENTLABELContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				component();
				}
				break;
			case EXPORT:
				_localctx = new CLASSLABELContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				classDeclaration();
				}
				break;
			case INJECTABLE:
				_localctx = new INJECTABLELABELContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(185);
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
			setState(188);
			match(IMPORT);
			setState(189);
			match(OPEN_CURLY);
			setState(190);
			keyimport();
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(191);
				match(COMMA);
				setState(192);
				keyimport();
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(198);
			match(CLOSE_CURLY);
			setState(199);
			match(FROM);
			setState(200);
			match(STRING);
			setState(201);
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
			setState(203);
			_la = _input.LA(1);
			if ( !(((((_la - 48)) & ~0x3f) == 0 && ((1L << (_la - 48)) & ((1L << (ONINIT - 48)) | (1L << (STRING - 48)) | (1L << (IDENTIFIER - 48)))) != 0)) ) {
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
			setState(205);
			match(COMPONENT);
			setState(206);
			match(OPEN_PAREN);
			setState(207);
			match(OPEN_CURLY);
			setState(208);
			metadata();
			setState(209);
			match(CLOSE_CURLY);
			setState(210);
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
			setState(212);
			match(INJECTABLE);
			setState(213);
			match(OPEN_PAREN);
			setState(214);
			match(OPEN_CURLY);
			setState(215);
			metadata();
			setState(216);
			match(CLOSE_CURLY);
			setState(217);
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
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PROVIDEDIN) | (1L << SELECTOR) | (1L << TEMPLATE) | (1L << TEMPLATEURL))) != 0)) {
				{
				setState(219);
				metadataEntry();
				}
			}

			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(222);
				match(COMMA);
				setState(223);
				metadataEntry();
				}
				}
				setState(228);
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
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new BasicMetadataLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				basicMetadata();
				}
				break;
			case 2:
				_localctx = new HtmlMetadataLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				htmlMetadata();
				}
				break;
			case 3:
				_localctx = new SELECTORLABELContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(231);
				selector();
				}
				break;
			case 4:
				_localctx = new TAMPLATEURLLABELContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(232);
				templateurl();
				}
				break;
			case 5:
				_localctx = new PROVIDINLABELContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(233);
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
			setState(236);
			match(PROVIDEDIN);
			setState(237);
			match(COLON);
			setState(238);
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
			setState(240);
			match(TEMPLATEURL);
			setState(241);
			match(COLON);
			setState(242);
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
			setState(244);
			match(SELECTOR);
			setState(245);
			match(COLON);
			setState(246);
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
			setState(248);
			match(TEMPLATE);
			setState(249);
			match(COLON);
			setState(250);
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
			setState(252);
			match(TEMPLATE);
			setState(253);
			match(COLON);
			setState(254);
			match(BACKTICK);
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LESS_THAN) {
				{
				{
				setState(255);
				htmlElement();
				}
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(261);
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
			setState(263);
			match(EXPORT);
			setState(264);
			match(CLASS);
			setState(265);
			match(IDENTIFIER);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS || _la==EXTENDS) {
				{
				setState(266);
				classInheritance();
				}
			}

			setState(269);
			match(OPEN_CURLY);
			setState(270);
			classBody();
			setState(271);
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
		enterRule(_localctx, 28, RULE_classInheritance);
		try {
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXTENDS:
				_localctx = new EXTENDSLABELContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				extendClause();
				}
				break;
			case IMPLEMENTS:
				_localctx = new IMPLEMITIONLABELContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
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
		enterRule(_localctx, 30, RULE_extendClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(EXTENDS);
			setState(278);
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
		enterRule(_localctx, 32, RULE_implementClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(IMPLEMENTS);
			setState(281);
			value();
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(282);
				match(COMMA);
				setState(283);
				match(IDENTIFIER);
				}
				}
				setState(288);
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
		enterRule(_localctx, 34, RULE_getproduct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(GET_PRODUCTS);
			setState(290);
			match(OPEN_PAREN);
			setState(291);
			match(CLOSE_PAREN);
			setState(292);
			match(OPEN_CURLY);
			setState(293);
			match(RETURN);
			setState(294);
			match(OPEN_SQUARE);
			setState(295);
			elementList();
			setState(296);
			match(CLOSE_SQUARE);
			setState(297);
			match(SEMICOLON);
			setState(298);
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
		enterRule(_localctx, 36, RULE_products);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(IDENTIFIER);
			setState(301);
			match(EQUALS);
			setState(302);
			match(OPEN_SQUARE);
			setState(303);
			elementList();
			setState(304);
			match(CLOSE_SQUARE);
			setState(305);
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
		enterRule(_localctx, 38, RULE_elementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			element();
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(308);
				match(COMMA);
				setState(309);
				element();
				}
				}
				setState(314);
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
		enterRule(_localctx, 40, RULE_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(OPEN_CURLY);
			setState(316);
			pair();
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(317);
				match(COMMA);
				setState(318);
				pair();
				}
				}
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(324);
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
		enterRule(_localctx, 42, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			basevalue();
			setState(327);
			match(COLON);
			setState(328);
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
		enterRule(_localctx, 44, RULE_value);
		try {
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new BASEvalueLABELContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				basevalue();
				}
				break;
			case 2:
				_localctx = new ARRAYTAYPELABELContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
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
		enterRule(_localctx, 46, RULE_basevalue);
		try {
			setState(341);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new IDENTIFIRELABELContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				match(IDENTIFIER);
				}
				break;
			case STRING:
				_localctx = new STRINGLABELContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
				match(STRING);
				}
				break;
			case NUMBER:
				_localctx = new NUMBERLABELContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(336);
				match(NUMBER);
				}
				break;
			case ANY:
				_localctx = new ANYLABELContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(337);
				match(ANY);
				}
				break;
			case VOID:
				_localctx = new VOIDLABELContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(338);
				match(VOID);
				}
				break;
			case ONINIT:
				_localctx = new ONINITLABELContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(339);
				match(ONINIT);
				}
				break;
			case NULL:
				_localctx = new NULLLABELContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(340);
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
		enterRule(_localctx, 48, RULE_classBody);
		int _la;
		try {
			_localctx = new ClassBodyLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << FUNICTION) | (1L << CONSOLE) | (1L << WHILE) | (1L << SWITCH) | (1L << LET) | (1L << CONST) | (1L << VAR) | (1L << IF) | (1L << CONSTRUCTOR) | (1L << SELECTPRODUCT) | (1L << NGONINIT) | (1L << THIS) | (1L << GET_PRODUCTS) | (1L << ONBUTTONCLICK) | (1L << RETURN) | (1L << OUTPUT) | (1L << OPEN_PAREN))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (STRING - 67)) | (1L << (NUMBER - 67)) | (1L << (INTEGER - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
				{
				setState(357);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(343);
					propertyDeclaration();
					}
					break;
				case 2:
					{
					setState(344);
					methodDeclaration();
					}
					break;
				case 3:
					{
					setState(345);
					constructor();
					}
					break;
				case 4:
					{
					setState(346);
					statement();
					}
					break;
				case 5:
					{
					setState(347);
					decorator();
					}
					break;
				case 6:
					{
					setState(348);
					ngOnInit();
					}
					break;
				case 7:
					{
					setState(349);
					selectProduct();
					}
					break;
				case 8:
					{
					setState(350);
					onbutton();
					}
					break;
				case 9:
					{
					setState(351);
					getproduct();
					}
					break;
				case 10:
					{
					setState(352);
					products();
					}
					break;
				case 11:
					{
					setState(353);
					lambdaExpression();
					}
					break;
				case 12:
					{
					setState(354);
					propertyAccess();
					}
					break;
				case 13:
					{
					setState(355);
					functionDeclaration();
					}
					break;
				case 14:
					{
					setState(356);
					whileStatement();
					}
					break;
				}
				}
				setState(361);
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
		enterRule(_localctx, 50, RULE_propertyDeclaration);
		try {
			setState(365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new PROPIRTYLABELContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				regularProperty();
				}
				break;
			case 2:
				_localctx = new VARIBALLABELContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
				letDeclaration();
				}
				break;
			case 3:
				_localctx = new DDDContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(364);
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
		enterRule(_localctx, 52, RULE_regularProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(IDENTIFIER);
			setState(368);
			match(COLON);
			setState(369);
			value();
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(370);
				match(EQUALS);
				setState(371);
				expression(0);
				}
			}

			setState(374);
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
		enterRule(_localctx, 54, RULE_letDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			typeVarible();
			setState(377);
			match(IDENTIFIER);
			setState(378);
			match(COLON);
			setState(379);
			value();
			setState(380);
			match(EQUALS);
			setState(381);
			value();
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

	public static class TypeVaribleContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(AngularParser.LET, 0); }
		public TerminalNode VAR() { return getToken(AngularParser.VAR, 0); }
		public TerminalNode CONST() { return getToken(AngularParser.CONST, 0); }
		public TypeVaribleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeVarible; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTypeVarible(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTypeVarible(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTypeVarible(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeVaribleContext typeVarible() throws RecognitionException {
		TypeVaribleContext _localctx = new TypeVaribleContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_typeVarible);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LET) | (1L << CONST) | (1L << VAR))) != 0)) ) {
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
		enterRule(_localctx, 58, RULE_emptyArrayDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(IDENTIFIER);
			setState(387);
			match(COLON);
			setState(388);
			value();
			setState(389);
			match(OPEN_SQUARE);
			setState(390);
			match(CLOSE_SQUARE);
			setState(391);
			match(EQUALS);
			setState(392);
			match(OPEN_SQUARE);
			setState(393);
			match(CLOSE_SQUARE);
			setState(394);
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
		enterRule(_localctx, 60, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(CONSTRUCTOR);
			setState(397);
			match(OPEN_PAREN);
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 33)) & ~0x3f) == 0 && ((1L << (_la - 33)) & ((1L << (PRIVATE - 33)) | (1L << (PUBLIC - 33)) | (1L << (PROTECTED - 33)) | (1L << (IDENTIFIER - 33)))) != 0)) {
				{
				setState(398);
				parameter();
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(399);
					match(COMMA);
					setState(400);
					parameter();
					}
					}
					setState(405);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(408);
			match(CLOSE_PAREN);
			setState(409);
			match(OPEN_CURLY);
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << CONST) | (1L << VAR) | (1L << IF) | (1L << THIS) | (1L << RETURN) | (1L << OPEN_PAREN))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (STRING - 67)) | (1L << (NUMBER - 67)) | (1L << (INTEGER - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
				{
				{
				setState(410);
				statement();
				}
				}
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(416);
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
		enterRule(_localctx, 62, RULE_loopStatement);
		int _la;
		try {
			setState(471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				match(FOR);
				setState(419);
				match(OPEN_PAREN);
				setState(420);
				match(LET);
				setState(421);
				match(IDENTIFIER);
				setState(422);
				match(EQUALS);
				setState(423);
				expression(0);
				setState(424);
				match(SEMICOLON);
				setState(425);
				expression(0);
				setState(426);
				match(SEMICOLON);
				setState(427);
				match(IDENTIFIER);
				setState(428);
				_la = _input.LA(1);
				if ( !(_la==PLUS_PLUS || _la==MINUS_MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(429);
				match(CLOSE_PAREN);
				setState(430);
				match(OPEN_CURLY);
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << CONST) | (1L << VAR) | (1L << IF) | (1L << THIS) | (1L << RETURN) | (1L << OPEN_PAREN))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (STRING - 67)) | (1L << (NUMBER - 67)) | (1L << (INTEGER - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
					{
					{
					setState(431);
					statement();
					}
					}
					setState(436);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(437);
				match(CLOSE_CURLY);
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(438);
					match(ELSE);
					setState(439);
					match(OPEN_CURLY);
					setState(443);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << CONST) | (1L << VAR) | (1L << IF) | (1L << THIS) | (1L << RETURN) | (1L << OPEN_PAREN))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (STRING - 67)) | (1L << (NUMBER - 67)) | (1L << (INTEGER - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
						{
						{
						setState(440);
						statement();
						}
						}
						setState(445);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(446);
					match(CLOSE_CURLY);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(449);
				match(FOR);
				setState(450);
				match(OPEN_PAREN);
				setState(451);
				match(LET);
				setState(452);
				match(IDENTIFIER);
				setState(453);
				match(IN);
				setState(454);
				match(IDENTIFIER);
				setState(459);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(455);
					match(DOT);
					setState(456);
					match(IDENTIFIER);
					}
					}
					setState(461);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(462);
				match(CLOSE_PAREN);
				setState(463);
				match(OPEN_CURLY);
				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << CONST) | (1L << VAR) | (1L << IF) | (1L << THIS) | (1L << RETURN) | (1L << OPEN_PAREN))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (STRING - 67)) | (1L << (NUMBER - 67)) | (1L << (INTEGER - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
					{
					{
					setState(464);
					statement();
					}
					}
					setState(469);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(470);
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
		enterRule(_localctx, 64, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			match(WHILE);
			setState(474);
			match(OPEN_PAREN);
			setState(475);
			expression(0);
			setState(476);
			match(CLOSE_PAREN);
			setState(477);
			match(OPEN_CURLY);
			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << CONST) | (1L << VAR) | (1L << IF) | (1L << THIS) | (1L << RETURN) | (1L << OPEN_PAREN))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (STRING - 67)) | (1L << (NUMBER - 67)) | (1L << (INTEGER - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
				{
				{
				setState(478);
				statement();
				}
				}
				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(484);
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
		enterRule(_localctx, 66, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(SWITCH);
			setState(487);
			match(OPEN_PAREN);
			setState(488);
			expression(0);
			setState(489);
			match(CLOSE_PAREN);
			setState(490);
			match(OPEN_CURLY);
			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(491);
				caseClause();
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
		catch (RecognitionException re) {
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
		enterRule(_localctx, 68, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			match(IF);
			setState(500);
			match(OPEN_PAREN);
			setState(501);
			equalityExpression();
			setState(502);
			match(CLOSE_PAREN);
			setState(503);
			match(OPEN_CURLY);
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << CONST) | (1L << VAR) | (1L << IF) | (1L << THIS) | (1L << RETURN) | (1L << OPEN_PAREN))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (STRING - 67)) | (1L << (NUMBER - 67)) | (1L << (INTEGER - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
				{
				{
				setState(504);
				statement();
				}
				}
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(510);
			match(CLOSE_CURLY);
			setState(520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(511);
				match(ELSE);
				setState(512);
				match(OPEN_CURLY);
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << CONST) | (1L << VAR) | (1L << IF) | (1L << THIS) | (1L << RETURN) | (1L << OPEN_PAREN))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (STRING - 67)) | (1L << (NUMBER - 67)) | (1L << (INTEGER - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
					{
					{
					setState(513);
					statement();
					}
					}
					setState(518);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(519);
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
		enterRule(_localctx, 70, RULE_equalityExpression);
		try {
			setState(541);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				_localctx = new StrictEqualityContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(522);
				expression(0);
				setState(523);
				match(EQUALS);
				setState(524);
				match(EQUALS);
				setState(525);
				match(EQUALS);
				setState(526);
				expression(0);
				}
				break;
			case 2:
				_localctx = new LooseEqualityContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(528);
				expression(0);
				setState(529);
				match(EQUALS);
				setState(530);
				match(EQUALS);
				setState(531);
				expression(0);
				}
				break;
			case 3:
				_localctx = new NotEqualityContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(533);
				expression(0);
				setState(534);
				match(NOT_EQUAL);
				setState(535);
				expression(0);
				}
				break;
			case 4:
				_localctx = new StrictNotEqualityContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(537);
				expression(0);
				setState(538);
				match(STRICT_NOT_EQUAL);
				setState(539);
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
		enterRule(_localctx, 72, RULE_caseClause);
		int _la;
		try {
			setState(560);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(543);
				match(CASE);
				setState(544);
				expression(0);
				setState(545);
				match(COLON);
				setState(549);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << CONST) | (1L << VAR) | (1L << IF) | (1L << THIS) | (1L << RETURN) | (1L << OPEN_PAREN))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (STRING - 67)) | (1L << (NUMBER - 67)) | (1L << (INTEGER - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
					{
					{
					setState(546);
					statement();
					}
					}
					setState(551);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(552);
				match(DEFAULT);
				setState(553);
				match(COLON);
				setState(557);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << CONST) | (1L << VAR) | (1L << IF) | (1L << THIS) | (1L << RETURN) | (1L << OPEN_PAREN))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (STRING - 67)) | (1L << (NUMBER - 67)) | (1L << (INTEGER - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
					{
					{
					setState(554);
					statement();
					}
					}
					setState(559);
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
		enterRule(_localctx, 74, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			match(FUNICTION);
			setState(563);
			match(IDENTIFIER);
			setState(564);
			match(OPEN_PAREN);
			setState(566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(565);
				parameterList();
				}
			}

			setState(568);
			match(CLOSE_PAREN);
			setState(569);
			match(COLON);
			setState(570);
			value();
			setState(571);
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
		enterRule(_localctx, 76, RULE_functionB);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			match(OPEN_CURLY);
			setState(577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << CONST) | (1L << VAR) | (1L << IF) | (1L << THIS) | (1L << RETURN) | (1L << OPEN_PAREN))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (STRING - 67)) | (1L << (NUMBER - 67)) | (1L << (INTEGER - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
				{
				{
				setState(574);
				statement();
				}
				}
				setState(579);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(580);
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
		enterRule(_localctx, 78, RULE_propertystatment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			match(CONSOLE);
			setState(583);
			match(DOT);
			setState(584);
			match(LOG);
			setState(585);
			match(OPEN_PAREN);
			setState(586);
			expression(0);
			setState(587);
			match(CLOSE_PAREN);
			setState(588);
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
		enterRule(_localctx, 80, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			match(IDENTIFIER);
			setState(591);
			match(OPEN_PAREN);
			setState(592);
			parameter();
			setState(597);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(593);
				match(COMMA);
				setState(594);
				parameter();
				}
				}
				setState(599);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(600);
			match(CLOSE_PAREN);
			setState(601);
			match(COLON);
			setState(602);
			value();
			setState(603);
			match(OPEN_CURLY);
			setState(607);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << CONST) | (1L << VAR) | (1L << IF) | (1L << THIS) | (1L << RETURN) | (1L << OPEN_PAREN))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (STRING - 67)) | (1L << (NUMBER - 67)) | (1L << (INTEGER - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
				{
				{
				setState(604);
				statement();
				}
				}
				setState(609);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(610);
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
		enterRule(_localctx, 82, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PUBLIC) | (1L << PROTECTED))) != 0)) {
				{
				setState(612);
				modifiers();
				}
			}

			setState(615);
			match(IDENTIFIER);
			setState(616);
			match(COLON);
			setState(617);
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
		enterRule(_localctx, 84, RULE_modifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
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
		enterRule(_localctx, 86, RULE_statement);
		try {
			setState(643);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				_localctx = new LABELED_STATEMENTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(621);
				match(IDENTIFIER);
				setState(622);
				match(COLON);
				setState(623);
				statement();
				}
				break;
			case 2:
				_localctx = new EXPRESSION_STATEMENTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(624);
				expression(0);
				setState(625);
				match(SEMICOLON);
				}
				break;
			case 3:
				_localctx = new IF_STATEMENTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(627);
				ifStatement();
				}
				break;
			case 4:
				_localctx = new LOOP_STATEMENTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(628);
				loopStatement();
				}
				break;
			case 5:
				_localctx = new SWITCH_STATEMENTContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(629);
				switchStatement();
				}
				break;
			case 6:
				_localctx = new METHOD_DECLARATION_STATEMENTContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(630);
				methodDeclaration();
				}
				break;
			case 7:
				_localctx = new PROPERTY_DECLARATION_STATEMENTContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(631);
				propertyDeclaration();
				}
				break;
			case 8:
				_localctx = new FUNCTION_CALL_STATEMENTContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(632);
				functionCall();
				setState(633);
				match(SEMICOLON);
				}
				break;
			case 9:
				_localctx = new ASSIGNMENT_STATEMENTContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(635);
				match(IDENTIFIER);
				setState(636);
				match(EQUALS);
				setState(637);
				expression(0);
				setState(638);
				match(SEMICOLON);
				}
				break;
			case 10:
				_localctx = new RETURN_STATEMENTContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(640);
				returnStatement();
				}
				break;
			case 11:
				_localctx = new PROPERTY_ACCESS_STATEMENTContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(641);
				propertyAccess();
				}
				break;
			case 12:
				_localctx = new CONSOLE_STATEMENTContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(642);
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
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				_localctx = new FUNCTIONCALLLABELContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(646);
				functionCall();
				}
				break;
			case 2:
				{
				_localctx = new EXPPROContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(647);
				propertyAccess();
				}
				break;
			case 3:
				{
				_localctx = new EXPPARENContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(648);
				match(OPEN_PAREN);
				setState(649);
				expression(0);
				setState(650);
				match(CLOSE_PAREN);
				}
				break;
			case 4:
				{
				_localctx = new EXPIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(652);
				match(IDENTIFIER);
				}
				break;
			case 5:
				{
				_localctx = new EXPSTRINGContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(653);
				match(STRING);
				}
				break;
			case 6:
				{
				_localctx = new EXPNUMBERContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(654);
				match(NUMBER);
				}
				break;
			case 7:
				{
				_localctx = new EXPINTEGERContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(655);
				match(INTEGER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(688);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(686);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						_localctx = new EXPPLUSContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(658);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(659);
						match(PLUS);
						setState(660);
						expression(18);
						}
						break;
					case 2:
						{
						_localctx = new EXPMINUSContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(661);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(662);
						match(MINUS);
						setState(663);
						expression(17);
						}
						break;
					case 3:
						{
						_localctx = new EXPEQUALSContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(664);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(665);
						match(EQUALS);
						setState(666);
						expression(16);
						}
						break;
					case 4:
						{
						_localctx = new EXPLESSContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(667);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(668);
						match(LESS_THAN);
						setState(669);
						expression(15);
						}
						break;
					case 5:
						{
						_localctx = new EXPGREATERContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(670);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(671);
						match(GREATER_THAN);
						setState(672);
						expression(14);
						}
						break;
					case 6:
						{
						_localctx = new EXPSTARContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(673);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(674);
						match(STAR);
						setState(675);
						expression(13);
						}
						break;
					case 7:
						{
						_localctx = new EXPDIVIDEContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(676);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(677);
						match(DIVIDE);
						setState(678);
						expression(12);
						}
						break;
					case 8:
						{
						_localctx = new EXPMODContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(679);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(680);
						match(MOD);
						setState(681);
						expression(11);
						}
						break;
					case 9:
						{
						_localctx = new EXPPLUSPLUSContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(682);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(683);
						match(PLUS_PLUS);
						}
						break;
					case 10:
						{
						_localctx = new EXPMINMINContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(684);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(685);
						match(MINUS_MINUS);
						}
						break;
					}
					} 
				}
				setState(690);
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
		enterRule(_localctx, 90, RULE_propertyAccess);
		try {
			setState(694);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				_localctx = new CALFUNLABELContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(691);
				calfun();
				}
				break;
			case 2:
				_localctx = new IDDOTLABELContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(692);
				iddot();
				}
				break;
			case 3:
				_localctx = new FUNCTHISLABELContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(693);
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
		enterRule(_localctx, 92, RULE_calfun);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			match(THIS);
			setState(697);
			match(DOT);
			setState(698);
			match(IDENTIFIER);
			setState(703);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(699);
					match(DOT);
					setState(700);
					match(IDENTIFIER);
					}
					} 
				}
				setState(705);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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
		enterRule(_localctx, 94, RULE_iddot);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			match(IDENTIFIER);
			setState(709); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(707);
					match(DOT);
					setState(708);
					match(IDENTIFIER);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(711); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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
		enterRule(_localctx, 96, RULE_functhis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			match(THIS);
			setState(714);
			match(DOT);
			setState(715);
			match(IDENTIFIER);
			setState(716);
			match(DOT);
			setState(717);
			match(GET_PRODUCTS);
			setState(718);
			match(OPEN_PAREN);
			setState(719);
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
		enterRule(_localctx, 98, RULE_functionCall);
		int _la;
		try {
			setState(760);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(721);
				propertyAccess();
				setState(722);
				match(OPEN_PAREN);
				setState(731);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (THIS - 31)) | (1L << (OPEN_PAREN - 31)) | (1L << (STRING - 31)) | (1L << (NUMBER - 31)) | (1L << (INTEGER - 31)) | (1L << (IDENTIFIER - 31)))) != 0)) {
					{
					setState(723);
					expression(0);
					setState(728);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(724);
						match(COMMA);
						setState(725);
						expression(0);
						}
						}
						setState(730);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(733);
				match(CLOSE_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(735);
				match(IDENTIFIER);
				setState(736);
				match(OPEN_PAREN);
				setState(745);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (THIS - 31)) | (1L << (OPEN_PAREN - 31)) | (1L << (STRING - 31)) | (1L << (NUMBER - 31)) | (1L << (INTEGER - 31)) | (1L << (IDENTIFIER - 31)))) != 0)) {
					{
					setState(737);
					expression(0);
					setState(742);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(738);
						match(COMMA);
						setState(739);
						expression(0);
						}
						}
						setState(744);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(747);
				match(CLOSE_PAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(748);
				propertyAccess();
				setState(749);
				match(OPEN_PAREN);
				setState(751);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (THIS - 31)) | (1L << (OPEN_PAREN - 31)) | (1L << (STRING - 31)) | (1L << (NUMBER - 31)) | (1L << (INTEGER - 31)) | (1L << (IDENTIFIER - 31)))) != 0)) {
					{
					setState(750);
					argumentList();
					}
				}

				setState(753);
				match(CLOSE_PAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(755);
				propertyAccess();
				setState(756);
				match(OPEN_PAREN);
				setState(757);
				match(CLOSE_PAREN);
				setState(758);
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
		enterRule(_localctx, 100, RULE_selectProduct);
		int _la;
		try {
			_localctx = new SELECTPRODUCTLABELContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			match(SELECTPRODUCT);
			setState(763);
			match(OPEN_PAREN);
			setState(764);
			parameter();
			setState(769);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(765);
				match(COMMA);
				setState(766);
				parameter();
				}
				}
				setState(771);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(772);
			match(CLOSE_PAREN);
			setState(775);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(773);
				match(COLON);
				setState(774);
				match(VOID);
				}
			}

			setState(777);
			match(OPEN_CURLY);
			setState(781);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << CONST) | (1L << VAR) | (1L << IF) | (1L << THIS) | (1L << RETURN) | (1L << OPEN_PAREN))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (STRING - 67)) | (1L << (NUMBER - 67)) | (1L << (INTEGER - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
				{
				{
				setState(778);
				statement();
				}
				}
				setState(783);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(784);
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
		enterRule(_localctx, 102, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(786);
			expression(0);
			setState(791);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(787);
				match(COMMA);
				setState(788);
				expression(0);
				}
				}
				setState(793);
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
		enterRule(_localctx, 104, RULE_arrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(794);
			match(OPEN_SQUARE);
			setState(803);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (THIS - 31)) | (1L << (OPEN_PAREN - 31)) | (1L << (STRING - 31)) | (1L << (NUMBER - 31)) | (1L << (INTEGER - 31)) | (1L << (IDENTIFIER - 31)))) != 0)) {
				{
				setState(795);
				expression(0);
				setState(800);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(796);
					match(COMMA);
					setState(797);
					expression(0);
					}
					}
					setState(802);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(805);
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
		enterRule(_localctx, 106, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(807);
				match(EXPORT);
				}
			}

			setState(810);
			match(INTERFACE);
			setState(811);
			match(IDENTIFIER);
			setState(812);
			match(OPEN_CURLY);
			setState(813);
			interfaceBody();
			setState(814);
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
		enterRule(_localctx, 108, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(816);
				interfaceMember();
				}
				}
				setState(821);
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
		enterRule(_localctx, 110, RULE_interfaceMember);
		try {
			setState(824);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(822);
				propertySignature();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(823);
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
		enterRule(_localctx, 112, RULE_propertySignature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(826);
			match(IDENTIFIER);
			setState(827);
			match(COLON);
			setState(828);
			value();
			setState(829);
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
		enterRule(_localctx, 114, RULE_methodSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
			match(IDENTIFIER);
			setState(832);
			match(OPEN_PAREN);
			setState(834);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(833);
				parameterList();
				}
			}

			setState(836);
			match(CLOSE_PAREN);
			setState(837);
			match(COLON);
			setState(838);
			value();
			setState(839);
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
		enterRule(_localctx, 116, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(841);
			parameter2();
			setState(846);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(842);
				match(COMMA);
				setState(843);
				parameter2();
				}
				}
				setState(848);
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
		enterRule(_localctx, 118, RULE_parameter2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(849);
			match(IDENTIFIER);
			setState(850);
			match(COLON);
			setState(851);
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
		enterRule(_localctx, 120, RULE_onbutton);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(853);
			match(ONBUTTONCLICK);
			setState(854);
			match(OPEN_PAREN);
			setState(855);
			match(CLOSE_PAREN);
			setState(856);
			match(OPEN_CURLY);
			setState(857);
			basevalue();
			setState(858);
			match(OPEN_PAREN);
			setState(859);
			expression(0);
			setState(860);
			match(CLOSE_PAREN);
			setState(861);
			match(SEMICOLON);
			setState(862);
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
		enterRule(_localctx, 122, RULE_arrayvalue);
		try {
			setState(873);
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
				setState(864);
				basevalue();
				setState(865);
				match(OPEN_SQUARE);
				setState(866);
				match(CLOSE_SQUARE);
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 2);
				{
				setState(868);
				match(ARRAY);
				setState(869);
				match(LESS_THAN);
				setState(870);
				basevalue();
				setState(871);
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
		enterRule(_localctx, 124, RULE_decorator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(875);
			match(OUTPUT);
			setState(876);
			match(OPEN_PAREN);
			setState(877);
			match(CLOSE_PAREN);
			setState(878);
			propertyAssignment();
			setState(879);
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
		enterRule(_localctx, 126, RULE_propertyAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(881);
			match(IDENTIFIER);
			setState(882);
			match(EQUALS);
			setState(883);
			match(NEW);
			setState(884);
			match(IDENTIFIER);
			setState(889);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(885);
				match(LESS_THAN);
				setState(886);
				value();
				setState(887);
				match(GREATER_THAN);
				}
			}

			setState(891);
			match(OPEN_PAREN);
			setState(892);
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
		enterRule(_localctx, 128, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(894);
			expression(0);
			setState(899);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(895);
				match(COMMA);
				setState(896);
				expression(0);
				}
				}
				setState(901);
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
		enterRule(_localctx, 130, RULE_ngOnInit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(902);
			match(NGONINIT);
			setState(903);
			match(OPEN_PAREN);
			setState(904);
			match(CLOSE_PAREN);
			setState(905);
			match(COLON);
			setState(906);
			match(VOID);
			setState(907);
			match(OPEN_CURLY);
			{
			setState(908);
			expression(0);
			setState(909);
			match(SEMICOLON);
			}
			setState(911);
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
		enterRule(_localctx, 132, RULE_lambdaExpression);
		int _la;
		try {
			setState(927);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(913);
				match(IDENTIFIER);
				setState(914);
				match(EQUALS);
				setState(915);
				match(OPEN_PAREN);
				setState(916);
				match(IDENTIFIER);
				setState(917);
				match(CLOSE_PAREN);
				setState(918);
				match(ARROW);
				setState(919);
				functionBody();
				}
				break;
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(920);
				match(OPEN_PAREN);
				setState(922);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(921);
					parameterList();
					}
				}

				setState(924);
				match(CLOSE_PAREN);
				setState(925);
				match(ARROW);
				setState(926);
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
		enterRule(_localctx, 134, RULE_functionBody);
		int _la;
		try {
			setState(938);
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
				setState(929);
				expression(0);
				}
				break;
			case OPEN_CURLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(930);
				match(OPEN_CURLY);
				setState(934);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << CONST) | (1L << VAR) | (1L << IF) | (1L << THIS) | (1L << RETURN) | (1L << OPEN_PAREN))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (STRING - 67)) | (1L << (NUMBER - 67)) | (1L << (INTEGER - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
					{
					{
					setState(931);
					statement();
					}
					}
					setState(936);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(937);
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
		enterRule(_localctx, 136, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(940);
			match(RETURN);
			setState(943);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(941);
				expressionList();
				}
				break;
			case 2:
				{
				setState(942);
				expression(0);
				}
				break;
			}
			setState(945);
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
		enterRule(_localctx, 138, RULE_htmlElement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(948); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(947);
					htmlElementassist();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(950); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
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
		enterRule(_localctx, 140, RULE_htmlElementassist);
		try {
			setState(956);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				_localctx = new STANDERHTMLELEMNTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(952);
				standardHtmlElement();
				}
				break;
			case 2:
				_localctx = new SELFCLOSEHTMLELEMNTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(953);
				selfClosingHtmlElement();
				}
				break;
			case 3:
				_localctx = new FIXEDHTMLELEMNTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(954);
				fixedHtmlElement();
				}
				break;
			case 4:
				_localctx = new ANGULARBUTTONLABELContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(955);
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
		enterRule(_localctx, 142, RULE_standardHtmlElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(958);
			opentag();
			setState(962);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (OPEN_SQUARE - 53)) | (1L << (OPEN_PAREN - 53)) | (1L << (IDENTIFIER - 53)) | (1L << (LESS_THAN - 53)) | (1L << (NG - 53)) | (1L << (NI - 53)))) != 0)) {
				{
				{
				setState(959);
				htmlAttribute();
				}
				}
				setState(964);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(965);
			match(GREATER_THAN);
			setState(969);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (OPEN_DOUBLE_CURLY - 51)) | (1L << (COLON - 51)) | (1L << (STRING - 51)) | (1L << (WS - 51)) | (1L << (LESS_THAN - 51)) | (1L << (LS - 51)) | (1L << (ARABIC_TEXT - 51)))) != 0)) {
				{
				{
				setState(966);
				htmlContent();
				}
				}
				setState(971);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(972);
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
		enterRule(_localctx, 144, RULE_selfClosingHtmlElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(974);
			opentag();
			setState(978);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (OPEN_SQUARE - 53)) | (1L << (OPEN_PAREN - 53)) | (1L << (IDENTIFIER - 53)) | (1L << (LESS_THAN - 53)) | (1L << (NG - 53)) | (1L << (NI - 53)))) != 0)) {
				{
				{
				setState(975);
				htmlAttribute();
				}
				}
				setState(980);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(981);
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
		enterRule(_localctx, 146, RULE_fixedHtmlElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(983);
			fixedtqg();
			setState(987);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (OPEN_SQUARE - 53)) | (1L << (OPEN_PAREN - 53)) | (1L << (IDENTIFIER - 53)) | (1L << (LESS_THAN - 53)) | (1L << (NG - 53)) | (1L << (NI - 53)))) != 0)) {
				{
				{
				setState(984);
				htmlAttribute();
				}
				}
				setState(989);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(990);
			match(GREATER_THAN);
			setState(994);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (OPEN_DOUBLE_CURLY - 51)) | (1L << (COLON - 51)) | (1L << (STRING - 51)) | (1L << (WS - 51)) | (1L << (LESS_THAN - 51)) | (1L << (LS - 51)) | (1L << (ARABIC_TEXT - 51)))) != 0)) {
				{
				{
				setState(991);
				htmlContent();
				}
				}
				setState(996);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(997);
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
		enterRule(_localctx, 148, RULE_angularButton);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(999);
			match(LESS_THAN);
			setState(1000);
			match(BUTTON);
			setState(1004);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (OPEN_SQUARE - 53)) | (1L << (OPEN_PAREN - 53)) | (1L << (IDENTIFIER - 53)) | (1L << (LESS_THAN - 53)) | (1L << (NG - 53)) | (1L << (NI - 53)))) != 0)) {
				{
				{
				setState(1001);
				htmlAttribute();
				}
				}
				setState(1006);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1007);
			match(GREATER_THAN);
			setState(1011);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (OPEN_DOUBLE_CURLY - 51)) | (1L << (COLON - 51)) | (1L << (STRING - 51)) | (1L << (WS - 51)) | (1L << (LESS_THAN - 51)) | (1L << (LS - 51)) | (1L << (ARABIC_TEXT - 51)))) != 0)) {
				{
				{
				setState(1008);
				htmlContent();
				}
				}
				setState(1013);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1014);
			match(GG);
			setState(1015);
			match(BUTTON);
			setState(1016);
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
		enterRule(_localctx, 150, RULE_opentag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1018);
			match(LESS_THAN);
			setState(1019);
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
		enterRule(_localctx, 152, RULE_closetag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1021);
			match(GG);
			setState(1022);
			match(IDENTIFIER);
			setState(1023);
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
		enterRule(_localctx, 154, RULE_fixedtqg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1025);
			match(LESS_THAN);
			setState(1026);
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
		enterRule(_localctx, 156, RULE_closefixedtag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1028);
			match(GG);
			setState(1029);
			match(FIXEDTAGNAME);
			setState(1030);
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
		enterRule(_localctx, 158, RULE_htmlAttribute);
		try {
			setState(1053);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				_localctx = new NORMALATTRIBUTEContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1032);
				match(IDENTIFIER);
				setState(1033);
				match(EQUALS);
				setState(1034);
				match(STRING);
				}
				break;
			case 2:
				_localctx = new SIMPLEATTRIBUTEContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1035);
				match(IDENTIFIER);
				}
				break;
			case 3:
				_localctx = new NGFORATTRIBUTEContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1036);
				ngfor();
				}
				break;
			case 4:
				_localctx = new NGIFATTRIBUTEContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1037);
				ngIf();
				}
				break;
			case 5:
				_localctx = new EVENTATTRIBUTEContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1038);
				eventBinding();
				}
				break;
			case 6:
				_localctx = new ANGULARBUTTONATTRIBUTEContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1039);
				angularButton();
				}
				break;
			case 7:
				_localctx = new PROPERTYBINDINGATTRIBUTEContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1040);
				match(OPEN_SQUARE);
				setState(1041);
				match(IDENTIFIER);
				setState(1042);
				match(CLOSE_SQUARE);
				setState(1043);
				match(EQUALS);
				setState(1044);
				expression(0);
				}
				break;
			case 8:
				_localctx = new EVENTBINDINGATTRIBUTEContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1045);
				match(OPEN_PAREN);
				setState(1046);
				match(IDENTIFIER);
				setState(1047);
				match(CLOSE_PAREN);
				setState(1048);
				match(EQUALS);
				setState(1049);
				expression(0);
				}
				break;
			case 9:
				_localctx = new EMPTYPROPERTYBINDINGATTRIBUTEContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1050);
				match(OPEN_SQUARE);
				setState(1051);
				match(IDENTIFIER);
				setState(1052);
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
		enterRule(_localctx, 160, RULE_ngIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1055);
			match(NI);
			setState(1056);
			match(EQUALS);
			setState(1057);
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
		enterRule(_localctx, 162, RULE_ngfor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1059);
			match(NG);
			setState(1060);
			match(EQUALS);
			setState(1061);
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
		enterRule(_localctx, 164, RULE_htmlContent);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1066); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(1066);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LESS_THAN:
						{
						setState(1063);
						htmlElement();
						}
						break;
					case COLON:
					case STRING:
					case WS:
					case LS:
					case ARABIC_TEXT:
						{
						setState(1064);
						textNode();
						}
						break;
					case OPEN_DOUBLE_CURLY:
						{
						setState(1065);
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
				setState(1068); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
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
		enterRule(_localctx, 166, RULE_interp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1070);
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
		enterRule(_localctx, 168, RULE_identifierChain);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1072);
			match(OPEN_DOUBLE_CURLY);
			setState(1073);
			match(IDENTIFIER);
			setState(1078);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(1074);
				match(DOT);
				setState(1075);
				match(IDENTIFIER);
				}
				}
				setState(1080);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1081);
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
		enterRule(_localctx, 170, RULE_eventBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1083);
			match(OPEN_PAREN);
			setState(1084);
			match(IDENTIFIER);
			setState(1085);
			match(CLOSE_PAREN);
			setState(1086);
			match(EQUALS);
			setState(1087);
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
		enterRule(_localctx, 172, RULE_textNode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1089);
			_la = _input.LA(1);
			if ( !(((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (COLON - 57)) | (1L << (STRING - 57)) | (1L << (WS - 57)) | (1L << (LS - 57)) | (1L << (ARABIC_TEXT - 57)))) != 0)) ) {
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
		case 44:
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
		"\u0004\u0001^\u0444\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"U\u0007U\u0002V\u0007V\u0001\u0000\u0005\u0000\u00b0\b\u0000\n\u0000\f"+
		"\u0000\u00b3\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001\u00bb\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u00c2\b\u0002\n\u0002\f\u0002"+
		"\u00c5\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0003\u0006"+
		"\u00dd\b\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00e1\b\u0006\n\u0006"+
		"\f\u0006\u00e4\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u00eb\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0005\f\u0101\b\f\n\f\f\f\u0104\t\f\u0001\f\u0001\f\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0003\r\u010c\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u0114\b\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u011d"+
		"\b\u0010\n\u0010\f\u0010\u0120\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0005\u0013\u0137\b\u0013\n\u0013\f\u0013\u013a\t\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0140\b\u0014\n\u0014\f\u0014"+
		"\u0143\t\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0003\u0016\u014d\b\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0003\u0017\u0156\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0166\b\u0018"+
		"\n\u0018\f\u0018\u0169\t\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u016e\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u0175\b\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005"+
		"\u001e\u0192\b\u001e\n\u001e\f\u001e\u0195\t\u001e\u0003\u001e\u0197\b"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u019c\b\u001e\n"+
		"\u001e\f\u001e\u019f\t\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0005\u001f\u01b1\b\u001f\n\u001f\f\u001f\u01b4\t\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u01ba\b\u001f\n\u001f"+
		"\f\u001f\u01bd\t\u001f\u0001\u001f\u0003\u001f\u01c0\b\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0005\u001f\u01ca\b\u001f\n\u001f\f\u001f\u01cd\t\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u01d2\b\u001f\n\u001f\f\u001f"+
		"\u01d5\t\u001f\u0001\u001f\u0003\u001f\u01d8\b\u001f\u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0005 \u01e0\b \n \f \u01e3\t \u0001 \u0001 \u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0005!\u01ed\b!\n!\f!\u01f0\t!\u0001"+
		"!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0005\"\u01fa"+
		"\b\"\n\"\f\"\u01fd\t\"\u0001\"\u0001\"\u0001\"\u0001\"\u0005\"\u0203\b"+
		"\"\n\"\f\"\u0206\t\"\u0001\"\u0003\"\u0209\b\"\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u021e\b#\u0001$\u0001$\u0001"+
		"$\u0001$\u0005$\u0224\b$\n$\f$\u0227\t$\u0001$\u0001$\u0001$\u0005$\u022c"+
		"\b$\n$\f$\u022f\t$\u0003$\u0231\b$\u0001%\u0001%\u0001%\u0001%\u0003%"+
		"\u0237\b%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0005&\u0240"+
		"\b&\n&\f&\u0243\t&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0005(\u0254"+
		"\b(\n(\f(\u0257\t(\u0001(\u0001(\u0001(\u0001(\u0001(\u0005(\u025e\b("+
		"\n(\f(\u0261\t(\u0001(\u0001(\u0001)\u0003)\u0266\b)\u0001)\u0001)\u0001"+
		")\u0001)\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003+\u0284\b+\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0003,\u0291"+
		"\b,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0005,\u02af"+
		"\b,\n,\f,\u02b2\t,\u0001-\u0001-\u0001-\u0003-\u02b7\b-\u0001.\u0001."+
		"\u0001.\u0001.\u0001.\u0005.\u02be\b.\n.\f.\u02c1\t.\u0001/\u0001/\u0001"+
		"/\u0004/\u02c6\b/\u000b/\f/\u02c7\u00010\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00011\u00011\u00011\u00011\u00011\u00051\u02d7\b1\n1"+
		"\f1\u02da\t1\u00031\u02dc\b1\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00051\u02e5\b1\n1\f1\u02e8\t1\u00031\u02ea\b1\u00011\u00011"+
		"\u00011\u00011\u00031\u02f0\b1\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00031\u02f9\b1\u00012\u00012\u00012\u00012\u00012\u00052\u0300"+
		"\b2\n2\f2\u0303\t2\u00012\u00012\u00012\u00032\u0308\b2\u00012\u00012"+
		"\u00052\u030c\b2\n2\f2\u030f\t2\u00012\u00012\u00013\u00013\u00013\u0005"+
		"3\u0316\b3\n3\f3\u0319\t3\u00014\u00014\u00014\u00014\u00054\u031f\b4"+
		"\n4\f4\u0322\t4\u00034\u0324\b4\u00014\u00014\u00015\u00035\u0329\b5\u0001"+
		"5\u00015\u00015\u00015\u00015\u00015\u00016\u00056\u0332\b6\n6\f6\u0335"+
		"\t6\u00017\u00017\u00037\u0339\b7\u00018\u00018\u00018\u00018\u00018\u0001"+
		"9\u00019\u00019\u00039\u0343\b9\u00019\u00019\u00019\u00019\u00019\u0001"+
		":\u0001:\u0001:\u0005:\u034d\b:\n:\f:\u0350\t:\u0001;\u0001;\u0001;\u0001"+
		";\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001"+
		"<\u0001<\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001"+
		"=\u0003=\u036a\b=\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001?\u0001"+
		"?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0003?\u037a\b?\u0001?\u0001"+
		"?\u0001?\u0001@\u0001@\u0001@\u0005@\u0382\b@\n@\f@\u0385\t@\u0001A\u0001"+
		"A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001"+
		"B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0003B\u039b"+
		"\bB\u0001B\u0001B\u0001B\u0003B\u03a0\bB\u0001C\u0001C\u0001C\u0005C\u03a5"+
		"\bC\nC\fC\u03a8\tC\u0001C\u0003C\u03ab\bC\u0001D\u0001D\u0001D\u0003D"+
		"\u03b0\bD\u0001D\u0001D\u0001E\u0004E\u03b5\bE\u000bE\fE\u03b6\u0001F"+
		"\u0001F\u0001F\u0001F\u0003F\u03bd\bF\u0001G\u0001G\u0005G\u03c1\bG\n"+
		"G\fG\u03c4\tG\u0001G\u0001G\u0005G\u03c8\bG\nG\fG\u03cb\tG\u0001G\u0001"+
		"G\u0001H\u0001H\u0005H\u03d1\bH\nH\fH\u03d4\tH\u0001H\u0001H\u0001I\u0001"+
		"I\u0005I\u03da\bI\nI\fI\u03dd\tI\u0001I\u0001I\u0005I\u03e1\bI\nI\fI\u03e4"+
		"\tI\u0001I\u0001I\u0001J\u0001J\u0001J\u0005J\u03eb\bJ\nJ\fJ\u03ee\tJ"+
		"\u0001J\u0001J\u0005J\u03f2\bJ\nJ\fJ\u03f5\tJ\u0001J\u0001J\u0001J\u0001"+
		"J\u0001K\u0001K\u0001K\u0001L\u0001L\u0001L\u0001L\u0001M\u0001M\u0001"+
		"M\u0001N\u0001N\u0001N\u0001N\u0001O\u0001O\u0001O\u0001O\u0001O\u0001"+
		"O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001"+
		"O\u0001O\u0001O\u0001O\u0001O\u0001O\u0003O\u041e\bO\u0001P\u0001P\u0001"+
		"P\u0001P\u0001Q\u0001Q\u0001Q\u0001Q\u0001R\u0001R\u0001R\u0004R\u042b"+
		"\bR\u000bR\fR\u042c\u0001S\u0001S\u0001T\u0001T\u0001T\u0001T\u0005T\u0435"+
		"\bT\nT\fT\u0438\tT\u0001T\u0001T\u0001U\u0001U\u0001U\u0001U\u0001U\u0001"+
		"U\u0001V\u0001V\u0001V\u0000\u0001XW\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u0000\u0005\u0003\u000000CCII\u0001\u0000\u000f"+
		"\u0011\u0001\u0000DE\u0001\u0000!#\u0005\u000099CCLLVV^^\u047f\u0000\u00b1"+
		"\u0001\u0000\u0000\u0000\u0002\u00ba\u0001\u0000\u0000\u0000\u0004\u00bc"+
		"\u0001\u0000\u0000\u0000\u0006\u00cb\u0001\u0000\u0000\u0000\b\u00cd\u0001"+
		"\u0000\u0000\u0000\n\u00d4\u0001\u0000\u0000\u0000\f\u00dc\u0001\u0000"+
		"\u0000\u0000\u000e\u00ea\u0001\u0000\u0000\u0000\u0010\u00ec\u0001\u0000"+
		"\u0000\u0000\u0012\u00f0\u0001\u0000\u0000\u0000\u0014\u00f4\u0001\u0000"+
		"\u0000\u0000\u0016\u00f8\u0001\u0000\u0000\u0000\u0018\u00fc\u0001\u0000"+
		"\u0000\u0000\u001a\u0107\u0001\u0000\u0000\u0000\u001c\u0113\u0001\u0000"+
		"\u0000\u0000\u001e\u0115\u0001\u0000\u0000\u0000 \u0118\u0001\u0000\u0000"+
		"\u0000\"\u0121\u0001\u0000\u0000\u0000$\u012c\u0001\u0000\u0000\u0000"+
		"&\u0133\u0001\u0000\u0000\u0000(\u013b\u0001\u0000\u0000\u0000*\u0146"+
		"\u0001\u0000\u0000\u0000,\u014c\u0001\u0000\u0000\u0000.\u0155\u0001\u0000"+
		"\u0000\u00000\u0167\u0001\u0000\u0000\u00002\u016d\u0001\u0000\u0000\u0000"+
		"4\u016f\u0001\u0000\u0000\u00006\u0178\u0001\u0000\u0000\u00008\u0180"+
		"\u0001\u0000\u0000\u0000:\u0182\u0001\u0000\u0000\u0000<\u018c\u0001\u0000"+
		"\u0000\u0000>\u01d7\u0001\u0000\u0000\u0000@\u01d9\u0001\u0000\u0000\u0000"+
		"B\u01e6\u0001\u0000\u0000\u0000D\u01f3\u0001\u0000\u0000\u0000F\u021d"+
		"\u0001\u0000\u0000\u0000H\u0230\u0001\u0000\u0000\u0000J\u0232\u0001\u0000"+
		"\u0000\u0000L\u023d\u0001\u0000\u0000\u0000N\u0246\u0001\u0000\u0000\u0000"+
		"P\u024e\u0001\u0000\u0000\u0000R\u0265\u0001\u0000\u0000\u0000T\u026b"+
		"\u0001\u0000\u0000\u0000V\u0283\u0001\u0000\u0000\u0000X\u0290\u0001\u0000"+
		"\u0000\u0000Z\u02b6\u0001\u0000\u0000\u0000\\\u02b8\u0001\u0000\u0000"+
		"\u0000^\u02c2\u0001\u0000\u0000\u0000`\u02c9\u0001\u0000\u0000\u0000b"+
		"\u02f8\u0001\u0000\u0000\u0000d\u02fa\u0001\u0000\u0000\u0000f\u0312\u0001"+
		"\u0000\u0000\u0000h\u031a\u0001\u0000\u0000\u0000j\u0328\u0001\u0000\u0000"+
		"\u0000l\u0333\u0001\u0000\u0000\u0000n\u0338\u0001\u0000\u0000\u0000p"+
		"\u033a\u0001\u0000\u0000\u0000r\u033f\u0001\u0000\u0000\u0000t\u0349\u0001"+
		"\u0000\u0000\u0000v\u0351\u0001\u0000\u0000\u0000x\u0355\u0001\u0000\u0000"+
		"\u0000z\u0369\u0001\u0000\u0000\u0000|\u036b\u0001\u0000\u0000\u0000~"+
		"\u0371\u0001\u0000\u0000\u0000\u0080\u037e\u0001\u0000\u0000\u0000\u0082"+
		"\u0386\u0001\u0000\u0000\u0000\u0084\u039f\u0001\u0000\u0000\u0000\u0086"+
		"\u03aa\u0001\u0000\u0000\u0000\u0088\u03ac\u0001\u0000\u0000\u0000\u008a"+
		"\u03b4\u0001\u0000\u0000\u0000\u008c\u03bc\u0001\u0000\u0000\u0000\u008e"+
		"\u03be\u0001\u0000\u0000\u0000\u0090\u03ce\u0001\u0000\u0000\u0000\u0092"+
		"\u03d7\u0001\u0000\u0000\u0000\u0094\u03e7\u0001\u0000\u0000\u0000\u0096"+
		"\u03fa\u0001\u0000\u0000\u0000\u0098\u03fd\u0001\u0000\u0000\u0000\u009a"+
		"\u0401\u0001\u0000\u0000\u0000\u009c\u0404\u0001\u0000\u0000\u0000\u009e"+
		"\u041d\u0001\u0000\u0000\u0000\u00a0\u041f\u0001\u0000\u0000\u0000\u00a2"+
		"\u0423\u0001\u0000\u0000\u0000\u00a4\u042a\u0001\u0000\u0000\u0000\u00a6"+
		"\u042e\u0001\u0000\u0000\u0000\u00a8\u0430\u0001\u0000\u0000\u0000\u00aa"+
		"\u043b\u0001\u0000\u0000\u0000\u00ac\u0441\u0001\u0000\u0000\u0000\u00ae"+
		"\u00b0\u0003\u0002\u0001\u0000\u00af\u00ae\u0001\u0000\u0000\u0000\u00b0"+
		"\u00b3\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b4\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005\u0000\u0000\u0001\u00b5"+
		"\u0001\u0001\u0000\u0000\u0000\u00b6\u00bb\u0003\u0004\u0002\u0000\u00b7"+
		"\u00bb\u0003\b\u0004\u0000\u00b8\u00bb\u0003\u001a\r\u0000\u00b9\u00bb"+
		"\u0003\n\u0005\u0000\u00ba\u00b6\u0001\u0000\u0000\u0000\u00ba\u00b7\u0001"+
		"\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba\u00b9\u0001"+
		"\u0000\u0000\u0000\u00bb\u0003\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005"+
		"\u0001\u0000\u0000\u00bd\u00be\u00051\u0000\u0000\u00be\u00c3\u0003\u0006"+
		"\u0003\u0000\u00bf\u00c0\u0005:\u0000\u0000\u00c0\u00c2\u0003\u0006\u0003"+
		"\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c2\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c6\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c7\u00052\u0000\u0000\u00c7\u00c8\u0005\u0003\u0000\u0000"+
		"\u00c8\u00c9\u0005C\u0000\u0000\u00c9\u00ca\u0005;\u0000\u0000\u00ca\u0005"+
		"\u0001\u0000\u0000\u0000\u00cb\u00cc\u0007\u0000\u0000\u0000\u00cc\u0007"+
		"\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005\u0002\u0000\u0000\u00ce\u00cf"+
		"\u00057\u0000\u0000\u00cf\u00d0\u00051\u0000\u0000\u00d0\u00d1\u0003\f"+
		"\u0006\u0000\u00d1\u00d2\u00052\u0000\u0000\u00d2\u00d3\u00058\u0000\u0000"+
		"\u00d3\t\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005%\u0000\u0000\u00d5"+
		"\u00d6\u00057\u0000\u0000\u00d6\u00d7\u00051\u0000\u0000\u00d7\u00d8\u0003"+
		"\f\u0006\u0000\u00d8\u00d9\u00052\u0000\u0000\u00d9\u00da\u00058\u0000"+
		"\u0000\u00da\u000b\u0001\u0000\u0000\u0000\u00db\u00dd\u0003\u000e\u0007"+
		"\u0000\u00dc\u00db\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000"+
		"\u0000\u00dd\u00e2\u0001\u0000\u0000\u0000\u00de\u00df\u0005:\u0000\u0000"+
		"\u00df\u00e1\u0003\u000e\u0007\u0000\u00e0\u00de\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e4\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\r\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e2\u0001\u0000\u0000\u0000\u00e5\u00eb\u0003\u0016\u000b\u0000\u00e6"+
		"\u00eb\u0003\u0018\f\u0000\u00e7\u00eb\u0003\u0014\n\u0000\u00e8\u00eb"+
		"\u0003\u0012\t\u0000\u00e9\u00eb\u0003\u0010\b\u0000\u00ea\u00e5\u0001"+
		"\u0000\u0000\u0000\u00ea\u00e6\u0001\u0000\u0000\u0000\u00ea\u00e7\u0001"+
		"\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea\u00e9\u0001"+
		"\u0000\u0000\u0000\u00eb\u000f\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005"+
		"\u0016\u0000\u0000\u00ed\u00ee\u00059\u0000\u0000\u00ee\u00ef\u0005C\u0000"+
		"\u0000\u00ef\u0011\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005\u0019\u0000"+
		"\u0000\u00f1\u00f2\u00059\u0000\u0000\u00f2\u00f3\u0005C\u0000\u0000\u00f3"+
		"\u0013\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005\u0017\u0000\u0000\u00f5"+
		"\u00f6\u00059\u0000\u0000\u00f6\u00f7\u0005C\u0000\u0000\u00f7\u0015\u0001"+
		"\u0000\u0000\u0000\u00f8\u00f9\u0005\u0018\u0000\u0000\u00f9\u00fa\u0005"+
		"9\u0000\u0000\u00fa\u00fb\u0005C\u0000\u0000\u00fb\u0017\u0001\u0000\u0000"+
		"\u0000\u00fc\u00fd\u0005\u0018\u0000\u0000\u00fd\u00fe\u00059\u0000\u0000"+
		"\u00fe\u0102\u0005@\u0000\u0000\u00ff\u0101\u0003\u008aE\u0000\u0100\u00ff"+
		"\u0001\u0000\u0000\u0000\u0101\u0104\u0001\u0000\u0000\u0000\u0102\u0100"+
		"\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103\u0105"+
		"\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0105\u0106"+
		"\u0005@\u0000\u0000\u0106\u0019\u0001\u0000\u0000\u0000\u0107\u0108\u0005"+
		"\u0004\u0000\u0000\u0108\u0109\u0005\u0005\u0000\u0000\u0109\u010b\u0005"+
		"I\u0000\u0000\u010a\u010c\u0003\u001c\u000e\u0000\u010b\u010a\u0001\u0000"+
		"\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000"+
		"\u0000\u0000\u010d\u010e\u00051\u0000\u0000\u010e\u010f\u00030\u0018\u0000"+
		"\u010f\u0110\u00052\u0000\u0000\u0110\u001b\u0001\u0000\u0000\u0000\u0111"+
		"\u0114\u0003\u001e\u000f\u0000\u0112\u0114\u0003 \u0010\u0000\u0113\u0111"+
		"\u0001\u0000\u0000\u0000\u0113\u0112\u0001\u0000\u0000\u0000\u0114\u001d"+
		"\u0001\u0000\u0000\u0000\u0115\u0116\u0005/\u0000\u0000\u0116\u0117\u0005"+
		"I\u0000\u0000\u0117\u001f\u0001\u0000\u0000\u0000\u0118\u0119\u0005.\u0000"+
		"\u0000\u0119\u011e\u0003,\u0016\u0000\u011a\u011b\u0005:\u0000\u0000\u011b"+
		"\u011d\u0005I\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011d\u0120"+
		"\u0001\u0000\u0000\u0000\u011e\u011c\u0001\u0000\u0000\u0000\u011e\u011f"+
		"\u0001\u0000\u0000\u0000\u011f!\u0001\u0000\u0000\u0000\u0120\u011e\u0001"+
		"\u0000\u0000\u0000\u0121\u0122\u0005&\u0000\u0000\u0122\u0123\u00057\u0000"+
		"\u0000\u0123\u0124\u00058\u0000\u0000\u0124\u0125\u00051\u0000\u0000\u0125"+
		"\u0126\u0005)\u0000\u0000\u0126\u0127\u00055\u0000\u0000\u0127\u0128\u0003"+
		"&\u0013\u0000\u0128\u0129\u00056\u0000\u0000\u0129\u012a\u0005;\u0000"+
		"\u0000\u012a\u012b\u00052\u0000\u0000\u012b#\u0001\u0000\u0000\u0000\u012c"+
		"\u012d\u0005I\u0000\u0000\u012d\u012e\u0005<\u0000\u0000\u012e\u012f\u0005"+
		"5\u0000\u0000\u012f\u0130\u0003&\u0013\u0000\u0130\u0131\u00056\u0000"+
		"\u0000\u0131\u0132\u0005;\u0000\u0000\u0132%\u0001\u0000\u0000\u0000\u0133"+
		"\u0138\u0003(\u0014\u0000\u0134\u0135\u0005:\u0000\u0000\u0135\u0137\u0003"+
		"(\u0014\u0000\u0136\u0134\u0001\u0000\u0000\u0000\u0137\u013a\u0001\u0000"+
		"\u0000\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000"+
		"\u0000\u0000\u0139\'\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000\u0000"+
		"\u0000\u013b\u013c\u00051\u0000\u0000\u013c\u0141\u0003*\u0015\u0000\u013d"+
		"\u013e\u0005:\u0000\u0000\u013e\u0140\u0003*\u0015\u0000\u013f\u013d\u0001"+
		"\u0000\u0000\u0000\u0140\u0143\u0001\u0000\u0000\u0000\u0141\u013f\u0001"+
		"\u0000\u0000\u0000\u0141\u0142\u0001\u0000\u0000\u0000\u0142\u0144\u0001"+
		"\u0000\u0000\u0000\u0143\u0141\u0001\u0000\u0000\u0000\u0144\u0145\u0005"+
		"2\u0000\u0000\u0145)\u0001\u0000\u0000\u0000\u0146\u0147\u0003.\u0017"+
		"\u0000\u0147\u0148\u00059\u0000\u0000\u0148\u0149\u0003,\u0016\u0000\u0149"+
		"+\u0001\u0000\u0000\u0000\u014a\u014d\u0003.\u0017\u0000\u014b\u014d\u0003"+
		"z=\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014c\u014b\u0001\u0000\u0000"+
		"\u0000\u014d-\u0001\u0000\u0000\u0000\u014e\u0156\u0005I\u0000\u0000\u014f"+
		"\u0156\u0005C\u0000\u0000\u0150\u0156\u0005F\u0000\u0000\u0151\u0156\u0005"+
		"\u001b\u0000\u0000\u0152\u0156\u0005(\u0000\u0000\u0153\u0156\u00050\u0000"+
		"\u0000\u0154\u0156\u0005[\u0000\u0000\u0155\u014e\u0001\u0000\u0000\u0000"+
		"\u0155\u014f\u0001\u0000\u0000\u0000\u0155\u0150\u0001\u0000\u0000\u0000"+
		"\u0155\u0151\u0001\u0000\u0000\u0000\u0155\u0152\u0001\u0000\u0000\u0000"+
		"\u0155\u0153\u0001\u0000\u0000\u0000\u0155\u0154\u0001\u0000\u0000\u0000"+
		"\u0156/\u0001\u0000\u0000\u0000\u0157\u0166\u00032\u0019\u0000\u0158\u0166"+
		"\u0003P(\u0000\u0159\u0166\u0003<\u001e\u0000\u015a\u0166\u0003V+\u0000"+
		"\u015b\u0166\u0003|>\u0000\u015c\u0166\u0003\u0082A\u0000\u015d\u0166"+
		"\u0003d2\u0000\u015e\u0166\u0003x<\u0000\u015f\u0166\u0003\"\u0011\u0000"+
		"\u0160\u0166\u0003$\u0012\u0000\u0161\u0166\u0003\u0084B\u0000\u0162\u0166"+
		"\u0003Z-\u0000\u0163\u0166\u0003J%\u0000\u0164\u0166\u0003@ \u0000\u0165"+
		"\u0157\u0001\u0000\u0000\u0000\u0165\u0158\u0001\u0000\u0000\u0000\u0165"+
		"\u0159\u0001\u0000\u0000\u0000\u0165\u015a\u0001\u0000\u0000\u0000\u0165"+
		"\u015b\u0001\u0000\u0000\u0000\u0165\u015c\u0001\u0000\u0000\u0000\u0165"+
		"\u015d\u0001\u0000\u0000\u0000\u0165\u015e\u0001\u0000\u0000\u0000\u0165"+
		"\u015f\u0001\u0000\u0000\u0000\u0165\u0160\u0001\u0000\u0000\u0000\u0165"+
		"\u0161\u0001\u0000\u0000\u0000\u0165\u0162\u0001\u0000\u0000\u0000\u0165"+
		"\u0163\u0001\u0000\u0000\u0000\u0165\u0164\u0001\u0000\u0000\u0000\u0166"+
		"\u0169\u0001\u0000\u0000\u0000\u0167\u0165\u0001\u0000\u0000\u0000\u0167"+
		"\u0168\u0001\u0000\u0000\u0000\u01681\u0001\u0000\u0000\u0000\u0169\u0167"+
		"\u0001\u0000\u0000\u0000\u016a\u016e\u00034\u001a\u0000\u016b\u016e\u0003"+
		"6\u001b\u0000\u016c\u016e\u0003:\u001d\u0000\u016d\u016a\u0001\u0000\u0000"+
		"\u0000\u016d\u016b\u0001\u0000\u0000\u0000\u016d\u016c\u0001\u0000\u0000"+
		"\u0000\u016e3\u0001\u0000\u0000\u0000\u016f\u0170\u0005I\u0000\u0000\u0170"+
		"\u0171\u00059\u0000\u0000\u0171\u0174\u0003,\u0016\u0000\u0172\u0173\u0005"+
		"<\u0000\u0000\u0173\u0175\u0003X,\u0000\u0174\u0172\u0001\u0000\u0000"+
		"\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000\u0000"+
		"\u0000\u0176\u0177\u0005;\u0000\u0000\u01775\u0001\u0000\u0000\u0000\u0178"+
		"\u0179\u00038\u001c\u0000\u0179\u017a\u0005I\u0000\u0000\u017a\u017b\u0005"+
		"9\u0000\u0000\u017b\u017c\u0003,\u0016\u0000\u017c\u017d\u0005<\u0000"+
		"\u0000\u017d\u017e\u0003,\u0016\u0000\u017e\u017f\u0005;\u0000\u0000\u017f"+
		"7\u0001\u0000\u0000\u0000\u0180\u0181\u0007\u0001\u0000\u0000\u01819\u0001"+
		"\u0000\u0000\u0000\u0182\u0183\u0005I\u0000\u0000\u0183\u0184\u00059\u0000"+
		"\u0000\u0184\u0185\u0003,\u0016\u0000\u0185\u0186\u00055\u0000\u0000\u0186"+
		"\u0187\u00056\u0000\u0000\u0187\u0188\u0005<\u0000\u0000\u0188\u0189\u0005"+
		"5\u0000\u0000\u0189\u018a\u00056\u0000\u0000\u018a\u018b\u0005;\u0000"+
		"\u0000\u018b;\u0001\u0000\u0000\u0000\u018c\u018d\u0005\u001c\u0000\u0000"+
		"\u018d\u0196\u00057\u0000\u0000\u018e\u0193\u0003R)\u0000\u018f\u0190"+
		"\u0005:\u0000\u0000\u0190\u0192\u0003R)\u0000\u0191\u018f\u0001\u0000"+
		"\u0000\u0000\u0192\u0195\u0001\u0000\u0000\u0000\u0193\u0191\u0001\u0000"+
		"\u0000\u0000\u0193\u0194\u0001\u0000\u0000\u0000\u0194\u0197\u0001\u0000"+
		"\u0000\u0000\u0195\u0193\u0001\u0000\u0000\u0000\u0196\u018e\u0001\u0000"+
		"\u0000\u0000\u0196\u0197\u0001\u0000\u0000\u0000\u0197\u0198\u0001\u0000"+
		"\u0000\u0000\u0198\u0199\u00058\u0000\u0000\u0199\u019d\u00051\u0000\u0000"+
		"\u019a\u019c\u0003V+\u0000\u019b\u019a\u0001\u0000\u0000\u0000\u019c\u019f"+
		"\u0001\u0000\u0000\u0000\u019d\u019b\u0001\u0000\u0000\u0000\u019d\u019e"+
		"\u0001\u0000\u0000\u0000\u019e\u01a0\u0001\u0000\u0000\u0000\u019f\u019d"+
		"\u0001\u0000\u0000\u0000\u01a0\u01a1\u00052\u0000\u0000\u01a1=\u0001\u0000"+
		"\u0000\u0000\u01a2\u01a3\u0005\u0006\u0000\u0000\u01a3\u01a4\u00057\u0000"+
		"\u0000\u01a4\u01a5\u0005\u000f\u0000\u0000\u01a5\u01a6\u0005I\u0000\u0000"+
		"\u01a6\u01a7\u0005<\u0000\u0000\u01a7\u01a8\u0003X,\u0000\u01a8\u01a9"+
		"\u0005;\u0000\u0000\u01a9\u01aa\u0003X,\u0000\u01aa\u01ab\u0005;\u0000"+
		"\u0000\u01ab\u01ac\u0005I\u0000\u0000\u01ac\u01ad\u0007\u0002\u0000\u0000"+
		"\u01ad\u01ae\u00058\u0000\u0000\u01ae\u01b2\u00051\u0000\u0000\u01af\u01b1"+
		"\u0003V+\u0000\u01b0\u01af\u0001\u0000\u0000\u0000\u01b1\u01b4\u0001\u0000"+
		"\u0000\u0000\u01b2\u01b0\u0001\u0000\u0000\u0000\u01b2\u01b3\u0001\u0000"+
		"\u0000\u0000\u01b3\u01b5\u0001\u0000\u0000\u0000\u01b4\u01b2\u0001\u0000"+
		"\u0000\u0000\u01b5\u01bf\u00052\u0000\u0000\u01b6\u01b7\u0005\u0014\u0000"+
		"\u0000\u01b7\u01bb\u00051\u0000\u0000\u01b8\u01ba\u0003V+\u0000\u01b9"+
		"\u01b8\u0001\u0000\u0000\u0000\u01ba\u01bd\u0001\u0000\u0000\u0000\u01bb"+
		"\u01b9\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000\u0000\u0000\u01bc"+
		"\u01be\u0001\u0000\u0000\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000\u01be"+
		"\u01c0\u00052\u0000\u0000\u01bf\u01b6\u0001\u0000\u0000\u0000\u01bf\u01c0"+
		"\u0001\u0000\u0000\u0000\u01c0\u01d8\u0001\u0000\u0000\u0000\u01c1\u01c2"+
		"\u0005\u0006\u0000\u0000\u01c2\u01c3\u00057\u0000\u0000\u01c3\u01c4\u0005"+
		"\u000f\u0000\u0000\u01c4\u01c5\u0005I\u0000\u0000\u01c5\u01c6\u0005\u0012"+
		"\u0000\u0000\u01c6\u01cb\u0005I\u0000\u0000\u01c7\u01c8\u0005U\u0000\u0000"+
		"\u01c8\u01ca\u0005I\u0000\u0000\u01c9\u01c7\u0001\u0000\u0000\u0000\u01ca"+
		"\u01cd\u0001\u0000\u0000\u0000\u01cb\u01c9\u0001\u0000\u0000\u0000\u01cb"+
		"\u01cc\u0001\u0000\u0000\u0000\u01cc\u01ce\u0001\u0000\u0000\u0000\u01cd"+
		"\u01cb\u0001\u0000\u0000\u0000\u01ce\u01cf\u00058\u0000\u0000\u01cf\u01d3"+
		"\u00051\u0000\u0000\u01d0\u01d2\u0003V+\u0000\u01d1\u01d0\u0001\u0000"+
		"\u0000\u0000\u01d2\u01d5\u0001\u0000\u0000\u0000\u01d3\u01d1\u0001\u0000"+
		"\u0000\u0000\u01d3\u01d4\u0001\u0000\u0000\u0000\u01d4\u01d6\u0001\u0000"+
		"\u0000\u0000\u01d5\u01d3\u0001\u0000\u0000\u0000\u01d6\u01d8\u00052\u0000"+
		"\u0000\u01d7\u01a2\u0001\u0000\u0000\u0000\u01d7\u01c1\u0001\u0000\u0000"+
		"\u0000\u01d8?\u0001\u0000\u0000\u0000\u01d9\u01da\u0005\n\u0000\u0000"+
		"\u01da\u01db\u00057\u0000\u0000\u01db\u01dc\u0003X,\u0000\u01dc\u01dd"+
		"\u00058\u0000\u0000\u01dd\u01e1\u00051\u0000\u0000\u01de\u01e0\u0003V"+
		"+\u0000\u01df\u01de\u0001\u0000\u0000\u0000\u01e0\u01e3\u0001\u0000\u0000"+
		"\u0000\u01e1\u01df\u0001\u0000\u0000\u0000\u01e1\u01e2\u0001\u0000\u0000"+
		"\u0000\u01e2\u01e4\u0001\u0000\u0000\u0000\u01e3\u01e1\u0001\u0000\u0000"+
		"\u0000\u01e4\u01e5\u00052\u0000\u0000\u01e5A\u0001\u0000\u0000\u0000\u01e6"+
		"\u01e7\u0005\u000b\u0000\u0000\u01e7\u01e8\u00057\u0000\u0000\u01e8\u01e9"+
		"\u0003X,\u0000\u01e9\u01ea\u00058\u0000\u0000\u01ea\u01ee\u00051\u0000"+
		"\u0000\u01eb\u01ed\u0003H$\u0000\u01ec\u01eb\u0001\u0000\u0000\u0000\u01ed"+
		"\u01f0\u0001\u0000\u0000\u0000\u01ee\u01ec\u0001\u0000\u0000\u0000\u01ee"+
		"\u01ef\u0001\u0000\u0000\u0000\u01ef\u01f1\u0001\u0000\u0000\u0000\u01f0"+
		"\u01ee\u0001\u0000\u0000\u0000\u01f1\u01f2\u00052\u0000\u0000\u01f2C\u0001"+
		"\u0000\u0000\u0000\u01f3\u01f4\u0005\u0013\u0000\u0000\u01f4\u01f5\u0005"+
		"7\u0000\u0000\u01f5\u01f6\u0003F#\u0000\u01f6\u01f7\u00058\u0000\u0000"+
		"\u01f7\u01fb\u00051\u0000\u0000\u01f8\u01fa\u0003V+\u0000\u01f9\u01f8"+
		"\u0001\u0000\u0000\u0000\u01fa\u01fd\u0001\u0000\u0000\u0000\u01fb\u01f9"+
		"\u0001\u0000\u0000\u0000\u01fb\u01fc\u0001\u0000\u0000\u0000\u01fc\u01fe"+
		"\u0001\u0000\u0000\u0000\u01fd\u01fb\u0001\u0000\u0000\u0000\u01fe\u0208"+
		"\u00052\u0000\u0000\u01ff\u0200\u0005\u0014\u0000\u0000\u0200\u0204\u0005"+
		"1\u0000\u0000\u0201\u0203\u0003V+\u0000\u0202\u0201\u0001\u0000\u0000"+
		"\u0000\u0203\u0206\u0001\u0000\u0000\u0000\u0204\u0202\u0001\u0000\u0000"+
		"\u0000\u0204\u0205\u0001\u0000\u0000\u0000\u0205\u0207\u0001\u0000\u0000"+
		"\u0000\u0206\u0204\u0001\u0000\u0000\u0000\u0207\u0209\u00052\u0000\u0000"+
		"\u0208\u01ff\u0001\u0000\u0000\u0000\u0208\u0209\u0001\u0000\u0000\u0000"+
		"\u0209E\u0001\u0000\u0000\u0000\u020a\u020b\u0003X,\u0000\u020b\u020c"+
		"\u0005<\u0000\u0000\u020c\u020d\u0005<\u0000\u0000\u020d\u020e\u0005<"+
		"\u0000\u0000\u020e\u020f\u0003X,\u0000\u020f\u021e\u0001\u0000\u0000\u0000"+
		"\u0210\u0211\u0003X,\u0000\u0211\u0212\u0005<\u0000\u0000\u0212\u0213"+
		"\u0005<\u0000\u0000\u0213\u0214\u0003X,\u0000\u0214\u021e\u0001\u0000"+
		"\u0000\u0000\u0215\u0216\u0003X,\u0000\u0216\u0217\u0005>\u0000\u0000"+
		"\u0217\u0218\u0003X,\u0000\u0218\u021e\u0001\u0000\u0000\u0000\u0219\u021a"+
		"\u0003X,\u0000\u021a\u021b\u0005?\u0000\u0000\u021b\u021c\u0003X,\u0000"+
		"\u021c\u021e\u0001\u0000\u0000\u0000\u021d\u020a\u0001\u0000\u0000\u0000"+
		"\u021d\u0210\u0001\u0000\u0000\u0000\u021d\u0215\u0001\u0000\u0000\u0000"+
		"\u021d\u0219\u0001\u0000\u0000\u0000\u021eG\u0001\u0000\u0000\u0000\u021f"+
		"\u0220\u0005\f\u0000\u0000\u0220\u0221\u0003X,\u0000\u0221\u0225\u0005"+
		"9\u0000\u0000\u0222\u0224\u0003V+\u0000\u0223\u0222\u0001\u0000\u0000"+
		"\u0000\u0224\u0227\u0001\u0000\u0000\u0000\u0225\u0223\u0001\u0000\u0000"+
		"\u0000\u0225\u0226\u0001\u0000\u0000\u0000\u0226\u0231\u0001\u0000\u0000"+
		"\u0000\u0227\u0225\u0001\u0000\u0000\u0000\u0228\u0229\u0005\r\u0000\u0000"+
		"\u0229\u022d\u00059\u0000\u0000\u022a\u022c\u0003V+\u0000\u022b\u022a"+
		"\u0001\u0000\u0000\u0000\u022c\u022f\u0001\u0000\u0000\u0000\u022d\u022b"+
		"\u0001\u0000\u0000\u0000\u022d\u022e\u0001\u0000\u0000\u0000\u022e\u0231"+
		"\u0001\u0000\u0000\u0000\u022f\u022d\u0001\u0000\u0000\u0000\u0230\u021f"+
		"\u0001\u0000\u0000\u0000\u0230\u0228\u0001\u0000\u0000\u0000\u0231I\u0001"+
		"\u0000\u0000\u0000\u0232\u0233\u0005\u0007\u0000\u0000\u0233\u0234\u0005"+
		"I\u0000\u0000\u0234\u0236\u00057\u0000\u0000\u0235\u0237\u0003t:\u0000"+
		"\u0236\u0235\u0001\u0000\u0000\u0000\u0236\u0237\u0001\u0000\u0000\u0000"+
		"\u0237\u0238\u0001\u0000\u0000\u0000\u0238\u0239\u00058\u0000\u0000\u0239"+
		"\u023a\u00059\u0000\u0000\u023a\u023b\u0003,\u0016\u0000\u023b\u023c\u0003"+
		"L&\u0000\u023cK\u0001\u0000\u0000\u0000\u023d\u0241\u00051\u0000\u0000"+
		"\u023e\u0240\u0003V+\u0000\u023f\u023e\u0001\u0000\u0000\u0000\u0240\u0243"+
		"\u0001\u0000\u0000\u0000\u0241\u023f\u0001\u0000\u0000\u0000\u0241\u0242"+
		"\u0001\u0000\u0000\u0000\u0242\u0244\u0001\u0000\u0000\u0000\u0243\u0241"+
		"\u0001\u0000\u0000\u0000\u0244\u0245\u00052\u0000\u0000\u0245M\u0001\u0000"+
		"\u0000\u0000\u0246\u0247\u0005\b\u0000\u0000\u0247\u0248\u0005U\u0000"+
		"\u0000\u0248\u0249\u0005\t\u0000\u0000\u0249\u024a\u00057\u0000\u0000"+
		"\u024a\u024b\u0003X,\u0000\u024b\u024c\u00058\u0000\u0000\u024c\u024d"+
		"\u0005;\u0000\u0000\u024dO\u0001\u0000\u0000\u0000\u024e\u024f\u0005I"+
		"\u0000\u0000\u024f\u0250\u00057\u0000\u0000\u0250\u0255\u0003R)\u0000"+
		"\u0251\u0252\u0005:\u0000\u0000\u0252\u0254\u0003R)\u0000\u0253\u0251"+
		"\u0001\u0000\u0000\u0000\u0254\u0257\u0001\u0000\u0000\u0000\u0255\u0253"+
		"\u0001\u0000\u0000\u0000\u0255\u0256\u0001\u0000\u0000\u0000\u0256\u0258"+
		"\u0001\u0000\u0000\u0000\u0257\u0255\u0001\u0000\u0000\u0000\u0258\u0259"+
		"\u00058\u0000\u0000\u0259\u025a\u00059\u0000\u0000\u025a\u025b\u0003,"+
		"\u0016\u0000\u025b\u025f\u00051\u0000\u0000\u025c\u025e\u0003V+\u0000"+
		"\u025d\u025c\u0001\u0000\u0000\u0000\u025e\u0261\u0001\u0000\u0000\u0000"+
		"\u025f\u025d\u0001\u0000\u0000\u0000\u025f\u0260\u0001\u0000\u0000\u0000"+
		"\u0260\u0262\u0001\u0000\u0000\u0000\u0261\u025f\u0001\u0000\u0000\u0000"+
		"\u0262\u0263\u00052\u0000\u0000\u0263Q\u0001\u0000\u0000\u0000\u0264\u0266"+
		"\u0003T*\u0000\u0265\u0264\u0001\u0000\u0000\u0000\u0265\u0266\u0001\u0000"+
		"\u0000\u0000\u0266\u0267\u0001\u0000\u0000\u0000\u0267\u0268\u0005I\u0000"+
		"\u0000\u0268\u0269\u00059\u0000\u0000\u0269\u026a\u0003,\u0016\u0000\u026a"+
		"S\u0001\u0000\u0000\u0000\u026b\u026c\u0007\u0003\u0000\u0000\u026cU\u0001"+
		"\u0000\u0000\u0000\u026d\u026e\u0005I\u0000\u0000\u026e\u026f\u00059\u0000"+
		"\u0000\u026f\u0284\u0003V+\u0000\u0270\u0271\u0003X,\u0000\u0271\u0272"+
		"\u0005;\u0000\u0000\u0272\u0284\u0001\u0000\u0000\u0000\u0273\u0284\u0003"+
		"D\"\u0000\u0274\u0284\u0003>\u001f\u0000\u0275\u0284\u0003B!\u0000\u0276"+
		"\u0284\u0003P(\u0000\u0277\u0284\u00032\u0019\u0000\u0278\u0279\u0003"+
		"b1\u0000\u0279\u027a\u0005;\u0000\u0000\u027a\u0284\u0001\u0000\u0000"+
		"\u0000\u027b\u027c\u0005I\u0000\u0000\u027c\u027d\u0005<\u0000\u0000\u027d"+
		"\u027e\u0003X,\u0000\u027e\u027f\u0005;\u0000\u0000\u027f\u0284\u0001"+
		"\u0000\u0000\u0000\u0280\u0284\u0003\u0088D\u0000\u0281\u0284\u0003Z-"+
		"\u0000\u0282\u0284\u0003N\'\u0000\u0283\u026d\u0001\u0000\u0000\u0000"+
		"\u0283\u0270\u0001\u0000\u0000\u0000\u0283\u0273\u0001\u0000\u0000\u0000"+
		"\u0283\u0274\u0001\u0000\u0000\u0000\u0283\u0275\u0001\u0000\u0000\u0000"+
		"\u0283\u0276\u0001\u0000\u0000\u0000\u0283\u0277\u0001\u0000\u0000\u0000"+
		"\u0283\u0278\u0001\u0000\u0000\u0000\u0283\u027b\u0001\u0000\u0000\u0000"+
		"\u0283\u0280\u0001\u0000\u0000\u0000\u0283\u0281\u0001\u0000\u0000\u0000"+
		"\u0283\u0282\u0001\u0000\u0000\u0000\u0284W\u0001\u0000\u0000\u0000\u0285"+
		"\u0286\u0006,\uffff\uffff\u0000\u0286\u0291\u0003b1\u0000\u0287\u0291"+
		"\u0003Z-\u0000\u0288\u0289\u00057\u0000\u0000\u0289\u028a\u0003X,\u0000"+
		"\u028a\u028b\u00058\u0000\u0000\u028b\u0291\u0001\u0000\u0000\u0000\u028c"+
		"\u0291\u0005I\u0000\u0000\u028d\u0291\u0005C\u0000\u0000\u028e\u0291\u0005"+
		"F\u0000\u0000\u028f\u0291\u0005G\u0000\u0000\u0290\u0285\u0001\u0000\u0000"+
		"\u0000\u0290\u0287\u0001\u0000\u0000\u0000\u0290\u0288\u0001\u0000\u0000"+
		"\u0000\u0290\u028c\u0001\u0000\u0000\u0000\u0290\u028d\u0001\u0000\u0000"+
		"\u0000\u0290\u028e\u0001\u0000\u0000\u0000\u0290\u028f\u0001\u0000\u0000"+
		"\u0000\u0291\u02b0\u0001\u0000\u0000\u0000\u0292\u0293\n\u0011\u0000\u0000"+
		"\u0293\u0294\u0005S\u0000\u0000\u0294\u02af\u0003X,\u0012\u0295\u0296"+
		"\n\u0010\u0000\u0000\u0296\u0297\u0005T\u0000\u0000\u0297\u02af\u0003"+
		"X,\u0011\u0298\u0299\n\u000f\u0000\u0000\u0299\u029a\u0005<\u0000\u0000"+
		"\u029a\u02af\u0003X,\u0010\u029b\u029c\n\u000e\u0000\u0000\u029c\u029d"+
		"\u0005N\u0000\u0000\u029d\u02af\u0003X,\u000f\u029e\u029f\n\r\u0000\u0000"+
		"\u029f\u02a0\u0005O\u0000\u0000\u02a0\u02af\u0003X,\u000e\u02a1\u02a2"+
		"\n\f\u0000\u0000\u02a2\u02a3\u0005P\u0000\u0000\u02a3\u02af\u0003X,\r"+
		"\u02a4\u02a5\n\u000b\u0000\u0000\u02a5\u02a6\u0005Q\u0000\u0000\u02a6"+
		"\u02af\u0003X,\f\u02a7\u02a8\n\n\u0000\u0000\u02a8\u02a9\u0005R\u0000"+
		"\u0000\u02a9\u02af\u0003X,\u000b\u02aa\u02ab\n\u0007\u0000\u0000\u02ab"+
		"\u02af\u0005D\u0000\u0000\u02ac\u02ad\n\u0006\u0000\u0000\u02ad\u02af"+
		"\u0005E\u0000\u0000\u02ae\u0292\u0001\u0000\u0000\u0000\u02ae\u0295\u0001"+
		"\u0000\u0000\u0000\u02ae\u0298\u0001\u0000\u0000\u0000\u02ae\u029b\u0001"+
		"\u0000\u0000\u0000\u02ae\u029e\u0001\u0000\u0000\u0000\u02ae\u02a1\u0001"+
		"\u0000\u0000\u0000\u02ae\u02a4\u0001\u0000\u0000\u0000\u02ae\u02a7\u0001"+
		"\u0000\u0000\u0000\u02ae\u02aa\u0001\u0000\u0000\u0000\u02ae\u02ac\u0001"+
		"\u0000\u0000\u0000\u02af\u02b2\u0001\u0000\u0000\u0000\u02b0\u02ae\u0001"+
		"\u0000\u0000\u0000\u02b0\u02b1\u0001\u0000\u0000\u0000\u02b1Y\u0001\u0000"+
		"\u0000\u0000\u02b2\u02b0\u0001\u0000\u0000\u0000\u02b3\u02b7\u0003\\."+
		"\u0000\u02b4\u02b7\u0003^/\u0000\u02b5\u02b7\u0003`0\u0000\u02b6\u02b3"+
		"\u0001\u0000\u0000\u0000\u02b6\u02b4\u0001\u0000\u0000\u0000\u02b6\u02b5"+
		"\u0001\u0000\u0000\u0000\u02b7[\u0001\u0000\u0000\u0000\u02b8\u02b9\u0005"+
		"\u001f\u0000\u0000\u02b9\u02ba\u0005U\u0000\u0000\u02ba\u02bf\u0005I\u0000"+
		"\u0000\u02bb\u02bc\u0005U\u0000\u0000\u02bc\u02be\u0005I\u0000\u0000\u02bd"+
		"\u02bb\u0001\u0000\u0000\u0000\u02be\u02c1\u0001\u0000\u0000\u0000\u02bf"+
		"\u02bd\u0001\u0000\u0000\u0000\u02bf\u02c0\u0001\u0000\u0000\u0000\u02c0"+
		"]\u0001\u0000\u0000\u0000\u02c1\u02bf\u0001\u0000\u0000\u0000\u02c2\u02c5"+
		"\u0005I\u0000\u0000\u02c3\u02c4\u0005U\u0000\u0000\u02c4\u02c6\u0005I"+
		"\u0000\u0000\u02c5\u02c3\u0001\u0000\u0000\u0000\u02c6\u02c7\u0001\u0000"+
		"\u0000\u0000\u02c7\u02c5\u0001\u0000\u0000\u0000\u02c7\u02c8\u0001\u0000"+
		"\u0000\u0000\u02c8_\u0001\u0000\u0000\u0000\u02c9\u02ca\u0005\u001f\u0000"+
		"\u0000\u02ca\u02cb\u0005U\u0000\u0000\u02cb\u02cc\u0005I\u0000\u0000\u02cc"+
		"\u02cd\u0005U\u0000\u0000\u02cd\u02ce\u0005&\u0000\u0000\u02ce\u02cf\u0005"+
		"7\u0000\u0000\u02cf\u02d0\u00058\u0000\u0000\u02d0a\u0001\u0000\u0000"+
		"\u0000\u02d1\u02d2\u0003Z-\u0000\u02d2\u02db\u00057\u0000\u0000\u02d3"+
		"\u02d8\u0003X,\u0000\u02d4\u02d5\u0005:\u0000\u0000\u02d5\u02d7\u0003"+
		"X,\u0000\u02d6\u02d4\u0001\u0000\u0000\u0000\u02d7\u02da\u0001\u0000\u0000"+
		"\u0000\u02d8\u02d6\u0001\u0000\u0000\u0000\u02d8\u02d9\u0001\u0000\u0000"+
		"\u0000\u02d9\u02dc\u0001\u0000\u0000\u0000\u02da\u02d8\u0001\u0000\u0000"+
		"\u0000\u02db\u02d3\u0001\u0000\u0000\u0000\u02db\u02dc\u0001\u0000\u0000"+
		"\u0000\u02dc\u02dd\u0001\u0000\u0000\u0000\u02dd\u02de\u00058\u0000\u0000"+
		"\u02de\u02f9\u0001\u0000\u0000\u0000\u02df\u02e0\u0005I\u0000\u0000\u02e0"+
		"\u02e9\u00057\u0000\u0000\u02e1\u02e6\u0003X,\u0000\u02e2\u02e3\u0005"+
		":\u0000\u0000\u02e3\u02e5\u0003X,\u0000\u02e4\u02e2\u0001\u0000\u0000"+
		"\u0000\u02e5\u02e8\u0001\u0000\u0000\u0000\u02e6\u02e4\u0001\u0000\u0000"+
		"\u0000\u02e6\u02e7\u0001\u0000\u0000\u0000\u02e7\u02ea\u0001\u0000\u0000"+
		"\u0000\u02e8\u02e6\u0001\u0000\u0000\u0000\u02e9\u02e1\u0001\u0000\u0000"+
		"\u0000\u02e9\u02ea\u0001\u0000\u0000\u0000\u02ea\u02eb\u0001\u0000\u0000"+
		"\u0000\u02eb\u02f9\u00058\u0000\u0000\u02ec\u02ed\u0003Z-\u0000\u02ed"+
		"\u02ef\u00057\u0000\u0000\u02ee\u02f0\u0003f3\u0000\u02ef\u02ee\u0001"+
		"\u0000\u0000\u0000\u02ef\u02f0\u0001\u0000\u0000\u0000\u02f0\u02f1\u0001"+
		"\u0000\u0000\u0000\u02f1\u02f2\u00058\u0000\u0000\u02f2\u02f9\u0001\u0000"+
		"\u0000\u0000\u02f3\u02f4\u0003Z-\u0000\u02f4\u02f5\u00057\u0000\u0000"+
		"\u02f5\u02f6\u00058\u0000\u0000\u02f6\u02f7\u0005;\u0000\u0000\u02f7\u02f9"+
		"\u0001\u0000\u0000\u0000\u02f8\u02d1\u0001\u0000\u0000\u0000\u02f8\u02df"+
		"\u0001\u0000\u0000\u0000\u02f8\u02ec\u0001\u0000\u0000\u0000\u02f8\u02f3"+
		"\u0001\u0000\u0000\u0000\u02f9c\u0001\u0000\u0000\u0000\u02fa\u02fb\u0005"+
		"\u001d\u0000\u0000\u02fb\u02fc\u00057\u0000\u0000\u02fc\u0301\u0003R)"+
		"\u0000\u02fd\u02fe\u0005:\u0000\u0000\u02fe\u0300\u0003R)\u0000\u02ff"+
		"\u02fd\u0001\u0000\u0000\u0000\u0300\u0303\u0001\u0000\u0000\u0000\u0301"+
		"\u02ff\u0001\u0000\u0000\u0000\u0301\u0302\u0001\u0000\u0000\u0000\u0302"+
		"\u0304\u0001\u0000\u0000\u0000\u0303\u0301\u0001\u0000\u0000\u0000\u0304"+
		"\u0307\u00058\u0000\u0000\u0305\u0306\u00059\u0000\u0000\u0306\u0308\u0005"+
		"(\u0000\u0000\u0307\u0305\u0001\u0000\u0000\u0000\u0307\u0308\u0001\u0000"+
		"\u0000\u0000\u0308\u0309\u0001\u0000\u0000\u0000\u0309\u030d\u00051\u0000"+
		"\u0000\u030a\u030c\u0003V+\u0000\u030b\u030a\u0001\u0000\u0000\u0000\u030c"+
		"\u030f\u0001\u0000\u0000\u0000\u030d\u030b\u0001\u0000\u0000\u0000\u030d"+
		"\u030e\u0001\u0000\u0000\u0000\u030e\u0310\u0001\u0000\u0000\u0000\u030f"+
		"\u030d\u0001\u0000\u0000\u0000\u0310\u0311\u00052\u0000\u0000\u0311e\u0001"+
		"\u0000\u0000\u0000\u0312\u0317\u0003X,\u0000\u0313\u0314\u0005:\u0000"+
		"\u0000\u0314\u0316\u0003X,\u0000\u0315\u0313\u0001\u0000\u0000\u0000\u0316"+
		"\u0319\u0001\u0000\u0000\u0000\u0317\u0315\u0001\u0000\u0000\u0000\u0317"+
		"\u0318\u0001\u0000\u0000\u0000\u0318g\u0001\u0000\u0000\u0000\u0319\u0317"+
		"\u0001\u0000\u0000\u0000\u031a\u0323\u00055\u0000\u0000\u031b\u0320\u0003"+
		"X,\u0000\u031c\u031d\u0005:\u0000\u0000\u031d\u031f\u0003X,\u0000\u031e"+
		"\u031c\u0001\u0000\u0000\u0000\u031f\u0322\u0001\u0000\u0000\u0000\u0320"+
		"\u031e\u0001\u0000\u0000\u0000\u0320\u0321\u0001\u0000\u0000\u0000\u0321"+
		"\u0324\u0001\u0000\u0000\u0000\u0322\u0320\u0001\u0000\u0000\u0000\u0323"+
		"\u031b\u0001\u0000\u0000\u0000\u0323\u0324\u0001\u0000\u0000\u0000\u0324"+
		"\u0325\u0001\u0000\u0000\u0000\u0325\u0326\u00056\u0000\u0000\u0326i\u0001"+
		"\u0000\u0000\u0000\u0327\u0329\u0005\u0004\u0000\u0000\u0328\u0327\u0001"+
		"\u0000\u0000\u0000\u0328\u0329\u0001\u0000\u0000\u0000\u0329\u032a\u0001"+
		"\u0000\u0000\u0000\u032a\u032b\u0005\u000e\u0000\u0000\u032b\u032c\u0005"+
		"I\u0000\u0000\u032c\u032d\u00051\u0000\u0000\u032d\u032e\u0003l6\u0000"+
		"\u032e\u032f\u00052\u0000\u0000\u032fk\u0001\u0000\u0000\u0000\u0330\u0332"+
		"\u0003n7\u0000\u0331\u0330\u0001\u0000\u0000\u0000\u0332\u0335\u0001\u0000"+
		"\u0000\u0000\u0333\u0331\u0001\u0000\u0000\u0000\u0333\u0334\u0001\u0000"+
		"\u0000\u0000\u0334m\u0001\u0000\u0000\u0000\u0335\u0333\u0001\u0000\u0000"+
		"\u0000\u0336\u0339\u0003p8\u0000\u0337\u0339\u0003r9\u0000\u0338\u0336"+
		"\u0001\u0000\u0000\u0000\u0338\u0337\u0001\u0000\u0000\u0000\u0339o\u0001"+
		"\u0000\u0000\u0000\u033a\u033b\u0005I\u0000\u0000\u033b\u033c\u00059\u0000"+
		"\u0000\u033c\u033d\u0003,\u0016\u0000\u033d\u033e\u0005;\u0000\u0000\u033e"+
		"q\u0001\u0000\u0000\u0000\u033f\u0340\u0005I\u0000\u0000\u0340\u0342\u0005"+
		"7\u0000\u0000\u0341\u0343\u0003t:\u0000\u0342\u0341\u0001\u0000\u0000"+
		"\u0000\u0342\u0343\u0001\u0000\u0000\u0000\u0343\u0344\u0001\u0000\u0000"+
		"\u0000\u0344\u0345\u00058\u0000\u0000\u0345\u0346\u00059\u0000\u0000\u0346"+
		"\u0347\u0003,\u0016\u0000\u0347\u0348\u0005;\u0000\u0000\u0348s\u0001"+
		"\u0000\u0000\u0000\u0349\u034e\u0003v;\u0000\u034a\u034b\u0005:\u0000"+
		"\u0000\u034b\u034d\u0003v;\u0000\u034c\u034a\u0001\u0000\u0000\u0000\u034d"+
		"\u0350\u0001\u0000\u0000\u0000\u034e\u034c\u0001\u0000\u0000\u0000\u034e"+
		"\u034f\u0001\u0000\u0000\u0000\u034fu\u0001\u0000\u0000\u0000\u0350\u034e"+
		"\u0001\u0000\u0000\u0000\u0351\u0352\u0005I\u0000\u0000\u0352\u0353\u0005"+
		"9\u0000\u0000\u0353\u0354\u0003,\u0016\u0000\u0354w\u0001\u0000\u0000"+
		"\u0000\u0355\u0356\u0005\'\u0000\u0000\u0356\u0357\u00057\u0000\u0000"+
		"\u0357\u0358\u00058\u0000\u0000\u0358\u0359\u00051\u0000\u0000\u0359\u035a"+
		"\u0003.\u0017\u0000\u035a\u035b\u00057\u0000\u0000\u035b\u035c\u0003X"+
		",\u0000\u035c\u035d\u00058\u0000\u0000\u035d\u035e\u0005;\u0000\u0000"+
		"\u035e\u035f\u00052\u0000\u0000\u035fy\u0001\u0000\u0000\u0000\u0360\u0361"+
		"\u0003.\u0017\u0000\u0361\u0362\u00055\u0000\u0000\u0362\u0363\u00056"+
		"\u0000\u0000\u0363\u036a\u0001\u0000\u0000\u0000\u0364\u0365\u0005 \u0000"+
		"\u0000\u0365\u0366\u0005N\u0000\u0000\u0366\u0367\u0003.\u0017\u0000\u0367"+
		"\u0368\u0005O\u0000\u0000\u0368\u036a\u0001\u0000\u0000\u0000\u0369\u0360"+
		"\u0001\u0000\u0000\u0000\u0369\u0364\u0001\u0000\u0000\u0000\u036a{\u0001"+
		"\u0000\u0000\u0000\u036b\u036c\u0005+\u0000\u0000\u036c\u036d\u00057\u0000"+
		"\u0000\u036d\u036e\u00058\u0000\u0000\u036e\u036f\u0003~?\u0000\u036f"+
		"\u0370\u0005;\u0000\u0000\u0370}\u0001\u0000\u0000\u0000\u0371\u0372\u0005"+
		"I\u0000\u0000\u0372\u0373\u0005<\u0000\u0000\u0373\u0374\u0005-\u0000"+
		"\u0000\u0374\u0379\u0005I\u0000\u0000\u0375\u0376\u0005N\u0000\u0000\u0376"+
		"\u0377\u0003,\u0016\u0000\u0377\u0378\u0005O\u0000\u0000\u0378\u037a\u0001"+
		"\u0000\u0000\u0000\u0379\u0375\u0001\u0000\u0000\u0000\u0379\u037a\u0001"+
		"\u0000\u0000\u0000\u037a\u037b\u0001\u0000\u0000\u0000\u037b\u037c\u0005"+
		"7\u0000\u0000\u037c\u037d\u00058\u0000\u0000\u037d\u007f\u0001\u0000\u0000"+
		"\u0000\u037e\u0383\u0003X,\u0000\u037f\u0380\u0005:\u0000\u0000\u0380"+
		"\u0382\u0003X,\u0000\u0381\u037f\u0001\u0000\u0000\u0000\u0382\u0385\u0001"+
		"\u0000\u0000\u0000\u0383\u0381\u0001\u0000\u0000\u0000\u0383\u0384\u0001"+
		"\u0000\u0000\u0000\u0384\u0081\u0001\u0000\u0000\u0000\u0385\u0383\u0001"+
		"\u0000\u0000\u0000\u0386\u0387\u0005\u001e\u0000\u0000\u0387\u0388\u0005"+
		"7\u0000\u0000\u0388\u0389\u00058\u0000\u0000\u0389\u038a\u00059\u0000"+
		"\u0000\u038a\u038b\u0005(\u0000\u0000\u038b\u038c\u00051\u0000\u0000\u038c"+
		"\u038d\u0003X,\u0000\u038d\u038e\u0005;\u0000\u0000\u038e\u038f\u0001"+
		"\u0000\u0000\u0000\u038f\u0390\u00052\u0000\u0000\u0390\u0083\u0001\u0000"+
		"\u0000\u0000\u0391\u0392\u0005I\u0000\u0000\u0392\u0393\u0005<\u0000\u0000"+
		"\u0393\u0394\u00057\u0000\u0000\u0394\u0395\u0005I\u0000\u0000\u0395\u0396"+
		"\u00058\u0000\u0000\u0396\u0397\u0005B\u0000\u0000\u0397\u03a0\u0003\u0086"+
		"C\u0000\u0398\u039a\u00057\u0000\u0000\u0399\u039b\u0003t:\u0000\u039a"+
		"\u0399\u0001\u0000\u0000\u0000\u039a\u039b\u0001\u0000\u0000\u0000\u039b"+
		"\u039c\u0001\u0000\u0000\u0000\u039c\u039d\u00058\u0000\u0000\u039d\u039e"+
		"\u0005B\u0000\u0000\u039e\u03a0\u0003\u0086C\u0000\u039f\u0391\u0001\u0000"+
		"\u0000\u0000\u039f\u0398\u0001\u0000\u0000\u0000\u03a0\u0085\u0001\u0000"+
		"\u0000\u0000\u03a1\u03ab\u0003X,\u0000\u03a2\u03a6\u00051\u0000\u0000"+
		"\u03a3\u03a5\u0003V+\u0000\u03a4\u03a3\u0001\u0000\u0000\u0000\u03a5\u03a8"+
		"\u0001\u0000\u0000\u0000\u03a6\u03a4\u0001\u0000\u0000\u0000\u03a6\u03a7"+
		"\u0001\u0000\u0000\u0000\u03a7\u03a9\u0001\u0000\u0000\u0000\u03a8\u03a6"+
		"\u0001\u0000\u0000\u0000\u03a9\u03ab\u00052\u0000\u0000\u03aa\u03a1\u0001"+
		"\u0000\u0000\u0000\u03aa\u03a2\u0001\u0000\u0000\u0000\u03ab\u0087\u0001"+
		"\u0000\u0000\u0000\u03ac\u03af\u0005)\u0000\u0000\u03ad\u03b0\u0003\u0080"+
		"@\u0000\u03ae\u03b0\u0003X,\u0000\u03af\u03ad\u0001\u0000\u0000\u0000"+
		"\u03af\u03ae\u0001\u0000\u0000\u0000\u03b0\u03b1\u0001\u0000\u0000\u0000"+
		"\u03b1\u03b2\u0005;\u0000\u0000\u03b2\u0089\u0001\u0000\u0000\u0000\u03b3"+
		"\u03b5\u0003\u008cF\u0000\u03b4\u03b3\u0001\u0000\u0000\u0000\u03b5\u03b6"+
		"\u0001\u0000\u0000\u0000\u03b6\u03b4\u0001\u0000\u0000\u0000\u03b6\u03b7"+
		"\u0001\u0000\u0000\u0000\u03b7\u008b\u0001\u0000\u0000\u0000\u03b8\u03bd"+
		"\u0003\u008eG\u0000\u03b9\u03bd\u0003\u0090H\u0000\u03ba\u03bd\u0003\u0092"+
		"I\u0000\u03bb\u03bd\u0003\u0094J\u0000\u03bc\u03b8\u0001\u0000\u0000\u0000"+
		"\u03bc\u03b9\u0001\u0000\u0000\u0000\u03bc\u03ba\u0001\u0000\u0000\u0000"+
		"\u03bc\u03bb\u0001\u0000\u0000\u0000\u03bd\u008d\u0001\u0000\u0000\u0000"+
		"\u03be\u03c2\u0003\u0096K\u0000\u03bf\u03c1\u0003\u009eO\u0000\u03c0\u03bf"+
		"\u0001\u0000\u0000\u0000\u03c1\u03c4\u0001\u0000\u0000\u0000\u03c2\u03c0"+
		"\u0001\u0000\u0000\u0000\u03c2\u03c3\u0001\u0000\u0000\u0000\u03c3\u03c5"+
		"\u0001\u0000\u0000\u0000\u03c4\u03c2\u0001\u0000\u0000\u0000\u03c5\u03c9"+
		"\u0005O\u0000\u0000\u03c6\u03c8\u0003\u00a4R\u0000\u03c7\u03c6\u0001\u0000"+
		"\u0000\u0000\u03c8\u03cb\u0001\u0000\u0000\u0000\u03c9\u03c7\u0001\u0000"+
		"\u0000\u0000\u03c9\u03ca\u0001\u0000\u0000\u0000\u03ca\u03cc\u0001\u0000"+
		"\u0000\u0000\u03cb\u03c9\u0001\u0000\u0000\u0000\u03cc\u03cd\u0003\u0098"+
		"L\u0000\u03cd\u008f\u0001\u0000\u0000\u0000\u03ce\u03d2\u0003\u0096K\u0000"+
		"\u03cf\u03d1\u0003\u009eO\u0000\u03d0\u03cf\u0001\u0000\u0000\u0000\u03d1"+
		"\u03d4\u0001\u0000\u0000\u0000\u03d2\u03d0\u0001\u0000\u0000\u0000\u03d2"+
		"\u03d3\u0001\u0000\u0000\u0000\u03d3\u03d5\u0001\u0000\u0000\u0000\u03d4"+
		"\u03d2\u0001\u0000\u0000\u0000\u03d5\u03d6\u0005A\u0000\u0000\u03d6\u0091"+
		"\u0001\u0000\u0000\u0000\u03d7\u03db\u0003\u009aM\u0000\u03d8\u03da\u0003"+
		"\u009eO\u0000\u03d9\u03d8\u0001\u0000\u0000\u0000\u03da\u03dd\u0001\u0000"+
		"\u0000\u0000\u03db\u03d9\u0001\u0000\u0000\u0000\u03db\u03dc\u0001\u0000"+
		"\u0000\u0000\u03dc\u03de\u0001\u0000\u0000\u0000\u03dd\u03db\u0001\u0000"+
		"\u0000\u0000\u03de\u03e2\u0005O\u0000\u0000\u03df\u03e1\u0003\u00a4R\u0000"+
		"\u03e0\u03df\u0001\u0000\u0000\u0000\u03e1\u03e4\u0001\u0000\u0000\u0000"+
		"\u03e2\u03e0\u0001\u0000\u0000\u0000\u03e2\u03e3\u0001\u0000\u0000\u0000"+
		"\u03e3\u03e5\u0001\u0000\u0000\u0000\u03e4\u03e2\u0001\u0000\u0000\u0000"+
		"\u03e5\u03e6\u0003\u009cN\u0000\u03e6\u0093\u0001\u0000\u0000\u0000\u03e7"+
		"\u03e8\u0005N\u0000\u0000\u03e8\u03ec\u0005M\u0000\u0000\u03e9\u03eb\u0003"+
		"\u009eO\u0000\u03ea\u03e9\u0001\u0000\u0000\u0000\u03eb\u03ee\u0001\u0000"+
		"\u0000\u0000\u03ec\u03ea\u0001\u0000\u0000\u0000\u03ec\u03ed\u0001\u0000"+
		"\u0000\u0000\u03ed\u03ef\u0001\u0000\u0000\u0000\u03ee\u03ec\u0001\u0000"+
		"\u0000\u0000\u03ef\u03f3\u0005O\u0000\u0000\u03f0\u03f2\u0003\u00a4R\u0000"+
		"\u03f1\u03f0\u0001\u0000\u0000\u0000\u03f2\u03f5\u0001\u0000\u0000\u0000"+
		"\u03f3\u03f1\u0001\u0000\u0000\u0000\u03f3\u03f4\u0001\u0000\u0000\u0000"+
		"\u03f4\u03f6\u0001\u0000\u0000\u0000\u03f5\u03f3\u0001\u0000\u0000\u0000"+
		"\u03f6\u03f7\u0005]\u0000\u0000\u03f7\u03f8\u0005M\u0000\u0000\u03f8\u03f9"+
		"\u0005O\u0000\u0000\u03f9\u0095\u0001\u0000\u0000\u0000\u03fa\u03fb\u0005"+
		"N\u0000\u0000\u03fb\u03fc\u0005I\u0000\u0000\u03fc\u0097\u0001\u0000\u0000"+
		"\u0000\u03fd\u03fe\u0005]\u0000\u0000\u03fe\u03ff\u0005I\u0000\u0000\u03ff"+
		"\u0400\u0005O\u0000\u0000\u0400\u0099\u0001\u0000\u0000\u0000\u0401\u0402"+
		"\u0005N\u0000\u0000\u0402\u0403\u0005Y\u0000\u0000\u0403\u009b\u0001\u0000"+
		"\u0000\u0000\u0404\u0405\u0005]\u0000\u0000\u0405\u0406\u0005Y\u0000\u0000"+
		"\u0406\u0407\u0005O\u0000\u0000\u0407\u009d\u0001\u0000\u0000\u0000\u0408"+
		"\u0409\u0005I\u0000\u0000\u0409\u040a\u0005<\u0000\u0000\u040a\u041e\u0005"+
		"C\u0000\u0000\u040b\u041e\u0005I\u0000\u0000\u040c\u041e\u0003\u00a2Q"+
		"\u0000\u040d\u041e\u0003\u00a0P\u0000\u040e\u041e\u0003\u00aaU\u0000\u040f"+
		"\u041e\u0003\u0094J\u0000\u0410\u0411\u00055\u0000\u0000\u0411\u0412\u0005"+
		"I\u0000\u0000\u0412\u0413\u00056\u0000\u0000\u0413\u0414\u0005<\u0000"+
		"\u0000\u0414\u041e\u0003X,\u0000\u0415\u0416\u00057\u0000\u0000\u0416"+
		"\u0417\u0005I\u0000\u0000\u0417\u0418\u00058\u0000\u0000\u0418\u0419\u0005"+
		"<\u0000\u0000\u0419\u041e\u0003X,\u0000\u041a\u041b\u00055\u0000\u0000"+
		"\u041b\u041c\u0005I\u0000\u0000\u041c\u041e\u00056\u0000\u0000\u041d\u0408"+
		"\u0001\u0000\u0000\u0000\u041d\u040b\u0001\u0000\u0000\u0000\u041d\u040c"+
		"\u0001\u0000\u0000\u0000\u041d\u040d\u0001\u0000\u0000\u0000\u041d\u040e"+
		"\u0001\u0000\u0000\u0000\u041d\u040f\u0001\u0000\u0000\u0000\u041d\u0410"+
		"\u0001\u0000\u0000\u0000\u041d\u0415\u0001\u0000\u0000\u0000\u041d\u041a"+
		"\u0001\u0000\u0000\u0000\u041e\u009f\u0001\u0000\u0000\u0000\u041f\u0420"+
		"\u0005Z\u0000\u0000\u0420\u0421\u0005<\u0000\u0000\u0421\u0422\u0003X"+
		",\u0000\u0422\u00a1\u0001\u0000\u0000\u0000\u0423\u0424\u0005X\u0000\u0000"+
		"\u0424\u0425\u0005<\u0000\u0000\u0425\u0426\u0003X,\u0000\u0426\u00a3"+
		"\u0001\u0000\u0000\u0000\u0427\u042b\u0003\u008aE\u0000\u0428\u042b\u0003"+
		"\u00acV\u0000\u0429\u042b\u0003\u00a6S\u0000\u042a\u0427\u0001\u0000\u0000"+
		"\u0000\u042a\u0428\u0001\u0000\u0000\u0000\u042a\u0429\u0001\u0000\u0000"+
		"\u0000\u042b\u042c\u0001\u0000\u0000\u0000\u042c\u042a\u0001\u0000\u0000"+
		"\u0000\u042c\u042d\u0001\u0000\u0000\u0000\u042d\u00a5\u0001\u0000\u0000"+
		"\u0000\u042e\u042f\u0003\u00a8T\u0000\u042f\u00a7\u0001\u0000\u0000\u0000"+
		"\u0430\u0431\u00053\u0000\u0000\u0431\u0436\u0005I\u0000\u0000\u0432\u0433"+
		"\u0005U\u0000\u0000\u0433\u0435\u0005I\u0000\u0000\u0434\u0432\u0001\u0000"+
		"\u0000\u0000\u0435\u0438\u0001\u0000\u0000\u0000\u0436\u0434\u0001\u0000"+
		"\u0000\u0000\u0436\u0437\u0001\u0000\u0000\u0000\u0437\u0439\u0001\u0000"+
		"\u0000\u0000\u0438\u0436\u0001\u0000\u0000\u0000\u0439\u043a\u00054\u0000"+
		"\u0000\u043a\u00a9\u0001\u0000\u0000\u0000\u043b\u043c\u00057\u0000\u0000"+
		"\u043c\u043d\u0005I\u0000\u0000\u043d\u043e\u00058\u0000\u0000\u043e\u043f"+
		"\u0005<\u0000\u0000\u043f\u0440\u0003X,\u0000\u0440\u00ab\u0001\u0000"+
		"\u0000\u0000\u0441\u0442\u0007\u0004\u0000\u0000\u0442\u00ad\u0001\u0000"+
		"\u0000\u0000V\u00b1\u00ba\u00c3\u00dc\u00e2\u00ea\u0102\u010b\u0113\u011e"+
		"\u0138\u0141\u014c\u0155\u0165\u0167\u016d\u0174\u0193\u0196\u019d\u01b2"+
		"\u01bb\u01bf\u01cb\u01d3\u01d7\u01e1\u01ee\u01fb\u0204\u0208\u021d\u0225"+
		"\u022d\u0230\u0236\u0241\u0255\u025f\u0265\u0283\u0290\u02ae\u02b0\u02b6"+
		"\u02bf\u02c7\u02d8\u02db\u02e6\u02e9\u02ef\u02f8\u0301\u0307\u030d\u0317"+
		"\u0320\u0323\u0328\u0333\u0338\u0342\u034e\u0369\u0379\u0383\u039a\u039f"+
		"\u03a6\u03aa\u03af\u03b6\u03bc\u03c2\u03c9\u03d2\u03db\u03e2\u03ec\u03f3"+
		"\u041d\u042a\u042c\u0436";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}