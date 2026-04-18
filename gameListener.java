// Generated from game.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gameParser}.
 */
public interface gameListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gameParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(gameParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link gameParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(gameParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link gameParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(gameParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link gameParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(gameParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link gameParser#create}.
	 * @param ctx the parse tree
	 */
	void enterCreate(gameParser.CreateContext ctx);
	/**
	 * Exit a parse tree produced by {@link gameParser#create}.
	 * @param ctx the parse tree
	 */
	void exitCreate(gameParser.CreateContext ctx);
	/**
	 * Enter a parse tree produced by {@link gameParser#move}.
	 * @param ctx the parse tree
	 */
	void enterMove(gameParser.MoveContext ctx);
	/**
	 * Exit a parse tree produced by {@link gameParser#move}.
	 * @param ctx the parse tree
	 */
	void exitMove(gameParser.MoveContext ctx);
	/**
	 * Enter a parse tree produced by {@link gameParser#limits}.
	 * @param ctx the parse tree
	 */
	void enterLimits(gameParser.LimitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gameParser#limits}.
	 * @param ctx the parse tree
	 */
	void exitLimits(gameParser.LimitsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gameParser#eixo}.
	 * @param ctx the parse tree
	 */
	void enterEixo(gameParser.EixoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gameParser#eixo}.
	 * @param ctx the parse tree
	 */
	void exitEixo(gameParser.EixoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gameParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(gameParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link gameParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(gameParser.ValueContext ctx);
}