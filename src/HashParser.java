// Generated from Hash.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HashParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_packageDecl = 1, RULE_importDecl = 2, RULE_qualifiedName = 3, 
		RULE_namePart = 4, RULE_topLevelDecl = 5, RULE_typeName = 6, RULE_returnType = 7, 
		RULE_primitiveType = 8, RULE_varDecl = 9, RULE_varDeclNoSemi = 10, RULE_functionDecl = 11, 
		RULE_constructorDecl = 12, RULE_paramList = 13, RULE_param = 14, RULE_classDecl = 15, 
		RULE_classMember = 16, RULE_block = 17, RULE_statement = 18, RULE_assignmentStmt = 19, 
		RULE_assignment = 20, RULE_lvalue = 21, RULE_assignOp = 22, RULE_ifStmt = 23, 
		RULE_whileStmt = 24, RULE_forStmt = 25, RULE_forInit = 26, RULE_forUpdate = 27, 
		RULE_switchStmt = 28, RULE_caseBlock = 29, RULE_defaultBlock = 30, RULE_tryStmt = 31, 
		RULE_catchClause = 32, RULE_finallyClause = 33, RULE_returnStmt = 34, 
		RULE_breakStmt = 35, RULE_continueStmt = 36, RULE_printStmt = 37, RULE_inputStmt = 38, 
		RULE_throwStmt = 39, RULE_throwTarget = 40, RULE_exprStmt = 41, RULE_exceptionType = 42, 
		RULE_exceptionCreation = 43, RULE_objectCreation = 44, RULE_argumentList = 45, 
		RULE_expr = 46, RULE_logicalOrExpr = 47, RULE_logicalAndExpr = 48, RULE_equalityExpr = 49, 
		RULE_relationalExpr = 50, RULE_additiveExpr = 51, RULE_multiplicativeExpr = 52, 
		RULE_powerExpr = 53, RULE_unaryExpr = 54, RULE_postfixExpr = 55, RULE_postfixPart = 56, 
		RULE_postfixIncDec = 57, RULE_incDecExpr = 58, RULE_primaryExpr = 59, 
		RULE_literal = 60;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "packageDecl", "importDecl", "qualifiedName", "namePart", 
			"topLevelDecl", "typeName", "returnType", "primitiveType", "varDecl", 
			"varDeclNoSemi", "functionDecl", "constructorDecl", "paramList", "param", 
			"classDecl", "classMember", "block", "statement", "assignmentStmt", "assignment", 
			"lvalue", "assignOp", "ifStmt", "whileStmt", "forStmt", "forInit", "forUpdate", 
			"switchStmt", "caseBlock", "defaultBlock", "tryStmt", "catchClause", 
			"finallyClause", "returnStmt", "breakStmt", "continueStmt", "printStmt", 
			"inputStmt", "throwStmt", "throwTarget", "exprStmt", "exceptionType", 
			"exceptionCreation", "objectCreation", "argumentList", "expr", "logicalOrExpr", 
			"logicalAndExpr", "equalityExpr", "relationalExpr", "additiveExpr", "multiplicativeExpr", 
			"powerExpr", "unaryExpr", "postfixExpr", "postfixPart", "postfixIncDec", 
			"incDecExpr", "primaryExpr", "literal"
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

	@Override
	public String getGrammarFileName() { return "Hash.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HashParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(HashParser.EOF, 0); }
		public PackageDeclContext packageDecl() {
			return getRuleContext(PackageDeclContext.class,0);
		}
		public List<ImportDeclContext> importDecl() {
			return getRuleContexts(ImportDeclContext.class);
		}
		public ImportDeclContext importDecl(int i) {
			return getRuleContext(ImportDeclContext.class,i);
		}
		public List<TopLevelDeclContext> topLevelDecl() {
			return getRuleContexts(TopLevelDeclContext.class);
		}
		public TopLevelDeclContext topLevelDecl(int i) {
			return getRuleContext(TopLevelDeclContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BASTE) {
				{
				setState(122);
				packageDecl();
				}
			}

			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BIAR) {
				{
				{
				setState(125);
				importDecl();
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KLASS) | (1L << BEBIN) | (1L << ADAD) | (1L << ASHARI) | (1L << BOOLE) | (1L << MATN) | (1L << HARF))) != 0) || _la==CLASS_ID) {
				{
				{
				setState(131);
				topLevelDecl();
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137);
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

	public static class PackageDeclContext extends ParserRuleContext {
		public TerminalNode BASTE() { return getToken(HashParser.BASTE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(HashParser.SEMI, 0); }
		public PackageDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterPackageDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitPackageDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitPackageDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageDeclContext packageDecl() throws RecognitionException {
		PackageDeclContext _localctx = new PackageDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(BASTE);
			setState(140);
			qualifiedName();
			setState(141);
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

	public static class ImportDeclContext extends ParserRuleContext {
		public TerminalNode BIAR() { return getToken(HashParser.BIAR, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(HashParser.SEMI, 0); }
		public TerminalNode DOT() { return getToken(HashParser.DOT, 0); }
		public TerminalNode STAR() { return getToken(HashParser.STAR, 0); }
		public ImportDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterImportDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitImportDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitImportDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclContext importDecl() throws RecognitionException {
		ImportDeclContext _localctx = new ImportDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(BIAR);
			setState(144);
			qualifiedName();
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(145);
				match(DOT);
				setState(146);
				match(STAR);
				}
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

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<NamePartContext> namePart() {
			return getRuleContexts(NamePartContext.class);
		}
		public NamePartContext namePart(int i) {
			return getRuleContext(NamePartContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(HashParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(HashParser.DOT, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			namePart();
			setState(156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(152);
					match(DOT);
					setState(153);
					namePart();
					}
					} 
				}
				setState(158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class NamePartContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(HashParser.ID, 0); }
		public TerminalNode CLASS_ID() { return getToken(HashParser.CLASS_ID, 0); }
		public NamePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namePart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterNamePart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitNamePart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitNamePart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamePartContext namePart() throws RecognitionException {
		NamePartContext _localctx = new NamePartContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_namePart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_la = _input.LA(1);
			if ( !(_la==CLASS_ID || _la==ID) ) {
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

	public static class TopLevelDeclContext extends ParserRuleContext {
		public ClassDeclContext classDecl() {
			return getRuleContext(ClassDeclContext.class,0);
		}
		public FunctionDeclContext functionDecl() {
			return getRuleContext(FunctionDeclContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public TopLevelDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevelDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterTopLevelDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitTopLevelDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitTopLevelDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopLevelDeclContext topLevelDecl() throws RecognitionException {
		TopLevelDeclContext _localctx = new TopLevelDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_topLevelDecl);
		try {
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KLASS:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				classDecl();
				}
				break;
			case BEBIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				functionDecl();
				}
				break;
			case ADAD:
			case ASHARI:
			case BOOLE:
			case MATN:
			case HARF:
			case CLASS_ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(163);
				varDecl();
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

	public static class TypeNameContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode CLASS_ID() { return getToken(HashParser.CLASS_ID, 0); }
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_typeName);
		try {
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADAD:
			case ASHARI:
			case BOOLE:
			case MATN:
			case HARF:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				primitiveType();
				}
				break;
			case CLASS_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(CLASS_ID);
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

	public static class ReturnTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode HICH() { return getToken(HashParser.HICH, 0); }
		public TerminalNode CLASS_ID() { return getToken(HashParser.CLASS_ID, 0); }
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitReturnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_returnType);
		try {
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADAD:
			case ASHARI:
			case BOOLE:
			case MATN:
			case HARF:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				primitiveType();
				}
				break;
			case HICH:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				match(HICH);
				}
				break;
			case CLASS_ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				match(CLASS_ID);
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode ADAD() { return getToken(HashParser.ADAD, 0); }
		public TerminalNode ASHARI() { return getToken(HashParser.ASHARI, 0); }
		public TerminalNode BOOLE() { return getToken(HashParser.BOOLE, 0); }
		public TerminalNode MATN() { return getToken(HashParser.MATN, 0); }
		public TerminalNode HARF() { return getToken(HashParser.HARF, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADAD) | (1L << ASHARI) | (1L << BOOLE) | (1L << MATN) | (1L << HARF))) != 0)) ) {
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

	public static class VarDeclContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode ID() { return getToken(HashParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(HashParser.SEMI, 0); }
		public TerminalNode ASSIGN() { return getToken(HashParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			typeName();
			setState(178);
			match(ID);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(179);
				match(ASSIGN);
				setState(180);
				expr();
				}
			}

			setState(183);
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

	public static class VarDeclNoSemiContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode ID() { return getToken(HashParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(HashParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDeclNoSemiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclNoSemi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterVarDeclNoSemi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitVarDeclNoSemi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitVarDeclNoSemi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclNoSemiContext varDeclNoSemi() throws RecognitionException {
		VarDeclNoSemiContext _localctx = new VarDeclNoSemiContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_varDeclNoSemi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			typeName();
			setState(186);
			match(ID);
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(187);
				match(ASSIGN);
				setState(188);
				expr();
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

	public static class FunctionDeclContext extends ParserRuleContext {
		public TerminalNode BEBIN() { return getToken(HashParser.BEBIN, 0); }
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(HashParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(HashParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HashParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitFunctionDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitFunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(BEBIN);
			setState(192);
			returnType();
			setState(193);
			match(ID);
			setState(194);
			match(LPAREN);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (ADAD - 8)) | (1L << (ASHARI - 8)) | (1L << (BOOLE - 8)) | (1L << (MATN - 8)) | (1L << (HARF - 8)) | (1L << (CLASS_ID - 8)))) != 0)) {
				{
				setState(195);
				paramList();
				}
			}

			setState(198);
			match(RPAREN);
			setState(199);
			block();
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

	public static class ConstructorDeclContext extends ParserRuleContext {
		public TerminalNode BEBIN() { return getToken(HashParser.BEBIN, 0); }
		public TerminalNode CLASS_ID() { return getToken(HashParser.CLASS_ID, 0); }
		public TerminalNode LPAREN() { return getToken(HashParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HashParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public ConstructorDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterConstructorDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitConstructorDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitConstructorDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclContext constructorDecl() throws RecognitionException {
		ConstructorDeclContext _localctx = new ConstructorDeclContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_constructorDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(BEBIN);
			setState(202);
			match(CLASS_ID);
			setState(203);
			match(LPAREN);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (ADAD - 8)) | (1L << (ASHARI - 8)) | (1L << (BOOLE - 8)) | (1L << (MATN - 8)) | (1L << (HARF - 8)) | (1L << (CLASS_ID - 8)))) != 0)) {
				{
				setState(204);
				paramList();
				}
			}

			setState(207);
			match(RPAREN);
			setState(208);
			block();
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

	public static class ParamListContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HashParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HashParser.COMMA, i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitParamList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			param();
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(211);
				match(COMMA);
				setState(212);
				param();
				}
				}
				setState(217);
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

	public static class ParamContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode ID() { return getToken(HashParser.ID, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			typeName();
			setState(219);
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

	public static class ClassDeclContext extends ParserRuleContext {
		public TerminalNode KLASS() { return getToken(HashParser.KLASS, 0); }
		public TerminalNode CLASS_ID() { return getToken(HashParser.CLASS_ID, 0); }
		public TerminalNode LBRACE() { return getToken(HashParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(HashParser.RBRACE, 0); }
		public List<ClassMemberContext> classMember() {
			return getRuleContexts(ClassMemberContext.class);
		}
		public ClassMemberContext classMember(int i) {
			return getRuleContext(ClassMemberContext.class,i);
		}
		public ClassDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterClassDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitClassDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitClassDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclContext classDecl() throws RecognitionException {
		ClassDeclContext _localctx = new ClassDeclContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_classDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(KLASS);
			setState(222);
			match(CLASS_ID);
			setState(223);
			match(LBRACE);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BEBIN) | (1L << ADAD) | (1L << ASHARI) | (1L << BOOLE) | (1L << MATN) | (1L << HARF))) != 0) || _la==CLASS_ID) {
				{
				{
				setState(224);
				classMember();
				}
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(230);
			match(RBRACE);
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

	public static class ClassMemberContext extends ParserRuleContext {
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public FunctionDeclContext functionDecl() {
			return getRuleContext(FunctionDeclContext.class,0);
		}
		public ConstructorDeclContext constructorDecl() {
			return getRuleContext(ConstructorDeclContext.class,0);
		}
		public ClassMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterClassMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitClassMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitClassMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMemberContext classMember() throws RecognitionException {
		ClassMemberContext _localctx = new ClassMemberContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_classMember);
		try {
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				varDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				functionDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
				constructorDecl();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(HashParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(HashParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(LBRACE);
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << JADID) | (1L << BEDE) | (1L << ADAD) | (1L << ASHARI) | (1L << BOOLE) | (1L << MATN) | (1L << HARF) | (1L << KHALI) | (1L << DOROST) | (1L << GHALAT) | (1L << AGE) | (1L << TA) | (1L << BARAYE) | (1L << SHEKAN) | (1L << EDAME) | (1L << ENTEKHAB) | (1L << EMTEHAN) | (1L << BENDAZ) | (1L << BECHAP) | (1L << BEKHAN) | (1L << SEFR_BOOD) | (1L << MAHDOODE_NADOROST) | (1L << JADVAL_KHALI) | (1L << GHEIRE_MOJAZ) | (1L << PLUS_PLUS) | (1L << MINUS_MINUS) | (1L << NOT) | (1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (FLOAT - 66)) | (1L << (INT - 66)) | (1L << (STRING - 66)) | (1L << (CHAR - 66)) | (1L << (CLASS_ID - 66)) | (1L << (ID - 66)))) != 0)) {
				{
				{
				setState(238);
				statement();
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(244);
			match(RBRACE);
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public AssignmentStmtContext assignmentStmt() {
			return getRuleContext(AssignmentStmtContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public ForStmtContext forStmt() {
			return getRuleContext(ForStmtContext.class,0);
		}
		public SwitchStmtContext switchStmt() {
			return getRuleContext(SwitchStmtContext.class,0);
		}
		public TryStmtContext tryStmt() {
			return getRuleContext(TryStmtContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public BreakStmtContext breakStmt() {
			return getRuleContext(BreakStmtContext.class,0);
		}
		public ContinueStmtContext continueStmt() {
			return getRuleContext(ContinueStmtContext.class,0);
		}
		public PrintStmtContext printStmt() {
			return getRuleContext(PrintStmtContext.class,0);
		}
		public InputStmtContext inputStmt() {
			return getRuleContext(InputStmtContext.class,0);
		}
		public ThrowStmtContext throwStmt() {
			return getRuleContext(ThrowStmtContext.class,0);
		}
		public ExprStmtContext exprStmt() {
			return getRuleContext(ExprStmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_statement);
		try {
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				varDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(248);
				assignmentStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(249);
				ifStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(250);
				whileStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(251);
				forStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(252);
				switchStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(253);
				tryStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(254);
				returnStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(255);
				breakStmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(256);
				continueStmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(257);
				printStmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(258);
				inputStmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(259);
				throwStmt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(260);
				exprStmt();
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

	public static class AssignmentStmtContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(HashParser.SEMI, 0); }
		public AssignmentStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterAssignmentStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitAssignmentStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitAssignmentStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStmtContext assignmentStmt() throws RecognitionException {
		AssignmentStmtContext _localctx = new AssignmentStmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_assignmentStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			assignment();
			setState(264);
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

	public static class AssignmentContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public AssignOpContext assignOp() {
			return getRuleContext(AssignOpContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			lvalue();
			setState(267);
			assignOp();
			setState(268);
			expr();
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

	public static class LvalueContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(HashParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(HashParser.ID, i);
		}
		public TerminalNode IN() { return getToken(HashParser.IN, 0); }
		public List<TerminalNode> DOT() { return getTokens(HashParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(HashParser.DOT, i);
		}
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterLvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitLvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitLvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LvalueContext lvalue() throws RecognitionException {
		LvalueContext _localctx = new LvalueContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_lvalue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IN) {
				{
				setState(270);
				match(IN);
				setState(271);
				match(DOT);
				}
			}

			setState(274);
			match(ID);
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(275);
				match(DOT);
				setState(276);
				match(ID);
				}
				}
				setState(281);
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

	public static class AssignOpContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(HashParser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(HashParser.PLUS_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(HashParser.MINUS_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(HashParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(HashParser.DIV_ASSIGN, 0); }
		public AssignOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterAssignOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitAssignOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitAssignOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignOpContext assignOp() throws RecognitionException {
		AssignOpContext _localctx = new AssignOpContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_assignOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS_ASSIGN) | (1L << MINUS_ASSIGN) | (1L << MUL_ASSIGN) | (1L << DIV_ASSIGN) | (1L << ASSIGN))) != 0)) ) {
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

	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode AGE() { return getToken(HashParser.AGE, 0); }
		public TerminalNode LPAREN() { return getToken(HashParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HashParser.RPAREN, 0); }
		public TerminalNode BOOD() { return getToken(HashParser.BOOD, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode VAGARNA() { return getToken(HashParser.VAGARNA, 0); }
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(AGE);
			setState(285);
			match(LPAREN);
			setState(286);
			expr();
			setState(287);
			match(RPAREN);
			setState(288);
			match(BOOD);
			setState(289);
			block();
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAGARNA) {
				{
				setState(290);
				match(VAGARNA);
				setState(291);
				block();
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

	public static class WhileStmtContext extends ParserRuleContext {
		public TerminalNode TA() { return getToken(HashParser.TA, 0); }
		public TerminalNode LPAREN() { return getToken(HashParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HashParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(TA);
			setState(295);
			match(LPAREN);
			setState(296);
			expr();
			setState(297);
			match(RPAREN);
			setState(298);
			block();
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

	public static class ForStmtContext extends ParserRuleContext {
		public TerminalNode BARAYE() { return getToken(HashParser.BARAYE, 0); }
		public TerminalNode LPAREN() { return getToken(HashParser.LPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(HashParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(HashParser.SEMI, i);
		}
		public TerminalNode RPAREN() { return getToken(HashParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitForStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_forStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(BARAYE);
			setState(301);
			match(LPAREN);
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << ADAD) | (1L << ASHARI) | (1L << BOOLE) | (1L << MATN) | (1L << HARF) | (1L << PLUS_PLUS) | (1L << MINUS_MINUS))) != 0) || _la==CLASS_ID || _la==ID) {
				{
				setState(302);
				forInit();
				}
			}

			setState(305);
			match(SEMI);
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << JADID) | (1L << KHALI) | (1L << DOROST) | (1L << GHALAT) | (1L << SEFR_BOOD) | (1L << MAHDOODE_NADOROST) | (1L << JADVAL_KHALI) | (1L << GHEIRE_MOJAZ) | (1L << PLUS_PLUS) | (1L << MINUS_MINUS) | (1L << NOT) | (1L << PLUS) | (1L << MINUS) | (1L << LPAREN))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (FLOAT - 66)) | (1L << (INT - 66)) | (1L << (STRING - 66)) | (1L << (CHAR - 66)) | (1L << (CLASS_ID - 66)) | (1L << (ID - 66)))) != 0)) {
				{
				setState(306);
				expr();
				}
			}

			setState(309);
			match(SEMI);
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << PLUS_PLUS) | (1L << MINUS_MINUS))) != 0) || _la==ID) {
				{
				setState(310);
				forUpdate();
				}
			}

			setState(313);
			match(RPAREN);
			setState(314);
			block();
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

	public static class ForInitContext extends ParserRuleContext {
		public VarDeclNoSemiContext varDeclNoSemi() {
			return getRuleContext(VarDeclNoSemiContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public IncDecExprContext incDecExpr() {
			return getRuleContext(IncDecExprContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_forInit);
		try {
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				varDeclNoSemi();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(318);
				incDecExpr();
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

	public static class ForUpdateContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public IncDecExprContext incDecExpr() {
			return getRuleContext(IncDecExprContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitForUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitForUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_forUpdate);
		try {
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				incDecExpr();
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

	public static class SwitchStmtContext extends ParserRuleContext {
		public TerminalNode ENTEKHAB() { return getToken(HashParser.ENTEKHAB, 0); }
		public TerminalNode LPAREN() { return getToken(HashParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HashParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(HashParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(HashParser.RBRACE, 0); }
		public List<CaseBlockContext> caseBlock() {
			return getRuleContexts(CaseBlockContext.class);
		}
		public CaseBlockContext caseBlock(int i) {
			return getRuleContext(CaseBlockContext.class,i);
		}
		public DefaultBlockContext defaultBlock() {
			return getRuleContext(DefaultBlockContext.class,0);
		}
		public SwitchStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterSwitchStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitSwitchStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitSwitchStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStmtContext switchStmt() throws RecognitionException {
		SwitchStmtContext _localctx = new SwitchStmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_switchStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(ENTEKHAB);
			setState(326);
			match(LPAREN);
			setState(327);
			expr();
			setState(328);
			match(RPAREN);
			setState(329);
			match(LBRACE);
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HALAT) {
				{
				{
				setState(330);
				caseBlock();
				}
				}
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DIGAR) {
				{
				setState(336);
				defaultBlock();
				}
			}

			setState(339);
			match(RBRACE);
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

	public static class CaseBlockContext extends ParserRuleContext {
		public TerminalNode HALAT() { return getToken(HashParser.HALAT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CaseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterCaseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitCaseBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitCaseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseBlockContext caseBlock() throws RecognitionException {
		CaseBlockContext _localctx = new CaseBlockContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_caseBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(HALAT);
			setState(342);
			expr();
			setState(343);
			block();
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

	public static class DefaultBlockContext extends ParserRuleContext {
		public TerminalNode DIGAR() { return getToken(HashParser.DIGAR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DefaultBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterDefaultBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitDefaultBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitDefaultBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultBlockContext defaultBlock() throws RecognitionException {
		DefaultBlockContext _localctx = new DefaultBlockContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_defaultBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(DIGAR);
			setState(346);
			block();
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

	public static class TryStmtContext extends ParserRuleContext {
		public TerminalNode EMTEHAN() { return getToken(HashParser.EMTEHAN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public FinallyClauseContext finallyClause() {
			return getRuleContext(FinallyClauseContext.class,0);
		}
		public TryStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterTryStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitTryStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitTryStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryStmtContext tryStmt() throws RecognitionException {
		TryStmtContext _localctx = new TryStmtContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_tryStmt);
		int _la;
		try {
			setState(362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				match(EMTEHAN);
				setState(349);
				block();
				setState(351); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(350);
					catchClause();
					}
					}
					setState(353); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==GEREFTAR );
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AKHAR) {
					{
					setState(355);
					finallyClause();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
				match(EMTEHAN);
				setState(359);
				block();
				setState(360);
				finallyClause();
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

	public static class CatchClauseContext extends ParserRuleContext {
		public TerminalNode GEREFTAR() { return getToken(HashParser.GEREFTAR, 0); }
		public TerminalNode LPAREN() { return getToken(HashParser.LPAREN, 0); }
		public ExceptionTypeContext exceptionType() {
			return getRuleContext(ExceptionTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(HashParser.ID, 0); }
		public TerminalNode RPAREN() { return getToken(HashParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitCatchClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitCatchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(GEREFTAR);
			setState(365);
			match(LPAREN);
			setState(366);
			exceptionType();
			setState(367);
			match(ID);
			setState(368);
			match(RPAREN);
			setState(369);
			block();
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

	public static class FinallyClauseContext extends ParserRuleContext {
		public TerminalNode AKHAR() { return getToken(HashParser.AKHAR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterFinallyClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitFinallyClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitFinallyClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinallyClauseContext finallyClause() throws RecognitionException {
		FinallyClauseContext _localctx = new FinallyClauseContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_finallyClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(AKHAR);
			setState(372);
			block();
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

	public static class ReturnStmtContext extends ParserRuleContext {
		public TerminalNode BEDE() { return getToken(HashParser.BEDE, 0); }
		public TerminalNode SEMI() { return getToken(HashParser.SEMI, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitReturnStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_returnStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(BEDE);
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << JADID) | (1L << KHALI) | (1L << DOROST) | (1L << GHALAT) | (1L << SEFR_BOOD) | (1L << MAHDOODE_NADOROST) | (1L << JADVAL_KHALI) | (1L << GHEIRE_MOJAZ) | (1L << PLUS_PLUS) | (1L << MINUS_MINUS) | (1L << NOT) | (1L << PLUS) | (1L << MINUS) | (1L << LPAREN))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (FLOAT - 66)) | (1L << (INT - 66)) | (1L << (STRING - 66)) | (1L << (CHAR - 66)) | (1L << (CLASS_ID - 66)) | (1L << (ID - 66)))) != 0)) {
				{
				setState(375);
				expr();
				}
			}

			setState(378);
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

	public static class BreakStmtContext extends ParserRuleContext {
		public TerminalNode SHEKAN() { return getToken(HashParser.SHEKAN, 0); }
		public TerminalNode SEMI() { return getToken(HashParser.SEMI, 0); }
		public BreakStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterBreakStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitBreakStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitBreakStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStmtContext breakStmt() throws RecognitionException {
		BreakStmtContext _localctx = new BreakStmtContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_breakStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(SHEKAN);
			setState(381);
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

	public static class ContinueStmtContext extends ParserRuleContext {
		public TerminalNode EDAME() { return getToken(HashParser.EDAME, 0); }
		public TerminalNode SEMI() { return getToken(HashParser.SEMI, 0); }
		public ContinueStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterContinueStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitContinueStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitContinueStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStmtContext continueStmt() throws RecognitionException {
		ContinueStmtContext _localctx = new ContinueStmtContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_continueStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(EDAME);
			setState(384);
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

	public static class PrintStmtContext extends ParserRuleContext {
		public TerminalNode BECHAP() { return getToken(HashParser.BECHAP, 0); }
		public TerminalNode LPAREN() { return getToken(HashParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HashParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(HashParser.SEMI, 0); }
		public PrintStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterPrintStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitPrintStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitPrintStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStmtContext printStmt() throws RecognitionException {
		PrintStmtContext _localctx = new PrintStmtContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_printStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(BECHAP);
			setState(387);
			match(LPAREN);
			setState(388);
			expr();
			setState(389);
			match(RPAREN);
			setState(390);
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

	public static class InputStmtContext extends ParserRuleContext {
		public TerminalNode BEKHAN() { return getToken(HashParser.BEKHAN, 0); }
		public TerminalNode LPAREN() { return getToken(HashParser.LPAREN, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(HashParser.ID, 0); }
		public TerminalNode RPAREN() { return getToken(HashParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(HashParser.SEMI, 0); }
		public InputStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterInputStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitInputStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitInputStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputStmtContext inputStmt() throws RecognitionException {
		InputStmtContext _localctx = new InputStmtContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_inputStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(BEKHAN);
			setState(393);
			match(LPAREN);
			setState(394);
			primitiveType();
			setState(395);
			match(ID);
			setState(396);
			match(RPAREN);
			setState(397);
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

	public static class ThrowStmtContext extends ParserRuleContext {
		public TerminalNode BENDAZ() { return getToken(HashParser.BENDAZ, 0); }
		public ThrowTargetContext throwTarget() {
			return getRuleContext(ThrowTargetContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(HashParser.SEMI, 0); }
		public ThrowStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterThrowStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitThrowStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitThrowStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowStmtContext throwStmt() throws RecognitionException {
		ThrowStmtContext _localctx = new ThrowStmtContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_throwStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(BENDAZ);
			setState(400);
			throwTarget();
			setState(401);
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

	public static class ThrowTargetContext extends ParserRuleContext {
		public ExceptionCreationContext exceptionCreation() {
			return getRuleContext(ExceptionCreationContext.class,0);
		}
		public TerminalNode ID() { return getToken(HashParser.ID, 0); }
		public ThrowTargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwTarget; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterThrowTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitThrowTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitThrowTarget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowTargetContext throwTarget() throws RecognitionException {
		ThrowTargetContext _localctx = new ThrowTargetContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_throwTarget);
		try {
			setState(405);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEFR_BOOD:
			case MAHDOODE_NADOROST:
			case JADVAL_KHALI:
			case GHEIRE_MOJAZ:
			case CLASS_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				exceptionCreation();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(404);
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

	public static class ExprStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(HashParser.SEMI, 0); }
		public ExprStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterExprStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitExprStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitExprStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprStmtContext exprStmt() throws RecognitionException {
		ExprStmtContext _localctx = new ExprStmtContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_exprStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			expr();
			setState(408);
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

	public static class ExceptionTypeContext extends ParserRuleContext {
		public TerminalNode SEFR_BOOD() { return getToken(HashParser.SEFR_BOOD, 0); }
		public TerminalNode MAHDOODE_NADOROST() { return getToken(HashParser.MAHDOODE_NADOROST, 0); }
		public TerminalNode JADVAL_KHALI() { return getToken(HashParser.JADVAL_KHALI, 0); }
		public TerminalNode GHEIRE_MOJAZ() { return getToken(HashParser.GHEIRE_MOJAZ, 0); }
		public TerminalNode CLASS_ID() { return getToken(HashParser.CLASS_ID, 0); }
		public ExceptionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterExceptionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitExceptionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitExceptionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionTypeContext exceptionType() throws RecognitionException {
		ExceptionTypeContext _localctx = new ExceptionTypeContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_exceptionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			_la = _input.LA(1);
			if ( !(((((_la - 33)) & ~0x3f) == 0 && ((1L << (_la - 33)) & ((1L << (SEFR_BOOD - 33)) | (1L << (MAHDOODE_NADOROST - 33)) | (1L << (JADVAL_KHALI - 33)) | (1L << (GHEIRE_MOJAZ - 33)) | (1L << (CLASS_ID - 33)))) != 0)) ) {
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

	public static class ExceptionCreationContext extends ParserRuleContext {
		public ExceptionTypeContext exceptionType() {
			return getRuleContext(ExceptionTypeContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(HashParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HashParser.RPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ExceptionCreationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionCreation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterExceptionCreation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitExceptionCreation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitExceptionCreation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionCreationContext exceptionCreation() throws RecognitionException {
		ExceptionCreationContext _localctx = new ExceptionCreationContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_exceptionCreation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			exceptionType();
			setState(413);
			match(LPAREN);
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << JADID) | (1L << KHALI) | (1L << DOROST) | (1L << GHALAT) | (1L << SEFR_BOOD) | (1L << MAHDOODE_NADOROST) | (1L << JADVAL_KHALI) | (1L << GHEIRE_MOJAZ) | (1L << PLUS_PLUS) | (1L << MINUS_MINUS) | (1L << NOT) | (1L << PLUS) | (1L << MINUS) | (1L << LPAREN))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (FLOAT - 66)) | (1L << (INT - 66)) | (1L << (STRING - 66)) | (1L << (CHAR - 66)) | (1L << (CLASS_ID - 66)) | (1L << (ID - 66)))) != 0)) {
				{
				setState(414);
				argumentList();
				}
			}

			setState(417);
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

	public static class ObjectCreationContext extends ParserRuleContext {
		public TerminalNode JADID() { return getToken(HashParser.JADID, 0); }
		public TerminalNode CLASS_ID() { return getToken(HashParser.CLASS_ID, 0); }
		public TerminalNode LPAREN() { return getToken(HashParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HashParser.RPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ObjectCreationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectCreation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterObjectCreation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitObjectCreation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitObjectCreation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectCreationContext objectCreation() throws RecognitionException {
		ObjectCreationContext _localctx = new ObjectCreationContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_objectCreation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(JADID);
			setState(420);
			match(CLASS_ID);
			setState(421);
			match(LPAREN);
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << JADID) | (1L << KHALI) | (1L << DOROST) | (1L << GHALAT) | (1L << SEFR_BOOD) | (1L << MAHDOODE_NADOROST) | (1L << JADVAL_KHALI) | (1L << GHEIRE_MOJAZ) | (1L << PLUS_PLUS) | (1L << MINUS_MINUS) | (1L << NOT) | (1L << PLUS) | (1L << MINUS) | (1L << LPAREN))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (FLOAT - 66)) | (1L << (INT - 66)) | (1L << (STRING - 66)) | (1L << (CHAR - 66)) | (1L << (CLASS_ID - 66)) | (1L << (ID - 66)))) != 0)) {
				{
				setState(422);
				argumentList();
				}
			}

			setState(425);
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

	public static class ArgumentListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HashParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HashParser.COMMA, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			expr();
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(428);
				match(COMMA);
				setState(429);
				expr();
				}
				}
				setState(434);
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

	public static class ExprContext extends ParserRuleContext {
		public LogicalOrExprContext logicalOrExpr() {
			return getRuleContext(LogicalOrExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			logicalOrExpr();
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

	public static class LogicalOrExprContext extends ParserRuleContext {
		public List<LogicalAndExprContext> logicalAndExpr() {
			return getRuleContexts(LogicalAndExprContext.class);
		}
		public LogicalAndExprContext logicalAndExpr(int i) {
			return getRuleContext(LogicalAndExprContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(HashParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(HashParser.OR, i);
		}
		public LogicalOrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterLogicalOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitLogicalOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitLogicalOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOrExprContext logicalOrExpr() throws RecognitionException {
		LogicalOrExprContext _localctx = new LogicalOrExprContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_logicalOrExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			logicalAndExpr();
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(438);
				match(OR);
				setState(439);
				logicalAndExpr();
				}
				}
				setState(444);
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

	public static class LogicalAndExprContext extends ParserRuleContext {
		public List<EqualityExprContext> equalityExpr() {
			return getRuleContexts(EqualityExprContext.class);
		}
		public EqualityExprContext equalityExpr(int i) {
			return getRuleContext(EqualityExprContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(HashParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(HashParser.AND, i);
		}
		public LogicalAndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterLogicalAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitLogicalAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitLogicalAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalAndExprContext logicalAndExpr() throws RecognitionException {
		LogicalAndExprContext _localctx = new LogicalAndExprContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_logicalAndExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			equalityExpr();
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(446);
				match(AND);
				setState(447);
				equalityExpr();
				}
				}
				setState(452);
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

	public static class EqualityExprContext extends ParserRuleContext {
		public List<RelationalExprContext> relationalExpr() {
			return getRuleContexts(RelationalExprContext.class);
		}
		public RelationalExprContext relationalExpr(int i) {
			return getRuleContext(RelationalExprContext.class,i);
		}
		public List<TerminalNode> EQ() { return getTokens(HashParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(HashParser.EQ, i);
		}
		public List<TerminalNode> NEQ() { return getTokens(HashParser.NEQ); }
		public TerminalNode NEQ(int i) {
			return getToken(HashParser.NEQ, i);
		}
		public EqualityExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterEqualityExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitEqualityExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitEqualityExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExprContext equalityExpr() throws RecognitionException {
		EqualityExprContext _localctx = new EqualityExprContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_equalityExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			relationalExpr();
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQ || _la==NEQ) {
				{
				{
				setState(454);
				_la = _input.LA(1);
				if ( !(_la==EQ || _la==NEQ) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(455);
				relationalExpr();
				}
				}
				setState(460);
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

	public static class RelationalExprContext extends ParserRuleContext {
		public List<AdditiveExprContext> additiveExpr() {
			return getRuleContexts(AdditiveExprContext.class);
		}
		public AdditiveExprContext additiveExpr(int i) {
			return getRuleContext(AdditiveExprContext.class,i);
		}
		public List<TerminalNode> GT() { return getTokens(HashParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(HashParser.GT, i);
		}
		public List<TerminalNode> GTE() { return getTokens(HashParser.GTE); }
		public TerminalNode GTE(int i) {
			return getToken(HashParser.GTE, i);
		}
		public List<TerminalNode> LT() { return getTokens(HashParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(HashParser.LT, i);
		}
		public List<TerminalNode> LTE() { return getTokens(HashParser.LTE); }
		public TerminalNode LTE(int i) {
			return getToken(HashParser.LTE, i);
		}
		public RelationalExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterRelationalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitRelationalExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitRelationalExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExprContext relationalExpr() throws RecognitionException {
		RelationalExprContext _localctx = new RelationalExprContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_relationalExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			additiveExpr();
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GTE) | (1L << LTE) | (1L << GT) | (1L << LT))) != 0)) {
				{
				{
				setState(462);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GTE) | (1L << LTE) | (1L << GT) | (1L << LT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(463);
				additiveExpr();
				}
				}
				setState(468);
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

	public static class AdditiveExprContext extends ParserRuleContext {
		public List<MultiplicativeExprContext> multiplicativeExpr() {
			return getRuleContexts(MultiplicativeExprContext.class);
		}
		public MultiplicativeExprContext multiplicativeExpr(int i) {
			return getRuleContext(MultiplicativeExprContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(HashParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(HashParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(HashParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(HashParser.MINUS, i);
		}
		public AdditiveExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterAdditiveExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitAdditiveExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitAdditiveExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExprContext additiveExpr() throws RecognitionException {
		AdditiveExprContext _localctx = new AdditiveExprContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_additiveExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			multiplicativeExpr();
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(470);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(471);
				multiplicativeExpr();
				}
				}
				setState(476);
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

	public static class MultiplicativeExprContext extends ParserRuleContext {
		public List<PowerExprContext> powerExpr() {
			return getRuleContexts(PowerExprContext.class);
		}
		public PowerExprContext powerExpr(int i) {
			return getRuleContext(PowerExprContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(HashParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(HashParser.STAR, i);
		}
		public List<TerminalNode> DIV() { return getTokens(HashParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(HashParser.DIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(HashParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(HashParser.MOD, i);
		}
		public MultiplicativeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterMultiplicativeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitMultiplicativeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitMultiplicativeExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExprContext multiplicativeExpr() throws RecognitionException {
		MultiplicativeExprContext _localctx = new MultiplicativeExprContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_multiplicativeExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			powerExpr();
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) {
				{
				{
				setState(478);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(479);
				powerExpr();
				}
				}
				setState(484);
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

	public static class PowerExprContext extends ParserRuleContext {
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public TerminalNode POWER() { return getToken(HashParser.POWER, 0); }
		public PowerExprContext powerExpr() {
			return getRuleContext(PowerExprContext.class,0);
		}
		public PowerExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_powerExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterPowerExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitPowerExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitPowerExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowerExprContext powerExpr() throws RecognitionException {
		PowerExprContext _localctx = new PowerExprContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_powerExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			unaryExpr();
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POWER) {
				{
				setState(486);
				match(POWER);
				setState(487);
				powerExpr();
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

	public static class UnaryExprContext extends ParserRuleContext {
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public TerminalNode NOT() { return getToken(HashParser.NOT, 0); }
		public TerminalNode PLUS() { return getToken(HashParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(HashParser.MINUS, 0); }
		public TerminalNode PLUS_PLUS() { return getToken(HashParser.PLUS_PLUS, 0); }
		public TerminalNode MINUS_MINUS() { return getToken(HashParser.MINUS_MINUS, 0); }
		public PostfixExprContext postfixExpr() {
			return getRuleContext(PostfixExprContext.class,0);
		}
		public UnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitUnaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExprContext unaryExpr() throws RecognitionException {
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_unaryExpr);
		int _la;
		try {
			setState(493);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS_PLUS:
			case MINUS_MINUS:
			case NOT:
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(490);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS_PLUS) | (1L << MINUS_MINUS) | (1L << NOT) | (1L << PLUS) | (1L << MINUS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(491);
				unaryExpr();
				}
				break;
			case IN:
			case JADID:
			case KHALI:
			case DOROST:
			case GHALAT:
			case SEFR_BOOD:
			case MAHDOODE_NADOROST:
			case JADVAL_KHALI:
			case GHEIRE_MOJAZ:
			case LPAREN:
			case FLOAT:
			case INT:
			case STRING:
			case CHAR:
			case CLASS_ID:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(492);
				postfixExpr();
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

	public static class PostfixExprContext extends ParserRuleContext {
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public List<PostfixPartContext> postfixPart() {
			return getRuleContexts(PostfixPartContext.class);
		}
		public PostfixPartContext postfixPart(int i) {
			return getRuleContext(PostfixPartContext.class,i);
		}
		public PostfixIncDecContext postfixIncDec() {
			return getRuleContext(PostfixIncDecContext.class,0);
		}
		public PostfixExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterPostfixExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitPostfixExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitPostfixExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExprContext postfixExpr() throws RecognitionException {
		PostfixExprContext _localctx = new PostfixExprContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_postfixExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			primaryExpr();
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAREN || _la==DOT) {
				{
				{
				setState(496);
				postfixPart();
				}
				}
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS_PLUS || _la==MINUS_MINUS) {
				{
				setState(502);
				postfixIncDec();
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

	public static class PostfixPartContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(HashParser.DOT, 0); }
		public TerminalNode ID() { return getToken(HashParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(HashParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HashParser.RPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public PostfixPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterPostfixPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitPostfixPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitPostfixPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixPartContext postfixPart() throws RecognitionException {
		PostfixPartContext _localctx = new PostfixPartContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_postfixPart);
		int _la;
		try {
			setState(512);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(505);
				match(DOT);
				setState(506);
				match(ID);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(507);
				match(LPAREN);
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << JADID) | (1L << KHALI) | (1L << DOROST) | (1L << GHALAT) | (1L << SEFR_BOOD) | (1L << MAHDOODE_NADOROST) | (1L << JADVAL_KHALI) | (1L << GHEIRE_MOJAZ) | (1L << PLUS_PLUS) | (1L << MINUS_MINUS) | (1L << NOT) | (1L << PLUS) | (1L << MINUS) | (1L << LPAREN))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (FLOAT - 66)) | (1L << (INT - 66)) | (1L << (STRING - 66)) | (1L << (CHAR - 66)) | (1L << (CLASS_ID - 66)) | (1L << (ID - 66)))) != 0)) {
					{
					setState(508);
					argumentList();
					}
				}

				setState(511);
				match(RPAREN);
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

	public static class PostfixIncDecContext extends ParserRuleContext {
		public TerminalNode PLUS_PLUS() { return getToken(HashParser.PLUS_PLUS, 0); }
		public TerminalNode MINUS_MINUS() { return getToken(HashParser.MINUS_MINUS, 0); }
		public PostfixIncDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixIncDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterPostfixIncDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitPostfixIncDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitPostfixIncDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixIncDecContext postfixIncDec() throws RecognitionException {
		PostfixIncDecContext _localctx = new PostfixIncDecContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_postfixIncDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			_la = _input.LA(1);
			if ( !(_la==PLUS_PLUS || _la==MINUS_MINUS) ) {
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

	public static class IncDecExprContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public PostfixIncDecContext postfixIncDec() {
			return getRuleContext(PostfixIncDecContext.class,0);
		}
		public TerminalNode PLUS_PLUS() { return getToken(HashParser.PLUS_PLUS, 0); }
		public TerminalNode MINUS_MINUS() { return getToken(HashParser.MINUS_MINUS, 0); }
		public IncDecExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incDecExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterIncDecExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitIncDecExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitIncDecExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncDecExprContext incDecExpr() throws RecognitionException {
		IncDecExprContext _localctx = new IncDecExprContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_incDecExpr);
		int _la;
		try {
			setState(521);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IN:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(516);
				lvalue();
				setState(517);
				postfixIncDec();
				}
				break;
			case PLUS_PLUS:
			case MINUS_MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(519);
				_la = _input.LA(1);
				if ( !(_la==PLUS_PLUS || _la==MINUS_MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(520);
				lvalue();
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

	public static class PrimaryExprContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode ID() { return getToken(HashParser.ID, 0); }
		public TerminalNode IN() { return getToken(HashParser.IN, 0); }
		public ObjectCreationContext objectCreation() {
			return getRuleContext(ObjectCreationContext.class,0);
		}
		public ExceptionCreationContext exceptionCreation() {
			return getRuleContext(ExceptionCreationContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(HashParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HashParser.RPAREN, 0); }
		public PrimaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterPrimaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitPrimaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitPrimaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExprContext primaryExpr() throws RecognitionException {
		PrimaryExprContext _localctx = new PrimaryExprContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_primaryExpr);
		try {
			setState(532);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KHALI:
			case DOROST:
			case GHALAT:
			case FLOAT:
			case INT:
			case STRING:
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(523);
				literal();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(524);
				match(ID);
				}
				break;
			case IN:
				enterOuterAlt(_localctx, 3);
				{
				setState(525);
				match(IN);
				}
				break;
			case JADID:
				enterOuterAlt(_localctx, 4);
				{
				setState(526);
				objectCreation();
				}
				break;
			case SEFR_BOOD:
			case MAHDOODE_NADOROST:
			case JADVAL_KHALI:
			case GHEIRE_MOJAZ:
			case CLASS_ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(527);
				exceptionCreation();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 6);
				{
				setState(528);
				match(LPAREN);
				setState(529);
				expr();
				setState(530);
				match(RPAREN);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(HashParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(HashParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(HashParser.STRING, 0); }
		public TerminalNode CHAR() { return getToken(HashParser.CHAR, 0); }
		public TerminalNode DOROST() { return getToken(HashParser.DOROST, 0); }
		public TerminalNode GHALAT() { return getToken(HashParser.GHALAT, 0); }
		public TerminalNode KHALI() { return getToken(HashParser.KHALI, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HashListener ) ((HashListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HashVisitor ) return ((HashVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			_la = _input.LA(1);
			if ( !(((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (KHALI - 14)) | (1L << (DOROST - 14)) | (1L << (GHALAT - 14)) | (1L << (FLOAT - 14)) | (1L << (INT - 14)) | (1L << (STRING - 14)) | (1L << (CHAR - 14)))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3L\u021b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\3\2\5\2~\n\2\3\2\7\2\u0081\n\2\f\2\16\2\u0084\13\2\3\2\7\2\u0087"+
		"\n\2\f\2\16\2\u008a\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4\u0096"+
		"\n\4\3\4\3\4\3\5\3\5\3\5\7\5\u009d\n\5\f\5\16\5\u00a0\13\5\3\6\3\6\3\7"+
		"\3\7\3\7\5\7\u00a7\n\7\3\b\3\b\5\b\u00ab\n\b\3\t\3\t\3\t\5\t\u00b0\n\t"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u00b8\n\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\5\f\u00c0\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u00c7\n\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\5\16\u00d0\n\16\3\16\3\16\3\16\3\17\3\17\3\17\7\17\u00d8\n"+
		"\17\f\17\16\17\u00db\13\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\7\21\u00e4"+
		"\n\21\f\21\16\21\u00e7\13\21\3\21\3\21\3\22\3\22\3\22\5\22\u00ee\n\22"+
		"\3\23\3\23\7\23\u00f2\n\23\f\23\16\23\u00f5\13\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u0108\n\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\5\27\u0113\n"+
		"\27\3\27\3\27\3\27\7\27\u0118\n\27\f\27\16\27\u011b\13\27\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0127\n\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\5\33\u0132\n\33\3\33\3\33\5\33\u0136\n"+
		"\33\3\33\3\33\5\33\u013a\n\33\3\33\3\33\3\33\3\34\3\34\3\34\5\34\u0142"+
		"\n\34\3\35\3\35\5\35\u0146\n\35\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u014e"+
		"\n\36\f\36\16\36\u0151\13\36\3\36\5\36\u0154\n\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3!\3!\3!\6!\u0162\n!\r!\16!\u0163\3!\5!\u0167\n!\3"+
		"!\3!\3!\3!\5!\u016d\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\5$\u017b"+
		"\n$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3("+
		"\3(\3)\3)\3)\3)\3*\3*\5*\u0198\n*\3+\3+\3+\3,\3,\3-\3-\3-\5-\u01a2\n-"+
		"\3-\3-\3.\3.\3.\3.\5.\u01aa\n.\3.\3.\3/\3/\3/\7/\u01b1\n/\f/\16/\u01b4"+
		"\13/\3\60\3\60\3\61\3\61\3\61\7\61\u01bb\n\61\f\61\16\61\u01be\13\61\3"+
		"\62\3\62\3\62\7\62\u01c3\n\62\f\62\16\62\u01c6\13\62\3\63\3\63\3\63\7"+
		"\63\u01cb\n\63\f\63\16\63\u01ce\13\63\3\64\3\64\3\64\7\64\u01d3\n\64\f"+
		"\64\16\64\u01d6\13\64\3\65\3\65\3\65\7\65\u01db\n\65\f\65\16\65\u01de"+
		"\13\65\3\66\3\66\3\66\7\66\u01e3\n\66\f\66\16\66\u01e6\13\66\3\67\3\67"+
		"\3\67\5\67\u01eb\n\67\38\38\38\58\u01f0\n8\39\39\79\u01f4\n9\f9\169\u01f7"+
		"\139\39\59\u01fa\n9\3:\3:\3:\3:\5:\u0200\n:\3:\5:\u0203\n:\3;\3;\3<\3"+
		"<\3<\3<\3<\5<\u020c\n<\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u0217\n=\3>\3>\3"+
		">\2\2?\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<"+
		">@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz\2\r\3\2HI\3\2\n\16\4\2\'*\64\64\4\2#"+
		"&HH\3\2./\4\2\60\61\65\66\3\289\3\2:<\4\2+,\679\3\2+,\4\2\20\22DG\2\u0223"+
		"\2}\3\2\2\2\4\u008d\3\2\2\2\6\u0091\3\2\2\2\b\u0099\3\2\2\2\n\u00a1\3"+
		"\2\2\2\f\u00a6\3\2\2\2\16\u00aa\3\2\2\2\20\u00af\3\2\2\2\22\u00b1\3\2"+
		"\2\2\24\u00b3\3\2\2\2\26\u00bb\3\2\2\2\30\u00c1\3\2\2\2\32\u00cb\3\2\2"+
		"\2\34\u00d4\3\2\2\2\36\u00dc\3\2\2\2 \u00df\3\2\2\2\"\u00ed\3\2\2\2$\u00ef"+
		"\3\2\2\2&\u0107\3\2\2\2(\u0109\3\2\2\2*\u010c\3\2\2\2,\u0112\3\2\2\2."+
		"\u011c\3\2\2\2\60\u011e\3\2\2\2\62\u0128\3\2\2\2\64\u012e\3\2\2\2\66\u0141"+
		"\3\2\2\28\u0145\3\2\2\2:\u0147\3\2\2\2<\u0157\3\2\2\2>\u015b\3\2\2\2@"+
		"\u016c\3\2\2\2B\u016e\3\2\2\2D\u0175\3\2\2\2F\u0178\3\2\2\2H\u017e\3\2"+
		"\2\2J\u0181\3\2\2\2L\u0184\3\2\2\2N\u018a\3\2\2\2P\u0191\3\2\2\2R\u0197"+
		"\3\2\2\2T\u0199\3\2\2\2V\u019c\3\2\2\2X\u019e\3\2\2\2Z\u01a5\3\2\2\2\\"+
		"\u01ad\3\2\2\2^\u01b5\3\2\2\2`\u01b7\3\2\2\2b\u01bf\3\2\2\2d\u01c7\3\2"+
		"\2\2f\u01cf\3\2\2\2h\u01d7\3\2\2\2j\u01df\3\2\2\2l\u01e7\3\2\2\2n\u01ef"+
		"\3\2\2\2p\u01f1\3\2\2\2r\u0202\3\2\2\2t\u0204\3\2\2\2v\u020b\3\2\2\2x"+
		"\u0216\3\2\2\2z\u0218\3\2\2\2|~\5\4\3\2}|\3\2\2\2}~\3\2\2\2~\u0082\3\2"+
		"\2\2\177\u0081\5\6\4\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0088\3\2\2\2\u0084\u0082\3\2\2\2\u0085"+
		"\u0087\5\f\7\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2"+
		"\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0088\3\2\2\2\u008b"+
		"\u008c\7\2\2\3\u008c\3\3\2\2\2\u008d\u008e\7\3\2\2\u008e\u008f\5\b\5\2"+
		"\u008f\u0090\7A\2\2\u0090\5\3\2\2\2\u0091\u0092\7\4\2\2\u0092\u0095\5"+
		"\b\5\2\u0093\u0094\7C\2\2\u0094\u0096\7:\2\2\u0095\u0093\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\7A\2\2\u0098\7\3\2\2\2"+
		"\u0099\u009e\5\n\6\2\u009a\u009b\7C\2\2\u009b\u009d\5\n\6\2\u009c\u009a"+
		"\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\t\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\t\2\2\2\u00a2\13\3\2\2\2\u00a3"+
		"\u00a7\5 \21\2\u00a4\u00a7\5\30\r\2\u00a5\u00a7\5\24\13\2\u00a6\u00a3"+
		"\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\r\3\2\2\2\u00a8"+
		"\u00ab\5\22\n\2\u00a9\u00ab\7H\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2"+
		"\2\2\u00ab\17\3\2\2\2\u00ac\u00b0\5\22\n\2\u00ad\u00b0\7\17\2\2\u00ae"+
		"\u00b0\7H\2\2\u00af\u00ac\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2"+
		"\2\2\u00b0\21\3\2\2\2\u00b1\u00b2\t\3\2\2\u00b2\23\3\2\2\2\u00b3\u00b4"+
		"\5\16\b\2\u00b4\u00b7\7I\2\2\u00b5\u00b6\7\64\2\2\u00b6\u00b8\5^\60\2"+
		"\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba"+
		"\7A\2\2\u00ba\25\3\2\2\2\u00bb\u00bc\5\16\b\2\u00bc\u00bf\7I\2\2\u00bd"+
		"\u00be\7\64\2\2\u00be\u00c0\5^\60\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3"+
		"\2\2\2\u00c0\27\3\2\2\2\u00c1\u00c2\7\b\2\2\u00c2\u00c3\5\20\t\2\u00c3"+
		"\u00c4\7I\2\2\u00c4\u00c6\7=\2\2\u00c5\u00c7\5\34\17\2\u00c6\u00c5\3\2"+
		"\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\7>\2\2\u00c9"+
		"\u00ca\5$\23\2\u00ca\31\3\2\2\2\u00cb\u00cc\7\b\2\2\u00cc\u00cd\7H\2\2"+
		"\u00cd\u00cf\7=\2\2\u00ce\u00d0\5\34\17\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0"+
		"\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\7>\2\2\u00d2\u00d3\5$\23\2\u00d3"+
		"\33\3\2\2\2\u00d4\u00d9\5\36\20\2\u00d5\u00d6\7B\2\2\u00d6\u00d8\5\36"+
		"\20\2\u00d7\u00d5\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9"+
		"\u00da\3\2\2\2\u00da\35\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\5\16\b"+
		"\2\u00dd\u00de\7I\2\2\u00de\37\3\2\2\2\u00df\u00e0\7\5\2\2\u00e0\u00e1"+
		"\7H\2\2\u00e1\u00e5\7?\2\2\u00e2\u00e4\5\"\22\2\u00e3\u00e2\3\2\2\2\u00e4"+
		"\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8\3\2"+
		"\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\7@\2\2\u00e9!\3\2\2\2\u00ea\u00ee"+
		"\5\24\13\2\u00eb\u00ee\5\30\r\2\u00ec\u00ee\5\32\16\2\u00ed\u00ea\3\2"+
		"\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee#\3\2\2\2\u00ef\u00f3"+
		"\7?\2\2\u00f0\u00f2\5&\24\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f3\3\2"+
		"\2\2\u00f6\u00f7\7@\2\2\u00f7%\3\2\2\2\u00f8\u0108\5$\23\2\u00f9\u0108"+
		"\5\24\13\2\u00fa\u0108\5(\25\2\u00fb\u0108\5\60\31\2\u00fc\u0108\5\62"+
		"\32\2\u00fd\u0108\5\64\33\2\u00fe\u0108\5:\36\2\u00ff\u0108\5@!\2\u0100"+
		"\u0108\5F$\2\u0101\u0108\5H%\2\u0102\u0108\5J&\2\u0103\u0108\5L\'\2\u0104"+
		"\u0108\5N(\2\u0105\u0108\5P)\2\u0106\u0108\5T+\2\u0107\u00f8\3\2\2\2\u0107"+
		"\u00f9\3\2\2\2\u0107\u00fa\3\2\2\2\u0107\u00fb\3\2\2\2\u0107\u00fc\3\2"+
		"\2\2\u0107\u00fd\3\2\2\2\u0107\u00fe\3\2\2\2\u0107\u00ff\3\2\2\2\u0107"+
		"\u0100\3\2\2\2\u0107\u0101\3\2\2\2\u0107\u0102\3\2\2\2\u0107\u0103\3\2"+
		"\2\2\u0107\u0104\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0106\3\2\2\2\u0108"+
		"\'\3\2\2\2\u0109\u010a\5*\26\2\u010a\u010b\7A\2\2\u010b)\3\2\2\2\u010c"+
		"\u010d\5,\27\2\u010d\u010e\5.\30\2\u010e\u010f\5^\60\2\u010f+\3\2\2\2"+
		"\u0110\u0111\7\6\2\2\u0111\u0113\7C\2\2\u0112\u0110\3\2\2\2\u0112\u0113"+
		"\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0119\7I\2\2\u0115\u0116\7C\2\2\u0116"+
		"\u0118\7I\2\2\u0117\u0115\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2"+
		"\2\2\u0119\u011a\3\2\2\2\u011a-\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011d"+
		"\t\4\2\2\u011d/\3\2\2\2\u011e\u011f\7\23\2\2\u011f\u0120\7=\2\2\u0120"+
		"\u0121\5^\60\2\u0121\u0122\7>\2\2\u0122\u0123\7\24\2\2\u0123\u0126\5$"+
		"\23\2\u0124\u0125\7\25\2\2\u0125\u0127\5$\23\2\u0126\u0124\3\2\2\2\u0126"+
		"\u0127\3\2\2\2\u0127\61\3\2\2\2\u0128\u0129\7\26\2\2\u0129\u012a\7=\2"+
		"\2\u012a\u012b\5^\60\2\u012b\u012c\7>\2\2\u012c\u012d\5$\23\2\u012d\63"+
		"\3\2\2\2\u012e\u012f\7\27\2\2\u012f\u0131\7=\2\2\u0130\u0132\5\66\34\2"+
		"\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0135"+
		"\7A\2\2\u0134\u0136\5^\60\2\u0135\u0134\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0137\3\2\2\2\u0137\u0139\7A\2\2\u0138\u013a\58\35\2\u0139\u0138\3\2"+
		"\2\2\u0139\u013a\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\7>\2\2\u013c"+
		"\u013d\5$\23\2\u013d\65\3\2\2\2\u013e\u0142\5\26\f\2\u013f\u0142\5*\26"+
		"\2\u0140\u0142\5v<\2\u0141\u013e\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0140"+
		"\3\2\2\2\u0142\67\3\2\2\2\u0143\u0146\5*\26\2\u0144\u0146\5v<\2\u0145"+
		"\u0143\3\2\2\2\u0145\u0144\3\2\2\2\u01469\3\2\2\2\u0147\u0148\7\32\2\2"+
		"\u0148\u0149\7=\2\2\u0149\u014a\5^\60\2\u014a\u014b\7>\2\2\u014b\u014f"+
		"\7?\2\2\u014c\u014e\5<\37\2\u014d\u014c\3\2\2\2\u014e\u0151\3\2\2\2\u014f"+
		"\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2"+
		"\2\2\u0152\u0154\5> \2\u0153\u0152\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155"+
		"\3\2\2\2\u0155\u0156\7@\2\2\u0156;\3\2\2\2\u0157\u0158\7\33\2\2\u0158"+
		"\u0159\5^\60\2\u0159\u015a\5$\23\2\u015a=\3\2\2\2\u015b\u015c\7\34\2\2"+
		"\u015c\u015d\5$\23\2\u015d?\3\2\2\2\u015e\u015f\7\35\2\2\u015f\u0161\5"+
		"$\23\2\u0160\u0162\5B\"\2\u0161\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163"+
		"\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0166\3\2\2\2\u0165\u0167\5D"+
		"#\2\u0166\u0165\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u016d\3\2\2\2\u0168"+
		"\u0169\7\35\2\2\u0169\u016a\5$\23\2\u016a\u016b\5D#\2\u016b\u016d\3\2"+
		"\2\2\u016c\u015e\3\2\2\2\u016c\u0168\3\2\2\2\u016dA\3\2\2\2\u016e\u016f"+
		"\7\36\2\2\u016f\u0170\7=\2\2\u0170\u0171\5V,\2\u0171\u0172\7I\2\2\u0172"+
		"\u0173\7>\2\2\u0173\u0174\5$\23\2\u0174C\3\2\2\2\u0175\u0176\7\37\2\2"+
		"\u0176\u0177\5$\23\2\u0177E\3\2\2\2\u0178\u017a\7\t\2\2\u0179\u017b\5"+
		"^\60\2\u017a\u0179\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017c\3\2\2\2\u017c"+
		"\u017d\7A\2\2\u017dG\3\2\2\2\u017e\u017f\7\30\2\2\u017f\u0180\7A\2\2\u0180"+
		"I\3\2\2\2\u0181\u0182\7\31\2\2\u0182\u0183\7A\2\2\u0183K\3\2\2\2\u0184"+
		"\u0185\7!\2\2\u0185\u0186\7=\2\2\u0186\u0187\5^\60\2\u0187\u0188\7>\2"+
		"\2\u0188\u0189\7A\2\2\u0189M\3\2\2\2\u018a\u018b\7\"\2\2\u018b\u018c\7"+
		"=\2\2\u018c\u018d\5\22\n\2\u018d\u018e\7I\2\2\u018e\u018f\7>\2\2\u018f"+
		"\u0190\7A\2\2\u0190O\3\2\2\2\u0191\u0192\7 \2\2\u0192\u0193\5R*\2\u0193"+
		"\u0194\7A\2\2\u0194Q\3\2\2\2\u0195\u0198\5X-\2\u0196\u0198\7I\2\2\u0197"+
		"\u0195\3\2\2\2\u0197\u0196\3\2\2\2\u0198S\3\2\2\2\u0199\u019a\5^\60\2"+
		"\u019a\u019b\7A\2\2\u019bU\3\2\2\2\u019c\u019d\t\5\2\2\u019dW\3\2\2\2"+
		"\u019e\u019f\5V,\2\u019f\u01a1\7=\2\2\u01a0\u01a2\5\\/\2\u01a1\u01a0\3"+
		"\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\7>\2\2\u01a4"+
		"Y\3\2\2\2\u01a5\u01a6\7\7\2\2\u01a6\u01a7\7H\2\2\u01a7\u01a9\7=\2\2\u01a8"+
		"\u01aa\5\\/\2\u01a9\u01a8\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\3\2"+
		"\2\2\u01ab\u01ac\7>\2\2\u01ac[\3\2\2\2\u01ad\u01b2\5^\60\2\u01ae\u01af"+
		"\7B\2\2\u01af\u01b1\5^\60\2\u01b0\u01ae\3\2\2\2\u01b1\u01b4\3\2\2\2\u01b2"+
		"\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3]\3\2\2\2\u01b4\u01b2\3\2\2\2"+
		"\u01b5\u01b6\5`\61\2\u01b6_\3\2\2\2\u01b7\u01bc\5b\62\2\u01b8\u01b9\7"+
		"\63\2\2\u01b9\u01bb\5b\62\2\u01ba\u01b8\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc"+
		"\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bda\3\2\2\2\u01be\u01bc\3\2\2\2"+
		"\u01bf\u01c4\5d\63\2\u01c0\u01c1\7\62\2\2\u01c1\u01c3\5d\63\2\u01c2\u01c0"+
		"\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5"+
		"c\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7\u01cc\5f\64\2\u01c8\u01c9\t\6\2\2"+
		"\u01c9\u01cb\5f\64\2\u01ca\u01c8\3\2\2\2\u01cb\u01ce\3\2\2\2\u01cc\u01ca"+
		"\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cde\3\2\2\2\u01ce\u01cc\3\2\2\2\u01cf"+
		"\u01d4\5h\65\2\u01d0\u01d1\t\7\2\2\u01d1\u01d3\5h\65\2\u01d2\u01d0\3\2"+
		"\2\2\u01d3\u01d6\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5"+
		"g\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d7\u01dc\5j\66\2\u01d8\u01d9\t\b\2\2"+
		"\u01d9\u01db\5j\66\2\u01da\u01d8\3\2\2\2\u01db\u01de\3\2\2\2\u01dc\u01da"+
		"\3\2\2\2\u01dc\u01dd\3\2\2\2\u01ddi\3\2\2\2\u01de\u01dc\3\2\2\2\u01df"+
		"\u01e4\5l\67\2\u01e0\u01e1\t\t\2\2\u01e1\u01e3\5l\67\2\u01e2\u01e0\3\2"+
		"\2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5"+
		"k\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7\u01ea\5n8\2\u01e8\u01e9\7-\2\2\u01e9"+
		"\u01eb\5l\67\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01ebm\3\2\2\2"+
		"\u01ec\u01ed\t\n\2\2\u01ed\u01f0\5n8\2\u01ee\u01f0\5p9\2\u01ef\u01ec\3"+
		"\2\2\2\u01ef\u01ee\3\2\2\2\u01f0o\3\2\2\2\u01f1\u01f5\5x=\2\u01f2\u01f4"+
		"\5r:\2\u01f3\u01f2\3\2\2\2\u01f4\u01f7\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5"+
		"\u01f6\3\2\2\2\u01f6\u01f9\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f8\u01fa\5t"+
		";\2\u01f9\u01f8\3\2\2\2\u01f9\u01fa\3\2\2\2\u01faq\3\2\2\2\u01fb\u01fc"+
		"\7C\2\2\u01fc\u0203\7I\2\2\u01fd\u01ff\7=\2\2\u01fe\u0200\5\\/\2\u01ff"+
		"\u01fe\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0203\7>"+
		"\2\2\u0202\u01fb\3\2\2\2\u0202\u01fd\3\2\2\2\u0203s\3\2\2\2\u0204\u0205"+
		"\t\13\2\2\u0205u\3\2\2\2\u0206\u0207\5,\27\2\u0207\u0208\5t;\2\u0208\u020c"+
		"\3\2\2\2\u0209\u020a\t\13\2\2\u020a\u020c\5,\27\2\u020b\u0206\3\2\2\2"+
		"\u020b\u0209\3\2\2\2\u020cw\3\2\2\2\u020d\u0217\5z>\2\u020e\u0217\7I\2"+
		"\2\u020f\u0217\7\6\2\2\u0210\u0217\5Z.\2\u0211\u0217\5X-\2\u0212\u0213"+
		"\7=\2\2\u0213\u0214\5^\60\2\u0214\u0215\7>\2\2\u0215\u0217\3\2\2\2\u0216"+
		"\u020d\3\2\2\2\u0216\u020e\3\2\2\2\u0216\u020f\3\2\2\2\u0216\u0210\3\2"+
		"\2\2\u0216\u0211\3\2\2\2\u0216\u0212\3\2\2\2\u0217y\3\2\2\2\u0218\u0219"+
		"\t\f\2\2\u0219{\3\2\2\2\63}\u0082\u0088\u0095\u009e\u00a6\u00aa\u00af"+
		"\u00b7\u00bf\u00c6\u00cf\u00d9\u00e5\u00ed\u00f3\u0107\u0112\u0119\u0126"+
		"\u0131\u0135\u0139\u0141\u0145\u014f\u0153\u0163\u0166\u016c\u017a\u0197"+
		"\u01a1\u01a9\u01b2\u01bc\u01c4\u01cc\u01d4\u01dc\u01e4\u01ea\u01ef\u01f5"+
		"\u01f9\u01ff\u0202\u020b\u0216";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}