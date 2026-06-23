/**
 * This file is part of the Boot Camp project.
 * This class demonstrates the use of BufferedReader in Java.
 * It reads user input from the console and prints a greeting message.
 * The BufferedReader class is used to read text from a character-input stream.
 * Author: Dr. S. Sampath Kumar
 * Date: 07-07-2025
 * Version: 1.0
 */
package A_Boot_Camp.Day2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEx {
    public static void main(String[] args) throws IOException {
        // Create a BufferedReader to read from the console
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Prompt the user for input
        System.out.print("Enter your name: ");
        
        // Read a line of text from the console
        String name = br.readLine();
        
        // Print a greeting message
        System.out.println("Hello, " + name + "!");
        
        
        /**
         * BufferedReader is used for efficient reading of characters, arrays, and lines.
         * It can read text from various sources, including files and input streams.
         * In this example, it reads user input from the console.
         */

        /** 
         * Problem: BufferedReader only reads strings. 
         * You must manually convert to int, double, etc.
         */
        System.out.print("Enter your age: ");
        int age = Integer.parseInt(br.readLine());
        System.out.println("Enter Your Home Town: ");
        String homeTown = br.readLine();
        System.out.println("Your age is: " + age + 
                            " Your Home Town is: " + homeTown);

        // Close the BufferedReader
        br.close();
    }

}
