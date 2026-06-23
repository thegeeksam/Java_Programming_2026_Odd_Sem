/**
 ** This file is part of the Chumma project. 
 ** Accept 3 integers separated by a delimiter and print their values
 ** This is a placeholder class for Chumma.
 * @package src.Chumma;
 * @author Dr. S. Sampath Kumar
 * @since 23-07-2025
 * @version 1.0
 */
package src.Chumma;

import java.util.Scanner;
// This is a placeholder class for Chumma.

public class Chumma {
    public static void main(String[] args) {
        System.out.println("This is a placeholder class for Chumma.");
        Scanner scanner = new Scanner(System.in);
        int iA = scanner.nextInt();
        scanner.next().charAt(0);
        int iB = scanner.nextInt();
        scanner.next().charAt(0);
        int iC = scanner.nextInt();
        System.out.println("You entered: " + iA + ", " + iB + ", " + iC);
        scanner.close();
    }

}
