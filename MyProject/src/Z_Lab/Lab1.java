/**
 * * This file is part of the Java Programming Lab project.
 * * Write a Java program that prompts the user to enter their name, age, and city. The program should use a class called "UserProfile" that demonstrates:
- A default constructor that initializes the user details with default values.
- An overloaded constructor that accepts user input and sets the values accordingly.
- A method displayDetails() that prints the user information in a formatted way.
- Validate that age is a positive integer.

Sample Input: 1
Enter your name: Hariharan
Enter your age: 15
Enter your city: Pollachi

Sample Output: 1
User Details:
Name: Hariharan
Age: 15
City: Pollachi

Sample Input: 2
Enter your name: Hariharan
Enter your age: -5
Invalid age. Please enter a positive number.
Enter your age: 15
Enter your city: Pollachi

Sample Output: 2
User Details:
Name: Hariharan
Age: 15
City: Pollachi

 * *
 * @package z_Lab
 * @author Dr. S. Sampath Kumar
 * @since 25-07-2025
 * @version 1.0
 */


package Z_Lab;
import java.util.*;

class UserDetails {
    
    String SName, SCity;
    int iAge;
    
    UserDetails(){

    }

    UserDetails(String name, int age, String city) {
        SName = name;
        iAge = age;
        SCity = city;
    }

    void displayDetails() {
        System.out.println("User Details:");
        System.out.println("Name: " + SName);
        System.out.println("Age: " + iAge);
        System.out.println("City: " + SCity);
    }   
}

public class Lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String SName,SCity;
        int iAge;
        System.out.println("Enter your name: ");
        SName = sc.nextLine();
        System.out.println("Enter your Age:");
        iAge = sc.nextInt();
        sc.nextLine();
        while (iAge < 0 | iAge >100) {   
            System.out.println("Pls enter a valid age:");
            iAge = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("Enter city:");
        SCity = sc.nextLine();
        SCity = SCity.trim().isEmpty()? null :SCity;        

        UserDetails user = new UserDetails(SName, iAge, SCity);
        user.displayDetails();
    }

}
