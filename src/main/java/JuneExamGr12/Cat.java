/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JuneExamGr12;

/**
 *
 * @author Kyrab
 */
public class Cat {

    private String catname;
    private String ownerName;
    private String breed;
    private int age;
    private double weight;
    private int competitionClass;
    public static final int KITTEN = 0;
    public static final int VETERAN = 1;
    public static final int HOUSEHOLD_PET = 2;
    public static final int CHAMPIONSHIP = 3;

    public Cat(String inCN, String inON, String inB, int inA, double inW, int inCC) {
        catname = inCN;
        ownerName = inON;
        breed = inB;
        age = inA;
        weight = inW;
        competitionClass = inCC;

    }

    public int getCompetitionClass() {
        return competitionClass;
    }

    public String generateCompetitionCode() {
        String code;
        String prefix = "";
        switch (competitionClass) {
            case KITTEN:
                prefix = "KIT";
            case VETERAN:
                prefix = "VET";
            case HOUSEHOLD_PET:
                prefix = "HOUSE";
            case CHAMPIONSHIP:
                prefix = "CHAMP";

        }

        code = prefix + "-"+ catname.substring(0, 2).toUpperCase()+ "-" + Math.round(Math.random() * 999 + 1) + "";
        return code;

    }

    @Override
    public String toString() {
        return generateCompetitionCode() + ": " + catname+ ","+ ownerName+ ","+ breed;
    }
    
    

}
