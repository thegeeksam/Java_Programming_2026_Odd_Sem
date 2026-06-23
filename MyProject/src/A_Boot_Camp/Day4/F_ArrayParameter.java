/**
 * * This file is part of the Boot Camp project.
 * * This class demonstrates the use of an array as a parameter in Java.
 * * It defines a function to find the maximum number in an array.
 * * The function takes an array as a parameter and returns the
 * * maximum value.
 * * The main method initializes an array and calls the function 
 * * to find the maximum number.
 * @package A_Boot_Camp.Day4 
 * @author Dr. S. Sampath Kumar
 * @since 09-07-2025
 * @version 1.0
 * */
package A_Boot_Camp.Day4;

public class F_ArrayParameter {
  // defined function to find max number from an array
  public static int findMax(int[] arr) {
    int max = arr[0];
    for(int i = 1; i < arr.length; i++) {
      if(max < arr[i]) {
        max = arr[i];
      }
    }
    return max;
  }
  public static void main (String[] args) {
    // declaring and initializing an array 
    int myArray[] = {45,33,98,65,76,43,99,23,68};

    // Call function by passing array in it and print the max number
    System.out.println("The max number of array is " + findMax(myArray));
    
  }
}