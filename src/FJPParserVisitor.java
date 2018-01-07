package src;// Generated from C:/Users/hp/Desktop/Skola/ZS5/FJP/Semestr�lka/fjp\FJPParser.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FJPParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FJPParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FJPParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(FJPParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link FJPParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(FJPParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link FJPParser#globals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobals(FJPParser.GlobalsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FJPParser#procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure(FJPParser.ProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link FJPParser#int_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_var(FJPParser.Int_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link FJPParser#boolean_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_var(FJPParser.Boolean_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link FJPParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(FJPParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FJPParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(FJPParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FJPParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(FJPParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FJPParser#locales}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocales(FJPParser.LocalesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FJPParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(FJPParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link FJPParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(FJPParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FJPParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(FJPParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link FJPParser#re_until}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRe_until(FJPParser.Re_untilContext ctx);
	/**
	 * Visit a parse tree produced by {@link FJPParser#do_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while(FJPParser.Do_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link FJPParser#while_do}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_do(FJPParser.While_doContext ctx);
	/**
	 * Visit a parse tree produced by {@link FJPParser#start_do}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart_do(FJPParser.Start_doContext ctx);
	/**
	 * Visit a parse tree produced by {@link FJPParser#if_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_else(FJPParser.If_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FJPParser#else_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_part(FJPParser.Else_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link FJPParser#assigment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssigment(FJPParser.AssigmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FJPParser#assigment_p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssigment_p(FJPParser.Assigment_pContext ctx);
	/**
	 * Visit a parse tree produced by {@link FJPParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(FJPParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link FJPParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(FJPParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link FJPParser#ids}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIds(FJPParser.IdsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FJPParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(FJPParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FJPParser#simpleExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExp(FJPParser.SimpleExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link FJPParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(FJPParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link FJPParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(FJPParser.MainContext ctx);
}