import javax.swing.*;

   public class EasterAlgo{
      public static void main(String [] args ){
      
         String input = JOptionPane.showInputDialog("Input a year :)");
         int yearInt = Integer.parseInt(input);
         
         int a = yearInt - 1900;
         int b = a%19;
         int c = (7 * b +1)/19;
         int d = (11 * b + 4 - c) %29;
         int e = a/4;
         int f = (a + e + 31 - d)%7;
         int g = 25 - d - f;
     
         
            if(g>0)
            {
            System.out.println("Easter date is on"+ g +"\t" +  "April");
            }
            else
            {
            int day = 31 + g;
            System.out.println("Easter date is on" + "\t" + day + "\t"+ "March");
            }
      
      
      
      
      }


}