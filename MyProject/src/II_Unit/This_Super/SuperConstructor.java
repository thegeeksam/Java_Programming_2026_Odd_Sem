/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * It demonstrates the concept of `super` keyword in Java.
 * * The `super` keyword is a reference to the parent class object.
 * * It can be used to access parent class methods and variables.
 * *
 * * This Java snippet illustrates:
 * * - How the 'super' keyword accesses parent class constructor
 * *
 * @package II_Unit.This_Super
 * @author Dr. S. Sampath Kumar
 * @since 03-08-2025
 * @version 1.0
 */

package II_Unit.This_Super;

// parent class
class Parent3 {
  // parent class constructor
  Parent3() {
    System.out.println("Hi I am Parent class constructor.");
  }
}

// child class extending parent class
class Child3 extends Parent3 {
  // child class constructor
    Child3() {
      // invoking parent class constructor
      // constructor overriding
      super();  // Explicitly call superclass constructor - Polymorphism
      System.out.println("Hi I am Child class constructor.");
      // super(); // this will work fine
    }

    void print() {
      System.out.println("Hello");
    }
}

public class SuperConstructor {
  public static void main(String[] args) {
    // creating instance of child class
    Child3 obj = new Child3();
    obj.print();
  }
}