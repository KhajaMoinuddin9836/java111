package com.ques3;
import java.util.Scanner;

public class NaturalNumber {

    public static void main(String[] args) {

        System.out.println("enter number to sum: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        Sum(num);
    }

    private static void Sum(int num) {
        int sum=num*(num+1)/2;
        System.out.println(sum);
    }
}
