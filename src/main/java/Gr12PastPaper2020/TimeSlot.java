/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gr12PastPaper2020;

/**
 *
 * @author Kyrab
 */
public class TimeSlot {

    private static String counsellor;
    private static int startHour;
    private static boolean isAvailable;

    public TimeSlot(String inCS, int inSH) {
        counsellor = inCS;
        startHour = inSH;
    }

    public static void setIsAvailable(boolean isAvailable) {
        TimeSlot.isAvailable = isAvailable;
    }

    public static String getCounsellor() {
        return counsellor;
    }

    public static int getStartHour() {
        return startHour;
    }

    public static boolean isIsAvailable() {
        return isAvailable;
    }

    private static int getEndHour() {
        return startHour + 1;
    }

    @Override
    public String toString() {
        return counsellor + ":" + " " + startHour + ":00" + "-" + getEndHour() + ":";
    }

}
