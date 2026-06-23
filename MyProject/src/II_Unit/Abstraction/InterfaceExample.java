/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * An interface in Java defines a contract or blueprint of methods 
 * * that implementing classes must fulfill. By default, all methods
 * * are public abstract and all fields are public static final. 
 * * Interfaces enable multiple inheritance of type and promote 
 * * loose coupling by separating what a class can do from how it does it.
 * *
 * * This Java snippet illustrates:
 * * - The concept of interfaces in Java.
 * * - Implementation of interface methods in a class.
 * *
 * @package II_Unit.Abstraction;
 * @author Dr. S. Sampath Kumar
 * @since 19-08-2025
 * @version 1.0
 */

// package II_Unit.Abstraction;
// Interface
interface Animal1 {
  // abstract method (does not have a body)
  public void animalSound(); 
  public void sleep(); 
}

// Lion "implements" the Animal interface
class Lion implements Animal1 {
  @Override
  public void animalSound() {
    // implementation of animalSound()
    System.out.println("The Lion Roars!\n");
  }

  @Override
  public void sleep() {
    // implementation of sleep()
    System.out.println("Lion: Zzz....\n");
  }
}

public class InterfaceExample {
  public static void main(String[] args) {
    Lion myLion = new Lion();  // Create a Lion object
    myLion.animalSound();
    myLion.sleep();
  }
}