/**
 * * This file is part of the Boot Camp project.
 * * It demonstrates the concept of Hierarchical Inheritance in Java.
 * * Hierarchical Inheritance allows multiple classes (child classes) to
 * * inherit properties and methods from a single class (parent class).
 * *
 * * In this example, the `Derived1` and `Derived2` classes inherit from the `Base` class.
 * *
 * * This demonstrates the concept of Hierarchical Inheritance in Java.
 *
 * @package A_Boot_Camp.Day5
 * @author Dr. S. Sampath Kumar
 * @since 10-07-2025
 * @version 1.0
 */
package A_Boot_Camp.Day5;
// Java program to implement hierarchical 
// inheritance

class Parent {
  void ParentMethod() {
    System.out.println("Parent method called.");
  }
}

class Son extends Parent {
  void SonMethod() {
    System.out.println("Son method called.");
  }
}

class Daughter extends Parent {
  void DaughterMethod() {
    System.out.println("Daughter method called.");
  }
}

public class F_HierarchicalInheritance {
  public static void main(String[] args) {
    Son obj1 = new Son();
    Daughter obj2 = new Daughter();

    obj1.ParentMethod();
    obj1.SonMethod();

    obj2.ParentMethod();
    obj2.DaughterMethod();
  }
}