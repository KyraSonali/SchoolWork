import it.*;
import javax.swing.*;
import java.awt.*;

public class HotelCalc
{
  public static void main (String[] args) 
  {
    //questions
     String peopleStr = JOptionPane.showInputDialog( "How many people will be staying");
     String nightStr = JOptionPane.showInputDialog( "How many nights will they be staying");
     //conversion
     int people = Integer.parseInt(peopleStr);
     int night = Integer.parseInt(nightStr);
     //variable
     double cost = 490.90;
     //sums
     double totalCost = people * night * cost;
     double discount = totalCost - ( totalCost * 10/100.0);
     //display
     System.out.println("Here is your total cost: " + totalCost);
     System.out.println("Here is your discount price:" + discount);
     
  
  
  
  
  }
}