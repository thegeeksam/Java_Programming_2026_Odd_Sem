/**
 * * This file is part of the Java Programming Lecture project.
 * * 
 * * It demonstrates the concept of `this` keyword in Java.
 * * The `this` keyword is a reference to the current object.
 * * 
 * * It helps in resolving variable shadowing and how 'this' 
 * * keyword helps differentiate between class-level variables 
 * * and method-level variables
 * @package II_Unit.This_Super
 * @author Dr. S. Sampath Kumar
 * @since 03-08-2025
 * @version 1.0
 */
package II_Unit.This_Super;

// Illustration class
class Illustration1 {

    // declaring an instance variable
    int instanceVar = 5;
    // declaring an static variable
    static int staticVar = 10;

    void App() {
        // Method-specific variables
        int instanceVar = 20;
        int staticVar = 40;

        // referring to the current class instance and static variables
        this.instanceVar = 50;
        this.staticVar = 100;

        // printing the current class instance and static variable.
        System.out.println("Value of instance variable : " + this.instanceVar);
        System.out.println("Value of static variable : " + this.staticVar);

        // printing the method specific variables.
        System.out.println("instanceVar inside method : " + instanceVar);
        System.out.println("staticVar inside method: " + staticVar);
    }
}

public class this1 {

    public static void main(String[] args) {
        // creating an instance of Illustration class
        Illustration1 obj = new Illustration1();
        obj.App();
    }
}
