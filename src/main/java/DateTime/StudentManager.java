/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DateTime;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kyrab
 */
public class StudentManager {

    private Student[] sArr = new Student[50];
    private int size;

    public StudentManager() {

        String filePath = "data//students.txt";
        try {
            Scanner filesc = new Scanner(new File(filePath));

            while (filesc.hasNext()) {
                String line = filesc.nextLine();
                Scanner linesc = new Scanner(line).useDelimiter("#");
                String name = linesc.next();
                String surname = linesc.next();
                String birthday = linesc.next();
                //localdatethingy
                DateTimeFormatter inputFormater = DateTimeFormatter.ofPattern("dd-MM-yy");
                LocalDate birthdayLD = LocalDate.parse(birthday, inputFormater);

                sArr[size] = new Student(name, surname, birthdayLD);
                size++;

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public String toString() {
        String out="";
            for (int i = 0; i < size; i++) {
            Student s = sArr[i];
            out += s.toString() + "\n";

        }
        return out;

    }
}
