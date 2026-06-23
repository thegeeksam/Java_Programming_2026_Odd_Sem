/**
 * * This file is part of the Java Programming Lecture project
 * *
 * * This Java snippet illustrates:
 * * - Implements the Set interface: stores unique elements only
 * * - Maintains insertion order: unlike HashSet, it remembers the order of insertion
 * * - Allows one null value
 * * 
 * @package II_Unit.Collection_Generic.MapInterface;
 * @author Dr. S. Sampath Kumar
 * @since 08-09-2025
 * @version 2.0
 */

package III_Unit.Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// class Student implements Comparable<Student> {
class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age= " + age + ", name= " + name + "]";
    }

    public int CompareTo(Student that) {
        if (this.age > that.age)
            return 1;
        else
            return -1;
    }
}

public class ComparableEx1 {
    public static void main(String[] args) {
        List<Student> studs = new ArrayList<>();

        Comparator<Student> com = new Comparator<Student>() {
            public int compare(Student i, Student j) {
                return i.age > j.age ? 1 : -1;
            }
        };
        // Comparator<Student> com = (i, j) -> i.age > j.age ? 1 : -1;

        studs.add(new Student(19, "Harish"));
        studs.add(new Student(20, "Asif"));
        studs.add(new Student(18, "Abdul Kareem"));
        studs.add(new Student(17, "Manoj Kumar"));

        // for (Student s : studs)
        // System.out.println(s);

        Collections.sort(studs, com);
        for (Student s : studs)
            System.out.println(s);
    }
}