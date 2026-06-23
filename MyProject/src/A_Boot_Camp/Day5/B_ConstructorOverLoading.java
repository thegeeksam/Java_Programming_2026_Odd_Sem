/**
 * * This file is part of the Boot Camp project.
 * * This file demonstrates constructor overloading, a form of static polymorphism.
 * * Constructor overloading allows multiple constructors in the same
 * * class to have the same name with different parameters.
 * * This is a common practice in Java to provide flexibility in object creation.
 * * The first constructor is a default constructor with no parameters,
 * * and the second constructor is a parameterized constructor that takes two arguments.

 * @package A_Boot_Camp.Day5
 * @author Dr. S. Sampath Kumar
 * @since 10-07-2025
 * @version 1.0
 */
package A_Boot_Camp.Day5;

class StaticPoly { 
	//instance variables of the class  
	int id;  
	String name;  
	//default constructor
	StaticPoly(){  
		System.out.println("This is default constructor");  
	}  
	//parameterized constructor
	StaticPoly(int i, String n){  
		id = i;  
		name = n;  
	}  
	//method to display values
	void display(){  
		System.out.println("Student Id : " + id + "\nStudent Name : " + name);  
	}
}

public class B_ConstructorOverLoading { 
	public static void main (String args []) { 
		//object creation  
		StaticPoly sp1 = new StaticPoly();  
		System.out.println("Default Constructor values: ");  
		sp1.display(); 
		StaticPoly sp2 = new StaticPoly(126, "Pradeep");  
		System.out.println("\nParameterized Constructor values:");  
		sp2.display();  
	} 
}

