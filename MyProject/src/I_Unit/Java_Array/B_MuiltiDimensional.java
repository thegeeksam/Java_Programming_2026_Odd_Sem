/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * This file demonstrates the use of multi-dimensional arrays in Java.
 * *
 * * A multi-dimensional array is an array of arrays. It can be used to
 * * store data in a tabular form, such as a matrix or a table.
 * *
 * * In this example, we declare and initialize two 2D arrays (matrices)
 * * and print their elements in a matrix format.
 * * 
 * @package I_Unit
 * @author Dr. S. Sampath Kumar
 * @since 10-06-2026
 * @version 2.0
 */

package Java_Array;

public class B_MuiltiDimensional {
    public static void main(String[] args) {
        // declaring and initializing arrays
        int arr1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int arr2[][] = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };

        // Printing Array1 in matrix format
        System.out.println("Elements of Array 1 are:");
        for (int i = 0; i < 3; i++) { // for-loop for number of rows
            for (int j = 0; j < 3; j++) { // for-loop for number of columns
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        // Printing Array2 in matrix format
        System.out.println("Elements of Array 2 are:");
        for (int i[] : arr2) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
