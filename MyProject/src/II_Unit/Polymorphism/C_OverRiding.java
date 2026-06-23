/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * This file demonstrates method overriding, a form of dynamic polymorphism.
 * *
 * * Method overriding allows a subclass to provide a specific implementation
 * * of a method that is already defined in its superclass (parent class).
 * *
 * * In this example, the `methodA` in the `DerivedClass` overrides the 
 * * `methodA` in the `BaseClass`.
 * *
 * * When the method is called on an object of the derived class, 
 * * the overridden method in the derived class is executed 
 * * instead of the one in the base class.
 * *
 * * This is a common practice in Java to achieve runtime polymorphism.
 * *
 * @package II_Unit.Polymorphism
 * @author Dr. S. Sampath Kumar
 * @since 03-08-2025
 * @updated 22-06-2026
 * @version 1.1
 */
package II_Unit.Polymorphism;

class BaseClass {
	// Constructor of Base Class
	public BaseClass() {
		System.out.println("Constructor of Base Class");
	}

	public void methodA() {
		// Base class method
		System.out.println("methodA of Base Class");
	}
}

class DerivedClass extends BaseClass {

	public DerivedClass() {
		// Constructor of Derived Class
		System.out.println("Constructor of Derived Class");
	}

	public void methodA() {
		// Derived Class method
		System.out.println("methodA of Derived Class");
	}

	public void methodB() {
		// Derived Class method
		System.out.println("methodB of Derived Class");
	}
}

public class C_OverRiding {
	public static void main(String args[]) {
		// BaseClass obj1 = new BaseClass();
		// obj1.methodA();
		// This is just a line breaker. So ignore it.
		System.out.println("Hello CSE A");
		BaseClass obj2 = new DerivedClass();
		obj2.methodA();
	}
}

/*
 * Note: As you can see the methodA has 2 different forms in
 * child and parent class thus we can say methodA here is polymorphic.
 */