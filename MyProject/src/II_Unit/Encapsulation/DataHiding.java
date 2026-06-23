/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * Data Hiding - Using private access modifier to restrict direct access
 * *
 * * This Java snippet illustrates:
 * * - Declaring a class Employee with private variables (name, age, salary)
 * * - Demonstrating encapsulation (though no getters/setters are provided)
 * * - Showing data hiding by restricting direct access to field
 * *
 * @package II_Unit.Encapsulation;
 * @author Dr. S. Sampath Kumar
 * @since 21-08-2025
 * @version 1.0
 */

package II_Unit.Encapsulation;
class Employee {
    // private variables
    // Data Hiding
    private String name = "Madhumitha";
    private int age = 18;
}

public class DataHiding {

    public static void main(String[] args) {
    //object of class Employee
    Employee emp = new Employee();
    System.out.println(emp.name);
    }
}
