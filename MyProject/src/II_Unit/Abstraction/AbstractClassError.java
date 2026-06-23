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

abstract class Animal {
    public abstract void animalSound();

    public void sleep() {
        System.out.println("Zzz");
    }
}

public class AbstractClassError {
    public static void main(String cseC[]) {
        Animal myObj = new Animal();
        // will generate an error because we cannot 
        // create an instance of an abstract class
    }
}