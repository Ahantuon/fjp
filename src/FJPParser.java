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
		WHILE=9, DO=10, IF=11, ELSE=12, REPEAT=13, UNTIL=14, LPAREN=15, RPAREN=16, 
		LBRACK=17, RBRACK=18, SEMI=19, COMMA=20, INT_VALUE=21, BOOLEAN_VALUE=22, 
		ID=23, ASSIGN=24, GT=25, LT=26, LE=27, GE=28, EQUAL=29, NOT_EQUAL=30, 
		NEG=31, AND=32, OR=33, ADD=34, SUB=35, MUL=36, DIV=37, WS=38;
	public static final int
		RULE_program = 0, RULE_constant = 1, RULE_globals = 2, RULE_procedure = 3, 
		RULE_int_var = 4, RULE_boolean_var = 5, RULE_arguments = 6, RULE_argument = 7, 
		RULE_body = 8, RULE_locales = 9, RULE_variable = 10, RULE_statement = 11, 
		RULE_call = 12, RULE_re_until = 13, RULE_do_while = 14, RULE_while_do = 15, 
		RULE_start_do = 16, RULE_if_else = 17, RULE_else_part = 18, RULE_assigment = 19, 
		RULE_assigment_p = 20, RULE_var = 21, RULE_value = 22, RULE_ids = 23, 
		RULE_expression = 24, RULE_simpleExp = 25, RULE_term = 26, RULE_main = 27;
	public static final String[] ruleNames = {
		"program", "constant", "globals", "procedure", "int_var", "boolean_var", 
		"arguments", "argument", "body", "locales", "variable", "statement", "call", 
		"re_until", "do_while", "while_do", "start_do", "if_else", "else_part", 
		"assigment", "assigment_p", "var", "value", "ids", "expression", "simpleExp", 
		"term", "main"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'const'", "'int'", "'boolean'", "'procedure'", "'start'", "'end'", 
		"'call'", "'main'", "'while'", "'do'", "'if'", "'else'", "'repeat'", "'until'", 
		"'('", "')'", "'['", "']'", "';'", "','", null, null, null, "':='", "'>'", 
		"'<'", "'<='", "'>='", "'='", "'!='", "'!'", "'&&'", "'||'", "'+'", "'-'", 
		"'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "CONST", "INT", "BOOLEAN", "PROCEDURE", "START", "END", "CALL", 
		"MAIN", "WHILE", "DO", "IF", "ELSE", "REPEAT", "UNTIL", "LPAREN", "RPAREN", 
		"LBRACK", "RBRACK", "SEMI", "COMMA", "INT_VALUE", "BOOLEAN_VALUE", "ID", 
		"ASSIGN", "GT", "LT", "LE", "GE", "EQUAL", "NOT_EQUAL", "NEG", "AND", 
		"OR", "ADD", "SUB", "MUL", "DIV", "WS"
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
			setState(56);
			match(START);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONST) {
				{
				{
				setState(57);
				constant();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			globals();
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PROCEDURE) {
				{
				{
				setState(64);
				procedure();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			main();
			setState(71);
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
			setState(73);
			match(CONST);
			setState(74);
			match(ID);
			setState(75);
			match(ASSIGN);
			setState(76);
			match(INT_VALUE);
			setState(77);
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
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT || _la==BOOLEAN) {
				{
				{
				setState(79);
				variable();
				}
				}
				setState(84);
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
			setState(85);
			match(PROCEDURE);
			setState(86);
			match(ID);
			setState(87);
			match(LPAREN);
			setState(88);
			arguments();
			setState(89);
			match(RPAREN);
			setState(90);
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
			setState(92);
			match(INT);
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
				match(INT_VALUE);
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
			setState(100);
			match(BOOLEAN);
			setState(101);
			match(ID);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(102);
				match(ASSIGN);
				setState(103);
				match(BOOLEAN_VALUE);
				}
			}

			setState(106);
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
			setState(108);
			argument();
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(109);
				match(COMMA);
				setState(110);
				argument();
				}
				}
				setState(115);
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
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(INT);
				setState(117);
				match(ID);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				match(BOOLEAN);
				setState(119);
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
			setState(122);
			match(START);
			setState(123);
			locales();
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CALL) | (1L << WHILE) | (1L << DO) | (1L << IF) | (1L << REPEAT) | (1L << LBRACK) | (1L << ID))) != 0)) {
				{
				{
				setState(124);
				statement();
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
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
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT || _la==BOOLEAN) {
				{
				{
				setState(132);
				variable();
				}
				}
				setState(137);
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
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				int_var();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
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
		public Re_untilContext re_until() {
			return getRuleContext(Re_untilContext.class,0);
		}
		public Do_whileContext do_while() {
			return getRuleContext(Do_whileContext.class,0);
		}
		public While_doContext while_do() {
			return getRuleContext(While_doContext.class,0);
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
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				call();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				assigment();
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				assigment_p();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(145);
				re_until();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 5);
				{
				setState(146);
				do_while();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 6);
				{
				setState(147);
				while_do();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 7);
				{
				setState(148);
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
			setState(151);
			match(CALL);
			setState(152);
			match(ID);
			setState(153);
			match(LPAREN);
			setState(154);
			var();
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(155);
				match(COMMA);
				setState(156);
				var();
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
			match(RPAREN);
			setState(163);
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

	public static class Re_untilContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(FJPParser.REPEAT, 0); }
		public TerminalNode START() { return getToken(FJPParser.START, 0); }
		public TerminalNode END() { return getToken(FJPParser.END, 0); }
		public TerminalNode UNTIL() { return getToken(FJPParser.UNTIL, 0); }
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
		public Re_untilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_re_until; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).enterRe_until(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).exitRe_until(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FJPParserVisitor) return ((FJPParserVisitor<? extends T>)visitor).visitRe_until(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Re_untilContext re_until() throws RecognitionException {
		Re_untilContext _localctx = new Re_untilContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_re_until);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(REPEAT);
			setState(166);
			match(START);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CALL) | (1L << LBRACK) | (1L << ID))) != 0)) {
				{
				setState(170);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CALL:
					{
					setState(167);
					call();
					}
					break;
				case ID:
					{
					setState(168);
					assigment();
					}
					break;
				case LBRACK:
					{
					setState(169);
					assigment_p();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175);
			match(END);
			setState(176);
			match(UNTIL);
			setState(177);
			match(LPAREN);
			setState(178);
			expression();
			setState(179);
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
		enterRule(_localctx, 28, RULE_do_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(DO);
			setState(182);
			match(START);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CALL) | (1L << LBRACK) | (1L << ID))) != 0)) {
				{
				setState(186);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CALL:
					{
					setState(183);
					call();
					}
					break;
				case ID:
					{
					setState(184);
					assigment();
					}
					break;
				case LBRACK:
					{
					setState(185);
					assigment_p();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(191);
			match(END);
			setState(192);
			match(WHILE);
			setState(193);
			match(LPAREN);
			setState(194);
			expression();
			setState(195);
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

	public static class While_doContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(FJPParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(FJPParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FJPParser.RPAREN, 0); }
		public Start_doContext start_do() {
			return getRuleContext(Start_doContext.class,0);
		}
		public TerminalNode END() { return getToken(FJPParser.END, 0); }
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
		public While_doContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_do; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).enterWhile_do(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).exitWhile_do(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FJPParserVisitor) return ((FJPParserVisitor<? extends T>)visitor).visitWhile_do(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_doContext while_do() throws RecognitionException {
		While_doContext _localctx = new While_doContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_while_do);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(WHILE);
			setState(198);
			match(LPAREN);
			setState(199);
			expression();
			setState(200);
			match(RPAREN);
			setState(201);
			start_do();
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CALL) | (1L << LBRACK) | (1L << ID))) != 0)) {
				{
				setState(205);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CALL:
					{
					setState(202);
					call();
					}
					break;
				case ID:
					{
					setState(203);
					assigment();
					}
					break;
				case LBRACK:
					{
					setState(204);
					assigment_p();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(210);
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

	public static class Start_doContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(FJPParser.START, 0); }
		public Start_doContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_do; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).enterStart_do(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).exitStart_do(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FJPParserVisitor) return ((FJPParserVisitor<? extends T>)visitor).visitStart_do(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Start_doContext start_do() throws RecognitionException {
		Start_doContext _localctx = new Start_doContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_start_do);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(START);
			}
		}
		catch (RecognitionException re) {
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
		public List<Re_untilContext> re_until() {
			return getRuleContexts(Re_untilContext.class);
		}
		public Re_untilContext re_until(int i) {
			return getRuleContext(Re_untilContext.class,i);
		}
		public List<While_doContext> while_do() {
			return getRuleContexts(While_doContext.class);
		}
		public While_doContext while_do(int i) {
			return getRuleContext(While_doContext.class,i);
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
		enterRule(_localctx, 34, RULE_if_else);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(IF);
			setState(215);
			match(LPAREN);
			setState(216);
			expression();
			setState(217);
			match(RPAREN);
			setState(218);
			match(START);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CALL) | (1L << WHILE) | (1L << DO) | (1L << REPEAT) | (1L << LBRACK) | (1L << ID))) != 0)) {
				{
				setState(225);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CALL:
					{
					setState(219);
					call();
					}
					break;
				case ID:
					{
					setState(220);
					assigment();
					}
					break;
				case LBRACK:
					{
					setState(221);
					assigment_p();
					}
					break;
				case REPEAT:
					{
					setState(222);
					re_until();
					}
					break;
				case WHILE:
					{
					setState(223);
					while_do();
					}
					break;
				case DO:
					{
					setState(224);
					do_while();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(230);
			match(END);
			setState(231);
			else_part();
			setState(232);
			match(START);
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CALL) | (1L << WHILE) | (1L << DO) | (1L << REPEAT) | (1L << LBRACK) | (1L << ID))) != 0)) {
				{
				setState(239);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CALL:
					{
					setState(233);
					call();
					}
					break;
				case ID:
					{
					setState(234);
					assigment();
					}
					break;
				case LBRACK:
					{
					setState(235);
					assigment_p();
					}
					break;
				case REPEAT:
					{
					setState(236);
					re_until();
					}
					break;
				case WHILE:
					{
					setState(237);
					while_do();
					}
					break;
				case DO:
					{
					setState(238);
					do_while();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(244);
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
		enterRule(_localctx, 36, RULE_else_part);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
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
		enterRule(_localctx, 38, RULE_assigment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(ID);
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(249);
				match(COMMA);
				setState(250);
				match(ID);
				}
				}
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(256);
			match(ASSIGN);
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(257);
				var();
				}
				break;
			case 2:
				{
				setState(258);
				expression();
				}
				break;
			}
			setState(261);
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
		enterRule(_localctx, 40, RULE_assigment_p);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(LBRACK);
			setState(264);
			match(ID);
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(265);
				match(COMMA);
				setState(266);
				match(ID);
				}
				}
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(272);
			match(RBRACK);
			setState(273);
			match(ASSIGN);
			setState(274);
			match(LBRACK);
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(275);
				var();
				}
				break;
			case 2:
				{
				setState(276);
				expression();
				}
				break;
			}
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(279);
				match(COMMA);
				setState(282);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(280);
					var();
					}
					break;
				case 2:
					{
					setState(281);
					expression();
					}
					break;
				}
				}
				}
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(289);
			match(RBRACK);
			setState(290);
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
		enterRule(_localctx, 42, RULE_var);
		int _la;
		try {
			setState(301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
			case NEG:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEG) {
					{
					setState(292);
					match(NEG);
					}
				}

				setState(295);
				match(LPAREN);
				setState(296);
				expression();
				setState(297);
				match(RPAREN);
				}
				break;
			case INT_VALUE:
			case BOOLEAN_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				value();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(300);
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
		enterRule(_localctx, 44, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
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
		enterRule(_localctx, 46, RULE_ids);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
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
		enterRule(_localctx, 48, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			simpleExp();
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << LE) | (1L << GE) | (1L << EQUAL) | (1L << NOT_EQUAL))) != 0)) {
				{
				{
				setState(308);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << LE) | (1L << GE) | (1L << EQUAL) | (1L << NOT_EQUAL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(309);
				simpleExp();
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
		enterRule(_localctx, 50, RULE_simpleExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			term();
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << ADD) | (1L << SUB))) != 0)) {
				{
				{
				setState(316);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << ADD) | (1L << SUB))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(317);
				term();
				}
				}
				setState(322);
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
		enterRule(_localctx, 52, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			var();
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << MUL) | (1L << DIV))) != 0)) {
				{
				{
				setState(324);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << MUL) | (1L << DIV))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(325);
				var();
				}
				}
				setState(330);
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
		enterRule(_localctx, 54, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(MAIN);
			setState(332);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u0151\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\7\2=\n\2\f\2\16\2@\13"+
		"\2\3\2\3\2\7\2D\n\2\f\2\16\2G\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\7\4S\n\4\f\4\16\4V\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\5\6c\n\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7k\n\7\3\7\3\7\3\b\3\b\3\b\7\br"+
		"\n\b\f\b\16\bu\13\b\3\t\3\t\3\t\3\t\5\t{\n\t\3\n\3\n\3\n\7\n\u0080\n\n"+
		"\f\n\16\n\u0083\13\n\3\n\3\n\3\13\7\13\u0088\n\13\f\13\16\13\u008b\13"+
		"\13\3\f\3\f\5\f\u008f\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0098\n\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\7\16\u00a0\n\16\f\16\16\16\u00a3\13\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\7\17\u00ad\n\17\f\17\16\17\u00b0"+
		"\13\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\7\20\u00bd"+
		"\n\20\f\20\16\20\u00c0\13\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\7\21\u00d0\n\21\f\21\16\21\u00d3\13\21\3"+
		"\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\7\23\u00e4\n\23\f\23\16\23\u00e7\13\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\7\23\u00f2\n\23\f\23\16\23\u00f5\13\23\3\23\3\23\3"+
		"\24\3\24\3\25\3\25\3\25\7\25\u00fe\n\25\f\25\16\25\u0101\13\25\3\25\3"+
		"\25\3\25\5\25\u0106\n\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u010e\n\26"+
		"\f\26\16\26\u0111\13\26\3\26\3\26\3\26\3\26\3\26\5\26\u0118\n\26\3\26"+
		"\3\26\3\26\5\26\u011d\n\26\7\26\u011f\n\26\f\26\16\26\u0122\13\26\3\26"+
		"\3\26\3\26\3\27\5\27\u0128\n\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0130"+
		"\n\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\7\32\u0139\n\32\f\32\16\32\u013c"+
		"\13\32\3\33\3\33\3\33\7\33\u0141\n\33\f\33\16\33\u0144\13\33\3\34\3\34"+
		"\3\34\7\34\u0149\n\34\f\34\16\34\u014c\13\34\3\35\3\35\3\35\3\35\2\2\36"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668\2\6\3\2"+
		"\27\30\3\2\33 \3\2#%\4\2\"\"&\'\2\u0166\2:\3\2\2\2\4K\3\2\2\2\6T\3\2\2"+
		"\2\bW\3\2\2\2\n^\3\2\2\2\ff\3\2\2\2\16n\3\2\2\2\20z\3\2\2\2\22|\3\2\2"+
		"\2\24\u0089\3\2\2\2\26\u008e\3\2\2\2\30\u0097\3\2\2\2\32\u0099\3\2\2\2"+
		"\34\u00a7\3\2\2\2\36\u00b7\3\2\2\2 \u00c7\3\2\2\2\"\u00d6\3\2\2\2$\u00d8"+
		"\3\2\2\2&\u00f8\3\2\2\2(\u00fa\3\2\2\2*\u0109\3\2\2\2,\u012f\3\2\2\2."+
		"\u0131\3\2\2\2\60\u0133\3\2\2\2\62\u0135\3\2\2\2\64\u013d\3\2\2\2\66\u0145"+
		"\3\2\2\28\u014d\3\2\2\2:>\7\7\2\2;=\5\4\3\2<;\3\2\2\2=@\3\2\2\2><\3\2"+
		"\2\2>?\3\2\2\2?A\3\2\2\2@>\3\2\2\2AE\5\6\4\2BD\5\b\5\2CB\3\2\2\2DG\3\2"+
		"\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2HI\58\35\2IJ\7\b\2\2J\3\3"+
		"\2\2\2KL\7\3\2\2LM\7\31\2\2MN\7\32\2\2NO\7\27\2\2OP\7\25\2\2P\5\3\2\2"+
		"\2QS\5\26\f\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\7\3\2\2\2VT\3\2"+
		"\2\2WX\7\6\2\2XY\7\31\2\2YZ\7\21\2\2Z[\5\16\b\2[\\\7\22\2\2\\]\5\22\n"+
		"\2]\t\3\2\2\2^_\7\4\2\2_b\7\31\2\2`a\7\32\2\2ac\7\27\2\2b`\3\2\2\2bc\3"+
		"\2\2\2cd\3\2\2\2de\7\25\2\2e\13\3\2\2\2fg\7\5\2\2gj\7\31\2\2hi\7\32\2"+
		"\2ik\7\30\2\2jh\3\2\2\2jk\3\2\2\2kl\3\2\2\2lm\7\25\2\2m\r\3\2\2\2ns\5"+
		"\20\t\2op\7\26\2\2pr\5\20\t\2qo\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2"+
		"t\17\3\2\2\2us\3\2\2\2vw\7\4\2\2w{\7\31\2\2xy\7\5\2\2y{\7\31\2\2zv\3\2"+
		"\2\2zx\3\2\2\2{\21\3\2\2\2|}\7\7\2\2}\u0081\5\24\13\2~\u0080\5\30\r\2"+
		"\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2"+
		"\2\u0082\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\7\b\2\2\u0085\23"+
		"\3\2\2\2\u0086\u0088\5\26\f\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2"+
		"\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\25\3\2\2\2\u008b\u0089"+
		"\3\2\2\2\u008c\u008f\5\n\6\2\u008d\u008f\5\f\7\2\u008e\u008c\3\2\2\2\u008e"+
		"\u008d\3\2\2\2\u008f\27\3\2\2\2\u0090\u0098\5\32\16\2\u0091\u0098\5(\25"+
		"\2\u0092\u0098\5*\26\2\u0093\u0098\5\34\17\2\u0094\u0098\5\36\20\2\u0095"+
		"\u0098\5 \21\2\u0096\u0098\5$\23\2\u0097\u0090\3\2\2\2\u0097\u0091\3\2"+
		"\2\2\u0097\u0092\3\2\2\2\u0097\u0093\3\2\2\2\u0097\u0094\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098\31\3\2\2\2\u0099\u009a\7\t\2"+
		"\2\u009a\u009b\7\31\2\2\u009b\u009c\7\21\2\2\u009c\u00a1\5,\27\2\u009d"+
		"\u009e\7\26\2\2\u009e\u00a0\5,\27\2\u009f\u009d\3\2\2\2\u00a0\u00a3\3"+
		"\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a4\u00a5\7\22\2\2\u00a5\u00a6\7\25\2\2\u00a6\33\3\2"+
		"\2\2\u00a7\u00a8\7\17\2\2\u00a8\u00ae\7\7\2\2\u00a9\u00ad\5\32\16\2\u00aa"+
		"\u00ad\5(\25\2\u00ab\u00ad\5*\26\2\u00ac\u00a9\3\2\2\2\u00ac\u00aa\3\2"+
		"\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\7\b"+
		"\2\2\u00b2\u00b3\7\20\2\2\u00b3\u00b4\7\21\2\2\u00b4\u00b5\5\62\32\2\u00b5"+
		"\u00b6\7\22\2\2\u00b6\35\3\2\2\2\u00b7\u00b8\7\f\2\2\u00b8\u00be\7\7\2"+
		"\2\u00b9\u00bd\5\32\16\2\u00ba\u00bd\5(\25\2\u00bb\u00bd\5*\26\2\u00bc"+
		"\u00b9\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00c0\3\2"+
		"\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c1\u00c2\7\b\2\2\u00c2\u00c3\7\13\2\2\u00c3\u00c4\7"+
		"\21\2\2\u00c4\u00c5\5\62\32\2\u00c5\u00c6\7\22\2\2\u00c6\37\3\2\2\2\u00c7"+
		"\u00c8\7\13\2\2\u00c8\u00c9\7\21\2\2\u00c9\u00ca\5\62\32\2\u00ca\u00cb"+
		"\7\22\2\2\u00cb\u00d1\5\"\22\2\u00cc\u00d0\5\32\16\2\u00cd\u00d0\5(\25"+
		"\2\u00ce\u00d0\5*\26\2\u00cf\u00cc\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00ce"+
		"\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\u00d4\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d5\7\b\2\2\u00d5!\3\2\2\2"+
		"\u00d6\u00d7\7\7\2\2\u00d7#\3\2\2\2\u00d8\u00d9\7\r\2\2\u00d9\u00da\7"+
		"\21\2\2\u00da\u00db\5\62\32\2\u00db\u00dc\7\22\2\2\u00dc\u00e5\7\7\2\2"+
		"\u00dd\u00e4\5\32\16\2\u00de\u00e4\5(\25\2\u00df\u00e4\5*\26\2\u00e0\u00e4"+
		"\5\34\17\2\u00e1\u00e4\5 \21\2\u00e2\u00e4\5\36\20\2\u00e3\u00dd\3\2\2"+
		"\2\u00e3\u00de\3\2\2\2\u00e3\u00df\3\2\2\2\u00e3\u00e0\3\2\2\2\u00e3\u00e1"+
		"\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\7\b"+
		"\2\2\u00e9\u00ea\5&\24\2\u00ea\u00f3\7\7\2\2\u00eb\u00f2\5\32\16\2\u00ec"+
		"\u00f2\5(\25\2\u00ed\u00f2\5*\26\2\u00ee\u00f2\5\34\17\2\u00ef\u00f2\5"+
		" \21\2\u00f0\u00f2\5\36\20\2\u00f1\u00eb\3\2\2\2\u00f1\u00ec\3\2\2\2\u00f1"+
		"\u00ed\3\2\2\2\u00f1\u00ee\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f0\3\2"+
		"\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u00f6\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\7\b\2\2\u00f7%\3\2\2\2"+
		"\u00f8\u00f9\7\16\2\2\u00f9\'\3\2\2\2\u00fa\u00ff\7\31\2\2\u00fb\u00fc"+
		"\7\26\2\2\u00fc\u00fe\7\31\2\2\u00fd\u00fb\3\2\2\2\u00fe\u0101\3\2\2\2"+
		"\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u00ff"+
		"\3\2\2\2\u0102\u0105\7\32\2\2\u0103\u0106\5,\27\2\u0104\u0106\5\62\32"+
		"\2\u0105\u0103\3\2\2\2\u0105\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108"+
		"\7\25\2\2\u0108)\3\2\2\2\u0109\u010a\7\23\2\2\u010a\u010f\7\31\2\2\u010b"+
		"\u010c\7\26\2\2\u010c\u010e\7\31\2\2\u010d\u010b\3\2\2\2\u010e\u0111\3"+
		"\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0112\3\2\2\2\u0111"+
		"\u010f\3\2\2\2\u0112\u0113\7\24\2\2\u0113\u0114\7\32\2\2\u0114\u0117\7"+
		"\23\2\2\u0115\u0118\5,\27\2\u0116\u0118\5\62\32\2\u0117\u0115\3\2\2\2"+
		"\u0117\u0116\3\2\2\2\u0118\u0120\3\2\2\2\u0119\u011c\7\26\2\2\u011a\u011d"+
		"\5,\27\2\u011b\u011d\5\62\32\2\u011c\u011a\3\2\2\2\u011c\u011b\3\2\2\2"+
		"\u011d\u011f\3\2\2\2\u011e\u0119\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e"+
		"\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u0120\3\2\2\2\u0123"+
		"\u0124\7\24\2\2\u0124\u0125\7\25\2\2\u0125+\3\2\2\2\u0126\u0128\7!\2\2"+
		"\u0127\u0126\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a"+
		"\7\21\2\2\u012a\u012b\5\62\32\2\u012b\u012c\7\22\2\2\u012c\u0130\3\2\2"+
		"\2\u012d\u0130\5.\30\2\u012e\u0130\5\60\31\2\u012f\u0127\3\2\2\2\u012f"+
		"\u012d\3\2\2\2\u012f\u012e\3\2\2\2\u0130-\3\2\2\2\u0131\u0132\t\2\2\2"+
		"\u0132/\3\2\2\2\u0133\u0134\7\31\2\2\u0134\61\3\2\2\2\u0135\u013a\5\64"+
		"\33\2\u0136\u0137\t\3\2\2\u0137\u0139\5\64\33\2\u0138\u0136\3\2\2\2\u0139"+
		"\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\63\3\2\2"+
		"\2\u013c\u013a\3\2\2\2\u013d\u0142\5\66\34\2\u013e\u013f\t\4\2\2\u013f"+
		"\u0141\5\66\34\2\u0140\u013e\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3"+
		"\2\2\2\u0142\u0143\3\2\2\2\u0143\65\3\2\2\2\u0144\u0142\3\2\2\2\u0145"+
		"\u014a\5,\27\2\u0146\u0147\t\5\2\2\u0147\u0149\5,\27\2\u0148\u0146\3\2"+
		"\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b"+
		"\67\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u014e\7\n\2\2\u014e\u014f\5\22\n"+
		"\2\u014f9\3\2\2\2#>ETbjsz\u0081\u0089\u008e\u0097\u00a1\u00ac\u00ae\u00bc"+
		"\u00be\u00cf\u00d1\u00e3\u00e5\u00f1\u00f3\u00ff\u0105\u010f\u0117\u011c"+
		"\u0120\u0127\u012f\u013a\u0142\u014a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}