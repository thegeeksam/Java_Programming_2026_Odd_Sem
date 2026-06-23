
/**
 * This class demonstrates the use of variables in Java.
 * It includes a class-level variable and a method-level variable,
 * both of which are of type String.
 */

package A_Boot_Camp.Day1;
public class Variable {
    /**
     * Class-level variable 'name' initialized to "Hari".
     * This variable can be accessed by all methods in this class.  
     */
    String name = "Hari"; // String variable
    /**
     * This method prints a greeting message using the class-level variable 'name'.
     */
    void main(String[] args) {
        /**
         * Main method: Entry point of the program.
         * This method demonstrates the use of method-level variables.
         */
        String name = "Kumar"; // String variable
        System.out.println("Hello, " + name + "!"); // Print the variable

    }


}
