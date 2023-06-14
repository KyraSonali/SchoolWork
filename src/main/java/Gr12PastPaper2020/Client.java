/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gr12PastPaper2020;

/**
 *
 * @author Kyrab
 */
public class Client {

    private String clientName;
    private String preferredCounsellor;
    private int earliestHour;
    

    public Client(String inCN, String inPCS, int inEH) {
        clientName = inCN;
        preferredCounsellor = inPCS;
        earliestHour = inEH;
        if (earliestHour > 16) {
            earliestHour = 16;
        }
    }

    public String getClientName() {
        return clientName;
    }

    public String getPreferredCounsellor() {
        return preferredCounsellor;
    }

    public int getEarliestHour() {
        return earliestHour;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setPreferredCounsellor(String preferredCounsellor) {
        this.preferredCounsellor = preferredCounsellor;
    }

    public void setEarliestHour(int earliestHour) {
        this.earliestHour = earliestHour;
    }

    @Override
    public String toString() {
        return getClientName() + "  " + getPreferredCounsellor() + "    " + getEarliestHour() + ":00";
    }

}
