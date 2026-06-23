/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * This Java snippet illustrates:
 * * -Generic method declaration and usage
 * * -Type inference at runtime
 * * -Avoidance of method overloading
 * * -Use of reflection(getClass().getName())to inspect object type
 *
 * @package III_Unit.Collection_Generic;
 * @author Dr. S. Sampath Kumar
 * @since 01-09-2025
 * @version 2.0
 */

package III_Unit.Collection_Generic;

public class GenericChumma {
    // Generic method
    // Declares a generic type parameter T. 
    // This allows the method to accept any data type
    // (Integer, String, Double, etc.).
    static <T> void genericDisplay(T element) {
        // Retrieve and print the runtime class name of the argument
        System.out.println(element.getClass().getName()
                + " = " + element);
    }

    // Driver method
    public static void main(String[] args) {
        // Calling generic method with Integer argument
        genericDisplay(64);

        // Calling generic method with String argument
        genericDisplay("Hello CSE!");

        // Calling generic method with double argument
        genericDisplay(2.45);
    }
}