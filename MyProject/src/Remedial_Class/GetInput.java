package Remedial_Class;

import java.util.Scanner;

public class GetInput {
    public static void main(String[] args) {
        Scanner one = new Scanner (System.in);
        System.out.println("User user enter some number: ");
        int a = one.nextInt();
        System.out.println("Enter Your Name: ");
        String name = one.next();
        System.out.println("You have entered: " + a);
        System.out.println("Your name is: " + name);
    }    
}
