/**
 * * This file is part of the Java Programming Lecture project
 * *
 * * This Java snippet illustrates:
 * * - Create list Using the List interface (Programming to the interface)
 * *
 * * >> Benefits:
 * * - Flexibility: You can easily switch to another implementation like 
 * *   LinkedList or Vector without changing the rest of your code.
 * * - Polymorphism: You write code that works with any List implementation.
 * * - Encapsulation: You hide implementation details, exposing only the 
 * *   behavior defined by the List interface.
 * * - Maintainability: Easier to refactor and test, especially in large systems or APIs.
 * *
 * * >> Limitation:
 * * - You can only access methods defined in the List interface, not 
 * *   implementation-specific methods (e.g., ensureCapacity() from 
 * *   ArrayList).
 * *
 * @package III_Unit.Collection_Generic.ListInterface;
 * @author Dr. S. Sampath Kumar
 * @since 03-09-2025
 * @version 2.0
 */

package III_Unit.Collection_Generic.ListInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class A_ListInterface {
    public static void main(String[] args) {
        // Creating the list of Integer references using ArrayList
        // reference type is List, but the object is ArrayList
        List<Integer> objList = new ArrayList<>(); // Upcasting
        int a = 10;
        objList.add(1);
        objList.add(2);
        objList.add(1, 3);
        objList.add(a); // Autoboxing
        System.out.println("ArrayList: " + objList);

        // Creating the list of Integer reference using LinkedList class
        // reference type is List, but the object is LinkedList
        objList = new LinkedList<>(); // Upcasting
        objList.add(4);
        objList.add(5);
        objList.add(1, 6);
        System.out.println("LinkedList: " + objList);

        // Creating the list of Integer reference using the vector class
        // reference type is List, but the object is Vector
        objList = new Vector<>(); // Upcasting
        objList.add(7);
        objList.add(8);
        objList.add(1, 9);
        System.out.println("Vector: " + objList);

        // Creating the list of Integer references using the stack
        // reference type is List, but the object is Stack
        objList = new Stack<Integer>(); // Upcasting
        objList.add(10);
        objList.add(11);
        // Stack will behave like a list since it inherits from Vector,
        // which implements List. Stack is a subclass of Vector,
        // which in turn implements List Vector (and therefore Stack)
        // supports indexed insertion via add(index, element)
        System.out.println("Stack: " + objList);
        objList.add(1, 12);
        System.out.println("Updated Stack: " + objList);

        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack (adds to the top)
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack: " + stack);
        // stack.push(1,40);
        stack.add(1, 40);
        // Peek at the top element without removing
        System.out.println("Updated Stack: " + stack);
        System.out.println("Top element: " + stack.peek()); // 30

        // Pop elements from the stack (removes from the top)
        System.out.println("Popped: " + stack.pop()); // 30
        System.out.println("Popped: " + stack.pop()); // 20
        System.out.println("Popped: " + stack.pop()); // 40
        System.out.println("Popped: " + stack.pop()); // 10
        // System.out.println("Popped: " + stack.pop()); // ???
    }
}