/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayManipulation;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Kyrab
 */
public class Person {

    private String name;
    private String surname;
    private int age;
    private String filePath = "data//people.txt";

    public Person(String inName, String inSurname, int inAge) {
        name = inName;
        surname = inSurname;
        age = inAge;

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", surname=" + surname + ", age=" + age + '}';
    }

    public void addPerson(String name, String surname, int age) {
        try {
            FileWriter fw = new FileWriter(filePath, true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println();
            pw.println(name + "#" + surname + "#" + age);

            pw.close();
        } catch (IOException ex) {
            System.out.println("File not found");
        }
    }

}
