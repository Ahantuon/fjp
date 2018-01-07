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
		WHILE=9, DO=10, IF=11, ELSE=12, LPAREN=13, RPAREN=14, LBRACK=15, RBRACK=16, 
		SEMI=17, COMMA=18, INT_VALUE=19, BOOLEAN_VALUE=20, ID=21, ASSIGN=22, GT=23, 
		LT=24, LE=25, GE=26, EQUAL=27, NOT_EQUAL=28, NEG=29, AND=30, OR=31, ADD=32, 
		SUB=33, MUL=34, DIV=35, WS=36;
	public static final int
		RULE_program = 0, RULE_constant = 1, RULE_globals = 2, RULE_procedure = 3, 
		RULE_int_var = 4, RULE_boolean_var = 5, RULE_arguments = 6, RULE_argument = 7, 
		RULE_body = 8, RULE_locales = 9, RULE_variable = 10, RULE_statement = 11, 
		RULE_call = 12, RULE_do_while = 13, RULE_if_else = 14, RULE_else_part = 15, 
		RULE_assigment = 16, RULE_assigment_p = 17, RULE_var = 18, RULE_value = 19, 
		RULE_ids = 20, RULE_expression = 21, RULE_simpleExp = 22, RULE_term = 23, 
		RULE_main = 24;
	public static final String[] ruleNames = {
		"program", "constant", "globals", "procedure", "int_var", "boolean_var", 
		"arguments", "argument", "body", "locales", "variable", "statement", "call", 
		"do_while", "if_else", "else_part", "assigment", "assigment_p", "var", 
		"value", "ids", "expression", "simpleExp", "term", "main"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'const'", "'int'", "'boolean'", "'procedure'", "'start'", "'end'", 
		"'call'", "'main'", "'while'", "'do'", "'if'", "'else'", "'('", "')'", 
		"'['", "']'", "';'", "','", null, null, null, "':='", "'>'", "'<'", "'<='", 
		"'>='", "'='", "'!='", "'!'", "'&&'", "'||'", "'+'", "'-'", "'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "CONST", "INT", "BOOLEAN", "PROCEDURE", "START", "END", "CALL", 
		"MAIN", "WHILE", "DO", "IF", "ELSE", "LPAREN", "RPAREN", "LBRACK", "RBRACK", 
		"SEMI", "COMMA", "INT_VALUE", "BOOLEAN_VALUE", "ID", "ASSIGN", "GT", "LT", 
		"LE", "GE", "EQUAL", "NOT_EQUAL", "NEG", "AND", "OR", "ADD", "SUB", "MUL", 
		"DIV", "WS"
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
			setState(50);
			match(START);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONST) {
				{
				{
				setState(51);
				constant();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			globals();
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PROCEDURE) {
				{
				{
				setState(58);
				procedure();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			main();
			setState(65);
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
			setState(67);
			match(CONST);
			setState(68);
			match(ID);
			setState(69);
			match(ASSIGN);
			setState(70);
			match(INT_VALUE);
			setState(71);
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
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT || _la==BOOLEAN) {
				{
				{
				setState(73);
				variable();
				}
				}
				setState(78);
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
			setState(79);
			match(PROCEDURE);
			setState(80);
			match(ID);
			setState(81);
			match(LPAREN);
			setState(82);
			arguments();
			setState(83);
			match(RPAREN);
			setState(84);
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
			setState(86);
			match(INT);
			setState(87);
			match(ID);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(88);
				match(ASSIGN);
				setState(89);
				match(INT_VALUE);
				}
			}

			setState(92);
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
			setState(94);
			match(BOOLEAN);
			setState(95);
			match(ID);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(96);
				match(ASSIGN);
				setState(97);
				match(BOOLEAN_VALUE);
				}
			}

			setState(100);
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
			setState(102);
			argument();
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(103);
				match(COMMA);
				setState(104);
				argument();
				}
				}
				setState(109);
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
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				match(INT);
				setState(111);
				match(ID);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(BOOLEAN);
				setState(113);
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
			setState(116);
			match(START);
			setState(117);
			locales();
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CALL) | (1L << DO) | (1L << IF) | (1L << LBRACK) | (1L << ID))) != 0)) {
				{
				{
				setState(118);
				statement();
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
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
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT || _la==BOOLEAN) {
				{
				{
				setState(126);
				variable();
				}
				}
				setState(131);
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
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				int_var();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
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
		public Assigment_pContext assigment_p() {
			return getRuleContext(Assigment_pContext.class,0);
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
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				call();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				assigment();
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				assigment_p();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 4);
				{
				setState(139);
				do_while();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 5);
				{
				setState(140);
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
			setState(143);
			match(CALL);
			setState(144);
			match(ID);
			setState(145);
			match(LPAREN);
			setState(146);
			var();
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(147);
				match(COMMA);
				setState(148);
				var();
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(154);
			match(RPAREN);
			setState(155);
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
		public List<Assigment_pContext> assigment_p() {
			return getRuleContexts(Assigment_pContext.class);
		}
		public Assigment_pContext assigment_p(int i) {
			return getRuleContext(Assigment_pContext.class,i);
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
			setState(157);
			match(DO);
			setState(158);
			match(START);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CALL) | (1L << LBRACK) | (1L << ID))) != 0)) {
				{
				setState(162);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CALL:
					{
					setState(159);
					call();
					}
					break;
				case ID:
					{
					setState(160);
					assigment();
					}
					break;
				case LBRACK:
					{
					setState(161);
					assigment_p();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(167);
			match(END);
			setState(168);
			match(WHILE);
			setState(169);
			match(LPAREN);
			setState(170);
			expression();
			setState(171);
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
		public List<Assigment_pContext> assigment_p() {
			return getRuleContexts(Assigment_pContext.class);
		}
		public Assigment_pContext assigment_p(int i) {
			return getRuleContext(Assigment_pContext.class,i);
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
			setState(173);
			match(IF);
			setState(174);
			match(LPAREN);
			setState(175);
			expression();
			setState(176);
			match(RPAREN);
			setState(177);
			match(START);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CALL) | (1L << DO) | (1L << LBRACK) | (1L << ID))) != 0)) {
				{
				setState(182);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CALL:
					{
					setState(178);
					call();
					}
					break;
				case ID:
					{
					setState(179);
					assigment();
					}
					break;
				case LBRACK:
					{
					setState(180);
					assigment_p();
					}
					break;
				case DO:
					{
					setState(181);
					do_while();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(187);
			match(END);
			setState(188);
			else_part();
			setState(189);
			match(START);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CALL) | (1L << DO) | (1L << LBRACK) | (1L << ID))) != 0)) {
				{
				setState(194);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CALL:
					{
					setState(190);
					call();
					}
					break;
				case ID:
					{
					setState(191);
					assigment();
					}
					break;
				case LBRACK:
					{
					setState(192);
					assigment_p();
					}
					break;
				case DO:
					{
					setState(193);
					do_while();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(199);
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
			setState(201);
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
		public List<TerminalNode> ID() { return getTokens(FJPParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(FJPParser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(FJPParser.ASSIGN, 0); }
		public TerminalNode SEMI() { return getToken(FJPParser.SEMI, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(FJPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FJPParser.COMMA, i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(ID);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(204);
				match(COMMA);
				setState(205);
				match(ID);
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(211);
			match(ASSIGN);
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(212);
				var();
				}
				break;
			case 2:
				{
				setState(213);
				expression();
				}
				break;
			}
			setState(216);
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

	public static class Assigment_pContext extends ParserRuleContext {
		public List<TerminalNode> LBRACK() { return getTokens(FJPParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(FJPParser.LBRACK, i);
		}
		public List<TerminalNode> ID() { return getTokens(FJPParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(FJPParser.ID, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(FJPParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(FJPParser.RBRACK, i);
		}
		public TerminalNode ASSIGN() { return getToken(FJPParser.ASSIGN, 0); }
		public TerminalNode SEMI() { return getToken(FJPParser.SEMI, 0); }
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FJPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FJPParser.COMMA, i);
		}
		public Assigment_pContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assigment_p; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).enterAssigment_p(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).exitAssigment_p(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FJPParserVisitor) return ((FJPParserVisitor<? extends T>)visitor).visitAssigment_p(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assigment_pContext assigment_p() throws RecognitionException {
		Assigment_pContext _localctx = new Assigment_pContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assigment_p);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(LBRACK);
			setState(219);
			match(ID);
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(220);
				match(COMMA);
				setState(221);
				match(ID);
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(227);
			match(RBRACK);
			setState(228);
			match(ASSIGN);
			setState(229);
			match(LBRACK);
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(230);
				var();
				}
				break;
			case 2:
				{
				setState(231);
				expression();
				}
				break;
			}
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(234);
				match(COMMA);
				setState(237);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(235);
					var();
					}
					break;
				case 2:
					{
					setState(236);
					expression();
					}
					break;
				}
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(244);
			match(RBRACK);
			setState(245);
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
		public TerminalNode LPAREN() { return getToken(FJPParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FJPParser.RPAREN, 0); }
		public TerminalNode NEG() { return getToken(FJPParser.NEG, 0); }
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
		enterRule(_localctx, 36, RULE_var);
		int _la;
		try {
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
			case NEG:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEG) {
					{
					setState(247);
					match(NEG);
					}
				}

				setState(250);
				match(LPAREN);
				setState(251);
				expression();
				setState(252);
				match(RPAREN);
				}
				break;
			case INT_VALUE:
			case BOOLEAN_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				value();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(255);
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
		enterRule(_localctx, 38, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
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
		enterRule(_localctx, 40, RULE_ids);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
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
		enterRule(_localctx, 42, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			simpleExp();
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << LE) | (1L << GE) | (1L << EQUAL) | (1L << NOT_EQUAL))) != 0)) {
				{
				{
				setState(263);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << LE) | (1L << GE) | (1L << EQUAL) | (1L << NOT_EQUAL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(264);
				simpleExp();
				}
				}
				setState(269);
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
		enterRule(_localctx, 44, RULE_simpleExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			term();
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << ADD) | (1L << SUB))) != 0)) {
				{
				{
				setState(271);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << ADD) | (1L << SUB))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(272);
				term();
				}
				}
				setState(277);
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
		enterRule(_localctx, 46, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			var();
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << MUL) | (1L << DIV))) != 0)) {
				{
				{
				setState(279);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << MUL) | (1L << DIV))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(280);
				var();
				}
				}
				setState(285);
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
		enterRule(_localctx, 48, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(MAIN);
			setState(287);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u0124\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\7\2\67\n\2\f\2\16\2:\13\2\3\2\3\2\7\2>\n\2\f\2\16\2"+
		"A\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\7\4M\n\4\f\4\16\4P\13\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6]\n\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\5\7e\n\7\3\7\3\7\3\b\3\b\3\b\7\bl\n\b\f\b\16\bo\13\b\3\t\3\t"+
		"\3\t\3\t\5\tu\n\t\3\n\3\n\3\n\7\nz\n\n\f\n\16\n}\13\n\3\n\3\n\3\13\7\13"+
		"\u0082\n\13\f\13\16\13\u0085\13\13\3\f\3\f\5\f\u0089\n\f\3\r\3\r\3\r\3"+
		"\r\3\r\5\r\u0090\n\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0098\n\16\f\16"+
		"\16\16\u009b\13\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\7\17\u00a5"+
		"\n\17\f\17\16\17\u00a8\13\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00b9\n\20\f\20\16\20\u00bc\13"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00c5\n\20\f\20\16\20\u00c8"+
		"\13\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\7\22\u00d1\n\22\f\22\16\22\u00d4"+
		"\13\22\3\22\3\22\3\22\5\22\u00d9\n\22\3\22\3\22\3\23\3\23\3\23\3\23\7"+
		"\23\u00e1\n\23\f\23\16\23\u00e4\13\23\3\23\3\23\3\23\3\23\3\23\5\23\u00eb"+
		"\n\23\3\23\3\23\3\23\5\23\u00f0\n\23\7\23\u00f2\n\23\f\23\16\23\u00f5"+
		"\13\23\3\23\3\23\3\23\3\24\5\24\u00fb\n\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\5\24\u0103\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\7\27\u010c\n\27"+
		"\f\27\16\27\u010f\13\27\3\30\3\30\3\30\7\30\u0114\n\30\f\30\16\30\u0117"+
		"\13\30\3\31\3\31\3\31\7\31\u011c\n\31\f\31\16\31\u011f\13\31\3\32\3\32"+
		"\3\32\3\32\2\2\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\2\6\3\2\25\26\3\2\31\36\3\2!#\4\2  $%\2\u0130\2\64\3\2\2\2\4E\3\2\2\2"+
		"\6N\3\2\2\2\bQ\3\2\2\2\nX\3\2\2\2\f`\3\2\2\2\16h\3\2\2\2\20t\3\2\2\2\22"+
		"v\3\2\2\2\24\u0083\3\2\2\2\26\u0088\3\2\2\2\30\u008f\3\2\2\2\32\u0091"+
		"\3\2\2\2\34\u009f\3\2\2\2\36\u00af\3\2\2\2 \u00cb\3\2\2\2\"\u00cd\3\2"+
		"\2\2$\u00dc\3\2\2\2&\u0102\3\2\2\2(\u0104\3\2\2\2*\u0106\3\2\2\2,\u0108"+
		"\3\2\2\2.\u0110\3\2\2\2\60\u0118\3\2\2\2\62\u0120\3\2\2\2\648\7\7\2\2"+
		"\65\67\5\4\3\2\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29;\3\2\2"+
		"\2:8\3\2\2\2;?\5\6\4\2<>\5\b\5\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2"+
		"\2@B\3\2\2\2A?\3\2\2\2BC\5\62\32\2CD\7\b\2\2D\3\3\2\2\2EF\7\3\2\2FG\7"+
		"\27\2\2GH\7\30\2\2HI\7\25\2\2IJ\7\23\2\2J\5\3\2\2\2KM\5\26\f\2LK\3\2\2"+
		"\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\7\3\2\2\2PN\3\2\2\2QR\7\6\2\2RS\7\27"+
		"\2\2ST\7\17\2\2TU\5\16\b\2UV\7\20\2\2VW\5\22\n\2W\t\3\2\2\2XY\7\4\2\2"+
		"Y\\\7\27\2\2Z[\7\30\2\2[]\7\25\2\2\\Z\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^_\7"+
		"\23\2\2_\13\3\2\2\2`a\7\5\2\2ad\7\27\2\2bc\7\30\2\2ce\7\26\2\2db\3\2\2"+
		"\2de\3\2\2\2ef\3\2\2\2fg\7\23\2\2g\r\3\2\2\2hm\5\20\t\2ij\7\24\2\2jl\5"+
		"\20\t\2ki\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\17\3\2\2\2om\3\2\2\2"+
		"pq\7\4\2\2qu\7\27\2\2rs\7\5\2\2su\7\27\2\2tp\3\2\2\2tr\3\2\2\2u\21\3\2"+
		"\2\2vw\7\7\2\2w{\5\24\13\2xz\5\30\r\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|"+
		"\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\177\7\b\2\2\177\23\3\2\2\2\u0080\u0082\5"+
		"\26\f\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\25\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0089\5\n\6"+
		"\2\u0087\u0089\5\f\7\2\u0088\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089\27"+
		"\3\2\2\2\u008a\u0090\5\32\16\2\u008b\u0090\5\"\22\2\u008c\u0090\5$\23"+
		"\2\u008d\u0090\5\34\17\2\u008e\u0090\5\36\20\2\u008f\u008a\3\2\2\2\u008f"+
		"\u008b\3\2\2\2\u008f\u008c\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u008e\3\2"+
		"\2\2\u0090\31\3\2\2\2\u0091\u0092\7\t\2\2\u0092\u0093\7\27\2\2\u0093\u0094"+
		"\7\17\2\2\u0094\u0099\5&\24\2\u0095\u0096\7\24\2\2\u0096\u0098\5&\24\2"+
		"\u0097\u0095\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a"+
		"\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\7\20\2\2"+
		"\u009d\u009e\7\23\2\2\u009e\33\3\2\2\2\u009f\u00a0\7\f\2\2\u00a0\u00a6"+
		"\7\7\2\2\u00a1\u00a5\5\32\16\2\u00a2\u00a5\5\"\22\2\u00a3\u00a5\5$\23"+
		"\2\u00a4\u00a1\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8"+
		"\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a9\u00aa\7\b\2\2\u00aa\u00ab\7\13\2\2\u00ab\u00ac\7"+
		"\17\2\2\u00ac\u00ad\5,\27\2\u00ad\u00ae\7\20\2\2\u00ae\35\3\2\2\2\u00af"+
		"\u00b0\7\r\2\2\u00b0\u00b1\7\17\2\2\u00b1\u00b2\5,\27\2\u00b2\u00b3\7"+
		"\20\2\2\u00b3\u00ba\7\7\2\2\u00b4\u00b9\5\32\16\2\u00b5\u00b9\5\"\22\2"+
		"\u00b6\u00b9\5$\23\2\u00b7\u00b9\5\34\17\2\u00b8\u00b4\3\2\2\2\u00b8\u00b5"+
		"\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00ba\3\2"+
		"\2\2\u00bd\u00be\7\b\2\2\u00be\u00bf\5 \21\2\u00bf\u00c6\7\7\2\2\u00c0"+
		"\u00c5\5\32\16\2\u00c1\u00c5\5\"\22\2\u00c2\u00c5\5$\23\2\u00c3\u00c5"+
		"\5\34\17\2\u00c4\u00c0\3\2\2\2\u00c4\u00c1\3\2\2\2\u00c4\u00c2\3\2\2\2"+
		"\u00c4\u00c3\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7"+
		"\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca\7\b\2\2\u00ca"+
		"\37\3\2\2\2\u00cb\u00cc\7\16\2\2\u00cc!\3\2\2\2\u00cd\u00d2\7\27\2\2\u00ce"+
		"\u00cf\7\24\2\2\u00cf\u00d1\7\27\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d4\3"+
		"\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d5\u00d8\7\30\2\2\u00d6\u00d9\5&\24\2\u00d7\u00d9\5"+
		",\27\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"\u00db\7\23\2\2\u00db#\3\2\2\2\u00dc\u00dd\7\21\2\2\u00dd\u00e2\7\27\2"+
		"\2\u00de\u00df\7\24\2\2\u00df\u00e1\7\27\2\2\u00e0\u00de\3\2\2\2\u00e1"+
		"\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2"+
		"\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\7\22\2\2\u00e6\u00e7\7\30\2\2\u00e7"+
		"\u00ea\7\21\2\2\u00e8\u00eb\5&\24\2\u00e9\u00eb\5,\27\2\u00ea\u00e8\3"+
		"\2\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00f3\3\2\2\2\u00ec\u00ef\7\24\2\2\u00ed"+
		"\u00f0\5&\24\2\u00ee\u00f0\5,\27\2\u00ef\u00ed\3\2\2\2\u00ef\u00ee\3\2"+
		"\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00ec\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f3\3\2"+
		"\2\2\u00f6\u00f7\7\22\2\2\u00f7\u00f8\7\23\2\2\u00f8%\3\2\2\2\u00f9\u00fb"+
		"\7\37\2\2\u00fa\u00f9\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2"+
		"\u00fc\u00fd\7\17\2\2\u00fd\u00fe\5,\27\2\u00fe\u00ff\7\20\2\2\u00ff\u0103"+
		"\3\2\2\2\u0100\u0103\5(\25\2\u0101\u0103\5*\26\2\u0102\u00fa\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0102\u0101\3\2\2\2\u0103\'\3\2\2\2\u0104\u0105\t\2\2\2"+
		"\u0105)\3\2\2\2\u0106\u0107\7\27\2\2\u0107+\3\2\2\2\u0108\u010d\5.\30"+
		"\2\u0109\u010a\t\3\2\2\u010a\u010c\5.\30\2\u010b\u0109\3\2\2\2\u010c\u010f"+
		"\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e-\3\2\2\2\u010f"+
		"\u010d\3\2\2\2\u0110\u0115\5\60\31\2\u0111\u0112\t\4\2\2\u0112\u0114\5"+
		"\60\31\2\u0113\u0111\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115"+
		"\u0116\3\2\2\2\u0116/\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u011d\5&\24\2"+
		"\u0119\u011a\t\5\2\2\u011a\u011c\5&\24\2\u011b\u0119\3\2\2\2\u011c\u011f"+
		"\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\61\3\2\2\2\u011f"+
		"\u011d\3\2\2\2\u0120\u0121\7\n\2\2\u0121\u0122\5\22\n\2\u0122\63\3\2\2"+
		"\2\378?N\\dmt{\u0083\u0088\u008f\u0099\u00a4\u00a6\u00b8\u00ba\u00c4\u00c6"+
		"\u00d2\u00d8\u00e2\u00ea\u00ef\u00f3\u00fa\u0102\u010d\u0115\u011d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}