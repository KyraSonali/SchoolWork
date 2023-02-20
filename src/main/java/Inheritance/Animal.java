/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author Kyrab
 */


public class Animal {
    //puboic - any class can change thru dot notation
    //protected = this class and subclasses and change thourgh dot notation
    //private = only this class can change thru dot nootation
   //private-> protected= allows to access private methods
    public double weight;
    protected int height;
    protected int numLegs;
//responsible for assiging fields general to animals
    public Animal(double weight, int height, int numLegs) {
        this.weight = weight;
        this.height = height;
        this.numLegs = numLegs;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getNumLegs() {
        return numLegs;
    }

    public void setNumLegs(int numLegs) {
        this.numLegs = numLegs;
    }

        public String speak(){
            return "Animal noise";
        }
    
    
    
}
