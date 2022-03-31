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
public class ExtractDomain {

    public static void main(String[] args) {
        String filePath = "data//websites.txt";

        try {
            int count = 0;
            int processed = 0;
            Scanner fileScanner = new Scanner(new File(filePath));

            while (fileScanner.hasNext()) {
                String line = fileScanner.nextLine();
                Scanner lineScanner = new Scanner(line).useDelimiter("[.]");
                String otherInfo = lineScanner.next();
                String domain = lineScanner.next();
                count++;
                processed++;
                System.out.println("Domain" + count + ":" + domain);

                lineScanner.close();
            }
            fileScanner.close();
            System.out.println("Websites processed:" + processed);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ExtractDomain.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
