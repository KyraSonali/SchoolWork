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
public class DoubleLetters {

    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("enter word");
        char prevL =input.charAt(0);
        String output="" + prevL;

        for (int i = 0; i < input.length(); i++) {
            char currentL = input.charAt(i);
            if(  currentL!= prevL){
                output+= currentL;
                
            }
            
            prevL=currentL;

        }
        
        System.out.println(output);

    }

}
