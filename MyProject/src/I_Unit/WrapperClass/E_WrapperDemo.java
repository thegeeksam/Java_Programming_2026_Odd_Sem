/**
 * * This file is part of the Java Programming Lecture project.
 * * This class demonstrates the use of wrapper classes in Java,
 * * including autoboxing and unboxing, and how to use them with
 * * collections.
 * *
 * @package I_Unit
 * @author Dr. S. Sampath Kumar
 * @since 03-08-2025
 * @version 1.0
 */

package I_Unit.WrapperClass;

import java.util.ArrayList;
public class E_WrapperDemo {
    public static void main(String[] args) {
        // Primitive to Wrapper (Autoboxing)
        int a = 25;
        Integer aObj = a; // Autoboxing

        // Wrapper to Primitive (Unboxing)
        Integer bObj = Integer.valueOf(50);
        int b = bObj; // Unboxing

        // Using Wrapper in Collections
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(85); // Autoboxing
        marks.add(90);
        marks.add(78);

        // Iterating and performing operations
        for (Integer mark : marks) {
            System.out.println("Mark: " + mark + " | Grade: " + (mark >= 90 ? "A" : "B"));
        }

        // Parsing from String
        String str = "123";
        int parsed = Integer.parseInt(str); // Converts String to int
        System.out.println("Parsed value: " + parsed);
    }
}