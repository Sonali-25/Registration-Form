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

    public static void main(String[] args) {

        toCheckFirstName();
        toCheckLastName();
        scanner.close();

    }
}