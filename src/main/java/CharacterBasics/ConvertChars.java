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
public class ConvertChars {
    public static void main(String[] args) {
        char upperCase; 
        int number; 
        double sqrt;
        int value; 
       
        char input= JOptionPane.showInputDialog("enter characters").charAt(0);
        
        while(Character.isLetterOrDigit(input)){
            
            if(Character.isLetter(input)){
                 upperCase = Character.toUpperCase(input);
                 System.out.println("Upper case of Character:"+ upperCase);
            } else if(Character.isDigit(input)){
                 number = (int)(input);
                 sqrt = Math.sqrt(number);
                 System.out.println("Square root of number:"+ sqrt);
            } else if(Character.isWhitespace(input)){
                value = Character.getNumericValue(input);
                System.out.println(value);
             
            }
            
            input= JOptionPane.showInputDialog("enter characters").charAt(0);
        }
    }
    
}
