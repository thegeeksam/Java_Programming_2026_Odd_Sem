/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * This Java snippet illustrates:
 * * - Declares a final class and attempts to inherit it, 
 * *   which will result in a compilation error.
 * *
 * @package II_Unit.Final_Keyword
 * @author Dr. S. Sampath Kumar
 * @since 30-06-2026
 * @version 1.1
 */

package II_Unit.Final_Keyword;

// Final Class
final class X {
    public void displayX() {
        System.out.println("Hello World!");
    }
}

// This will generate Error
// Since we cannot inherit a final class
class Y extends X { // Error
    public void displayY() {
        System.out.println("Welcome!");
    }
}

public class D_FinalClass {
    public static void main(String[] args) {
        X varX = new X();
        varX.displayX(); // Call the display method to use the variable
        Y varY = new Y();
        varY.displayY(); // Call the display method to use the variable
    }
}
