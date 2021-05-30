package com.magic.regex.test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;


import org.junit.jupiter.api.Assertions;

class RegistrationformTest {

     @Test
     public static void testFirstName() {
         RegistrationForm test = new RegistrationForm();
         boolean output = test.CheckFirstName("Sonali");
         Assertions.assertEquals(true, output);
     }

     @Test
     public static void testLastName() {
         RegistrationForm test = new RegistrationForm();
         boolean output = test.CheckLastName("Ranjan");
         Assertions.assertEquals(true, output);
     }

     @Test
     public static void testEmail() {
         RegistrationForm test = new RegistrationForm();
         boolean output = test.CheckEmail("abc.12bc@yahoo.com");
        Assertions.assertEquals(true, output);
     }

     @Test
     public  static void testPhoneNumber() {
         RegistrationForm test = new RegistrationForm();
         boolean output = test.CheckMobileNumber("91 8203057282");
         Assertions.assertEquals(true, output);
     }

     @Test
     public static void testPassword() {
         RegistrationForm test = new RegistrationForm();
         boolean output = test.CheckPassword("Random123@");
        Assertions.assertEquals(true, output);
     }

     public static void main(String[] args) {
         testFirstName();
         testLastName();
         testEmail();
         testPhoneNumber();
         testPassword();
     }

 }
