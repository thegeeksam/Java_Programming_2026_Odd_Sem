/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * It demonstrates the concept of OutOfMemoryError in Java.
 * * An OutOfMemoryError occurs when the Java Virtual Machine (JVM)
 * * cannot allocate an object because it is out of memory.
 * * In this example, the program continuously adds objects to a list
 * * until the heap memory is exhausted, leading to an OutOfMemoryError.
 * *
 * @package I_Unit
 * @author Dr. S. Sampath Kumar
 * @since 23-07-2025
 * @version 1.0
 */

package JVM_Exceptions;

import java.util.ArrayList;
import java.util.List;

public class B_OutOfMemoryExample {
    static int iA;
    public static void main(String[] args) {
        try {
            List<Object> objectList = new ArrayList<>();

            while (true) {
                System.out.println("Adding object to list..." + iA++ + " times");
                // Continuously add objects to the list to exhaust memory
                objectList.add(new Object());
            }
        } catch (OutOfMemoryError e) {
            System.out.println("OutOfMemoryError caught: " + e.getMessage());
        }
    }
}
