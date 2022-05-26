/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gr11JuneRevision;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kyrab
 */
public class ResultSetManager {
    
    private String filePath = "data//Results.txt";
    
    public void constructor( String f){
        f = filePath;
    }
    
    public void SaveResult(String n, String e,int sA,int sG,int sT){
        ResultSet rs = new ResultSet(n,e,sA,sG,sT);
        
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(filePath,true));
            pw.append(rs.toString());
            pw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(ResultSetManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void printRatings(){
        System.out.println("MATH APP - ALL RESULTS");
        System.out.println("----------------------");
        Scanner fileScanner = new Scanner(filePath).useDelimiter("#");
        String name=""; 
        while(fileScanner.hasNext()){
            String currentName = fileScanner.next();
            name+=currentName;
            
            
        }
        
            
        
        
    }
}
