package main.java;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import main.antlr4.testLexer;
import main.antlr4.testParser;

import processing.core.PApplet;
import processing.core.PImage;


public class UsingProcessing extends PApplet {
	

	private static final long serialVersionUID = 1L;
	static String[][] blazonArray2D;
	PImage shield, ordinary, division, charge, quarterCharge, cadency;

	public static void main(String[] args) {

		heraldicGenerator("Gules, a cross Vert and in the first quarter a rose Argent and in the second quarter a spear Or and in the third quarter a spear Purpure and in the fourth quarter a rose Azure");			
	}
	
	public static void heraldicGenerator(String testBlazon) throws ParseCancellationException {
		
		//Create lexer and detect errors
        testLexer lexer = new testLexer(CharStreams.fromString(testBlazon));
        lexer.removeErrorListeners();
        lexer.addErrorListener(ThrowingErrorListener.INSTANCE);
        
        CommonTokenStream tokens = new CommonTokenStream(lexer); //provides access to all tokens by index
        
        //Create parser and detect errors
        testParser parser = new testParser(tokens);		
        parser.removeErrorListeners();
        parser.addErrorListener(ThrowingErrorListener.INSTANCE);	

        ParseTree tree = parser.blazon();	
        ParseTreeWalker walker = new ParseTreeWalker();
        
        //Listens for the triggering of specific parsing rules
        blazonListener listener = new blazonListener();
        
        walker.walk(listener, tree);
        
        blazonArray2D = listener.getBlazon();
        
        	
        for(int i = 0; i < blazonArray2D.length; i++) {
    		for(int j = 0; j < blazonArray2D[i].length; j++) {
    			if(blazonArray2D[i][j] != null) {
    				blazonArray2D[i][j] = blazonArray2D[i][j].replaceAll(",", "");
    				System.out.println(blazonArray2D[i][j] + " "+i+" "+j);
    			}
    		}
    	}
        System.out.println();
        
		PApplet.main("main.java.UsingProcessing");
		
		String filepath = "C:\\Users\\finia\\eclipse-workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\finalYearProject\\images\\";
		try (PrintWriter out = new PrintWriter(filepath+"blazon.txt")) {
		    out.println(testBlazon);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public PImage constructImage(String imageName, String color, int colorValue) {
		
		PImage image = loadImage(imageName);
		int dimension = image.width * image.height;
		image.loadPixels();
		
		switch(color) {
			case "Azure":
				colorValue = color(0, 0, 255);
				break;
			case "Gules":
				colorValue = color(255, 0, 0); 
				break;
			case "Sable":
				colorValue = color(0, 0, 0);
				break;
			case "Vert":
				colorValue = color(0, 255, 0);
				break;
			case "Purpure":
				colorValue = color(128, 0, 128);
				break;
			case "Or":
				colorValue = color(255, 255, 0);
				break;
			case "Argent":
				colorValue = color(255, 255, 255);
				break;
			default:
				print("Not a valid tincture.");
		}

		  //Apply color to ordinary
		  //All non-transparent pixels in the image have negative values
		  for (int i = 0; i < dimension; i++) { 
		    if(image.pixels[i] < 0 && image.pixels[i] != color(0)){
		    	image.pixels[i] = colorValue; 	
		    } 
		  }
		  
		  image.updatePixels();
		  return image;
	}
	
	public void reflectImage(PImage img, int x, int y) {
		pushMatrix();
		scale(-1.0f, 1.0f);
		translate(x-50,0);
		image(img,-img.width,y);
		popMatrix();
	}
	
	public void displayCharge(PImage charge, int x, int y, int degrees, String chargeDirection) {
		pushMatrix();
		translate(x,y);
		if(chargeDirection != null && chargeDirection.equals("fesswise")) {
			rotate(radians(90));
		}
		else {
			rotate(radians(degrees));
		}
		translate(-x,-y);	
		image(charge, x, y);
		popMatrix();
	}
	
	public static boolean rowFilled(int index) {
		boolean b = false;
        for (String item : blazonArray2D[index]) {
            if(item != null) {
            	return b = true;
            }
        }
        return b;
	}
	
    public void setup() {	
    	
		  size(500,500);
		  int colorValue = color(255, 255, 255); //white by default
		  String divisionType = "", divisionColor = "", shieldColor, 
				  ordinaryName = "", ordinaryColor = "", chargeType = "", chargeName = "",
				  chargeColor = "", chargeNumber = "", chargeDirection = "";
		  
		  String animalNames[] = {"lion", "wolf", "antelope"};
		  
		  //shield
		  
		  shieldColor = blazonArray2D[1][0];
		  imageMode(CENTER);
		  shield = constructImage("shield.png", shieldColor, colorValue);
		  image(shield, 250, 250);
		  
		  //division
		  
		  if(rowFilled(0)) {
			  if(blazonArray2D[0][0].equals("party") || blazonArray2D[0][0].equals("parted")) {
				  divisionType = blazonArray2D[0][2];
			  }
			  else if(blazonArray2D[0][0].equals("quarterly")) {
				  divisionType = "quarterly";
			  }
			  else {
				  divisionType = blazonArray2D[0][1];
			  }
			  divisionColor = blazonArray2D[1][2];
		  }
		  
		  
		  if(!divisionType.equals("")) {
			  if(divisionType.equals("quarterly")) {
				  division = constructImage(divisionType+".png", divisionColor, colorValue);
			  }
			  else {
				  division = constructImage("per "+divisionType+".png", divisionColor, colorValue);  
			  }
			  image(division, 250, 250);
		  }
		  
		  //Ordinary
		  
		  if(rowFilled(3)) {
			  
			  boolean animal = false;
			  for(String i : animalNames){
		            if(i.equals(blazonArray2D[3][1])){
		                animal = true;
		                break;
		            }
			  }
			  
			  if(animal) {
				  ordinaryName = blazonArray2D[3][0] + " " + blazonArray2D[3][1] + " " + blazonArray2D[3][2];
				  if(blazonArray2D[3].length > 2) {
					  if(blazonArray2D[3].length >= 5 && blazonArray2D[3][5].equals("sinister")) {
						  ordinaryColor = blazonArray2D[3][6];	
					  }
					  else {
						  ordinaryColor = blazonArray2D[3][3];
					  }  
				  }
			  }
			  else {
				  ordinaryName = blazonArray2D[3][0] + " " + blazonArray2D[3][1];
				  if(blazonArray2D[3].length > 2) {
					  ordinaryColor = blazonArray2D[3][2];    
				  }
			  }
				  
			  ordinary = constructImage(ordinaryName+".png", ordinaryColor, colorValue);
			  
			  if(ordinaryName.equals("a pale")) {
				  image(ordinary, 250, 327);	
			  }
			  else if(ordinaryName.equals("a bend")) {
				  image(ordinary, 235, 230);
			  }
			  else if(blazonArray2D[3].length >= 5 && blazonArray2D[3][5].equals("sinister")) {
				  reflectImage(ordinary, 250, 250);
			  }
			  else {
				  image(ordinary, 250, 250);  
			  }
		  
		  }
		  
		  //Charge
		  
		  for(int i = 4; i < 6; i++) {
			  
			  if(rowFilled(i)) {
				  
				  int row = i;
				  
				  int startPos = 0;
				  
				  if(blazonArray2D[row][1].equals("between")) {
					  startPos = 2;
				  }
				  else {
					  startPos = 3;
					  chargeType = blazonArray2D[row][1] + " " + blazonArray2D[row][2];
				  }
				  
				  chargeNumber = blazonArray2D[row][startPos];
				  //Remove final 's' if plural
				  if(blazonArray2D[row][startPos+1].charAt(blazonArray2D[row][startPos+1].length()-1) == 's') {
					  chargeName = blazonArray2D[row][startPos+1].substring(0, blazonArray2D[row][startPos+1].length() - 1); 
				  }
				  else {
					  chargeName = blazonArray2D[row][startPos+1];  
				  }
				  
				  if(blazonArray2D[row][startPos+2].equals("palewise") || blazonArray2D[row][startPos+2].equals("fesswise")) {
					  chargeDirection = blazonArray2D[row][startPos+2];
					  chargeColor = blazonArray2D[row][startPos+3];
				  }
				  else {
					  chargeColor = blazonArray2D[row][startPos+2];  
				  }
				  
				  charge = constructImage(chargeName+".png", chargeColor, colorValue);
				  
				  if(blazonArray2D[row][1].equals("between")) {
					  
					  charge.resize(0, 120);
					  
					  switch(ordinaryName) {
					  	case "a bend":
					  		  displayCharge(charge, 400, 150, 0, chargeDirection);
							  displayCharge(charge, 100, 250, 0, chargeDirection);
							  if(chargeNumber.equals("three")) {
								  displayCharge(charge, 160, 330, 0, chargeDirection);
							  }
							  break;
					  	case "a bend sinister":
					  		  displayCharge(charge, 100, 150, 0, chargeDirection);
							  displayCharge(charge, 400, 250, 0, chargeDirection);
							  if(chargeNumber.equals("three")) {
								  displayCharge(charge, 300, 350, 0, chargeDirection);
							  }
							  break;
					  	case "a fess":
					  		  displayCharge(charge, 250, 360, 0, chargeDirection);
							  if(chargeNumber.equals("two")) {
								  displayCharge(charge, 250, 100, 0, chargeDirection);
							  }
							  else if(chargeNumber.equals("three")) {
								  displayCharge(charge, 150, 100, 0, chargeDirection);
								  displayCharge(charge, 380, 100, 0, chargeDirection);
							  }
							  break;
					  	case "a saltire":
							  displayCharge(charge, 130, 250, 0, chargeDirection);
							  displayCharge(charge, 380, 250, 0, chargeDirection);
							  if(chargeNumber.equals("three") || chargeNumber.equals("four")) {
								  displayCharge(charge, 250, 100, 0, chargeDirection);
							  }
							  if(chargeNumber.equals("four")) {
								  displayCharge(charge, 250, 400, 0, chargeDirection);
							  }
							  break;
					  	case "a cross":
			  				  displayCharge(charge, 150, 320, 0, chargeDirection);
							  displayCharge(charge, 350, 320, 0, chargeDirection);
							  if(chargeNumber.equals("three") || chargeNumber.equals("four")) {
								  displayCharge(charge, 150, 100, 0, chargeDirection);
							  }
							  if(chargeNumber.equals("four")) {
								  displayCharge(charge, 350, 100, 0, chargeDirection);
							  }
							  break;
					  	case "a chevron":
					  		  displayCharge(charge, 255, 350, 0, chargeDirection);
							  if(chargeNumber.equals("two")) {
								  charge.resize(0, 90);
								  displayCharge(charge, 255, 70, 0, chargeDirection);
							  }
							  else if(chargeNumber.equals("three")) {
								  displayCharge(charge, 100, 100, 0, chargeDirection);
								  displayCharge(charge, 400, 100, 0, chargeDirection);
							  }
							  break;
					  	case "a crescent":
					  		  if(chargeNumber.equals("two")) {
								  displayCharge(charge, 100, 170, 0, chargeDirection);
								  displayCharge(charge, 400, 170, 0, chargeDirection);
							  }
							  else if(chargeNumber.equals("three")) {
								  displayCharge(charge, 250, 410, 0, chargeDirection);
								  displayCharge(charge, 100, 100, 0, chargeDirection);
								  displayCharge(charge, 400, 100, 0, chargeDirection);
							  }
					  		  break;
					  	case "a pile":
					  		  displayCharge(charge, 100, 170, 0, chargeDirection);
							  displayCharge(charge, 400, 170, 0, chargeDirection);
							  break;
					  	case "a pale":
					  		  displayCharge(charge, 400, 170, 0, chargeDirection);
							  if(chargeNumber.equals("two")) {
								  displayCharge(charge, 100, 170, 0, chargeDirection);
							  }
							  else if(chargeNumber.equals("three")) {
								  displayCharge(charge, 100, 120, 0, chargeDirection);
								  displayCharge(charge, 120, 270, 0, chargeDirection);
							  }
							  break;
					  }
				  }
				  
				  else {
					  
					  if(chargeType.equals("charged with") || chargeType.equals("debruised by")) {
						  
						  if(ordinaryName.equals("a bend sinister") || ordinaryName.equals("a bend")) {
							  int rotation = 0, x1 = 0, y1 = 0, x2 = 0, y2 = 0, x3 = 0, y3 = 0;
							  if(ordinaryName.equals("a bend sinister")){
								  rotation = 315;
								  x1 = 150;
								  y1 = 350;
								  x2 = 250;
								  y2 = 250;
								  x3 = 350;
								  y3 = 150;
							  }
							  else {
								  rotation = 45;
								  x1 = 150;
								  y1 = 150;
								  x2 = 250;
								  y2 = 250;
								  x3 = 350;
								  y3 = 350;
							  }
							  if(chargeNumber.equals("a")) {
								  charge.resize(0, 200);
								  displayCharge(charge, x2, y2, rotation, chargeDirection);
							  }
							  else if(chargeNumber.equals("two") || chargeNumber.equals("three")) {
								  charge.resize(0, 100);
								  displayCharge(charge, x1, y1, rotation, chargeDirection);
								  displayCharge(charge, x3, y3, rotation, chargeDirection);
								  if(chargeNumber.equals("three")) {
									  displayCharge(charge, x2, y2, rotation, chargeDirection);
								  }
							  }
							  
						  }
						  					  
						  else if((ordinaryName.equals("a fess"))) {
							  charge.resize(0, 100);
							  if(chargeNumber.equals("one") || chargeNumber.equals("three")) {
								  displayCharge(charge, 250, 235, 0, chargeDirection);  
							  }
							  if(chargeNumber.equals("two") || chargeNumber.equals("three")) {
								  displayCharge(charge, 100, 235, 0, chargeDirection); 
								  displayCharge(charge, 400, 235, 0, chargeDirection); 
							  }
						  }
						  
						  else if(ordinaryName.equals("a saltire")) {
							  if(chargeNumber.equals("a") || chargeNumber.equals("an") || chargeNumber.equals("three")) {
								  charge.resize(0, 100);
								  displayCharge(charge, 250, 250, 0, chargeDirection);
							  }
							  if(chargeNumber.equals("two") || chargeNumber.equals("three")) {
								  charge.resize(0, 300);
								  displayCharge(charge, 250, 250, -45, chargeDirection);
								  displayCharge(charge, 250, 250, 45, chargeDirection);
							  }
						  }
						  
						  else if(ordinaryName.equals("a cross")) {
							  charge.resize(0, 100);
							  if(chargeNumber.equals("a") || chargeNumber.equals("an")) {
								  displayCharge(charge, 250, 230, 0, chargeDirection); // crentre charge
							  }
							  else if(chargeNumber.equals("two") || chargeNumber.equals("three") || chargeNumber.equals("four")) {
								  displayCharge(charge, 250, 100, 0, chargeDirection); //upper charge
								  displayCharge(charge, 100, 230, 0, chargeDirection); //left charge
								  if(chargeNumber.equals("three")) {
									  displayCharge(charge, 400, 230, 0, chargeDirection); //right charge
								  }
								  if(chargeNumber.equals("four")) {
									  displayCharge(charge, 400, 230, 0, chargeDirection); //right charge
									  displayCharge(charge, 250, 400, 0, chargeDirection); //lower charge
								  }
							  }
						  }
						  
						  else if(ordinaryName.equals("a chevron")) {
							  charge.resize(0, 100);
							  if(chargeNumber.equals("a") || chargeNumber.equals("an") || chargeNumber.equals("three")) {
								  displayCharge(charge, 255, 200, 0, chargeDirection); 
							  }
							  if(chargeNumber.equals("two") || chargeNumber.equals("three")) {
								  displayCharge(charge, 360, 320, -45, chargeDirection);
								  displayCharge(charge, 145, 320, 45, chargeDirection);
							  }
						  }
						  
						  else if(ordinaryName.equals("a crescent")) {
							  charge.resize(0, 200);
							  if(chargeNumber.equals("a") || chargeNumber.contentEquals("an")) {
								  displayCharge(charge, 250, 230, 0, chargeDirection);
							  }
							  if(chargeNumber.equals("two") || chargeNumber.equals("three")) {
								  charge.resize(0, 100);
								  displayCharge(charge, 160, 230, 0, chargeDirection);
								  displayCharge(charge, 350, 230, 0, chargeDirection);
							  }
							  if(chargeNumber.equals("three")) {
								  displayCharge(charge, 250, 200, 0, chargeDirection);
							  }
						  }
						  
						  else if(ordinaryName.equals("a pile")) {
							  charge.resize(0, 150);
							  if(chargeNumber.equals("a") || chargeNumber.equals("an")) {
								  displayCharge(charge, 253, 150, 0, chargeDirection);
							  }
							  if(chargeNumber.equals("two") || chargeNumber.equals("three")) {
								  displayCharge(charge, 180, 110, 0, chargeDirection);
								  displayCharge(charge, 330, 110, 0, chargeDirection);
							  }
							  if(chargeNumber.equals("three")) {
								  displayCharge(charge, 253, 150, 0, chargeDirection);
							  }
						  }
						  
						  else if(ordinaryName.equals("a pale")) {
							  charge.resize(0, 400);
							  if(chargeNumber.equals("a") || chargeNumber.equals("an")) {
								  displayCharge(charge, 250, 250, 0, chargeDirection);
							  }
							  else if(chargeNumber.equals("two")) {
								  charge.resize(0, 150);
								  displayCharge(charge, 250, 150, 0, chargeDirection);
								  displayCharge(charge, 250, 350, 0, chargeDirection);
							  }
							  else if(chargeNumber.equals("three")) {
								  charge.resize(0, 100);
								  displayCharge(charge, 250, 100, 0, chargeDirection);
								  displayCharge(charge, 250, 250, 0, chargeDirection);
								  displayCharge(charge, 250, 400, 0, chargeDirection);
							  }
						  }  
					  }
					  
					  else if(chargeType.equals("over all")) {
						  charge.resize(0, 400);
						  if(!chargeDirection.equals("fesswise")) {
							  if(chargeNumber.equals("a") || chargeNumber.equals("an") || chargeNumber.equals("three")) {
								  displayCharge(charge, 250, 230, 0, chargeDirection);
							  }
							  if(chargeNumber.equals("two") || chargeNumber.equals("three")) {
								  displayCharge(charge, 180, 230, 0, chargeDirection);
								  displayCharge(charge, 320, 230, 0, chargeDirection);
							  }
						  }
						  else {
							  if(chargeNumber.equals("a") || chargeNumber.equals("an") || chargeNumber.equals("three")) {
								  displayCharge(charge, 250, 230, 0, chargeDirection);
							  }
							  if(chargeNumber.equals("two") || chargeNumber.equals("three")) {
								  charge.resize(0,150);
								  displayCharge(charge, 150, 230, 0, chargeDirection);
								  displayCharge(charge, 350, 230, 0, chargeDirection);
							  }
						  }
						  
					  }
					  
					  else if(chargeType.equals("in chief")) {
						  charge.resize(0, 125);
						  if(chargeNumber.equals("a") || chargeNumber.equals("three")) {
							  displayCharge(charge, 250, 100, 0, chargeDirection);
						  }
						  if(chargeNumber.equals("two") || chargeNumber.equals("three")) {
							  displayCharge(charge, 100, 100, 0, chargeDirection);
							  displayCharge(charge, 400, 100, 0, chargeDirection);
						  }
					  }
					  
					  else if(chargeType.equals("in base")) {
						  charge.resize(0, 125);
						  if(chargeNumber.equals("a") || chargeNumber.equals("three")) {
							  displayCharge(charge, 250, 400, 0, chargeDirection);
						  }
						  if(chargeNumber.equals("two") || chargeNumber.equals("three")) {
							  displayCharge(charge, 190, 379, 0, chargeDirection);
							  displayCharge(charge, 308, 379, 0, chargeDirection);
						  }
					  }
					  
					  else if(chargeType.equals("in bend")) {
						  charge.resize(0, 150);
						  if(chargeNumber.equals("a") || chargeNumber.equals("three")) {
							  displayCharge(charge, 250, 180, 45, chargeDirection);
						  }
						  if(chargeNumber.equals("two") || chargeNumber.equals("three")) {
							  displayCharge(charge, 160, 80, 45, chargeDirection);
							  displayCharge(charge, 330, 280, 45, chargeDirection);
						  }
					  }
					  
					  else if(chargeType.equals("in fess")) {
						  charge.resize(0, 130);
						  if(chargeNumber.equals("a") || chargeNumber.equals("three")) {
							  displayCharge(charge, 250, 235, 0, chargeDirection);
						  }
						  if(chargeNumber.equals("two") || chargeNumber.equals("three")) {
							  displayCharge(charge, 120, 235, 0, chargeDirection);
							  displayCharge(charge, 380, 235, 0, chargeDirection);
						  }
					  }
					  
					  else if(chargeType.equals("in chevron")) {
						  charge.resize(0, 130);
						  if(chargeNumber.equals("a") || chargeNumber.equals("three")) {
							  displayCharge(charge, 250, 125, 0, chargeDirection);
						  }
						  if(chargeNumber.equals("two") || chargeNumber.equals("three")) {
							  displayCharge(charge, 120, 235, 45, chargeDirection);
							  displayCharge(charge, 380, 235, -45, chargeDirection);
						  }
					  } 
				  }
			  }
		  }
		  
		  //quartering
		  if(rowFilled(6)) {
			  for(int i = 0; i < blazonArray2D[6].length; i+=8) {
				  if((blazonArray2D[6][i] != null && blazonArray2D[6][i].equals("and")) || i == 0) {
					  
					  String quarterName = blazonArray2D[6][i+3], 
								 quarterChargeName = blazonArray2D[6][i+6], 
								 quarterChargeColor = blazonArray2D[6][i+7];
						  
					  quarterCharge =  constructImage(quarterChargeName+".png", quarterChargeColor, colorValue);
					  
					  quarterCharge.resize(0, 100);
					 
					  if(quarterName.equals("first")) {
						  image(quarterCharge, 100, 100);
					  }
					  else if(quarterName.equals("second")) {
						  image(quarterCharge, 400, 100);
					  }
					  else if(quarterName.equals("third")) {
						  image(quarterCharge, 150, 350);
					  }
					  else if(quarterName.equals("fourth")) {
						  image(quarterCharge, 350, 350);
					  }  
				  }
			  }
		  }
		  
		  //mark of cadency - placed in centre of shield
		  if(rowFilled(7)) {
			  String cadencyName = blazonArray2D[7][2], cadencyColor = blazonArray2D[7][3];
			  cadency = constructImage(cadencyName+".png", cadencyColor, colorValue);
			  image(cadency, 260, 250); 
		  }
		  
		  //Construct bordure if other elements are contained within one
		  
		  if(rowFilled(8)) {
			  String bordureColor = blazonArray2D[8][4];
			  PImage bordure = constructImage("a bordure.png", bordureColor, colorValue);
			  image(bordure, 250, 250);
		  }
		  
		  save("C:\\Users\\finia\\eclipse-workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\finalYearProject\\images\\blazon-image.png");
    }
}
