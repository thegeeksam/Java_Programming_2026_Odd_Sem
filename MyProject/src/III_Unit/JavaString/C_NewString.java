/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * This Java snippet illustrates:
 * * - Creating strings using the 'new' keyword.
 * * - How strings created with 'new' are stored in the heap memory.
 * * - It demonstrates that even if two strings have the same content,
 * *   they are different objects in memory when created with 'new'.
 * * - It also shows how to compare string references and values.
 * *
 * @package III_Unit.JavaString
 * @author Dr. S. Sampath Kumar
 * @since 16-07-2026
 * @version 1.0
 */

package III_Unit.JavaString;

public class C_NewString {
    public static void main(String args[]) {
        // String using new keyword
        String objStr3 = new String("Hello, II CSE A");
        String objStr4 = new String("Hello, II CSE A");

        // objStr3 and objStr4 are two different objects
        // in the heap memory, even though they have the same value.

        System.out.println("Reference comparison (==): " + (objStr3 == objStr4)); // false
        System.out.println("Value comparison (.equals()): " + objStr3.equals(objStr4)); // true

        System.out.println("Hash code of objStr3: " + System.identityHashCode(objStr3));
        System.out.println("Hash code of objStr4: " + System.identityHashCode(objStr4));

        System.out.println("objStr3 == objStr4: " + (objStr3 == objStr4)); // false. why?
    }
}

// objStr3 and objStr4 in heap