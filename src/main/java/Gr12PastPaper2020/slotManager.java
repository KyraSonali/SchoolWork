/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gr12PastPaper2020;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kyrab
 */
public class slotManager {

    private Client[] cArr = new Client[20];
    private TimeSlot[] tArr = new TimeSlot[40];

    public slotManager() {
        String filePath = "data//clients.txt";
        try {
            Scanner filesc = new Scanner(new File(filePath));
            for (int i = 0; i < cArr.length; i++) {
                String clientName = filesc.nextLine();
                String preferredCounse = filesc.nextLine();
                int preferredTime = Integer.parseInt(filesc.nextLine());

                Client c = new Client(clientName, preferredCounse, preferredTime);
                cArr[i] = c;
            }

            filesc.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(slotManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//end of slot manager

    public String displayAllCLients() {
        String out = "";
        for (int i = 0; i < cArr.length; i++) {
            out += cArr[i] + "\n";
        }
        return out;
    }

    public void generateTimeSlots() {
        String filepath = "data//counsellors.txt";
        try {
            int counter =0;
            Scanner filesc = new Scanner(new File(filepath)).useDelimiter(",");
            String counsellor = filesc.next();
            for (int c = 0; c < tArr.length; c++) {
                for(int hours = 8;hours<=16;hours++){
                    if(hours!=12){
                        TimeSlot m = new TimeSlot(counsellor,hours);
                        tArr[counter] = m;
                        counter++;
                    }
                }

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(slotManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public String displayAvailableTimeSlots(){
        
    }

}
