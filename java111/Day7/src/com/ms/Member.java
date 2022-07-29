package com.ms;

public class Member {

        String Name;
        int Age;
        String Phone_number;
        String Address;
        double Salary;

        void printSalary(){

            System.out.println("Name is : "+Name);
            System.out.println("Age is : "+Age);
            System.out.println("phone number is : "+Phone_number);
            System.out.println("Address is : "+Address);
            System.out.println("Salary is "+Salary);

            System.out.println();
        }
        void type() {
            System.out.println("Employee data");
            System.out.println("---------------");
        }
        void type1() {
            System.out.println("Manager data");
            System.out.println("---------------");
        }
}

class Employee extends Member{

    String Specialization;
}
class Manager extends Member{

    String Department;
}
class Main{

    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.Name="Khaja";
        emp.Age=25;
        emp.Salary=70000;
        emp.Address="Karnataka";
        emp.Specialization="Web Developer";
        emp.type();
        emp.printSalary();


        Manager manage=new Manager();
        manage.Name="Moinuddin";
        manage.Age=25;
        manage.Phone_number="9611319836";
        manage.Salary=80000;
        manage.Department="Manager";
        manage.Address="Gulbarga";
        manage.type1();
        manage.printSalary();

    }
}
