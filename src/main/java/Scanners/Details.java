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
public class Details {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("enter details");
        
        Scanner scr = new Scanner(input);
        
       
 
            String name =  scr.next();
            int number = scr.nextInt();
            double height = scr.nextDouble();
            boolean smoke = scr.nextBoolean();
            
            System.out.println("Name:"+ name +"  "+"Id number:" +number + "  "+ "height:"+ height + "  "+ "smoke:"+ smoke );
                    
        
    }
    
    
}
