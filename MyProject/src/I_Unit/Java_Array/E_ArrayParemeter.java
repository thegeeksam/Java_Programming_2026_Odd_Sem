/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * This file demonstrates the use of arrays as parameters in Java.
 * * 
 * * In Java, we can pass arrays as parameters to methods.
 * * This allows us to perform operations on the array elements 
 * * within the method. 
 * *
 * * In this example, we define a method called "findMax" that takes 
 * * an array of integers as a parameter and returns the maximum 
 * * value in the array.
 * *
 * @package I_Unit
 * @author Dr. S. Sampath Kumar
 * @since 10-06-2026
 * @version 2.0
 */

package Java_Array;

public class E_ArrayParemeter {
    // defined function to find max number from an array
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    static int iA = 0;
    int iB = 0;

    public static void main(String[] args) {
        // declaring and initializing an array
        int myArray[] = { 45, 33, 98, 65, 76, 43, 99, 23, 68 };

        // call function by passing array in it
        // int maxNumber = findMax(myArray);
        // int iNumber = iA;
        // E_ArrayParemeter obj = new E_ArrayParemeter();
        // int iNumber2 = obj.iB;

        System.out.println("The max number of array is " + maxNumber);
    }
}