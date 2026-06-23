/**
 * * This file is part of the Java Programming Lecture project
 * *
 * * This Java snippet illustrates:
 * * - Create list Without using the List interface (Concrete Implementation)
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
import java.util.Stack;
import java.util.Vector;

public class B_WithoutListInterface {
    public static void main(String[] args) {
        // Creating the list of Integer references using ArrayList
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println("ArrayList: " + list1);
        // Creating the list of Integer reference using LinkedList class
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        System.out.println("LinkedList: " + list2);

        // Creating the list of Integer references using the stack
        Stack<Integer> stack = new Stack<Integer>();
        // Creates a Stack, but since Stack extends Vector, 
        // it inherits methods like add(index, element), 
        // which allows insertion at any position.

        stack.push(7);
        stack.push(8);
        stack.push(9);
        // stack.push(1,40);
        // stack.add(2,4);
        System.out.println("Stack: " + stack);
        // Creating the list of Integer reference using the vector class
        Vector<Integer> list4 = new Vector<Integer>();

        Deque<Integer> deque = new ArrayDeque<Integer>();
        deque.push(7);
        deque.push(8);
        deque.push(9);
        // deque.push(1,40);
        // deque.add(2, 4);
        System.out.println("Stack: " + stack);
    }
}