/**
 * This file is part of the Boot Camp project.
 * This class demonstrates the use of the Scanner class in Java.
 * It reads user input from the console and prints a greeting message.
 * The Scanner class is used to read input from various sources, 
 * including the console.
 * Author: Dr. S. Sampath Kumar
 * Date: 07-07-2025
 * Version: 1.0
 */
package A_Boot_Camp.Day2;
// Importing the Scanner class from the java.util package
import java.util.Scanner;
public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your name: ");
        // String name = sc.nextLine();
        // System.out.println("Hello, " + name + "!");
        
        /**
         * Demonstrating the use of Scanner to read user input.
         * The Scanner class provides methods to read different types of input,
         * such as strings, integers, and doubles.
         */
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        /** 
        * Methods like nextInt() or next() don’t consume 
        * the newline (\n) character.
        * So nextLine() reads that leftover newline.
        */
        // Solution 1: use nextLine() after nextInt()
        sc.nextLine(); // Consume the leftover newline
        
        // Solution 2: Use nextLine() for everything and parse manually
        // int age = Integer.parseInt(sc.nextLine());
        System.out.print("Enter name: ");
        String name1 = sc.nextLine();
        System.out.println("Hello, " + name1 + "! You are " + age + " years old.");


        /** 
        * Close the scanner to free up resources
        * It's a good practice to close the scanner when done
        */
        sc.close();
    }

}
