/**
 * * This file is part of the Boot Camp project.
 * * This class demonstrates the addition of two numbers 
 * * using a separate class.
 * * @author Dr. S. Sampath Kumar
 * * @since 08-07-2025
 * * @version 1.0
 */
package A_Boot_Camp.Day3;
import java.util.Scanner;
class Add
{ 
	// int c;
	int addition(int x, int y)
	{ 	// c = x + y;
		return x + y; 
		// Return the sum instead of storing it in a variable
	}
}

public class A_ClassObj
{
	public static void main(String[] arg)
	{ 
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		a = sc.nextInt();
		System.out.println("Enter second number");
		b = sc.nextInt();
		Add r = new Add(); //Create Object for Add class
		// r.addition(a, b);
		// System.out.println("Addition of two numbers is : " + r.c);
		System.out.println("Addition of two numbers is : " + r.addition(a, b));
	} 
}


