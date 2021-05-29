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
            System.out.println("Valid First Name");
        }
        else {
            System.out.println("Invalid First Name");
        }

    }

    public static void main(String[] args) {

        toCheckFirstName();
        scanner.close();

    }
}