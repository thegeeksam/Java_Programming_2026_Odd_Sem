/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * This Java snippet illustrates:
 * * - defines a class JavaChar that prints a character
 * *   array and a string literal to the console. 
 * * - It demonstrates how System.out.println handles a char[]
 * *   by treating it as a sequence of characters, 
 * *   and how it prints a String object normally.
 * *
 * @package III_Unit.JavaString
 * @author Dr. S. Sampath Kumar
 * @since 27-08-2025
 * @version 1.0
 */

package III_Unit.JavaString;

public class JavaChar {
    public static void main(String args[]) {
        // Character
        char[] ch = { 'I', 'I', ' ', 'C', 'S', 'E', ' ', 'B' };
        System.out.println(ch);
        // String
        String s = "Hello! II CSE B";
        System.out.println(s);
    }
}
