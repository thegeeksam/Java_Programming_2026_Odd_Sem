/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * This Java snippet illustrates:
 * * - Declares an abstract class CSE with an abstract method student()
 * * - Provides a concrete method getDetails() that prints "Hello CSE!"
 * *
 * @package II_Unit.Abstraction;
 * @author Dr. S. Sampath Kumar
 * @since 19-08-2025
 * @version 1.0
 */

package II_Unit.Abstraction;
interface FirstInterface {
  public void myMethod(); // abstract method
  int iA = 10; // Member
}

interface SecondInterface {
  public void myOtherMethod(); // interface method
  public void myMethod(); // interface method
}

class DemoClass implements FirstInterface, SecondInterface {
  @Override
  public void myMethod() {
    System.out.println("Some text..");
  }
  @Override
  public void myOtherMethod() {
    //iA++;
    System.out.println("Some other text..." + iA);
  }
}

public class MultipleInterface {
  public static void main(String[] args) {
    DemoClass myObj = new DemoClass();
    myObj.myMethod();
    myObj.myOtherMethod();
  }
}