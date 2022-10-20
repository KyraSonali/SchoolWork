/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Kyrab
 */
public class Student {

    private String studentName;
    private String studentSurname;
    private LocalDate studentBirthday;
   
    public Student(String inName, String inSurname, LocalDate inBirthday) {
        studentName = inName;
        studentSurname = inSurname;
        studentBirthday = inBirthday;
    }
    
    @Override
    public String toString() {
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        
        return "Student" + "name:"+ studentName +"\n"+ "surname:"+ studentSurname +  "\n"+"Birthday:"+ studentBirthday.format(outputFormatter);
    }
    
    
    
}
