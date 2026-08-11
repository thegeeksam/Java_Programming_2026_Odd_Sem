/**
 * * This file is part of the Java Programming Lecture project
 * *
 * * This Java snippet illustrates:
 * * - Create Using concrete implementations directly
 * *    (ArrayList, LinkedList, Vector and Stack)
 * *    instead of programming to the List interface.
 * *
 * * >> Benefits:
 * * - You can use class-specific methods that aren’t part of 
 * *   the List interface.
 * * - May be useful in performance-critical or low-level code
 * *   where the implementation matters.
 * *
 * * >> Drawbacks:
 * * - Tight coupling: Your code depends on a specific implementation.
 * * - Reduced flexibility: Switching to another list type requires 
 * *   changes throughout your codebase.
 * *
 * @package III_Unit.Collection_Generic.ListInterface;
 * @author Dr. S. Sampath Kumar
 * @since 03-09-2025
 * @version 2.0
 */

package III_Unit.Collection_Generic.ListInterface;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class B_WithoutListInterface {
    public static void main(String[] args) {
        // Creating the list of Integer references using ArrayList
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        System.out.println("ArrayList: " + arrayList);

        // Creating the list of Integer reference using LinkedList class
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        System.out.println("LinkedList: " + linkedList);

        // Creating the list of Integer references using the stack
        Stack<Integer> stack = new Stack<Integer>();
        // Creates a Stack, but since Stack extends Vector,
        // it inherits methods like add(index, element),
        // which allows insertion at any position.

        stack.push(7);
        stack.push(8);
        stack.push(9);

        // Warning: This method is inherited from Vector and
        // is not part of the Stack API.
        stack.push(1, 40);
        // Warning: This method is inherited from Vector and
        // is not part of the Stack API.
        stack.add(2, 4);
        // Don't use these methods if you want to maintain the
        // LIFO behavior of a stack.

        System.out.println("Stack: " + stack);
        // Creating the list of Integer reference using the vector class
        Vector<Integer> objVector = new Vector<Integer>();
        objVector.add(10);
        objVector.add(11);
        objVector.add(12);

        System.out.println("Vector : " + objVector);

        // Stack class is legacy. Modern Java recommends Deque (ArrayDeque) for stack
        // operations.
        // Creating the list of Integer reference using the Deque class
        // Deque is an interface, so we use its concrete implementation ArrayDeque

        Deque<Integer> deque = new ArrayDeque<Integer>();
        deque.push(7);
        deque.push(8);
        deque.push(9);
        // deque.push(1,40);
        // deque.add(2, 4);
        System.out.println("Deque: " + deque);
    }
}