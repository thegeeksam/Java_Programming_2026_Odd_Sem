/**
 * * This file is part of the Java Programming Lecture project
 * *
 * * This Java snippet illustrates:
 * * - Create and initialize ArrayList<String> using different methods
 * * - Populate lists with string elements
 * * - Display the contents of each list
 * *
 * @package III_Unit.Collection_Generic.ListInterface;
 * @author Dr. S. Sampath Kumar
 * @since 03-09-2025
 * @version 2.0
 */
package III_Unit.Collection_Generic.ListInterface;

import java.util.*;

public class C_ArrayListEx {
    public static void main(String args[]) {
        // Creating the list of String references using ArrayList
        ArrayList<String> str = new ArrayList<String>();

        // 1. Initialize an ArrayList with add()
        str.add("II");
        str.add("CSE");
        str.add("B");

        // print the ArrayList
        System.out.println("ArrayList is: " + str);

        // 2. Initialize ArrayList using "asList" method
        ArrayList<String> str1 = new ArrayList<String>(
                Arrays.asList("I",
                        "❤",
                        "Java"));

        // print the ArrayList
        System.out.println("ArrayList is: " + str1);

        // 3. Initialize ArrayList using List.of() method
        ArrayList<String> str2 = new ArrayList<>(
                List.of("Coding",
                        "is",
                        "Fun"));

        // print the ArrayList
        System.out.println("ArrayList is: " + str2);
    }
}