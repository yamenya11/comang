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
		WS=75, LESS_THAN=76, GREATER_THAN=77, STAR=78, DIVIDE=79, MOD=80, PLUS=81, 
		MINUS=82, DOT=83, LS=84, Product=85, NG=86, NI=87, NULL=88, ATTVALUE_VALUE=89, 
		H1=90, BUTTON=91, H2=92, P=93, GG=94, ARABIC_TEXT=95;
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
		RULE_returnStatement = 65, RULE_htmlElement = 66, RULE_angularButton = 67, 
		RULE_selfClosingElement = 68, RULE_opentag = 69, RULE_htmlAttribute = 70, 
		RULE_closetag = 71, RULE_ngIf = 72, RULE_ngfor = 73, RULE_htmlContent = 74, 
		RULE_interp = 75, RULE_identifierChain = 76, RULE_eventBinding = 77, RULE_textNode = 78;
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
			"angularButton", "selfClosingElement", "opentag", "htmlAttribute", "closetag", 
			"ngIf", "ngfor", "htmlContent", "interp", "identifierChain", "eventBinding", 
			"textNode"
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
			"'--'", null, null, null, null, null, null, null, "'<'", "'>'", "'*'", 
			"'/'", "'%'", "'+'", "'-'", "'.'", null, "'product'", "'*ngFor'", "'*ngIf'", 
			"'null'", "'attvalue_value'", "'h1'", "'button'", "'h2'", "'p'", "'</'"
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
			"LINE_COMMENT", "BLOCK_COMMENT", "WS", "LESS_THAN", "GREATER_THAN", "STAR", 
			"DIVIDE", "MOD", "PLUS", "MINUS", "DOT", "LS", "Product", "NG", "NI", 
			"NULL", "ATTVALUE_VALUE", "H1", "BUTTON", "H2", "P", "GG", "ARABIC_TEXT"
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
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IMPORT) | (1L << COMPONENT) | (1L << EXPORT) | (1L << INJECTABLE))) != 0)) {
				{
				{
				setState(158);
				application();
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
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
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				_localctx = new IMPORTLABELContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				importStatement();
				}
				break;
			case COMPONENT:
				_localctx = new COMPONENTLABELContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				component();
				}
				break;
			case EXPORT:
				_localctx = new CLASSLABELContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				classDeclaration();
				}
				break;
			case INJECTABLE:
				_localctx = new INJECTABLELABELContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
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
			setState(172);
			match(IMPORT);
			setState(173);
			match(OPEN_CURLY);
			setState(174);
			keyimport();
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(175);
				match(COMMA);
				setState(176);
				keyimport();
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(182);
			match(CLOSE_CURLY);
			setState(183);
			match(FROM);
			setState(184);
			match(STRING);
			setState(185);
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
			setState(187);
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
			setState(189);
			match(COMPONENT);
			setState(190);
			match(OPEN_PAREN);
			setState(191);
			match(OPEN_CURLY);
			setState(192);
			metadata();
			setState(193);
			match(CLOSE_CURLY);
			setState(194);
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
			setState(196);
			match(INJECTABLE);
			setState(197);
			match(OPEN_PAREN);
			setState(198);
			match(OPEN_CURLY);
			setState(199);
			metadata();
			setState(200);
			match(CLOSE_CURLY);
			setState(201);
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
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PROVIDEDIN) | (1L << SELECTOR) | (1L << TEMPLATE) | (1L << TEMPLATEURL))) != 0)) {
				{
				setState(203);
				metadataEntry();
				}
			}

			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(206);
				match(COMMA);
				setState(207);
				metadataEntry();
				}
				}
				setState(212);
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
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new BasicMetadataLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				basicMetadata();
				}
				break;
			case 2:
				_localctx = new HtmlMetadataLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				htmlMetadata();
				}
				break;
			case 3:
				_localctx = new SELECTORLABELContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(215);
				selector();
				}
				break;
			case 4:
				_localctx = new TAMPLATEURLLABELContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(216);
				templateurl();
				}
				break;
			case 5:
				_localctx = new PROVIDINLABELContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(217);
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
			setState(220);
			match(PROVIDEDIN);
			setState(221);
			match(COLON);
			setState(222);
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
			setState(224);
			match(TEMPLATEURL);
			setState(225);
			match(COLON);
			setState(226);
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
			setState(228);
			match(SELECTOR);
			setState(229);
			match(COLON);
			setState(230);
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
			setState(232);
			match(TEMPLATE);
			setState(233);
			match(COLON);
			setState(234);
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
			setState(236);
			match(TEMPLATE);
			setState(237);
			match(COLON);
			setState(238);
			match(BACKTICK);
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LESS_THAN) {
				{
				{
				setState(239);
				htmlElement();
				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(245);
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
			setState(247);
			match(EXPORT);
			setState(248);
			match(CLASS);
			setState(249);
			match(IDENTIFIER);
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS || _la==EXTENDS) {
				{
				setState(250);
				classInheritance();
				}
			}

			setState(253);
			match(OPEN_CURLY);
			setState(254);
			classBody();
			setState(255);
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
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXTENDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				match(EXTENDS);
				setState(258);
				match(IDENTIFIER);
				}
				break;
			case IMPLEMENTS:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				match(IMPLEMENTS);
				setState(260);
				value();
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(261);
					match(COMMA);
					setState(262);
					match(IDENTIFIER);
					}
					}
					setState(267);
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
			setState(270);
			match(GET_PRODUCTS);
			setState(271);
			match(OPEN_PAREN);
			setState(272);
			match(CLOSE_PAREN);
			setState(273);
			match(OPEN_CURLY);
			setState(274);
			match(RETURN);
			setState(275);
			match(OPEN_SQUARE);
			setState(276);
			elementList();
			setState(277);
			match(CLOSE_SQUARE);
			setState(278);
			match(SEMICOLON);
			setState(279);
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
			setState(281);
			match(IDENTIFIER);
			setState(282);
			match(EQUALS);
			setState(283);
			match(OPEN_SQUARE);
			setState(284);
			elementList();
			setState(285);
			match(CLOSE_SQUARE);
			setState(286);
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
			setState(288);
			element();
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(289);
				match(COMMA);
				setState(290);
				element();
				}
				}
				setState(295);
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
			setState(296);
			match(OPEN_CURLY);
			setState(297);
			pair();
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(298);
				match(COMMA);
				setState(299);
				pair();
				}
				}
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(305);
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
			setState(307);
			basevalue();
			setState(308);
			match(COLON);
			setState(309);
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
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new BASEvalueLABELContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				basevalue();
				}
				break;
			case 2:
				_localctx = new ARRAYTAYPELABELContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
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
			setState(322);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new IDENTIFIRELABELContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				match(IDENTIFIER);
				}
				break;
			case STRING:
				_localctx = new STRINGLABELContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				match(STRING);
				}
				break;
			case NUMBER:
				_localctx = new NUMBERLABELContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(317);
				match(NUMBER);
				}
				break;
			case ANY:
				_localctx = new ANYLABELContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(318);
				match(ANY);
				}
				break;
			case VOID:
				_localctx = new VOIDLABELContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(319);
				match(VOID);
				}
				break;
			case ONINIT:
				_localctx = new ONINITLABELContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(320);
				match(ONINIT);
				}
				break;
			case NULL:
				_localctx = new NULLLABELContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(321);
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
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << FUNICTION) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << IF) | (1L << CONSTRUCTOR) | (1L << SELECTPRODUCT) | (1L << NGONINIT) | (1L << THIS) | (1L << GET_PRODUCTS) | (1L << ONBUTTONCLICK) | (1L << RETURN) | (1L << OUTPUT) | (1L << OPEN_PAREN))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (STRING - 66)) | (1L << (NUMBER - 66)) | (1L << (INTEGER - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
				{
				setState(337);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(324);
					propertyDeclaration();
					}
					break;
				case 2:
					{
					setState(325);
					methodDeclaration();
					}
					break;
				case 3:
					{
					setState(326);
					constructor();
					}
					break;
				case 4:
					{
					setState(327);
					statement();
					}
					break;
				case 5:
					{
					setState(328);
					decorator();
					}
					break;
				case 6:
					{
					setState(329);
					ngOnInit();
					}
					break;
				case 7:
					{
					setState(330);
					selectProduct();
					}
					break;
				case 8:
					{
					setState(331);
					onbutton();
					}
					break;
				case 9:
					{
					setState(332);
					getproduct();
					}
					break;
				case 10:
					{
					setState(333);
					products();
					}
					break;
				case 11:
					{
					setState(334);
					lambdaExpression();
					}
					break;
				case 12:
					{
					setState(335);
					propertyAccess();
					}
					break;
				case 13:
					{
					setState(336);
					functionDeclaration();
					}
					break;
				}
				}
				setState(341);
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
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new PROPIRTYLABELContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				regularProperty();
				}
				break;
			case 2:
				_localctx = new VARIBALLABELContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				letDeclaration();
				}
				break;
			case 3:
				_localctx = new DDDContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(344);
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
			setState(347);
			match(IDENTIFIER);
			setState(348);
			match(COLON);
			setState(349);
			value();
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(350);
				match(EQUALS);
				setState(351);
				expression(0);
				}
			}

			setState(354);
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
			setState(356);
			match(LET);
			setState(357);
			match(IDENTIFIER);
			setState(358);
			match(COLON);
			setState(359);
			value();
			setState(360);
			match(EQUALS);
			setState(361);
			value();
			setState(362);
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
			setState(364);
			match(IDENTIFIER);
			setState(365);
			match(COLON);
			setState(366);
			value();
			setState(367);
			match(OPEN_SQUARE);
			setState(368);
			match(CLOSE_SQUARE);
			setState(369);
			match(EQUALS);
			setState(370);
			match(OPEN_SQUARE);
			setState(371);
			match(CLOSE_SQUARE);
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
			setState(374);
			match(CONSTRUCTOR);
			setState(375);
			match(OPEN_PAREN);
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & ((1L << (PRIVATE - 32)) | (1L << (PUBLIC - 32)) | (1L << (PROTECTED - 32)) | (1L << (IDENTIFIER - 32)))) != 0)) {
				{
				setState(376);
				parameter();
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(377);
					match(COMMA);
					setState(378);
					parameter();
					}
					}
					setState(383);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(386);
			match(CLOSE_PAREN);
			setState(387);
			match(OPEN_CURLY);
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << IF) | (1L << THIS) | (1L << RETURN) | (1L << OPEN_PAREN))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (STRING - 66)) | (1L << (NUMBER - 66)) | (1L << (INTEGER - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
				{
				{
				setState(388);
				statement();
				}
				}
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(394);
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
			setState(439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(396);
				match(FOR);
				setState(397);
				match(OPEN_PAREN);
				setState(398);
				match(LET);
				setState(399);
				match(IDENTIFIER);
				setState(400);
				match(EQUALS);
				setState(401);
				expression(0);
				setState(402);
				match(SEMICOLON);
				setState(403);
				expression(0);
				setState(404);
				match(SEMICOLON);
				setState(405);
				match(IDENTIFIER);
				setState(406);
				_la = _input.LA(1);
				if ( !(_la==PLUS_PLUS || _la==MINUS_MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(407);
				match(CLOSE_PAREN);
				setState(408);
				match(OPEN_CURLY);
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << IF) | (1L << THIS) | (1L << RETURN) | (1L << OPEN_PAREN))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (STRING - 66)) | (1L << (NUMBER - 66)) | (1L << (INTEGER - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
					{
					{
					setState(409);
					statement();
					}
					}
					setState(414);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(415);
				match(CLOSE_CURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(417);
				match(FOR);
				setState(418);
				match(OPEN_PAREN);
				setState(419);
				match(LET);
				setState(420);
				match(IDENTIFIER);
				setState(421);
				match(IN);
				setState(422);
				match(IDENTIFIER);
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(423);
					match(DOT);
					setState(424);
					match(IDENTIFIER);
					}
					}
					setState(429);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(430);
				match(CLOSE_PAREN);
				setState(431);
				match(OPEN_CURLY);
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << IF) | (1L << THIS) | (1L << RETURN) | (1L << OPEN_PAREN))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (STRING - 66)) | (1L << (NUMBER - 66)) | (1L << (INTEGER - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
					{
					{
					setState(432);
					statement();
					}
					}
					setState(437);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(438);
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
			setState(441);
			match(WHILE);
			setState(442);
			match(OPEN_PAREN);
			setState(443);
			expression(0);
			setState(444);
			match(CLOSE_PAREN);
			setState(445);
			match(OPEN_CURLY);
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << IF) | (1L << THIS) | (1L << RETURN) | (1L << OPEN_PAREN))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (STRING - 66)) | (1L << (NUMBER - 66)) | (1L << (INTEGER - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
				{
				{
				setState(446);
				statement();
				}
				}
				setState(451);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(452);
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
			setState(454);
			match(SWITCH);
			setState(455);
			match(OPEN_PAREN);
			setState(456);
			expression(0);
			setState(457);
			match(CLOSE_PAREN);
			setState(458);
			match(OPEN_CURLY);
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(459);
				caseClause();
				}
				}
				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(465);
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
			setState(467);
			match(IF);
			setState(468);
			match(OPEN_PAREN);
			setState(469);
			equalityExpression();
			setState(470);
			match(CLOSE_PAREN);
			setState(471);
			match(OPEN_CURLY);
			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << IF) | (1L << THIS) | (1L << RETURN) | (1L << OPEN_PAREN))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (STRING - 66)) | (1L << (NUMBER - 66)) | (1L << (INTEGER - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
				{
				{
				setState(472);
				statement();
				}
				}
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(478);
			match(CLOSE_CURLY);
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(479);
				match(ELSE);
				setState(480);
				match(OPEN_CURLY);
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << IF) | (1L << THIS) | (1L << RETURN) | (1L << OPEN_PAREN))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (STRING - 66)) | (1L << (NUMBER - 66)) | (1L << (INTEGER - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
					{
					{
					setState(481);
					statement();
					}
					}
					setState(486);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(487);
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
			setState(509);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				_localctx = new StrictEqualityContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(490);
				expression(0);
				setState(491);
				match(EQUALS);
				setState(492);
				match(EQUALS);
				setState(493);
				match(EQUALS);
				setState(494);
				expression(0);
				}
				break;
			case 2:
				_localctx = new LooseEqualityContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(496);
				expression(0);
				setState(497);
				match(EQUALS);
				setState(498);
				match(EQUALS);
				setState(499);
				expression(0);
				}
				break;
			case 3:
				_localctx = new NotEqualityContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(501);
				expression(0);
				setState(502);
				match(NOT_EQUAL);
				setState(503);
				expression(0);
				}
				break;
			case 4:
				_localctx = new StrictNotEqualityContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(505);
				expression(0);
				setState(506);
				match(STRICT_NOT_EQUAL);
				setState(507);
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
			setState(528);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(511);
				match(CASE);
				setState(512);
				expression(0);
				setState(513);
				match(COLON);
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << IF) | (1L << THIS) | (1L << RETURN) | (1L << OPEN_PAREN))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (STRING - 66)) | (1L << (NUMBER - 66)) | (1L << (INTEGER - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
					{
					{
					setState(514);
					statement();
					}
					}
					setState(519);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(520);
				match(DEFAULT);
				setState(521);
				match(COLON);
				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << IF) | (1L << THIS) | (1L << RETURN) | (1L << OPEN_PAREN))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (STRING - 66)) | (1L << (NUMBER - 66)) | (1L << (INTEGER - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
					{
					{
					setState(522);
					statement();
					}
					}
					setState(527);
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
			setState(530);
			match(FUNICTION);
			setState(531);
			match(IDENTIFIER);
			setState(532);
			match(OPEN_PAREN);
			setState(534);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(533);
				parameterList();
				}
			}

			setState(536);
			match(CLOSE_PAREN);
			setState(537);
			match(COLON);
			setState(538);
			value();
			setState(539);
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
			setState(541);
			match(OPEN_CURLY);
			setState(545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << IF) | (1L << THIS) | (1L << RETURN) | (1L << OPEN_PAREN))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (STRING - 66)) | (1L << (NUMBER - 66)) | (1L << (INTEGER - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
				{
				{
				setState(542);
				statement();
				}
				}
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(548);
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
			setState(550);
			match(CONSOLE);
			setState(551);
			match(DOT);
			setState(552);
			match(LOG);
			setState(553);
			match(OPEN_PAREN);
			setState(554);
			expression(0);
			setState(555);
			match(CLOSE_PAREN);
			setState(556);
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
			setState(558);
			match(IDENTIFIER);
			setState(559);
			match(OPEN_PAREN);
			setState(560);
			parameter();
			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(561);
				match(COMMA);
				setState(562);
				parameter();
				}
				}
				setState(567);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(568);
			match(CLOSE_PAREN);
			setState(569);
			match(COLON);
			setState(570);
			value();
			setState(571);
			match(OPEN_CURLY);
			setState(575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << IF) | (1L << THIS) | (1L << RETURN) | (1L << OPEN_PAREN))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (STRING - 66)) | (1L << (NUMBER - 66)) | (1L << (INTEGER - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
				{
				{
				setState(572);
				statement();
				}
				}
				setState(577);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(578);
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
			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PUBLIC) | (1L << PROTECTED))) != 0)) {
				{
				setState(580);
				modifiers();
				}
			}

			setState(583);
			match(IDENTIFIER);
			setState(584);
			match(COLON);
			setState(585);
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
			setState(587);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public PropertyDeclarationContext propertyDeclaration() {
			return getRuleContext(PropertyDeclarationContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public PropertyAccessContext propertyAccess() {
			return getRuleContext(PropertyAccessContext.class,0);
		}
		public PropertystatmentContext propertystatment() {
			return getRuleContext(PropertystatmentContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_statement);
		try {
			setState(608);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(589);
				expression(0);
				setState(590);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(592);
				ifStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(593);
				loopStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(594);
				switchStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(595);
				methodDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(596);
				propertyDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(597);
				functionCall();
				setState(598);
				match(SEMICOLON);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(600);
				match(IDENTIFIER);
				setState(601);
				match(EQUALS);
				setState(602);
				expression(0);
				setState(603);
				match(SEMICOLON);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(605);
				returnStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(606);
				propertyAccess();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(607);
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
			setState(621);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				_localctx = new FUNCTIONCALLLABELContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(611);
				functionCall();
				}
				break;
			case 2:
				{
				_localctx = new EXPPROContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(612);
				propertyAccess();
				}
				break;
			case 3:
				{
				_localctx = new EXPPARENContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(613);
				match(OPEN_PAREN);
				setState(614);
				expression(0);
				setState(615);
				match(CLOSE_PAREN);
				}
				break;
			case 4:
				{
				_localctx = new EXPIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(617);
				match(IDENTIFIER);
				}
				break;
			case 5:
				{
				_localctx = new EXPSTRINGContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(618);
				match(STRING);
				}
				break;
			case 6:
				{
				_localctx = new EXPNUMBERContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(619);
				match(NUMBER);
				}
				break;
			case 7:
				{
				_localctx = new EXPINTEGERContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(620);
				match(INTEGER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(653);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(651);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						_localctx = new EXPPLUSContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(623);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(624);
						match(PLUS);
						setState(625);
						expression(18);
						}
						break;
					case 2:
						{
						_localctx = new EXPMINUSContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(626);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(627);
						match(MINUS);
						setState(628);
						expression(17);
						}
						break;
					case 3:
						{
						_localctx = new EXPEQUALSContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(629);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(630);
						match(EQUALS);
						setState(631);
						expression(16);
						}
						break;
					case 4:
						{
						_localctx = new EXPLESSContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(632);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(633);
						match(LESS_THAN);
						setState(634);
						expression(15);
						}
						break;
					case 5:
						{
						_localctx = new EXPGREATERContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(635);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(636);
						match(GREATER_THAN);
						setState(637);
						expression(14);
						}
						break;
					case 6:
						{
						_localctx = new EXPSTARContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(638);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(639);
						match(STAR);
						setState(640);
						expression(13);
						}
						break;
					case 7:
						{
						_localctx = new EXPDIVIDEContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(641);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(642);
						match(DIVIDE);
						setState(643);
						expression(12);
						}
						break;
					case 8:
						{
						_localctx = new EXPMODContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(644);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(645);
						match(MOD);
						setState(646);
						expression(11);
						}
						break;
					case 9:
						{
						_localctx = new EXPPLUSPLUSContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(647);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(648);
						match(PLUS_PLUS);
						}
						break;
					case 10:
						{
						_localctx = new EXPMINMINContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(649);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(650);
						match(MINUS_MINUS);
						}
						break;
					}
					} 
				}
				setState(655);
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
			setState(659);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				_localctx = new CALFUNLABELContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(656);
				calfun();
				}
				break;
			case 2:
				_localctx = new IDDOTLABELContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(657);
				iddot();
				}
				break;
			case 3:
				_localctx = new FUNCTHISLABELContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(658);
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
			setState(661);
			match(THIS);
			setState(662);
			match(DOT);
			setState(663);
			match(IDENTIFIER);
			setState(668);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(664);
					match(DOT);
					setState(665);
					match(IDENTIFIER);
					}
					} 
				}
				setState(670);
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
			setState(671);
			match(IDENTIFIER);
			setState(674); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(672);
					match(DOT);
					setState(673);
					match(IDENTIFIER);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(676); 
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
			setState(678);
			match(THIS);
			setState(679);
			match(DOT);
			setState(680);
			match(IDENTIFIER);
			setState(681);
			match(DOT);
			setState(682);
			match(GET_PRODUCTS);
			setState(683);
			match(OPEN_PAREN);
			setState(684);
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
			setState(725);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(686);
				propertyAccess();
				setState(687);
				match(OPEN_PAREN);
				setState(696);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (THIS - 30)) | (1L << (OPEN_PAREN - 30)) | (1L << (STRING - 30)) | (1L << (NUMBER - 30)) | (1L << (INTEGER - 30)) | (1L << (IDENTIFIER - 30)))) != 0)) {
					{
					setState(688);
					expression(0);
					setState(693);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(689);
						match(COMMA);
						setState(690);
						expression(0);
						}
						}
						setState(695);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(698);
				match(CLOSE_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(700);
				match(IDENTIFIER);
				setState(701);
				match(OPEN_PAREN);
				setState(710);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (THIS - 30)) | (1L << (OPEN_PAREN - 30)) | (1L << (STRING - 30)) | (1L << (NUMBER - 30)) | (1L << (INTEGER - 30)) | (1L << (IDENTIFIER - 30)))) != 0)) {
					{
					setState(702);
					expression(0);
					setState(707);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(703);
						match(COMMA);
						setState(704);
						expression(0);
						}
						}
						setState(709);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(712);
				match(CLOSE_PAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(713);
				propertyAccess();
				setState(714);
				match(OPEN_PAREN);
				setState(716);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (THIS - 30)) | (1L << (OPEN_PAREN - 30)) | (1L << (STRING - 30)) | (1L << (NUMBER - 30)) | (1L << (INTEGER - 30)) | (1L << (IDENTIFIER - 30)))) != 0)) {
					{
					setState(715);
					argumentList();
					}
				}

				setState(718);
				match(CLOSE_PAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(720);
				propertyAccess();
				setState(721);
				match(OPEN_PAREN);
				setState(722);
				match(CLOSE_PAREN);
				setState(723);
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
			setState(727);
			match(SELECTPRODUCT);
			setState(728);
			match(OPEN_PAREN);
			setState(729);
			parameter();
			setState(734);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(730);
				match(COMMA);
				setState(731);
				parameter();
				}
				}
				setState(736);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(737);
			match(CLOSE_PAREN);
			setState(740);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(738);
				match(COLON);
				setState(739);
				match(VOID);
				}
			}

			setState(742);
			match(OPEN_CURLY);
			setState(746);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << IF) | (1L << THIS) | (1L << RETURN) | (1L << OPEN_PAREN))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (STRING - 66)) | (1L << (NUMBER - 66)) | (1L << (INTEGER - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
				{
				{
				setState(743);
				statement();
				}
				}
				setState(748);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(749);
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
			setState(751);
			expression(0);
			setState(756);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(752);
				match(COMMA);
				setState(753);
				expression(0);
				}
				}
				setState(758);
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
			setState(759);
			match(OPEN_SQUARE);
			setState(768);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (THIS - 30)) | (1L << (OPEN_PAREN - 30)) | (1L << (STRING - 30)) | (1L << (NUMBER - 30)) | (1L << (INTEGER - 30)) | (1L << (IDENTIFIER - 30)))) != 0)) {
				{
				setState(760);
				expression(0);
				setState(765);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(761);
					match(COMMA);
					setState(762);
					expression(0);
					}
					}
					setState(767);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(770);
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
			setState(773);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(772);
				match(EXPORT);
				}
			}

			setState(775);
			match(INTERFACE);
			setState(776);
			match(IDENTIFIER);
			setState(777);
			match(OPEN_CURLY);
			setState(778);
			interfaceBody();
			setState(779);
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
			setState(784);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(781);
				interfaceMember();
				}
				}
				setState(786);
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
			setState(789);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(787);
				propertySignature();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(788);
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
			setState(791);
			match(IDENTIFIER);
			setState(792);
			match(COLON);
			setState(793);
			value();
			setState(794);
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
			setState(796);
			match(IDENTIFIER);
			setState(797);
			match(OPEN_PAREN);
			setState(799);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(798);
				parameterList();
				}
			}

			setState(801);
			match(CLOSE_PAREN);
			setState(802);
			match(COLON);
			setState(803);
			value();
			setState(804);
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
			setState(806);
			parameter2();
			setState(811);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(807);
				match(COMMA);
				setState(808);
				parameter2();
				}
				}
				setState(813);
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
			setState(814);
			match(IDENTIFIER);
			setState(815);
			match(COLON);
			setState(816);
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
			setState(818);
			match(ONBUTTONCLICK);
			setState(819);
			match(OPEN_PAREN);
			setState(820);
			match(CLOSE_PAREN);
			setState(821);
			match(OPEN_CURLY);
			setState(822);
			basevalue();
			setState(823);
			match(OPEN_PAREN);
			setState(824);
			expression(0);
			setState(825);
			match(CLOSE_PAREN);
			setState(826);
			match(SEMICOLON);
			setState(827);
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
			setState(838);
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
				setState(829);
				basevalue();
				setState(830);
				match(OPEN_SQUARE);
				setState(831);
				match(CLOSE_SQUARE);
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 2);
				{
				setState(833);
				match(ARRAY);
				setState(834);
				match(LESS_THAN);
				setState(835);
				basevalue();
				setState(836);
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
			setState(840);
			match(OUTPUT);
			setState(841);
			match(OPEN_PAREN);
			setState(842);
			match(CLOSE_PAREN);
			setState(843);
			propertyAssignment();
			setState(844);
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
			setState(846);
			match(IDENTIFIER);
			setState(847);
			match(EQUALS);
			setState(848);
			match(NEW);
			setState(849);
			match(IDENTIFIER);
			setState(854);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(850);
				match(LESS_THAN);
				setState(851);
				value();
				setState(852);
				match(GREATER_THAN);
				}
			}

			setState(856);
			match(OPEN_PAREN);
			setState(857);
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
			setState(859);
			expression(0);
			setState(864);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(860);
				match(COMMA);
				setState(861);
				expression(0);
				}
				}
				setState(866);
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
			setState(867);
			match(NGONINIT);
			setState(868);
			match(OPEN_PAREN);
			setState(869);
			match(CLOSE_PAREN);
			setState(870);
			match(COLON);
			setState(871);
			match(VOID);
			setState(872);
			match(OPEN_CURLY);
			{
			setState(873);
			expression(0);
			}
			setState(874);
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
			setState(890);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(876);
				match(IDENTIFIER);
				setState(877);
				match(EQUALS);
				setState(878);
				match(OPEN_PAREN);
				setState(879);
				match(IDENTIFIER);
				setState(880);
				match(CLOSE_PAREN);
				setState(881);
				match(ARROW);
				setState(882);
				functionBody();
				}
				break;
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(883);
				match(OPEN_PAREN);
				setState(885);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(884);
					parameterList();
					}
				}

				setState(887);
				match(CLOSE_PAREN);
				setState(888);
				match(ARROW);
				setState(889);
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
			setState(901);
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
				setState(892);
				expression(0);
				}
				break;
			case OPEN_CURLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(893);
				match(OPEN_CURLY);
				setState(897);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << CONSOLE) | (1L << SWITCH) | (1L << LET) | (1L << IF) | (1L << THIS) | (1L << RETURN) | (1L << OPEN_PAREN))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (STRING - 66)) | (1L << (NUMBER - 66)) | (1L << (INTEGER - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
					{
					{
					setState(894);
					statement();
					}
					}
					setState(899);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(900);
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
			setState(903);
			match(RETURN);
			setState(906);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(904);
				expressionList();
				}
				break;
			case 2:
				{
				setState(905);
				expression(0);
				}
				break;
			}
			setState(908);
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
		public TerminalNode HHH() { return getToken(AngularParser.HHH, 0); }
		public TerminalNode CLASS() { return getToken(AngularParser.CLASS, 0); }
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public TextNodeContext textNode() {
			return getRuleContext(TextNodeContext.class,0);
		}
		public AngularButtonContext angularButton() {
			return getRuleContext(AngularButtonContext.class,0);
		}
		public SelfClosingElementContext selfClosingElement() {
			return getRuleContext(SelfClosingElementContext.class,0);
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
		int _la;
		try {
			setState(950);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(910);
				opentag();
				setState(914);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (OPEN_SQUARE - 52)) | (1L << (OPEN_PAREN - 52)) | (1L << (IDENTIFIER - 52)) | (1L << (LESS_THAN - 52)) | (1L << (NG - 52)) | (1L << (NI - 52)))) != 0)) {
					{
					{
					setState(911);
					htmlAttribute();
					}
					}
					setState(916);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(917);
				match(GREATER_THAN);
				setState(921);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & ((1L << (OPEN_DOUBLE_CURLY - 50)) | (1L << (COLON - 50)) | (1L << (STRING - 50)) | (1L << (WS - 50)) | (1L << (LESS_THAN - 50)) | (1L << (LS - 50)) | (1L << (ARABIC_TEXT - 50)))) != 0)) {
					{
					{
					setState(918);
					htmlContent();
					}
					}
					setState(923);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(924);
				closetag();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(926);
				opentag();
				setState(930);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (OPEN_SQUARE - 52)) | (1L << (OPEN_PAREN - 52)) | (1L << (IDENTIFIER - 52)) | (1L << (LESS_THAN - 52)) | (1L << (NG - 52)) | (1L << (NI - 52)))) != 0)) {
					{
					{
					setState(927);
					htmlAttribute();
					}
					}
					setState(932);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(933);
				match(HHH);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(935);
				opentag();
				setState(936);
				match(CLASS);
				setState(937);
				match(EQUALS);
				setState(938);
				textNode();
				setState(939);
				match(GREATER_THAN);
				setState(943);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & ((1L << (OPEN_DOUBLE_CURLY - 50)) | (1L << (COLON - 50)) | (1L << (STRING - 50)) | (1L << (WS - 50)) | (1L << (LESS_THAN - 50)) | (1L << (LS - 50)) | (1L << (ARABIC_TEXT - 50)))) != 0)) {
					{
					{
					setState(940);
					htmlContent();
					}
					}
					setState(945);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(946);
				closetag();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(948);
				angularButton();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(949);
				selfClosingElement();
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

	public static class AngularButtonContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(AngularParser.LESS_THAN, 0); }
		public List<TerminalNode> BUTTON() { return getTokens(AngularParser.BUTTON); }
		public TerminalNode BUTTON(int i) {
			return getToken(AngularParser.BUTTON, i);
		}
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> GREATER_THAN() { return getTokens(AngularParser.GREATER_THAN); }
		public TerminalNode GREATER_THAN(int i) {
			return getToken(AngularParser.GREATER_THAN, i);
		}
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TerminalNode GG() { return getToken(AngularParser.GG, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 134, RULE_angularButton);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(952);
			match(LESS_THAN);
			setState(953);
			match(BUTTON);
			{
			setState(954);
			match(IDENTIFIER);
			}
			setState(955);
			match(EQUALS);
			setState(956);
			expression(0);
			setState(957);
			match(GREATER_THAN);
			setState(958);
			match(STRING);
			setState(959);
			match(GG);
			setState(960);
			match(BUTTON);
			setState(961);
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

	public static class SelfClosingElementContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(AngularParser.LESS_THAN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode DIVIDE() { return getToken(AngularParser.DIVIDE, 0); }
		public TerminalNode GREATER_THAN() { return getToken(AngularParser.GREATER_THAN, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public SelfClosingElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfClosingElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSelfClosingElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSelfClosingElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSelfClosingElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfClosingElementContext selfClosingElement() throws RecognitionException {
		SelfClosingElementContext _localctx = new SelfClosingElementContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_selfClosingElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(963);
			match(LESS_THAN);
			setState(964);
			match(IDENTIFIER);
			setState(968);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (OPEN_SQUARE - 52)) | (1L << (OPEN_PAREN - 52)) | (1L << (IDENTIFIER - 52)) | (1L << (LESS_THAN - 52)) | (1L << (NG - 52)) | (1L << (NI - 52)))) != 0)) {
				{
				{
				setState(965);
				htmlAttribute();
				}
				}
				setState(970);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(971);
			match(DIVIDE);
			setState(972);
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
		enterRule(_localctx, 138, RULE_opentag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(974);
			match(LESS_THAN);
			setState(975);
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

	public static class HtmlAttributeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public NgforContext ngfor() {
			return getRuleContext(NgforContext.class,0);
		}
		public NgIfContext ngIf() {
			return getRuleContext(NgIfContext.class,0);
		}
		public EventBindingContext eventBinding() {
			return getRuleContext(EventBindingContext.class,0);
		}
		public AngularButtonContext angularButton() {
			return getRuleContext(AngularButtonContext.class,0);
		}
		public TerminalNode OPEN_SQUARE() { return getToken(AngularParser.OPEN_SQUARE, 0); }
		public TerminalNode CLOSE_SQUARE() { return getToken(AngularParser.CLOSE_SQUARE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(AngularParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngularParser.CLOSE_PAREN, 0); }
		public HtmlAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeContext htmlAttribute() throws RecognitionException {
		HtmlAttributeContext _localctx = new HtmlAttributeContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_htmlAttribute);
		try {
			setState(998);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(977);
				match(IDENTIFIER);
				setState(978);
				match(EQUALS);
				setState(979);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(980);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(981);
				ngfor();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(982);
				ngIf();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(983);
				eventBinding();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(984);
				angularButton();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(985);
				match(OPEN_SQUARE);
				setState(986);
				match(IDENTIFIER);
				setState(987);
				match(CLOSE_SQUARE);
				setState(988);
				match(EQUALS);
				setState(989);
				expression(0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(990);
				match(OPEN_PAREN);
				setState(991);
				match(IDENTIFIER);
				setState(992);
				match(CLOSE_PAREN);
				setState(993);
				match(EQUALS);
				setState(994);
				expression(0);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(995);
				match(OPEN_SQUARE);
				setState(996);
				match(IDENTIFIER);
				setState(997);
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
		enterRule(_localctx, 142, RULE_closetag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1000);
			match(GG);
			setState(1001);
			match(IDENTIFIER);
			setState(1002);
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
		enterRule(_localctx, 144, RULE_ngIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1004);
			match(NI);
			setState(1005);
			match(EQUALS);
			setState(1006);
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
		enterRule(_localctx, 146, RULE_ngfor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1008);
			match(NG);
			setState(1009);
			match(EQUALS);
			setState(1010);
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
		enterRule(_localctx, 148, RULE_htmlContent);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1015); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(1015);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LESS_THAN:
						{
						setState(1012);
						htmlElement();
						}
						break;
					case COLON:
					case STRING:
					case WS:
					case LS:
					case ARABIC_TEXT:
						{
						setState(1013);
						textNode();
						}
						break;
					case OPEN_DOUBLE_CURLY:
						{
						setState(1014);
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
				setState(1017); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
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
		enterRule(_localctx, 150, RULE_interp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1019);
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
		enterRule(_localctx, 152, RULE_identifierChain);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1021);
			match(OPEN_DOUBLE_CURLY);
			setState(1022);
			match(IDENTIFIER);
			setState(1027);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(1023);
				match(DOT);
				setState(1024);
				match(IDENTIFIER);
				}
				}
				setState(1029);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1030);
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
		enterRule(_localctx, 154, RULE_eventBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1032);
			match(OPEN_PAREN);
			setState(1033);
			match(IDENTIFIER);
			setState(1034);
			match(CLOSE_PAREN);
			setState(1035);
			match(EQUALS);
			setState(1036);
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
		enterRule(_localctx, 156, RULE_textNode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1038);
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
		"\u0004\u0001_\u0411\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0001\u0000\u0005\u0000"+
		"\u00a0\b\u0000\n\u0000\f\u0000\u00a3\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u00ab\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u00b2"+
		"\b\u0002\n\u0002\f\u0002\u00b5\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0003\u0006\u00cd\b\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"\u00d1\b\u0006\n\u0006\f\u0006\u00d4\t\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00db\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0005\f\u00f1\b\f\n\f\f\f\u00f4\t\f\u0001\f\u0001\f"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00fc\b\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0005\u000e\u0108\b\u000e\n\u000e\f\u000e\u010b\t\u000e\u0003"+
		"\u000e\u010d\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0124"+
		"\b\u0011\n\u0011\f\u0011\u0127\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0005\u0012\u012d\b\u0012\n\u0012\f\u0012\u0130\t\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u013a\b\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0143"+
		"\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0005\u0016\u0152\b\u0016\n\u0016\f\u0016\u0155\t\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u015a\b\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0161\b\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0005\u001b\u017c\b\u001b\n\u001b\f\u001b\u017f\t\u001b\u0003"+
		"\u001b\u0181\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u0186"+
		"\b\u001b\n\u001b\f\u001b\u0189\t\u001b\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0005\u001c\u019b\b\u001c\n\u001c\f\u001c\u019e\t\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u01aa\b\u001c\n"+
		"\u001c\f\u001c\u01ad\t\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005"+
		"\u001c\u01b2\b\u001c\n\u001c\f\u001c\u01b5\t\u001c\u0001\u001c\u0003\u001c"+
		"\u01b8\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0005\u001d\u01c0\b\u001d\n\u001d\f\u001d\u01c3\t\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0005\u001e\u01cd\b\u001e\n\u001e\f\u001e\u01d0\t\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0005\u001f\u01da\b\u001f\n\u001f\f\u001f\u01dd"+
		"\t\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u01e3"+
		"\b\u001f\n\u001f\f\u001f\u01e6\t\u001f\u0001\u001f\u0003\u001f\u01e9\b"+
		"\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 "+
		"\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0003 \u01fe\b \u0001!\u0001!\u0001!\u0001!\u0005!\u0204\b!\n!\f!\u0207"+
		"\t!\u0001!\u0001!\u0001!\u0005!\u020c\b!\n!\f!\u020f\t!\u0003!\u0211\b"+
		"!\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u0217\b\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001#\u0001#\u0005#\u0220\b#\n#\f#\u0223\t#\u0001"+
		"#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0005%\u0234\b%\n%\f%\u0237\t%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0005%\u023e\b%\n%\f%\u0241\t%\u0001%\u0001%\u0001"+
		"&\u0003&\u0246\b&\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u0261\b(\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0003)\u026e\b)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0005)\u028c\b)\n)\f)\u028f\t)\u0001*\u0001*\u0001*\u0003*\u0294\b*"+
		"\u0001+\u0001+\u0001+\u0001+\u0001+\u0005+\u029b\b+\n+\f+\u029e\t+\u0001"+
		",\u0001,\u0001,\u0004,\u02a3\b,\u000b,\f,\u02a4\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001.\u0001.\u0005"+
		".\u02b4\b.\n.\f.\u02b7\t.\u0003.\u02b9\b.\u0001.\u0001.\u0001.\u0001."+
		"\u0001.\u0001.\u0001.\u0005.\u02c2\b.\n.\f.\u02c5\t.\u0003.\u02c7\b.\u0001"+
		".\u0001.\u0001.\u0001.\u0003.\u02cd\b.\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0003.\u02d6\b.\u0001/\u0001/\u0001/\u0001/\u0001/\u0005"+
		"/\u02dd\b/\n/\f/\u02e0\t/\u0001/\u0001/\u0001/\u0003/\u02e5\b/\u0001/"+
		"\u0001/\u0005/\u02e9\b/\n/\f/\u02ec\t/\u0001/\u0001/\u00010\u00010\u0001"+
		"0\u00050\u02f3\b0\n0\f0\u02f6\t0\u00011\u00011\u00011\u00011\u00051\u02fc"+
		"\b1\n1\f1\u02ff\t1\u00031\u0301\b1\u00011\u00011\u00012\u00032\u0306\b"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00013\u00053\u030f\b3\n3"+
		"\f3\u0312\t3\u00014\u00014\u00034\u0316\b4\u00015\u00015\u00015\u0001"+
		"5\u00015\u00016\u00016\u00016\u00036\u0320\b6\u00016\u00016\u00016\u0001"+
		"6\u00016\u00017\u00017\u00017\u00057\u032a\b7\n7\f7\u032d\t7\u00018\u0001"+
		"8\u00018\u00018\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u0001"+
		"9\u00019\u00019\u00019\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001"+
		":\u0001:\u0001:\u0003:\u0347\b:\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0003<\u0357"+
		"\b<\u0001<\u0001<\u0001<\u0001=\u0001=\u0001=\u0005=\u035f\b=\n=\f=\u0362"+
		"\t=\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001"+
		"?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0003?\u0376"+
		"\b?\u0001?\u0001?\u0001?\u0003?\u037b\b?\u0001@\u0001@\u0001@\u0005@\u0380"+
		"\b@\n@\f@\u0383\t@\u0001@\u0003@\u0386\b@\u0001A\u0001A\u0001A\u0003A"+
		"\u038b\bA\u0001A\u0001A\u0001B\u0001B\u0005B\u0391\bB\nB\fB\u0394\tB\u0001"+
		"B\u0001B\u0005B\u0398\bB\nB\fB\u039b\tB\u0001B\u0001B\u0001B\u0001B\u0005"+
		"B\u03a1\bB\nB\fB\u03a4\tB\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001"+
		"B\u0001B\u0005B\u03ae\bB\nB\fB\u03b1\tB\u0001B\u0001B\u0001B\u0001B\u0003"+
		"B\u03b7\bB\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001"+
		"C\u0001C\u0001C\u0001D\u0001D\u0001D\u0005D\u03c7\bD\nD\fD\u03ca\tD\u0001"+
		"D\u0001D\u0001D\u0001E\u0001E\u0001E\u0001F\u0001F\u0001F\u0001F\u0001"+
		"F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001"+
		"F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0003F\u03e7\bF\u0001G\u0001"+
		"G\u0001G\u0001G\u0001H\u0001H\u0001H\u0001H\u0001I\u0001I\u0001I\u0001"+
		"I\u0001J\u0001J\u0001J\u0004J\u03f8\bJ\u000bJ\fJ\u03f9\u0001K\u0001K\u0001"+
		"L\u0001L\u0001L\u0001L\u0005L\u0402\bL\nL\fL\u0405\tL\u0001L\u0001L\u0001"+
		"M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001N\u0001N\u0001N\u0000\u0001"+
		"RO\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u0000\u0004\u0003\u0000//BBHH\u0001\u0000CD\u0001\u0000 \"\u0005"+
		"\u000088BBKKTT__\u044e\u0000\u00a1\u0001\u0000\u0000\u0000\u0002\u00aa"+
		"\u0001\u0000\u0000\u0000\u0004\u00ac\u0001\u0000\u0000\u0000\u0006\u00bb"+
		"\u0001\u0000\u0000\u0000\b\u00bd\u0001\u0000\u0000\u0000\n\u00c4\u0001"+
		"\u0000\u0000\u0000\f\u00cc\u0001\u0000\u0000\u0000\u000e\u00da\u0001\u0000"+
		"\u0000\u0000\u0010\u00dc\u0001\u0000\u0000\u0000\u0012\u00e0\u0001\u0000"+
		"\u0000\u0000\u0014\u00e4\u0001\u0000\u0000\u0000\u0016\u00e8\u0001\u0000"+
		"\u0000\u0000\u0018\u00ec\u0001\u0000\u0000\u0000\u001a\u00f7\u0001\u0000"+
		"\u0000\u0000\u001c\u010c\u0001\u0000\u0000\u0000\u001e\u010e\u0001\u0000"+
		"\u0000\u0000 \u0119\u0001\u0000\u0000\u0000\"\u0120\u0001\u0000\u0000"+
		"\u0000$\u0128\u0001\u0000\u0000\u0000&\u0133\u0001\u0000\u0000\u0000("+
		"\u0139\u0001\u0000\u0000\u0000*\u0142\u0001\u0000\u0000\u0000,\u0153\u0001"+
		"\u0000\u0000\u0000.\u0159\u0001\u0000\u0000\u00000\u015b\u0001\u0000\u0000"+
		"\u00002\u0164\u0001\u0000\u0000\u00004\u016c\u0001\u0000\u0000\u00006"+
		"\u0176\u0001\u0000\u0000\u00008\u01b7\u0001\u0000\u0000\u0000:\u01b9\u0001"+
		"\u0000\u0000\u0000<\u01c6\u0001\u0000\u0000\u0000>\u01d3\u0001\u0000\u0000"+
		"\u0000@\u01fd\u0001\u0000\u0000\u0000B\u0210\u0001\u0000\u0000\u0000D"+
		"\u0212\u0001\u0000\u0000\u0000F\u021d\u0001\u0000\u0000\u0000H\u0226\u0001"+
		"\u0000\u0000\u0000J\u022e\u0001\u0000\u0000\u0000L\u0245\u0001\u0000\u0000"+
		"\u0000N\u024b\u0001\u0000\u0000\u0000P\u0260\u0001\u0000\u0000\u0000R"+
		"\u026d\u0001\u0000\u0000\u0000T\u0293\u0001\u0000\u0000\u0000V\u0295\u0001"+
		"\u0000\u0000\u0000X\u029f\u0001\u0000\u0000\u0000Z\u02a6\u0001\u0000\u0000"+
		"\u0000\\\u02d5\u0001\u0000\u0000\u0000^\u02d7\u0001\u0000\u0000\u0000"+
		"`\u02ef\u0001\u0000\u0000\u0000b\u02f7\u0001\u0000\u0000\u0000d\u0305"+
		"\u0001\u0000\u0000\u0000f\u0310\u0001\u0000\u0000\u0000h\u0315\u0001\u0000"+
		"\u0000\u0000j\u0317\u0001\u0000\u0000\u0000l\u031c\u0001\u0000\u0000\u0000"+
		"n\u0326\u0001\u0000\u0000\u0000p\u032e\u0001\u0000\u0000\u0000r\u0332"+
		"\u0001\u0000\u0000\u0000t\u0346\u0001\u0000\u0000\u0000v\u0348\u0001\u0000"+
		"\u0000\u0000x\u034e\u0001\u0000\u0000\u0000z\u035b\u0001\u0000\u0000\u0000"+
		"|\u0363\u0001\u0000\u0000\u0000~\u037a\u0001\u0000\u0000\u0000\u0080\u0385"+
		"\u0001\u0000\u0000\u0000\u0082\u0387\u0001\u0000\u0000\u0000\u0084\u03b6"+
		"\u0001\u0000\u0000\u0000\u0086\u03b8\u0001\u0000\u0000\u0000\u0088\u03c3"+
		"\u0001\u0000\u0000\u0000\u008a\u03ce\u0001\u0000\u0000\u0000\u008c\u03e6"+
		"\u0001\u0000\u0000\u0000\u008e\u03e8\u0001\u0000\u0000\u0000\u0090\u03ec"+
		"\u0001\u0000\u0000\u0000\u0092\u03f0\u0001\u0000\u0000\u0000\u0094\u03f7"+
		"\u0001\u0000\u0000\u0000\u0096\u03fb\u0001\u0000\u0000\u0000\u0098\u03fd"+
		"\u0001\u0000\u0000\u0000\u009a\u0408\u0001\u0000\u0000\u0000\u009c\u040e"+
		"\u0001\u0000\u0000\u0000\u009e\u00a0\u0003\u0002\u0001\u0000\u009f\u009e"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a3\u0001\u0000\u0000\u0000\u00a1\u009f"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a4\u00a5"+
		"\u0005\u0000\u0000\u0001\u00a5\u0001\u0001\u0000\u0000\u0000\u00a6\u00ab"+
		"\u0003\u0004\u0002\u0000\u00a7\u00ab\u0003\b\u0004\u0000\u00a8\u00ab\u0003"+
		"\u001a\r\u0000\u00a9\u00ab\u0003\n\u0005\u0000\u00aa\u00a6\u0001\u0000"+
		"\u0000\u0000\u00aa\u00a7\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000"+
		"\u0000\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00ab\u0003\u0001\u0000"+
		"\u0000\u0000\u00ac\u00ad\u0005\u0001\u0000\u0000\u00ad\u00ae\u00050\u0000"+
		"\u0000\u00ae\u00b3\u0003\u0006\u0003\u0000\u00af\u00b0\u00059\u0000\u0000"+
		"\u00b0\u00b2\u0003\u0006\u0003\u0000\u00b1\u00af\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b5\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6\u00b7\u00051\u0000\u0000\u00b7"+
		"\u00b8\u0005\u0003\u0000\u0000\u00b8\u00b9\u0005B\u0000\u0000\u00b9\u00ba"+
		"\u0005:\u0000\u0000\u00ba\u0005\u0001\u0000\u0000\u0000\u00bb\u00bc\u0007"+
		"\u0000\u0000\u0000\u00bc\u0007\u0001\u0000\u0000\u0000\u00bd\u00be\u0005"+
		"\u0002\u0000\u0000\u00be\u00bf\u00056\u0000\u0000\u00bf\u00c0\u00050\u0000"+
		"\u0000\u00c0\u00c1\u0003\f\u0006\u0000\u00c1\u00c2\u00051\u0000\u0000"+
		"\u00c2\u00c3\u00057\u0000\u0000\u00c3\t\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c5\u0005$\u0000\u0000\u00c5\u00c6\u00056\u0000\u0000\u00c6\u00c7\u0005"+
		"0\u0000\u0000\u00c7\u00c8\u0003\f\u0006\u0000\u00c8\u00c9\u00051\u0000"+
		"\u0000\u00c9\u00ca\u00057\u0000\u0000\u00ca\u000b\u0001\u0000\u0000\u0000"+
		"\u00cb\u00cd\u0003\u000e\u0007\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000"+
		"\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00d2\u0001\u0000\u0000\u0000"+
		"\u00ce\u00cf\u00059\u0000\u0000\u00cf\u00d1\u0003\u000e\u0007\u0000\u00d0"+
		"\u00ce\u0001\u0000\u0000\u0000\u00d1\u00d4\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3"+
		"\r\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d5\u00db"+
		"\u0003\u0016\u000b\u0000\u00d6\u00db\u0003\u0018\f\u0000\u00d7\u00db\u0003"+
		"\u0014\n\u0000\u00d8\u00db\u0003\u0012\t\u0000\u00d9\u00db\u0003\u0010"+
		"\b\u0000\u00da\u00d5\u0001\u0000\u0000\u0000\u00da\u00d6\u0001\u0000\u0000"+
		"\u0000\u00da\u00d7\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000"+
		"\u0000\u00da\u00d9\u0001\u0000\u0000\u0000\u00db\u000f\u0001\u0000\u0000"+
		"\u0000\u00dc\u00dd\u0005\u0015\u0000\u0000\u00dd\u00de\u00058\u0000\u0000"+
		"\u00de\u00df\u0005B\u0000\u0000\u00df\u0011\u0001\u0000\u0000\u0000\u00e0"+
		"\u00e1\u0005\u0018\u0000\u0000\u00e1\u00e2\u00058\u0000\u0000\u00e2\u00e3"+
		"\u0005B\u0000\u0000\u00e3\u0013\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005"+
		"\u0016\u0000\u0000\u00e5\u00e6\u00058\u0000\u0000\u00e6\u00e7\u0005B\u0000"+
		"\u0000\u00e7\u0015\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005\u0017\u0000"+
		"\u0000\u00e9\u00ea\u00058\u0000\u0000\u00ea\u00eb\u0005B\u0000\u0000\u00eb"+
		"\u0017\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005\u0017\u0000\u0000\u00ed"+
		"\u00ee\u00058\u0000\u0000\u00ee\u00f2\u0005?\u0000\u0000\u00ef\u00f1\u0003"+
		"\u0084B\u0000\u00f0\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f4\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f5\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f6\u0005?\u0000\u0000\u00f6\u0019\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f8\u0005\u0004\u0000\u0000\u00f8\u00f9\u0005\u0005\u0000"+
		"\u0000\u00f9\u00fb\u0005H\u0000\u0000\u00fa\u00fc\u0003\u001c\u000e\u0000"+
		"\u00fb\u00fa\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000"+
		"\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u00fe\u00050\u0000\u0000\u00fe"+
		"\u00ff\u0003,\u0016\u0000\u00ff\u0100\u00051\u0000\u0000\u0100\u001b\u0001"+
		"\u0000\u0000\u0000\u0101\u0102\u0005.\u0000\u0000\u0102\u010d\u0005H\u0000"+
		"\u0000\u0103\u0104\u0005-\u0000\u0000\u0104\u0109\u0003(\u0014\u0000\u0105"+
		"\u0106\u00059\u0000\u0000\u0106\u0108\u0005H\u0000\u0000\u0107\u0105\u0001"+
		"\u0000\u0000\u0000\u0108\u010b\u0001\u0000\u0000\u0000\u0109\u0107\u0001"+
		"\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a\u010d\u0001"+
		"\u0000\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010c\u0101\u0001"+
		"\u0000\u0000\u0000\u010c\u0103\u0001\u0000\u0000\u0000\u010d\u001d\u0001"+
		"\u0000\u0000\u0000\u010e\u010f\u0005%\u0000\u0000\u010f\u0110\u00056\u0000"+
		"\u0000\u0110\u0111\u00057\u0000\u0000\u0111\u0112\u00050\u0000\u0000\u0112"+
		"\u0113\u0005(\u0000\u0000\u0113\u0114\u00054\u0000\u0000\u0114\u0115\u0003"+
		"\"\u0011\u0000\u0115\u0116\u00055\u0000\u0000\u0116\u0117\u0005:\u0000"+
		"\u0000\u0117\u0118\u00051\u0000\u0000\u0118\u001f\u0001\u0000\u0000\u0000"+
		"\u0119\u011a\u0005H\u0000\u0000\u011a\u011b\u0005;\u0000\u0000\u011b\u011c"+
		"\u00054\u0000\u0000\u011c\u011d\u0003\"\u0011\u0000\u011d\u011e\u0005"+
		"5\u0000\u0000\u011e\u011f\u0005:\u0000\u0000\u011f!\u0001\u0000\u0000"+
		"\u0000\u0120\u0125\u0003$\u0012\u0000\u0121\u0122\u00059\u0000\u0000\u0122"+
		"\u0124\u0003$\u0012\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0124\u0127"+
		"\u0001\u0000\u0000\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0125\u0126"+
		"\u0001\u0000\u0000\u0000\u0126#\u0001\u0000\u0000\u0000\u0127\u0125\u0001"+
		"\u0000\u0000\u0000\u0128\u0129\u00050\u0000\u0000\u0129\u012e\u0003&\u0013"+
		"\u0000\u012a\u012b\u00059\u0000\u0000\u012b\u012d\u0003&\u0013\u0000\u012c"+
		"\u012a\u0001\u0000\u0000\u0000\u012d\u0130\u0001\u0000\u0000\u0000\u012e"+
		"\u012c\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f"+
		"\u0131\u0001\u0000\u0000\u0000\u0130\u012e\u0001\u0000\u0000\u0000\u0131"+
		"\u0132\u00051\u0000\u0000\u0132%\u0001\u0000\u0000\u0000\u0133\u0134\u0003"+
		"*\u0015\u0000\u0134\u0135\u00058\u0000\u0000\u0135\u0136\u0003(\u0014"+
		"\u0000\u0136\'\u0001\u0000\u0000\u0000\u0137\u013a\u0003*\u0015\u0000"+
		"\u0138\u013a\u0003t:\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u0139\u0138"+
		"\u0001\u0000\u0000\u0000\u013a)\u0001\u0000\u0000\u0000\u013b\u0143\u0005"+
		"H\u0000\u0000\u013c\u0143\u0005B\u0000\u0000\u013d\u0143\u0005E\u0000"+
		"\u0000\u013e\u0143\u0005\u001a\u0000\u0000\u013f\u0143\u0005\'\u0000\u0000"+
		"\u0140\u0143\u0005/\u0000\u0000\u0141\u0143\u0005X\u0000\u0000\u0142\u013b"+
		"\u0001\u0000\u0000\u0000\u0142\u013c\u0001\u0000\u0000\u0000\u0142\u013d"+
		"\u0001\u0000\u0000\u0000\u0142\u013e\u0001\u0000\u0000\u0000\u0142\u013f"+
		"\u0001\u0000\u0000\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0142\u0141"+
		"\u0001\u0000\u0000\u0000\u0143+\u0001\u0000\u0000\u0000\u0144\u0152\u0003"+
		".\u0017\u0000\u0145\u0152\u0003J%\u0000\u0146\u0152\u00036\u001b\u0000"+
		"\u0147\u0152\u0003P(\u0000\u0148\u0152\u0003v;\u0000\u0149\u0152\u0003"+
		"|>\u0000\u014a\u0152\u0003^/\u0000\u014b\u0152\u0003r9\u0000\u014c\u0152"+
		"\u0003\u001e\u000f\u0000\u014d\u0152\u0003 \u0010\u0000\u014e\u0152\u0003"+
		"~?\u0000\u014f\u0152\u0003T*\u0000\u0150\u0152\u0003D\"\u0000\u0151\u0144"+
		"\u0001\u0000\u0000\u0000\u0151\u0145\u0001\u0000\u0000\u0000\u0151\u0146"+
		"\u0001\u0000\u0000\u0000\u0151\u0147\u0001\u0000\u0000\u0000\u0151\u0148"+
		"\u0001\u0000\u0000\u0000\u0151\u0149\u0001\u0000\u0000\u0000\u0151\u014a"+
		"\u0001\u0000\u0000\u0000\u0151\u014b\u0001\u0000\u0000\u0000\u0151\u014c"+
		"\u0001\u0000\u0000\u0000\u0151\u014d\u0001\u0000\u0000\u0000\u0151\u014e"+
		"\u0001\u0000\u0000\u0000\u0151\u014f\u0001\u0000\u0000\u0000\u0151\u0150"+
		"\u0001\u0000\u0000\u0000\u0152\u0155\u0001\u0000\u0000\u0000\u0153\u0151"+
		"\u0001\u0000\u0000\u0000\u0153\u0154\u0001\u0000\u0000\u0000\u0154-\u0001"+
		"\u0000\u0000\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0156\u015a\u0003"+
		"0\u0018\u0000\u0157\u015a\u00032\u0019\u0000\u0158\u015a\u00034\u001a"+
		"\u0000\u0159\u0156\u0001\u0000\u0000\u0000\u0159\u0157\u0001\u0000\u0000"+
		"\u0000\u0159\u0158\u0001\u0000\u0000\u0000\u015a/\u0001\u0000\u0000\u0000"+
		"\u015b\u015c\u0005H\u0000\u0000\u015c\u015d\u00058\u0000\u0000\u015d\u0160"+
		"\u0003(\u0014\u0000\u015e\u015f\u0005;\u0000\u0000\u015f\u0161\u0003R"+
		")\u0000\u0160\u015e\u0001\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000"+
		"\u0000\u0161\u0162\u0001\u0000\u0000\u0000\u0162\u0163\u0005:\u0000\u0000"+
		"\u01631\u0001\u0000\u0000\u0000\u0164\u0165\u0005\u000f\u0000\u0000\u0165"+
		"\u0166\u0005H\u0000\u0000\u0166\u0167\u00058\u0000\u0000\u0167\u0168\u0003"+
		"(\u0014\u0000\u0168\u0169\u0005;\u0000\u0000\u0169\u016a\u0003(\u0014"+
		"\u0000\u016a\u016b\u0005:\u0000\u0000\u016b3\u0001\u0000\u0000\u0000\u016c"+
		"\u016d\u0005H\u0000\u0000\u016d\u016e\u00058\u0000\u0000\u016e\u016f\u0003"+
		"(\u0014\u0000\u016f\u0170\u00054\u0000\u0000\u0170\u0171\u00055\u0000"+
		"\u0000\u0171\u0172\u0005;\u0000\u0000\u0172\u0173\u00054\u0000\u0000\u0173"+
		"\u0174\u00055\u0000\u0000\u0174\u0175\u0005:\u0000\u0000\u01755\u0001"+
		"\u0000\u0000\u0000\u0176\u0177\u0005\u001b\u0000\u0000\u0177\u0180\u0005"+
		"6\u0000\u0000\u0178\u017d\u0003L&\u0000\u0179\u017a\u00059\u0000\u0000"+
		"\u017a\u017c\u0003L&\u0000\u017b\u0179\u0001\u0000\u0000\u0000\u017c\u017f"+
		"\u0001\u0000\u0000\u0000\u017d\u017b\u0001\u0000\u0000\u0000\u017d\u017e"+
		"\u0001\u0000\u0000\u0000\u017e\u0181\u0001\u0000\u0000\u0000\u017f\u017d"+
		"\u0001\u0000\u0000\u0000\u0180\u0178\u0001\u0000\u0000\u0000\u0180\u0181"+
		"\u0001\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000\u0182\u0183"+
		"\u00057\u0000\u0000\u0183\u0187\u00050\u0000\u0000\u0184\u0186\u0003P"+
		"(\u0000\u0185\u0184\u0001\u0000\u0000\u0000\u0186\u0189\u0001\u0000\u0000"+
		"\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0187\u0188\u0001\u0000\u0000"+
		"\u0000\u0188\u018a\u0001\u0000\u0000\u0000\u0189\u0187\u0001\u0000\u0000"+
		"\u0000\u018a\u018b\u00051\u0000\u0000\u018b7\u0001\u0000\u0000\u0000\u018c"+
		"\u018d\u0005\u0006\u0000\u0000\u018d\u018e\u00056\u0000\u0000\u018e\u018f"+
		"\u0005\u000f\u0000\u0000\u018f\u0190\u0005H\u0000\u0000\u0190\u0191\u0005"+
		";\u0000\u0000\u0191\u0192\u0003R)\u0000\u0192\u0193\u0005:\u0000\u0000"+
		"\u0193\u0194\u0003R)\u0000\u0194\u0195\u0005:\u0000\u0000\u0195\u0196"+
		"\u0005H\u0000\u0000\u0196\u0197\u0007\u0001\u0000\u0000\u0197\u0198\u0005"+
		"7\u0000\u0000\u0198\u019c\u00050\u0000\u0000\u0199\u019b\u0003P(\u0000"+
		"\u019a\u0199\u0001\u0000\u0000\u0000\u019b\u019e\u0001\u0000\u0000\u0000"+
		"\u019c\u019a\u0001\u0000\u0000\u0000\u019c\u019d\u0001\u0000\u0000\u0000"+
		"\u019d\u019f\u0001\u0000\u0000\u0000\u019e\u019c\u0001\u0000\u0000\u0000"+
		"\u019f\u01a0\u00051\u0000\u0000\u01a0\u01b8\u0001\u0000\u0000\u0000\u01a1"+
		"\u01a2\u0005\u0006\u0000\u0000\u01a2\u01a3\u00056\u0000\u0000\u01a3\u01a4"+
		"\u0005\u000f\u0000\u0000\u01a4\u01a5\u0005H\u0000\u0000\u01a5\u01a6\u0005"+
		"\u0011\u0000\u0000\u01a6\u01ab\u0005H\u0000\u0000\u01a7\u01a8\u0005S\u0000"+
		"\u0000\u01a8\u01aa\u0005H\u0000\u0000\u01a9\u01a7\u0001\u0000\u0000\u0000"+
		"\u01aa\u01ad\u0001\u0000\u0000\u0000\u01ab\u01a9\u0001\u0000\u0000\u0000"+
		"\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ac\u01ae\u0001\u0000\u0000\u0000"+
		"\u01ad\u01ab\u0001\u0000\u0000\u0000\u01ae\u01af\u00057\u0000\u0000\u01af"+
		"\u01b3\u00050\u0000\u0000\u01b0\u01b2\u0003P(\u0000\u01b1\u01b0\u0001"+
		"\u0000\u0000\u0000\u01b2\u01b5\u0001\u0000\u0000\u0000\u01b3\u01b1\u0001"+
		"\u0000\u0000\u0000\u01b3\u01b4\u0001\u0000\u0000\u0000\u01b4\u01b6\u0001"+
		"\u0000\u0000\u0000\u01b5\u01b3\u0001\u0000\u0000\u0000\u01b6\u01b8\u0005"+
		"1\u0000\u0000\u01b7\u018c\u0001\u0000\u0000\u0000\u01b7\u01a1\u0001\u0000"+
		"\u0000\u0000\u01b89\u0001\u0000\u0000\u0000\u01b9\u01ba\u0005\n\u0000"+
		"\u0000\u01ba\u01bb\u00056\u0000\u0000\u01bb\u01bc\u0003R)\u0000\u01bc"+
		"\u01bd\u00057\u0000\u0000\u01bd\u01c1\u00050\u0000\u0000\u01be\u01c0\u0003"+
		"P(\u0000\u01bf\u01be\u0001\u0000\u0000\u0000\u01c0\u01c3\u0001\u0000\u0000"+
		"\u0000\u01c1\u01bf\u0001\u0000\u0000\u0000\u01c1\u01c2\u0001\u0000\u0000"+
		"\u0000\u01c2\u01c4\u0001\u0000\u0000\u0000\u01c3\u01c1\u0001\u0000\u0000"+
		"\u0000\u01c4\u01c5\u00051\u0000\u0000\u01c5;\u0001\u0000\u0000\u0000\u01c6"+
		"\u01c7\u0005\u000b\u0000\u0000\u01c7\u01c8\u00056\u0000\u0000\u01c8\u01c9"+
		"\u0003R)\u0000\u01c9\u01ca\u00057\u0000\u0000\u01ca\u01ce\u00050\u0000"+
		"\u0000\u01cb\u01cd\u0003B!\u0000\u01cc\u01cb\u0001\u0000\u0000\u0000\u01cd"+
		"\u01d0\u0001\u0000\u0000\u0000\u01ce\u01cc\u0001\u0000\u0000\u0000\u01ce"+
		"\u01cf\u0001\u0000\u0000\u0000\u01cf\u01d1\u0001\u0000\u0000\u0000\u01d0"+
		"\u01ce\u0001\u0000\u0000\u0000\u01d1\u01d2\u00051\u0000\u0000\u01d2=\u0001"+
		"\u0000\u0000\u0000\u01d3\u01d4\u0005\u0012\u0000\u0000\u01d4\u01d5\u0005"+
		"6\u0000\u0000\u01d5\u01d6\u0003@ \u0000\u01d6\u01d7\u00057\u0000\u0000"+
		"\u01d7\u01db\u00050\u0000\u0000\u01d8\u01da\u0003P(\u0000\u01d9\u01d8"+
		"\u0001\u0000\u0000\u0000\u01da\u01dd\u0001\u0000\u0000\u0000\u01db\u01d9"+
		"\u0001\u0000\u0000\u0000\u01db\u01dc\u0001\u0000\u0000\u0000\u01dc\u01de"+
		"\u0001\u0000\u0000\u0000\u01dd\u01db\u0001\u0000\u0000\u0000\u01de\u01e8"+
		"\u00051\u0000\u0000\u01df\u01e0\u0005\u0013\u0000\u0000\u01e0\u01e4\u0005"+
		"0\u0000\u0000\u01e1\u01e3\u0003P(\u0000\u01e2\u01e1\u0001\u0000\u0000"+
		"\u0000\u01e3\u01e6\u0001\u0000\u0000\u0000\u01e4\u01e2\u0001\u0000\u0000"+
		"\u0000\u01e4\u01e5\u0001\u0000\u0000\u0000\u01e5\u01e7\u0001\u0000\u0000"+
		"\u0000\u01e6\u01e4\u0001\u0000\u0000\u0000\u01e7\u01e9\u00051\u0000\u0000"+
		"\u01e8\u01df\u0001\u0000\u0000\u0000\u01e8\u01e9\u0001\u0000\u0000\u0000"+
		"\u01e9?\u0001\u0000\u0000\u0000\u01ea\u01eb\u0003R)\u0000\u01eb\u01ec"+
		"\u0005;\u0000\u0000\u01ec\u01ed\u0005;\u0000\u0000\u01ed\u01ee\u0005;"+
		"\u0000\u0000\u01ee\u01ef\u0003R)\u0000\u01ef\u01fe\u0001\u0000\u0000\u0000"+
		"\u01f0\u01f1\u0003R)\u0000\u01f1\u01f2\u0005;\u0000\u0000\u01f2\u01f3"+
		"\u0005;\u0000\u0000\u01f3\u01f4\u0003R)\u0000\u01f4\u01fe\u0001\u0000"+
		"\u0000\u0000\u01f5\u01f6\u0003R)\u0000\u01f6\u01f7\u0005=\u0000\u0000"+
		"\u01f7\u01f8\u0003R)\u0000\u01f8\u01fe\u0001\u0000\u0000\u0000\u01f9\u01fa"+
		"\u0003R)\u0000\u01fa\u01fb\u0005>\u0000\u0000\u01fb\u01fc\u0003R)\u0000"+
		"\u01fc\u01fe\u0001\u0000\u0000\u0000\u01fd\u01ea\u0001\u0000\u0000\u0000"+
		"\u01fd\u01f0\u0001\u0000\u0000\u0000\u01fd\u01f5\u0001\u0000\u0000\u0000"+
		"\u01fd\u01f9\u0001\u0000\u0000\u0000\u01feA\u0001\u0000\u0000\u0000\u01ff"+
		"\u0200\u0005\f\u0000\u0000\u0200\u0201\u0003R)\u0000\u0201\u0205\u0005"+
		"8\u0000\u0000\u0202\u0204\u0003P(\u0000\u0203\u0202\u0001\u0000\u0000"+
		"\u0000\u0204\u0207\u0001\u0000\u0000\u0000\u0205\u0203\u0001\u0000\u0000"+
		"\u0000\u0205\u0206\u0001\u0000\u0000\u0000\u0206\u0211\u0001\u0000\u0000"+
		"\u0000\u0207\u0205\u0001\u0000\u0000\u0000\u0208\u0209\u0005\r\u0000\u0000"+
		"\u0209\u020d\u00058\u0000\u0000\u020a\u020c\u0003P(\u0000\u020b\u020a"+
		"\u0001\u0000\u0000\u0000\u020c\u020f\u0001\u0000\u0000\u0000\u020d\u020b"+
		"\u0001\u0000\u0000\u0000\u020d\u020e\u0001\u0000\u0000\u0000\u020e\u0211"+
		"\u0001\u0000\u0000\u0000\u020f\u020d\u0001\u0000\u0000\u0000\u0210\u01ff"+
		"\u0001\u0000\u0000\u0000\u0210\u0208\u0001\u0000\u0000\u0000\u0211C\u0001"+
		"\u0000\u0000\u0000\u0212\u0213\u0005\u0007\u0000\u0000\u0213\u0214\u0005"+
		"H\u0000\u0000\u0214\u0216\u00056\u0000\u0000\u0215\u0217\u0003n7\u0000"+
		"\u0216\u0215\u0001\u0000\u0000\u0000\u0216\u0217\u0001\u0000\u0000\u0000"+
		"\u0217\u0218\u0001\u0000\u0000\u0000\u0218\u0219\u00057\u0000\u0000\u0219"+
		"\u021a\u00058\u0000\u0000\u021a\u021b\u0003(\u0014\u0000\u021b\u021c\u0003"+
		"F#\u0000\u021cE\u0001\u0000\u0000\u0000\u021d\u0221\u00050\u0000\u0000"+
		"\u021e\u0220\u0003P(\u0000\u021f\u021e\u0001\u0000\u0000\u0000\u0220\u0223"+
		"\u0001\u0000\u0000\u0000\u0221\u021f\u0001\u0000\u0000\u0000\u0221\u0222"+
		"\u0001\u0000\u0000\u0000\u0222\u0224\u0001\u0000\u0000\u0000\u0223\u0221"+
		"\u0001\u0000\u0000\u0000\u0224\u0225\u00051\u0000\u0000\u0225G\u0001\u0000"+
		"\u0000\u0000\u0226\u0227\u0005\b\u0000\u0000\u0227\u0228\u0005S\u0000"+
		"\u0000\u0228\u0229\u0005\t\u0000\u0000\u0229\u022a\u00056\u0000\u0000"+
		"\u022a\u022b\u0003R)\u0000\u022b\u022c\u00057\u0000\u0000\u022c\u022d"+
		"\u0005:\u0000\u0000\u022dI\u0001\u0000\u0000\u0000\u022e\u022f\u0005H"+
		"\u0000\u0000\u022f\u0230\u00056\u0000\u0000\u0230\u0235\u0003L&\u0000"+
		"\u0231\u0232\u00059\u0000\u0000\u0232\u0234\u0003L&\u0000\u0233\u0231"+
		"\u0001\u0000\u0000\u0000\u0234\u0237\u0001\u0000\u0000\u0000\u0235\u0233"+
		"\u0001\u0000\u0000\u0000\u0235\u0236\u0001\u0000\u0000\u0000\u0236\u0238"+
		"\u0001\u0000\u0000\u0000\u0237\u0235\u0001\u0000\u0000\u0000\u0238\u0239"+
		"\u00057\u0000\u0000\u0239\u023a\u00058\u0000\u0000\u023a\u023b\u0003("+
		"\u0014\u0000\u023b\u023f\u00050\u0000\u0000\u023c\u023e\u0003P(\u0000"+
		"\u023d\u023c\u0001\u0000\u0000\u0000\u023e\u0241\u0001\u0000\u0000\u0000"+
		"\u023f\u023d\u0001\u0000\u0000\u0000\u023f\u0240\u0001\u0000\u0000\u0000"+
		"\u0240\u0242\u0001\u0000\u0000\u0000\u0241\u023f\u0001\u0000\u0000\u0000"+
		"\u0242\u0243\u00051\u0000\u0000\u0243K\u0001\u0000\u0000\u0000\u0244\u0246"+
		"\u0003N\'\u0000\u0245\u0244\u0001\u0000\u0000\u0000\u0245\u0246\u0001"+
		"\u0000\u0000\u0000\u0246\u0247\u0001\u0000\u0000\u0000\u0247\u0248\u0005"+
		"H\u0000\u0000\u0248\u0249\u00058\u0000\u0000\u0249\u024a\u0003(\u0014"+
		"\u0000\u024aM\u0001\u0000\u0000\u0000\u024b\u024c\u0007\u0002\u0000\u0000"+
		"\u024cO\u0001\u0000\u0000\u0000\u024d\u024e\u0003R)\u0000\u024e\u024f"+
		"\u0005:\u0000\u0000\u024f\u0261\u0001\u0000\u0000\u0000\u0250\u0261\u0003"+
		">\u001f\u0000\u0251\u0261\u00038\u001c\u0000\u0252\u0261\u0003<\u001e"+
		"\u0000\u0253\u0261\u0003J%\u0000\u0254\u0261\u0003.\u0017\u0000\u0255"+
		"\u0256\u0003\\.\u0000\u0256\u0257\u0005:\u0000\u0000\u0257\u0261\u0001"+
		"\u0000\u0000\u0000\u0258\u0259\u0005H\u0000\u0000\u0259\u025a\u0005;\u0000"+
		"\u0000\u025a\u025b\u0003R)\u0000\u025b\u025c\u0005:\u0000\u0000\u025c"+
		"\u0261\u0001\u0000\u0000\u0000\u025d\u0261\u0003\u0082A\u0000\u025e\u0261"+
		"\u0003T*\u0000\u025f\u0261\u0003H$\u0000\u0260\u024d\u0001\u0000\u0000"+
		"\u0000\u0260\u0250\u0001\u0000\u0000\u0000\u0260\u0251\u0001\u0000\u0000"+
		"\u0000\u0260\u0252\u0001\u0000\u0000\u0000\u0260\u0253\u0001\u0000\u0000"+
		"\u0000\u0260\u0254\u0001\u0000\u0000\u0000\u0260\u0255\u0001\u0000\u0000"+
		"\u0000\u0260\u0258\u0001\u0000\u0000\u0000\u0260\u025d\u0001\u0000\u0000"+
		"\u0000\u0260\u025e\u0001\u0000\u0000\u0000\u0260\u025f\u0001\u0000\u0000"+
		"\u0000\u0261Q\u0001\u0000\u0000\u0000\u0262\u0263\u0006)\uffff\uffff\u0000"+
		"\u0263\u026e\u0003\\.\u0000\u0264\u026e\u0003T*\u0000\u0265\u0266\u0005"+
		"6\u0000\u0000\u0266\u0267\u0003R)\u0000\u0267\u0268\u00057\u0000\u0000"+
		"\u0268\u026e\u0001\u0000\u0000\u0000\u0269\u026e\u0005H\u0000\u0000\u026a"+
		"\u026e\u0005B\u0000\u0000\u026b\u026e\u0005E\u0000\u0000\u026c\u026e\u0005"+
		"F\u0000\u0000\u026d\u0262\u0001\u0000\u0000\u0000\u026d\u0264\u0001\u0000"+
		"\u0000\u0000\u026d\u0265\u0001\u0000\u0000\u0000\u026d\u0269\u0001\u0000"+
		"\u0000\u0000\u026d\u026a\u0001\u0000\u0000\u0000\u026d\u026b\u0001\u0000"+
		"\u0000\u0000\u026d\u026c\u0001\u0000\u0000\u0000\u026e\u028d\u0001\u0000"+
		"\u0000\u0000\u026f\u0270\n\u0011\u0000\u0000\u0270\u0271\u0005Q\u0000"+
		"\u0000\u0271\u028c\u0003R)\u0012\u0272\u0273\n\u0010\u0000\u0000\u0273"+
		"\u0274\u0005R\u0000\u0000\u0274\u028c\u0003R)\u0011\u0275\u0276\n\u000f"+
		"\u0000\u0000\u0276\u0277\u0005;\u0000\u0000\u0277\u028c\u0003R)\u0010"+
		"\u0278\u0279\n\u000e\u0000\u0000\u0279\u027a\u0005L\u0000\u0000\u027a"+
		"\u028c\u0003R)\u000f\u027b\u027c\n\r\u0000\u0000\u027c\u027d\u0005M\u0000"+
		"\u0000\u027d\u028c\u0003R)\u000e\u027e\u027f\n\f\u0000\u0000\u027f\u0280"+
		"\u0005N\u0000\u0000\u0280\u028c\u0003R)\r\u0281\u0282\n\u000b\u0000\u0000"+
		"\u0282\u0283\u0005O\u0000\u0000\u0283\u028c\u0003R)\f\u0284\u0285\n\n"+
		"\u0000\u0000\u0285\u0286\u0005P\u0000\u0000\u0286\u028c\u0003R)\u000b"+
		"\u0287\u0288\n\u0007\u0000\u0000\u0288\u028c\u0005C\u0000\u0000\u0289"+
		"\u028a\n\u0006\u0000\u0000\u028a\u028c\u0005D\u0000\u0000\u028b\u026f"+
		"\u0001\u0000\u0000\u0000\u028b\u0272\u0001\u0000\u0000\u0000\u028b\u0275"+
		"\u0001\u0000\u0000\u0000\u028b\u0278\u0001\u0000\u0000\u0000\u028b\u027b"+
		"\u0001\u0000\u0000\u0000\u028b\u027e\u0001\u0000\u0000\u0000\u028b\u0281"+
		"\u0001\u0000\u0000\u0000\u028b\u0284\u0001\u0000\u0000\u0000\u028b\u0287"+
		"\u0001\u0000\u0000\u0000\u028b\u0289\u0001\u0000\u0000\u0000\u028c\u028f"+
		"\u0001\u0000\u0000\u0000\u028d\u028b\u0001\u0000\u0000\u0000\u028d\u028e"+
		"\u0001\u0000\u0000\u0000\u028eS\u0001\u0000\u0000\u0000\u028f\u028d\u0001"+
		"\u0000\u0000\u0000\u0290\u0294\u0003V+\u0000\u0291\u0294\u0003X,\u0000"+
		"\u0292\u0294\u0003Z-\u0000\u0293\u0290\u0001\u0000\u0000\u0000\u0293\u0291"+
		"\u0001\u0000\u0000\u0000\u0293\u0292\u0001\u0000\u0000\u0000\u0294U\u0001"+
		"\u0000\u0000\u0000\u0295\u0296\u0005\u001e\u0000\u0000\u0296\u0297\u0005"+
		"S\u0000\u0000\u0297\u029c\u0005H\u0000\u0000\u0298\u0299\u0005S\u0000"+
		"\u0000\u0299\u029b\u0005H\u0000\u0000\u029a\u0298\u0001\u0000\u0000\u0000"+
		"\u029b\u029e\u0001\u0000\u0000\u0000\u029c\u029a\u0001\u0000\u0000\u0000"+
		"\u029c\u029d\u0001\u0000\u0000\u0000\u029dW\u0001\u0000\u0000\u0000\u029e"+
		"\u029c\u0001\u0000\u0000\u0000\u029f\u02a2\u0005H\u0000\u0000\u02a0\u02a1"+
		"\u0005S\u0000\u0000\u02a1\u02a3\u0005H\u0000\u0000\u02a2\u02a0\u0001\u0000"+
		"\u0000\u0000\u02a3\u02a4\u0001\u0000\u0000\u0000\u02a4\u02a2\u0001\u0000"+
		"\u0000\u0000\u02a4\u02a5\u0001\u0000\u0000\u0000\u02a5Y\u0001\u0000\u0000"+
		"\u0000\u02a6\u02a7\u0005\u001e\u0000\u0000\u02a7\u02a8\u0005S\u0000\u0000"+
		"\u02a8\u02a9\u0005H\u0000\u0000\u02a9\u02aa\u0005S\u0000\u0000\u02aa\u02ab"+
		"\u0005%\u0000\u0000\u02ab\u02ac\u00056\u0000\u0000\u02ac\u02ad\u00057"+
		"\u0000\u0000\u02ad[\u0001\u0000\u0000\u0000\u02ae\u02af\u0003T*\u0000"+
		"\u02af\u02b8\u00056\u0000\u0000\u02b0\u02b5\u0003R)\u0000\u02b1\u02b2"+
		"\u00059\u0000\u0000\u02b2\u02b4\u0003R)\u0000\u02b3\u02b1\u0001\u0000"+
		"\u0000\u0000\u02b4\u02b7\u0001\u0000\u0000\u0000\u02b5\u02b3\u0001\u0000"+
		"\u0000\u0000\u02b5\u02b6\u0001\u0000\u0000\u0000\u02b6\u02b9\u0001\u0000"+
		"\u0000\u0000\u02b7\u02b5\u0001\u0000\u0000\u0000\u02b8\u02b0\u0001\u0000"+
		"\u0000\u0000\u02b8\u02b9\u0001\u0000\u0000\u0000\u02b9\u02ba\u0001\u0000"+
		"\u0000\u0000\u02ba\u02bb\u00057\u0000\u0000\u02bb\u02d6\u0001\u0000\u0000"+
		"\u0000\u02bc\u02bd\u0005H\u0000\u0000\u02bd\u02c6\u00056\u0000\u0000\u02be"+
		"\u02c3\u0003R)\u0000\u02bf\u02c0\u00059\u0000\u0000\u02c0\u02c2\u0003"+
		"R)\u0000\u02c1\u02bf\u0001\u0000\u0000\u0000\u02c2\u02c5\u0001\u0000\u0000"+
		"\u0000\u02c3\u02c1\u0001\u0000\u0000\u0000\u02c3\u02c4\u0001\u0000\u0000"+
		"\u0000\u02c4\u02c7\u0001\u0000\u0000\u0000\u02c5\u02c3\u0001\u0000\u0000"+
		"\u0000\u02c6\u02be\u0001\u0000\u0000\u0000\u02c6\u02c7\u0001\u0000\u0000"+
		"\u0000\u02c7\u02c8\u0001\u0000\u0000\u0000\u02c8\u02d6\u00057\u0000\u0000"+
		"\u02c9\u02ca\u0003T*\u0000\u02ca\u02cc\u00056\u0000\u0000\u02cb\u02cd"+
		"\u0003`0\u0000\u02cc\u02cb\u0001\u0000\u0000\u0000\u02cc\u02cd\u0001\u0000"+
		"\u0000\u0000\u02cd\u02ce\u0001\u0000\u0000\u0000\u02ce\u02cf\u00057\u0000"+
		"\u0000\u02cf\u02d6\u0001\u0000\u0000\u0000\u02d0\u02d1\u0003T*\u0000\u02d1"+
		"\u02d2\u00056\u0000\u0000\u02d2\u02d3\u00057\u0000\u0000\u02d3\u02d4\u0005"+
		":\u0000\u0000\u02d4\u02d6\u0001\u0000\u0000\u0000\u02d5\u02ae\u0001\u0000"+
		"\u0000\u0000\u02d5\u02bc\u0001\u0000\u0000\u0000\u02d5\u02c9\u0001\u0000"+
		"\u0000\u0000\u02d5\u02d0\u0001\u0000\u0000\u0000\u02d6]\u0001\u0000\u0000"+
		"\u0000\u02d7\u02d8\u0005\u001c\u0000\u0000\u02d8\u02d9\u00056\u0000\u0000"+
		"\u02d9\u02de\u0003L&\u0000\u02da\u02db\u00059\u0000\u0000\u02db\u02dd"+
		"\u0003L&\u0000\u02dc\u02da\u0001\u0000\u0000\u0000\u02dd\u02e0\u0001\u0000"+
		"\u0000\u0000\u02de\u02dc\u0001\u0000\u0000\u0000\u02de\u02df\u0001\u0000"+
		"\u0000\u0000\u02df\u02e1\u0001\u0000\u0000\u0000\u02e0\u02de\u0001\u0000"+
		"\u0000\u0000\u02e1\u02e4\u00057\u0000\u0000\u02e2\u02e3\u00058\u0000\u0000"+
		"\u02e3\u02e5\u0005\'\u0000\u0000\u02e4\u02e2\u0001\u0000\u0000\u0000\u02e4"+
		"\u02e5\u0001\u0000\u0000\u0000\u02e5\u02e6\u0001\u0000\u0000\u0000\u02e6"+
		"\u02ea\u00050\u0000\u0000\u02e7\u02e9\u0003P(\u0000\u02e8\u02e7\u0001"+
		"\u0000\u0000\u0000\u02e9\u02ec\u0001\u0000\u0000\u0000\u02ea\u02e8\u0001"+
		"\u0000\u0000\u0000\u02ea\u02eb\u0001\u0000\u0000\u0000\u02eb\u02ed\u0001"+
		"\u0000\u0000\u0000\u02ec\u02ea\u0001\u0000\u0000\u0000\u02ed\u02ee\u0005"+
		"1\u0000\u0000\u02ee_\u0001\u0000\u0000\u0000\u02ef\u02f4\u0003R)\u0000"+
		"\u02f0\u02f1\u00059\u0000\u0000\u02f1\u02f3\u0003R)\u0000\u02f2\u02f0"+
		"\u0001\u0000\u0000\u0000\u02f3\u02f6\u0001\u0000\u0000\u0000\u02f4\u02f2"+
		"\u0001\u0000\u0000\u0000\u02f4\u02f5\u0001\u0000\u0000\u0000\u02f5a\u0001"+
		"\u0000\u0000\u0000\u02f6\u02f4\u0001\u0000\u0000\u0000\u02f7\u0300\u0005"+
		"4\u0000\u0000\u02f8\u02fd\u0003R)\u0000\u02f9\u02fa\u00059\u0000\u0000"+
		"\u02fa\u02fc\u0003R)\u0000\u02fb\u02f9\u0001\u0000\u0000\u0000\u02fc\u02ff"+
		"\u0001\u0000\u0000\u0000\u02fd\u02fb\u0001\u0000\u0000\u0000\u02fd\u02fe"+
		"\u0001\u0000\u0000\u0000\u02fe\u0301\u0001\u0000\u0000\u0000\u02ff\u02fd"+
		"\u0001\u0000\u0000\u0000\u0300\u02f8\u0001\u0000\u0000\u0000\u0300\u0301"+
		"\u0001\u0000\u0000\u0000\u0301\u0302\u0001\u0000\u0000\u0000\u0302\u0303"+
		"\u00055\u0000\u0000\u0303c\u0001\u0000\u0000\u0000\u0304\u0306\u0005\u0004"+
		"\u0000\u0000\u0305\u0304\u0001\u0000\u0000\u0000\u0305\u0306\u0001\u0000"+
		"\u0000\u0000\u0306\u0307\u0001\u0000\u0000\u0000\u0307\u0308\u0005\u000e"+
		"\u0000\u0000\u0308\u0309\u0005H\u0000\u0000\u0309\u030a\u00050\u0000\u0000"+
		"\u030a\u030b\u0003f3\u0000\u030b\u030c\u00051\u0000\u0000\u030ce\u0001"+
		"\u0000\u0000\u0000\u030d\u030f\u0003h4\u0000\u030e\u030d\u0001\u0000\u0000"+
		"\u0000\u030f\u0312\u0001\u0000\u0000\u0000\u0310\u030e\u0001\u0000\u0000"+
		"\u0000\u0310\u0311\u0001\u0000\u0000\u0000\u0311g\u0001\u0000\u0000\u0000"+
		"\u0312\u0310\u0001\u0000\u0000\u0000\u0313\u0316\u0003j5\u0000\u0314\u0316"+
		"\u0003l6\u0000\u0315\u0313\u0001\u0000\u0000\u0000\u0315\u0314\u0001\u0000"+
		"\u0000\u0000\u0316i\u0001\u0000\u0000\u0000\u0317\u0318\u0005H\u0000\u0000"+
		"\u0318\u0319\u00058\u0000\u0000\u0319\u031a\u0003(\u0014\u0000\u031a\u031b"+
		"\u0005:\u0000\u0000\u031bk\u0001\u0000\u0000\u0000\u031c\u031d\u0005H"+
		"\u0000\u0000\u031d\u031f\u00056\u0000\u0000\u031e\u0320\u0003n7\u0000"+
		"\u031f\u031e\u0001\u0000\u0000\u0000\u031f\u0320\u0001\u0000\u0000\u0000"+
		"\u0320\u0321\u0001\u0000\u0000\u0000\u0321\u0322\u00057\u0000\u0000\u0322"+
		"\u0323\u00058\u0000\u0000\u0323\u0324\u0003(\u0014\u0000\u0324\u0325\u0005"+
		":\u0000\u0000\u0325m\u0001\u0000\u0000\u0000\u0326\u032b\u0003p8\u0000"+
		"\u0327\u0328\u00059\u0000\u0000\u0328\u032a\u0003p8\u0000\u0329\u0327"+
		"\u0001\u0000\u0000\u0000\u032a\u032d\u0001\u0000\u0000\u0000\u032b\u0329"+
		"\u0001\u0000\u0000\u0000\u032b\u032c\u0001\u0000\u0000\u0000\u032co\u0001"+
		"\u0000\u0000\u0000\u032d\u032b\u0001\u0000\u0000\u0000\u032e\u032f\u0005"+
		"H\u0000\u0000\u032f\u0330\u00058\u0000\u0000\u0330\u0331\u0003(\u0014"+
		"\u0000\u0331q\u0001\u0000\u0000\u0000\u0332\u0333\u0005&\u0000\u0000\u0333"+
		"\u0334\u00056\u0000\u0000\u0334\u0335\u00057\u0000\u0000\u0335\u0336\u0005"+
		"0\u0000\u0000\u0336\u0337\u0003*\u0015\u0000\u0337\u0338\u00056\u0000"+
		"\u0000\u0338\u0339\u0003R)\u0000\u0339\u033a\u00057\u0000\u0000\u033a"+
		"\u033b\u0005:\u0000\u0000\u033b\u033c\u00051\u0000\u0000\u033cs\u0001"+
		"\u0000\u0000\u0000\u033d\u033e\u0003*\u0015\u0000\u033e\u033f\u00054\u0000"+
		"\u0000\u033f\u0340\u00055\u0000\u0000\u0340\u0347\u0001\u0000\u0000\u0000"+
		"\u0341\u0342\u0005\u001f\u0000\u0000\u0342\u0343\u0005L\u0000\u0000\u0343"+
		"\u0344\u0003*\u0015\u0000\u0344\u0345\u0005M\u0000\u0000\u0345\u0347\u0001"+
		"\u0000\u0000\u0000\u0346\u033d\u0001\u0000\u0000\u0000\u0346\u0341\u0001"+
		"\u0000\u0000\u0000\u0347u\u0001\u0000\u0000\u0000\u0348\u0349\u0005*\u0000"+
		"\u0000\u0349\u034a\u00056\u0000\u0000\u034a\u034b\u00057\u0000\u0000\u034b"+
		"\u034c\u0003x<\u0000\u034c\u034d\u0005:\u0000\u0000\u034dw\u0001\u0000"+
		"\u0000\u0000\u034e\u034f\u0005H\u0000\u0000\u034f\u0350\u0005;\u0000\u0000"+
		"\u0350\u0351\u0005,\u0000\u0000\u0351\u0356\u0005H\u0000\u0000\u0352\u0353"+
		"\u0005L\u0000\u0000\u0353\u0354\u0003(\u0014\u0000\u0354\u0355\u0005M"+
		"\u0000\u0000\u0355\u0357\u0001\u0000\u0000\u0000\u0356\u0352\u0001\u0000"+
		"\u0000\u0000\u0356\u0357\u0001\u0000\u0000\u0000\u0357\u0358\u0001\u0000"+
		"\u0000\u0000\u0358\u0359\u00056\u0000\u0000\u0359\u035a\u00057\u0000\u0000"+
		"\u035ay\u0001\u0000\u0000\u0000\u035b\u0360\u0003R)\u0000\u035c\u035d"+
		"\u00059\u0000\u0000\u035d\u035f\u0003R)\u0000\u035e\u035c\u0001\u0000"+
		"\u0000\u0000\u035f\u0362\u0001\u0000\u0000\u0000\u0360\u035e\u0001\u0000"+
		"\u0000\u0000\u0360\u0361\u0001\u0000\u0000\u0000\u0361{\u0001\u0000\u0000"+
		"\u0000\u0362\u0360\u0001\u0000\u0000\u0000\u0363\u0364\u0005\u001d\u0000"+
		"\u0000\u0364\u0365\u00056\u0000\u0000\u0365\u0366\u00057\u0000\u0000\u0366"+
		"\u0367\u00058\u0000\u0000\u0367\u0368\u0005\'\u0000\u0000\u0368\u0369"+
		"\u00050\u0000\u0000\u0369\u036a\u0003R)\u0000\u036a\u036b\u00051\u0000"+
		"\u0000\u036b}\u0001\u0000\u0000\u0000\u036c\u036d\u0005H\u0000\u0000\u036d"+
		"\u036e\u0005;\u0000\u0000\u036e\u036f\u00056\u0000\u0000\u036f\u0370\u0005"+
		"H\u0000\u0000\u0370\u0371\u00057\u0000\u0000\u0371\u0372\u0005A\u0000"+
		"\u0000\u0372\u037b\u0003\u0080@\u0000\u0373\u0375\u00056\u0000\u0000\u0374"+
		"\u0376\u0003n7\u0000\u0375\u0374\u0001\u0000\u0000\u0000\u0375\u0376\u0001"+
		"\u0000\u0000\u0000\u0376\u0377\u0001\u0000\u0000\u0000\u0377\u0378\u0005"+
		"7\u0000\u0000\u0378\u0379\u0005A\u0000\u0000\u0379\u037b\u0003\u0080@"+
		"\u0000\u037a\u036c\u0001\u0000\u0000\u0000\u037a\u0373\u0001\u0000\u0000"+
		"\u0000\u037b\u007f\u0001\u0000\u0000\u0000\u037c\u0386\u0003R)\u0000\u037d"+
		"\u0381\u00050\u0000\u0000\u037e\u0380\u0003P(\u0000\u037f\u037e\u0001"+
		"\u0000\u0000\u0000\u0380\u0383\u0001\u0000\u0000\u0000\u0381\u037f\u0001"+
		"\u0000\u0000\u0000\u0381\u0382\u0001\u0000\u0000\u0000\u0382\u0384\u0001"+
		"\u0000\u0000\u0000\u0383\u0381\u0001\u0000\u0000\u0000\u0384\u0386\u0005"+
		"1\u0000\u0000\u0385\u037c\u0001\u0000\u0000\u0000\u0385\u037d\u0001\u0000"+
		"\u0000\u0000\u0386\u0081\u0001\u0000\u0000\u0000\u0387\u038a\u0005(\u0000"+
		"\u0000\u0388\u038b\u0003z=\u0000\u0389\u038b\u0003R)\u0000\u038a\u0388"+
		"\u0001\u0000\u0000\u0000\u038a\u0389\u0001\u0000\u0000\u0000\u038b\u038c"+
		"\u0001\u0000\u0000\u0000\u038c\u038d\u0005:\u0000\u0000\u038d\u0083\u0001"+
		"\u0000\u0000\u0000\u038e\u0392\u0003\u008aE\u0000\u038f\u0391\u0003\u008c"+
		"F\u0000\u0390\u038f\u0001\u0000\u0000\u0000\u0391\u0394\u0001\u0000\u0000"+
		"\u0000\u0392\u0390\u0001\u0000\u0000\u0000\u0392\u0393\u0001\u0000\u0000"+
		"\u0000\u0393\u0395\u0001\u0000\u0000\u0000\u0394\u0392\u0001\u0000\u0000"+
		"\u0000\u0395\u0399\u0005M\u0000\u0000\u0396\u0398\u0003\u0094J\u0000\u0397"+
		"\u0396\u0001\u0000\u0000\u0000\u0398\u039b\u0001\u0000\u0000\u0000\u0399"+
		"\u0397\u0001\u0000\u0000\u0000\u0399\u039a\u0001\u0000\u0000\u0000\u039a"+
		"\u039c\u0001\u0000\u0000\u0000\u039b\u0399\u0001\u0000\u0000\u0000\u039c"+
		"\u039d\u0003\u008eG\u0000\u039d\u03b7\u0001\u0000\u0000\u0000\u039e\u03a2"+
		"\u0003\u008aE\u0000\u039f\u03a1\u0003\u008cF\u0000\u03a0\u039f\u0001\u0000"+
		"\u0000\u0000\u03a1\u03a4\u0001\u0000\u0000\u0000\u03a2\u03a0\u0001\u0000"+
		"\u0000\u0000\u03a2\u03a3\u0001\u0000\u0000\u0000\u03a3\u03a5\u0001\u0000"+
		"\u0000\u0000\u03a4\u03a2\u0001\u0000\u0000\u0000\u03a5\u03a6\u0005@\u0000"+
		"\u0000\u03a6\u03b7\u0001\u0000\u0000\u0000\u03a7\u03a8\u0003\u008aE\u0000"+
		"\u03a8\u03a9\u0005\u0005\u0000\u0000\u03a9\u03aa\u0005;\u0000\u0000\u03aa"+
		"\u03ab\u0003\u009cN\u0000\u03ab\u03af\u0005M\u0000\u0000\u03ac\u03ae\u0003"+
		"\u0094J\u0000\u03ad\u03ac\u0001\u0000\u0000\u0000\u03ae\u03b1\u0001\u0000"+
		"\u0000\u0000\u03af\u03ad\u0001\u0000\u0000\u0000\u03af\u03b0\u0001\u0000"+
		"\u0000\u0000\u03b0\u03b2\u0001\u0000\u0000\u0000\u03b1\u03af\u0001\u0000"+
		"\u0000\u0000\u03b2\u03b3\u0003\u008eG\u0000\u03b3\u03b7\u0001\u0000\u0000"+
		"\u0000\u03b4\u03b7\u0003\u0086C\u0000\u03b5\u03b7\u0003\u0088D\u0000\u03b6"+
		"\u038e\u0001\u0000\u0000\u0000\u03b6\u039e\u0001\u0000\u0000\u0000\u03b6"+
		"\u03a7\u0001\u0000\u0000\u0000\u03b6\u03b4\u0001\u0000\u0000\u0000\u03b6"+
		"\u03b5\u0001\u0000\u0000\u0000\u03b7\u0085\u0001\u0000\u0000\u0000\u03b8"+
		"\u03b9\u0005L\u0000\u0000\u03b9\u03ba\u0005[\u0000\u0000\u03ba\u03bb\u0005"+
		"H\u0000\u0000\u03bb\u03bc\u0005;\u0000\u0000\u03bc\u03bd\u0003R)\u0000"+
		"\u03bd\u03be\u0005M\u0000\u0000\u03be\u03bf\u0005B\u0000\u0000\u03bf\u03c0"+
		"\u0005^\u0000\u0000\u03c0\u03c1\u0005[\u0000\u0000\u03c1\u03c2\u0005M"+
		"\u0000\u0000\u03c2\u0087\u0001\u0000\u0000\u0000\u03c3\u03c4\u0005L\u0000"+
		"\u0000\u03c4\u03c8\u0005H\u0000\u0000\u03c5\u03c7\u0003\u008cF\u0000\u03c6"+
		"\u03c5\u0001\u0000\u0000\u0000\u03c7\u03ca\u0001\u0000\u0000\u0000\u03c8"+
		"\u03c6\u0001\u0000\u0000\u0000\u03c8\u03c9\u0001\u0000\u0000\u0000\u03c9"+
		"\u03cb\u0001\u0000\u0000\u0000\u03ca\u03c8\u0001\u0000\u0000\u0000\u03cb"+
		"\u03cc\u0005O\u0000\u0000\u03cc\u03cd\u0005M\u0000\u0000\u03cd\u0089\u0001"+
		"\u0000\u0000\u0000\u03ce\u03cf\u0005L\u0000\u0000\u03cf\u03d0\u0005H\u0000"+
		"\u0000\u03d0\u008b\u0001\u0000\u0000\u0000\u03d1\u03d2\u0005H\u0000\u0000"+
		"\u03d2\u03d3\u0005;\u0000\u0000\u03d3\u03e7\u0005B\u0000\u0000\u03d4\u03e7"+
		"\u0005H\u0000\u0000\u03d5\u03e7\u0003\u0092I\u0000\u03d6\u03e7\u0003\u0090"+
		"H\u0000\u03d7\u03e7\u0003\u009aM\u0000\u03d8\u03e7\u0003\u0086C\u0000"+
		"\u03d9\u03da\u00054\u0000\u0000\u03da\u03db\u0005H\u0000\u0000\u03db\u03dc"+
		"\u00055\u0000\u0000\u03dc\u03dd\u0005;\u0000\u0000\u03dd\u03e7\u0003R"+
		")\u0000\u03de\u03df\u00056\u0000\u0000\u03df\u03e0\u0005H\u0000\u0000"+
		"\u03e0\u03e1\u00057\u0000\u0000\u03e1\u03e2\u0005;\u0000\u0000\u03e2\u03e7"+
		"\u0003R)\u0000\u03e3\u03e4\u00054\u0000\u0000\u03e4\u03e5\u0005H\u0000"+
		"\u0000\u03e5\u03e7\u00055\u0000\u0000\u03e6\u03d1\u0001\u0000\u0000\u0000"+
		"\u03e6\u03d4\u0001\u0000\u0000\u0000\u03e6\u03d5\u0001\u0000\u0000\u0000"+
		"\u03e6\u03d6\u0001\u0000\u0000\u0000\u03e6\u03d7\u0001\u0000\u0000\u0000"+
		"\u03e6\u03d8\u0001\u0000\u0000\u0000\u03e6\u03d9\u0001\u0000\u0000\u0000"+
		"\u03e6\u03de\u0001\u0000\u0000\u0000\u03e6\u03e3\u0001\u0000\u0000\u0000"+
		"\u03e7\u008d\u0001\u0000\u0000\u0000\u03e8\u03e9\u0005^\u0000\u0000\u03e9"+
		"\u03ea\u0005H\u0000\u0000\u03ea\u03eb\u0005M\u0000\u0000\u03eb\u008f\u0001"+
		"\u0000\u0000\u0000\u03ec\u03ed\u0005W\u0000\u0000\u03ed\u03ee\u0005;\u0000"+
		"\u0000\u03ee\u03ef\u0003R)\u0000\u03ef\u0091\u0001\u0000\u0000\u0000\u03f0"+
		"\u03f1\u0005V\u0000\u0000\u03f1\u03f2\u0005;\u0000\u0000\u03f2\u03f3\u0003"+
		"R)\u0000\u03f3\u0093\u0001\u0000\u0000\u0000\u03f4\u03f8\u0003\u0084B"+
		"\u0000\u03f5\u03f8\u0003\u009cN\u0000\u03f6\u03f8\u0003\u0096K\u0000\u03f7"+
		"\u03f4\u0001\u0000\u0000\u0000\u03f7\u03f5\u0001\u0000\u0000\u0000\u03f7"+
		"\u03f6\u0001\u0000\u0000\u0000\u03f8\u03f9\u0001\u0000\u0000\u0000\u03f9"+
		"\u03f7\u0001\u0000\u0000\u0000\u03f9\u03fa\u0001\u0000\u0000\u0000\u03fa"+
		"\u0095\u0001\u0000\u0000\u0000\u03fb\u03fc\u0003\u0098L\u0000\u03fc\u0097"+
		"\u0001\u0000\u0000\u0000\u03fd\u03fe\u00052\u0000\u0000\u03fe\u0403\u0005"+
		"H\u0000\u0000\u03ff\u0400\u0005S\u0000\u0000\u0400\u0402\u0005H\u0000"+
		"\u0000\u0401\u03ff\u0001\u0000\u0000\u0000\u0402\u0405\u0001\u0000\u0000"+
		"\u0000\u0403\u0401\u0001\u0000\u0000\u0000\u0403\u0404\u0001\u0000\u0000"+
		"\u0000\u0404\u0406\u0001\u0000\u0000\u0000\u0405\u0403\u0001\u0000\u0000"+
		"\u0000\u0406\u0407\u00053\u0000\u0000\u0407\u0099\u0001\u0000\u0000\u0000"+
		"\u0408\u0409\u00056\u0000\u0000\u0409\u040a\u0005H\u0000\u0000\u040a\u040b"+
		"\u00057\u0000\u0000\u040b\u040c\u0005;\u0000\u0000\u040c\u040d\u0003R"+
		")\u0000\u040d\u009b\u0001\u0000\u0000\u0000\u040e\u040f\u0007\u0003\u0000"+
		"\u0000\u040f\u009d\u0001\u0000\u0000\u0000Q\u00a1\u00aa\u00b3\u00cc\u00d2"+
		"\u00da\u00f2\u00fb\u0109\u010c\u0125\u012e\u0139\u0142\u0151\u0153\u0159"+
		"\u0160\u017d\u0180\u0187\u019c\u01ab\u01b3\u01b7\u01c1\u01ce\u01db\u01e4"+
		"\u01e8\u01fd\u0205\u020d\u0210\u0216\u0221\u0235\u023f\u0245\u0260\u026d"+
		"\u028b\u028d\u0293\u029c\u02a4\u02b5\u02b8\u02c3\u02c6\u02cc\u02d5\u02de"+
		"\u02e4\u02ea\u02f4\u02fd\u0300\u0305\u0310\u0315\u031f\u032b\u0346\u0356"+
		"\u0360\u0375\u037a\u0381\u0385\u038a\u0392\u0399\u03a2\u03af\u03b6\u03c8"+
		"\u03e6\u03f7\u03f9\u0403";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}