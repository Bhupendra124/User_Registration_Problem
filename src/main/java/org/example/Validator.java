package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Validator {

    public static void main(String[] args) {


System.out.println("Welcome to User Registration");
    Scanner scanner = new Scanner(System.in);
			System.out.println("Enter first Name : ");
    String firstName = scanner.next();
			System.out.println(Pattern.matches("^[A-Z]{1}([a-z]{2})+$", firstName));


        System.out.println("Enter last Name : ");
        String lastName = scanner.next();
        System.out.println(Pattern.matches("^[A-Z]{1}([a-z]{2})+$", lastName));




        System.out.println("Enter phone number: ");
        String phoneNum = scanner.next();
        System.out.println(Pattern.matches("^[0-9]{0,2}\\s{0,1}[0-9]{10}$", phoneNum));

        System.out.println("Enter password : ");
        String password = scanner.next();
        System.out.println(Pattern.matches(
                "^(?=.*[A-Z])(?=.*[a-z])(?=[^@#$%^&+=]*[@#$%^&+=][^@#$%^&+=]*$)(?=.*[0-9]).{8,}$", password));

        System.out.println("Enter email : ");
        String input = scanner.next();
        List emails=new ArrayList();
        emails.add("user@domain.com");
        emails.add("user@domain.co.in");
        emails.add("user1@domain.com");
        emails.add("user.name@domain.com");
        emails.add("user#@domain.co.in");
        emails.add("user@domaincom");


        //Invalid emails
        emails.add("user#domain.com");
        emails.add("@yahoo.com");

       String regex ="^[a-zA-z0-9.+_-]{2,}@[a-zA-z0-9]+[.]{1}[a-z]{2,}$";

        //String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);

        for(Object email : emails){
            Matcher matcher = pattern.matcher(input);
            System.out.println(email +" : "+ matcher.matches());
        }

}}