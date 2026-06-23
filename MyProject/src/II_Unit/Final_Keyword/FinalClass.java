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

public class FinalClass {
    public static void main(String[] args) {
        X varX = new X();
        varX.displayX(); // Call the display method to use the variable
        Y varY = new Y();
        varY.displayY(); // Call the display method to use the variable
    }
}
