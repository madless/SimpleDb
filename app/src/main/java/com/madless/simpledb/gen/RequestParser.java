// Generated from /Users/madless/IdeaProjects/ParserANTLR/src/main/RequestParser.g4 by ANTLR 4.7
package com.madless.simpledb.gen;

import com.madless.simpledb.statement.*;
import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RequestParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EOL=1, COMMA=2, ANY=3, FROM=4, SELECT=5, WHERE=6, WHITESPACE=7, OPERATOR=8, 
		VALUE=9, NAME=10, STRING=11, NUMBER=12, DIGIT=13, CHARACTER=14, LETTER=15;
	public static final int
		RULE_parse = 0, RULE_sql_statement = 1, RULE_select_statement = 2, RULE_columns_list = 3, 
		RULE_expression = 4, RULE_table_name = 5, RULE_column_name = 6;
	public static final String[] ruleNames = {
		"parse", "sql_statement", "select_statement", "columns_list", "expression", 
		"table_name", "column_name"
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

	@Override
	public String getGrammarFileName() { return "RequestParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RequestParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public Statement statement;
		public Sql_statementContext sql_statement;
		public Sql_statementContext sql_statement() {
			return getRuleContext(Sql_statementContext.class,0);
		}
		public TerminalNode EOL() { return getToken(RequestParser.EOL, 0); }
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RequestParserListener ) ((RequestParserListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RequestParserListener ) ((RequestParserListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RequestParserVisitor ) return ((RequestParserVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			((ParseContext)_localctx).sql_statement = sql_statement();
			setState(15);
			match(EOL);
			((ParseContext)_localctx).statement =  ((ParseContext)_localctx).sql_statement.statement;
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

	public static class Sql_statementContext extends ParserRuleContext {
		public Statement statement;
		public Select_statementContext select_statement;
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public Sql_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RequestParserListener ) ((RequestParserListener)listener).enterSql_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RequestParserListener ) ((RequestParserListener)listener).exitSql_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RequestParserVisitor ) return ((RequestParserVisitor<? extends T>)visitor).visitSql_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_statementContext sql_statement() throws RecognitionException {
		Sql_statementContext _localctx = new Sql_statementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sql_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			((Sql_statementContext)_localctx).select_statement = select_statement();
			((Sql_statementContext)_localctx).statement =  ((Sql_statementContext)_localctx).select_statement.statement;
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

	public static class Select_statementContext extends ParserRuleContext {
		public Statement statement;
		public Columns_listContext columns_list;
		public Table_nameContext table_name;
		public TerminalNode SELECT() { return getToken(RequestParser.SELECT, 0); }
		public Columns_listContext columns_list() {
			return getRuleContext(Columns_listContext.class,0);
		}
		public TerminalNode FROM() { return getToken(RequestParser.FROM, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(RequestParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Select_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RequestParserListener ) ((RequestParserListener)listener).enterSelect_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RequestParserListener ) ((RequestParserListener)listener).exitSelect_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RequestParserVisitor ) return ((RequestParserVisitor<? extends T>)visitor).visitSelect_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_statementContext select_statement() throws RecognitionException {
		Select_statementContext _localctx = new Select_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_select_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			match(SELECT);
			setState(22);
			((Select_statementContext)_localctx).columns_list = columns_list();
			setState(23);
			match(FROM);
			setState(24);
			((Select_statementContext)_localctx).table_name = table_name();
			setState(25);
			match(WHERE);
			setState(26);
			expression(0);
			((Select_statementContext)_localctx).statement =  new SelectStatement((((Select_statementContext)_localctx).table_name!=null?_input.getText(((Select_statementContext)_localctx).table_name.start,((Select_statementContext)_localctx).table_name.stop):null), ((Select_statementContext)_localctx).columns_list.defFields, "");
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

	public static class Columns_listContext extends ParserRuleContext {
		public List<String> defFields;
		public Column_nameContext column_name;
		public TerminalNode ANY() { return getToken(RequestParser.ANY, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RequestParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RequestParser.COMMA, i);
		}
		public Columns_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columns_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RequestParserListener ) ((RequestParserListener)listener).enterColumns_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RequestParserListener ) ((RequestParserListener)listener).exitColumns_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RequestParserVisitor ) return ((RequestParserVisitor<? extends T>)visitor).visitColumns_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Columns_listContext columns_list() throws RecognitionException {
		Columns_listContext _localctx = new Columns_listContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_columns_list);
		((Columns_listContext)_localctx).defFields =  new LinkedList<String>();
		int _la;
		try {
			setState(41);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANY:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				match(ANY);
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(37);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						{
						setState(30);
						((Columns_listContext)_localctx).column_name = column_name();
						_localctx.defFields.add((((Columns_listContext)_localctx).column_name!=null?_input.getText(((Columns_listContext)_localctx).column_name.start,((Columns_listContext)_localctx).column_name.stop):null));
						}
						}
						break;
					case 2:
						{
						{
						setState(33);
						((Columns_listContext)_localctx).column_name = column_name();
						setState(34);
						match(COMMA);
						_localctx.defFields.add((((Columns_listContext)_localctx).column_name!=null?_input.getText(((Columns_listContext)_localctx).column_name.start,((Columns_listContext)_localctx).column_name.stop):null));
						}
						}
						break;
					}
					}
					setState(39); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME );
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(RequestParser.NAME, 0); }
		public TerminalNode OPERATOR() { return getToken(RequestParser.OPERATOR, 0); }
		public TerminalNode VALUE() { return getToken(RequestParser.VALUE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RequestParserListener ) ((RequestParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RequestParserListener ) ((RequestParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RequestParserVisitor ) return ((RequestParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(44);
			match(NAME);
			setState(45);
			match(OPERATOR);
			setState(46);
			match(VALUE);
			}
			_ctx.stop = _input.LT(-1);
			setState(53);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(48);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(49);
					match(OPERATOR);
					setState(50);
					expression(2);
					}
					} 
				}
				setState(55);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Table_nameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(RequestParser.NAME, 0); }
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RequestParserListener ) ((RequestParserListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RequestParserListener ) ((RequestParserListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RequestParserVisitor ) return ((RequestParserVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(NAME);
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

	public static class Column_nameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(RequestParser.NAME, 0); }
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RequestParserListener ) ((RequestParserListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RequestParserListener ) ((RequestParserListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RequestParserVisitor ) return ((RequestParserVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(NAME);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21?\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5("+
		"\n\5\r\5\16\5)\5\5,\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\66\n\6\f\6"+
		"\16\69\13\6\3\7\3\7\3\b\3\b\3\b\2\3\n\t\2\4\6\b\n\f\16\2\2\2;\2\20\3\2"+
		"\2\2\4\24\3\2\2\2\6\27\3\2\2\2\b+\3\2\2\2\n-\3\2\2\2\f:\3\2\2\2\16<\3"+
		"\2\2\2\20\21\5\4\3\2\21\22\7\3\2\2\22\23\b\2\1\2\23\3\3\2\2\2\24\25\5"+
		"\6\4\2\25\26\b\3\1\2\26\5\3\2\2\2\27\30\7\7\2\2\30\31\5\b\5\2\31\32\7"+
		"\6\2\2\32\33\5\f\7\2\33\34\7\b\2\2\34\35\5\n\6\2\35\36\b\4\1\2\36\7\3"+
		"\2\2\2\37,\7\5\2\2 !\5\16\b\2!\"\b\5\1\2\"(\3\2\2\2#$\5\16\b\2$%\7\4\2"+
		"\2%&\b\5\1\2&(\3\2\2\2\' \3\2\2\2\'#\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3"+
		"\2\2\2*,\3\2\2\2+\37\3\2\2\2+\'\3\2\2\2,\t\3\2\2\2-.\b\6\1\2./\7\f\2\2"+
		"/\60\7\n\2\2\60\61\7\13\2\2\61\67\3\2\2\2\62\63\f\3\2\2\63\64\7\n\2\2"+
		"\64\66\5\n\6\4\65\62\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\13"+
		"\3\2\2\29\67\3\2\2\2:;\7\f\2\2;\r\3\2\2\2<=\7\f\2\2=\17\3\2\2\2\6\')+"+
		"\67";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}