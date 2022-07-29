package com.ms;
import java.util.*;

public class Cricket {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st score : ");
        int firstScore=sc.nextInt();
        System.out.println("enter 2nd score : ");
        int secondScore=sc.nextInt();
        System.out.println("enter 3rd score : ");
        int thirdScore=sc.nextInt();
        System.out.println("enter 4th score : ");
        int fourthScore=sc.nextInt();
        System.out.println("enter 5th score : ");
        int fifthScore=sc.nextInt();

        total(firstScore,secondScore,thirdScore,fourthScore,fifthScore);
    }

    private static void total(int firstScore, int secondScore, int thirdScore, int fourthScore, int fifthScore) {

        int total_Runs=firstScore+secondScore+thirdScore+fourthScore+fifthScore;
        System.out.println("total Runs" + " " +total_Runs);
    }
}
