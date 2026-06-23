/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * This snippet shows how:
 * * - 'this' can be passed as a method argument.
 * * - It allows one method to receive a reference to the current object.
 * * is is useful in scenarios like callbacks, event handling, or object comparison.
 * *
 * @package II_Unit.This_Super
 * @author Dr. S. Sampath Kumar
 * @since 03-08-2025
 * @version 1.0
 */

package II_Unit.This_Super;

class Illustration4 {
    int value = 5;

    // print method
    void print(Illustration4 ob) {
        System.out.println("ob.value = " + ob.value);
    }

    void invoke() {
        // print method is invoked by passing 'this' as an argument
        print(this);
    }
}

public class ThisArgument {

    public static void main(String[] args) {
        // creating an instance of Illustration class
        Illustration4 obj = new Illustration4();
        obj.invoke();
    }
}
