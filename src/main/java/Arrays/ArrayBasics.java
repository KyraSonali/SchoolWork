/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author Kyrab
 */
public class ArrayBasics {

    public static void main(String[] args) {
        int[] intArray = {2, 4, 6, 8};
        int sum = 0;
        int avg;
        for (int i = 0; i < intArray.length; i++) {

            sum = sum + i;

        }
        avg = sum / intArray.length;
        System.out.println("Avg:" + avg);

    }

}
