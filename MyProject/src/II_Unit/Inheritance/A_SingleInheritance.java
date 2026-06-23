/**
 * * This file is part of the Java Programming Lecture project.
 * * It demonstrates the concept of Single Inheritance in Java.
 * * Single Inheritance allows a class (child class) to 
 * * inherit properties and methods from another class (parent class).
 * * In this example, the `Student` class inherits from the `Person` class.
 * * The `Student` class can access the properties and methods of the `Person` class.
 * * This demonstrates the concept of Single Inheritance in Java.
 * *

 * @package II_Unit.Inheritance
 * @author Dr. S. Sampath Kumar
 * @since 03-08-2025
 * @version 1.0
 */
package II_Unit.Inheritance;
//Base class
class Person
{
	String name="Kathiravan";
	public void show()
	{
		System.out.println("Student inheriting properties from Person");
	}
}
//child class
class Student extends Person
{
  	// defining additional properties to child class
	String course = "Java Programming";
	public void show1()
	{
		System.out.println("I am a Student who belongs to Person class");
	}
}
public class A_SingleInheritance{
	public static void main(String args[])
	{
		//
		Student obj = new Student();
		obj.show(); //calling Parent Class method
		obj.show1(); //calling child class method
		System.out.println("Name of student: " + obj.name);
		System.out.println("Course opted by the student: " + obj.course);
	}
}