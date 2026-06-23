package A_Boot_Camp.Day1;
/*
 *  "==" operator and  equals() method are used to test equality 
 * between 2 variables. While "==" compares object memory locations, 
 * equals(), defined in the Object class, can be customized for 
 * comparing object contents. 
 * 
 * we need to override the hashCode() method if we are overriding 
 * the equals() method to avoid breaking the contract. If 2 objects 
 * when compared with the equals() method are equal then their 
 * hashCode must also be the same.
 * 
 */


public class Equals {
    private String name;
    private int age;

    // Constructor
    public Equals (String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Overriding equals() to compare content
    @Override
    public boolean equals(Object obj) {
        // Check if the same reference
        if (this == obj) return true;

        // Check if obj is an instance of Person
        if (obj == null || getClass() != obj.getClass()) return false;

        // Typecast and compare fields
        Person other = (Person) obj;
        return this.age == other.age && this.name.equals(other.name);
    }

    // Optional: Override toString() for display
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }

    // Main method to test
    public static void main(String[] args) {
        Equals p1 = new Equals("Kumar", 18);
        Equals p2 = new Equals("Kumar", 18);
        Equals p3 = new Equals("Arun",19);

        System.out.println("p1 equals p2? " + p1.equals(p2)); // true
        System.out.println("p1 equals p3? " + p1.equals(p3)); // false
    }
}