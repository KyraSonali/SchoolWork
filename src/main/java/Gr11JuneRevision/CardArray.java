/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gr11JuneRevision;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kyrab
 */
public class CardArray {

    private Card[] cArr;
    private int size;

    public CardArray() {
        cArr = new Card[20];
        size = 0;
        //file path
        String filePath = "data//Cards.txt";
        try {
            ///file scanner
            Scanner fileScanner = new Scanner(new File(filePath));
            //while(hasNext)
            while (fileScanner.hasNext()) {
                //isolate line using file scanner
                String line = fileScanner.nextLine();
                //line scanner + DELIMETER
                Scanner lineSc = new Scanner(line).useDelimiter(";");
                //isolate stuff from line
                String name = lineSc.next();
                String type = lineSc.next();
                int basic = lineSc.nextInt();
                int special = lineSc.nextInt();
                int leader = lineSc.nextInt();
                int unique = lineSc.nextInt();

                cArr[size] = new Card(name, type, basic, special, leader, unique);
                size++;
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(CardArray.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String toString() {
        String output = "";
        for (int i = 0; i < size; i++) {
            Card card = cArr[i];
            output += card.toString() + "\n";

        }
        return output;
    }

    public void sort() {
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (cArr[j].getName().compareTo(cArr[i].getName())<0) {
                    Card temp = cArr[j];
                    cArr[j] = cArr[i];
                    cArr[i] = temp;
                }
            }

        }
     
    }

}
