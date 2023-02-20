/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gr12FebPastPaper2021;

import java.time.LocalDate;

/**
 *
 * @author Kyrab
 */
public class Officer extends CrewMember {

    private int rank;
    private LocalDate datePromoted;
    public static int numPromotedOfficers = 0;

    public Officer(String intFn, int inCID, String inDT, int inRK, LocalDate inDP) {
        super(intFn, inCID, inDT);

    }

    Officer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int Rank) {
        this.rank = Rank;
    }

    public String getTitle() {
        String title = "";
        switch (rank) {
            case 1:
                title = "Ensign";
                break;
            case 2:
                title = "Lieutenant";
                break;
            case 3:
                title = " Lt Commander";
                break;
            case 4:
                title = "Commander";
                break;
            case 5:
                title = "Captain";
                break;
        }

        return title;

    }

    @Override
    public String toString() {
        String out = " "+ getFullname()+"   "+ "crewID"+ getCrewID()+ " "+"["+ getDepartment()+"]"+getTitle();
        return out;
    }
    
    public void promote(){
        if(rank>=4){
            numPromotedOfficers+=1;
            datePromoted= LocalDate.now();
        }
        
    }

}
