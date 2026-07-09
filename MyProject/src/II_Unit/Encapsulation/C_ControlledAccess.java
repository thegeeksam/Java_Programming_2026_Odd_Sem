/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * Controlled Access - Using private access modifier to restrict direct access
 * *
 * * This Java snippet illustrates:
 * * - Declaring a class Student with a private variable iMark
 * * - Demonstrating controlled access by providing setter and getter methods
 * *
 * Package: II_Unit.Encapsulation
 * @author Dr. S. Sampath Kumar
 * @since 09-07-2026
 * @version 1.0
 */

package II_Unit.Encapsulation;

class Student {
    private int iMark;

    // Controlled setter method
    public void setMark(int iMark) {
        if (iMark >= 0 && iMark <= 100) {
            this.iMark = iMark;
            System.out.println("Mark updated successfully!");
        } else {
            System.out.println("Invalid mark! Enter a value from 0 to 100.");
        }
    }

    // Getter method
    public int getMark() {
        return iMark;
    }
}

public class C_ControlledAccess {
    public static void main(String[] args) {
        Student objStudent = new Student();
        // Invalid value
        objStudent.setMark(-50);
        // Valid value
        objStudent.setMark(85);
        System.out.println("Student Mark: " + objStudent.getMark());
    }
}
