/**
 * * This file is part of the Boot Camp project.
 * * This class demonstrates the use of an array of objects in Java
 * * This class defines a Student class and creates an array 
 * * of Student objects.
 * * It shows how to declare, allocate, and initialize an array of objects.
 * * The Student class has a constructor that prints the student's ID and name.
 * * The main method creates an array of Student objects and initializes them.
 * @package A_Boot_Camp.Day4 
 * @author Dr. S. Sampath Kumar
 * @since 09-07-2025
 * @version 1.0
 * */
package A_Boot_Camp.Day4;

class Student {
  double d;
  Student(int id, String name) {
    System.out.println("Student ID: "+ id + "\nName: "+ name + d );
  }
}

public class D_ArrayObject {
  public static void main (String[] args) {
    // declaring an array of Object
    // lazy initialization: -  array is declared first, objects added later
    Student obj[] = new Student[3];
    
    obj[0] = new Student(96,"Jenitha");
    obj[1] = new Student(112,"Kavipriya");
    obj[2] = new Student(119,"Kowsalya");
  }
}