/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author Kyrab
 */
public class Dog extends Animal {

    private int loyaltyRating;

    //should not assign - animal constructor does that
    public Dog(double weight, int height, int loyaltyRating) {
        //calls constructor of animal class and gives it to superclass constructoor
        super(weight, height,4);//sends stuff to animal class
        //changed to 4-know every dog species has 4 legs
        //ssuper has to be first line of constructor-cant call it later

        if (loyaltyRating < 0) {
            loyaltyRating = 0;
        } else if (loyaltyRating > 100) {
            loyaltyRating = 100;
        }

        this.loyaltyRating = loyaltyRating;

    }
    
    

    //private field cannot edit from this class when var is private
    public void eatBone() {
        this.weight += 1;
    }

    public int getLoyaltyRating() {
        return loyaltyRating;
    }

    public void setLoyaltyRating(int loyaltyRating) {
        this.loyaltyRating = loyaltyRating;
    }
    
    @Override
    public String speak(){
        return "Whoof";
        
    }
    
    public String speak (int num){
      String out ="";
      for(int i=0;i<num;i++){
          out+= speak() + "";
          
      }
      return out;
    }

}
