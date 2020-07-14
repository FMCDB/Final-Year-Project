package main.java;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Interval;

import main.antlr4.testBaseListener;
import main.antlr4.testParser;
import main.antlr4.testParser.CoatDivisionContext;
import main.antlr4.testParser.ComplexFieldContext;
import main.antlr4.testParser.TinctureContext;

public class blazonListener extends testBaseListener{
	
	private String blazon = "", blazonType;
	
	private String blazonArray[][] = new String[50][50];
	private String divisionArray[] = new String[50];
	private String tinctureArray[] = new String[50];
	private String semeArray[] = new String[50];
	private String fieldPositionArray[] = new String[50];
	private String ordinaryArray[] = new String[50];
	private String charge1Array[] = new String[50];
	private String charge2Array[] = new String[50];
	private String quarteringArray[] = new String[50];
	private String cadencyArray[] = new String[50];
	private String bordureArray[] = new String[50];
	
	private String blazonArray2D[][] = new String[50][50];
	
	private String[] ruleNames = testParser.ruleNames;
	
	public static boolean arrayFilled(String[] array) {
		boolean b = false;
        for (String item : array) {
            if(item != null) {
            	return b = true;
            }
        }
        return b;
	}
	
	@Override
    public void enterCoatDivision(testParser.CoatDivisionContext ctx) {
    	divisionArray = ctx.getText().split(" ");
    }
	
	@Override
    public void exitCoatDivision(testParser.CoatDivisionContext ctx) {
		if(isNull(blazonArray2D[0])) {
			blazonArray2D[0] = divisionArray;
		}
    }
	
    @Override
    public void enterTincture(testParser.TinctureContext ctx) {
    	tinctureArray = ctx.getText().split(" ");
    }
    
    @Override
    public void exitTincture(testParser.TinctureContext ctx) {
    	//String [] tinctureArray = ctx.getText().split(" ");
    	if(isNull(blazonArray2D[1])) {
			blazonArray2D[1] = tinctureArray;
		}
    }
    
    @Override
    public void enterSeme(testParser.SemeContext ctx) {
    	semeArray = ctx.getText().split(" ");
    }
    
    @Override
    public void exitSeme(testParser.SemeContext ctx) {
    	if(isNull(blazonArray2D[2])) {
			blazonArray2D[2] = semeArray;
		}
    }
    
    @Override
    public void enterOrdinary(testParser.OrdinaryContext ctx) {
    	//System.out.println(ctx.getText());
    	ordinaryArray = ctx.getText().split(" ");
    }
    
    @Override
    public void exitOrdinaryNames(testParser.OrdinaryNamesContext ctx) {
    	if(ctx.getText().split(" ").length > 1) {
    		ordinaryArray[1] = ctx.getText().trim();
    	}
    	if(ordinaryArray.length > 2 && ordinaryArray[2] != null && ordinaryArray[2].equals("sinister")) {
    		ordinaryArray[2] = ordinaryArray[3];
    		ordinaryArray[3] = null;
    	}
    }
    
    @Override
    public void exitOrdinary(testParser.OrdinaryContext ctx) {
    	if(isNull(blazonArray2D[3])) {
			blazonArray2D[3] = ordinaryArray;
		}
    }
    
    @Override
    public void enterCharges(testParser.ChargesContext ctx) {
    	ParserRuleContext parent = ctx.getParent();
    	String parentRuleName = ruleNames[parent.getRuleIndex()];
    	if(!parentRuleName.equals("quartering")) {
    		boolean charge1Covered = false;
        	for(int i = 0; i < charge1Array.length; i ++) {
        		if(charge1Array[i] != null) {
        			charge1Covered = true;
        			break;
        		}
        	}
        	if(charge1Covered) {
        		charge2Array = ctx.getText().split(" ");
        	}
        	else {
        		charge1Array = ctx.getText().split(" ");
        	}
    	}
    }
    
    @Override
    public void exitCharges(testParser.ChargesContext ctx) {
    	if(arrayFilled(charge1Array) || arrayFilled(charge2Array)) {
    		if(isNull(blazonArray2D[4])) {
    			if(charge1Array[0].equals("and")) {
        			blazonArray2D[4] = charge1Array;
        		}
        		else {
    				for(int i = 1, j = 0; j < charge1Array.length; i++, j++) {
        				blazonArray2D[4][i] = charge1Array[j];
        			}
        		}
    		}
        	if(isNull(blazonArray2D[5]) && !(isNull(charge2Array))) {
    			if(charge2Array[0].equals("and")) {
        			blazonArray2D[5] = charge2Array;
        		}
        		else {
        			for(int i = 1, j = 0; j < charge2Array.length; i++, j++) {
        				blazonArray2D[5][i] = charge2Array[j];
        			}
        		}
    		}
    	}
    }
    
    
    @Override
    public void enterQuartering(testParser.QuarteringContext ctx) {
    	quarteringArray = ctx.getText().split(" ");
    }
    
    @Override
    public void exitQuartering(testParser.QuarteringContext ctx) {
    	if(isNull(blazonArray2D[6])) {
    		for(int i = 0; i < quarteringArray.length; i++) {
    			blazonArray2D[6][i] =  quarteringArray[i];
    		}
		}
    	else {
    		int startIndex = 0;
    		for(int i = 0; i < blazonArray2D[6].length; i++) {
    			if(blazonArray2D[6][i] == null && i != 0) {
    				startIndex = i;
    			}
    		}
    		for(int i = startIndex; i < quarteringArray.length; i++) {
    			blazonArray2D[6][i] =  quarteringArray[i];
    		}
    	}
    }
    
    @Override
    public void enterCadency(testParser.CadencyContext ctx) {
    	cadencyArray = ctx.getText().split(" ");
    }
    
    @Override
    public void exitCadency(testParser.CadencyContext ctx) {
    	if(isNull(blazonArray2D[7])) {
			blazonArray2D[7] = cadencyArray;
		}
    }
    
    @Override
    public void enterBordure(testParser.BordureContext ctx) {
    	bordureArray = ctx.getText().split(" ");
    }
    
    @Override
    public void exitBordure(testParser.BordureContext ctx) {
    	if(isNull(blazonArray2D[8])) {
    		if(bordureArray[0].equals("all")) {
    			blazonArray2D[8] = bordureArray;
    		}
    		else {
    			for(int i = 1, j = 0; j < bordureArray.length; i++, j++) {
    				blazonArray2D[8][i] = bordureArray[j];
    			}
    		}
		}
    }
    
    public boolean isNull(String array[]) {
    	boolean isNull = true;
    	for(int i = 0; i < array.length; i++) {
			if(array[i] != null) {
				isNull = false;
				break;
			}
    	}
    	return isNull;
    }
    
    public String[][] getBlazon(){
    	return blazonArray2D;
    }
}
