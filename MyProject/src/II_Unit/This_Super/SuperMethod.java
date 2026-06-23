/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * It demonstrates the concept of `super` keyword in Java.
 * * The `super` keyword is a reference to the parent class object.
 * * It can be used to access parent class methods and variables.
 * *
 * * This Java snippet illustrates:
 * * - How the 'super' keyword accesses parent class method.
 * * - The difference between super.method() and this.method()
 * *
 * @package II_Unit.This_Super
 * @author Dr. S. Sampath Kumar
 * @since 03-08-2025
 * @version 1.0
 */

package II_Unit.This_Super;

// parent class
class Parent2 {
    // declaring display method parent class
    void display() {
        System.out.println("Hi I am parent method.");
    }
}

// child class extending parent class
class Child2 extends Parent2 {
    // declaring display method in Child class
    void display() {
        System.out.println("Hi I am child method.");
    }

    void print() {
        // 'super' keyword is used to invoke method from parent class
        // method Overriding
        super.display(); // Explicitly call superclass method - Polymorphism
        // display method from child class
        this.display();
    }
}

public class SuperMethod {
    public static void main(String[] args) {
        // creating instance of child class
        Child2 obj = new Child2();
        obj.print();
    }
}
