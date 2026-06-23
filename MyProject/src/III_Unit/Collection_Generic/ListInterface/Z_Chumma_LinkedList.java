/**
 * * This file is part of the Java Programming Lecture project
 * *
 * * Created for experimenting. 
 * * Ignore this file.
 * *
 * * This Java snippet illustrates:
 * * - Add elements at various positions of a (Linked)List
 * * - Remove elements by value and index
 * * - Check the size of the list before and after operations
 * * - Display the contents of the list
 * *
 * @package III_Unit.Collection_Generic.ListInterface;
 * @author Dr. S. Sampath Kumar
 * @since 03-09-2025
 * @version 2.0
 */

package III_Unit.Collection_Generic.ListInterface;

import java.util.LinkedList;

public class Z_Chumma_LinkedList {
    public static void main(String args[]) {
        // creating a LinkedList 
        //Type-safe list of integers
        LinkedList<Integer> list = new LinkedList<Integer>();

        // displaying the initial size
        System.out.println("Size before addition " + list.size());
        // add elements
        list.add(12);
        list.add(13);
        list.add(1);
        System.out.println("Size after addition " + list.size());

        list.addFirst(45);
        list.addLast(36);

        list.add(2, 123);

        // displaying the LinkedList
        System.out.println(list);

        // displaying the size
        // System.out.println("Size after addition " + list.size());
        Integer a = 1;
        list.remove(a);
        list.remove(1);
        System.out.println(list);

        // display the new LinkedList
        System.out.println("New Linked List: " + list);

        // display the new size
        System.out.println("Size of New Linked List: " + list.size());
    }
}
