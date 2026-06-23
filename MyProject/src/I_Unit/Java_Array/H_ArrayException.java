/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * This file demonstrates the use of anonymous arrays in Java.
 * *
 * * An anonymous array is an array that is created without being
 * * assigned to a variable.
 * *
 * * In this example, we create an anonymous array of integers and
 * * pass it to the sum method, which calculates and prints the
 * * sum of the elements.
 * *
 * *
 * @package I_Unit
 * @author Dr. S. Sampath Kumar
 * @since 10-06-2026
 * @version 2.0
 */
package Java_Array;

public class H_ArrayException {

    public static void main(String[] args) {
        // declaring and initializing an array
        int myArray[] = new int[5];

        myArray[0] = 3;
        myArray[2] = 6;
        myArray[4] = 9;
        myArray[6] = 12; // index 6 not exists

        for (int i : myArray) {
            System.out.println(i);
        }
    }
}
