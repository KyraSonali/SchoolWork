/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanners;

import ObectsAndClasses.Client;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Kyrab
 */
public class ScannerUI {
    
    public static void main(String[] args) {
        
        String filePath = "data//nameFile.txt" ; 
        String currentName;
        try {
    
            
            Scanner filesc = new Scanner(new File(filePath));
            while(filesc.hasNextLine()){
                
                String line = filesc.nextLine();
                
                Scanner linesc = new Scanner(line).useDelimiter("#");
                
                String name = linesc.next();
                String acc = linesc.next();
                double bal = linesc.nextDouble();
                
                Client c = new Client(name, acc, bal);
                
                System.out.println("Name:"+ c.toString());
            }
                  
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ScannerUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
