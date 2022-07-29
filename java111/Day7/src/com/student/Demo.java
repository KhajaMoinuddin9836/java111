package com.student;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Student s=new Student();
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        double avg=0;
        String[] arr=new String[number];
        for(int i=0; i<arr.length; i++)
        {
            System.out.println("Enter Student Name : ");
            String name=sc.next();
            arr[i]=name;
            s.setName(name);
            System.out.println("Enter "+arr[i]+"Student Address : ");
            s.setAddress(sc.next());
            System.out.println("Enter "+arr[i]+"Student Marks : ");
            s.setMarks(sc.nextInt());
            System.out.println("Enter "+arr[i]+"Student Roll : ");
            s.setRoll(sc.nextInt());
            System.out.println("Name : "+s.getName());
            System.out.println("Address : "+s.getAddress());
            System.out.println("Roll : "+s.getRoll());
            System.out.println("Marks : "+s.getMarks());
            avg+=s.getMarks()/arr.length;

        }
        System.out.println("Avg Marks is : "+avg);

    }
}
