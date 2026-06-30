/**
 * * This file is part of the Java Programming Lecture project.
 * * 
 * * -----> Constructor Chaining <-----
 * *
 * * This snippet shows how the this keyword can be used to:
 * * - Call another constructor within the same class.
 * * - Avoid code duplication by centralizing initialization logic.
 * *
 * @package II_Unit.This_Super
 * @author Dr. S. Sampath Kumar
 * @since 03-08-2025
 * @updated 28.06.2026
 * @version 1.0
 */

package II_Unit.This_Super;

class Illustration3 {

    // simple constructor
    Illustration3() {
        System.out.println("Hello CSE A!");
        // invoking parameterized constructor
        this(10);
    }

    // parameterized constructor
    Illustration3(int x) {
        System.out.println("Current class parameterized constructor invoked.");
        // File file = new File("example.txt");
        // file.write("Number is : " + x);
        // file.close();
        System.out.println("Number is : " + x);
        this(20, 30);
    }

    Illustration3(int x, int y) {
        System.out.println("Current class parameterized constructor2 invoked.");
        System.out.println("Numbers are : " + x + " and " + y);
    }
}

public class ThisConstructorChain {
    public static void main(String[] args) {
        // creating an instance of Illustration class
        Illustration3 obj = new Illustration3();
    }
}