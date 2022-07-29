package com.ms;
import java.util.*;

public class VowelAndConsonant {

    void checkVowel(char x) {

        if(x=='!' || x=='@' || x=='#' || x=='$' || x=='%' || x=='&' || x=='*')
        {
            System.out.println("invalid character");
        }
        else if(x=='a' || x=='A' || x=='e' || x=='E' || x=='i' || x=='I' || x=='u' || x=='U')
        {
            System.out.println("Vowel");
        }
        else {
            System.out.println("Consonant");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter character : ");
        char x=sc.next().charAt(0);

        VowelAndConsonant VC=new VowelAndConsonant();
        VC.checkVowel(x);
    }
}
