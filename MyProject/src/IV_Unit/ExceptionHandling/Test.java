package IV_Unit.ExceptionHandling;

import java.util.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String args[]) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        User user = null;
        String name = null;
        String mailId = null;
        Integer age = null;
        int flag = 1;
        do {
            System.out.println("Enter the name:");
            try {
                name = br.readLine();
                if (Integer.parseInt(name) > 0) {
                    throw new IOException();
                }
                flag = 2;
            } catch (IOException e) {
                System.out.println("Expecting String Values");
                flag = 1;
            } catch (NumberFormatException e) {
                flag = 2;
            }
        } while (flag == 1);
        System.out.println("Enter the mailId:");
        try {
            mailId = br.readLine();
        } catch (IOException ioe) {
            System.out.println("IOException Occurred");
        } catch (Exception e) {
            System.out.println("Exception Occurred");
        }

        flag = 1;
        do {
            try {
                System.out.println("Enter the age:");
                age = Integer.valueOf(br.readLine());
                flag = 2;
            } catch (NumberFormatException nfe) {
                System.out.println("Expecting an Integer value");
                flag = 1;
            } catch (IOException ioe) {
                System.out.println("IOE xception Occured");
                flag = 1;
            } catch (Exception e) {
                System.out.println("Exception Occured");
                flag = 1;
            }

        } while (flag == 1);
        user = new User(name, mailId, age);
        System.out.println("Name : " + user.getName());
        System.out.println("Mail ID :" + user.getMailId());
        System.out.println("Age : " + user.getAge());

        try {
            br.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

}
