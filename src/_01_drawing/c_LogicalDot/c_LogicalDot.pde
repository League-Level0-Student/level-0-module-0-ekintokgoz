
void setup() {
  
// 1. Set the size of the sketch. Make it 600 pixels square. 
  size(600,600);

}

void draw() {
ellipse(300,300,250,250);
// 2. Draw an ellipse
// Run the program to make sure it works before moving on.


// 3. Change the color of the ellipse when the mouse is pressed.
//    Use the following code, but put your colors where indicated
//    Remember to use the   fill()  command to set colors.

if (mousePressed) {fill(#18B8F0);
 
   //  put one color here 
  
} else {
  
   // put a different color here
fill(#F08418);
  
}
  
}
