/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * This Java snippet illustrates:
 * * - Declares an abstract class CSE with an abstract method student()
 * * - Demonstrates the use of constructors in abstract classes and
 * *   how to instantiate a subclass.
 * *
 * @package II_Unit.Abstraction;
 * @author Dr. S. Sampath Kumar
 * @since 19-08-2025
 * @updated 07-07-2026
 * @version 1.1
 */

package II_Unit.Abstraction;

abstract class CSE {
	int total;

	CSE() {
		System.out.println("Abstract (Parent) Class Constructor is Invoked!\n");
	}

	abstract void student();

	void getDetails() {
		System.out.println("Hello ECE!\n");
	}
}

class EceC extends CSE {
	EceC() {
		// super();
		System.out.println("Concrete (Child) Class Constructor is Invoked!\n");
	}

	@Override
	void student() {
		System.out.println("This is II ECE C!");
	}
}

public class C_ConstructAbs {
	public static void main(String args[]) {
		CSE obj = new EceC();
		obj.student();
		obj.getDetails();
		obj.total = 66;
		System.out.println("Total Students in Class is: " + obj.total);
	}
}