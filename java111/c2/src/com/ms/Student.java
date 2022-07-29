package com.ms;
import java.util.Scanner;

public class Student {


    int rollNumber;
    String studentName;
    int marks;

    public Student() {

    }

    public Student(int rollNumber1, String studentName1, int marks1) {
        this.studentName=studentName1;
        this.rollNumber=rollNumber1;
        this.marks=marks1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Number of Students you want to enter");
        int number=sc.nextInt();

        System.out.println("=====================================");

        Student s=new Student();
        int[] arr=new int[number];

        for(int i=0; i<number; i++)
        {
            System.out.println("Enter the Roll Number");
            s.rollNumber=sc.nextInt();

            System.out.println("Enter the Name");
            s.studentName= sc.next();

            System.out.println("Enter the marks");
            s.marks=sc.nextInt();
        }
        for(int i=0; i< arr.length; i++)
        {
            System.out.println("Student Detail"+" "+i);

            System.out.println("Student Roll Number"+" "+s.rollNumber);

            System.out.println("Student Name"+" "+s.studentName);

            System.out.println("Student Marks"+" "+s.marks);

            System.out.println("===========================================");
        }

    }


}
