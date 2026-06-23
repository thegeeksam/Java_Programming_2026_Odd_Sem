/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * This Java snippet illustrates:
 * * - Declares an abstract class Animal with an abstract method animalSound().
 * * - Provides a concrete method sleep() that prints "Zzz".
 * *
 * @package II_Unit.Abstraction;
 * @author Dr. S. Sampath Kumar
 * @since 19-08-2025
 * @version 1.0
 */

package II_Unit.Abstraction;

// Abstract class
abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void animalSound();
    public abstract void eat();

    // Concrete method
    public void sleep(String animalName) {
        System.out.println(animalName + " Zzz");
    }
}

// Subclass inherit from Animal
class Lion extends Animal {
    @Override
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The Lion Roars!");
    }
    
    @Override
    public void eat() {
        System.out.println("The Lion eats meat");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        Animal myLion = new Lion(); // Create a LionCub object
        myLion.animalSound();
        myLion.eat();
        myLion.sleep("Lion");
    }
}