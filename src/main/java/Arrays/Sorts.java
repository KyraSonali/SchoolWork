/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author Kyrab
 */
public class Sorts {

    public static void main(String[] args) {
        int[] array = {13, 47, 58, 8, 5, 6, 7};
        selectSort(array);
        bubbleSort(array);
        print(array);
    }

    public static void bubbleSort(int[] arr) {
        for (int sortedIndex = arr.length - 1; sortedIndex >= 0; sortedIndex--) {
            for (int currentIndex = 0; currentIndex < sortedIndex; currentIndex++) {
                if (arr[currentIndex] > arr[currentIndex + 1]) {
                    int temp = arr[currentIndex];
                    arr[currentIndex] = arr[currentIndex + 1];
                    arr[currentIndex + 1] = temp;

                }
            }
        }
    }

    public static void improvedBubbleSort(int[] arr) {
        for (int sortedIndex = arr.length - 1; sortedIndex >= 0; sortedIndex--) {
            boolean sorted = true;
            //checks if it is already sorted 
            for (int currentIndex = 0; currentIndex < sortedIndex; currentIndex++) {
                if (arr[currentIndex] > arr[currentIndex + 1]) {
                    int temp = arr[currentIndex];
                    arr[currentIndex] = arr[currentIndex + 1];
                    arr[currentIndex + 1] = temp;
                    sorted = false;
                }
            }
            if (sorted) {
                break;
            }
        }
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }

    public static void selectSort(int[] arr) {
        for (int sortedIndex = 0; sortedIndex < arr.length; sortedIndex++) {
            for (int currentIndex = sortedIndex + 1; currentIndex < arr.length; currentIndex++) {
                if (arr[currentIndex] < arr[sortedIndex]) {
                    int temp = arr[currentIndex];
                    arr[currentIndex] = arr[sortedIndex];
                    arr[sortedIndex] = temp;
                }
            }

        }

    }

    public static void improvedSelectSort(int[] arr) {
        for (int sortedIndex = 0; sortedIndex < arr.length; sortedIndex++) {
            //keeps track of smallest nbr
            int smallestIndex = sortedIndex;
            for (int currentIndex = sortedIndex + 1; currentIndex < arr.length; currentIndex++) {
                if (arr[currentIndex] < arr[smallestIndex]) {
                    smallestIndex = currentIndex;
                }
            }
//same number of checks less swaps
//therefore swap happens out of loop
            int temp = arr[smallestIndex];
            arr[smallestIndex] = arr[sortedIndex];
            arr[sortedIndex] = temp;
        }

    }
    
    
}
