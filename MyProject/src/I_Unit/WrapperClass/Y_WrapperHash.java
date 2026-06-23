/**
 * * This file is part of the Java Programming Lecture project.
 * * 
 * * This program demonstrates the usage of hash codes in wrapper classes.
 * *
 * * In Java, every object has a hash code that can be used for hashing
 * * purposes, such as in hash-based collections like HashMap and HashSet.
 * *
 * * The hash code of an object can be obtained using the hashCode() method,
 * * and the identity hash code can be obtained using System.identityHashCode().
 * *
 * * The hash code is an integer value that is used to identify objects in hash-based
 * * collections. The identity hash code is a unique identifier for the object,
 * * regardless of the implementation of the hashCode() method in the class.
 * *
 * * Golden Rule 
 * * Method	                   Meaning
 * * hashCode()	                 - Logical hash defined by the class
 * * System.identityHashCode()	 - JVM identity hash of the actual object
 * *
 * @package I_UnitW
 * @author Dr. S. Sampath Kumar
 * @since 17-06-2026
 * @version 1.0
 */
package I_Unit.WrapperClass;

public class Y_WrapperHash {
        public static void main(String[] args) {
                Integer iObjNum1 = new Integer(77);

                System.out.println("Value Hash      : "
                                + iObjNum1.hashCode());

                System.out.println("Object Hash     : "
                                + System.identityHashCode(iObjNum1));

                System.out.println("Object Hex Hash : "
                                + Integer.toHexString(
                                                System.identityHashCode(iObjNum1)).toUpperCase());
        }

}
