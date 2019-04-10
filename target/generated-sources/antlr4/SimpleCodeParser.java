// Generated from SimpleCode.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleCodeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__1=1, T__0=2, BOOLEAN=3, BREAK=4, CALLOUT=5, CLASS=6, CONTINUE=7, ELSE=8, 
		FALSE=9, FOR=10, IF=11, INT=12, RETURN=13, TRUE=14, VOID=15, PROGRAM=16, 
		Field_decl=17, Method_decl=18, Block=19, Var_decl=20, Type=21, Statement=22, 
		Assign_op=23, Method_call=24, Method_name=25, Location=26, Expr=27, Callout_arg=28, 
		Bin_op=29, Arith_op=30, Rel_op=31, Eq_op=32, Cond_op=33, Literal=34, IDENTIFIER=35, 
		Alpha_num=36, Alpha=37, Digit=38, Hex_digit=39, INTLITERAL=40, Decimal_literal=41, 
		Hex_literal=42, BOOLEANLITERAL=43, CHARLITERAL=44, STRINGLITERAL=45, WS=46, 
		COMMENT=47, LINE_COMMENT=48, Char=49;
	public static final String[] tokenNames = {
		"<INVALID>", "'{'", "'}'", "'boolean'", "'break'", "'callout'", "'class'", 
		"'continue'", "'else'", "'false'", "'for'", "'if'", "'int'", "'return'", 
		"'true'", "'void'", "'Program'", "Field_decl", "Method_decl", "Block", 
		"Var_decl", "Type", "Statement", "Assign_op", "Method_call", "Method_name", 
		"Location", "Expr", "Callout_arg", "Bin_op", "Arith_op", "Rel_op", "Eq_op", 
		"Cond_op", "Literal", "IDENTIFIER", "Alpha_num", "Alpha", "Digit", "Hex_digit", 
		"INTLITERAL", "Decimal_literal", "Hex_literal", "BOOLEANLITERAL", "CHARLITERAL", 
		"STRINGLITERAL", "WS", "COMMENT", "LINE_COMMENT", "Char"
	};
	public static final int
		RULE_program = 0;
	public static final String[] ruleNames = {
		"program"
	};

	@Override
	public String getGrammarFileName() { return "SimpleCode.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleCodeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<TerminalNode> Method_decl() { return getTokens(SimpleCodeParser.Method_decl); }
		public TerminalNode Method_decl(int i) {
			return getToken(SimpleCodeParser.Method_decl, i);
		}
		public TerminalNode Field_decl(int i) {
			return getToken(SimpleCodeParser.Field_decl, i);
		}
		public TerminalNode CLASS() { return getToken(SimpleCodeParser.CLASS, 0); }
		public TerminalNode PROGRAM() { return getToken(SimpleCodeParser.PROGRAM, 0); }
		public List<TerminalNode> Field_decl() { return getTokens(SimpleCodeParser.Field_decl); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2); match(CLASS);
			setState(3); match(PROGRAM);
			setState(4); match(T__1);
			setState(8);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Field_decl) {
				{
				{
				setState(5); match(Field_decl);
				}
				}
				setState(10);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(14);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Method_decl) {
				{
				{
				setState(11); match(Method_decl);
				}
				}
				setState(16);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(17); match(T__0);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\63\26\4\2\t\2\3\2"+
		"\3\2\3\2\3\2\7\2\t\n\2\f\2\16\2\f\13\2\3\2\7\2\17\n\2\f\2\16\2\22\13\2"+
		"\3\2\3\2\3\2\2\2\3\2\2\2\26\2\4\3\2\2\2\4\5\7\b\2\2\5\6\7\22\2\2\6\n\7"+
		"\3\2\2\7\t\7\23\2\2\b\7\3\2\2\2\t\f\3\2\2\2\n\b\3\2\2\2\n\13\3\2\2\2\13"+
		"\20\3\2\2\2\f\n\3\2\2\2\r\17\7\24\2\2\16\r\3\2\2\2\17\22\3\2\2\2\20\16"+
		"\3\2\2\2\20\21\3\2\2\2\21\23\3\2\2\2\22\20\3\2\2\2\23\24\7\4\2\2\24\3"+
		"\3\2\2\2\4\n\20";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}