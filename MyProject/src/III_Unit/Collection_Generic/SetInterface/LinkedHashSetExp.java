/**
 * * This file is part of the Java Programming Lecture project
 * *
 * * This Java snippet illustrates:
 * * - To illustrate the capabilities of LinkedHashSet<String>
 * * - Insertion of elements
 * * - Removal of elements
 * *
 * * >> LinkedHashSet:
 * * - Implements the Set interface: Stores unique elements only (no duplicates).
 * * - Maintains insertion order: Unlike HashSet, it remembers the order in which 
 *     elements were added.
 * * - Backed by a hash table + linked list: Combines fast access with 
 *     predictable iteration.
 * * - Allows one null value.
 * * - Non-synchronized: Not thread-safe unless externally synchronized.
 * * - It is slower than HashSet and TreeSet.
 * *
 * @package III_Unit.Collection_Generic.SetInterface;
 * @author Dr. S. Sampath Kumar
 * @since 08-09-2025
 * @version 2.0
 */
package III_Unit.Collection_Generic.SetInterface;

import java.util.*;

public class LinkedHashSetExp {
    public static void main(String args[]) {
        // creating a HashSet
        LinkedHashSet<String> str = new LinkedHashSet<String>();

        // displaying the initial size
        System.out.println("Size at the beginning " + str.size());

        // add elements
        str.add("Hello");
        str.add("II");
        str.add("CSE B");
        str.add("Students");
        str.add("Students");
        str.add(null);
        str.add(null);

        // displaying the LinkedHashSet
        System.out.println(str);

        // displaying the size
        System.out.println("Size after addition " + str.size());

        // remove element using value
        str.remove("Students");

        // display the new LinkedHashSet
        System.out.println(str);

        // display the new size
        System.out.println("Size after removal " + str.size());
        str.addFirst("hello");
        str.addLast(null);
        System.out.println(str.contains("Hello"));
        System.out.println(str);
    }
}
