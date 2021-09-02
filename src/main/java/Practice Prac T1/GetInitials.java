import it.*;
import javax.swing.*;
import java.awt.*;

public class GetInitials
{
  public static void main (String[] args) 
  {
    // question
    String name = JOptionPane.showInputDialog(" What is your name");
    String surname = JOptionPane.showInputDialog("What is your surname");
    // finding letter
    char name1 = name.charAt(0);
    char name2 = surname.charAt(0);
    char s = (char)97;
    //display
    System.out.print( name1);
    System.out.print(name2);
    System.out.print(s);
  
  
  
  
  }
}