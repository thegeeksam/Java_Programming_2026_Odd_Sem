/**
 * * This file is part of the Boot Camp project.
 * * It demonstrates the concept of Multi-Level Inheritance in Java.
 * * Multi-Level Inheritance allows a class (child class) to 
 * * inherit properties and methods from another class (parent class),
 * * and then a 3rd class can inherit from the 2nd class.
 * *
 * * In this example, the `ClassC` class inherits from the `ClassB` class,
 * * which in turn inherits from the `ClassA` class.
 * *
 * * This demonstrates the concept of Multi-Level Inheritance in Java.
 * *    

 * @package A_Boot_Camp.Day5
 * @author Dr. S. Sampath Kumar
 * @since 10-07-2025
 * @version 1.0
 */
package A_Boot_Camp.Day5;

class ClassA {
    ClassA(){
        System.out.println("Constructor of ClassA");
    }
    public void displayA(){
        System.out.println("disp() method of ClassA");
    }
}
class ClassB extends ClassA {
    ClassB(){
        System.out.println("Constructor of ClassB");
    }
    public void displayB(){
        System.out.println("disp() method of ClassB");
    }
}
class ClassC extends ClassB{
    ClassC(){
        System.out.println("Constructor of ClassC");
    }
    public void displayC(){
        System.out.println("disp() method of ClassC");
    }
}
public class E_MultiLevel{
    public static void main(String args[]){
        // Creating an object of ClassC
        ClassC c = new ClassC();
        c.displayA();
        c.displayB();
        c.displayC();
    }
}