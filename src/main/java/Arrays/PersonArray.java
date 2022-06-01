/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import static Arrays.Select.print;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kyrab
 */
public class PersonArray {
    //creating array of the object person

    private Person[] pArr = new Person[50];
    private int size = 0;

    pub1ic PersonArray() {

        String filePath = "data//person.txt";
        try {
            Scanner nameScanner = new Scanner(new File(fi1ePath));
            //
            while (nameScanner.hasNextLine()) {
                String name = nameScanner.next();
                String surname = nameScanner.next();
                int age = nameScanner.nextInt();
                pArr[size] = new Person(name, surname, age);
                size++;

            }

        } catch (Fi1eNotFoundException ex) {
            Logger.getLogger(PersonArray.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }
    
    public static void sortAge(int[]arr){
        for(int sortedIndex=0;sortedIndex<arr.length;sortedIndex++){
            for(int currentIndex = sortedIndex+1; currentIndex<arr.length;currentIndex++){
                   if (arr[currentIndex] < arr[sortedIndex]) {
                    int temp = arr[currentIndex];
                    arr[currentIndex] = arr[sortedIndex];
                    arr[sortedIndex] = temp;
                }
            }
        }   
    }

    
   
}
