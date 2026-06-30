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

    // No new object is created.
    // It simply passes the reference of the existing object.
    void print(Illustration4 ob) {
        // ob.value += 10;
        System.out.println("ob.value = " + ob.value);
    }

    void invoke() {
        // print method is invoked by passing 'this' as an argument
        // this passes the reference of the current object to the print() method.
        print(this);
        // this refers to the current object of Illustration4 class
        // object is not passed here, object reference is passed

    }
}

public class ThisArgument {

    public static void main(String[] args) {
        // creating an instance of Illustration class
        Illustration4 obj = new Illustration4();
        obj.invoke();
    }
}