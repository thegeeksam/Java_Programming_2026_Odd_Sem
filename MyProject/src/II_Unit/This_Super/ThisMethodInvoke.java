/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * This snippet shows how the 'this' keyword can be used to:
 * * - Call another method within the same class.
 * * - Emphasize that the method belongs to the current object.
 * *
 * @package II_Unit.This_Super
 * @author Dr. S. Sampath Kumar
 * @since 03-08-2025
 * @version 1.0
 */

package II_Unit.This_Super;

class Illustration2 {

    public Illustration2() {
    }

    
    public Illustration2(int x) {
        System.out.println("Hello Jaisurya!");
    }
    
    // current class method
    void app() {
        // this.Illustration2(10);
        System.out.print("My name is ");
    }

    void name() {
        // invoking current class 'app' method.
        this.app();
        System.out.println("Ravi.");
    }
}

public class ThisMethodInvoke {

    public static void main(String[] args) {
        // creating an instance of Illustration class
        Illustration2 obj = new Illustration2();
        obj.name();
    }
}
