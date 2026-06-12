// Generated from Hash.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HashLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BASTE=1, BIAR=2, KLASS=3, IN=4, JADID=5, BEBIN=6, BEDE=7, ADAD=8, ASHARI=9, 
		BOOLE=10, MATN=11, HARF=12, HICH=13, KHALI=14, DOROST=15, GHALAT=16, AGE=17, 
		BOOD=18, VAGARNA=19, TA=20, BARAYE=21, SHEKAN=22, EDAME=23, ENTEKHAB=24, 
		HALAT=25, DIGAR=26, EMTEHAN=27, GEREFTAR=28, AKHAR=29, BENDAZ=30, BECHAP=31, 
		BEKHAN=32, SEFR_BOOD=33, MAHDOODE_NADOROST=34, JADVAL_KHALI=35, GHEIRE_MOJAZ=36, 
		PLUS_ASSIGN=37, MINUS_ASSIGN=38, MUL_ASSIGN=39, DIV_ASSIGN=40, PLUS_PLUS=41, 
		MINUS_MINUS=42, POWER=43, EQ=44, NEQ=45, GTE=46, LTE=47, AND=48, OR=49, 
		ASSIGN=50, GT=51, LT=52, NOT=53, PLUS=54, MINUS=55, STAR=56, DIV=57, MOD=58, 
		LPAREN=59, RPAREN=60, LBRACE=61, RBRACE=62, SEMI=63, COMMA=64, DOT=65, 
		FLOAT=66, INT=67, STRING=68, CHAR=69, CLASS_ID=70, ID=71, LINE_COMMENT=72, 
		BLOCK_COMMENT=73, WS=74;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BASTE", "BIAR", "KLASS", "IN", "JADID", "BEBIN", "BEDE", "ADAD", "ASHARI", 
			"BOOLE", "MATN", "HARF", "HICH", "KHALI", "DOROST", "GHALAT", "AGE", 
			"BOOD", "VAGARNA", "TA", "BARAYE", "SHEKAN", "EDAME", "ENTEKHAB", "HALAT", 
			"DIGAR", "EMTEHAN", "GEREFTAR", "AKHAR", "BENDAZ", "BECHAP", "BEKHAN", 
			"SEFR_BOOD", "MAHDOODE_NADOROST", "JADVAL_KHALI", "GHEIRE_MOJAZ", "PLUS_ASSIGN", 
			"MINUS_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "PLUS_PLUS", "MINUS_MINUS", 
			"POWER", "EQ", "NEQ", "GTE", "LTE", "AND", "OR", "ASSIGN", "GT", "LT", 
			"NOT", "PLUS", "MINUS", "STAR", "DIV", "MOD", "LPAREN", "RPAREN", "LBRACE", 
			"RBRACE", "SEMI", "COMMA", "DOT", "FLOAT", "INT", "STRING", "CHAR", "CLASS_ID", 
			"ID", "LINE_COMMENT", "BLOCK_COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'baste'", "'biar'", "'klass'", "'in'", "'jadid'", "'bebin'", "'bede'", 
			"'adad'", "'ashari'", "'boole'", "'matn'", "'harf'", "'hich'", "'khali'", 
			"'dorost'", "'ghalat'", "'age'", "'bood'", "'vagarna'", "'ta'", "'baraye'", 
			"'shekan'", "'edame'", "'entekhab'", "'halat'", "'digar'", "'emtehan'", 
			"'gereftar'", "'akhar'", "'bendaz'", "'bechap'", "'bekhan'", "'SefrBood'", 
			"'MahdoodeNadorost'", "'JadvalKhali'", "'GheireMojaz'", "'+='", "'-='", 
			"'*='", "'/='", "'++'", "'--'", "'**'", "'=='", "'!='", "'>='", "'<='", 
			"'&&'", "'||'", "'='", "'>'", "'<'", "'!'", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'('", "')'", "'{'", "'}'", "';'", "','", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BASTE", "BIAR", "KLASS", "IN", "JADID", "BEBIN", "BEDE", "ADAD", 
			"ASHARI", "BOOLE", "MATN", "HARF", "HICH", "KHALI", "DOROST", "GHALAT", 
			"AGE", "BOOD", "VAGARNA", "TA", "BARAYE", "SHEKAN", "EDAME", "ENTEKHAB", 
			"HALAT", "DIGAR", "EMTEHAN", "GEREFTAR", "AKHAR", "BENDAZ", "BECHAP", 
			"BEKHAN", "SEFR_BOOD", "MAHDOODE_NADOROST", "JADVAL_KHALI", "GHEIRE_MOJAZ", 
			"PLUS_ASSIGN", "MINUS_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "PLUS_PLUS", 
			"MINUS_MINUS", "POWER", "EQ", "NEQ", "GTE", "LTE", "AND", "OR", "ASSIGN", 
			"GT", "LT", "NOT", "PLUS", "MINUS", "STAR", "DIV", "MOD", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "SEMI", "COMMA", "DOT", "FLOAT", "INT", "STRING", 
			"CHAR", "CLASS_ID", "ID", "LINE_COMMENT", "BLOCK_COMMENT", "WS"
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


	public HashLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Hash.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2L\u0224\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3"+
		"+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61"+
		"\3\62\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\3"+
		"8\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\6C\u01d5"+
		"\nC\rC\16C\u01d6\3C\3C\6C\u01db\nC\rC\16C\u01dc\3D\6D\u01e0\nD\rD\16D"+
		"\u01e1\3E\3E\3E\3E\7E\u01e8\nE\fE\16E\u01eb\13E\3E\3E\3F\3F\3F\3F\5F\u01f3"+
		"\nF\3F\3F\3G\3G\7G\u01f9\nG\fG\16G\u01fc\13G\3H\3H\7H\u0200\nH\fH\16H"+
		"\u0203\13H\3I\3I\3I\3I\7I\u0209\nI\fI\16I\u020c\13I\3I\3I\3J\3J\3J\3J"+
		"\7J\u0214\nJ\fJ\16J\u0217\13J\3J\3J\3J\3J\3J\3K\6K\u021f\nK\rK\16K\u0220"+
		"\3K\3K\3\u0215\2L\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089"+
		"F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\3\2\n\3\2\62;\4\2$$^^\4\2"+
		"))^^\3\2C\\\6\2\62;C\\aac|\3\2c|\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u022e"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2"+
		"{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\3\u0097"+
		"\3\2\2\2\5\u009d\3\2\2\2\7\u00a2\3\2\2\2\t\u00a8\3\2\2\2\13\u00ab\3\2"+
		"\2\2\r\u00b1\3\2\2\2\17\u00b7\3\2\2\2\21\u00bc\3\2\2\2\23\u00c1\3\2\2"+
		"\2\25\u00c8\3\2\2\2\27\u00ce\3\2\2\2\31\u00d3\3\2\2\2\33\u00d8\3\2\2\2"+
		"\35\u00dd\3\2\2\2\37\u00e3\3\2\2\2!\u00ea\3\2\2\2#\u00f1\3\2\2\2%\u00f5"+
		"\3\2\2\2\'\u00fa\3\2\2\2)\u0102\3\2\2\2+\u0105\3\2\2\2-\u010c\3\2\2\2"+
		"/\u0113\3\2\2\2\61\u0119\3\2\2\2\63\u0122\3\2\2\2\65\u0128\3\2\2\2\67"+
		"\u012e\3\2\2\29\u0136\3\2\2\2;\u013f\3\2\2\2=\u0145\3\2\2\2?\u014c\3\2"+
		"\2\2A\u0153\3\2\2\2C\u015a\3\2\2\2E\u0163\3\2\2\2G\u0174\3\2\2\2I\u0180"+
		"\3\2\2\2K\u018c\3\2\2\2M\u018f\3\2\2\2O\u0192\3\2\2\2Q\u0195\3\2\2\2S"+
		"\u0198\3\2\2\2U\u019b\3\2\2\2W\u019e\3\2\2\2Y\u01a1\3\2\2\2[\u01a4\3\2"+
		"\2\2]\u01a7\3\2\2\2_\u01aa\3\2\2\2a\u01ad\3\2\2\2c\u01b0\3\2\2\2e\u01b3"+
		"\3\2\2\2g\u01b5\3\2\2\2i\u01b7\3\2\2\2k\u01b9\3\2\2\2m\u01bb\3\2\2\2o"+
		"\u01bd\3\2\2\2q\u01bf\3\2\2\2s\u01c1\3\2\2\2u\u01c3\3\2\2\2w\u01c5\3\2"+
		"\2\2y\u01c7\3\2\2\2{\u01c9\3\2\2\2}\u01cb\3\2\2\2\177\u01cd\3\2\2\2\u0081"+
		"\u01cf\3\2\2\2\u0083\u01d1\3\2\2\2\u0085\u01d4\3\2\2\2\u0087\u01df\3\2"+
		"\2\2\u0089\u01e3\3\2\2\2\u008b\u01ee\3\2\2\2\u008d\u01f6\3\2\2\2\u008f"+
		"\u01fd\3\2\2\2\u0091\u0204\3\2\2\2\u0093\u020f\3\2\2\2\u0095\u021e\3\2"+
		"\2\2\u0097\u0098\7d\2\2\u0098\u0099\7c\2\2\u0099\u009a\7u\2\2\u009a\u009b"+
		"\7v\2\2\u009b\u009c\7g\2\2\u009c\4\3\2\2\2\u009d\u009e\7d\2\2\u009e\u009f"+
		"\7k\2\2\u009f\u00a0\7c\2\2\u00a0\u00a1\7t\2\2\u00a1\6\3\2\2\2\u00a2\u00a3"+
		"\7m\2\2\u00a3\u00a4\7n\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7u\2\2\u00a6"+
		"\u00a7\7u\2\2\u00a7\b\3\2\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7p\2\2\u00aa"+
		"\n\3\2\2\2\u00ab\u00ac\7l\2\2\u00ac\u00ad\7c\2\2\u00ad\u00ae\7f\2\2\u00ae"+
		"\u00af\7k\2\2\u00af\u00b0\7f\2\2\u00b0\f\3\2\2\2\u00b1\u00b2\7d\2\2\u00b2"+
		"\u00b3\7g\2\2\u00b3\u00b4\7d\2\2\u00b4\u00b5\7k\2\2\u00b5\u00b6\7p\2\2"+
		"\u00b6\16\3\2\2\2\u00b7\u00b8\7d\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7"+
		"f\2\2\u00ba\u00bb\7g\2\2\u00bb\20\3\2\2\2\u00bc\u00bd\7c\2\2\u00bd\u00be"+
		"\7f\2\2\u00be\u00bf\7c\2\2\u00bf\u00c0\7f\2\2\u00c0\22\3\2\2\2\u00c1\u00c2"+
		"\7c\2\2\u00c2\u00c3\7u\2\2\u00c3\u00c4\7j\2\2\u00c4\u00c5\7c\2\2\u00c5"+
		"\u00c6\7t\2\2\u00c6\u00c7\7k\2\2\u00c7\24\3\2\2\2\u00c8\u00c9\7d\2\2\u00c9"+
		"\u00ca\7q\2\2\u00ca\u00cb\7q\2\2\u00cb\u00cc\7n\2\2\u00cc\u00cd\7g\2\2"+
		"\u00cd\26\3\2\2\2\u00ce\u00cf\7o\2\2\u00cf\u00d0\7c\2\2\u00d0\u00d1\7"+
		"v\2\2\u00d1\u00d2\7p\2\2\u00d2\30\3\2\2\2\u00d3\u00d4\7j\2\2\u00d4\u00d5"+
		"\7c\2\2\u00d5\u00d6\7t\2\2\u00d6\u00d7\7h\2\2\u00d7\32\3\2\2\2\u00d8\u00d9"+
		"\7j\2\2\u00d9\u00da\7k\2\2\u00da\u00db\7e\2\2\u00db\u00dc\7j\2\2\u00dc"+
		"\34\3\2\2\2\u00dd\u00de\7m\2\2\u00de\u00df\7j\2\2\u00df\u00e0\7c\2\2\u00e0"+
		"\u00e1\7n\2\2\u00e1\u00e2\7k\2\2\u00e2\36\3\2\2\2\u00e3\u00e4\7f\2\2\u00e4"+
		"\u00e5\7q\2\2\u00e5\u00e6\7t\2\2\u00e6\u00e7\7q\2\2\u00e7\u00e8\7u\2\2"+
		"\u00e8\u00e9\7v\2\2\u00e9 \3\2\2\2\u00ea\u00eb\7i\2\2\u00eb\u00ec\7j\2"+
		"\2\u00ec\u00ed\7c\2\2\u00ed\u00ee\7n\2\2\u00ee\u00ef\7c\2\2\u00ef\u00f0"+
		"\7v\2\2\u00f0\"\3\2\2\2\u00f1\u00f2\7c\2\2\u00f2\u00f3\7i\2\2\u00f3\u00f4"+
		"\7g\2\2\u00f4$\3\2\2\2\u00f5\u00f6\7d\2\2\u00f6\u00f7\7q\2\2\u00f7\u00f8"+
		"\7q\2\2\u00f8\u00f9\7f\2\2\u00f9&\3\2\2\2\u00fa\u00fb\7x\2\2\u00fb\u00fc"+
		"\7c\2\2\u00fc\u00fd\7i\2\2\u00fd\u00fe\7c\2\2\u00fe\u00ff\7t\2\2\u00ff"+
		"\u0100\7p\2\2\u0100\u0101\7c\2\2\u0101(\3\2\2\2\u0102\u0103\7v\2\2\u0103"+
		"\u0104\7c\2\2\u0104*\3\2\2\2\u0105\u0106\7d\2\2\u0106\u0107\7c\2\2\u0107"+
		"\u0108\7t\2\2\u0108\u0109\7c\2\2\u0109\u010a\7{\2\2\u010a\u010b\7g\2\2"+
		"\u010b,\3\2\2\2\u010c\u010d\7u\2\2\u010d\u010e\7j\2\2\u010e\u010f\7g\2"+
		"\2\u010f\u0110\7m\2\2\u0110\u0111\7c\2\2\u0111\u0112\7p\2\2\u0112.\3\2"+
		"\2\2\u0113\u0114\7g\2\2\u0114\u0115\7f\2\2\u0115\u0116\7c\2\2\u0116\u0117"+
		"\7o\2\2\u0117\u0118\7g\2\2\u0118\60\3\2\2\2\u0119\u011a\7g\2\2\u011a\u011b"+
		"\7p\2\2\u011b\u011c\7v\2\2\u011c\u011d\7g\2\2\u011d\u011e\7m\2\2\u011e"+
		"\u011f\7j\2\2\u011f\u0120\7c\2\2\u0120\u0121\7d\2\2\u0121\62\3\2\2\2\u0122"+
		"\u0123\7j\2\2\u0123\u0124\7c\2\2\u0124\u0125\7n\2\2\u0125\u0126\7c\2\2"+
		"\u0126\u0127\7v\2\2\u0127\64\3\2\2\2\u0128\u0129\7f\2\2\u0129\u012a\7"+
		"k\2\2\u012a\u012b\7i\2\2\u012b\u012c\7c\2\2\u012c\u012d\7t\2\2\u012d\66"+
		"\3\2\2\2\u012e\u012f\7g\2\2\u012f\u0130\7o\2\2\u0130\u0131\7v\2\2\u0131"+
		"\u0132\7g\2\2\u0132\u0133\7j\2\2\u0133\u0134\7c\2\2\u0134\u0135\7p\2\2"+
		"\u01358\3\2\2\2\u0136\u0137\7i\2\2\u0137\u0138\7g\2\2\u0138\u0139\7t\2"+
		"\2\u0139\u013a\7g\2\2\u013a\u013b\7h\2\2\u013b\u013c\7v\2\2\u013c\u013d"+
		"\7c\2\2\u013d\u013e\7t\2\2\u013e:\3\2\2\2\u013f\u0140\7c\2\2\u0140\u0141"+
		"\7m\2\2\u0141\u0142\7j\2\2\u0142\u0143\7c\2\2\u0143\u0144\7t\2\2\u0144"+
		"<\3\2\2\2\u0145\u0146\7d\2\2\u0146\u0147\7g\2\2\u0147\u0148\7p\2\2\u0148"+
		"\u0149\7f\2\2\u0149\u014a\7c\2\2\u014a\u014b\7|\2\2\u014b>\3\2\2\2\u014c"+
		"\u014d\7d\2\2\u014d\u014e\7g\2\2\u014e\u014f\7e\2\2\u014f\u0150\7j\2\2"+
		"\u0150\u0151\7c\2\2\u0151\u0152\7r\2\2\u0152@\3\2\2\2\u0153\u0154\7d\2"+
		"\2\u0154\u0155\7g\2\2\u0155\u0156\7m\2\2\u0156\u0157\7j\2\2\u0157\u0158"+
		"\7c\2\2\u0158\u0159\7p\2\2\u0159B\3\2\2\2\u015a\u015b\7U\2\2\u015b\u015c"+
		"\7g\2\2\u015c\u015d\7h\2\2\u015d\u015e\7t\2\2\u015e\u015f\7D\2\2\u015f"+
		"\u0160\7q\2\2\u0160\u0161\7q\2\2\u0161\u0162\7f\2\2\u0162D\3\2\2\2\u0163"+
		"\u0164\7O\2\2\u0164\u0165\7c\2\2\u0165\u0166\7j\2\2\u0166\u0167\7f\2\2"+
		"\u0167\u0168\7q\2\2\u0168\u0169\7q\2\2\u0169\u016a\7f\2\2\u016a\u016b"+
		"\7g\2\2\u016b\u016c\7P\2\2\u016c\u016d\7c\2\2\u016d\u016e\7f\2\2\u016e"+
		"\u016f\7q\2\2\u016f\u0170\7t\2\2\u0170\u0171\7q\2\2\u0171\u0172\7u\2\2"+
		"\u0172\u0173\7v\2\2\u0173F\3\2\2\2\u0174\u0175\7L\2\2\u0175\u0176\7c\2"+
		"\2\u0176\u0177\7f\2\2\u0177\u0178\7x\2\2\u0178\u0179\7c\2\2\u0179\u017a"+
		"\7n\2\2\u017a\u017b\7M\2\2\u017b\u017c\7j\2\2\u017c\u017d\7c\2\2\u017d"+
		"\u017e\7n\2\2\u017e\u017f\7k\2\2\u017fH\3\2\2\2\u0180\u0181\7I\2\2\u0181"+
		"\u0182\7j\2\2\u0182\u0183\7g\2\2\u0183\u0184\7k\2\2\u0184\u0185\7t\2\2"+
		"\u0185\u0186\7g\2\2\u0186\u0187\7O\2\2\u0187\u0188\7q\2\2\u0188\u0189"+
		"\7l\2\2\u0189\u018a\7c\2\2\u018a\u018b\7|\2\2\u018bJ\3\2\2\2\u018c\u018d"+
		"\7-\2\2\u018d\u018e\7?\2\2\u018eL\3\2\2\2\u018f\u0190\7/\2\2\u0190\u0191"+
		"\7?\2\2\u0191N\3\2\2\2\u0192\u0193\7,\2\2\u0193\u0194\7?\2\2\u0194P\3"+
		"\2\2\2\u0195\u0196\7\61\2\2\u0196\u0197\7?\2\2\u0197R\3\2\2\2\u0198\u0199"+
		"\7-\2\2\u0199\u019a\7-\2\2\u019aT\3\2\2\2\u019b\u019c\7/\2\2\u019c\u019d"+
		"\7/\2\2\u019dV\3\2\2\2\u019e\u019f\7,\2\2\u019f\u01a0\7,\2\2\u01a0X\3"+
		"\2\2\2\u01a1\u01a2\7?\2\2\u01a2\u01a3\7?\2\2\u01a3Z\3\2\2\2\u01a4\u01a5"+
		"\7#\2\2\u01a5\u01a6\7?\2\2\u01a6\\\3\2\2\2\u01a7\u01a8\7@\2\2\u01a8\u01a9"+
		"\7?\2\2\u01a9^\3\2\2\2\u01aa\u01ab\7>\2\2\u01ab\u01ac\7?\2\2\u01ac`\3"+
		"\2\2\2\u01ad\u01ae\7(\2\2\u01ae\u01af\7(\2\2\u01afb\3\2\2\2\u01b0\u01b1"+
		"\7~\2\2\u01b1\u01b2\7~\2\2\u01b2d\3\2\2\2\u01b3\u01b4\7?\2\2\u01b4f\3"+
		"\2\2\2\u01b5\u01b6\7@\2\2\u01b6h\3\2\2\2\u01b7\u01b8\7>\2\2\u01b8j\3\2"+
		"\2\2\u01b9\u01ba\7#\2\2\u01bal\3\2\2\2\u01bb\u01bc\7-\2\2\u01bcn\3\2\2"+
		"\2\u01bd\u01be\7/\2\2\u01bep\3\2\2\2\u01bf\u01c0\7,\2\2\u01c0r\3\2\2\2"+
		"\u01c1\u01c2\7\61\2\2\u01c2t\3\2\2\2\u01c3\u01c4\7\'\2\2\u01c4v\3\2\2"+
		"\2\u01c5\u01c6\7*\2\2\u01c6x\3\2\2\2\u01c7\u01c8\7+\2\2\u01c8z\3\2\2\2"+
		"\u01c9\u01ca\7}\2\2\u01ca|\3\2\2\2\u01cb\u01cc\7\177\2\2\u01cc~\3\2\2"+
		"\2\u01cd\u01ce\7=\2\2\u01ce\u0080\3\2\2\2\u01cf\u01d0\7.\2\2\u01d0\u0082"+
		"\3\2\2\2\u01d1\u01d2\7\60\2\2\u01d2\u0084\3\2\2\2\u01d3\u01d5\t\2\2\2"+
		"\u01d4\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7"+
		"\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01da\7\60\2\2\u01d9\u01db\t\2\2\2"+
		"\u01da\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01dd"+
		"\3\2\2\2\u01dd\u0086\3\2\2\2\u01de\u01e0\t\2\2\2\u01df\u01de\3\2\2\2\u01e0"+
		"\u01e1\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u0088\3\2"+
		"\2\2\u01e3\u01e9\7$\2\2\u01e4\u01e8\n\3\2\2\u01e5\u01e6\7^\2\2\u01e6\u01e8"+
		"\13\2\2\2\u01e7\u01e4\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e8\u01eb\3\2\2\2"+
		"\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01ec\3\2\2\2\u01eb\u01e9"+
		"\3\2\2\2\u01ec\u01ed\7$\2\2\u01ed\u008a\3\2\2\2\u01ee\u01f2\7)\2\2\u01ef"+
		"\u01f3\n\4\2\2\u01f0\u01f1\7^\2\2\u01f1\u01f3\13\2\2\2\u01f2\u01ef\3\2"+
		"\2\2\u01f2\u01f0\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f5\7)\2\2\u01f5"+
		"\u008c\3\2\2\2\u01f6\u01fa\t\5\2\2\u01f7\u01f9\t\6\2\2\u01f8\u01f7\3\2"+
		"\2\2\u01f9\u01fc\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb"+
		"\u008e\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fd\u0201\t\7\2\2\u01fe\u0200\t\6"+
		"\2\2\u01ff\u01fe\3\2\2\2\u0200\u0203\3\2\2\2\u0201\u01ff\3\2\2\2\u0201"+
		"\u0202\3\2\2\2\u0202\u0090\3\2\2\2\u0203\u0201\3\2\2\2\u0204\u0205\7\61"+
		"\2\2\u0205\u0206\7\61\2\2\u0206\u020a\3\2\2\2\u0207\u0209\n\b\2\2\u0208"+
		"\u0207\3\2\2\2\u0209\u020c\3\2\2\2\u020a\u0208\3\2\2\2\u020a\u020b\3\2"+
		"\2\2\u020b\u020d\3\2\2\2\u020c\u020a\3\2\2\2\u020d\u020e\bI\2\2\u020e"+
		"\u0092\3\2\2\2\u020f\u0210\7\61\2\2\u0210\u0211\7,\2\2\u0211\u0215\3\2"+
		"\2\2\u0212\u0214\13\2\2\2\u0213\u0212\3\2\2\2\u0214\u0217\3\2\2\2\u0215"+
		"\u0216\3\2\2\2\u0215\u0213\3\2\2\2\u0216\u0218\3\2\2\2\u0217\u0215\3\2"+
		"\2\2\u0218\u0219\7,\2\2\u0219\u021a\7\61\2\2\u021a\u021b\3\2\2\2\u021b"+
		"\u021c\bJ\2\2\u021c\u0094\3\2\2\2\u021d\u021f\t\t\2\2\u021e\u021d\3\2"+
		"\2\2\u021f\u0220\3\2\2\2\u0220\u021e\3\2\2\2\u0220\u0221\3\2\2\2\u0221"+
		"\u0222\3\2\2\2\u0222\u0223\bK\2\2\u0223\u0096\3\2\2\2\16\2\u01d6\u01dc"+
		"\u01e1\u01e7\u01e9\u01f2\u01fa\u0201\u020a\u0215\u0220\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}