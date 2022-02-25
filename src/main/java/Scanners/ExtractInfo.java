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
public class ExtractInfo {

    public static void main(String[] args) {

        String filePath = "data//textFile.txt";

        try {
            Scanner sc = new Scanner(new File(filePath)).useDelimiter("#");

            while (sc.hasNext()) {
                int num = sc.nextInt();
                String gender = sc.next();
                String name = sc.next();
                int gradeNbr = sc.nextInt();
                String grletter = sc.next();
                
                System.out.println("Class number:"+ num);
                System.out.println("Name:"+ name);
                System.out.println("Gender:"+ gender);
                System.out.println("Grade"+ gradeNbr );
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ExtractInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
