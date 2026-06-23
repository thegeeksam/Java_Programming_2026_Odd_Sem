/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * This Java snippet illustrates:
 * * - Declares an abstract class CSE with an abstract method student()
 * * - Provides a concrete method getDetails() that prints "Hello CSE!"
 * *
 * @package II_Unit.Abstraction;
 * @author Dr. S. Sampath Kumar
 * @since 19-08-2025
 * @version 1.0
 */

package II_Unit.Abstraction;

abstract class CSE {
	int total;

	CSE() {
		System.out.println("Constructor is Invoked!\n");
	}

	void getDetails() {
		System.out.println("Hello CSE!\n");
	}

	abstract void student();
}

class CseC extends CSE { 
	@Override
	void student() {
		System.out.println("This is II CSE B!");
	}
}

public class ConstructAbs {
	public static void main(String args[]) {
		CSE obj = new CseC();
		obj.student();
		obj.getDetails();
		obj.total = 64;
		System.out.println(obj.total);
	}

}