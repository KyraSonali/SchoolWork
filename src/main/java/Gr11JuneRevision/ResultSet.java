/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gr11JuneRevision;

import java.util.Scanner;

/**
 *
 * @author Kyrab
 */
public class ResultSet {

    private String name;
    private String email;
    private int scoreAlg;
    private int scoreGeo;
    private int scoreTrig;
    
    
    private String surname="";
    private String initials="";
    private double finalRating;

    ResultSet(String n, String e, int sA, int sG, int sT) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void constructor(String n, String e, int sA, int sG, int sT) {
        name = n;
        email = e;
        sA = scoreAlg;
        sG = scoreGeo;
        sT = scoreTrig;
    }

    public String getName() {
        return name;
    }

    public void setName(String inName) {
        name = inName;

    }

    @Override
    public String toString() {
        return "ResultSet{" + "<" + name + ">" + "<" + email + ">" + "<" + scoreAlg + ">" + "<" + scoreGeo + ">" + "<" + scoreTrig + ">" + '}';
    }

    public double getRating() {
        double geomWeight = scoreGeo * 0.45;
        double trigWeight = scoreTrig * 0.2;
        double algWeight = scoreAlg * 0.35;

        finalRating = geomWeight + trigWeight + algWeight;
        return finalRating;

    }

    public String reformatName() {

    Scanner sc = new Scanner(name);
   

    while(sc.hasNext()){
        String currentName = sc.next();
        if(sc.hasNext()){
            initials +=  currentName.charAt(0);
        }else{
            surname = currentName.toUpperCase();
            
        }
        
        
    }
    return surname + ","+ initials;

    }

    public String nameAndRating() {
        return (surname+ ","+initials+ " "+finalRating );

    }

}
