/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * This Java snippet illustrates:
 * * - Anonymous class
 * * - Lambda expression
 * * - Functional interface
 * * - @FunctionalInterface annotation
 * *
 * * >>> functional interface and lambda expression <<<
 * * An interface that contains only one abstract method.
 * * They can have only one functionality to exhibit.
 * * Thus, they can be used as the basis for lambda expressions.
 * * Functional interfaces can have any number of default methods.
 * *
 * @package III_Unit.LambdaExpression;
 * @author Dr. S. Sampath Kumar
 * @since 11-09-2025
 * @version 2.0
 */
package III_Unit.LambdaExpression;

//------> Lambda Example 1: Anonymous class - 🐑Lambda expression <------

@FunctionalInterface
interface CSE {
    void CseMethod();
}

public class LambdaExFunction {
    public static void main(String[] args) {
        // Before Java 8
        // without lambda, implementation
        // using anonymous class
        CSE person = new CSE() {
            @Override // Optional annotation
            public void CseMethod() {
                System.out.println("Before Java 8 without lambda!");
            }
        };
        person.CseMethod();

        // After Java 8
        // Using lambda expression
        CSE p2 = () -> System.out.println("Lambda Implemented!");
        p2.CseMethod();
    }
}