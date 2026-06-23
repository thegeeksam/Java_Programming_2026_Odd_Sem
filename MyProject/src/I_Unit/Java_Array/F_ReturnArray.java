/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * This file demonstrates how to return an array from a method in Java.
 * *
 * * In Java, a method can return an array just like it can return
 * * any other type of data. 
 * *
 * * In this example, we define a method called doMultiplication that
 * * takes an array of integers as a parameter, multiplies each element
 * * by 2, and returns the modified array. In the main method, 
 * * we call this method and print the resulting array.
 * *
 * *
 * @package I_Unit
 * @author Dr. S. Sampath Kumar
 * @since 10-06-2026
 * @version 2.0
 */

package Java_Array;

public class F_ReturnArray {
    // defined function to find max number from an array
    public static int[] doMultiplication(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }
        return arr;
    }

    public static void main(String[] args) {
        // declaring and initializing an array
        int myArray[] = { 1, 2, 3, 4, 5 };
        // System.out.println(myArray.length);
        // call function by passing array in it
        int[] multiplyArr = doMultiplication(myArray);

        // print array
        System.out.println("Array multiply by 2 is:");
        for (int i : multiplyArr) {
            System.out.print(i + " ");
        }

    }
}
