import java.awt.*;

public class Hammer
{
   public int width;
   public int height;
   public Rectangle rec;
   public int dx;
   public int dy;
   public int xpos;
   public int ypos;

   public Hammer(int x, int y)
   {
   xpos=x;
   ypos=y;
   width=10;
   height=20;
   
   rec= new Rectangle(xpos, ypos, width, height);
   
   }
   
   public void move()
   {
   xpos=xpos+dx;
   ypos=ypos+dy;
   
   rec= new Rectangle(xpos, ypos, width, height);
   }


}