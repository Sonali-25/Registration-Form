package com.magic.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class registrationform {
    public static Scanner scanner = new Scanner(System.in);
    public static void toCheckFirstName() {

        String firstName;
        System.out.println("Enter First Name: ");
        firstName = scanner.next();

        if (Pattern.matches("[A-Z]{1}[a-zA-Z]{2,}$", firstName)) {
            System.out.println("Valid");
        }
        else {
            System.out.println("Invalid");
        }

    }
    public static void toCheckLastName() {

        String lastName;
        System.out.println("Enter Last Name: ");
        lastName = scanner.next();

        if (Pattern.matches("[A-Z]{1}[a-zA-Z]{2,}$", lastName)) {
            System.out.println("Valid");
        }
        else {
            System.out.println("Invalid");
        }

    }
    public static void toCheckMobile() {
        String mobile;
        System.out.println("Enter mobile number in format 91 1234567899");
        mobile = scanner.nextLine();
        if (Pattern.matches("\\d{2}[ ][1-9]{1}\\d{9}", mobile)) {
            System.out.println("Valid.");
        }
        else {
            System.out.println("Invalid.");
        }
    }

    public static void main(String[] args) {

        toCheckFirstName();
        toCheckLastName();
        toCheckMobile();
        scanner.close();

    }
}