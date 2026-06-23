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
    // public void display() {
    //     System.out.println("Welcome!");
    // }
}

public class FinalMethod {
    public static void main(String[] args) {
        Child varY = new Child();
        varY.display(); // Call the display method to use the variable
        varY.display(5); // Call the display method to use the variable
    }
}
