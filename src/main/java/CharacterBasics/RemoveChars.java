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
public class RemoveChars {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("input a word");
        String unwanted= JOptionPane.showInputDialog("input unwanted characters");
        
        int inputLen = input.length();
       // int unwantedLen = unwanted.length();
        
        String output="";
        
        for(int i = 0; i< inputLen ; i++){
            
            char currentL = input.charAt(i);
            
            if(!unwanted.contains(currentL+"")){
                output+=currentL;
            }
            
        }
        System.out.println(output);
        
        
        
        
    }
    
}
