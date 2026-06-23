/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * This file demonstrates constructor overloading, a form of static polymorphism.
 * *
 * * Constructor overloading allows multiple constructors in the same
 * * class to have the same name with different parameters.
 * *
 * * This is a common practice in Java to provide flexibility in object creation.
 * *
 * * The first constructor is a default constructor with no parameters,
 * * and the second constructor is a parameterized constructor that takes two arguments.
 * *
 * @package II_Unit.Polymorphism
 * @author Dr. S. Sampath Kumar
 * @since 03-08-2025
 * @t
 * @version 2.0
 */
package II_Unit.Polymorphism;

class StaticPoly {
	// instance variables of the class
	int iId;
	String sObjName;

	// default constructor
	StaticPoly() {
		System.out.println("This is default constructor");
	}

	// parameterized constructor
	StaticPoly(int iId, String sObjName) {
		this.iId = iId;
		this.sObjName = sObjName;
	}

	// method to display values
	void display() {
		System.out.println("Student Id : " + iId + "\nStudent Name : " + sObjName);
	}
}

public class B_ConstructorOverLoading {
	public static void main(String args[]) {
		// object creation
		StaticPoly sp1 = new StaticPoly();
		System.out.println("Default Constructor values: ");
		sp1.display();
		StaticPoly sp2 = new StaticPoly(31, "Devak");
		System.out.println("\nParameterized Constructor values:");
		sp2.display();
	}
}