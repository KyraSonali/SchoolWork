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
public class CountWords {
    public static void main(String[] args) {
        //initialise
        String word = JOptionPane.showInputDialog("input words");
        int count=0;
        
        //check
        while(word.equalsIgnoreCase("stop")){
            
        //process
        count++;           
        System.out.println(word);
        
        //change
        word = JOptionPane.showInputDialog("input words");
        
        }
        
        System.out.println("Total nbr of words:"+ count);

        
        
        
    }
    
}
