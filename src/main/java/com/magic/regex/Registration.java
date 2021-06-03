package com.magic.regex;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Registration {
    public boolean checkFirstName(){
        try{
            Scanner sc = new Scanner(System.in);
            String read = "[A-Z][a-z]{3,}";
            System.out.println("Enter First Name");
            String firstname = sc.next();
            Pattern pattern= Pattern.compile(read);
            Matcher match = pattern.matcher(firstname);
            boolean result = match.matches();
            return (result);
        }
        catch(Exception e) {
            return false;
        }
    }
    public boolean checkLastName(){
        try{
            Scanner sc = new Scanner(System.in);
            String read = "[A-Z][a-z]{3,}";
            System.out.println("Enter Last Name");
            String lastname = sc.next();
            Pattern pattern = Pattern.compile(read);
            Matcher match = pattern.matcher(lastname);
            boolean result = match.matches();
            return (result);
        }
        catch(Exception e) {
            return false;
        }
    }
    public boolean checkEmail(){
        try{
            Scanner sc = new Scanner(System.in);
            String read =  "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)[@][0-9A-Za-z]+([.][a-zA-Z]{2,4})$";
            System.out.println("Enter Email");
            String email = sc.next();
            Pattern pattern = Pattern.compile(read);
            Matcher match = pattern.matcher(email);
            boolean result = match.matches();
            return (result);
        }
        catch(Exception e) {
            return false;
        }
    }
    public boolean checkMobileNumber(){
        try{
            Scanner sc = new Scanner(System.in);
            String read = "^[0-9]{2}[ ][0-9]{10}$";
            System.out.println("Enter Mobile Number");
            String mobileNumber = sc.next();
            Pattern pattern = Pattern.compile(read);
            Matcher match = pattern.matcher(mobileNumber);
            boolean result = match.matches();
            return (result);
        }
        catch(Exception e) {
            return false;
        }
    }
    public boolean checkPassword(){
        try{
            Scanner sc = new Scanner(System.in);
            String read =  "^(?=.[a-z])(?=.[A-Z])(?=.\\d)(?=.[@$!%?&])[A-Za-z\\d@$!%?&]{8,}$";
            System.out.println("Enter Password");
            String password = sc.next();
            Pattern pattern = Pattern.compile(read);
            Matcher match = pattern.matcher(password);
            boolean result = match.matches();
            return (result);
        }
        catch(Exception e) {
            return false;
        }
    }

    public static void main(String[] args) {
        Registration register = new Registration();
        System.out.println(register.checkFirstName());
        System.out.println(register.checkLastName());
        System.out.println(register.checkEmail());
        System.out.println(register.checkMobileNumber());
        System.out.println(register.checkPassword());
        
    }
}
