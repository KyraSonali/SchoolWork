/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prac2014;

/**
 *
 * @author Kyrab
 */
public class Ticket {
    
    private String ticketID;
    private String name;
    private Flight departingFlight;
    private Flight returningFlight;

    public Ticket(String tID, String nme,Flight dflight, Flight rflight) {
        ticketID= tID;
        name = nme;
        departingFlight = dflight;
        returningFlight = rflight;
    }

    public String getName() {
        return name;
    }

    public Flight getDepartingFlight() {
        return departingFlight;
    }

    public Flight getReturningFlight() {
        return returningFlight;
    }
    
    public double getTotalCost(){
        double tCost = departingFlight.getCost()+ returningFlight.getCost();
        return tCost;
    }

    @Override
    public String toString() {
       String o= ticketID + "/t"+ name + "/t" + getTotalCost() + "/n"+ departingFlight+"/t"+ returningFlight+ "/n";
       return o;
    }
    
    
    
    
    
    
    
}
