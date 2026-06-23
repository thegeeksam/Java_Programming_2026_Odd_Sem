/**
 * This file is part of the Boot Camp project.
 * This class serves as a placeholder for console-related examples. 
 * It can be used to demonstrate various console operations in Java.
 * Author: Dr. S. Sampath Kumar
 * Date: 07-07-2025
 * Version: 1.0
 */
package A_Boot_Camp.Day2;
import java.io.Console;

public class ConsoleExample {
    public static void main(String[] args) {
        Console console = System.console();
        if (console != null) {
            String user = console.readLine("Enter username: ");
            char[] password = console.readPassword("Enter password: ");
            System.out.println("Welcome, " + user);
        } else {
            System.out.println("Console not available.");
        }
    }

}
