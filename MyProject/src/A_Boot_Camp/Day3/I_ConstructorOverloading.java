/**
 * * This file is part of the Boot Camp project.
 * * This class demonstrates the use of constructor overloading in Java
 * 
 * * This class defines a class with multiple constructors
 * * that initialize the data members in different ways.
 * * Constructor overloading allows a class to have more than one constructor
 * @author Dr. S. Sampath Kumar
 * @since 08-07-2025
 * @version 1.0
 * */
package A_Boot_Camp.Day3;
public class I_ConstructorOverloading{
	int id = 53;
	String name = "Glen";
	int age = 18;
	// This is a default constructor.
	// It initializes the data members with default values.
	I_ConstructorOverloading(){
		System.out.println("Default constructor called!");
	}
	// This is a parameterized constructor.
	// It initializes the data members with the given 2 parameters.
	I_ConstructorOverloading(int id,String name){
		this.id = id;
		this.name = name;
	}
	// This is another parameterized constructor.
	// It initializes the data members with the given 3 parameters.
	I_ConstructorOverloading(int i,String n,int a){
		this.id = i;
		this.name = n;
		this.age = a;
	}
	void display(){
		System.out.println(id + " " + name + " " + age);	
	}
	public static void main(String args[]){
		I_ConstructorOverloading s = new I_ConstructorOverloading();
		I_ConstructorOverloading s1 = new I_ConstructorOverloading (49,"Elavarasan");
		I_ConstructorOverloading s2 = new I_ConstructorOverloading(64,"Hariharan S D",17);
		s.display();
		s1.display();
		s2.display();
	}
}