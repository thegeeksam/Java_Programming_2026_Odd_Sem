/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * This file demonstrates Association in Java.
 * *
 * * Association = Two independent objects know, use, or 
 * * interact with each other without strong ownership.
 * *
 * * In this example, a Student object interacts with a Faculty
 * * object by receiving it as a method parameter.
 * * 
 * * Both Doctor and Patient objects can exist independently.
 * * 
 * * Relationship:
 * * +------------+       treats         +------------+
 * * |   Doctor   | -------------------> |  Patient   |
 * * +------------+                      +------------+
 * * |  sName     |                      |  sName     |
 * * +------------+                      +------------+
 * * |  treat()   |
 * * +------------+
 * * 
 * @package II_Unit.Asso_Aggre_Comp
 * @author Dr. S. Sampath Kumar
 * @since 14-07-2026
 * @version 1.0
 */
package II_Unit.Asso_Aggre_Comp;

class Patient {
    String sName;

    Patient(String sName) {
        this.sName = sName;
    }
}

class Doctor {
    String sName;

    Doctor(String sName) {
        this.sName = sName;
    }

    // Association:
    // Doctor interacts with Patient through method parameter
    void treat(Patient objPatient) {
        // Patient is received only as method parameter
        // during the interaction, demonstrating association.
        // Not permanently linked to the Student object.
        System.out.println("Dr. " + sName +
                " is treating patient " + objPatient.sName);
    }

}

public class A_Association {
    public static void main(String[] args) {
        // Both objects are created independently
        Doctor objDoctor = new Doctor("Arun");

        Patient objPatient = new Patient("Vijay");

        // Doctor interacts with Patient
        objDoctor.treat(objPatient);
    }
}