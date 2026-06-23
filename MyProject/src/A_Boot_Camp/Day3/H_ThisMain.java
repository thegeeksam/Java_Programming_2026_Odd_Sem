/**
 * * This file is part of the Boot Camp project.
 * * This class demonstrates the use of the `this` keyword in Java.
 * * The `this` keyword is used to refer to the current instance of a class.
 * * It is often used to resolve naming conflicts between instance variables and parameters.
 * * @author Dr. S. Sampath Kumar
 * * @since 08-07-2025
 * * @version 1.0
 */
package A_Boot_Camp.Day3;

public class H_ThisMain {
  int x = 10;

  // Constructor with a parameter
  public H_ThisMain(int x) {
    this.x = x;
    // if this keyword is not used, it would refer to the parameter x,
    // which would not change the instance variable x.
    // x = x;
  }

  // Call the constructor
  public static void main(String[] args) {
    H_ThisMain myObj = new H_ThisMain(5);
    System.out.println("Value of x = " + myObj.x);
  }
}