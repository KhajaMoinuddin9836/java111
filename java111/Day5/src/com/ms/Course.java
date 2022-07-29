package com.ms;


import java.util.Scanner;


public class Course {

    int courseId;
    String courseName;
    int courseFee;

    public static void main(String[] args) {
        Course c = new Course();

        authenticate("Admin", "1234");
        authenticate("admin", "12345");

    }

    void displayCourseDetails() {

        System.out.println("courseId is : " + courseId);
        System.out.println("courseName is : " + courseName);
        System.out.println("courseFee : " + courseFee);
    }

    static void authenticate(String username, String password) {

        Scanner sc=new Scanner(System.in);
        if(username.equals("Admin") && password.equals("1234")) {

            Course c1=new Course();

            c1.courseId=sc.nextInt();
            c1.courseName=sc.next();
            c1.courseFee=sc.nextInt();
            c1.displayCourseDetails();
        }
        else
        {
            System.out.println("Invalid Username Or password");
        }
    }
}