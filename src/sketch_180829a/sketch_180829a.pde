void setup(){
 size(625,300);

}
void draw(){
 background(210,180,140);
  
  fill(255,255,255);

  ellipse(125,125,250,250);
  
  ellipse(500,125,250,250);
  fill(0,0,0);
if(mouseX<=225){
 mouseX=225; 
}
if(mouseY<=100){
 mouseY=100; 
 }
 if(mouseY>=150){
  mouseY=150;
 }
 if(mouseX<=250){
  mouseX=250;
}

ellipse(mouseX-175,mouseY,75,75);
ellipse(mouseX+200,mouseY,75,75);

}