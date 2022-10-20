/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

/**
 *
 * @author Kyrab
 */
public class DateClass {
    public static void main(String[] args) {
        
        LocalDate day =  LocalDate.now();
        
        //question 1-> findind age
        LocalDate birthDate= LocalDate.of(2005, Month.APRIL, 10);
        int age = birthDate.getYear()- day.getYear();
        System.out.println(age);
        
        //Q2-> comparing ages
        LocalDate NeeraavDate = LocalDate.of(2005, Month.AUGUST, 28);
        LocalDate KyraDate = LocalDate.of(2005, Month.APRIL, 10);
        
        if(NeeraavDate.isBefore(KyraDate)){
            System.out.println("Neeraav is old");
        }else{
            System.out.println("Kyra is superior");
        }
        
        //Q3-> print out date three week 4 days from now
        LocalDate now = LocalDate.now();
        LocalDate futureDate =  now.plusWeeks(3).plusDays(4);
        System.out.println(futureDate);
       
        
        
        
        
        //factory pattern
        //of=constructor -> generates localdatetime for you
        
         
        
    }
    
}
