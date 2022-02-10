/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanners;

import java.util.Scanner;

/**
 *
 * @author Kyrab
 */
public class ScannerBasics {
    public static void main(String[] args) {
        String name = "Patrick Simon Junior Gregersoning";
        
        //using string manipulation techniques
//        String surname = name.substring(name.lastIndexOf(" ") + 1);
//        String namesOnly = name.substring(0, name.lastIndexOf(" "));
//        
//        String intials = "";
//        
//        while(namesOnly.contains(" ")){
//            intials += namesOnly.charAt(0) + "";
//            
//            
//            namesOnly = namesOnly.substring(namesOnly.indexOf(" ") + 1);
//        }
//        intials += namesOnly.charAt(0) + ""; 
//        
//        
//        System.out.println(intials + " " + surname);


           Scanner nameScanner = new Scanner(name);
           String currentName = "";
           
           String initAndSurname = "";
           while(nameScanner.hasNext()){
               currentName = nameScanner.next();
               
               if(nameScanner.hasNext()){
                  initAndSurname += currentName.charAt(0) + ""; 
               }
           }
           initAndSurname += currentName;
           
           
           
    }
}
