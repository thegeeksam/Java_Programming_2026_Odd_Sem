/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * Read-Only Access - Using final keyword to create read-only fields
 * *
 * * This Java snippet illustrates:
 * * - Declaring a class Student with a final variable iRegisterNumber
 * * - Demonstrating read-only access by providing only a getter method
 * *
 * @package II_Unit.Encapsulation;
 * @author Dr. S. Sampath Kumar
 * @since 09-07-2026
 * @version 1.0
 */

package II_Unit.Encapsulation;

class Student1 {
    private final int iRegisterNumber;

    Student1(int iRegisterNumber) {
        this.iRegisterNumber = iRegisterNumber;
    }

    // Getter only
    public int getRegisterNumber() {
        return iRegisterNumber;
    }
}

public class D_ReadOnly {
    public static void main(String[] args) {
        Student1 objStudent = new Student1(101);
        // Reading is allowed
        System.out.println("Register Number: " + objStudent.getRegisterNumber());
        // No setter is available to modify it
        // objStudent.setRegisterNumber(202);
    }
}