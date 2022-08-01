/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Term3Practice;

/**
 *
 * @author Kyrab
 */
public class NamesArrUI {

 
    public static void main(String[] args) {
        NamesArray n = new NamesArray();
        n.sort();
       
        n.delete("Robbie");
        System.out.println(n.toString());
        
    }

  
  
    
    
}
