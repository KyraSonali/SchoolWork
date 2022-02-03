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
public class EncodeWordThreeLetters {
    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog("input word");
        
        String upperWord = input.toUpperCase();
        //input = input.toUpperCase();
        int length = upperWord.length()-1;
       String output = "";

       
        if(length>3){
            //input = upperWord.substring(3) + upperWord.substring(0,3)
            String threeL = upperWord.substring(0,3);
            String restWord = upperWord.substring(3);
            String newWord = restWord+ threeL;
                       
            
            for( int i=0; i<=length;i++){
                
                int currentInt = newWord.charAt(i)+1; 
                if ( currentInt == 90){
                    currentInt = 60;
                    
                    
                }
                
                output+= (char)currentInt; 
        
                
                
            }
            
        }
        
        System.out.println(output);
    }
    
}
