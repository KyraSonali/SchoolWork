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
public class GenerateEmail {
    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog("enter your full name");

        
        int firstSpace = input.indexOf(" ");
        int lastSpace = input.lastIndexOf(" ")+1;
        
        String firstName = input.substring(0,firstSpace);
        String lastName = input.substring(lastSpace);
        
        System.out.println(firstName + "."+ lastName + "@reddam.house");
             
        
        
        
        
        
        
    }
    
}
