package IV_Unit.ExceptionHandling;

import java.util.Scanner;

//User-defined exceptions are also referred to as custom exceptions. 
//The exceptions created per our use case and thrown using 
//the throw keyword are user-defined exceptions, 
//and such exceptions are derived classes of the Exception class from the java.lang package.

class CustomException extends Exception {
    // member variable to store our custom message
    String msg;

    CustomException(String msg) {
        // passing the parameter to the super class constructor
        super(msg);
        this.msg = msg;
    }

    /*
     * When we print an object of a java class, it prints the "hashCode" of
     * that object (default implementation of the toString() method). Overriding the
     * toString() method provides the flexibility to customize the print statement
     * when we print an object. Now that we've overridden the method with our custom
     * message, the user only needs to print the exception object to know the
     * exception message.
     */
    // overriding with our custom message
    // @Override
    // public String toString() {
    // return "Hello CSE!";
    // }
}

public class C_UserDefinedException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter User Name: ");
        String id = sc.next();
        System.out.println("Enter Password: ");
        String password = sc.next();
        try {
            if (id != "CSE" || password != "1234") {
                throw new CustomException("Invalid Credentials!");
            }
        } catch (CustomException e) {
            /*
             * Error message can be displayed using two methods:
             * 1. Override the toString() Method and Customize It with Our Exception
             * Message
             * 2. Pass the Exception Message to Super Class Constructor and
             * Retrieve It Using the getMesssage() Method
             */

            // prints message passed to the super constructor
            System.out.println(e);
            // System.out.println(e.getMessage());

            // calls override toString() method
            // System.out.println(e);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
