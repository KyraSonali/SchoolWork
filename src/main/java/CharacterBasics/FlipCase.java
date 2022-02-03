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
public class FlipCase {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("input string of any length");
        int inputLen = input.length();
        String output = "";

        for (int i = 0; i < inputLen; i++) {

            char currentL = input.charAt(i);
            if (Character.isLowerCase(currentL)) {
                String upperL = "" + currentL;
                upperL = upperL.toUpperCase();
                output += upperL;

            } else if (Character.isUpperCase(currentL)) {
                String lowerL = "" + currentL;
                lowerL = lowerL.toLowerCase();
                output+= lowerL;

            }// end o if

        }//end of for loop

        System.out.println(output);

    }

}
