/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * This is a follow-up of CollectionExample.java
 * * Since there is no index based access, we cannot
 * * insert an element in the middle of the collection
 * * So we are moving to ArrayList or LinkedList
 * *
 * * This Java snippet illustrates:
 * * - Example of List interface in Java
 * * - Example of ArrayList class in Java
 * *
 * @package III_Unit.Collection_Generic;
 * @author Dr. S. Sampath Kumar
 * @since 01-09-2025
 * @version 2.0
 */

 package III_Unit.Collection_Generic;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ListExample {
    public static void main(String[] args) {
        // Create an ArrayList of String type
        List values = new ArrayList();
        // adding collection of different (data) types
        values.add("Hello");
        values.add("II CSE B!");
        values.add(38); // Integer Value = new Integer(38);
        values.add(2, true); // adding at index 2

        for(int i = 0; i<values.size(); i++) {
            System.out.println(values.get(i));
        }

        // iterating through the collection using "for each"
        for (Object obj : values) {
            System.out.println(obj);
        }

        // Since we List supports Object type, we can add
        // any type of object (Wrapper Classes) to the list
        // to include specific data type we are moving to Generics
        // Refer GenericsExample.java program
    }
}
