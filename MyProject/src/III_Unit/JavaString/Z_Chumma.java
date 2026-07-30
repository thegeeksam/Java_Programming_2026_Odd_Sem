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

class StaticString {
    static String objStr = "Hello";

    static void getString() {
        objStr = objStr.concat(" World!");
        System.out.println(objStr);
    }

}

public class Z_Chumma {
    public static void main(String[] args) {
        StaticString str = new StaticString(); // Prints the static string
        System.out.println(str.objStr);
        System.out.println(System.identityHashCode(str.objStr));
        str.getString();
        // Accessing static variable directly
        System.out.println(System.identityHashCode(str.objStr));

    }

}
