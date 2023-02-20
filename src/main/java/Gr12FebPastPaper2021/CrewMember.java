/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gr12FebPastPaper2021;

/**
 *
 * @author Kyrab
 */
public class CrewMember {

    private String fullname;
    private int crewID;
    private String department;
    public static int numPromotedCrew = 0;

    public CrewMember(String intFn, int inCID, String inDT) {
        this.fullname = intFn;
        this.crewID = inCID;
        this.department = inDT;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getCrewID() {
        return crewID;
    }

    public void setCrewID(int crewID) {
        this.crewID = crewID;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        String out = fullname + "  " + "Crew ID:" + " " + crewID + "    " + "[" + department + "]";
        return out;
    }

}
