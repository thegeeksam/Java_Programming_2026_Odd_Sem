package III_Unit.Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

//class Student implements Comparable<Student>
class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        // return "Student [age = " + age + ", name = " + name + " ]";
        return "[age = " + age + ", name = " + name + " ]";
    }

    // public int CompareTo(Student that)
    // {
        // if(this.age > that.age)
        //      return 1;
        // else
        //      return -1;
    // }
}

public class ComparatorStr {
    public static void main(String[] args) {
        List<Student> alStuds = new ArrayList<>();
        alStuds.add(new Student(19, "Harish"));
        alStuds.add(new Student(20, "Asif"));
        alStuds.add(new Student(18, "Abdul Kareem"));
        alStuds.add(new Student(17, "Manoj Kumar"));

        System.out.println("Student Details Before Sorting: ");
        // Collections.sort(studs);
        for (Student s : alStuds)
            System.out.println(s);

        // Using anonymous class
        Comparator<Student> com = new Comparator<Student>()
        {
            public int compare(Student i,Student j)
            {
                if(i.age > j.age)
                    return 1;
                else
                    return -1;
            }
        };

        // Using lambda expression
        // Comparator<Student> com = (i, j) -> i.age > j.age ? 1 : -1;
        // Interface ------ Object = (parameters) -> expression

        // Comparator calling
        Collections.sort(alStuds, com);
        System.out.println("Sorted Content (Based on Age): ");
        for (Student s : alStuds)
            System.out.println(s);

        Comparator<Student> nameLengthComparator = new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.name.length(), s2.name.length());
            }
        };
        
        System.out.println("Sorted Content (Based on Name Length): ");
        for (Student s : alStuds)
            System.out.println(s);
    }
}