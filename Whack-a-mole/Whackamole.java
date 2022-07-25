//Annie Wernerfelt
//Whack a Mole
//If the score is 10, you level up and the moles appear and dissappear faster


import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class Whackamole extends Applet implements  Runnable, MouseMotionListener, MouseListener
{

   public int xTitle;
   public int yTitle;
   public Image backgroundImage,hedgehogImage;
   public Cursor cursor, dcursor;
   
   public Mole [] moles; //mole1, mole2, mole3, mole4, mole5, mole6;
   
   
   public AudioClip thud, theme;
   
   
   public int score;      
   public String s;
   
   
   public boolean level0passed=true;
   public boolean level1passed;
   public boolean level2passed;
   public boolean level3passed;
   public boolean level4passed;
   
   public boolean drawLevel1;
   public boolean drawLevel2;
   public boolean drawLevel3;
   public boolean drawLevel4;
   public boolean drawLevel5;

   
   
   public int counter;
   public int level;
   
   public Font firstFont;
   public Font secondFont;
   

   Graphics bufferGraphics;
   Image offscreen;
   
   public boolean isAlive;
   
   
   Thread thread;


   public void init()
   {
      setSize(600,800); 
      
      
      score=0;                                         
      s="Score: ";                                    
      
   
      xTitle=100;
      yTitle=100;
      
      
      thud=getAudioClip(getDocumentBase(),"thud.wav");
      theme=getAudioClip(getDocumentBase(),"background.wav");
      theme.play();
      
      
      firstFont=new Font("Sathu", 50, 25);
      secondFont=new Font("Sathu", 25, 25);
      
      
      backgroundImage= getImage(getDocumentBase(),"background.png");
      hedgehogImage= getImage(getDocumentBase(), "hedgehog.png");
      
      moles= new Mole[6];
   
      moles[0]= new Mole(70, 410);
      moles[1]= new Mole(95, 520);
      moles[2]= new Mole(250, 600);
      moles[3]= new Mole(440, 410);
      moles[4]= new Mole(410, 520);
      moles[5]= new Mole(250, 380);
     
      
      counter=(int)(Math.random()*60+10);
      level=1;
      
      
      Toolkit toolkit = Toolkit.getDefaultToolkit();
      Image image = toolkit.getImage("hammer.png");
      Point hotSpot = new Point(25,25);
      cursor = toolkit.createCustomCursor(image, hotSpot, "Boom");
      dcursor = new Cursor(Cursor.DEFAULT_CURSOR);
      setCursor(cursor);
      
    
      offscreen = createImage(600,800);
      bufferGraphics = offscreen.getGraphics();
      
   
      
      addMouseMotionListener(this);
      addMouseListener(this);
   
   
   
      thread = new Thread(this);
      thread.start();
   }//init()



   public void paint(Graphics g)
   {
      bufferGraphics.clearRect(0,0,600,800); 
      
   
      bufferGraphics.drawImage(backgroundImage, 0, 0, 600, 800, this);
      
      
      if(moles[0].isAlive==true)
      {
         bufferGraphics.drawImage(hedgehogImage, 70, 410, 100, 100, this);
      }
      if(moles[1].isAlive==true)
      {
         bufferGraphics.drawImage(hedgehogImage, 95, 520, 100, 100, this);
      }
      if(moles[2].isAlive==true)
      {
         bufferGraphics.drawImage(hedgehogImage, 250, 600, 100, 100, this);
      }
      if(moles[3].isAlive==true)
      {
         bufferGraphics.drawImage(hedgehogImage, 440, 410, 100, 100, this);
      }
      if(moles[4].isAlive==true)
      {
         bufferGraphics.drawImage(hedgehogImage, 410, 520, 100, 100, this);
      }
      if(moles[5].isAlive==true)
      {
         bufferGraphics.drawImage(hedgehogImage, 250, 380, 100, 100, this);
      }
      
      
      
     // bufferGraphics.drawString("Counter: " + counter, 100, 100);
      
      
      bufferGraphics.setColor(Color.BLUE);
      bufferGraphics.setFont(firstFont);
      bufferGraphics.drawString(s+score, 450, 50);
   
   
   
      bufferGraphics.setColor(Color.WHITE);
      bufferGraphics.setFont(secondFont);
      bufferGraphics.drawString("Level " + level, 260, 50);
   
   
   
   
      if(score==10)
      {
         level++;
         score=0;
         
      }
   
   
   
   
   
   
      g.drawImage(offscreen,0,0,this);   
   
   }// paint()
   
   
   public void random()
   {
      counter--;
      
      
      if(counter<=30 && counter>=-40)
      {
         moles[0].isAlive=true;
         counter = (int)(Math.random()*70);
         counter--;
      }
      else 
         moles[0].isAlive=false;
         
      
      if(counter<=120 && counter>=40)
      {
         moles[1].isAlive=true;
         counter=(int)(Math.random()*70);
         counter--;
      }
      else 
         moles[1].isAlive=false;
         
      
      if(counter<=90 && counter>=10)
      {
         moles[2].isAlive=true;
         counter = (int)(Math.random()*70);
         counter--;
      }
      else 
         moles[2].isAlive=false;
         
      
      if(counter<=90 && counter>=20)
      {
         moles[3].isAlive=true;
         counter=(int)(Math.random()*70);
         counter--;
      }
      else 
         moles[3].isAlive=false;
         
      
      if(counter<=40 && counter>=-20)
      {
         moles[4].isAlive=true;
         counter = (int)(Math.random()*70);
         counter--;
      }
      else 
         moles[4].isAlive=false;
         
      
      if(counter<=40 && counter>=-40)
      {
         moles[5].isAlive=true;
         counter=(int)(Math.random()*70);
         counter--;
      }
      else 
         moles[5].isAlive=false;
      
      
      
      
      
      
      
      
     
   }//random()
   
   
   public void update (Graphics g)
   {
      paint (g);
   }
   
   public void run()
   {
      while(true)
      {
      
         random();  
         repaint();
        
         try {
            if(level==1)
               thread.sleep(600);
            
            if(level==2)
               thread.sleep(500);
               
            if(level==3)
               thread.sleep(400);
               
            if(level==4)
               thread.sleep(300);
               
            if(level>=5)
               thread.sleep(200);
            
         }
         catch (Exception e){ }
      }
   }
      
   
   public void move()
   {
   }
   

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
      
      
      
      for(int x=0;x<6;x++)  
      {
         if(moles[x].rec.contains(mouseX, mouseY) && moles[x].isAlive==true)
         {
            moles[x].isAlive=false;
            score++;
            thud.play();
         
         }
      
      
      
      }      
   
   }

}//Applet