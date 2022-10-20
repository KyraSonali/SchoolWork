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
public class Dtf {

    public static void main(String[] args) {

        //chganging format to day/month/year
//        LocalDate today = LocalDate.now();
//        DateTimeFormatter k =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        String newFormat = today.format(k);
//        System.out.println(newFormat);


        //changing format to day-month-year
        LocalDate today = LocalDate.now();
        DateTimeFormatter k = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String newFormat = today.format(k);
        System.out.println(newFormat);

    }

}
