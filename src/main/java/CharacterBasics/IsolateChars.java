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
public class IsolateChars {

    public static void main(String[] args) {

        String inputStr = JOptionPane.showInputDialog("Input any word");
//        String firstLetter = "" + inputStr.charAt(0);
//
//        for (int i = inputStr.length() - 1; i >= 0; i--) {
//            //words backwards
//            System.out.println( inputStr.charAt(i));
//       
//        }
//             System.out.println();

        for (int j = 0; j < inputStr.length(); j++) {
            int k = (inputStr.length() - 1) - j;

            if (j < k) {
                System.out.println(inputStr.charAt(j));
                System.out.println(inputStr.charAt(k));
            } else if (j == k) {
                System.out.println(inputStr.charAt(j));

            } else {
                break;
            }

        }

    }

}
