// Generated from /Users/madless/IdeaProjects/ParserANTLR/src/main/RequestParser.g4 by ANTLR 4.7

package com.madless.simpledb.gen;

import com.madless.simpledb.statement.*;
import java.util.*;
import com.madless.simpledb.model.*;

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
		EOL=1, COMMA=2, ANY=3, OPEN_BRACKET=4, CLOSE_BRACKET=5, FROM=6, SELECT=7, 
		WHERE=8, CREATE=9, INSERT=10, INTO=11, VALUES=12, TABLE=13, DROP=14, IF_EXISTS=15, 
		TYPE_TEXT=16, TYPE_INT=17, WHITESPACE=18, OPERATOR=19, LOGIC_OPERATOR=20, 
		VALUE=21, NAME=22, STRING=23, NUMBER=24, DIGIT=25, CHARACTER=26, LETTER=27;
	public static final int
		RULE_parse = 0, RULE_sql_statement = 1, RULE_select_statement = 2, RULE_create_statement = 3, 
		RULE_insert_statement = 4, RULE_drop_statement = 5, RULE_columns_list = 6, 
		RULE_expression = 7, RULE_table_name = 8, RULE_column_name = 9, RULE_column_type = 10, 
		RULE_column_value = 11, RULE_drop_param = 12, RULE_column_values = 13, 
		RULE_column_info = 14, RULE_columns_info = 15;
	public static final String[] ruleNames = {
		"parse", "sql_statement", "select_statement", "create_statement", "insert_statement", 
		"drop_statement", "columns_list", "expression", "table_name", "column_name", 
		"column_type", "column_value", "drop_param", "column_values", "column_info", 
		"columns_info"
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
		public TerminalNode EOF() { return getToken(RequestParser.EOF, 0); }
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
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			((ParseContext)_localctx).sql_statement = sql_statement();
			setState(33);
			match(EOL);
			setState(34);
			match(EOF);
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
		public Create_statementContext create_statement;
		public Insert_statementContext insert_statement;
		public Drop_statementContext drop_statement;
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public Create_statementContext create_statement() {
			return getRuleContext(Create_statementContext.class,0);
		}
		public Insert_statementContext insert_statement() {
			return getRuleContext(Insert_statementContext.class,0);
		}
		public Drop_statementContext drop_statement() {
			return getRuleContext(Drop_statementContext.class,0);
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
	}

	public final Sql_statementContext sql_statement() throws RecognitionException {
		Sql_statementContext _localctx = new Sql_statementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sql_statement);
		try {
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				((Sql_statementContext)_localctx).select_statement = select_statement();
				((Sql_statementContext)_localctx).statement =  ((Sql_statementContext)_localctx).select_statement.statement;
				}
				break;
			case CREATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				((Sql_statementContext)_localctx).create_statement = create_statement();
				((Sql_statementContext)_localctx).statement =  ((Sql_statementContext)_localctx).create_statement.statement;
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				((Sql_statementContext)_localctx).insert_statement = insert_statement();
				((Sql_statementContext)_localctx).statement =  ((Sql_statementContext)_localctx).insert_statement.statement;
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 4);
				{
				setState(46);
				((Sql_statementContext)_localctx).drop_statement = drop_statement();
				((Sql_statementContext)_localctx).statement =  ((Sql_statementContext)_localctx).drop_statement.statement;
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

	public static class Select_statementContext extends ParserRuleContext {
		public Statement statement;
		public Columns_listContext columns_list;
		public Table_nameContext table_name;
		public ExpressionContext expression;
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
	}

	public final Select_statementContext select_statement() throws RecognitionException {
		Select_statementContext _localctx = new Select_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_select_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(SELECT);
			setState(52);
			((Select_statementContext)_localctx).columns_list = columns_list();
			setState(53);
			match(FROM);
			setState(54);
			((Select_statementContext)_localctx).table_name = table_name();
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(55);
				match(WHERE);
				setState(56);
				((Select_statementContext)_localctx).expression = expression(0);
				}
			}

			((Select_statementContext)_localctx).statement =  new SelectStatement((((Select_statementContext)_localctx).table_name!=null?_input.getText(((Select_statementContext)_localctx).table_name.start,((Select_statementContext)_localctx).table_name.stop):null), ((Select_statementContext)_localctx).columns_list.defFields, (((Select_statementContext)_localctx).expression!=null?_input.getText(((Select_statementContext)_localctx).expression.start,((Select_statementContext)_localctx).expression.stop):null) != null ? (((Select_statementContext)_localctx).expression!=null?_input.getText(((Select_statementContext)_localctx).expression.start,((Select_statementContext)_localctx).expression.stop):null) : "");
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

	public static class Create_statementContext extends ParserRuleContext {
		public Statement statement;
		public Table_nameContext table_name;
		public Columns_infoContext columns_info;
		public TerminalNode CREATE() { return getToken(RequestParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(RequestParser.TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(RequestParser.OPEN_BRACKET, 0); }
		public Columns_infoContext columns_info() {
			return getRuleContext(Columns_infoContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(RequestParser.CLOSE_BRACKET, 0); }
		public Create_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RequestParserListener ) ((RequestParserListener)listener).enterCreate_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RequestParserListener ) ((RequestParserListener)listener).exitCreate_statement(this);
		}
	}

	public final Create_statementContext create_statement() throws RecognitionException {
		Create_statementContext _localctx = new Create_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_create_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(CREATE);
			setState(62);
			match(TABLE);
			setState(63);
			((Create_statementContext)_localctx).table_name = table_name();
			setState(64);
			match(OPEN_BRACKET);
			setState(65);
			((Create_statementContext)_localctx).columns_info = columns_info();
			setState(66);
			match(CLOSE_BRACKET);
			((Create_statementContext)_localctx).statement =  new CreateStatement((((Create_statementContext)_localctx).table_name!=null?_input.getText(((Create_statementContext)_localctx).table_name.start,((Create_statementContext)_localctx).table_name.stop):null), ((Create_statementContext)_localctx).columns_info.columns);
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

	public static class Insert_statementContext extends ParserRuleContext {
		public Statement statement;
		public Table_nameContext table_name;
		public Column_valuesContext column_values;
		public TerminalNode INSERT() { return getToken(RequestParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(RequestParser.INTO, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode VALUES() { return getToken(RequestParser.VALUES, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(RequestParser.OPEN_BRACKET, 0); }
		public Column_valuesContext column_values() {
			return getRuleContext(Column_valuesContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(RequestParser.CLOSE_BRACKET, 0); }
		public Insert_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RequestParserListener ) ((RequestParserListener)listener).enterInsert_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RequestParserListener ) ((RequestParserListener)listener).exitInsert_statement(this);
		}
	}

	public final Insert_statementContext insert_statement() throws RecognitionException {
		Insert_statementContext _localctx = new Insert_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_insert_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(INSERT);
			setState(70);
			match(INTO);
			setState(71);
			((Insert_statementContext)_localctx).table_name = table_name();
			setState(72);
			match(VALUES);
			setState(73);
			match(OPEN_BRACKET);
			setState(74);
			((Insert_statementContext)_localctx).column_values = column_values();
			setState(75);
			match(CLOSE_BRACKET);
			((Insert_statementContext)_localctx).statement =  new InsertStatement((((Insert_statementContext)_localctx).table_name!=null?_input.getText(((Insert_statementContext)_localctx).table_name.start,((Insert_statementContext)_localctx).table_name.stop):null), ((Insert_statementContext)_localctx).column_values.values);
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

	public static class Drop_statementContext extends ParserRuleContext {
		public Statement statement;
		public Drop_paramContext drop_param;
		public Table_nameContext table_name;
		public TerminalNode DROP() { return getToken(RequestParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(RequestParser.TABLE, 0); }
		public Drop_paramContext drop_param() {
			return getRuleContext(Drop_paramContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Drop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RequestParserListener ) ((RequestParserListener)listener).enterDrop_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RequestParserListener ) ((RequestParserListener)listener).exitDrop_statement(this);
		}
	}

	public final Drop_statementContext drop_statement() throws RecognitionException {
		Drop_statementContext _localctx = new Drop_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_drop_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(DROP);
			setState(79);
			match(TABLE);
			setState(80);
			((Drop_statementContext)_localctx).drop_param = drop_param();
			setState(81);
			((Drop_statementContext)_localctx).table_name = table_name();
			((Drop_statementContext)_localctx).statement =  new DropStatement((((Drop_statementContext)_localctx).table_name!=null?_input.getText(((Drop_statementContext)_localctx).table_name.start,((Drop_statementContext)_localctx).table_name.stop):null), (((Drop_statementContext)_localctx).drop_param!=null?_input.getText(((Drop_statementContext)_localctx).drop_param.start,((Drop_statementContext)_localctx).drop_param.stop):null));
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
	}

	public final Columns_listContext columns_list() throws RecognitionException {
		Columns_listContext _localctx = new Columns_listContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_columns_list);
		((Columns_listContext)_localctx).defFields =  new LinkedList<String>();
		int _la;
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANY:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(ANY);
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(92); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(92);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						{
						setState(85);
						((Columns_listContext)_localctx).column_name = column_name();
						_localctx.defFields.add((((Columns_listContext)_localctx).column_name!=null?_input.getText(((Columns_listContext)_localctx).column_name.start,((Columns_listContext)_localctx).column_name.stop):null));
						}
						}
						break;
					case 2:
						{
						{
						setState(88);
						((Columns_listContext)_localctx).column_name = column_name();
						setState(89);
						match(COMMA);
						_localctx.defFields.add((((Columns_listContext)_localctx).column_name!=null?_input.getText(((Columns_listContext)_localctx).column_name.start,((Columns_listContext)_localctx).column_name.stop):null));
						}
						}
						break;
					}
					}
					setState(94); 
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
		public List<TerminalNode> NAME() { return getTokens(RequestParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(RequestParser.NAME, i);
		}
		public TerminalNode OPERATOR() { return getToken(RequestParser.OPERATOR, 0); }
		public TerminalNode VALUE() { return getToken(RequestParser.VALUE, 0); }
		public TerminalNode LOGIC_OPERATOR() { return getToken(RequestParser.LOGIC_OPERATOR, 0); }
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
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				{
				setState(99);
				match(NAME);
				setState(100);
				match(OPERATOR);
				setState(101);
				match(VALUE);
				}
				}
				break;
			case 2:
				{
				{
				setState(102);
				match(NAME);
				setState(103);
				match(LOGIC_OPERATOR);
				setState(104);
				match(NAME);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(113);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(107);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(108);
						match(OPERATOR);
						setState(109);
						expression(3);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(110);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(111);
						match(LOGIC_OPERATOR);
						setState(112);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
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
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
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

	public static class Column_typeContext extends ParserRuleContext {
		public TerminalNode TYPE_TEXT() { return getToken(RequestParser.TYPE_TEXT, 0); }
		public TerminalNode TYPE_INT() { return getToken(RequestParser.TYPE_INT, 0); }
		public Column_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RequestParserListener ) ((RequestParserListener)listener).enterColumn_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RequestParserListener ) ((RequestParserListener)listener).exitColumn_type(this);
		}
	}

	public final Column_typeContext column_type() throws RecognitionException {
		Column_typeContext _localctx = new Column_typeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_column_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_la = _input.LA(1);
			if ( !(_la==TYPE_TEXT || _la==TYPE_INT) ) {
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

	public static class Column_valueContext extends ParserRuleContext {
		public TerminalNode VALUE() { return getToken(RequestParser.VALUE, 0); }
		public Column_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RequestParserListener ) ((RequestParserListener)listener).enterColumn_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RequestParserListener ) ((RequestParserListener)listener).exitColumn_value(this);
		}
	}

	public final Column_valueContext column_value() throws RecognitionException {
		Column_valueContext _localctx = new Column_valueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_column_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(VALUE);
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

	public static class Drop_paramContext extends ParserRuleContext {
		public TerminalNode IF_EXISTS() { return getToken(RequestParser.IF_EXISTS, 0); }
		public Drop_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RequestParserListener ) ((RequestParserListener)listener).enterDrop_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RequestParserListener ) ((RequestParserListener)listener).exitDrop_param(this);
		}
	}

	public final Drop_paramContext drop_param() throws RecognitionException {
		Drop_paramContext _localctx = new Drop_paramContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_drop_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF_EXISTS) {
				{
				setState(126);
				match(IF_EXISTS);
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

	public static class Column_valuesContext extends ParserRuleContext {
		public List<String> values;
		public Column_valueContext column_value;
		public List<Column_valueContext> column_value() {
			return getRuleContexts(Column_valueContext.class);
		}
		public Column_valueContext column_value(int i) {
			return getRuleContext(Column_valueContext.class,i);
		}
		public Column_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RequestParserListener ) ((RequestParserListener)listener).enterColumn_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RequestParserListener ) ((RequestParserListener)listener).exitColumn_values(this);
		}
	}

	public final Column_valuesContext column_values() throws RecognitionException {
		Column_valuesContext _localctx = new Column_valuesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_column_values);
		((Column_valuesContext)_localctx).values =  new LinkedList<String>();
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(129);
					((Column_valuesContext)_localctx).column_value = column_value();
					setState(130);
					match(COMMA);
					_localctx.values.add((((Column_valuesContext)_localctx).column_value!=null?_input.getText(((Column_valuesContext)_localctx).column_value.start,((Column_valuesContext)_localctx).column_value.stop):null));
					}
					} 
				}
				setState(137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(138);
			((Column_valuesContext)_localctx).column_value = column_value();
			_localctx.values.add((((Column_valuesContext)_localctx).column_value!=null?_input.getText(((Column_valuesContext)_localctx).column_value.start,((Column_valuesContext)_localctx).column_value.stop):null));
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

	public static class Column_infoContext extends ParserRuleContext {
		public Column column;
		public Column_nameContext column_name;
		public Column_typeContext column_type;
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Column_typeContext column_type() {
			return getRuleContext(Column_typeContext.class,0);
		}
		public Column_infoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_info; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RequestParserListener ) ((RequestParserListener)listener).enterColumn_info(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RequestParserListener ) ((RequestParserListener)listener).exitColumn_info(this);
		}
	}

	public final Column_infoContext column_info() throws RecognitionException {
		Column_infoContext _localctx = new Column_infoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_column_info);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			((Column_infoContext)_localctx).column_name = column_name();
			setState(142);
			((Column_infoContext)_localctx).column_type = column_type();
			((Column_infoContext)_localctx).column =  new Column((((Column_infoContext)_localctx).column_name!=null?_input.getText(((Column_infoContext)_localctx).column_name.start,((Column_infoContext)_localctx).column_name.stop):null), (((Column_infoContext)_localctx).column_type!=null?_input.getText(((Column_infoContext)_localctx).column_type.start,((Column_infoContext)_localctx).column_type.stop):null));
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

	public static class Columns_infoContext extends ParserRuleContext {
		public List<Column> columns;
		public Column_infoContext column_info;
		public List<Column_infoContext> column_info() {
			return getRuleContexts(Column_infoContext.class);
		}
		public Column_infoContext column_info(int i) {
			return getRuleContext(Column_infoContext.class,i);
		}
		public Columns_infoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columns_info; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RequestParserListener ) ((RequestParserListener)listener).enterColumns_info(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RequestParserListener ) ((RequestParserListener)listener).exitColumns_info(this);
		}
	}

	public final Columns_infoContext columns_info() throws RecognitionException {
		Columns_infoContext _localctx = new Columns_infoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_columns_info);
		((Columns_infoContext)_localctx).columns =  new LinkedList<Column>();
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(145);
					((Columns_infoContext)_localctx).column_info = column_info();
					setState(146);
					match(COMMA);
					_localctx.columns.add(((Columns_infoContext)_localctx).column_info.column);
					}
					} 
				}
				setState(153);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(154);
			((Columns_infoContext)_localctx).column_info = column_info();
			_localctx.columns.add(((Columns_infoContext)_localctx).column_info.column);
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
		case 7:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u00a0\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\64\n"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4<\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\6\b_\n\b\r\b\16\b`\5\bc\n\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\tl\n\t\3\t\3\t\3\t\3\t\3\t\3\t\7\tt\n\t\f\t\16\tw\13"+
		"\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\5\16\u0082\n\16\3\17\3\17\3"+
		"\17\3\17\7\17\u0088\n\17\f\17\16\17\u008b\13\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\7\21\u0098\n\21\f\21\16\21\u009b\13"+
		"\21\3\21\3\21\3\21\3\21\2\3\20\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \2\3\3\2\22\23\2\u009c\2\"\3\2\2\2\4\63\3\2\2\2\6\65\3\2\2\2\b?\3"+
		"\2\2\2\nG\3\2\2\2\fP\3\2\2\2\16b\3\2\2\2\20k\3\2\2\2\22x\3\2\2\2\24z\3"+
		"\2\2\2\26|\3\2\2\2\30~\3\2\2\2\32\u0081\3\2\2\2\34\u0089\3\2\2\2\36\u008f"+
		"\3\2\2\2 \u0099\3\2\2\2\"#\5\4\3\2#$\7\3\2\2$%\7\2\2\3%&\b\2\1\2&\3\3"+
		"\2\2\2\'(\5\6\4\2()\b\3\1\2)\64\3\2\2\2*+\5\b\5\2+,\b\3\1\2,\64\3\2\2"+
		"\2-.\5\n\6\2./\b\3\1\2/\64\3\2\2\2\60\61\5\f\7\2\61\62\b\3\1\2\62\64\3"+
		"\2\2\2\63\'\3\2\2\2\63*\3\2\2\2\63-\3\2\2\2\63\60\3\2\2\2\64\5\3\2\2\2"+
		"\65\66\7\t\2\2\66\67\5\16\b\2\678\7\b\2\28;\5\22\n\29:\7\n\2\2:<\5\20"+
		"\t\2;9\3\2\2\2;<\3\2\2\2<=\3\2\2\2=>\b\4\1\2>\7\3\2\2\2?@\7\13\2\2@A\7"+
		"\17\2\2AB\5\22\n\2BC\7\6\2\2CD\5 \21\2DE\7\7\2\2EF\b\5\1\2F\t\3\2\2\2"+
		"GH\7\f\2\2HI\7\r\2\2IJ\5\22\n\2JK\7\16\2\2KL\7\6\2\2LM\5\34\17\2MN\7\7"+
		"\2\2NO\b\6\1\2O\13\3\2\2\2PQ\7\20\2\2QR\7\17\2\2RS\5\32\16\2ST\5\22\n"+
		"\2TU\b\7\1\2U\r\3\2\2\2Vc\7\5\2\2WX\5\24\13\2XY\b\b\1\2Y_\3\2\2\2Z[\5"+
		"\24\13\2[\\\7\4\2\2\\]\b\b\1\2]_\3\2\2\2^W\3\2\2\2^Z\3\2\2\2_`\3\2\2\2"+
		"`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2bV\3\2\2\2b^\3\2\2\2c\17\3\2\2\2de\b\t\1"+
		"\2ef\7\30\2\2fg\7\25\2\2gl\7\27\2\2hi\7\30\2\2ij\7\26\2\2jl\7\30\2\2k"+
		"d\3\2\2\2kh\3\2\2\2lu\3\2\2\2mn\f\4\2\2no\7\25\2\2ot\5\20\t\5pq\f\3\2"+
		"\2qr\7\26\2\2rt\5\20\t\4sm\3\2\2\2sp\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2"+
		"\2\2v\21\3\2\2\2wu\3\2\2\2xy\7\30\2\2y\23\3\2\2\2z{\7\30\2\2{\25\3\2\2"+
		"\2|}\t\2\2\2}\27\3\2\2\2~\177\7\27\2\2\177\31\3\2\2\2\u0080\u0082\7\21"+
		"\2\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082\33\3\2\2\2\u0083\u0084"+
		"\5\30\r\2\u0084\u0085\7\4\2\2\u0085\u0086\b\17\1\2\u0086\u0088\3\2\2\2"+
		"\u0087\u0083\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a"+
		"\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d\5\30\r\2"+
		"\u008d\u008e\b\17\1\2\u008e\35\3\2\2\2\u008f\u0090\5\24\13\2\u0090\u0091"+
		"\5\26\f\2\u0091\u0092\b\20\1\2\u0092\37\3\2\2\2\u0093\u0094\5\36\20\2"+
		"\u0094\u0095\7\4\2\2\u0095\u0096\b\21\1\2\u0096\u0098\3\2\2\2\u0097\u0093"+
		"\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\5\36\20\2\u009d\u009e\b"+
		"\21\1\2\u009e!\3\2\2\2\r\63;^`bksu\u0081\u0089\u0099";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}