/**
 * * This file is part of the Java Programming Lecture project
 * *
 * * This Java snippet illustrates:
 * * - Implements the Set interface: stores unique elements only
 * * - Maintains insertion order: unlike HashSet, it remembers the order of insertion
 * * - Allows one null value
 * * - Is not thread-safe by default
 * * - Is slower than HashSet due to order tracking
 * * 
 * * >> LinkedHashMap:
 * * - Unlike HashMap, LinkedHashMap remembers the order in which entries were added
 * * - The LinkedHashMap class implements the Map interface.
 * * - It uses a hash table to store the map.
 * * - HashMap contains values based on the key.
 * * - It uses a hash table for storing key-value pairs.
 * * - To access a value in hash map, we must know its key.
 * * - It may have one null key and multiple null values.
 * * - Is not synchronized (not thread-safe by default)
 * * - It is the best approach for search operations.
 * * - Keys must be unique; values can be duplicated
 * @package II_Unit.Collection_Generic.MapInterface;
 * @author Dr. S. Sampath Kumar
 * @since 08-09-2025
 * @version 2.0
 */
package III_Unit.Collection_Generic.MapInterface;

import java.util.LinkedHashMap;
// import java.util.Map;

public class LinkedHashMapEx {
    public static void main(String[] args) {

        // Creating an empty LinkedHashMap
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        // Inserting entries in the Map
        // using put() method
        lhm.put("Uthayaa", 174);
        lhm.put("Rajkumar", 171);
        lhm.put("Vekkash", 175);
        lhm.put(null, null);// null key and null value
        lhm.put(null, 0);
        lhm.put("Rahman", null);
        lhm.put("Vekkash", 176);
        System.out.println(lhm);

        System.out.println(lhm.keySet());
        System.out.println(lhm.values());

        // Iterating over LinkedHashMap
        for (String Key : lhm.keySet()) {
            // Printing key-value pairs
            System.out.println(Key + " = " + lhm.get(Key));
        }
    }
}
