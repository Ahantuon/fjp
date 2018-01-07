package src;// Generated from C:/Users/hp/Desktop/Skola/ZS5/FJP/Semestr�lka/fjp\FJPParser.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FJPParser}.
 */
public interface FJPParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FJPParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(FJPParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FJPParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(FJPParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link FJPParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(FJPParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link FJPParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(FJPParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link FJPParser#globals}.
	 * @param ctx the parse tree
	 */
	void enterGlobals(FJPParser.GlobalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FJPParser#globals}.
	 * @param ctx the parse tree
	 */
	void exitGlobals(FJPParser.GlobalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FJPParser#procedure}.
	 * @param ctx the parse tree
	 */
	void enterProcedure(FJPParser.ProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link FJPParser#procedure}.
	 * @param ctx the parse tree
	 */
	void exitProcedure(FJPParser.ProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link FJPParser#return_val}.
	 * @param ctx the parse tree
	 */
	void enterReturn_val(FJPParser.Return_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link FJPParser#return_val}.
	 * @param ctx the parse tree
	 */
	void exitReturn_val(FJPParser.Return_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link FJPParser#int_var}.
	 * @param ctx the parse tree
	 */
	void enterInt_var(FJPParser.Int_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link FJPParser#int_var}.
	 * @param ctx the parse tree
	 */
	void exitInt_var(FJPParser.Int_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link FJPParser#boolean_var}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_var(FJPParser.Boolean_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link FJPParser#boolean_var}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_var(FJPParser.Boolean_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link FJPParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(FJPParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FJPParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(FJPParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FJPParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(FJPParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FJPParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(FJPParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FJPParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(FJPParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FJPParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(FJPParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FJPParser#locales}.
	 * @param ctx the parse tree
	 */
	void enterLocales(FJPParser.LocalesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FJPParser#locales}.
	 * @param ctx the parse tree
	 */
	void exitLocales(FJPParser.LocalesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FJPParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(FJPParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link FJPParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(FJPParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link FJPParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(FJPParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FJPParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(FJPParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FJPParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(FJPParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link FJPParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(FJPParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link FJPParser#return_id}.
	 * @param ctx the parse tree
	 */
	void enterReturn_id(FJPParser.Return_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link FJPParser#return_id}.
	 * @param ctx the parse tree
	 */
	void exitReturn_id(FJPParser.Return_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link FJPParser#re_until}.
	 * @param ctx the parse tree
	 */
	void enterRe_until(FJPParser.Re_untilContext ctx);
	/**
	 * Exit a parse tree produced by {@link FJPParser#re_until}.
	 * @param ctx the parse tree
	 */
	void exitRe_until(FJPParser.Re_untilContext ctx);
	/**
	 * Enter a parse tree produced by {@link FJPParser#do_while}.
	 * @param ctx the parse tree
	 */
	void enterDo_while(FJPParser.Do_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link FJPParser#do_while}.
	 * @param ctx the parse tree
	 */
	void exitDo_while(FJPParser.Do_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link FJPParser#while_do}.
	 * @param ctx the parse tree
	 */
	void enterWhile_do(FJPParser.While_doContext ctx);
	/**
	 * Exit a parse tree produced by {@link FJPParser#while_do}.
	 * @param ctx the parse tree
	 */
	void exitWhile_do(FJPParser.While_doContext ctx);
	/**
	 * Enter a parse tree produced by {@link FJPParser#start_do}.
	 * @param ctx the parse tree
	 */
	void enterStart_do(FJPParser.Start_doContext ctx);
	/**
	 * Exit a parse tree produced by {@link FJPParser#start_do}.
	 * @param ctx the parse tree
	 */
	void exitStart_do(FJPParser.Start_doContext ctx);
	/**
	 * Enter a parse tree produced by {@link FJPParser#if_else}.
	 * @param ctx the parse tree
	 */
	void enterIf_else(FJPParser.If_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FJPParser#if_else}.
	 * @param ctx the parse tree
	 */
	void exitIf_else(FJPParser.If_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FJPParser#else_part}.
	 * @param ctx the parse tree
	 */
	void enterElse_part(FJPParser.Else_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link FJPParser#else_part}.
	 * @param ctx the parse tree
	 */
	void exitElse_part(FJPParser.Else_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link FJPParser#assigment}.
	 * @param ctx the parse tree
	 */
	void enterAssigment(FJPParser.AssigmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FJPParser#assigment}.
	 * @param ctx the parse tree
	 */
	void exitAssigment(FJPParser.AssigmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FJPParser#assigment_p}.
	 * @param ctx the parse tree
	 */
	void enterAssigment_p(FJPParser.Assigment_pContext ctx);
	/**
	 * Exit a parse tree produced by {@link FJPParser#assigment_p}.
	 * @param ctx the parse tree
	 */
	void exitAssigment_p(FJPParser.Assigment_pContext ctx);
	/**
	 * Enter a parse tree produced by {@link FJPParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(FJPParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link FJPParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(FJPParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link FJPParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(FJPParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link FJPParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(FJPParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link FJPParser#ids}.
	 * @param ctx the parse tree
	 */
	void enterIds(FJPParser.IdsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FJPParser#ids}.
	 * @param ctx the parse tree
	 */
	void exitIds(FJPParser.IdsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FJPParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(FJPParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FJPParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(FJPParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FJPParser#simpleExp}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExp(FJPParser.SimpleExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link FJPParser#simpleExp}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExp(FJPParser.SimpleExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link FJPParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(FJPParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link FJPParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(FJPParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link FJPParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(FJPParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link FJPParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(FJPParser.MainContext ctx);
}