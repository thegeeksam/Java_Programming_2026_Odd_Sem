/**
 * * This file is part of the Java Programming Lecture project.
 * * It demonstrates the concept of Superclass and Subclass constructors in Java.
 * *
 * * In this example, the `Super` class has a constructor that is called when 
 * * an instance of the `Sub` class is created.
 * *
 * * This demonstrates the concept of Superclass and Subclass constructors in Java.
 * * The `Sub` class extends the `Super` class, and when an object of `Sub` is created, the constructor of `Super` is invoked first.
 * * This is because the subclass constructor implicitly calls the superclass constructor using `super()`.
 * @package II_Unit.Inheritance
 * @author Dr. S. Sampath Kumar
 * @since 03-08-2025
 * @version 1.0
 */
package II_Unit.Inheritance;

class Parent {
    Parent() {
        System.out.println("Parent class constructor called.");
    }
}

class Child extends Parent {
    Child() {
        // super();
        System.out.println("Child class constructor called.");
    }
}

public class Z_SuperParent {
    public static void main(String[] args) {
    Child child = new Child();
    // When an object of Child is created, the constructor of Parent is called first.
    // This is because the subclass constructor implicitly calls the 
    // superclass constructor using super().
    }
}