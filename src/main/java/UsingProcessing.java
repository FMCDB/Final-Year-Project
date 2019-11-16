package main.java;

import java.util.Arrays;
import java.util.List;

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
		
		String testBlazon = "Argent, on a chevron between three cats Gules, as many lozenges of the field";
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
		  
		  //str = str.replace("X", "");
		  
		  String splitBlazon[] = blazon.replace(",", "").split(" "); 
		  List<String> blazonList = Arrays.asList(splitBlazon);
		  String blazonArray[][] = new String[50][50];
		  
		  String tincturesArray[] = {"Argent", "Or" , "Gules" , "Sable" , "Azure" , "Vert" , "Purpure" , "Murrey" , "Sanguine" , "Tenne"};
		  List<String> tinctures = Arrays.asList(tincturesArray);
		  
		  String ordinariesArray[] = {"bend", "chevron" , "cross" , "fess" , "pale" , "saltire", "bends", "chevrons" , "crosses" , "fesses" , "pales" , "saltires"};
		  List<String> ordinaries = Arrays.asList(ordinariesArray);
		  
		  String semeArray[] = {"semy-de-lis" , "crusily" , "bezante" , "plate" , "billete" , "annulletty" , "etincelle" , "gouttee" , "tortelly"};
		  List<String> semes = Arrays.asList(semeArray);
		  
		  String chargesArray[] = {"lozenge" , "billet" , "annulet" , "roundel" , "label" , "fret" , "baton" , "horses' head" , "torteaux" , "rose" , "spear" , "shell" , "quarter" , "canton" , "flaunch" , "gore" , "gyron" , "orle" , "escutcheon" , "fusil" , "mascle" , "rustre" , "annulet",
				  				   "lozenges" , "billets" , "annulets" , "roundels" , "labels" , "frets" , "batons" , "horses' heads" , "roses" , "spears" , "shells" , "quarters" , "cantons" , "flaunches" , "gores" , "gyrons" , "orles" , "escutcheons" , "fusils" , "mascles" , "rustres" , "annulets"};
		  List<String> charges = Arrays.asList(chargesArray);
		  
		  String positionsArray[] = {"chief" , "base" , "bend" , "chevron" , "pale" , "fess"};
		  List<String> positions = Arrays.asList(positionsArray);
		  
		  String quantitiesArray[] = {"a" , "an" , "as many" , "one" , "two" , "three" , "four" , "five"};
		  
		  //initial tincture
		  if(tinctures.contains(splitBlazon[0])) {
			  blazonArray[0][0] = splitBlazon[0];
		  }
		  
		  int length = splitBlazon.length;
		  
		  //cadency
		  if(splitBlazon[length-1].equals("difference") || splitBlazon[length-1].equals("distinction")) {
			  blazonArray[5][0] = splitBlazon[length-5]; //qty
			  blazonArray[5][1] = splitBlazon[length-4]; //charge
			  blazonArray[5][2] = splitBlazon[length-3]; //tincture
			  blazonArray[5][3] = splitBlazon[length-2]; //for
			  blazonArray[5][4] = splitBlazon[length-1]; //distinction/difference
		  }
		  
		  for(int i = 0; i < splitBlazon.length; i++) {
			  //ordinary
			  if(ordinaries.contains(splitBlazon[i]) && !splitBlazon[i-1].equals("in")) {
				  if(splitBlazon[i-2].equals("on")) {
					  blazonArray[1][0] = splitBlazon[i-2];
				  }
				  blazonArray[1][1] = splitBlazon[i-1]; //qty
				  blazonArray[1][2] = splitBlazon[i]; //ordinary name
				  //add position e.g. in pale
				  if(i < splitBlazon.length-1 && tinctures.contains(splitBlazon[i+1])) {
					  blazonArray[1][3] = splitBlazon[i+1]; //ordinary tincture
				  }
			  }
			  //charges (1st occurence)
			  else if(charges.contains(splitBlazon[i]) && blazonArray[3][3] == null && 
					  ((i+3 < splitBlazon.length && !splitBlazon[i+3].equals("difference") && !splitBlazon[i+3].equals("distinction")) || i + 3 > splitBlazon.length)) {
				  blazonArray[3][2] = splitBlazon[i-1]; //qty
				  blazonArray[3][3] = splitBlazon[i]; //charge name
				  if(i-3 > -1 && (splitBlazon[i-3].equals("debruised") || positions.contains(splitBlazon[i-2]))) {
					  blazonArray[3][0] = splitBlazon[i-3];
					  blazonArray[3][1] = splitBlazon[i-2];
				  }
				  if(i-2 > 0 && splitBlazon[i-2].equals("between")) {
					  blazonArray[3][1] = splitBlazon[i-2];
				  }
				  if(i < splitBlazon.length-1 && (splitBlazon[i+1].equals("palewise") || splitBlazon[i+1].equals("fesswise"))){
					  blazonArray[3][4] = splitBlazon[i+1];
				  }
				  for(int j = i; j < splitBlazon.length; j++) {
					  if(positions.contains(splitBlazon[j]) && blazonArray[3][6] == null) {
						  blazonArray[3][5] = splitBlazon[j-1]; //in
						  blazonArray[3][6] = splitBlazon[j];	//position name
					  }
					  if(tinctures.contains(splitBlazon[j]) && blazonArray[3][7] == null) {
						  blazonArray[3][7] = splitBlazon[j]; //charge tincture
					  }
					  else if(splitBlazon[j].equals("field") && blazonArray[3][7] == null) {
						  blazonArray[3][7] = splitBlazon[j-2]; //of
						  blazonArray[3][8] = splitBlazon[j-1]; //the 
						  blazonArray[3][9] = splitBlazon[j]; //field
					  }
				  }
			  }
			  //charges (2nd occurence)
			  else if(charges.contains(splitBlazon[i]) && blazonArray[4][1] == null && blazonArray[5][1] == null && blazonArray[3][3] != null && 
					  ((i+3 < splitBlazon.length && !splitBlazon[i+3].equals("difference") && !splitBlazon[i+3].equals("distinction")) || i + 3 > splitBlazon.length)) {
				  if(splitBlazon[i-1].equals("many")) {
					  blazonArray[4][0] = "as many";
				  }
				  else {
					  blazonArray[4][0] = splitBlazon[i-1]; //qty
				  }
				  blazonArray[4][1] = splitBlazon[i];
				  if(splitBlazon[i+1].equals("of")) {
					  blazonArray[4][2] = "of the field";
				  }
				  else {
					  blazonArray[4][2] = splitBlazon[i+1];
				  }
			  }
		  }
		  
		  for(int i = 0; i < blazonArray.length; i++) {
			  for(int j = 0; j < blazonArray[i].length; j++) {
				  if(blazonArray[i][j] != null) {
					  System.out.println(blazonArray[i][j] +" "+i+" "+j);
				  }
			  }
		  }
		  
		  
//		  if(splitBlazon.length > 1) {
//			  shieldColor = splitBlazon[0].substring(0, splitBlazon[0].length() - 1); //exclude comma
//			  ordinaryName = splitBlazon[2];
//			  ordinaryColor = splitBlazon[3];
//		  }
//		  else {
//			  shieldColor = splitBlazon[0];
//		  }
		   
//		  imageMode(CENTER);
//		  
//		  shield = constructImage("shield.PNG", shieldColor, colorValue);
//		  image(shield, 250, 250);
//		  
//		  if(!ordinaryName.equals("")) {
//			  ordinary = constructImage(ordinaryName+"_single.png", ordinaryColor, colorValue);
//			  if(ordinaryName.equals("pale")) {
//				  image(ordinary, 250, 327);
//			  }
//			  else if(ordinaryName.equals("bend")) {
//				  image(ordinary, 235, 230);
//			  }
//			  else {
//				  image(ordinary, 250, 250);  
//			  }
//		  }	
    }
}
