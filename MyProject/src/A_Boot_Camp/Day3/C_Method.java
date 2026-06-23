/**
 * This file is part of the Boot Camp project.
 * * This class demonstrates the use of static and 
 * * public methods in Java.
 * 
 * @author Dr. S. Sampath Kumar
 * @since 07-07-2025
 * @version 1.0
 */
package A_Boot_Camp.Day3;

class Method {
  int iA = 5; // Instance variable
  static int iSb = 15; // Static variable
  // Static method
  static void myStaticMethod() {
    // iA = 10; // Static methods can access static variables
    iSb++; // Static methods can also access instance variables
    System.out.println("Static methods can be called without creating objects");
    System.out.println("Value of static variable iSb: " + iSb);
  }
  Method(){
    System.out.println("Value of static variable iSb: " + iSb);
  }

  // Instance method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }
}
public class C_Method {
  
  // Main method
  public static void main(String[] args) {
	  Method.myStaticMethod(); // Call the static method
    // myPublicMethod(); // This would compile an error

		Method myObj = new Method(); // Create an object of Method
		myObj.myPublicMethod(); // Call the public method on the object
  }
}