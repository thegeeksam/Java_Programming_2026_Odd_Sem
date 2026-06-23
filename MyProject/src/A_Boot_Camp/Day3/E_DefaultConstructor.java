/**
* * This file is part of the Java Boot Camp course.
* * This class demonstrates the use of a default constructor.
* @author Dr. S. Sampath Kumar
* @since 08-07-2025
* @version 1.0
*/
package A_Boot_Camp.Day3;

public class E_DefaultConstructor {
	String name = "Kathir";
	int id = 307;
	/** 
	 * Default Constructor will assign default values to the data members.
	 * In Java, if no constructor is defined, a default constructor 
	 * is automatically provided.
	 * Default constructor initializes the data members
	 * with default values.
	*/
	E_DefaultConstructor() { 
		System.out.println("Default constructor called!");
	}

	public static void main(String[] args)
	{
		E_DefaultConstructor hello = new E_DefaultConstructor();
		System.out.println("Name: " + hello.name + " and ID: " + hello.id);
	}
}
