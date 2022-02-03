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
public class EncodeWord {

    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("input word");

        for (int i = 0; i < input.length(); i++) {
            
            int currentL = input.charAt(i)+1;
            
            System.out.println((char)currentL);
            
  
        }
    }

}
