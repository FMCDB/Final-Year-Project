PImage img;

void setup() {
  size(500,500);
  img = loadImage("shield_trans_paint.PNG");
  int dimension = img.width * img.height;
  img.loadPixels();
  String Color = "Azure";
  color shieldColor = color(255, 255, 255);
  
  if (Color == "Azure"){
    shieldColor = color(0, 0, 255);
  }
  else if (Color == "Gules"){
    shieldColor = color(255, 0, 0);
  }
  else if (Color == "Sable"){
    shieldColor = color(0, 0, 0);
  }
  else if (Color == "Vert"){
    shieldColor = color(0, 255, 0);
  }
  else if (Color == "Purpure"){
    shieldColor = color(128, 0, 128);
  }
  else if (Color == "Or"){
    shieldColor = color(255, 255, 0);
  }
  else if (Color == "Argent"){
    shieldColor = color(255, 255, 255);
  }
  else{
    print("Not a valid tincture.");
  }
  
  //Apply color to shield
  for (int i = 0; i < dimension; i++) { 
    if(img.pixels[i] != 0){
      img.pixels[i] = shieldColor; //white by defualt
    } 
  } 
  img.updatePixels();
}

void draw() {
  imageMode(CENTER);
  image(img, 250, 250);
}
