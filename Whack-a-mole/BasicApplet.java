// Put your name and the date here.
// A description of the class can go here too.
// Add any other comments.



// IMPORT SECTION
// Use this section to add additional libaries for use in your program.
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;




// The class definition.
// The name of the class should start with a Capital letter.
// Notice that this is a "world".  You can tell since it extends Applet.
public class BasicApplet extends Applet implements KeyListener, MouseMotionListener, MouseListener
{
	//VARIABLE DECLARATION SECTION
	//Here's where you state which variables you are going to use.
	public int xTitle;
	public int yTitle;
	public String worldName;
   public Image backgroundImage,hedgehogImage;
   Cursor cursor, dcursor;

	// METHOD DEFINITION SECTION

	// init() is the first method an Applet runs when started
	public void init()
	{
         setSize(600,800); 
		//Initialize variables
		xTitle=100;
		yTitle=100;

		worldName = "The Land of Chun";
      
      backgroundImage= getImage(getDocumentBase(),"background.png");
      hedgehogImage= getImage(getDocumentBase(), "hedgehog.png");
      
      
      Toolkit toolkit = Toolkit.getDefaultToolkit();
      Image image = toolkit.getImage("hammer.gif");
      Point hotSpot = new Point(25,25);
      cursor = toolkit.createCustomCursor(image, hotSpot, "Boom");
      dcursor = new Cursor(Cursor.DEFAULT_CURSOR);
      setCursor(cursor);
 
      
      addMouseMotionListener(this);
      addMouseListener(this);


	}//init()



	// paint() is used to display things on the screen
	public void paint(Graphics g)
	{

		//Put the title on the screen.
      g.drawImage(backgroundImage, 0, 0, 600, 800, this);
      g.drawImage(hedgehogImage, 70, 410, 100, 100, this);
      g.drawImage(hedgehogImage, 95, 520, 100, 100, this);
      g.drawImage(hedgehogImage, 250, 600, 100, 100, this);
      g.drawImage(hedgehogImage, 440, 410, 100, 100, this);
      g.drawImage(hedgehogImage, 410, 520, 100, 100, this);
      g.drawImage(hedgehogImage, 250, 380, 100, 100, this);






	}// paint()

   public void mouseMoved(MouseEvent e) {
   
   }
   public void mouseDragged(MouseEvent e) {
   }
//*****MouseListener Methods*****************************************************
   public void mousePressed(MouseEvent e) {
   }
   public void mouseReleased(MouseEvent e) {
   }
   public void mouseEntered(MouseEvent e) {
   }
   public void mouseExited(MouseEvent e) {
   }

//This method runs when the left mouse button has been pressed and released (Clicked)
   public void mouseClicked(MouseEvent e) {
   
   //to get the x and y position of the mouse cursor use e.getX() and e.getY()
      int mouseX = e.getX();
      int mouseY = e.getY();

}

}//Applet