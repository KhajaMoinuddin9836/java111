package com.ms;
import java.util.Scanner;

public class StringReverse {

        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a string to reverse : ");
            String originalString=sc.nextLine();
            System.out.println("Original String is : "+originalString);
            String result=reverseString(originalString);
            System.out.println("Reversed String is : "+result);
        }
        public static String reverseString(String originalString) {
            String bag="";

            for(int i=originalString.length()-1; i>=0; i--)
            {
                bag+=originalString.charAt(i);
            }
            return bag;
        }
}
