import it.*;
import javax.swing.*;
import java.awt.*;

public class CapitalIT
{
  public static void main (String[] args) 
  {
     Gogga bug = new Gogga();
     //change color
     bug.setColor(Color.blue);
     
     bug.move();
     bug.move();
     bug.setPosition(6,3);
     bug.setDirection(Gogga.RIGHT);
     bug.move();
     bug.move();
     
     //get coordinates
     System.out.println("Here is your x coordinate :" + bug.getXPos());
     System.out.println("Here is your y coordinate :" + bug.getYPos());
     
     
  
  }
}