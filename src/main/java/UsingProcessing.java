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
	

	private static final long serialVersionUID = 1L;
	static String blazon;
	PImage shield, ordinary;

	public static void main(String[] args) {
		
		String testBlazon = "Vert";
        testLexer lexer = new testLexer(CharStreams.fromString(testBlazon));
        CommonTokenStream tokens = new CommonTokenStream(lexer); //provides access to all tokens by index
        testParser parser = new testParser(tokens);
        ParseTree tree = parser.blazon();
        	
        ParseTreeWalker walker = new ParseTreeWalker();
        
        //Listens for the triggering of specific parsing rules
        blazonListener listener = new blazonListener(testBlazon);
        
        walker.walk(listener, tree);
        
        blazon = listener.getBlazon();
        
        System.out.println(blazon);
        
		PApplet.main("main.java.UsingProcessing");	
	}
	
	
	public PImage constructImage(String imageName, String color, int colorValue) {
		
		PImage image = loadImage(imageName);
		int dimension = image.width * image.height;
		image.loadPixels();
		
		if (color.equals("Azure")){
			colorValue = color(0, 0, 255);
		  }
		  else if (color.equals("Gules")){
			  colorValue = color(255, 0, 0);
		  }
		  else if (color.equals("Sable")){
			  colorValue = color(0, 0, 0);
		  }
		  else if (color.equals("Vert")){
			  colorValue = color(0, 255, 0);
		  }
		  else if (color.equals("Purpure")){
			  colorValue = color(128, 0, 128);
		  }
		  else if (color.equals("Or")){
			  colorValue = color(255, 255, 0);
		  }
		  else if (color.equals("Argent")){
			  colorValue = color(255, 255, 255);
		  }
		  else{
		    print("Not a valid tincture.");
		  }
		  
		  //Apply color to ordinary
		  //All non-transparent pixels in the image have negative values - CHECK
		  for (int i = 0; i < dimension; i++) { 
		    if(image.pixels[i] < 0){
		    	image.pixels[i] = colorValue; 	
		    } 
		  }
		  
		  image.updatePixels();
		  
		  return image;
	}
	
	
    public void setup() {
    	
		  size(500,500);
		  int colorValue = color(255, 255, 255); //white by default
		  String shieldColor, ordinaryName = "", ordinaryColor = "";
		  
		  String blazonArray[] = blazon.split(" ");
		  
		  if(blazonArray.length > 1) {
			  shieldColor = blazonArray[0].substring(0, blazonArray[0].length() - 1); //exclude comma
			  ordinaryName = blazonArray[2];
			  ordinaryColor = blazonArray[3];
		  }
		  else {
			  shieldColor = blazonArray[0];
		  }
		  
		  imageMode(CENTER);
		  
		  shield = constructImage("shield.PNG", shieldColor, colorValue);
		  image(shield, 250, 250);
		  
		  if(!ordinaryName.equals("")) {
			  ordinary = constructImage(ordinaryName+"_single.png", ordinaryColor, colorValue);
			  if(ordinaryName.equals("pale")) {
				  image(ordinary, 250, 327);
			  }
			  else if(ordinaryName.equals("bend")) {
				  image(ordinary, 235, 230);
			  }
			  else {
				  image(ordinary, 250, 250);  
			  }
		  }	
    }
}
