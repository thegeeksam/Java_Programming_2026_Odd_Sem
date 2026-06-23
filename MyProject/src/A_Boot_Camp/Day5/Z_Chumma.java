/**
 * * This file is part of the Boot Camp project.
 * * File created for experimenting with polymorphism.
 * * Ignore this file 

 * @package A_Boot_Camp.Day5
 * @author Dr. S. Sampath Kumar
 * @since 10-07-2025
 * @version 1.0
 */
package A_Boot_Camp.Day5;

class Shapes {
  public void area() {
    System.out.println("The formula for area of ");
  }
}
class Triangle extends Shapes {
  public void area() {
    System.out.println("Triangle is: 0.5 * base * height ");
  }
}
class Circle extends Shapes {
  public void area() {
    System.out.println("Circle is: 3.14 * radius * radius ");
  }
}
public class Z_Chumma {
  public static void main(String[] args) {
    Shapes myShape = new Shapes();  // Create a Shapes object
    Shapes myTriangle = new Triangle();  // Create a Triangle object
    Shapes myCircle = new Circle();  // Create a Circle object
    myShape.area();
    myTriangle.area();
    myShape.area();
    myCircle.area();
  }
}