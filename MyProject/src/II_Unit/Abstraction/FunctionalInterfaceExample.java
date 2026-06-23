/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * A functional interface is an interface with exactly 
 * * one abstract method. It can have default or static methods 
 * * too, but only one method is abstract. This makes it ideal 
 * * for lambda expressions, which are anonymous functions 
 * * that implement that single method.
 * *
 * * This Java snippet illustrates:
 * * - Declares an abstract class CSE with an abstract method student()
 * * - Provides a concrete method getDetails() that prints "Hello CSE!"
 * *
 * @package II_Unit.Abstraction;
 * @author Dr. S. Sampath Kumar
 * @since 19-08-2025
 * @version 1.0
 */

package II_Unit.Abstraction;

// A functional interface is an interface that 
// contains only one abstract method.
@FunctionalInterface
interface Calculator {
    int operate(int a, int b);
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
            // Using Lambda Expression to implement the operate method  
            // This is the "lambda expression". 'add'- name of lambda
            // `(a, b)` → parameters  
            // `a + b` → implementation of `operate()` method
            // You’re saying: “Whenever someone calls `operate(a, b)`,
            // just return `a + b`.”
            // The lambda "automatically implements" the `Calculator` interface.
            Calculator add = (a, b) -> a + b;
            // No need to write a separate class like 
            // `AddCalculator implements Calculator`.  
            // The lambda does it anonymously and concisely.
            System.out.println(add.operate(5, 3)); // Output: 8
        }
}
