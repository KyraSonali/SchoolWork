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
public class CompareNames {

    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("enter word");
        String mostAlpha = input;

        for (int i = 1; i < 5; i++) {
            input = JOptionPane.showInputDialog("enter word");
            
            if (input.compareTo(mostAlpha) < 0) {
                mostAlpha = input;
            }

        }

        System.out.println(mostAlpha);

    }
}
