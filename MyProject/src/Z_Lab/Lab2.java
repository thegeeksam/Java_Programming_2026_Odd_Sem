/**
 * * This file is part of the Java Programming Laboratory project.
 * *
 * * ----> Employee Hierarchy with Inheritance & Polymorphism <-----
 * * >>>>>Problem Statement<<< * Design a class hierarchy in Java to represent
 * different types of employees in a company. * All employees share common
 * attributes and behaviors, but specific roles like Manager and Developer have
 * specialized methods. * Your task is to: * - Create a base class Employee with
 * common fields like name, id, and a method 'calculateSalary()' * - Create
 * subclasses Manager and Developer that inherit from Employee. * - Override the
 * 'calculateSalary()' method in each subclass to reflect role-specific logic. *
 * - Add specialized methods: * - Manager: conductMeeting() * - Developer:
 * writeCode() * - Use polymorphism to call 'calculateSalary()' on different
 * employee types. * * Sample Input: * Enter employee type (Manager/Developer):
 * Developer * Enter name: Arjun * Enter ID: 102 * Enter base salary: 50000 * *
 * * Expected Output: * Employee Type: Developer * Name: Arjun * ID: 102 *
 * Calculated Salary: 55000.0 * Developer is writing code... * @package
 * II_Unit.Z_Lab
 * @author Dr. S. Sampath Kumar
 * @since 07-08-2025
 * @version 1.0
 */
package Z_Lab;

import java.util.Scanner;

class Employee {

    String sName;
    int id;
    double baseSalary;

    Employee(String sName, int id, double baseSalary) {
        this.sName = sName;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    double calculateSalary() {
        return baseSalary;
    }

    void displayDetails() {
        System.out.println("Name: " + sName);
        System.out.println("ID: " + id);
    }
}

class Manager extends Employee {

    Manager(String sName, int id, double baseSalary) {
        super(sName, id, baseSalary);
    }

    @Override
    double calculateSalary() {
        return baseSalary + 10000; // Manager bonus
    }

    void conductMeeting() {
        System.out.println("Manager is conducting a meeting...");
    }
}

class Developer extends Employee {

    Developer(String sName, int id, double baseSalary) {
        super(sName, id, baseSalary);
    }

    @Override
    double calculateSalary() {
        return baseSalary + 5000; // Developer bonus
    }

    void writeCode() {
        System.out.println("Developer is writing code...");
    }
}

public class Lab2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee type (Manager/Developer): ");
        String type = sc.nextLine();

        System.out.print("Enter name: ");
        String sName = sc.nextLine();

        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        System.out.print("Enter base salary: ");
        double salary = sc.nextDouble();

        Employee emp;

        if (type.equalsIgnoreCase("Manager")) {
            emp = new Manager(sName, id, salary);
        } else {
            emp = new Developer(sName, id, salary);
        }

        System.out.println("\nEmployee Type: " + type);
        emp.displayDetails();
        System.out.println("Calculated Salary: " + emp.calculateSalary());

        // Polymorphic behavior with downcasting
        if (emp instanceof Manager) {
            // emp.conductMeeting(); //Error! Employee doesn't have conductMeeting()
            ((Manager) emp).conductMeeting();
        } else if (emp instanceof Developer) {
            // emp.writeCode();
            ((Developer) emp).writeCode();
        }
    }
}
