package com.ques2;
import java.util.Scanner;

public class Main {

    public int Main(int a, int b) {

        int quotient = a/b;

        return quotient;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 numbers ");

        int a = sc.nextInt();
        int b = sc.nextInt();

        Main q = new Main();

        try{
            System.out.println(q.Main(a,b));
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("Inside finally block");
        }
    }
}
