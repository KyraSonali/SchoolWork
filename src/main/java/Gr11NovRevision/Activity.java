/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gr11NovRevision;

import java.time.LocalDate;


/**
 *
 * @author Kyrab
 */
public class Activity {
    
    private String description;
    private double cost;
    private LocalDate actDate;
    
    public static double INSURANCE_COST =105.25;

    public Activity(String inString, double inDouble, LocalDate inDate) {
        description = inString;
        cost = inDouble;
        actDate = inDate;
        
    }

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }

    public LocalDate getActDate() {
        return actDate;
    }

    public double getINSURANCE_COST() {
        return INSURANCE_COST;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setActDate(LocalDate actDate) {
        this.actDate = actDate;
    }
    
    
    
    
    
    
}
