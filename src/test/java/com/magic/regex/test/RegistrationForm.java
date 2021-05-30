package com.magic.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistrationForm {
    public static boolean CheckFirstName(String firstName) {
        String read = "[A-Z][a-z]{3,}";
        String text = firstName;
        Pattern pattern = Pattern.compile(read);
        Matcher match = pattern.matcher(text);
        boolean result = match.matches();
        return (result);
    }

    public static boolean CheckLastName(String lastName) {
        String read = "[A-Z][a-z]{3,}";
        String text = lastName;

        Pattern pattern = Pattern.compile(read);
        Matcher match = pattern.matcher(text);

        boolean result = match.matches();
        return (result);
    }

    public static boolean CheckEmail(String Email) {
        String read = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)[@][0-9A-Za-z]+([.][a-zA-Z]{2,4})$";
        String text = Email;

        Pattern pattern = Pattern.compile(read);
        Matcher match = pattern.matcher(text);

        boolean result = match.matches();
        return (result);
    }

    public static boolean CheckMobileNumber(String Number) {
        String read = "^[0-9]{2}[ ][0-9]{10}$";
        String text = Number;

        Pattern pattern = Pattern.compile(read);
        Matcher match = pattern.matcher(text);

        boolean result = match.matches();
        return (result);
    }

    public static boolean CheckPassword(String Password) {
        String read = "^(?=.[a-z])(?=.[A-Z])(?=.\\d)(?=.[@$!%?&])[A-Za-z\\d@$!%?&]{8,}$";
        String text = Password;

        Pattern pattern = Pattern.compile(read);
        Matcher match = pattern.matcher(text);

        boolean result = match.matches();
        return (result);
    }


    public static void main(String[] args) {
        System.out.println(CheckFirstName("Sonali"));
        System.out.println(CheckLastName("Ranjan"));
        System.out.println(CheckEmail("abc.12bc@yahoo.com"));
        System.out.println(CheckMobileNumber("91 8203057282"));
        System.out.println(CheckPassword("sona123!JHa.@ss"));


    }
}
