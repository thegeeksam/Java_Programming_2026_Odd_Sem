/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * This file demonstrates the use of"arrays of objects" in Java.
 * * 
 * * An array of objects is an array that can hold references to objects
 * * of a class. It allows us to create multiple instances of a class
 * * and store them in a single array.
 * *
 * * In this example, we define a Student class with a constructor that
 * * takes an ID and a name as parameters. We then create an array of
 * * Student objects, initialize it with three Student instances, and
 * * print the details of each student using the constructor.
 * *
 * @package I_Unit
 * @author Dr. S. Sampath Kumar
 * @since 10-06-2026
 * @version 2.0
 */

package Java_Array;

class Student {
    Student(int id, String name) {
        System.out.println("Student ID is " + id + " and name is " + name);
    }
}

public class D_ArrayObject {
    public static void main(String[] args) {
        // declaring an array of Object
        Student obj[] = new Student[3];
        obj[0] = new Student(13, "ARUN R");
        obj[1] = new Student(25, "CHITRIKA E");
        obj[2] = new Student(30, "DEEPIKA K");
    }
}
