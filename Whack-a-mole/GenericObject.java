// Put your name and the date here.
// A description of the class can go here too.
// Add any other comments.

// The class definition
// The name of the class should start with a Capital letter.
public class Mole
{

	//VARIABLE DECLARATION SECTION
	//Here's where you state which variables you are going to use.
	public String name;


	// METHOD DEFINITION SECTION

	// Constructor Definition
	// A constructor builds the object when called and sets variable values.
	public Mole()
	{
		name = "Bob";	//note that EVERY GenericObject you create with this constructor will have the name "Bob"

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

