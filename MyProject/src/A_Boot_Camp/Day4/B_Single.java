/**
 * * This file is part of the Boot Camp project.
 * * This class demonstrates the use of a single-dimensional 
 * * array in Java
 * * This class defines a single-dimensional array of strings
 * * and prints its elements using a for-each loop.
 * * It also finds the length of the array.
 * 
 * @author Dr. S. Sampath Kumar
 * @since 09-07-2025
 * @version 1.0
 * */
package A_Boot_Camp.Day4;

public class B_Single {
  public static void main (String[] args) {
    // declaring and initializing an array
    String strArray[] = {"C", "C++","Java","Python", "C#"};
    
    // using a for-each loop for printing the array
    for(String i : strArray) {
      System.out.print(i + " ");
    }
    
    // find the length of an array
    System.out.println("\nLength of array: " + strArray.length);
    
  }
}