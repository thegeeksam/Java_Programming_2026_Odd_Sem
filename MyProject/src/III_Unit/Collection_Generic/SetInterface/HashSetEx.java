/**
 * * This file is part of the Java Programming Lecture project
 * *
 * * This Java snippet illustrates:
 * * - Hashing: Internally, HashSet uses a hash table to store elements. Each element’s hash code determines its storage location.
 * * - Uniqueness: A HashSet does not allow duplicate elements.
 * * - Unordered Storage: Elements are not stored in insertion order.
 * * - Non-synchronized: Not thread-safe by default.
 * * - Allows one null value.
 * * - It is faster than LinkedHashSet and TreeSet.
 * * 
 * * >> HashSet
 * * In hashing, the informational content of a key determines a unique value, called its hash code.
 * * The hash code is then used as an index, at which the data associated with the key is stored.
 * * When we insert elements into the HashSet, it is not guaranteed that it gets stored in the same order.
 * *
 * @package III_Unit.Collection_Generic.SetInterface;
 * @author Dr. S. Sampath Kumar
 * @since 08-09-2025
 * @version 2.0
 */

package III_Unit.Collection_Generic.SetInterface;

import java.util.*;
public class HashSetEx {
    public static void main(String args[]) {
        // creating a HashSet
        HashSet<String> str = new HashSet<String>();

        // displaying the initial size
        System.out.println("Size at the beginning: " + str.size());

        // add elements
        str.add("Hello");
        str.add("II");
        str.add("CSE B");
        str.add("Students");
        str.add("Students");
        str.add(null);
        str.add(null);
        // Experimental Code
        // for (Object o:str){
        //     // displaying the HashSet
        //     System.out.println(o);
        // }
        System.out.println(str);
        // displaying the size
        System.out.println("Size after adding new values: " + str.size());

        // remove element using value
        str.remove("Students");

        // display the new HashSet
        System.out.println("Updated HashSet: " + str);

        // display the new size
        System.out.println("Size after removal: " + str.size());

        // contains function checks whether an element is 
        // present in a set.
        System.out.println("HashSet contains \"CSE B\": " + str.contains("CSE B"));

        // clear function removes all the elements from a set.
        str.clear();
        System.out.println("set: " + str);

        // isEmpty function checks whether a set is empty or not.
        System.out.println(str.isEmpty());

    }
}