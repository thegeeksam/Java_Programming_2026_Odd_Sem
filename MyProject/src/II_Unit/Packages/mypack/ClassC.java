/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * Java packages are foundational elements for organizing code
 * * into coherent and manageable structures
 * *
 * @package II_Unit.Polymorphism
 * @author Dr. S. Sampath Kumar
 * @since 24-08-2025
 * @version 1.0
 */

package II_Unit.Packages.mypack;
//import II_Unit.Packages.MyPack.ClassB;

class ClassC extends ClassB {
    public ClassC() {
        // super();
        System.out.println("Hello from Class C Constructor");
    }

    public void displayC() {
        System.out.println("Hello, II CSE - Section C");
    }
}