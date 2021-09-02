import javax.swing.JOptionPane;

public class projects{
     public static void main (String[]args){
     
      //SalesCalc
      // String priceStr = JOptionPane.showInputDialog("Price?");
      // double price = Double.parseDouble(priceStr);
      
      // double deduction = price- (price* 5/100.0);
      // double VAT = deduction +(deduction*15/100.0);
      
      // System.out.print( VAT);
      
      //Zinzi
      String AStr = JOptionPane.showInputDialog("Give me a number for A");
      String BStr = JOptionPane.showInputDialog("Give me another number for B");
      
      int A = Integer.parseInt(AStr);
      int B = Integer.parseInt(BStr);
      
      System.out.println("A=" + A);
      System.out.println ("B=" + B);
      
      int constant = A;
       A = B;
       B = constant;
      
      System.out.println( "A="+ A);
      System.out.println("B="+ B);
      




   }
 }