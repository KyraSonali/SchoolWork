/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kyrab
 */
public class Select {

    public static void main(String[] args) {
        
    
        
    }
    
    
    
    
    public static void getArray() {
        try {
            String filePath = "data//array.txt";
            Scanner arrayScanner = new Scanner(new File(filePath));
            
            while(arrayScanner.hasNext()){
                int nbrArray[] = {arrayScanner.nextInt()};
                print(nbrArray);
            }
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Select.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
      public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }
      
      public static void binarySort(int[]array,int input){
          //start (0))
          //end (array.length()-1;
          //start+end/2
         //(if blah bla bkas....)
        
          
      }


}
