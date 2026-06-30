/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * This Java snippet illustrates:
 * * - Declares a final method in the Parent class.
 * * - Attempts to override the final method in the Child 
 * *   class (which will result in a compilation error).
 * * - Demonstrates method overloading with a non-final method in the Parent class.
 * *
 * @package II_Unit.Final_Keyword
 * @author Dr. S. Sampath Kumar
 * @since 30-06-2026
 * @version 1.1
 */

package II_Unit.Final_Keyword;

class Parent {
    // declaring method as final
    public final void display() {
        System.out.println("Hello II CSE B!");
    }

    public void display(int num) {
        System.out.println("Number: " + num);
    }
}

class Child extends Parent {

    // try to override final method will generate error
    // since we cannot override a final method
    public void display() {
        System.out.println("Welcome!");
    }
}

public class C_FinalMethod {
    public static void main(String[] args) {
        Child varY = new Child();
        varY.display(); // Call the display method to use the variable
        varY.display(5); // Call the display method to use the variable
    }
}
