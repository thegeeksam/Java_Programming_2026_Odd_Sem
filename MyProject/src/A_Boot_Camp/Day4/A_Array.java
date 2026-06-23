/**
 * * This file is part of the Boot Camp project.
 * * This class demonstrates the use of a single-dimensional array in Java
 * * This class defines a single-dimensional array of integers
 * * and prints its elements.
 * * It also shows how to declare, allocate, and initialize an array.
 * @author Dr. S. Sampath Kumar
 * @since 09-07-2025
 * @version 1.0
 */
package A_Boot_Camp.Day4;

public class A_Array {
    public static void main (String[] args) {
        // Declaration of Array
        // Syntax: dataType[] arrayName; or dataType arrayName[];
        // Preferred style is dataType[] arrayName;
        int[] numbers;        // Preferred style
        String fruits[];      // Also valid

        // Allocation
        numbers = new int[5];  // Creates array with 5 integers (default 0)

        // Initialization
        numbers[0] = 10;
        numbers[1] = 20;

        // Combined Declaration + Initialization
        int[] marks = {85, 90, 78, 92};

        // Accessing Elements
        System.out.println("Value at Index 3: " + marks[3]);  // Output: 92
        // Printing all elements of the array
        System.out.print("Marks: ");
        for(int i : marks) {
            System.out.print(i + " ");
        }
    }

}
