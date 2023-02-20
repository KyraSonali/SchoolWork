/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author Kyrab
 */

public class Cat extends Animal{
    
    private int chonkiness_level;
    
    
    public Cat(int w, int h, int nl,int ch) {
        super(w, h, 4); //has to be the first line in the constructor
    
        if(ch > 0 & ch <100){
            
            this.chonkiness_level = ch;
            
        }
        else if(ch > 100){
            this.chonkiness_level = 100;
        }
        else if(ch < 0){
            this.chonkiness_level = 0;
        }
        
    }

    
    public void eatCatnip(){
        this.weight += 1;
    }
    
    public int getChonkyRating(){
        return chonkiness_level;
    }

    public void setChonkiness_level(int chonkiness_level) {
        this.chonkiness_level = chonkiness_level;
    }
    
    @Override
    public String speak(){
        return "hungry meow";
    }
    
    public String speak(int num){
        
        String output = "";
        
        for(int i = 0; i < num;i++){
            output += speak() + "\n";
        }
        return output;
    }
    
    
    
    
    

}

    

