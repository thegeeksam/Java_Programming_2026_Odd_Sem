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

public class A_BlankFinalVar {

    public static void main(String[] args) {

        // declaring a final variable
        final int fCount;

        // assigning value
        fCount = 10;
        fCount = 11;

        System.out.println("Count value is " + fCount);
    }
}
