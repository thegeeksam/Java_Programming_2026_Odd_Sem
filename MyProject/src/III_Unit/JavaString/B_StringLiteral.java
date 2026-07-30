/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * This Java snippet illustrates:
 * * - String literal usage in Java.
 * * - How string literals are stored in the string pool.
 * * - It demonstrates that when two string literals have the same content,
 * *   they refer to the same object in memory.
 * * - It also shows how to compare string references and values.
 * *
 * @package III_Unit.JavaString
 * @author Dr. S. Sampath Kumar
 * @since 16-07-2026
 * @version 1.0
 */

package III_Unit.JavaString;

public class B_StringLiteral {
    public static void main(String args[]) {
        // String Literal
        String objStr1 = "Hello, II ECE C";
        // New String is not created.
        // objStr2 is pointing to the old string value only.
        String objStr2 = "Hello, II ECE C";
        System.out.println("objStr1: " + objStr1);
        System.out.println("objStr2: " + objStr2);

        // identityHashCode() returns the same hash code for the same object, even if
        // the object's hashCode() method is overridden. It is useful for comparing
        // object references.
        System.out.println("Hash code of objStr1: " +
                System.identityHashCode(objStr1));
        System.out.println("Hash code of objStr2: " +
                System.identityHashCode(objStr2));
        // objStr1 = "Hello";
        // objStr2 = "Hi";
        // System.out.println("objStr1: " + objStr1);
        // System.out.println("objStr2: " + objStr2);
        // System.out.println("Hash code of objStr1: " +
        // System.identityHashCode(objStr1));
        // System.out.println("Hash code of objStr2: " +
        // System.identityHashCode(objStr2));
        // String objStr3 = "Hello, II ECE C";
        // System.out.println("objStr3: " + objStr3);
        // System.out.println("Hash code of objStr3: " +
        // System.identityHashCode(objStr3));
        // reference comparison,
        // both are pointing to the same object in the string pool
        System.out.println("Reference comparison (==): " + (objStr1 == objStr2)); //
        // true

        // // value comparison, both have the same value
        System.out.println("Value comparison (.equals()): " +
                objStr1.equals(objStr2)); // true
    }
}
