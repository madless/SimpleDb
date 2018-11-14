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
		EOL=1, COMMA=2, ANY=3, OPEN_BRACKET=4, CLOSE_BRACKET=5, FROM=6, SELECT=7, 
		WHERE=8, CREATE=9, INSERT=10, INTO=11, VALUES=12, TABLE=13, DROP=14, IF_EXISTS=15, 
		TYPE_TEXT=16, TYPE_INT=17, WHITESPACE=18, OPERATOR=19, LOGIC_OPERATOR=20, 
		VALUE=21, NAME=22, STRING=23, NUMBER=24, DIGIT=25, CHARACTER=26, LETTER=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
		"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "EOL", "COMMA", 
		"ANY", "OPEN_BRACKET", "CLOSE_BRACKET", "FROM", "SELECT", "WHERE", "CREATE", 
		"INSERT", "INTO", "VALUES", "TABLE", "DROP", "IF_EXISTS", "TYPE_TEXT", 
		"TYPE_INT", "WHITESPACE", "OPERATOR", "LOGIC_OPERATOR", "VALUE", "NAME", 
		"STRING", "NUMBER", "DIGIT", "CHARACTER", "LETTER"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "','", "'*'", "'('", "')'", null, null, null, null, null, 
		null, null, null, null, null, null, null, "' '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "EOL", "COMMA", "ANY", "OPEN_BRACKET", "CLOSE_BRACKET", "FROM", 
		"SELECT", "WHERE", "CREATE", "INSERT", "INTO", "VALUES", "TABLE", "DROP", 
		"IF_EXISTS", "TYPE_TEXT", "TYPE_INT", "WHITESPACE", "OPERATOR", "LOGIC_OPERATOR", 
		"VALUE", "NAME", "STRING", "NUMBER", "DIGIT", "CHARACTER", "LETTER"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u0131\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3"+
		"&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3"+
		")\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3"+
		"-\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u0105\n/\3\60\3\60\5\60\u0109\n"+
		"\60\3\61\3\61\7\61\u010d\n\61\f\61\16\61\u0110\13\61\3\62\3\62\7\62\u0114"+
		"\n\62\f\62\16\62\u0117\13\62\3\62\3\62\3\62\7\62\u011c\n\62\f\62\16\62"+
		"\u011f\13\62\3\62\5\62\u0122\n\62\3\63\6\63\u0125\n\63\r\63\16\63\u0126"+
		"\3\64\3\64\3\65\3\65\5\65\u012d\n\65\3\66\5\66\u0130\n\66\2\2\67\3\2\5"+
		"\2\7\2\t\2\13\2\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2"+
		"%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\39\4;\5=\6?\7A\bC\tE\nG\13I\fK\r"+
		"M\16O\17Q\20S\21U\22W\23Y\24[\25]\26_\27a\30c\31e\32g\33i\34k\35\3\2\36"+
		"\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2K"+
		"Kkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4"+
		"\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\"+
		"||\3\2\62;\4\2C\\c|\2\u011e\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W"+
		"\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2"+
		"\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\3m\3\2\2\2\5o\3\2\2\2"+
		"\7q\3\2\2\2\ts\3\2\2\2\13u\3\2\2\2\rw\3\2\2\2\17y\3\2\2\2\21{\3\2\2\2"+
		"\23}\3\2\2\2\25\177\3\2\2\2\27\u0081\3\2\2\2\31\u0083\3\2\2\2\33\u0085"+
		"\3\2\2\2\35\u0087\3\2\2\2\37\u0089\3\2\2\2!\u008b\3\2\2\2#\u008d\3\2\2"+
		"\2%\u008f\3\2\2\2\'\u0091\3\2\2\2)\u0093\3\2\2\2+\u0095\3\2\2\2-\u0097"+
		"\3\2\2\2/\u0099\3\2\2\2\61\u009b\3\2\2\2\63\u009d\3\2\2\2\65\u009f\3\2"+
		"\2\2\67\u00a1\3\2\2\29\u00a3\3\2\2\2;\u00a5\3\2\2\2=\u00a7\3\2\2\2?\u00a9"+
		"\3\2\2\2A\u00ab\3\2\2\2C\u00b0\3\2\2\2E\u00b7\3\2\2\2G\u00bd\3\2\2\2I"+
		"\u00c4\3\2\2\2K\u00cb\3\2\2\2M\u00d0\3\2\2\2O\u00d7\3\2\2\2Q\u00dd\3\2"+
		"\2\2S\u00e2\3\2\2\2U\u00ec\3\2\2\2W\u00f1\3\2\2\2Y\u00f5\3\2\2\2[\u00f9"+
		"\3\2\2\2]\u0104\3\2\2\2_\u0108\3\2\2\2a\u010a\3\2\2\2c\u0121\3\2\2\2e"+
		"\u0124\3\2\2\2g\u0128\3\2\2\2i\u012c\3\2\2\2k\u012f\3\2\2\2mn\t\2\2\2"+
		"n\4\3\2\2\2op\t\3\2\2p\6\3\2\2\2qr\t\4\2\2r\b\3\2\2\2st\t\5\2\2t\n\3\2"+
		"\2\2uv\t\6\2\2v\f\3\2\2\2wx\t\7\2\2x\16\3\2\2\2yz\t\b\2\2z\20\3\2\2\2"+
		"{|\t\t\2\2|\22\3\2\2\2}~\t\n\2\2~\24\3\2\2\2\177\u0080\t\13\2\2\u0080"+
		"\26\3\2\2\2\u0081\u0082\t\f\2\2\u0082\30\3\2\2\2\u0083\u0084\t\r\2\2\u0084"+
		"\32\3\2\2\2\u0085\u0086\t\16\2\2\u0086\34\3\2\2\2\u0087\u0088\t\17\2\2"+
		"\u0088\36\3\2\2\2\u0089\u008a\t\20\2\2\u008a \3\2\2\2\u008b\u008c\t\21"+
		"\2\2\u008c\"\3\2\2\2\u008d\u008e\t\22\2\2\u008e$\3\2\2\2\u008f\u0090\t"+
		"\23\2\2\u0090&\3\2\2\2\u0091\u0092\t\24\2\2\u0092(\3\2\2\2\u0093\u0094"+
		"\t\25\2\2\u0094*\3\2\2\2\u0095\u0096\t\26\2\2\u0096,\3\2\2\2\u0097\u0098"+
		"\t\27\2\2\u0098.\3\2\2\2\u0099\u009a\t\30\2\2\u009a\60\3\2\2\2\u009b\u009c"+
		"\t\31\2\2\u009c\62\3\2\2\2\u009d\u009e\t\32\2\2\u009e\64\3\2\2\2\u009f"+
		"\u00a0\t\33\2\2\u00a0\66\3\2\2\2\u00a1\u00a2\7=\2\2\u00a28\3\2\2\2\u00a3"+
		"\u00a4\7.\2\2\u00a4:\3\2\2\2\u00a5\u00a6\7,\2\2\u00a6<\3\2\2\2\u00a7\u00a8"+
		"\7*\2\2\u00a8>\3\2\2\2\u00a9\u00aa\7+\2\2\u00aa@\3\2\2\2\u00ab\u00ac\5"+
		"\r\7\2\u00ac\u00ad\5%\23\2\u00ad\u00ae\5\37\20\2\u00ae\u00af\5\33\16\2"+
		"\u00afB\3\2\2\2\u00b0\u00b1\5\'\24\2\u00b1\u00b2\5\13\6\2\u00b2\u00b3"+
		"\5\31\r\2\u00b3\u00b4\5\13\6\2\u00b4\u00b5\5\7\4\2\u00b5\u00b6\5)\25\2"+
		"\u00b6D\3\2\2\2\u00b7\u00b8\5/\30\2\u00b8\u00b9\5\21\t\2\u00b9\u00ba\5"+
		"\13\6\2\u00ba\u00bb\5%\23\2\u00bb\u00bc\5\13\6\2\u00bcF\3\2\2\2\u00bd"+
		"\u00be\5\7\4\2\u00be\u00bf\5%\23\2\u00bf\u00c0\5\13\6\2\u00c0\u00c1\5"+
		"\3\2\2\u00c1\u00c2\5)\25\2\u00c2\u00c3\5\13\6\2\u00c3H\3\2\2\2\u00c4\u00c5"+
		"\5\23\n\2\u00c5\u00c6\5\35\17\2\u00c6\u00c7\5\'\24\2\u00c7\u00c8\5\13"+
		"\6\2\u00c8\u00c9\5%\23\2\u00c9\u00ca\5)\25\2\u00caJ\3\2\2\2\u00cb\u00cc"+
		"\5\23\n\2\u00cc\u00cd\5\35\17\2\u00cd\u00ce\5)\25\2\u00ce\u00cf\5\37\20"+
		"\2\u00cfL\3\2\2\2\u00d0\u00d1\5-\27\2\u00d1\u00d2\5\3\2\2\u00d2\u00d3"+
		"\5\31\r\2\u00d3\u00d4\5+\26\2\u00d4\u00d5\5\13\6\2\u00d5\u00d6\5\'\24"+
		"\2\u00d6N\3\2\2\2\u00d7\u00d8\5)\25\2\u00d8\u00d9\5\3\2\2\u00d9\u00da"+
		"\5\5\3\2\u00da\u00db\5\31\r\2\u00db\u00dc\5\13\6\2\u00dcP\3\2\2\2\u00dd"+
		"\u00de\5\t\5\2\u00de\u00df\5%\23\2\u00df\u00e0\5\37\20\2\u00e0\u00e1\5"+
		"!\21\2\u00e1R\3\2\2\2\u00e2\u00e3\5\23\n\2\u00e3\u00e4\5\r\7\2\u00e4\u00e5"+
		"\7\"\2\2\u00e5\u00e6\5\13\6\2\u00e6\u00e7\5\61\31\2\u00e7\u00e8\5\23\n"+
		"\2\u00e8\u00e9\5\'\24\2\u00e9\u00ea\5)\25\2\u00ea\u00eb\5\'\24\2\u00eb"+
		"T\3\2\2\2\u00ec\u00ed\5)\25\2\u00ed\u00ee\5\13\6\2\u00ee\u00ef\5\61\31"+
		"\2\u00ef\u00f0\5)\25\2\u00f0V\3\2\2\2\u00f1\u00f2\5\23\n\2\u00f2\u00f3"+
		"\5\35\17\2\u00f3\u00f4\5)\25\2\u00f4X\3\2\2\2\u00f5\u00f6\7\"\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7\u00f8\b-\2\2\u00f8Z\3\2\2\2\u00f9\u00fa\4>@\2\u00fa"+
		"\\\3\2\2\2\u00fb\u00fc\7\"\2\2\u00fc\u00fd\7C\2\2\u00fd\u00fe\7P\2\2\u00fe"+
		"\u00ff\7F\2\2\u00ff\u0105\7\"\2\2\u0100\u0101\7\"\2\2\u0101\u0102\7Q\2"+
		"\2\u0102\u0103\7T\2\2\u0103\u0105\7\"\2\2\u0104\u00fb\3\2\2\2\u0104\u0100"+
		"\3\2\2\2\u0105^\3\2\2\2\u0106\u0109\5e\63\2\u0107\u0109\5c\62\2\u0108"+
		"\u0106\3\2\2\2\u0108\u0107\3\2\2\2\u0109`\3\2\2\2\u010a\u010e\5k\66\2"+
		"\u010b\u010d\5i\65\2\u010c\u010b\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c"+
		"\3\2\2\2\u010e\u010f\3\2\2\2\u010fb\3\2\2\2\u0110\u010e\3\2\2\2\u0111"+
		"\u0115\7$\2\2\u0112\u0114\5i\65\2\u0113\u0112\3\2\2\2\u0114\u0117\3\2"+
		"\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0118\3\2\2\2\u0117"+
		"\u0115\3\2\2\2\u0118\u0122\7$\2\2\u0119\u011d\7)\2\2\u011a\u011c\5i\65"+
		"\2\u011b\u011a\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e"+
		"\3\2\2\2\u011e\u0120\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0122\7)\2\2\u0121"+
		"\u0111\3\2\2\2\u0121\u0119\3\2\2\2\u0122d\3\2\2\2\u0123\u0125\t\34\2\2"+
		"\u0124\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127"+
		"\3\2\2\2\u0127f\3\2\2\2\u0128\u0129\t\34\2\2\u0129h\3\2\2\2\u012a\u012d"+
		"\5k\66\2\u012b\u012d\5g\64\2\u012c\u012a\3\2\2\2\u012c\u012b\3\2\2\2\u012d"+
		"j\3\2\2\2\u012e\u0130\t\35\2\2\u012f\u012e\3\2\2\2\u0130l\3\2\2\2\f\2"+
		"\u0104\u0108\u010e\u0115\u011d\u0121\u0126\u012c\u012f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}