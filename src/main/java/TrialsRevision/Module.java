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
public class Module {

    private String courseID;
    private String moduleID;
    private String moduleName;
    private Assessment assessments[];
    private int size;
    public static final int PASS_MARK = 50;

    public Module(String inCID, String inMID, String inMN) {
        courseID = inCID;
        moduleID = inMID;
        moduleName = inMN;
        assessments = new Assessment[15];

    }

    public String getModuleID() {
        return moduleID;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void addAssesment(Assessment assessment) {
        assessments[size] = assessment;
        size++;
    }

    public LocalDate getExamDate() {
        for (int i = 0; i < size; i++) {
            if (assessments[i].isIsExam()) {
                return assessments[i].getDateWritten();
            }
        }
        return null;
    }

    public double getModuleMark() {
        double combinedMark;
        double percentage;
        double contribution;
        double weighting = 0.1;
        double moduleMark=0;
        for (int i = 0; i < size; i++) {
            combinedMark = assessments[i].getMark() / assessments[i].getTotal();
            percentage = combinedMark * 100;
            contribution = percentage*weighting;
            moduleMark+= contribution;

        }
        return moduleMark;
    }

}
