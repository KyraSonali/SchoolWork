/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Term3Practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kyrab
 */
public class NamesArray {

    private String[] nameArr = new String[100];
    private int size = 0;
    private String filePath = "data//name.txt";

    public NamesArray() {
        try {
            Scanner fileScanner = new Scanner(new File(filePath));

            while (fileScanner.hasNext()) {
                String name = fileScanner.next();
                nameArr[size] = name;
                size++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NamesArray.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String toString() {
        String output = "";
        for (int i = 0; i < size; i++) {
            output += nameArr[i] + "\n";
        }
        return output;
    }

    public void sort() {
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (nameArr[i].compareTo(nameArr[j])> 0) {
                    String temp = nameArr[i];
                    nameArr[i] = nameArr[j];
                    nameArr[j] = temp;
                }
            }
        }
    }

    public int search(String inName) {
        int mid = 0;
        int start = 0;
        int end = size;
        int pos = -1;
        while (start <= end) {
            mid = (start + end) / 2;
            if (inName.compareTo(nameArr[mid]) > 0) {
                start = mid + 1;
            } else if (inName.compareTo(nameArr[mid]) < 0) {
                end = mid - 1;
            } else {

                pos = mid;
            }

        }
        return pos;

    }

    public void insert(String inName) {
        int insertionIndex = 0;
        for (int i = 0; i < size; i++) {

            if (nameArr[i].compareTo(inName) > 0) {
                insertionIndex = i;
                break;
            }
            
          

        }
        
        shiftRight(insertionIndex);
            nameArr[insertionIndex] = inName;
             size++;
    }

    public void delete(String inName) {

            int index = search(inName) ;
            if (index >= 0) {
                shiftLeft(index);
            }

           

        
    }

    private void shiftRight(int index) {
        for (int i = size; i >index; i--) {
            nameArr[i] = nameArr[i - 1];

        }
    }

    private void shiftLeft(int index) {
        for (int i = index; i < size-1; i++) {
            nameArr[i] = nameArr[i + 1];

        }
        size--;
    }

}
