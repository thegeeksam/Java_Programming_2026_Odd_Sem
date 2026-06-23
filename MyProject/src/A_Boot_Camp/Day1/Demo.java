/**
 * * This file is part of the Java Programming Lecture project
 * *
 * * This Java snippet illustrates:
 * * - Instance Variable: sName is an instance variable, 
 * *   unique to each instance of the Demo class.
 * * - Static Variable: dHeight is a static variable, shared
 * *   among all instances of the Demo class.
 * * - Local Variable: iMarks and iAge are local variables,
 * *   defined within the main method and only accessible there.
 * * - The program reads an integer input for age and prints the
 * *   name, height, marks, and age.
 * * 
 * @package A_Boot_Camp.Day1;
 * @author Dr. S. Sampath Kumar
 * @since 02-06-2026
 * @version 1.0
 */


package A_Boot_Camp.Day1;

import java.util.Scanner;

public class Demo {
    //instance variable 
    String sName = "Abinesh M";
    //class and static variable
	static double dHeight = 5.9;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //local variable
        System.out.println("Enter your name:");
		String sName;
        sName = sc.nextLine();
        System.out.println("Enter your marks and age:");   
        int iMarks,iAge;
        iMarks = sc.nextInt();
		iAge = sc.nextInt();
        System.out.println("Name: " + sName);
        System.out.println("Marks: " + iMarks);
        System.out.println("Age: " + iAge);
    }
}