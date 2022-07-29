/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayManipulation;

import java.io.File;
import java.io.FileNotFoundException;
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
public class PersonManager {

    private Person[] pArr = new Person[100];
    private int size;
    private String filePath = "data//people.txt";

    public PersonManager() {
        
        try {
            Scanner fileScanner = new Scanner(new File(filePath));
            while (fileScanner.hasNext()) {
                String line = fileScanner.next();
                Scanner lineSc = new Scanner(line).useDelimiter("#");
                String name = lineSc.next();
                String surname = lineSc.next();
                int age = lineSc.nextInt();
                pArr[size] = new Person(name, surname, age);
                size++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PersonManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }


    public int binarySearch(String iNname) {
        int mid = 0;
        int start = 0;
        int end = size;
        int pos = -1;
        boolean found = false;
        while (start <= end && found == false) {
            mid = (start + end) / 2;
            if (iNname.compareTo(pArr[mid].getName()) > 0) {
                start = mid + 1;
            } else if (iNname.compareTo(pArr[mid].getName()) < 0) {
                end = mid - 1;
            } else {
                found = true;
                pos = mid;
            }

        }
        return pos;

    }

    @Override
    public String toString() {
        String out = "";
        for (int i = 0; i < size; i++) {
            out += pArr[i] + "\n";
        }
        return out;
    }

    public void nameSort() {
        //selection
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (pArr[i].getName().compareTo(pArr[j].getName()) > 0) {
                    Person temp = pArr[i];
                    pArr[i] = pArr[j];
                    pArr[j] = temp;

                }
            }
        }
    }

    public void ageSort() {
        //bubble
        for (int i = size - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (pArr[j].getAge() > pArr[j + 1].getAge()) {
                    Person temp = pArr[j];
                    pArr[j] = pArr[j + 1];
                    pArr[j + 1] = temp;

                }
            }
        }
    }

    public void add(Person p) {
        //adding person into array in a specific position (name)
        nameSort();
        int pos=0;
        while(pArr[pos].getName().compareTo(p.getName()) < 0){
            pos++;
        }
        shiftMore(pos);
        pArr[pos]=p;

        
        
    }
    
    private void shiftMore(int p){
        for(int i=size;i>=p;i--){
            pArr[i]=pArr[i-1];
        }
        size++;
    }
    
//    public void delete(Person p){
//        int pos = binarySearch(p.getName());
//        shiftLess(pos);
//    }
        public void delete(int p){
        int pos = p;
        shiftLess(pos);
    }
    
    //shift less method
    private void shiftLess(int x){
        for(int i =x ; i<size-1;i++){
            pArr[i]=pArr[i+1];
        }
        size--;
    }
    
    


}
