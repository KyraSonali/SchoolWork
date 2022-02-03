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
public class WordGames {

    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("input a word that is based of previous words letter");
        String secondInput = JOptionPane.showInputDialog("input a word that is based of previous words letter");

        int score = 0;

        String lastL = "" + input.charAt(input.length()-1);
        String firstL = secondInput.substring(0);

        while (lastL.equalsIgnoreCase(firstL)) {
            
            System.out.println("input");
            System.out.println("second input");
            
            
            lastL = "" + input.length();
            firstL = secondInput.substring(0);
            score++;

            secondInput = JOptionPane.showInputDialog("input a word that is based of previous words letter");

        }

        System.out.println("you got:" + score + " " + "points");

    }

}
