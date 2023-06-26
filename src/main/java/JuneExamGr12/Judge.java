/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JuneExamGr12;

/**
 *
 * @author Kyrab
 */
public class Judge {

    private String name;

    private int[] qualifiedClasses;
    private int experienceInYears;
    private Cat[] slots = new Cat[20];
    private int currentSlot=0;

    public Judge(String inN, int[] inQc, int inEIY) {
        name = inN;
        qualifiedClasses = inQc;
        experienceInYears = inEIY;

    }

    public boolean isQualified(int classCode) {
        boolean q;
        if(qualifiedClasses.equals(classCode)){
            q= true;
        }else{
            q=false;
        }
        return q;
    }
    
    public void addCat(Cat cat){
        slots[currentSlot]= cat;
        currentSlot++;
    }
    
    public boolean isFull(){
    }
}
