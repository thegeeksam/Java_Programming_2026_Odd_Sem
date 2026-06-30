/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * This Java snippet illustrates:
 * * - Declares a final variable without initialization (blank final variable).
 * * - Assigns a value to the blank final variable in the main method.
 * * - Attempts to reassign the blank final variable,
 * *   which will result in a compilation error.
 * *
 * @package II_Unit.Final_Keyword
 * @author Dr. S. Sampath Kumar
 * @since 30-06-2026
 * @version 1.1
 */

package II_Unit.Final_Keyword;

public class B_FinalVar {
    public static void main(String[] args) {
        // Declare a final variable
        final int myNumber = 10;

        // Attempting to reassign the final variable
        // Uncommenting this line will cause an error
        myNumber = 20;

        // Using the final variable in some calculations
        int result = myNumber * 5;
        System.out.println("Result: " + result);
    }
}
