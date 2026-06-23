/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * It demonstrates the concept of `super` keyword in Java.
 * * The `super` keyword is a reference to the parent class object.
 * * It can be used to access parent class methods and variables.
 * *
 * * This Java snippet illustrates:
 * * - How the 'super' keyword accesses parent class variables.
 * * - How variable shadowing works between parent and child classes.
 * * - The difference between super.variable and this.variable (or just variable in child class).
 * *
 * @package II_Unit.This_Super
 * @author Dr. S. Sampath Kumar
 * @since 03-08-2025
 * @version 1.0
 */
package II_Unit.This_Super;

// parent class
class Parent1 {
    int iA = 50;
    String sB = "Hello! II CSE B!";
}

// child class extending parent class
class Child1 extends Parent1 {
    int iA = 100;
    String sB = "Happy Coding!";

    void print() {
        // “super” refer to an instance variable of an immediate parent class.
        System.out.println("Number from parent class is : " + super.iA);
        System.out.println("String from parent class is : " + super.sB);

        // printing instance variable value of the current/child class
        System.out.println("Number from child class is : " + this.iA);
        System.out.println("String from child class is : " + sB);
    }
}

public class SuperVariable {
    public static void main(String[] args) {
        // creating instance of child class
        Child1 obj = new Child1();
        obj.print();
    }
}
