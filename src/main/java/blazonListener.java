package main.java;

import main.antlr4.testBaseListener;
import main.antlr4.testParser;
import main.antlr4.testParser.TinctureContext;

public class blazonListener extends testBaseListener{
	
	private String blazon;

    @Override
    public void enterBlazon(testParser.BlazonContext ctx) {
        TinctureContext node = ctx.tincture();
        blazon = node.getText();
    }
    
    public String getBlazon(){
        return blazon;
    }
}
