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
		Bin_op=29, Arith_op=30, Rel_op=31, Eq_op=32, Cond_op=33, Literal=34, Id=35, 
		Alpha_num=36, Alpha=37, Digit=38, Hex_digit=39, Int_literal=40, Decimal_literal=41, 
		Hex_literal=42, Bool_literal=43, Char_literal=44, String_literal=45, WS=46, 
		COMMENT=47, LINE_COMMENT=48, Char=49;
	public static final String[] tokenNames = {
		"<INVALID>", "'{'", "'}'", "'boolean'", "'break'", "'callout'", "'class'", 
		"'continue'", "'else'", "'false'", "'for'", "'if'", "'int'", "'return'", 
		"'true'", "'void'", "'Program'", "Field_decl", "Method_decl", "Block", 
		"Var_decl", "Type", "Statement", "Assign_op", "Method_call", "Method_name", 
		"Location", "Expr", "Callout_arg", "Bin_op", "Arith_op", "Rel_op", "Eq_op", 
		"Cond_op", "Literal", "Id", "Alpha_num", "Alpha", "Digit", "Hex_digit", 
		"Int_literal", "Decimal_literal", "Hex_literal", "Bool_literal", "Char_literal", 
		"String_literal", "WS", "COMMENT", "LINE_COMMENT", "Char"
	};
	public static final int
		RULE_program = 0, RULE_scanner = 1;
	public static final String[] ruleNames = {
		"program", "scanner"
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
			setState(4); match(CLASS);
			setState(5); match(PROGRAM);
			setState(6); match(T__1);
			setState(10);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Field_decl) {
				{
				{
				setState(7); match(Field_decl);
				}
				}
				setState(12);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(16);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Method_decl) {
				{
				{
				setState(13); match(Method_decl);
				}
				}
				setState(18);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(19); match(T__0);
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

	public static class ScannerContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(SimpleCodeParser.Id, 0); }
		public TerminalNode Literal() { return getToken(SimpleCodeParser.Literal, 0); }
		public ScannerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scanner; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).enterScanner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleCodeListener ) ((SimpleCodeListener)listener).exitScanner(this);
		}
	}

	public final ScannerContext scanner() throws RecognitionException {
		ScannerContext _localctx = new ScannerContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_scanner);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_la = _input.LA(1);
			if ( !(_la==Literal || _la==Id) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\63\32\4\2\t\2\4\3"+
		"\t\3\3\2\3\2\3\2\3\2\7\2\13\n\2\f\2\16\2\16\13\2\3\2\7\2\21\n\2\f\2\16"+
		"\2\24\13\2\3\2\3\2\3\3\3\3\3\3\2\2\4\2\4\2\3\3\2$%\31\2\6\3\2\2\2\4\27"+
		"\3\2\2\2\6\7\7\b\2\2\7\b\7\22\2\2\b\f\7\3\2\2\t\13\7\23\2\2\n\t\3\2\2"+
		"\2\13\16\3\2\2\2\f\n\3\2\2\2\f\r\3\2\2\2\r\22\3\2\2\2\16\f\3\2\2\2\17"+
		"\21\7\24\2\2\20\17\3\2\2\2\21\24\3\2\2\2\22\20\3\2\2\2\22\23\3\2\2\2\23"+
		"\25\3\2\2\2\24\22\3\2\2\2\25\26\7\4\2\2\26\3\3\2\2\2\27\30\t\2\2\2\30"+
		"\5\3\2\2\2\4\f\22";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}