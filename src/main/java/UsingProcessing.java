package main.java;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import main.antlr4.testLexer;
import main.antlr4.testParser;

import processing.core.PApplet;
import processing.core.PImage;

public class UsingProcessing extends PApplet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static String blazon;
	PImage img;

	public static void main(String[] args) {
		
		String testBlazon = "Purpure";
        testLexer lexer = new testLexer(CharStreams.fromString(testBlazon));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        testParser parser = new testParser(tokens);
        ParseTree tree = parser.blazon();
        ParseTreeWalker walker = new ParseTreeWalker();
        
        blazonListener listener = new blazonListener();
        
        walker.walk(listener, tree);
        
        blazon = listener.getBlazon();
        
		PApplet.main("main.java.UsingProcessing");	
	}
	
    public void setup() {
    	
		  size(500,500);
		  img = loadImage("shield.PNG");
		  int dimension = img.width * img.height;
		  img.loadPixels();
		  String Color = blazon;
		  int shieldColor = color(255, 255, 255);
		  
		  if (Color.equals("Azure")){
		    shieldColor = color(0, 0, 255);
		  }
		  else if (Color.equals("Gules")){
		    shieldColor = color(255, 0, 0);
		  }
		  else if (Color.equals("Sable")){
		    shieldColor = color(0, 0, 0);
		  }
		  else if (Color.equals("Vert")){
		    shieldColor = color(0, 255, 0);
		  }
		  else if (Color.equals("Purpure")){
		    shieldColor = color(128, 0, 128);
		  }
		  else if (Color.equals("Or")){
		    shieldColor = color(255, 255, 0);
		  }
		  else if (Color.equals("Argent")){
		    shieldColor = color(255, 255, 255);
		  }
		  else{
		    print("Not a valid tincture.");
		  }
		  
		  //Apply color to shield
		  for (int i = 0; i < dimension; i++) { 
		    if(img.pixels[i] != 0){
		      img.pixels[i] = shieldColor; //white by default
		    } 
		  } 
		  
		  img.updatePixels();
    }

    public void draw() {
    	imageMode(CENTER);
    	image(img, 250, 250);
    }

}
