/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * This Java snippet illustrates:
 * * - the use of StringBuilder for mutable strings
 * * - size of StringBuilder
 * *
 * @package I_Unit
 * @author Dr. S. Sampath Kumar
 * @since 17-07-2026
 * @version 2.0
 */

package III_Unit.StrBufferBuilder;

public class B_StrBuilder {
    public static void main(String[] args) {
        // StringBuilder is mutable
        StringBuilder s = new StringBuilder();
        System.out.println(s.capacity()); // Capacity is 16 by default
        // Error: Can't convert StringBuilder to String
        // s = s + "Hello";
        System.out.println(s.length());

        // Append some content to StringBuilder
        System.out.println(s.append("Hello, II CSE C!"));
        System.out.println(s.length());
        System.out.println(s.capacity());

        // If the capacity of StringBuilder gets full after adding
        // an extra String, the new capacity of StringBuilder will be
        // (previousCapacity + 1) * 2
        System.out.println(s.append("!"));
        System.out.println(s.length());
        System.out.println(s.capacity());

    }
}