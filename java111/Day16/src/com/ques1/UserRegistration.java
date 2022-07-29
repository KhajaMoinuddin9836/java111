package com.ques1;
import java.util.Scanner;

public class UserRegistration {

    static void registerUser(String username, String userCountry)throws InvalidCountryException{

        if(userCountry.equalsIgnoreCase("India")) {

            System.out.println("User registration done successfully");
        }
        else
        {
            throw new InvalidCountryException("User Outside India cannot be registered");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name ");
        String name = sc.next();

        System.out.println("Enter your country ");
        String country = sc.next();
        try{
            registerUser(name,country);
        }
        catch (InvalidCountryException e) {
            System.out.println(e.getMessage());
        }
    }
}
