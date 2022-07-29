package com.ques1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mobile mobile = new Mobile();
        System.out.println("Enter company name");
        String s = sc.next();
        System.out.println("Enter Model number");
        String s1 = sc.next();
        mobile.searchOutdatedModel(s,s1);
    }
}
