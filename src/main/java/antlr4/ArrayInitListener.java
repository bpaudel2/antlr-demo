package antlr4;// Generated from ArrayInit.g4 by ANTLR 4.0

import org.antlr.v4.runtime.tree.ParseTreeListener;

public interface ArrayInitListener extends ParseTreeListener {
	void enterInit(ArrayInitParser.InitContext ctx);
	void exitInit(ArrayInitParser.InitContext ctx);

	void enterValue(ArrayInitParser.ValueContext ctx);
	void exitValue(ArrayInitParser.ValueContext ctx);
}