import processing.core.PApplet;

public class Sketch extends PApplet {
  /**
   * The program Sketch.java creates a picture of a house, grass, and a sun
   * and resizes/scales to desired image size
   * @author: E.Fung
   */
  
	// Initialize desired size of image and the original size of image
	
  double dblOriginalSizeX = 400;
  double dblOriginalSizeY = 400;
  double dblMultiplierX;
  double dblMultiplierY;

  public void settings() {
	  // put your size call here
    size(800, 800);
    
    //Calculate Multiplier/Scaling Value
    dblMultiplierX = width / dblOriginalSizeX;
    dblMultiplierY = height / dblOriginalSizeY;
  }

  public void setup() {
    // Sets blue background
    background(0, 0, 255);
  }

  public void draw() {
    // Creating green foreground (with scaling factor)
    fill(0, 255, 0);
    rect((int) (0 * dblMultiplierX), (int) (300 * dblMultiplierY), (int) (400 * dblMultiplierX), (int) (400 * dblMultiplierY));

    // Creating gray square house base (with scaling factor)
    fill(150, 150, 150);
    rect((int) (150 * dblMultiplierX), (int) (335 * dblMultiplierY), (int) (200 * dblMultiplierX), (int) (-200 * dblMultiplierY));

    // Creating white triangle roof (with scaling factor)
    strokeWeight(2);
    fill(255, 255, 255);
    triangle((int) (150 * dblMultiplierX), (int) (135 * dblMultiplierY), (int) (250 * dblMultiplierX), (int) (80 * dblMultiplierY), (int) (350 * dblMultiplierX), (int) (135 * dblMultiplierY));
    strokeWeight(1);

    // Creating circular yellow sun in top left corner (with scaling factor)
    fill(255, 255, 150);
    ellipse((int) (25 * dblMultiplierX), (int) (25 * dblMultiplierY), (int) (150 * dblMultiplierX), (int) (150 * dblMultiplierY));
  }

}