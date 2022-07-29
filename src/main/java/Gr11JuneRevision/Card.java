/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gr11JuneRevision;

/**
 *
 * @author Kyrab
 */
public class Card {

    private String name;
    private String type;
    private int basic;
    private int special;
    private int leader;
    private int unique;

    private static int LIGHTFACTOR = 3;
    private static double DARKFACTOR = 2.5;
    //my variables

    //constructor
    public Card (String inName, String inType, int inBasic, int inSpecial, int inLeader, int inUnique) {
        name = inName;
        type = inType;
        basic = inBasic;
        special = inSpecial;
        leader = inLeader;
        unique = inUnique;

    }

    public String getName() {
        return name;
    }

    public boolean checkLight() {
        boolean determine = false;
        if (type.equalsIgnoreCase("light")) {
            determine = true;
        }
        return determine;
    }

    public double calcPoints() {
        double sum;
        if (checkLight() == true) {
            sum = (basic + special + leader + unique) * LIGHTFACTOR;
        } else {
            sum = (basic + special + leader + unique) * DARKFACTOR;
        }
        return sum;
    }

    public String getNameTypePoints() {
        return ("card name:" + name + " Points:" + calcPoints());
    }

    public String toString() {
        double factor = 0;
        if (checkLight() == true) {
            factor = 3;
        } else {
            factor = 2.5;
        }

        return (name + " \t" + type + " \t" + basic + " \t" + special + "\t" + leader + "\t" + unique + "\t " + factor);
    }

    
}
