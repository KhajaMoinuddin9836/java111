package com.ques3;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Start of the main...");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num1");
        int num1 = sc.nextInt();

        System.out.println("Enter num2");
        int num2 = sc.nextInt();

        String n = null;

        try{

            int num3 = num1/num2;

            if(num3>10)
            {
                System.out.println("Welcome to the Exception handling");
            }
        }catch (Exception e){

            System.out.println("num2 should not be 0");
        }

        try {

            System.out.println("Message is : "+n.toUpperCase());
        }catch (Exception e){

            System.out.println("String value is null");
        }
        System.out.println("end of the main...");
    }
}
