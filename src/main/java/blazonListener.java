package main.java;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Interval;

import main.antlr4.testBaseListener;
import main.antlr4.testParser;
import main.antlr4.testParser.ComplexFieldContext;
import main.antlr4.testParser.TinctureContext;

public class blazonListener extends testBaseListener{
	
	private String blazon, blazonType;
	
	blazonListener(String testBlazon){
		String testBlazonArray[] = testBlazon.split(" ");
    	if(testBlazonArray.length > 3) {
    		blazonType = "complexField";
    	}
    	else {
    		blazonType = "tincture";
    	}
	}
    
    @Override
    public void enterBlazon(testParser.BlazonContext ctx) {
    	if(blazonType.equals("complexField")) {
    		ComplexFieldContext complexFieldNode = ctx.complexField();
    		blazon = getText(complexFieldNode);
    	}
    	else {
    		TinctureContext tinctureNode = ctx.tincture();
    		blazon = getText(tinctureNode);
    	}
    }
    
    public String getBlazon(){
      return blazon;
    }
    
    public String getText(ParserRuleContext ctx) {
		return ctx.start.getInputStream().getText(new Interval(ctx.start.getStartIndex(), ctx.stop.getStopIndex()));
	}
    
}
