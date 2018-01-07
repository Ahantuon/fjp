package src;// Generated from C:/Users/hp/Desktop/Skola/ZS5/FJP/Semestr�lka/fjp\FJPParser.g4 by ANTLR 4.7

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FJPParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CONST=1, INT=2, BOOLEAN=3, PROCEDURE=4, START=5, END=6, CALL=7, MAIN=8, 
		WHILE=9, DO=10, IF=11, ELSE=12, LPAREN=13, RPAREN=14, SEMI=15, COMMA=16, 
		INT_VALUE=17, BOOLEAN_VALUE=18, ID=19, ASSIGN=20, GT=21, LT=22, LE=23, 
		GE=24, EQUAL=25, NOT_EQUAL=26, NEG=27, AND=28, OR=29, ADD=30, SUB=31, 
		MUL=32, DIV=33, WS=34;
	public static final int
		RULE_program = 0, RULE_constant = 1, RULE_globals = 2, RULE_procedure = 3, 
		RULE_int_var = 4, RULE_boolean_var = 5, RULE_arguments = 6, RULE_argument = 7, 
		RULE_body = 8, RULE_locales = 9, RULE_variable = 10, RULE_statement = 11, 
		RULE_call = 12, RULE_do_while = 13, RULE_if_else = 14, RULE_else_part = 15, 
		RULE_assigment = 16, RULE_var = 17, RULE_value = 18, RULE_ids = 19, RULE_expression = 20, 
		RULE_simpleExp = 21, RULE_term = 22, RULE_main = 23;
	public static final String[] ruleNames = {
		"program", "constant", "globals", "procedure", "int_var", "boolean_var", 
		"arguments", "argument", "body", "locales", "variable", "statement", "call", 
		"do_while", "if_else", "else_part", "assigment", "var", "value", "ids", 
		"expression", "simpleExp", "term", "main"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'const'", "'int'", "'boolean'", "'procedure'", "'start'", "'end'", 
		"'call'", "'main'", "'while'", "'do'", "'if'", "'else'", "'('", "')'", 
		"';'", "','", null, null, null, "':='", "'>'", "'<'", "'<='", "'>='", 
		"'='", "'!='", "'!'", "'&&'", "'||'", "'+'", "'-'", "'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "CONST", "INT", "BOOLEAN", "PROCEDURE", "START", "END", "CALL", 
		"MAIN", "WHILE", "DO", "IF", "ELSE", "LPAREN", "RPAREN", "SEMI", "COMMA", 
		"INT_VALUE", "BOOLEAN_VALUE", "ID", "ASSIGN", "GT", "LT", "LE", "GE", 
		"EQUAL", "NOT_EQUAL", "NEG", "AND", "OR", "ADD", "SUB", "MUL", "DIV", 
		"WS"
	};
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
	public String getGrammarFileName() { return "FJPParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FJPParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(FJPParser.START, 0); }
		public GlobalsContext globals() {
			return getRuleContext(GlobalsContext.class,0);
		}
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode END() { return getToken(FJPParser.END, 0); }
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public List<ProcedureContext> procedure() {
			return getRuleContexts(ProcedureContext.class);
		}
		public ProcedureContext procedure(int i) {
			return getRuleContext(ProcedureContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FJPParserVisitor) return ((FJPParserVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(48);
			match(START);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONST) {
				{
				{
				setState(49);
				constant();
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			globals();
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PROCEDURE) {
				{
				{
				setState(56);
				procedure();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			main();
			setState(63);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(FJPParser.CONST, 0); }
		public TerminalNode ID() { return getToken(FJPParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(FJPParser.ASSIGN, 0); }
		public TerminalNode INT_VALUE() { return getToken(FJPParser.INT_VALUE, 0); }
		public TerminalNode SEMI() { return getToken(FJPParser.SEMI, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FJPParserVisitor) return ((FJPParserVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(CONST);
			setState(66);
			match(ID);
			setState(67);
			match(ASSIGN);
			setState(68);
			match(INT_VALUE);
			setState(69);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlobalsContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public GlobalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).enterGlobals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).exitGlobals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FJPParserVisitor) return ((FJPParserVisitor<? extends T>)visitor).visitGlobals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalsContext globals() throws RecognitionException {
		GlobalsContext _localctx = new GlobalsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_globals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT || _la==BOOLEAN) {
				{
				{
				setState(71);
				variable();
				}
				}
				setState(76);
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

	public static class ProcedureContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(FJPParser.PROCEDURE, 0); }
		public TerminalNode ID() { return getToken(FJPParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(FJPParser.LPAREN, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FJPParser.RPAREN, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).enterProcedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).exitProcedure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FJPParserVisitor) return ((FJPParserVisitor<? extends T>)visitor).visitProcedure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureContext procedure() throws RecognitionException {
		ProcedureContext _localctx = new ProcedureContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_procedure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(PROCEDURE);
			setState(78);
			match(ID);
			setState(79);
			match(LPAREN);
			setState(80);
			arguments();
			setState(81);
			match(RPAREN);
			setState(82);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int_varContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(FJPParser.INT, 0); }
		public TerminalNode ID() { return getToken(FJPParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(FJPParser.SEMI, 0); }
		public TerminalNode ASSIGN() { return getToken(FJPParser.ASSIGN, 0); }
		public TerminalNode INT_VALUE() { return getToken(FJPParser.INT_VALUE, 0); }
		public Int_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).enterInt_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).exitInt_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FJPParserVisitor) return ((FJPParserVisitor<? extends T>)visitor).visitInt_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_varContext int_var() throws RecognitionException {
		Int_varContext _localctx = new Int_varContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_int_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(INT);
			setState(85);
			match(ID);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(86);
				match(ASSIGN);
				setState(87);
				match(INT_VALUE);
				}
			}

			setState(90);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolean_varContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(FJPParser.BOOLEAN, 0); }
		public TerminalNode ID() { return getToken(FJPParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(FJPParser.SEMI, 0); }
		public TerminalNode ASSIGN() { return getToken(FJPParser.ASSIGN, 0); }
		public TerminalNode BOOLEAN_VALUE() { return getToken(FJPParser.BOOLEAN_VALUE, 0); }
		public Boolean_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).enterBoolean_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).exitBoolean_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FJPParserVisitor) return ((FJPParserVisitor<? extends T>)visitor).visitBoolean_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_varContext boolean_var() throws RecognitionException {
		Boolean_varContext _localctx = new Boolean_varContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_boolean_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(BOOLEAN);
			setState(93);
			match(ID);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(94);
				match(ASSIGN);
				setState(95);
				match(BOOLEAN_VALUE);
				}
			}

			setState(98);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FJPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FJPParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FJPParserVisitor) return ((FJPParserVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			argument();
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(101);
				match(COMMA);
				setState(102);
				argument();
				}
				}
				setState(107);
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

	public static class ArgumentContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(FJPParser.INT, 0); }
		public TerminalNode ID() { return getToken(FJPParser.ID, 0); }
		public TerminalNode BOOLEAN() { return getToken(FJPParser.BOOLEAN, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FJPParserVisitor) return ((FJPParserVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_argument);
		try {
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(INT);
				setState(109);
				match(ID);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				match(BOOLEAN);
				setState(111);
				match(ID);
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

	public static class BodyContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(FJPParser.START, 0); }
		public LocalesContext locales() {
			return getRuleContext(LocalesContext.class,0);
		}
		public TerminalNode END() { return getToken(FJPParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FJPParserVisitor) return ((FJPParserVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(START);
			setState(115);
			locales();
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CALL) | (1L << DO) | (1L << IF) | (1L << ID))) != 0)) {
				{
				{
				setState(116);
				statement();
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalesContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public LocalesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locales; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).enterLocales(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).exitLocales(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FJPParserVisitor) return ((FJPParserVisitor<? extends T>)visitor).visitLocales(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalesContext locales() throws RecognitionException {
		LocalesContext _localctx = new LocalesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_locales);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT || _la==BOOLEAN) {
				{
				{
				setState(124);
				variable();
				}
				}
				setState(129);
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

	public static class VariableContext extends ParserRuleContext {
		public Int_varContext int_var() {
			return getRuleContext(Int_varContext.class,0);
		}
		public Boolean_varContext boolean_var() {
			return getRuleContext(Boolean_varContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FJPParserVisitor) return ((FJPParserVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variable);
		try {
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				int_var();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				boolean_var();
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

	public static class StatementContext extends ParserRuleContext {
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public AssigmentContext assigment() {
			return getRuleContext(AssigmentContext.class,0);
		}
		public Do_whileContext do_while() {
			return getRuleContext(Do_whileContext.class,0);
		}
		public If_elseContext if_else() {
			return getRuleContext(If_elseContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FJPParserVisitor) return ((FJPParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				call();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				assigment();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				do_while();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
				if_else();
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

	public static class CallContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(FJPParser.CALL, 0); }
		public TerminalNode ID() { return getToken(FJPParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(FJPParser.LPAREN, 0); }
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(FJPParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(FJPParser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(FJPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FJPParser.COMMA, i);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FJPParserVisitor) return ((FJPParserVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(CALL);
			setState(141);
			match(ID);
			setState(142);
			match(LPAREN);
			setState(143);
			var();
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(144);
				match(COMMA);
				setState(145);
				var();
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151);
			match(RPAREN);
			setState(152);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Do_whileContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(FJPParser.DO, 0); }
		public TerminalNode START() { return getToken(FJPParser.START, 0); }
		public TerminalNode END() { return getToken(FJPParser.END, 0); }
		public TerminalNode WHILE() { return getToken(FJPParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(FJPParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FJPParser.RPAREN, 0); }
		public List<CallContext> call() {
			return getRuleContexts(CallContext.class);
		}
		public CallContext call(int i) {
			return getRuleContext(CallContext.class,i);
		}
		public List<AssigmentContext> assigment() {
			return getRuleContexts(AssigmentContext.class);
		}
		public AssigmentContext assigment(int i) {
			return getRuleContext(AssigmentContext.class,i);
		}
		public Do_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).enterDo_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).exitDo_while(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FJPParserVisitor) return ((FJPParserVisitor<? extends T>)visitor).visitDo_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_whileContext do_while() throws RecognitionException {
		Do_whileContext _localctx = new Do_whileContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_do_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(DO);
			setState(155);
			match(START);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CALL || _la==ID) {
				{
				setState(158);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CALL:
					{
					setState(156);
					call();
					}
					break;
				case ID:
					{
					setState(157);
					assigment();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(163);
			match(END);
			setState(164);
			match(WHILE);
			setState(165);
			match(LPAREN);
			setState(166);
			expression();
			setState(167);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_elseContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(FJPParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(FJPParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FJPParser.RPAREN, 0); }
		public List<TerminalNode> START() { return getTokens(FJPParser.START); }
		public TerminalNode START(int i) {
			return getToken(FJPParser.START, i);
		}
		public List<TerminalNode> END() { return getTokens(FJPParser.END); }
		public TerminalNode END(int i) {
			return getToken(FJPParser.END, i);
		}
		public Else_partContext else_part() {
			return getRuleContext(Else_partContext.class,0);
		}
		public List<CallContext> call() {
			return getRuleContexts(CallContext.class);
		}
		public CallContext call(int i) {
			return getRuleContext(CallContext.class,i);
		}
		public List<AssigmentContext> assigment() {
			return getRuleContexts(AssigmentContext.class);
		}
		public AssigmentContext assigment(int i) {
			return getRuleContext(AssigmentContext.class,i);
		}
		public List<Do_whileContext> do_while() {
			return getRuleContexts(Do_whileContext.class);
		}
		public Do_whileContext do_while(int i) {
			return getRuleContext(Do_whileContext.class,i);
		}
		public If_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).enterIf_else(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).exitIf_else(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FJPParserVisitor) return ((FJPParserVisitor<? extends T>)visitor).visitIf_else(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_elseContext if_else() throws RecognitionException {
		If_elseContext _localctx = new If_elseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_if_else);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(IF);
			setState(170);
			match(LPAREN);
			setState(171);
			expression();
			setState(172);
			match(RPAREN);
			setState(173);
			match(START);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CALL) | (1L << DO) | (1L << ID))) != 0)) {
				{
				setState(177);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CALL:
					{
					setState(174);
					call();
					}
					break;
				case ID:
					{
					setState(175);
					assigment();
					}
					break;
				case DO:
					{
					setState(176);
					do_while();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(182);
			match(END);
			setState(183);
			else_part();
			setState(184);
			match(START);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CALL) | (1L << DO) | (1L << ID))) != 0)) {
				{
				setState(188);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CALL:
					{
					setState(185);
					call();
					}
					break;
				case ID:
					{
					setState(186);
					assigment();
					}
					break;
				case DO:
					{
					setState(187);
					do_while();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(193);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_partContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(FJPParser.ELSE, 0); }
		public Else_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).enterElse_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).exitElse_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FJPParserVisitor) return ((FJPParserVisitor<? extends T>)visitor).visitElse_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_partContext else_part() throws RecognitionException {
		Else_partContext _localctx = new Else_partContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_else_part);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(ELSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssigmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(FJPParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(FJPParser.ASSIGN, 0); }
		public TerminalNode SEMI() { return getToken(FJPParser.SEMI, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssigmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assigment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).enterAssigment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).exitAssigment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FJPParserVisitor) return ((FJPParserVisitor<? extends T>)visitor).visitAssigment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssigmentContext assigment() throws RecognitionException {
		AssigmentContext _localctx = new AssigmentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assigment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(ID);
			setState(198);
			match(ASSIGN);
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(199);
				var();
				}
				break;
			case 2:
				{
				setState(200);
				expression();
				}
				break;
			}
			setState(203);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FJPParserVisitor) return ((FJPParserVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_var);
		try {
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_VALUE:
			case BOOLEAN_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				value();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				ids();
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode INT_VALUE() { return getToken(FJPParser.INT_VALUE, 0); }
		public TerminalNode BOOLEAN_VALUE() { return getToken(FJPParser.BOOLEAN_VALUE, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FJPParserVisitor) return ((FJPParserVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_la = _input.LA(1);
			if ( !(_la==INT_VALUE || _la==BOOLEAN_VALUE) ) {
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

	public static class IdsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(FJPParser.ID, 0); }
		public IdsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ids; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).enterIds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).exitIds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FJPParserVisitor) return ((FJPParserVisitor<? extends T>)visitor).visitIds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdsContext ids() throws RecognitionException {
		IdsContext _localctx = new IdsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ids);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(ID);
			}
		}
		catch (RecognitionException re) {
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
		public List<SimpleExpContext> simpleExp() {
			return getRuleContexts(SimpleExpContext.class);
		}
		public SimpleExpContext simpleExp(int i) {
			return getRuleContext(SimpleExpContext.class,i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(FJPParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(FJPParser.EQUAL, i);
		}
		public List<TerminalNode> NOT_EQUAL() { return getTokens(FJPParser.NOT_EQUAL); }
		public TerminalNode NOT_EQUAL(int i) {
			return getToken(FJPParser.NOT_EQUAL, i);
		}
		public List<TerminalNode> LT() { return getTokens(FJPParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(FJPParser.LT, i);
		}
		public List<TerminalNode> LE() { return getTokens(FJPParser.LE); }
		public TerminalNode LE(int i) {
			return getToken(FJPParser.LE, i);
		}
		public List<TerminalNode> GE() { return getTokens(FJPParser.GE); }
		public TerminalNode GE(int i) {
			return getToken(FJPParser.GE, i);
		}
		public List<TerminalNode> GT() { return getTokens(FJPParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(FJPParser.GT, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FJPParserVisitor) return ((FJPParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			simpleExp();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << LE) | (1L << GE) | (1L << EQUAL) | (1L << NOT_EQUAL))) != 0)) {
				{
				{
				setState(214);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << LE) | (1L << GE) | (1L << EQUAL) | (1L << NOT_EQUAL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(215);
				simpleExp();
				}
				}
				setState(220);
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

	public static class SimpleExpContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> ADD() { return getTokens(FJPParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(FJPParser.ADD, i);
		}
		public List<TerminalNode> SUB() { return getTokens(FJPParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(FJPParser.SUB, i);
		}
		public List<TerminalNode> OR() { return getTokens(FJPParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(FJPParser.OR, i);
		}
		public SimpleExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).enterSimpleExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).exitSimpleExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FJPParserVisitor) return ((FJPParserVisitor<? extends T>)visitor).visitSimpleExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleExpContext simpleExp() throws RecognitionException {
		SimpleExpContext _localctx = new SimpleExpContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_simpleExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			term();
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << ADD) | (1L << SUB))) != 0)) {
				{
				{
				setState(222);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << ADD) | (1L << SUB))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(223);
				term();
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

	public static class TermContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(FJPParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(FJPParser.AND, i);
		}
		public List<TerminalNode> MUL() { return getTokens(FJPParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(FJPParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(FJPParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(FJPParser.DIV, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FJPParserVisitor) return ((FJPParserVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			var();
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << MUL) | (1L << DIV))) != 0)) {
				{
				{
				setState(230);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << MUL) | (1L << DIV))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(231);
				var();
				}
				}
				setState(236);
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

	public static class MainContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(FJPParser.MAIN, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FJPParserVisitor) return ((FJPParserVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(MAIN);
			setState(238);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u00f3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\7\2\65\n\2\f\2\16\28\13\2\3\2\3\2\7\2<\n\2\f\2\16\2?\13\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\7\4K\n\4\f\4\16\4N\13\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6[\n\6\3\6\3\6\3\7\3\7\3\7\3\7\5"+
		"\7c\n\7\3\7\3\7\3\b\3\b\3\b\7\bj\n\b\f\b\16\bm\13\b\3\t\3\t\3\t\3\t\5"+
		"\ts\n\t\3\n\3\n\3\n\7\nx\n\n\f\n\16\n{\13\n\3\n\3\n\3\13\7\13\u0080\n"+
		"\13\f\13\16\13\u0083\13\13\3\f\3\f\5\f\u0087\n\f\3\r\3\r\3\r\3\r\5\r\u008d"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0095\n\16\f\16\16\16\u0098\13"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u00a1\n\17\f\17\16\17\u00a4"+
		"\13\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\7\20\u00b4\n\20\f\20\16\20\u00b7\13\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\7\20\u00bf\n\20\f\20\16\20\u00c2\13\20\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\5\22\u00cc\n\22\3\22\3\22\3\23\3\23\5\23\u00d2\n\23\3"+
		"\24\3\24\3\25\3\25\3\26\3\26\3\26\7\26\u00db\n\26\f\26\16\26\u00de\13"+
		"\26\3\27\3\27\3\27\7\27\u00e3\n\27\f\27\16\27\u00e6\13\27\3\30\3\30\3"+
		"\30\7\30\u00eb\n\30\f\30\16\30\u00ee\13\30\3\31\3\31\3\31\3\31\2\2\32"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\6\3\2\23\24\3\2"+
		"\27\34\3\2\37!\4\2\36\36\"#\2\u00f5\2\62\3\2\2\2\4C\3\2\2\2\6L\3\2\2\2"+
		"\bO\3\2\2\2\nV\3\2\2\2\f^\3\2\2\2\16f\3\2\2\2\20r\3\2\2\2\22t\3\2\2\2"+
		"\24\u0081\3\2\2\2\26\u0086\3\2\2\2\30\u008c\3\2\2\2\32\u008e\3\2\2\2\34"+
		"\u009c\3\2\2\2\36\u00ab\3\2\2\2 \u00c5\3\2\2\2\"\u00c7\3\2\2\2$\u00d1"+
		"\3\2\2\2&\u00d3\3\2\2\2(\u00d5\3\2\2\2*\u00d7\3\2\2\2,\u00df\3\2\2\2."+
		"\u00e7\3\2\2\2\60\u00ef\3\2\2\2\62\66\7\7\2\2\63\65\5\4\3\2\64\63\3\2"+
		"\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28\66\3\2\2\29"+
		"=\5\6\4\2:<\5\b\5\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2"+
		"?=\3\2\2\2@A\5\60\31\2AB\7\b\2\2B\3\3\2\2\2CD\7\3\2\2DE\7\25\2\2EF\7\26"+
		"\2\2FG\7\23\2\2GH\7\21\2\2H\5\3\2\2\2IK\5\26\f\2JI\3\2\2\2KN\3\2\2\2L"+
		"J\3\2\2\2LM\3\2\2\2M\7\3\2\2\2NL\3\2\2\2OP\7\6\2\2PQ\7\25\2\2QR\7\17\2"+
		"\2RS\5\16\b\2ST\7\20\2\2TU\5\22\n\2U\t\3\2\2\2VW\7\4\2\2WZ\7\25\2\2XY"+
		"\7\26\2\2Y[\7\23\2\2ZX\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\7\21\2\2]\13\3"+
		"\2\2\2^_\7\5\2\2_b\7\25\2\2`a\7\26\2\2ac\7\24\2\2b`\3\2\2\2bc\3\2\2\2"+
		"cd\3\2\2\2de\7\21\2\2e\r\3\2\2\2fk\5\20\t\2gh\7\22\2\2hj\5\20\t\2ig\3"+
		"\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\17\3\2\2\2mk\3\2\2\2no\7\4\2\2o"+
		"s\7\25\2\2pq\7\5\2\2qs\7\25\2\2rn\3\2\2\2rp\3\2\2\2s\21\3\2\2\2tu\7\7"+
		"\2\2uy\5\24\13\2vx\5\30\r\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|"+
		"\3\2\2\2{y\3\2\2\2|}\7\b\2\2}\23\3\2\2\2~\u0080\5\26\f\2\177~\3\2\2\2"+
		"\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\25\3"+
		"\2\2\2\u0083\u0081\3\2\2\2\u0084\u0087\5\n\6\2\u0085\u0087\5\f\7\2\u0086"+
		"\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\27\3\2\2\2\u0088\u008d\5\32\16"+
		"\2\u0089\u008d\5\"\22\2\u008a\u008d\5\34\17\2\u008b\u008d\5\36\20\2\u008c"+
		"\u0088\3\2\2\2\u008c\u0089\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2"+
		"\2\2\u008d\31\3\2\2\2\u008e\u008f\7\t\2\2\u008f\u0090\7\25\2\2\u0090\u0091"+
		"\7\17\2\2\u0091\u0096\5$\23\2\u0092\u0093\7\22\2\2\u0093\u0095\5$\23\2"+
		"\u0094\u0092\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097"+
		"\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a\7\20\2\2"+
		"\u009a\u009b\7\21\2\2\u009b\33\3\2\2\2\u009c\u009d\7\f\2\2\u009d\u00a2"+
		"\7\7\2\2\u009e\u00a1\5\32\16\2\u009f\u00a1\5\"\22\2\u00a0\u009e\3\2\2"+
		"\2\u00a0\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3"+
		"\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\7\b\2\2\u00a6"+
		"\u00a7\7\13\2\2\u00a7\u00a8\7\17\2\2\u00a8\u00a9\5*\26\2\u00a9\u00aa\7"+
		"\20\2\2\u00aa\35\3\2\2\2\u00ab\u00ac\7\r\2\2\u00ac\u00ad\7\17\2\2\u00ad"+
		"\u00ae\5*\26\2\u00ae\u00af\7\20\2\2\u00af\u00b5\7\7\2\2\u00b0\u00b4\5"+
		"\32\16\2\u00b1\u00b4\5\"\22\2\u00b2\u00b4\5\34\17\2\u00b3\u00b0\3\2\2"+
		"\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3"+
		"\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8"+
		"\u00b9\7\b\2\2\u00b9\u00ba\5 \21\2\u00ba\u00c0\7\7\2\2\u00bb\u00bf\5\32"+
		"\16\2\u00bc\u00bf\5\"\22\2\u00bd\u00bf\5\34\17\2\u00be\u00bb\3\2\2\2\u00be"+
		"\u00bc\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2"+
		"\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3"+
		"\u00c4\7\b\2\2\u00c4\37\3\2\2\2\u00c5\u00c6\7\16\2\2\u00c6!\3\2\2\2\u00c7"+
		"\u00c8\7\25\2\2\u00c8\u00cb\7\26\2\2\u00c9\u00cc\5$\23\2\u00ca\u00cc\5"+
		"*\26\2\u00cb\u00c9\3\2\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00ce\7\21\2\2\u00ce#\3\2\2\2\u00cf\u00d2\5&\24\2\u00d0\u00d2\5(\25\2"+
		"\u00d1\u00cf\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2%\3\2\2\2\u00d3\u00d4\t"+
		"\2\2\2\u00d4\'\3\2\2\2\u00d5\u00d6\7\25\2\2\u00d6)\3\2\2\2\u00d7\u00dc"+
		"\5,\27\2\u00d8\u00d9\t\3\2\2\u00d9\u00db\5,\27\2\u00da\u00d8\3\2\2\2\u00db"+
		"\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd+\3\2\2\2"+
		"\u00de\u00dc\3\2\2\2\u00df\u00e4\5.\30\2\u00e0\u00e1\t\4\2\2\u00e1\u00e3"+
		"\5.\30\2\u00e2\u00e0\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5-\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00ec\5$\23\2"+
		"\u00e8\u00e9\t\5\2\2\u00e9\u00eb\5$\23\2\u00ea\u00e8\3\2\2\2\u00eb\u00ee"+
		"\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed/\3\2\2\2\u00ee"+
		"\u00ec\3\2\2\2\u00ef\u00f0\7\n\2\2\u00f0\u00f1\5\22\n\2\u00f1\61\3\2\2"+
		"\2\31\66=LZbkry\u0081\u0086\u008c\u0096\u00a0\u00a2\u00b3\u00b5\u00be"+
		"\u00c0\u00cb\u00d1\u00dc\u00e4\u00ec";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}