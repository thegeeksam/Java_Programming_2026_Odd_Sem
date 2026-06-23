/**
 * This file is part of the Boot Camp project.
 * This class serves as a placeholder for console-related examples.
 * print() - Prints text without a newline. Cursor stays on the same line.
 * println() - Prints text with a newline. Cursor moves to the next line.
 * write() - Writes characters to the console, similar to print().
 * Author: Dr. S. Sampath Kumar
 * Date: 07-07-2025 
 * Version: 1.0
 */
package A_Boot_Camp.Day2;

public class ConsoleOutput {
    public static void main(String[] args) {
        System.out.print("Hello, ");
        System.out.print("World!");
        System.out.println(); // Move to the next line
        System.out.println("Hello,");
        System.out.println("World!");
        System.out.write(72); // ASCII for 'H'
        System.out.write(105); // ASCII for 'i'
        System.out.write('\n'); // Newline
        System.out.flush(); // Ensure output is displayed
        // Writes bytes to the console
    }

}
