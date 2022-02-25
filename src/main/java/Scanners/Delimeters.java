/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanners;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kyrab
 */
public class Delimeters {
    public static void main(String[] args) {
        
        String filepath = "data//textFile.txt";
        
        try {
            Scanner sc = new Scanner (new File(filepath)).useDelimiter("#");
            while(sc.hasNext()){
                String word = sc.next();
                System.out.println(word);
            }
            sc.close();
            
            
            
            
        } catch (FileNotFoundException ex) {
            
            Logger.getLogger(Delimeters.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
    }
    
}
