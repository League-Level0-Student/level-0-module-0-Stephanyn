void setup(){
 size(600,400); 
 PImage catPic = loadImage("catPic.jpg");
image(catPic, 0, 0);
}
void draw(){
  println(mouseX);
  println(mouseY);
  fill(120,20,90);
  ellipse(280,153,50,50);
  fill(120,20,90);
  ellipse(417,150,50,50);
  
  
  
  
}
