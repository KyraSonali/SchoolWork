/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanners;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Kyrab
 */
public class ReadNames {

    public static void main(String[] args) throws FileNotFoundException {

        String filepath = "data//names.txt";
        Scanner nameScanner = new Scanner(new File(filepath));
        
        String surname = "";
        String name="";
        String initial="";
        
        while (nameScanner.hasNext()) {
            name = nameScanner.next();
             initial = name.charAt(0) + " ";
            surname = nameScanner.next();
            System.out.print(initial);
            System.out.print(surname);
            System.out.println("");

        }

    }

}
