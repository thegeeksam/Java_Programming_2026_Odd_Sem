/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * It is a "has-a" relationship, but with a stronger ownership.
 * * In this example, we will create a simple aggregation
 * * between two classes: `Department` and `Professor`.
 * * The `Department` class will have a list of `Professor` objects.
 * * This means that a `Department` can have multiple `Professor` objects,
 * * but the `Professor` objects can exist without the `Department`.
 * *
 * +------------------+       1     *       +------------------+
 * |   Department     |-------------------->|    Professor     |
 * +------------------+                     +------------------+
 * | - deptName       |                     | - name           |
 * | - professors     |                     +------------------+
 * +------------------+                     | +Professor(name) |
 * | +showProfessors()|                     +------------------+
 * +------------------+
 * *
 * @package II_Unit.Asso_Aggre_Comp
 * @author Dr. S. Sampath Kumar
 * @since 03-08-2025
 * @version 1.0
 */

package II_Unit.Asso_Aggre_Comp;

import java.util.Arrays;
import java.util.List;

class Professor {
    String name;
    Professor(String name) {
        this.name = name;
    }
}

class Department {
    String deptName;
    List<Professor> professors; // Aggregation
    // Professors exist outside the department. 
    // Department just holds references.
    Department(String deptName, List<Professor> professors) {
        this.deptName = deptName;
        this.professors = professors;
    }

    void showProfessors() {
        System.out.println("Department: " + deptName);
        for (Professor p : professors) {
            System.out.println("Professor: " + p.name);
        }
    }
}


public class B_AggregationDemo {
    public static void main(String[] args) {
        Professor p1 = new Professor("Ilayaraja");
        Professor p2 = new Professor("Yuvan Shankar Raja");

        List<Professor> profList = Arrays.asList(p1, p2);
        Department d = new Department("Music", profList);

        d.showProfessors();
    }

}
