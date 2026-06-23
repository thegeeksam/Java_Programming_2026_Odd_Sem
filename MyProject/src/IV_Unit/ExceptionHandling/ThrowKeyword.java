package IV_Unit.ExceptionHandling;

import java.util.Scanner;

/*
 * throw keyword is used to explicitly throw an exception.
 * We can throw either checked or unchecked exception in 
 * java by throw keyword. 
 * throw keyword is mainly used to throw "custom exception".
 */
public class ThrowKeyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age: ");
        int age = sc.nextInt();
        // if (age < 18) {
        //     throw new IllegalArgumentException("Access Denied - You must be at least 18 years old.");
        // } else {
        //     System.out.println("Access Granted - You are old enough!");
        // }
        // System.out.println("Enter Age again: ");
        // age = sc.nextInt();
        try {
            if (age < 18) {
                throw new IllegalArgumentException("Access Denied - You must be at least 18 years old.");
            } else {
                System.out.println("Access Granted - You are old enough!");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
        finally {
            sc.close();
            System.out.println("Hello HariPriyan!");
        }
    }
}
