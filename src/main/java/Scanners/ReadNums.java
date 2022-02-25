/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanners;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Kyrab
 */
public class ReadNums {

    public static void main(String[] args) throws FileNotFoundException {

        String filePath = "data//intNums.txt";
        Scanner numberScanner = new Scanner(new File(filePath));

        while (numberScanner.hasNextInt()) {
            int number = numberScanner.nextInt();
            System.out.println(number); 
                  
            

        }

    }

}
