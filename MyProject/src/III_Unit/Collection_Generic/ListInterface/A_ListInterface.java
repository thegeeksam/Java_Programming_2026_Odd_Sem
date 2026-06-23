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

import java.net.SocketImpl;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class A_ListInterface {
    public static void main(String[] args) {
        // Creating the list of Integer references
        List<Integer> list1 = new ArrayList<Integer>();
        int a = 10;
        list1.add(1);
        list1.add(2);
        list1.add(1,3);
        list1.add(a); // Autoboxing
        System.out.println("ArrayList: " + list1);

        // Creating the list of Integer reference using LinkedList
        List<Integer> list2 = new LinkedList<Integer>();
        list2.add(4);
        list2.add(5);
        list2.add(1,6);
        System.out.println("LinkedList: " + list2);
        
        // Creating the list of Integer reference using the vector class
        List<Integer> list3 = new Vector<Integer>();
        list3.add(7);
        list3.add(8);
        list3.add(1,9);
        System.out.println("Vector: " + list3);

        // Creating the list of Integer references using the stack
        List<Integer> list4 = new Stack<Integer>();
        list4.add(10);
        list4.add(11);
        // Stack will behave like a list since it 
        // implements the List interface
        // Stack is a subclass of Vector, which in turn implements List
        // Vector (and therefore Stack) supports indexed insertion via add(index, element

        list4.add(1,12);
        System.out.println("Stack: " + list4);

        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack (adds to the top)
        stack.push(10);
        stack.push(20);
        stack.push(30);
        // stack.push(1,40);
        stack.add(1,40);

        // Peek at the top element without removing
        System.out.println(stack);
        System.out.println("Top element: " + stack.peek()); // 30

        // Pop elements from the stack (removes from the top)
        // System.out.println("Popped: " + stack.pop()); // 30
        // System.out.println("Popped: " + stack.pop()); // 20
        // System.out.println("Popped: " + stack.pop()); // 10

    }
}
