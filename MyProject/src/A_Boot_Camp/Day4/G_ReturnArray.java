/**
 * * This file is part of the Boot Camp project.
 * * This class demonstrates how to return an array from a function in Java.
 * * It defines a function that multiplies each element of the array by 2.
 * * The function takes an array as a parameter and returns the modified array.
 * @package A_Boot_Camp.Day4 
 * @author Dr. S. Sampath Kumar
 * @since 09-07-2025
 * @version 1.0
 * */
package A_Boot_Camp.Day4;

public class G_ReturnArray {
  // defined function to find max number from an array
  public static int[] doMultiplication(int[] arr) {
    for(int i = 0; i < arr.length; i++) {
      arr[i] = arr[i] * 2;
    }
    return arr;
  }
  public static void main (String[] args) {
    // declaring and initializing an array 
    int myArray[] = {1, 2, 3, 4, 5};

    // call function by passing array in it
    int[] multiplyArr = doMultiplication(myArray);
    
    // print array
    System.out.println("Array multiply by 2 is: " );
    for(int i : multiplyArr) {
      System.out.print(i + " ");
    }  
  }
}