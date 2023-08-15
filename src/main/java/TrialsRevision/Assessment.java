/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrialsRevision;

import java.time.LocalDate;

/**
 *
 * @author Kyrab
 */
public class Assessment {
    
    private String moduleID;
    private String assessmentName;
    private int total;
    private int mark;
    private double weighting;
    private LocalDate dateWritten;
    private boolean isExam;

    public Assessment(String inID, String inAn,int inT, int inM, double inW,LocalDate inD,boolean inE) {
        moduleID = inID;
        assessmentName=inAn;
        total = inT;
        mark = inM;
        weighting = inW;
        dateWritten = inD;
        isExam=inE;
        
    }

    public String getAssessmentName() {
        return assessmentName;
    }

    public int getTotal() {
        return total;
    }

    public int getMark() {
        return mark;
    }

    public double getWeighting() {
        return weighting;
    }

    public LocalDate getDateWritten() {
        return dateWritten;
    }

    public boolean isIsExam() {
        return isExam;
    }

    @Override
    public String toString() {
        return getAssessmentName()+ " : " + getMark()+ "/" + getTotal();
    }
    
    
    
    
    
}
