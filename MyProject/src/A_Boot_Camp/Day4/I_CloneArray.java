/**
 * * This file is part of the Boot Camp project.
 * * This class demonstrates the use of the clone method 
 * * to create a copy of an array in Java.
 * * It shows how to clone a two-dimensional array and
 * * how to check if the original and cloned arrays are the same.
 * * The code also checks if the elements of the two arrays are the same.
 * 
 * * For primitive arrays like int[], it’s a deep copy — values are duplicated
 * * For object arrays like String[], it’s a shallow copy — references are duplicated

 * @package A_Boot_Camp.Day4
 * @author Dr. S. Sampath Kumar
 * @since 09-07-2025
 * @version 1.0
 */
package A_Boot_Camp.Day4;

public class I_CloneArray {
  public static void main (String[] args) {
    // declaring and initializing an array 
    int myArray[] = {1,2,3};
    
    // clone myArray by using clone property
    int cloneArray[] = myArray.clone();
    
    // checking whether both arrays are the same or not
    System.out.println(myArray == cloneArray);
    
    // checking whether both arrays have the same elements
    System.out.println(myArray[1] == cloneArray[1]);

    cloneArray[1] = 5; // changing the value of cloned array
    // checking whether both arrays have the same elements after changing cloned array
    System.out.println(myArray[1] == cloneArray[1]);
  }
}


