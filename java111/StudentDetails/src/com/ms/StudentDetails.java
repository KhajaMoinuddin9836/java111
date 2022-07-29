package com.ms;
import java.util.*;

public class StudentDetails {

    int Roll;
    String Name;
    int Marks;

    void displayStudentDetails(int Roll, String Name, int Marks) {
        System.out.println("Roll is: "+ Roll);
        System.out.println("Name is: "+ Name);
        System.out.println("Marks is: "+ Marks);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st Student roll: ");
        int Roll=sc.nextInt();
        System.out.println("enter 1st Student name: ");
        String Name=sc.next();
        System.out.println("enter 1st Student marks: ");
        int Marks=sc.nextInt();

        StudentDetails s1=new StudentDetails();
        s1.displayStudentDetails(Roll,Name,Marks);

        System.out.println("enter 2nd Student roll: ");
        int Roll1=sc.nextInt();
        System.out.println("enter 2nd Student name: ");
        String Name1=sc.next();
        System.out.println("enter 2nd Student marks: ");
        int Marks1=sc.nextInt();

        StudentDetails s2=new StudentDetails();
        s2.displayStudentDetails(Roll1,Name1,Marks1);
    }
}
