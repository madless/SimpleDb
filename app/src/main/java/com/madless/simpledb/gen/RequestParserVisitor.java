// Generated from /Users/madless/IdeaProjects/ParserANTLR/src/main/RequestParser.g4 by ANTLR 4.7

package com.madless.simpledb.gen;

    import com.madless.simpledb.statement.*;
    import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RequestParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RequestParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RequestParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(RequestParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link RequestParser#sql_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_statement(RequestParser.Sql_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RequestParser#select_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_statement(RequestParser.Select_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RequestParser#columns_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumns_list(RequestParser.Columns_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link RequestParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(RequestParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RequestParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(RequestParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link RequestParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(RequestParser.Column_nameContext ctx);
}