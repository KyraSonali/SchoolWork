/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrialsRevision;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kyra Balliram
 */
public class Student {

    //Q4.1
    private String studentName;
    private LocalDate dateOfBirth;
    private String studentID;
    private Module modules[];
    private int size=0;

    //Q4.2
    public Student(String inN, LocalDate inDOB) {
        studentName = inN;
        dateOfBirth = inDOB;
        modules = new Module[15];

        String filePath = "data//ExampleStudentModules.txt";
        try {
            Scanner filesc = new Scanner(new File(filePath));
            while (filesc.hasNext()) {
                String line = filesc.nextLine();
                Scanner linesc = new Scanner(line).useDelimiter("#");
                String sId = linesc.next();
                String mID = linesc.next();
                String modName = linesc.next();
                modules[size] = new Module(sId, mID, modName);
                size++;

            }
        } catch (FileNotFoundException ex) {

            System.out.println("file cannot be found");
        }//end of 4.2

        //4.4
        String assessmentFilePath = "data//ExampleStudentAssessments.txt";
        try {
            Scanner assessmentFilesc = new Scanner(new File(assessmentFilePath));
            while (assessmentFilesc.hasNext()) {
                String line = assessmentFilesc.nextLine();
                Scanner assessmentLinesc = new Scanner(line).useDelimiter("#");
                String mId = assessmentLinesc.next();
                String mName = assessmentLinesc.next();
                int t = assessmentLinesc.nextInt();
                int m = assessmentLinesc.nextInt();
                double w = assessmentLinesc.nextDouble();
                String d = assessmentLinesc.next();
                DateTimeFormatter dateModel = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                LocalDate dateWritten = LocalDate.parse(d, dateModel);
                boolean exam = assessmentLinesc.nextBoolean();
                Assessment a = new Assessment(mId, mName, t, m, w, dateWritten, exam);
                addAssessment(a,mId);
                size++;

            }
        } catch (FileNotFoundException ex) {
            System.out.println("student assesment file cannot be found");
        }

    }

    public String getStudentName() {
        return studentName;
    }

    //Q4.3
    private void addAssessment(Assessment assessment, String assessmentModuleID) {
        for (int i = 0; i < size; i++) {
            if (modules[i].getModuleID().equals(assessmentModuleID)) {
               modules[i].addAssesment(assessment);
            }
        }

       
        
    }

    @Override
     //Q4.5
    public String toString() {
        String out = " ";
        for(int i =0 ; i<size;i++){
            out = "STUDENT:" + getStudentName() + modules.toString();
        }
        return out;
    }

}
