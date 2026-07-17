/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * This Java snippet illustrates:
 * * - String immutability in Java.
 * * - It demonstrates that once a string object is created, 
 * *   its value cannot be changed.
 * * - It also shows how string concatenation creates a
 * *   new string object
 * 
 * *
 * @package III_Unit.JavaString
 * @author Dr. S. Sampath Kumar
 * @since 16-07-2026
 * @version 1.0
 */

package III_Unit.JavaString;

public class D_StringImmutable {
    public static void main(String args[]) {
        // Unmodified string objStr
        String objStr = "Hello";
        System.out.println(objStr); // Output: Hello
        // Modified string objStr
        System.out.println(System.identityHashCode(objStr));
        objStr = objStr + " World!";
        System.out.println(System.identityHashCode(objStr));

        // Original string str is not modified
        String str1 = "Hello";
        // System.out.println(str1.hashCode());
        String str2 = new String("Hello");
        String str3 = "Hello";

        // System.out.println(str2.hashCode());

        // str2 = str2 + " World";
        // System.out.println(str2.hashCode());
        System.out.println(str1 + " " + str2);
        // In the case of objects, '==' compares the memory locations.
        // Here is the proof
        if (str1 == str2) {
            System.out.println("str1 and str2 are equal.");
        } else {
            System.out.println("str1 and str2 are not equal.");
        }

        if (str1.equals(str2)) {
            System.out.println("str1 and str2 are equal.");
        } else {
            System.out.println("str1 and str2 are not equal.");
        }

        if (str1 == str3) {
            System.out.println("str1 and str3 are equal.");
        } else {
            System.out.println("str1 and str3 are not equal.");
        }

        if (str1.equals(str3)) {
            System.out.println("str1 and str3 are equal.");
        } else {
            System.out.println("str1 and str3 are not equal.");
        }

    }
}
