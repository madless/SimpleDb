// Generated from /Users/madless/IdeaProjects/ParserANTLR/src/main/RequestParser.g4 by ANTLR 4.7

package com.madless.simpledb.gen;

    import com.madless.simpledb.statement.*;
    import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RequestParser}.
 */
public interface RequestParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RequestParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(RequestParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link RequestParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(RequestParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link RequestParser#sql_statement}.
	 * @param ctx the parse tree
	 */
	void enterSql_statement(RequestParser.Sql_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RequestParser#sql_statement}.
	 * @param ctx the parse tree
	 */
	void exitSql_statement(RequestParser.Sql_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RequestParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelect_statement(RequestParser.Select_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RequestParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelect_statement(RequestParser.Select_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RequestParser#columns_list}.
	 * @param ctx the parse tree
	 */
	void enterColumns_list(RequestParser.Columns_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link RequestParser#columns_list}.
	 * @param ctx the parse tree
	 */
	void exitColumns_list(RequestParser.Columns_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link RequestParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(RequestParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RequestParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(RequestParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RequestParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(RequestParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link RequestParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(RequestParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link RequestParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(RequestParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link RequestParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(RequestParser.Column_nameContext ctx);
}