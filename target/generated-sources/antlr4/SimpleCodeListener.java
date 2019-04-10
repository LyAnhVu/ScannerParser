// Generated from SimpleCode.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleCodeParser}.
 */
public interface SimpleCodeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleCodeParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull SimpleCodeParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleCodeParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull SimpleCodeParser.ProgramContext ctx);
}