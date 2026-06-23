/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * This file demonstrates the use of jagged arrays in Java.
 * *
 * * A jagged array is an array of arrays where the inner arrays
 * * can have different lengths.
 * *
 * * In this example, we declare and initialize a jagged array and
 * * print its elements in a matrix format.
 * * 
 * @package I_Unit
 * @author Dr. S. Sampath Kumar
 * @since 10-06-2026
 * @version 2.0
 */

package Java_Array;

public class C_JaggedArray {
    public static void main(String[] args) {
        // declaring and initializing a jagged array
        int iArr[][] = new int[3][];

        // Initialize each row with different column sizes
        iArr[0] = new int[]{1, 2, 3};
        iArr[1] = new int[]{4, 5};
        iArr[2] = new int[]{6, 7, 8, 9};

        // printing the elements of the jagged array
        System.out.println("Elements of the Jagged Array are:");
        for (int i[] : iArr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}