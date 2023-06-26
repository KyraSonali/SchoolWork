/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prac2014;

/**
 *
 * @author Kyrab
 */
public class Flight {
   private String code;
   private String origin;
   private String destination;
   private String departureTime;
   private String arrivalTime;
   private double cost;

    public Flight(String cde,String orig,String dest,String dtime, String atime, double cst) {
        code = cde;
        origin = orig;
        destination = dest;
        departureTime =dtime;
        arrivalTime = atime;
        cost=cst;
        
    }

    public String getCode() {
        return code;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        String out= code + "    "+ origin + " "+ departureTime + "     "+ destination + " " + arrivalTime;
        return out;
    }
   
    
    
   
    
    
}
