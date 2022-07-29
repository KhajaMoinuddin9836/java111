package com.ms;
import java.util.Scanner;

public class Char {


    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str=sc.next();


        System.out.println("Enter the character position you want to access");

        int i=sc.nextInt();

        System.out.println("The string "+" "+ str + " "+"char at index is: "+" "+str.charAt(i));
        sc.close();

    }
}
