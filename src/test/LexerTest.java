//package test;
//
//import static org.junit.Assert.assertEquals;
//
//import java.util.BitSet;
//import java.util.List;
//
//import org.antlr.v4.runtime.ANTLRErrorListener;
//import org.antlr.v4.runtime.BaseErrorListener;
//import org.antlr.v4.runtime.CharStreams;
//import org.antlr.v4.runtime.CommonTokenStream;
//import org.antlr.v4.runtime.Parser;
//import org.antlr.v4.runtime.RecognitionException;
//import org.antlr.v4.runtime.Recognizer;
//import org.antlr.v4.runtime.Token;
//import org.antlr.v4.runtime.atn.ATNConfigSet;
//import org.antlr.v4.runtime.dfa.DFA;
//import org.antlr.v4.runtime.misc.ParseCancellationException;
//
//import main.antlr4.testLexer;
//
//public class LexerTest implements ANTLRErrorListener {
//	
//	
//	private static List<Token> getTokensFromText(String txt)  {
//		testLexer lex = new testLexer(CharStreams.fromString(txt));
//		lex.addErrorListener(new BaseErrorListener() {
//	        @Override
//	        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line,
//	                                int charPositionInLine, String msg, RecognitionException e) {
//	            throw new ParseCancellationException(msg, e);
//	        }
//	    });
//		CommonTokenStream tokenStream = new CommonTokenStream(lex);
//        tokenStream.fill();
//        return tokenStream.getTokens();
//    }
//	
//	public static void main(String[] args) {
//		List<Token> tokens = getTokensFromText("Azure, a bend Argent between three roses Gules");
//
//		for(Token token : tokens) {
//            System.out.println(token.getType());
//        }
//	}
//
//	@Override
//	public void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact,
//			BitSet ambigAlts, ATNConfigSet configs) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex,
//			BitSet conflictingAlts, ATNConfigSet configs) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction,
//			ATNConfigSet configs) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
//			String msg, RecognitionException e) {
//		// TODO Auto-generated method stub
//		
//	}
//}
