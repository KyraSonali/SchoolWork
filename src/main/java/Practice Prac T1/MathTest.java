import it.*;
import javax.swing.*;
import java.awt.*;

public class MathTest
{
  public static void main (String[] args) 
  {
   //volume of sphere
   int radi = 12;
   double volume = (4/3.0 * Math.PI * Math.pow(radi,3));
   System.out.print( volume);
   
   //5.2 -> Random number
   double minValue = 20;
   double maxValue = 39;
   
   double random = (Math.random()*((maxValue-minValue)* minValue + 1)); 
   int random1 = Integer.castingInt(random);
   System.out.print(random1);

  
  
  
  
  }
}