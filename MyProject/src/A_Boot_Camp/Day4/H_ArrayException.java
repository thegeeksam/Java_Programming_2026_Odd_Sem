/**
 * * This file is part of the Boot Camp project.
 * * This class demonstrates an array exception in Java.
 * * It shows how to declare and initialize an array,
 * * and how to handle an exception when trying to access 
 * * an index that does not exist.
 * * This code will throw an ArrayIndexOutOfBoundsException
 * * when trying to access an index that is out of bounds.
 * * The exception occurs because the array is declared with a size of 5,
 * * but the code attempts to access index 6, which does not exist.
 * * This is a common error when working with arrays in Java.
 * @package A_Boot_Camp.Day4
 * @author Dr. S. Sampath Kumar
 * @since 09-07-2025
 * @version 1.0
 */

package A_Boot_Camp.Day4;

public class H_ArrayException {
  public static void main (String[] args) {
    // declaring and initializing an array 
    int myArray[] = new int[5];
    
    myArray[0] = 3;
    myArray[2] = 6;
    myArray[4] = 9;
    myArray[6] = 12; // index 6 not exists
    
    for(int i : myArray) {
      System.out.println(i);
    }
  }
}