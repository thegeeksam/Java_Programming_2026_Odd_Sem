/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * This file demonstrates the concept of association in Java.
 * * This demonstrates how one class can associate with another class.
 * *
 * * Association is a relationship between two classes where
 * * one class uses or interacts with another class.
 * *
 * * It is a "has-a" relationship, meaning one class has a reference
 * * to another class.
 * * In this example, we will create a simple association
 * * between two classes: `Teacher` and `Student`.
 * * The `Student` class will have a `Teacher` object as a member variable.
 * *
 * +-----------+       uses       +-----------+
 * |  Student  |----------------->|  Teacher  |
 * +-----------+                  +-----------+
 * | - name    |                  | - name    |
 * | - teacher |                  | +teach()  |
 * +-----------+                  +-----------+
 * | +learn()  |
 * +-----------+

 * @package II_Unit.Asso_Aggre_Comp
 * @author Dr. S. Sampath Kumar
 * @since 03-08-2025
 * @version 1.0
 */
package II_Unit.Asso_Aggre_Comp;

class Teacher {
    String name;

    void teach() {
        System.out.println(name + " is teaching.");
    }
}

class Student {

    String name;
    // This line declares a reference variable named teacher of type Teacher. 
    // It does not create a new Teacher object. 
    // Instead, it allows the Student to have a relationship with a Teacher.
    Teacher teacher; // Association - Student has a Teacher
    // Student and Teacher are linked, but neither owns the other.
    // They can exist separately.

    /*
    * * What If You Write Teacher teacher = new Teacher(); Inside the Student Class?
    * *
    * * That would mean every student creates their own teacher,
    * * which breaks the idea of shared association. It’s like saying:
    * * “Every student hires their own teacher clone.” 
    * *
    * * This is not practical because it leads to memory inefficiency and redundancy.
    * * In real life, multiple students can learn from the same teacher.
    * * So, if we wrote Teacher teacher = new Teacher(); inside the Student class,
    * * each student would have their own separate teacher object.
    * * This would mean that if we had 100 students, 
    * * we would have 100 separate Teacher objects,
    * * which is not efficient or realistic.
    * * Instead, by using just Teacher teacher;, we allow multiple students to share the same teacher, which is more realistic and memory-efficient.
     */
    void learn() {
        System.out.println(name + " is learning from " + teacher.name);
    }
}

public class A_AssociationDemo {

    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.name = "Mr. ABC";

        Student s = new Student();
        s.name = "JAISURYA S";
        s.teacher = t; // Establishing association with the Teacher object

        s.learn(); // Output: JAISURYA S is learning from Mr. ABC
    }
}