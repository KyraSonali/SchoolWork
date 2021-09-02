import javax.swing.*;

public class HCF{
    public static void main(String[]args){
           String firstStr = JOptionPane.showInputDialog("Give me your first nbr");
           String secondStr = JOptionPane.showInputDialog("Give me your second nbr");
           
           int first_num = Integer.parseInt ( firstStr);
           int sec_num = Integer.parseInt (secondStr);
           
           int HCF = 1;
     
           for ( int i=1 ; i<= first_num && i <= sec_num ; i++){
               if (first_num%i == 0 && sec_num%i ==0){
                   HCF = i;
               
                }
           }
           System.out.print("The HCF of" + "\t" + first_num + "\t" + "and" + "\t"  + sec_num + "\t" + "=" + HCF);
   }
 }