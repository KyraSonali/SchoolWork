/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prac2014;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kyrab
 */
public class FlightManager {

    private Ticket[] tickets = new Ticket[500];
    private int size;

    public FlightManager() {
        String fileP = "data//tickets.txt";
        try {
            Scanner filesc = new Scanner(new File(fileP));
            while (filesc.hasNext()) {
                //scanners
                String line = filesc.nextLine();
                Scanner linesc = new Scanner(line).useDelimiter("#");
                String line2 = filesc.nextLine();
                Scanner linesc2 = new Scanner(line2).useDelimiter("#");
                String line3 = filesc.nextLine();
                Scanner linesc3 = new Scanner(line3).useDelimiter("#");

                //lines (1)
                String ticketId = linesc.next();
                String name = linesc.next();

                //line2
                String depCode = linesc2.next();
                String depOrigin = linesc2.next();
                String depDest = linesc2.next();
                String deptime = linesc2.next();
                String depArrivalTime = linesc2.next();
                double depCost = linesc2.nextDouble();
                Flight departingF = new Flight(depCode, depOrigin, depDest, deptime, depArrivalTime, depCost);

                //line3
                String reCode = linesc3.next();
                String reOrigin = linesc3.next();
                String reDest = linesc3.next();
                String reTime = linesc3.next();
                String reArrivalTime = linesc3.next();
                double reCost = linesc3.nextDouble();
                Flight returningF = new Flight(reCode, reOrigin, reDest, reTime, reArrivalTime, reCost);

                //ticket
                Ticket t = new Ticket(ticketId, name, departingF, returningF);
                size++;
            }

        } catch (FileNotFoundException ex) {
            System.out.println("File cannot be found");
            Logger.getLogger(FlightManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public String toString() {
        String out = " ";
        for (int i = 0; i < size; i++) {
            out += tickets + "/n";
        }
        return out;
    }
    
    public void sort(){
        for(int i=0;i<size;i++){
            for(int j = i+1; j<size;j++){
                
            }
        }
    }

}
