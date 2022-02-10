/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanners;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Kyrab
 */
public class Oldest {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("enter name");

        int currentAge;
        String name;

        while (!input.equals("Stop")){
          Scanner sc = new Scanner(input);
          name = sc.next();
          currentAge = sc.nextInt();
         
          
           
         

            input = JOptionPane.showInputDialog("enter name");
        }

    }

}
