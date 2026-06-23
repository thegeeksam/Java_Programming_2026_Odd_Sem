/**
 * * This file is part of the Java Programming Laboratory project.
 * *
 * * >>>Designing a Personalized Art Certificate System:<<<
 * * Riya, a freelance graphic designer, tracks her client 
 * * projects using a simple system. Each project has a 
 * * title, client name, number of design revisions, and a 
 * * fixed base fee. If the number of revisions exceeds 3, 
 * * she charges ₹500 per extra revision.

 * * Design a class ProjectInvoice with the following:
 * * - Instance variables: title, clientName, numRevisions, baseFee
 * * - Constructor to initialize all fields
 * * - Method calculateTotalFee() that returns the total fee based on the revision logic
 * * - Method getProjectSummary() that returns a formatted String like:
 * * "Client: ABC Corp | Project: Logo Design | Total Fee: ₹7500"
 * * Write a test class ProjectInvoiceTest to create two project objects and display their summaries.
 * *
 * @package Z_Lab
 * @author Dr. S. Sampath Kumar
 * @since 28-08-2025
 * @version 1.0
 */
package Z_Lab;
import java.util.Scanner;

class ProjectInvoice {
    private String title;
    private String clientName;
    private int numRevisions;
    private double baseFee;

    public ProjectInvoice(String title, String clientName, int numRevisions, double baseFee) {
        this.title = title;
        this.clientName = clientName;
        this.numRevisions = numRevisions;
        this.baseFee = baseFee;
    }

    public double calculateTotalFee() {
        int extraRevisions = numRevisions > 3 ? numRevisions - 3 : 0;
        return baseFee + (extraRevisions * 500);
    }

    public String getProjectSummary() {
        return "Client: " + clientName + " | Project: " + title + " | Total Fee: ₹" + (int)calculateTotalFee();
    }
}

public class ProjectInvoiceTest {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of projects:");
        int iCount = sc.nextInt();
        
        while (iCount > 0){
        System.out.println("Enter details for Project 1:");
        System.out.print("Project Title: ");
        String title1 = sc.nextLine();

        System.out.print("Client Name: ");
        String client1 = sc.nextLine();

        System.out.print("Number of Revisions: ");
        int revisions1 = sc.nextInt();

        System.out.print("Base Fee (in Rs.): ");
        double fee1 = sc.nextDouble();
        sc.nextLine(); // consume newline

        ProjectInvoice p1 = new ProjectInvoice(title1, client1, revisions1, fee1);
        iCount--;
        }

        // Display summaries
        System.out.println("\n--- Project Summaries ---");
        System.out.println(p1.getProjectSummary());
        System.out.println(p2.getProjectSummary());

        sc.close();
    }
}
