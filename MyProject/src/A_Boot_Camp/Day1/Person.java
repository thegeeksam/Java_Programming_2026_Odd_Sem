/**
* This file is part of the Boot Camp project.
* Program to demonstrate a simple Java class with attributes,
* a constructor, a method to print the object's data, and
* toString() method is overridden for readable output.
* Author: Dr. S. Sampath Kumar
* Date: 06-07-2025
* Version: 1.0
*/
package A_Boot_Camp.Day1;
class Data {
     // Attributes
    private String name;
    private int age;
    // Example of a variable with a non-English name
    private int ஜாவா; 
    
    // Default constructor
    public Data(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Data() {
    }
    // Method to print the object's data
    // Overriding toString() for readable output
    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " + age;
    }
    /*
     * Why Override toString()?
     * - It provides a human-readable representation of the object.
     * - Useful for debugging, logging, or displaying object details in UI.
     */
}
public class Person {

    // Main method to test the class
    public static void main(String[] args) {
        // Creating an object of Person
        Data person = new Data("Kumar", 18);

        // Printing the object's data
        System.out.println(person);
    }
}