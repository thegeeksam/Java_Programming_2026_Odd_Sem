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

public class G_AnonymousArray {

    public static void main(String[] args) {
        // anonymous array
        sum(new int[]{1, 2, 3});
    }

    public static void sum(int[] a) {
        int total = 0;
        // using for-each loop
        for (int i : a) {
            total = total + i;
        }
        System.out.println("The sum is: " + total);
    }
}
