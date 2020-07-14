package main.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class ThrowingErrorListener extends BaseErrorListener {
	
	public static final ThrowingErrorListener INSTANCE = new ThrowingErrorListener();
	
	private static String[] errorMsg = new String[2];

	   @Override
	   public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
	      throws ParseCancellationException {
		   		Pattern pattern = Pattern.compile("'(.+)'");	
		   		Matcher matcher = pattern.matcher(msg);
		   		String offendingString = "";
		   		if (matcher.find())	{
		   		    offendingString = matcher.group(1);
		   		}
		   		else {
		   			offendingString = msg;
		   		}
	   			errorMsg[0] = Integer.toString(charPositionInLine); 
	   			errorMsg[1] = offendingString;
	   			throw new ParseCancellationException("line " + line + ":" + charPositionInLine + " " + msg);
	      }
	   
	   public static String[] getErrorMsg() {
		   return errorMsg;
	   }

}
