/**
 * * This file is part of the Boot Camp project.
 * * This class demonstrates the use of parameterized constructors 
 * * in Java.
 * * This class defines a Data class with a parameterized constructor
 * * @author Dr. S. Sampath Kumar
 * * @since 08-07-2025
 * * @version 1.0
 * */
package A_Boot_Camp.Day3;

class Data {
	// data members of the class.
	// initialized with default values.
	String name = "Ezhilarasan";
	int id = 51;
	// This is a default constructor.
	Data(){
		System.out.println("Default constructor called!");
	}
	
	/*  This is a parameterized constructor.
		This constructor initializes the data members
		with the given parameters.
	*/
	Data(String name, int id)
	{
		System.out.println("Parameterized Constructor Activated!");
		this.name = name;
		// id = id;
		this.id = id;
	}
}
public class F_Parameterized {
	public static void main(String[] args)
	{	
		// This would invoke the parameterized constructor.
		Data data = new Data("Adithyan", 4);
		System.out.println("Name: " + data.name	+ " and ID: " + data.id);
		// This would invoke the default constructor.
		Data data1 = new Data();
		System.out.println("Name: " + data1.name	+ " and ID: " + data1.id);
	}
}
