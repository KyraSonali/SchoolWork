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
public class ConvertDate {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("input date: DDMMYY");

        String day = input.substring(0, 2);
        String month = input.substring(2, 4);
        String year = input.substring(4, 6);

        System.out.println(year + "/" + month + "/" + day);
        
      

    }

}
