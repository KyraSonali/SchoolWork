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
public class SwopChars {
    public static void main(String[] args) {
        
        String input1 = JOptionPane.showInputDialog("Enter the first word");
        String input2 = JOptionPane.showInputDialog("Enter the second word");

        String firstLet = input1.charAt(0) + "";
        String restWord1 = input1.substring(1);

        String secondLet = input2.charAt(0) + "";
        String restWord2 = input2.substring(1);

        String newWord1 = secondLet + restWord1;
        String newWord2 = firstLet + restWord2;

        System.out.println(newWord1 + " and " + newWord2);

        
    }
    
}
