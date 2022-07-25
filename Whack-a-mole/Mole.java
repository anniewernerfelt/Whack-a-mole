// Put your name and the date here.
// A description of the class can go here too.
// Add any other comments.
import java.awt.*;
// The class definition
// The name of the class should start with a Capital letter.
public class Mole
{

	//VARIABLE DECLARATION SECTION
	//Here's where you state which variables you are going to use.
	public String name;
   		public int xpos;
		public int ypos;
		public int height;
		public int width;
      public Rectangle rec;
      public boolean isAlive;

	// METHOD DEFINITION SECTION

	// Constructor Definition
	// A constructor builds the object when called and sets variable values.
	public Mole(int x, int y)
	{
		name = "Bob";
      xpos=x;
      ypos=y;
      width=100;
      height=100;
      
      	//note that EVERY GenericObject you create with this constructor will have the name "Bob"
		rec = new Rectangle( xpos, ypos, width, height);
	} // constructor



	//Other methods
	//You can define what an object can do here.
	public void printInfo()
	{

		System.out.println("****************************************");
		System.out.println("My name is "+ name);
		System.out.println("****************************************");


	}
   





} //end of the generic object class  definition

