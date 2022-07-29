package com.ques1;

public class TemporaryEmployee extends Employee{

    private int hoursWorked;
    private int hourlyWages;

    @Override
    void calculateSalary() {

        int salary = hoursWorked*hourlyWages;
    }

    public TemporaryEmployee(int hoursWorked, int hourlyWages, int employeeId, String employeeName) {


        super(employeeId, employeeName);
        this.hoursWorked = hoursWorked;
        this.hourlyWages = hourlyWages;
    }
}
