/**
 * * This file is part of the Boot Camp project.
 
 * *    

 * @package A_Boot_Camp.Day5
 * @author Dr. S. Sampath Kumar
 * @since 10-07-2025
 * @version 1.0
 */
package A_Boot_Camp.Day5;

public class H_MethodOverriding { 
	public static void main (String args []) { 
		BaseClass obj1 = new BaseClass(); 	
		DerivedClass obj2 = new DerivedClass(); 
		obj1.methodA(); 
		obj2.methodA(); 
	} 
}

class BaseClass { 
	public void methodA() { 
	//Base class method 	
	System.out.println("methodA of Base Class"); 
	} 
} 

class DerivedClass extends BaseClass{ 
	public void methodA() { 
		//Derived Class method 
		System.out.println ("methodA of Derived Class"); 
	} 
} 


/*
Note: As you can see the methodA has 2 different forms in 
child and parent class thus we can say methodA here is polymorphic.
*/