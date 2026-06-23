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
 * * >> TreeHashMap:
 * * - Stores keys in sorted and ascending order.
 * * - Slow Compared to HashMap and LinkedHashMap 
 * * - It uses a hash table to store the map.
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

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {

        // Creating an empty TreeMap
        Map<String, Integer> tmap = new TreeMap<>();

        // Inserting entries in the Map
        // using put() method
        tmap.put("Uthayaa", 174);
        tmap.put("Rajkumar", 171);
        tmap.put("Vekkash", 176);
        System.out.println(tmap);

        tmap.put("Harish", 76);
        System.out.println(tmap);

        System.out.println(tmap.keySet());
        System.out.println(tmap.values());

        // Iterating over LinkedHashMap
        // This will generate exception
        for (String key : tmap.keySet()) {
        // Printing key-value pairs
        System.out.println(key + " = " + tmap.get(key));
        }


    }
}

// Ignore this section
/*
 * // Iterating over Map
 * for (Map.Entry<String, Integer> i : tmap.entrySet())
 * 
 * // Printing key-value pairs
 * System.out.println(i.getKey() + " "
 * + i.getValue());
 */