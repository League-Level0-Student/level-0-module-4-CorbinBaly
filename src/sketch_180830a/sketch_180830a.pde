import ddf.minim.*;
AudioSample fortniteSound;
boolean playSound = true;
PImage donkey;
PImage tail;
void setup() {
  Minim minim = new Minim(this);
  fortniteSound = minim.loadSample("Default Fortnite Dance EARRAPE!.mp3");
  size(550, 406); 
  donkey = loadImage("donkey.jpg");
  tail = loadImage("tail.png");  
  tail.resize(90, 90);
}

void draw() {
  background (donkey);
  image(tail, mouseX, mouseY);
  rect(0, 0, 30, 30);
  rect(454, 75, 40, 40);
  if (dist(0, 0, mouseX, mouseY) > 30) {
    background(255, 255, 255);
  }
  if(mousePressed&&dist(540, 94, mouseX, mouseY) > 50){
println("you did good");
if (playSound) {
     fortniteSound.trigger();
     playSound = false;
  }
}
}