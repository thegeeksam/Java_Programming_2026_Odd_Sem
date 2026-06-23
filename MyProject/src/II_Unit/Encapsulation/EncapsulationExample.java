/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * Encapsulation - Wrapping data (fields) and methods together in a class
 * * Bundling data (length, breadth) and behavior (getPerimeter) inside a class
 * *
 * * This Java snippet illustrates:
 * * - Defines a class Perimeter with two instance variables: length and breadth
 * * - Uses a constructor to initialize these variables
 * * - Provides a method getPerimeter() to calculate and print the perimeter
 * * - The main() method creates an object of Perimeter with values 3 and 6, 
 * *   and calls the method to display the result
 * *
 * @package II_Unit.Encapsulation;
 * @author Dr. S. Sampath Kumar
 * @since 21-08-2025
 * @version 1.0
 */

package II_Unit.Encapsulation;

class Perimeter {
  // Instance variables
  int iLength;
  int iBreadth;

  Perimeter(int iLength, int iBreadth) {
    this.iLength = iLength;
    this.iBreadth = iBreadth;
  }

  public void getPerimeter() {
    int perimeter = 2 * (iLength + iBreadth);
    System.out.println("Perimeter of Rectangle : " + perimeter);
  }
}

public class EncapsulationExample {
  public static void main(String[] args) {

  Perimeter rectangle = new Perimeter(3, 6);
    rectangle.getPerimeter();
  }
}