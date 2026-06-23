/**
 * * This is part of the Boot Camp project.
 * * This class demonstrates the use of a copy constructor in Java.
 * * Copy Constructor is a special type of constructor that creates a 
 * * new object as a copy of an existing object.
 * * It is used to initialize an object using another object of the same class.
 * * This is useful when you want to create a new object with the same state as 
 * * an existing object.
 * @author Dr. S. Sampath Kumar
 * @since 08-07-2025
 * @version 1.0
 */
package A_Boot_Camp.Day3;

public class G_CopyConstructor {
	int id;
	String name;
	int age;

    // Parameterized constructor
	G_CopyConstructor(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	// Copy constructor
	G_CopyConstructor(G_CopyConstructor obj) {
		this.id = obj.id; 
		this.name = obj.name;
		this.age = obj.age;
	}

	void display() {
		System.out.println(id + " " + name + " " + age);
	}

	public static void main(String args[]) {
		G_CopyConstructor s1 = new G_CopyConstructor(79, "HARISH G", 20);
		G_CopyConstructor s2 = new G_CopyConstructor(s1);
		s1.display();
		s2.display();
        
	}
}
