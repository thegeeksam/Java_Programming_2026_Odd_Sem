/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * It demonstrates the concept of StackOverflowError in Java.
 * * A StackOverflowError occurs when a program recurses too deeply
 * * and exhausts the stack space allocated for the thread.
 * * In this example, the `recursiveMethod` calls itself indefinitely,
 * * leading to a StackOverflowError.
 * *
 * @package I_Unit
 * @author Dr. S. Sampath Kumar
 * @since 23-07-2025
 * @version 1.0
 */

package JVM_Exceptions;

public class A_StackOverFlowExample {
// Java code snippet causing StackOverflowError

    public static void main(String[] args) {
        try {
            recursiveMethod(1);
        } catch (StackOverflowError e) {
            System.out.println("StackOverflowError caught: " + e.getMessage());
        }
    }

    // A recursive method that causes a StackOverflowError
    public static void recursiveMethod(int counter) {
        System.out.println("Counter: " + counter);
        recursiveMethod(counter + 1);
    }
}
