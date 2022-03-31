/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanners;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Kyrab
 */
public class StoreLoginDetails {

    public static void main(String[] args) throws IOException {
        String filePath = "data//loginDetails.txt";

        try {
            
            String username = JOptionPane.showInputDialog("enter username");
            String password = JOptionPane.showInputDialog("password");
            
            String output = "";
            
            while (!username.equals("STOP")) {
                //add all text to a string
                output += username + "#" + password + "\n";
                
                
                
                //change
                username = JOptionPane.showInputDialog("enter username");
                password = JOptionPane.showInputDialog("password");
            }
            //add text string using printwrtier in ONE TIME
            PrintWriter pw = new PrintWriter(new FileWriter(filePath,true));
            pw.println(output);
            pw.close();

        } catch (FileNotFoundException ex) {

            Logger.getLogger(StoreLoginDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
