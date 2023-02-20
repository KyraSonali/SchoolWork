/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance2;

import Inheritance.*;
import java.util.ArrayList;

/**
 *
 * @author Kyrab
 */
public class AnimalUi {

    public static void main(String[] args) {
        Dog d = new Dog(5, 3,29);
        System.out.println(d.weight);
        d.eatBone();
        System.out.println(d.weight);
        System.out.println(d.speak());
        
        ArrayList<Animal> pets = new ArrayList<Animal>();
        pets.add(new Dog(20,3,4));
        pets.add(new Cat(10,3,2,99));
        pets.add(new Dog(2,4,6));
        pets.add(new Cat(3,4,5,69));
        
        for(int i =0;i<pets.size();i++){
            if(pets[i].)
        }

    }
    

}
