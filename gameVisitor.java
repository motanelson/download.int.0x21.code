// Generated from game.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gameParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gameVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gameParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(gameParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link gameParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(gameParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link gameParser#create}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate(gameParser.CreateContext ctx);
	/**
	 * Visit a parse tree produced by {@link gameParser#move}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMove(gameParser.MoveContext ctx);
	/**
	 * Visit a parse tree produced by {@link gameParser#limits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimits(gameParser.LimitsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gameParser#eixo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEixo(gameParser.EixoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gameParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(gameParser.ValueContext ctx);
}