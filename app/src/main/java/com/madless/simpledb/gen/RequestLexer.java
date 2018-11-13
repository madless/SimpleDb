// Generated from /Users/madless/IdeaProjects/ParserANTLR/src/main/RequestLexer.g4 by ANTLR 4.7
package com.madless.simpledb.gen;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RequestLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EOL=1, COMMA=2, ANY=3, FROM=4, SELECT=5, WHERE=6, WHITESPACE=7, OPERATOR=8, 
		VALUE=9, NAME=10, STRING=11, NUMBER=12, DIGIT=13, CHARACTER=14, LETTER=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
		"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "EOL", "COMMA", 
		"ANY", "FROM", "SELECT", "WHERE", "WHITESPACE", "OPERATOR", "VALUE", "NAME", 
		"STRING", "NUMBER", "DIGIT", "CHARACTER", "LETTER"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "','", "'*'", null, null, null, "' '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "EOL", "COMMA", "ANY", "FROM", "SELECT", "WHERE", "WHITESPACE", 
		"OPERATOR", "VALUE", "NAME", "STRING", "NUMBER", "DIGIT", "CHARACTER", 
		"LETTER"
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


	public RequestLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RequestLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\u00d8\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3"+
		"#\3#\3#\3#\3#\5#\u00ac\n#\3$\3$\5$\u00b0\n$\3%\3%\7%\u00b4\n%\f%\16%\u00b7"+
		"\13%\3&\3&\7&\u00bb\n&\f&\16&\u00be\13&\3&\3&\3&\7&\u00c3\n&\f&\16&\u00c6"+
		"\13&\3&\5&\u00c9\n&\3\'\6\'\u00cc\n\'\r\'\16\'\u00cd\3(\3(\3)\3)\5)\u00d4"+
		"\n)\3*\5*\u00d7\n*\2\2+\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21\2\23\2\25\2\27"+
		"\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\39\4"+
		";\5=\6?\7A\bC\tE\nG\13I\fK\rM\16O\17Q\20S\21\3\2\36\4\2CCcc\4\2DDdd\4"+
		"\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMm"+
		"m\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2"+
		"VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\3\2\62;\4\2C\\"+
		"c|\2\u00c6\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3U\3\2\2\2\5W\3\2\2\2\7Y\3\2\2"+
		"\2\t[\3\2\2\2\13]\3\2\2\2\r_\3\2\2\2\17a\3\2\2\2\21c\3\2\2\2\23e\3\2\2"+
		"\2\25g\3\2\2\2\27i\3\2\2\2\31k\3\2\2\2\33m\3\2\2\2\35o\3\2\2\2\37q\3\2"+
		"\2\2!s\3\2\2\2#u\3\2\2\2%w\3\2\2\2\'y\3\2\2\2){\3\2\2\2+}\3\2\2\2-\177"+
		"\3\2\2\2/\u0081\3\2\2\2\61\u0083\3\2\2\2\63\u0085\3\2\2\2\65\u0087\3\2"+
		"\2\2\67\u0089\3\2\2\29\u008b\3\2\2\2;\u008d\3\2\2\2=\u008f\3\2\2\2?\u0094"+
		"\3\2\2\2A\u009b\3\2\2\2C\u00a1\3\2\2\2E\u00ab\3\2\2\2G\u00af\3\2\2\2I"+
		"\u00b1\3\2\2\2K\u00c8\3\2\2\2M\u00cb\3\2\2\2O\u00cf\3\2\2\2Q\u00d3\3\2"+
		"\2\2S\u00d6\3\2\2\2UV\t\2\2\2V\4\3\2\2\2WX\t\3\2\2X\6\3\2\2\2YZ\t\4\2"+
		"\2Z\b\3\2\2\2[\\\t\5\2\2\\\n\3\2\2\2]^\t\6\2\2^\f\3\2\2\2_`\t\7\2\2`\16"+
		"\3\2\2\2ab\t\b\2\2b\20\3\2\2\2cd\t\t\2\2d\22\3\2\2\2ef\t\n\2\2f\24\3\2"+
		"\2\2gh\t\13\2\2h\26\3\2\2\2ij\t\f\2\2j\30\3\2\2\2kl\t\r\2\2l\32\3\2\2"+
		"\2mn\t\16\2\2n\34\3\2\2\2op\t\17\2\2p\36\3\2\2\2qr\t\20\2\2r \3\2\2\2"+
		"st\t\21\2\2t\"\3\2\2\2uv\t\22\2\2v$\3\2\2\2wx\t\23\2\2x&\3\2\2\2yz\t\24"+
		"\2\2z(\3\2\2\2{|\t\25\2\2|*\3\2\2\2}~\t\26\2\2~,\3\2\2\2\177\u0080\t\27"+
		"\2\2\u0080.\3\2\2\2\u0081\u0082\t\30\2\2\u0082\60\3\2\2\2\u0083\u0084"+
		"\t\31\2\2\u0084\62\3\2\2\2\u0085\u0086\t\32\2\2\u0086\64\3\2\2\2\u0087"+
		"\u0088\t\33\2\2\u0088\66\3\2\2\2\u0089\u008a\7=\2\2\u008a8\3\2\2\2\u008b"+
		"\u008c\7.\2\2\u008c:\3\2\2\2\u008d\u008e\7,\2\2\u008e<\3\2\2\2\u008f\u0090"+
		"\5\r\7\2\u0090\u0091\5%\23\2\u0091\u0092\5\37\20\2\u0092\u0093\5\33\16"+
		"\2\u0093>\3\2\2\2\u0094\u0095\5\'\24\2\u0095\u0096\5\13\6\2\u0096\u0097"+
		"\5\31\r\2\u0097\u0098\5\13\6\2\u0098\u0099\5\7\4\2\u0099\u009a\5)\25\2"+
		"\u009a@\3\2\2\2\u009b\u009c\5/\30\2\u009c\u009d\5\21\t\2\u009d\u009e\5"+
		"\13\6\2\u009e\u009f\5%\23\2\u009f\u00a0\5\13\6\2\u00a0B\3\2\2\2\u00a1"+
		"\u00a2\7\"\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\b\"\2\2\u00a4D\3\2\2\2"+
		"\u00a5\u00ac\4>@\2\u00a6\u00a7\7C\2\2\u00a7\u00a8\7P\2\2\u00a8\u00ac\7"+
		"F\2\2\u00a9\u00aa\7Q\2\2\u00aa\u00ac\7T\2\2\u00ab\u00a5\3\2\2\2\u00ab"+
		"\u00a6\3\2\2\2\u00ab\u00a9\3\2\2\2\u00acF\3\2\2\2\u00ad\u00b0\5M\'\2\u00ae"+
		"\u00b0\5K&\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0H\3\2\2\2\u00b1"+
		"\u00b5\5S*\2\u00b2\u00b4\5Q)\2\u00b3\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2"+
		"\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6J\3\2\2\2\u00b7\u00b5\3"+
		"\2\2\2\u00b8\u00bc\7$\2\2\u00b9\u00bb\5Q)\2\u00ba\u00b9\3\2\2\2\u00bb"+
		"\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf\3\2"+
		"\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c9\7$\2\2\u00c0\u00c4\7)\2\2\u00c1\u00c3"+
		"\5Q)\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c9\7)"+
		"\2\2\u00c8\u00b8\3\2\2\2\u00c8\u00c0\3\2\2\2\u00c9L\3\2\2\2\u00ca\u00cc"+
		"\t\34\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cb\3\2\2\2"+
		"\u00cd\u00ce\3\2\2\2\u00ceN\3\2\2\2\u00cf\u00d0\t\34\2\2\u00d0P\3\2\2"+
		"\2\u00d1\u00d4\5S*\2\u00d2\u00d4\5O(\2\u00d3\u00d1\3\2\2\2\u00d3\u00d2"+
		"\3\2\2\2\u00d4R\3\2\2\2\u00d5\u00d7\t\35\2\2\u00d6\u00d5\3\2\2\2\u00d7"+
		"T\3\2\2\2\f\2\u00ab\u00af\u00b5\u00bc\u00c4\u00c8\u00cd\u00d3\u00d6\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}