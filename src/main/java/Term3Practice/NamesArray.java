/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Term3Practice;

import java.util.Scanner;

/**
 *
 * @author Kyrab
 */
public class NamesArray {

    private String[] nameArr = new String[100];
    private int size = 0;
    private String filePath = "data//name.txt";

    public NamesArray() {
        Scanner fileScanner = new Scanner(filePath);

        while (fileScanner.hasNext()) {
            String name = fileScanner.next();
            nameArr[size] = name;
            size++;
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
                if (nameArr[i].compareTo(nameArr[j]) < 0) {
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
        boolean found = false;
        while (start <= end && found == false) {
            mid = (start + end) / 2;
            if (inName.compareTo(nameArr[mid]) > 0) {
                start = mid + 1;
            } else if (inName.compareTo(nameArr[mid]) < 0) {
                end = mid - 1;
            } else {
                found = true;
                pos = mid;
            }

        }
        return pos;

    }

    
}
