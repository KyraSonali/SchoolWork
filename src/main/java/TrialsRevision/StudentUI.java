/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrialsRevision;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Kyra Balliram
 */
public class StudentUI {
    public static void main(String[] args) {
        LocalDate DOB = LocalDate.of(2005,7,6);
        Student k = new Student("Geoffrey Leigh Palmers",DOB);
        System.out.println(k.toString());
        System.out.println(k.getAcademicRecord());
        //k.sortByDate()
        System.out.println(k.getExamSchedule());
        
    }
    
}
