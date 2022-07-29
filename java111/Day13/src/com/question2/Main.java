package com.question2;
import java.util.Scanner;

public class Main {

    public static Employee getEmployeeDetails(Employee employeee) {

        int emp = employeee.employeeId;
        String name = employeee.employeeName;
        double sal = employeee.salary;
        double netSal = employeee.netSalary;

        return employeee;
    }

    public static int getPFPercentage(int p) {

        double fund = p;
        return (int) fund;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee e = new Employee();

        System.out.println("Enter the Employee Id");
        e.employeeId = sc.nextInt();

        System.out.println("Enter Employee Name");
        e.employeeName = sc.next();

        System.out.println("Enter Employee Salary");
        e.salary = sc.nextDouble();

        System.out.println("Enter Employee Net Salary");
        e.netSalary = sc.nextDouble();

        int p = sc.nextInt();

        e.calaulateNetSalary(getPFPercentage(p));

        System.out.println("Id is : "+e.employeeId);

        System.out.println("Name is : "+e.employeeName);

        System.out.println("Net salary is : "+e.calaulateNetSalary(getPFPercentage(p)));



    }
}
