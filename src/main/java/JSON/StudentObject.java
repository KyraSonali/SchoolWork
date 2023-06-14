/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JSON;

/**
 *
 * @author Kyrab
 */
public class StudentObject {

    private String name;
    private String strength;
    private int age;
    
    
    public StudentObject(String inName, String inStrength, int inAge) {
        name= inName;
        strength= inStrength;
        age = inAge;
        
    }

    @Override
    public String toString() {
        return "StudentObject{" + '}';
    }
    
    
    
}
