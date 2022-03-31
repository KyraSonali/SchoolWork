/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanners;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Kyrab
 */
public class UserDetails {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("enter name , surname and age");
        Scanner sc = new Scanner(input);
        
        while(sc.hasNext()){
            String name = sc.next();
            String surname = sc.next();
            String age = sc.next();
           System.out.println("Name:"+ name +"\n"+ "surname:"+surname+  "\n"+ "age:"+ age );
        }
    }

}
