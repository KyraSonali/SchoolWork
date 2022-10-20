/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Kyrab
 */
public class StringToDate {

    public static void main(String[] args) {

        //y= years ( 4 types need to know yy/yyyy/)
        //M = month (M/MM/MMM/MMMM)
        //d = day (d/dd)
        String date = "2023-06-10";
        //create an  inout to formatter in order to convert frpom String to date obj and an output formatter to change the formate/laayout of the date
        DateTimeFormatter k = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate day = LocalDate.parse(date, k);
        System.out.println(day);

    }

}
