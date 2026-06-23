/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * This program demonstrates the concept of Garbage Collection in Java.
 * * The `finalize` method is overridden to provide a custom action 
 * * when the object is garbage collected.
 * *
 * *
 * @package I_Unit
 * @author Dr. S. Sampath Kumar
 * @since 17-06-2026
 * @version 1.0
 */
package JVM_Exceptions;

public class C_GarbageCollector {
    @Override
    protected void finalize() {
        System.out.println("Garbage collected!");
    }

    public static void main(String[] args) {
        C_GarbageCollector obj = new C_GarbageCollector();
        obj = null; // Make object eligible for GC
        // GC request here is a suggestion, not a command
        System.gc(); // Request GC
        System.out.println("End of main method");
    }

}