import javax.swing.*;

public class TempConversion{
    public static void main(String[]args){
    String inputStr = JOptionPane.showInputDialog("Degrees-> Fahrenheit");
    double input = Double.parseDouble(inputStr);
    double form = (9* input /5.0)+32;
    System.out.print("Fahrenheit =" + form); 
    }
 }
    
    