/**
 * * This file is part of the Boot Camp project.
 * * This class demonstrates the use of constructors in Java.
 * 
 * @author Dr. S. Sampath Kumar
 * @since 08-07-2025
 * @version 1.0
 */
package A_Boot_Camp.Day3;

public class D_ConstructorExample {
	/**
	 * This is a constructor for the ConstructorExample class.
	 * It is called when an instance of the class is created.
	 * Constructors are used to initialize the state of an object.
	 */
	D_ConstructorExample()
	{
		System.out.println("Constructor Called");
	}

	/**
	 * This is the main method, which serves as the entry point for the program.
	 * It creates an instance of the ConstructorExample class,
	 * which will invoke the constructor.
	 */ 
	public static void main(String[] args)
	{
		/**
		 * Creating an instance of ConstructorExample
		 * This will call the constructor and print "Constructor Called".
		 */
		D_ConstructorExample ce = new D_ConstructorExample();
	}
}
