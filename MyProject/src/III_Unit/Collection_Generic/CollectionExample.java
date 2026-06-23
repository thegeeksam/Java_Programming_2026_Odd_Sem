/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * This Java snippet illustrates:
 * * - Example of Collection interface and
 * * - Example of Iterator Interface in Java
 * *
 * @package III_Unit.Collection_Generic;
 * @author Dr. S. Sampath Kumar
 * @since 01-09-2025
 * @version 2.0
 */

package III_Unit.Collection_Generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionExample {
    public static void main(String[] args) {
        Collection values = new ArrayList();
        // adding collection of different (data) types
        values.add("Hello");
        values.add("II CSE B!");
        values.add(38);
        values.add(true);
        // print size of collection
        System.out.println("Size of Collection is: " + values.size());

        // print all elements in the collection
        System.out.println("Elements in Collection are: " + values);
        // Access the element via index will throw an error
        // because Collection does not support "indexing"
        // System.out.println(values[2]);

        // Create an iterator for the collection
        Iterator it = values.iterator();
        System.out.println(it.next()); // print 1st value
        System.out.println(it.next()); // print 2nd value
        System.out.println(it.next()); // print 3rd value
        System.out.println(it.next()); // print 4th value
        // System.out.println(it.next()); // error -> Guess why?

        // A Collection can only be iterated once
        // Create a new iterator to iterate again
        it = values.iterator();
        while(it.hasNext()) {
            System.out.println("Hi"+ it.next());
        }

        // Since there is no index based access, we cannot
        // insert an element in the middle of the collection
        // So we are moving to ArrayList or LinkedList
        // refer ListExample.java program
    }
}
