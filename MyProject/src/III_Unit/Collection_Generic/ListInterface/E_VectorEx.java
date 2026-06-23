/**
 * * This file is part of the Java Programming Lecture project
 * *
 * * Vector is a legacy class from Java 1.0.
 * * Vectors in Java are used for creating dynamic array.
 * * It’s a synchronized, dynamic array that grows as needed.
 * * Supports random access and insertion at any index.
 * * Thread-safe, but slower due to synchronization overhead.
 * *
 * * Synchronized: at a time, only one thread is able to access the code
 * * while other threads have to wait.
 * *
 * * This Java snippet illustrates:
 * * - How to create and manipulate a Vector<Integer>
 * * - How to check its size before and after modifications
 * * - How to initialize a vector using Arrays.asList()
 * * - The impact of removing an element by index
 * *
 * @package III_Unit.Collection_Generic.ListInterface;
 * @author Dr. S. Sampath Kumar
 * @since 03-09-2025
 * @version 2.0
 */

 package III_Unit.Collection_Generic.ListInterface;

import java.util.*;


public class E_VectorEx {
    public static void main(String args[]) {
        // creating a Vector
        Vector<Integer> v = new Vector<Integer>();

        // displaying the size
        System.out.println("Size at the beginning " + v.size());

        // add elements
        v.add(19);
        v.add(88);
        v.add(1);
        v.add(39);

        // displaying the Vector
        System.out.println(v);

        // displaying the size
        System.out.println("Size after addition " + v.size());

        // remove element at index 3
        // Integer  a = v.get(3);
        v.remove(3);

        // display the new Vector
        System.out.println(v);

        // display the new size
        System.out.println("Size after removal " + v.size());
        Vector<Integer> v1 = new Vector<Integer>(
                Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(v1);
    }
}