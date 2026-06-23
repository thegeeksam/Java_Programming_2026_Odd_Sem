/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * A static method belongs to the class, not to any specific object.
 * * It can be accessed directly using the class name, 
 * * and it can only interact with static members.
 * *
 * * This Java snippet illustrates:
 * * - The use of static methods
 * * - How static methods can be called without creating an instance
 * *
 * @package II_Unit.Static_Keyword;
 * @author Dr. S. Sampath Kumar
 * @since 11-08-2025
 * 
 * @version 1.0
 */
package II_Unit.Static_Keyword;

// Java code to demonstrate the use of static methods in a program
class StaticExample {
    int a = 10;
    static int square(int x) {
        // this will throw an error since 'a' is not static member
        // int a = 0;
        // a++;
        return x * x;
    }
    void printValue() {
        System.out.println("Value of instance variable a: " + a);
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        // Calling the static method square from StaticExample class
        // using the class name directly
        int result = StaticExample.square(5);
        System.out.println("Square of 5 is: " + result);

        // Cannot access non-static members directly in static context
        // This will throw an error
        // System.out.println("Value of a: " + StaticExample.a); 
        // StaticExample.printValue();

        // Creating an instance of StaticExample to call the non-static method
        StaticExample se = new StaticExample();
        se.printValue();
    }
}
