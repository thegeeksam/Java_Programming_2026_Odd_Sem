/**
 * * This file is part of the Java Programming Lecture project.
 * * It demonstrates the concept of `this` keyword in Java.
 * * The `this` keyword is a reference to the current object.
 * @package II_Unit.This_Super
 * @author Dr. S. Sampath Kumar
 * @since 03-08-2025
 * @version 1.0
 */
package II_Unit.This_Super;


// The this keyword is used to return the current instance of a class.
// Methods of the class can be called directly at the time of
// creating an object using this

// illustration class
class Illustration6 {

    Illustration6 getIllustration() {
        // returing the instance of current class
        return this;
    }

    void print() {
        System.out.println("Hello World!");
    }
}

public class this6 {

    public static void main(String[] args) {
        new Illustration6().getIllustration().print();
    }
}
