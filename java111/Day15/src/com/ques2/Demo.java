package com.ques2;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {

    public boolean validate(String name, String aadhar, String mobile) {

        boolean b = Pattern.matches("[a-zA-Z]{3,8}",name);
        boolean b1 = Pattern.matches("[0-9]{12}",aadhar);
        boolean b2 = Pattern.matches("[6789]{1}[0-9]{9}",mobile);

        if(b && b1 && b2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {

        Demo d = new Demo();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name : ");
        String name = sc.next();

        System.out.println("Enter Aadhar number : ");
        String aadhar = sc.next();

        System.out.println("Enter Mobile number");
        String mob = sc.next();

        boolean b = d.validate(name, aadhar, mob);

        if(b==true)
        {
            Citizen c = new Citizen();

            c.setName(name);
            c.setAadharNumber(aadhar);
            c.setMobileNumber(mob);

            System.out.println(c.getName());
            System.out.println(c.getAadharNumber());
            System.out.println(c.getMobileNumber());
        }
        else
        {
            System.out.println("please enter a valid details");
        }
    }
}
