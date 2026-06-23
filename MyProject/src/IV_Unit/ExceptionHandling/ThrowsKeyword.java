package IV_Unit.ExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOError;
import java.util.Scanner;

/*
 * throws keyword is used to declare an exception. 
 * It gives an information to the programmer that there 
 * may occur an exception, so it is better for the programmer
 * to provide the exception handling code,
 * so that normal flow can be maintained.
 * 
 * Exception Handling is mainly used to handle the checked exceptions. 
 * 
 * If there occurs any unchecked exception such as 
 * "IndexOutOfBoundException",it is programmers fault that 
 * he is not performing check up before the code being used.
 */

public class ThrowsKeyword {
    static void Age() throws FileNotFoundException,IllegalAccessException, StackOverflowError {
        // reading a file which is not available
        FileReader file = new FileReader("somefile.txt");
    }

    public static void main(String[] args) {

        try {
            Age();
        } catch (FileNotFoundException e) {
            // catch block
            System.out.println(e);
        }

    }
}
