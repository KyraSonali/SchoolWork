/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gr11NovRevision;

/**
 *
 * @author Kyrab
 */
public class Learner {

    private String learnerName;
    private String learnerCode;
    private Activity activityOne;
    private Activity ActivityTwo;

    public Learner(String inName,Activity inActOne, Activity inActTwo){
        learnerName = inName;
        activityOne= inActOne;
        ActivityTwo = inActTwo;
        int ranVal = (int)((Math.random()*99-10)+10);
        learnerCode = learnerName.substring(0,3).toUpperCase()+ ranVal;
    }
    
    

    }

}
