/**
 * * This file is part of the Boot Camp project.
 * * This file demonstrates method overloading, a form of static polymorphism.
 * * Method overloading allows multiple methods in the same 
 * * class to have the same name with different parameters.

 * @package A_Boot_Camp.Day5
 * @author Dr. S. Sampath Kumar
 * @since 10-07-2025
 * @version 1.0
 */
package A_Boot_Camp.Day5;

class StaticMethodPoly { 
	// Method overloading: same method name with different parameters
	// This is an example of static polymorphism (compile-time polymorphism)
	// Method sum with two parameters
	// This method calculates the sum of two integers
	void sum(int x, int y) 	{ 
		int s = x + y; 
		System.out.println("Sum of two numbers: " +s); 
	} 
	// Method sum with three parameters
	// This method calculates the sum of three integers
	void sum(int x, int y, int z) 	{ 
		int s = x + y + z; 
		System.out.println("Sum of three numbers: " +s); 
	} 
}

public class A_MethodOverLoading { 
	public static void main (String args []) { 
		StaticMethodPoly obj = new StaticMethodPoly(); 
		obj.sum(10, 20); // Calls the first sum method
		obj.sum(10, 20, 30); // Calls the second sum method
		main(10); // Calls the overloaded main method with int[] parameter
	} 
	public static void main(int args) {
		System.out.println("This is the main method with int parameter.");
		// You can call the overloaded main method here if needed
	}
}

