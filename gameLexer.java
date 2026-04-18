// Generated from game.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gameLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, MAN=2, HOUSE=3, CASTLE=4, MOV=5, LIMITS=6, X=7, Y=8, FLOAT=9, 
		INT=10, WS=11, COMMENT=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "MAN", "HOUSE", "CASTLE", "MOV", "LIMITS", "X", "Y", "FLOAT", 
			"INT", "DIGIT", "WS", "COMMENT"
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


	public gameLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "game.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16c\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\6\nA\n\n\r\n\16\nB\3\n\3\n\6\nG\n\n\r\n"+
		"\16\nH\3\13\6\13L\n\13\r\13\16\13M\3\f\3\f\3\r\6\rS\n\r\r\r\16\rT\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\7\16]\n\16\f\16\16\16`\13\16\3\16\3\16\2\2\17"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\2\31\r\33\16\3\2\5\3"+
		"\2\62;\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2f\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3\35\3\2\2\2\5"+
		"\37\3\2\2\2\7#\3\2\2\2\t)\3\2\2\2\13\60\3\2\2\2\r\64\3\2\2\2\17;\3\2\2"+
		"\2\21=\3\2\2\2\23@\3\2\2\2\25K\3\2\2\2\27O\3\2\2\2\31R\3\2\2\2\33X\3\2"+
		"\2\2\35\36\7.\2\2\36\4\3\2\2\2\37 \7O\2\2 !\7C\2\2!\"\7P\2\2\"\6\3\2\2"+
		"\2#$\7J\2\2$%\7Q\2\2%&\7W\2\2&\'\7U\2\2\'(\7G\2\2(\b\3\2\2\2)*\7E\2\2"+
		"*+\7C\2\2+,\7U\2\2,-\7V\2\2-.\7N\2\2./\7G\2\2/\n\3\2\2\2\60\61\7O\2\2"+
		"\61\62\7Q\2\2\62\63\7X\2\2\63\f\3\2\2\2\64\65\7N\2\2\65\66\7K\2\2\66\67"+
		"\7O\2\2\678\7K\2\289\7V\2\29:\7U\2\2:\16\3\2\2\2;<\7Z\2\2<\20\3\2\2\2"+
		"=>\7[\2\2>\22\3\2\2\2?A\5\27\f\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2"+
		"\2CD\3\2\2\2DF\7\60\2\2EG\5\27\f\2FE\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2"+
		"\2\2I\24\3\2\2\2JL\5\27\f\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\26"+
		"\3\2\2\2OP\t\2\2\2P\30\3\2\2\2QS\t\3\2\2RQ\3\2\2\2ST\3\2\2\2TR\3\2\2\2"+
		"TU\3\2\2\2UV\3\2\2\2VW\b\r\2\2W\32\3\2\2\2XY\7\61\2\2YZ\7\61\2\2Z^\3\2"+
		"\2\2[]\n\4\2\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_a\3\2\2\2`^\3"+
		"\2\2\2ab\b\16\2\2b\34\3\2\2\2\b\2BHMT^\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}