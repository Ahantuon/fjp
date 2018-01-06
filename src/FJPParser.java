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
		WHILE=9, LPAREN=10, RPAREN=11, SEMI=12, COMMA=13, INT_VALUE=14, BOOLEAN_VALUE=15, 
		ID=16, ASSIGN=17, GT=18, LT=19, LE=20, GE=21, EQUAL=22, NOT_EQUAL=23, 
		NEG=24, AND=25, OR=26, ADD=27, SUB=28, MUL=29, DIV=30, WS=31;
	public static final int
		RULE_program = 0, RULE_constant = 1, RULE_global = 2, RULE_procedure = 3, 
		RULE_int_var = 4, RULE_boolean_var = 5, RULE_argument = 6, RULE_body = 7, 
		RULE_statement = 8, RULE_call = 9, RULE_while_cycle = 10, RULE_assigment = 11, 
		RULE_var = 12, RULE_expression = 13, RULE_simpleExp = 14, RULE_term = 15, 
		RULE_main = 16;
	public static final String[] ruleNames = {
		"program", "constant", "global", "procedure", "int_var", "boolean_var", 
		"argument", "body", "statement", "call", "while_cycle", "assigment", "var", 
		"expression", "simpleExp", "term", "main"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'const'", "'int'", "'boolean'", "'procedure'", "'start'", "'end'", 
		"'call'", "'main'", "'while'", "'('", "')'", "';'", "','", null, null, 
		null, "':='", "'>'", "'<'", "'<='", "'>='", "'='", "'!='", "'!'", "'and'", 
		"'or'", "'+'", "'-'", "'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "CONST", "INT", "BOOLEAN", "PROCEDURE", "START", "END", "CALL", 
		"MAIN", "WHILE", "LPAREN", "RPAREN", "SEMI", "COMMA", "INT_VALUE", "BOOLEAN_VALUE", 
		"ID", "ASSIGN", "GT", "LT", "LE", "GE", "EQUAL", "NOT_EQUAL", "NEG", "AND", 
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
		public List<GlobalContext> global() {
			return getRuleContexts(GlobalContext.class);
		}
		public GlobalContext global(int i) {
			return getRuleContext(GlobalContext.class,i);
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
			setState(34);
			match(START);
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONST) {
				{
				{
				setState(35);
				constant();
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT || _la==BOOLEAN) {
				{
				{
				setState(41);
				global();
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PROCEDURE) {
				{
				{
				setState(47);
				procedure();
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
			main();
			setState(54);
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
			setState(56);
			match(CONST);
			setState(57);
			match(ID);
			setState(58);
			match(ASSIGN);
			setState(59);
			match(INT_VALUE);
			setState(60);
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

	public static class GlobalContext extends ParserRuleContext {
		public Int_varContext int_var() {
			return getRuleContext(Int_varContext.class,0);
		}
		public Boolean_varContext boolean_var() {
			return getRuleContext(Boolean_varContext.class,0);
		}
		public GlobalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).enterGlobal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).exitGlobal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FJPParserVisitor) return ((FJPParserVisitor<? extends T>)visitor).visitGlobal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalContext global() throws RecognitionException {
		GlobalContext _localctx = new GlobalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_global);
		try {
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				int_var();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
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

	public static class ProcedureContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(FJPParser.PROCEDURE, 0); }
		public TerminalNode ID() { return getToken(FJPParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(FJPParser.LPAREN, 0); }
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(FJPParser.RPAREN, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(FJPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FJPParser.COMMA, i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(PROCEDURE);
			setState(67);
			match(ID);
			setState(68);
			match(LPAREN);
			setState(69);
			argument();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(70);
				match(COMMA);
				setState(71);
				argument();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			match(RPAREN);
			setState(78);
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
			setState(80);
			match(INT);
			setState(81);
			match(ID);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(82);
				match(ASSIGN);
				setState(83);
				match(INT_VALUE);
				}
			}

			setState(86);
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
			setState(88);
			match(BOOLEAN);
			setState(89);
			match(ID);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(90);
				match(ASSIGN);
				setState(91);
				match(BOOLEAN_VALUE);
				}
			}

			setState(94);
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
		enterRule(_localctx, 12, RULE_argument);
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(INT);
				setState(97);
				match(ID);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(BOOLEAN);
				setState(99);
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
		enterRule(_localctx, 14, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(START);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CALL) | (1L << WHILE) | (1L << ID))) != 0)) {
				{
				{
				setState(103);
				statement();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
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

	public static class StatementContext extends ParserRuleContext {
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public While_cycleContext while_cycle() {
			return getRuleContext(While_cycleContext.class,0);
		}
		public AssigmentContext assigment() {
			return getRuleContext(AssigmentContext.class,0);
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
		enterRule(_localctx, 16, RULE_statement);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				call();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				while_cycle();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				assigment();
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
		enterRule(_localctx, 18, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(CALL);
			setState(117);
			match(ID);
			setState(118);
			match(LPAREN);
			setState(119);
			var();
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(120);
				match(COMMA);
				setState(121);
				var();
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
			match(RPAREN);
			setState(128);
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

	public static class While_cycleContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(FJPParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(FJPParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FJPParser.RPAREN, 0); }
		public TerminalNode START() { return getToken(FJPParser.START, 0); }
		public TerminalNode END() { return getToken(FJPParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public While_cycleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_cycle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).enterWhile_cycle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FJPParserListener) ((FJPParserListener)listener).exitWhile_cycle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FJPParserVisitor) return ((FJPParserVisitor<? extends T>)visitor).visitWhile_cycle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_cycleContext while_cycle() throws RecognitionException {
		While_cycleContext _localctx = new While_cycleContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_while_cycle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(WHILE);
			setState(131);
			match(LPAREN);
			setState(132);
			expression();
			setState(133);
			match(RPAREN);
			setState(134);
			match(START);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CALL) | (1L << WHILE) | (1L << ID))) != 0)) {
				{
				{
				setState(135);
				statement();
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
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
		enterRule(_localctx, 22, RULE_assigment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(ID);
			setState(144);
			match(ASSIGN);
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(145);
				var();
				}
				break;
			case 2:
				{
				setState(146);
				expression();
				}
				break;
			}
			setState(149);
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
		public TerminalNode INT_VALUE() { return getToken(FJPParser.INT_VALUE, 0); }
		public TerminalNode BOOLEAN_VALUE() { return getToken(FJPParser.BOOLEAN_VALUE, 0); }
		public TerminalNode ID() { return getToken(FJPParser.ID, 0); }
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
		enterRule(_localctx, 24, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_VALUE) | (1L << BOOLEAN_VALUE) | (1L << ID))) != 0)) ) {
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
		enterRule(_localctx, 26, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			simpleExp();
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << LE) | (1L << GE) | (1L << EQUAL) | (1L << NOT_EQUAL))) != 0)) {
				{
				{
				setState(154);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << LE) | (1L << GE) | (1L << EQUAL) | (1L << NOT_EQUAL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(155);
				simpleExp();
				}
				}
				setState(160);
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
		public List<TerminalNode> AND() { return getTokens(FJPParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(FJPParser.AND, i);
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
		enterRule(_localctx, 28, RULE_simpleExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			term();
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(162);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(163);
				term();
				}
				}
				setState(168);
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
		public List<TerminalNode> ADD() { return getTokens(FJPParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(FJPParser.ADD, i);
		}
		public List<TerminalNode> SUB() { return getTokens(FJPParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(FJPParser.SUB, i);
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
		enterRule(_localctx, 30, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			var();
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV))) != 0)) {
				{
				{
				setState(170);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(171);
				var();
				}
				}
				setState(176);
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
		enterRule(_localctx, 32, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(MAIN);
			setState(178);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u00b7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\7\2\'\n\2\f\2\16\2*\13\2\3\2\7\2-\n\2\f\2\16\2\60\13\2\3\2\7"+
		"\2\63\n\2\f\2\16\2\66\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\5\4C\n\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5K\n\5\f\5\16\5N\13\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\5\6W\n\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7_\n\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\5\bg\n\b\3\t\3\t\7\tk\n\t\f\t\16\tn\13\t\3\t\3\t\3\n\3\n"+
		"\3\n\5\nu\n\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13}\n\13\f\13\16\13\u0080"+
		"\13\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u008b\n\f\f\f\16\f\u008e"+
		"\13\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u0096\n\r\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\17\7\17\u009f\n\17\f\17\16\17\u00a2\13\17\3\20\3\20\3\20\7\20\u00a7"+
		"\n\20\f\20\16\20\u00aa\13\20\3\21\3\21\3\21\7\21\u00af\n\21\f\21\16\21"+
		"\u00b2\13\21\3\22\3\22\3\22\3\22\2\2\23\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"\2\6\3\2\20\22\3\2\24\31\3\2\33\34\3\2\35 \2\u00b6\2$\3\2"+
		"\2\2\4:\3\2\2\2\6B\3\2\2\2\bD\3\2\2\2\nR\3\2\2\2\fZ\3\2\2\2\16f\3\2\2"+
		"\2\20h\3\2\2\2\22t\3\2\2\2\24v\3\2\2\2\26\u0084\3\2\2\2\30\u0091\3\2\2"+
		"\2\32\u0099\3\2\2\2\34\u009b\3\2\2\2\36\u00a3\3\2\2\2 \u00ab\3\2\2\2\""+
		"\u00b3\3\2\2\2$(\7\7\2\2%\'\5\4\3\2&%\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3"+
		"\2\2\2).\3\2\2\2*(\3\2\2\2+-\5\6\4\2,+\3\2\2\2-\60\3\2\2\2.,\3\2\2\2."+
		"/\3\2\2\2/\64\3\2\2\2\60.\3\2\2\2\61\63\5\b\5\2\62\61\3\2\2\2\63\66\3"+
		"\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\67\3\2\2\2\66\64\3\2\2\2\678\5\""+
		"\22\289\7\b\2\29\3\3\2\2\2:;\7\3\2\2;<\7\22\2\2<=\7\23\2\2=>\7\20\2\2"+
		">?\7\16\2\2?\5\3\2\2\2@C\5\n\6\2AC\5\f\7\2B@\3\2\2\2BA\3\2\2\2C\7\3\2"+
		"\2\2DE\7\6\2\2EF\7\22\2\2FG\7\f\2\2GL\5\16\b\2HI\7\17\2\2IK\5\16\b\2J"+
		"H\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NL\3\2\2\2OP\7\r\2\2"+
		"PQ\5\20\t\2Q\t\3\2\2\2RS\7\4\2\2SV\7\22\2\2TU\7\23\2\2UW\7\20\2\2VT\3"+
		"\2\2\2VW\3\2\2\2WX\3\2\2\2XY\7\16\2\2Y\13\3\2\2\2Z[\7\5\2\2[^\7\22\2\2"+
		"\\]\7\23\2\2]_\7\21\2\2^\\\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a\7\16\2\2a\r\3"+
		"\2\2\2bc\7\4\2\2cg\7\22\2\2de\7\5\2\2eg\7\22\2\2fb\3\2\2\2fd\3\2\2\2g"+
		"\17\3\2\2\2hl\7\7\2\2ik\5\22\n\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2"+
		"\2mo\3\2\2\2nl\3\2\2\2op\7\b\2\2p\21\3\2\2\2qu\5\24\13\2ru\5\26\f\2su"+
		"\5\30\r\2tq\3\2\2\2tr\3\2\2\2ts\3\2\2\2u\23\3\2\2\2vw\7\t\2\2wx\7\22\2"+
		"\2xy\7\f\2\2y~\5\32\16\2z{\7\17\2\2{}\5\32\16\2|z\3\2\2\2}\u0080\3\2\2"+
		"\2~|\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0082"+
		"\7\r\2\2\u0082\u0083\7\16\2\2\u0083\25\3\2\2\2\u0084\u0085\7\13\2\2\u0085"+
		"\u0086\7\f\2\2\u0086\u0087\5\34\17\2\u0087\u0088\7\r\2\2\u0088\u008c\7"+
		"\7\2\2\u0089\u008b\5\22\n\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u008c\3\2"+
		"\2\2\u008f\u0090\7\b\2\2\u0090\27\3\2\2\2\u0091\u0092\7\22\2\2\u0092\u0095"+
		"\7\23\2\2\u0093\u0096\5\32\16\2\u0094\u0096\5\34\17\2\u0095\u0093\3\2"+
		"\2\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\7\16\2\2\u0098"+
		"\31\3\2\2\2\u0099\u009a\t\2\2\2\u009a\33\3\2\2\2\u009b\u00a0\5\36\20\2"+
		"\u009c\u009d\t\3\2\2\u009d\u009f\5\36\20\2\u009e\u009c\3\2\2\2\u009f\u00a2"+
		"\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\35\3\2\2\2\u00a2"+
		"\u00a0\3\2\2\2\u00a3\u00a8\5 \21\2\u00a4\u00a5\t\4\2\2\u00a5\u00a7\5 "+
		"\21\2\u00a6\u00a4\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\37\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00b0\5\32\16"+
		"\2\u00ac\u00ad\t\5\2\2\u00ad\u00af\5\32\16\2\u00ae\u00ac\3\2\2\2\u00af"+
		"\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1!\3\2\2\2"+
		"\u00b2\u00b0\3\2\2\2\u00b3\u00b4\7\n\2\2\u00b4\u00b5\5\20\t\2\u00b5#\3"+
		"\2\2\2\22(.\64BLV^flt~\u008c\u0095\u00a0\u00a8\u00b0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}