/**
 * * This file is part of the Java Programming Lecture project.
 * * It demonstrates the concept of Instance Initializer Blocks in Java. 
 * * An instance initializer block is a block of code that runs every time 
 * * an object is created, right after field initializations and
 * * before the constructor is executed.
 * 
 * * Here’s the order during object creation:
 * * - Memory allocated
 * * - Default values assigned
 * * - Instance Initializer Block runs
 * * - Constructor runs
 * * That makes it more powerful than constructor-only logic, 
 * * especially in complex initialization cases.
 * @package II_Unit.Inheritance
 * @author Dr. S. Sampath Kumar
 * @since 03-08-2025
 * @version 1.0
 */
package II_Unit.Inheritance;

class Country {
    // Constructor
    Country() {
        System.out.println("Default country assigned: India");
    }

}

class Citizen extends Country {
    int voterId;
    String region;
    // Instance initializer block
    {
        region = "Pollachi";
    }

    // Constructor
    Citizen() {
        // System.out.println("Default region assigned:" + region);
        System.out.println("Citizen object created.");
    }
    // region = "Coimbatore";
    // Overloaded constructor
    // This constructor will be called when a voter ID is provided
    public Citizen(int id) {
        // System.out.println("Default region assigned:" + region);
        voterId = id;
        System.out.println("Voter ID assigned: " + voterId);
    }

    void showDetails() {
        System.out.println("Region: " + region + ", Voter ID: " + voterId);
    }

}

public class G_InitializerBlock {
    public static void main(String args[]) {
        Citizen c1 = new Citizen(101);
        c1.showDetails();
        System.out.println();

        Citizen c2 = new Citizen();
        c2.showDetails();
    }
}

/*
In the above example, it seems that the instance initializer block 
is invoked first, but NO. The instance initializer block is invoked
at the time of object creation. The Java compiler copies the 
instance initializer block in the constructor after the 
first statement super(). So firstly, the constructor is invoked. 
*/
