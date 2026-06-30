/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * This Java snippet illustrates:
 * * - Declares a final reference variable.
 * * - Demonstrates that the reference cannot be changed, 
 * *   but the object's state can be modified.
 * *
 * @package II_Unit.Final_Keyword
 * @author Dr. S. Sampath Kumar
 * @since 30-06-2026
 * @version 1.1
 */

package II_Unit.Final_Keyword;

public class Z_Chumma1 {
    public static void main(String[] args) {
        // Final reference variable
        final StringBuffer strBuffer = new StringBuffer("Hello, II CSE A!");

        // Printing the element in strBuffer
        System.out.println(strBuffer);

        // changing internal state of object reference by
        // final reference variable strBuffer
        strBuffer.append(" Hello Hari!");

        // Printing the element in strBuffer
        System.out.println(strBuffer);
    }
}
