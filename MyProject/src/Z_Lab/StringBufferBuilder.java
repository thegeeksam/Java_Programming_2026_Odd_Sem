package Z_Lab;

import java.util.Scanner;

public class StringBufferBuilder {
        public static void main(String[] args) {

                Scanner objScanner = new Scanner(System.in);

                /*
                 * -------------------------------
                 * Part A - String
                 * -------------------------------
                 */

                String sCollegeName = "Sri Eshwar College of Engineering";

                System.out.print("Enter Register Number : ");
                String sRegisterNumber = objScanner.nextLine();

                System.out.print("Enter Student Name    : ");
                String sStudentName = objScanner.nextLine();

                System.out.print("Enter Department      : ");
                String sDepartment = objScanner.nextLine();

                /*
                 * -------------------------------
                 * Part B - StringBuilder
                 * -------------------------------
                 */

                String sLastThreeDigits = sRegisterNumber.substring(sRegisterNumber.length() - 3);

                StringBuilder objStudentID = new StringBuilder();

                objStudentID.append("SECE");
                objStudentID.append("-");
                objStudentID.append(sDepartment.toUpperCase());
                objStudentID.append("-");
                objStudentID.append(sLastThreeDigits);

                /*
                 * -------------------------------
                 * Part C - StringBuffer
                 * -------------------------------
                 */

                StringBuffer objIDCard = new StringBuffer();

                objIDCard.append("\n");
                objIDCard.append("*******************************\n");
                objIDCard.append("\tSTUDENT ID CARD\t\n");
                objIDCard.append("*******************************\n");
                objIDCard.append("College      : ").append(sCollegeName).append("\n");
                objIDCard.append("Student Name : ").append(sStudentName).append("\n");
                objIDCard.append("Department   : ").append(sDepartment.toUpperCase()).append("\n");
                objIDCard.append("Student ID   : ").append(objStudentID);

                // Display
                System.out.println(objIDCard);

                // objScanner.close();
        }
}