// Generated from game.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gameParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, MAN=2, HOUSE=3, CASTLE=4, MOV=5, LIMITS=6, X=7, Y=8, FLOAT=9, 
		INT=10, WS=11, COMMENT=12;
	public static final int
		RULE_program = 0, RULE_line = 1, RULE_create = 2, RULE_move = 3, RULE_limits = 4, 
		RULE_eixo = 5, RULE_value = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "line", "create", "move", "limits", "eixo", "value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'MAN'", "'HOUSE'", "'CASTLE'", "'MOV'", "'LIMITS'", "'X'", 
			"'Y'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "MAN", "HOUSE", "CASTLE", "MOV", "LIMITS", "X", "Y", "FLOAT", 
			"INT", "WS", "COMMENT"
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
	public String getGrammarFileName() { return "game.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gameParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(gameParser.EOF, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gameListener ) ((gameListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gameListener ) ((gameListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gameVisitor ) return ((gameVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAN) | (1L << HOUSE) | (1L << CASTLE) | (1L << MOV) | (1L << LIMITS))) != 0)) {
				{
				{
				setState(14);
				line();
				}
				}
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(20);
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

	public static class LineContext extends ParserRuleContext {
		public CreateContext create() {
			return getRuleContext(CreateContext.class,0);
		}
		public MoveContext move() {
			return getRuleContext(MoveContext.class,0);
		}
		public LimitsContext limits() {
			return getRuleContext(LimitsContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gameListener ) ((gameListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gameListener ) ((gameListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gameVisitor ) return ((gameVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			setState(25);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAN:
			case HOUSE:
			case CASTLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				create();
				}
				break;
			case MOV:
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				move();
				}
				break;
			case LIMITS:
				enterOuterAlt(_localctx, 3);
				{
				setState(24);
				limits();
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

	public static class CreateContext extends ParserRuleContext {
		public TerminalNode MAN() { return getToken(gameParser.MAN, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode HOUSE() { return getToken(gameParser.HOUSE, 0); }
		public TerminalNode CASTLE() { return getToken(gameParser.CASTLE, 0); }
		public CreateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gameListener ) ((gameListener)listener).enterCreate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gameListener ) ((gameListener)listener).exitCreate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gameVisitor ) return ((gameVisitor<? extends T>)visitor).visitCreate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateContext create() throws RecognitionException {
		CreateContext _localctx = new CreateContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_create);
		try {
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				match(MAN);
				setState(28);
				value();
				setState(29);
				match(T__0);
				setState(30);
				value();
				}
				break;
			case HOUSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				match(HOUSE);
				setState(33);
				value();
				setState(34);
				match(T__0);
				setState(35);
				value();
				}
				break;
			case CASTLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				match(CASTLE);
				setState(38);
				value();
				setState(39);
				match(T__0);
				setState(40);
				value();
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

	public static class MoveContext extends ParserRuleContext {
		public TerminalNode MOV() { return getToken(gameParser.MOV, 0); }
		public TerminalNode INT() { return getToken(gameParser.INT, 0); }
		public EixoContext eixo() {
			return getRuleContext(EixoContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public MoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gameListener ) ((gameListener)listener).enterMove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gameListener ) ((gameListener)listener).exitMove(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gameVisitor ) return ((gameVisitor<? extends T>)visitor).visitMove(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoveContext move() throws RecognitionException {
		MoveContext _localctx = new MoveContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_move);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(MOV);
			setState(45);
			match(INT);
			setState(46);
			match(T__0);
			setState(47);
			eixo();
			setState(48);
			match(T__0);
			setState(49);
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

	public static class LimitsContext extends ParserRuleContext {
		public TerminalNode LIMITS() { return getToken(gameParser.LIMITS, 0); }
		public TerminalNode INT() { return getToken(gameParser.INT, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public LimitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limits; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gameListener ) ((gameListener)listener).enterLimits(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gameListener ) ((gameListener)listener).exitLimits(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gameVisitor ) return ((gameVisitor<? extends T>)visitor).visitLimits(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitsContext limits() throws RecognitionException {
		LimitsContext _localctx = new LimitsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_limits);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(LIMITS);
			setState(52);
			match(INT);
			setState(53);
			match(T__0);
			setState(54);
			value();
			setState(55);
			match(T__0);
			setState(56);
			value();
			setState(57);
			match(T__0);
			setState(58);
			value();
			setState(59);
			match(T__0);
			setState(60);
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

	public static class EixoContext extends ParserRuleContext {
		public TerminalNode X() { return getToken(gameParser.X, 0); }
		public TerminalNode Y() { return getToken(gameParser.Y, 0); }
		public EixoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eixo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gameListener ) ((gameListener)listener).enterEixo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gameListener ) ((gameListener)listener).exitEixo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gameVisitor ) return ((gameVisitor<? extends T>)visitor).visitEixo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EixoContext eixo() throws RecognitionException {
		EixoContext _localctx = new EixoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_eixo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_la = _input.LA(1);
			if ( !(_la==X || _la==Y) ) {
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(gameParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(gameParser.FLOAT, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gameListener ) ((gameListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gameListener ) ((gameListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gameVisitor ) return ((gameVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_la = _input.LA(1);
			if ( !(_la==FLOAT || _la==INT) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16E\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\7\2\22\n\2\f\2\16\2\25"+
		"\13\2\3\2\3\2\3\3\3\3\3\3\5\3\34\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4-\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\2\2\t\2\4\6"+
		"\b\n\f\16\2\4\3\2\t\n\3\2\13\f\2B\2\23\3\2\2\2\4\33\3\2\2\2\6,\3\2\2\2"+
		"\b.\3\2\2\2\n\65\3\2\2\2\f@\3\2\2\2\16B\3\2\2\2\20\22\5\4\3\2\21\20\3"+
		"\2\2\2\22\25\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\26\3\2\2\2\25\23\3"+
		"\2\2\2\26\27\7\2\2\3\27\3\3\2\2\2\30\34\5\6\4\2\31\34\5\b\5\2\32\34\5"+
		"\n\6\2\33\30\3\2\2\2\33\31\3\2\2\2\33\32\3\2\2\2\34\5\3\2\2\2\35\36\7"+
		"\4\2\2\36\37\5\16\b\2\37 \7\3\2\2 !\5\16\b\2!-\3\2\2\2\"#\7\5\2\2#$\5"+
		"\16\b\2$%\7\3\2\2%&\5\16\b\2&-\3\2\2\2\'(\7\6\2\2()\5\16\b\2)*\7\3\2\2"+
		"*+\5\16\b\2+-\3\2\2\2,\35\3\2\2\2,\"\3\2\2\2,\'\3\2\2\2-\7\3\2\2\2./\7"+
		"\7\2\2/\60\7\f\2\2\60\61\7\3\2\2\61\62\5\f\7\2\62\63\7\3\2\2\63\64\5\16"+
		"\b\2\64\t\3\2\2\2\65\66\7\b\2\2\66\67\7\f\2\2\678\7\3\2\289\5\16\b\29"+
		":\7\3\2\2:;\5\16\b\2;<\7\3\2\2<=\5\16\b\2=>\7\3\2\2>?\5\16\b\2?\13\3\2"+
		"\2\2@A\t\2\2\2A\r\3\2\2\2BC\t\3\2\2C\17\3\2\2\2\5\23\33,";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}