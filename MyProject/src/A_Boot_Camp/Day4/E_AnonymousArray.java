/**
 * * This file is part of the Boot Camp project.
 * * Anonymous array - array without a name
 * * This class demonstrates the use of an anonymous array in Java.
 * * It shows how to pass an anonymous array to a method.
 * * The method calculates the sum of the elements in the array.
 * * * It uses a for-each loop to iterate through the array elements.
 * @package A_Boot_Camp.Day4 
 * @author Dr. S. Sampath Kumar
 * @since 09-07-2025
 * @version 1.0
 * */
package A_Boot_Camp.Day4;

class E_AnonymousArray {
	public static void main(String[] args)
	{
		// Passing an anonymous array to the sum method directly
		// the array is created and passed in one line
		sum(new int[]{ 1, 2, 3 });
	}

	static void sum(int[] a)
	{
		int total = 0;

		// using for-each loop
		for (int i : a)
			total = total + i;
		
		System.out.println("The sum is: " + total);
	}
}
