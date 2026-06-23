/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * This file demonstrates the use of the clone method to create a copy
 * * of an array in Java.
 * *
 * * In Java, the clone method is used to create a copy of an object. 
 * * When applied to an array, it creates a shallow copy of the array.
 * * This means that the new array will have the same elements as
 * * the original array, but the elements themselves are not cloned.
 * *
 * * In this example, we declare and initialize a two-dimensional array,
 * * clone it using the clone method, and then check if the original and
 * * cloned arrays are the same and if their elements are the same.
 * *
 * @package I_Unit
 * @author Dr. S. Sampath Kumar
 * @since 10-06-2026
 * @version 2.0
 */
package Java_Array;

public class I_CloneArray {
    public static void main(String[] args) {
        // declaring and initializing an array
        int myArray[][] = { { 1, 2, 3 }, { 4, 5, 6 } };

        // clone myArray by using clone property
        int cloneArray[][] = myArray.clone();

        System.out.println("myArray.hashCode(): " + myArray.hashCode());
        System.out.println("cloneArray.hashCode(): " + cloneArray.hashCode());

        System.out.println("Array object: " + myArray);
        System.out.println("Clone array object: " + cloneArray);

        // checking whether both arrays are the same or not
        System.out.println(myArray == cloneArray);
        // System.out.println(myArray.equals(cloneArray));

        // Above statement is false because clone method creates a new array "object"
        // and assigns the same elements to it. So, myArray and cloneArray are two
        // different objects in memory, hence the comparison using '==' returns false.

        // checking whether both arrays have the same elements
        System.out.println(myArray[1] == cloneArray[1]);
    }
}
