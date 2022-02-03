/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CharacterBasics;

import javax.swing.JOptionPane;


/**
 *
 * @author Kyrab
 */
public class CountLetterDigits {
    
    public static void main(String[] args) {  
        int count = 0;
        char upperCase;
        //initialise variable
        char input = JOptionPane.showInputDialog("input").charAt(0);
        
        //check variable/test
        while(input != 'X'){
            
            //process variable
            //4.2- count characters
            count++;//keeps  track of letters
            upperCase = Character.toUpperCase(input);
            //4.3 - uppercases
            System.out.println(upperCase);
            
            //change the variable
            input = JOptionPane.showInputDialog("input characters").charAt(0);//awlays add at the end of while loop to exculde last input.2
        }
          System.out.println("There were "+ count + " characters entered");

        
   
        
  
        
        
    }
    
    
    
    
    
    
}
