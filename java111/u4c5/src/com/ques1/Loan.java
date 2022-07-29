package com.ques1;

public class Loan {

    public double calculateLoanAmount(Employee employeee) {

        if(employeee instanceof PermanentEmployee) {

            double s = employeee.getSalary()/12;
            return s;
        }
        else if (employeee instanceof TemporaryEmployee) {

            double s = employeee.getSalary()/10;
            return s;

        }
        else
        {
            return 00;
        }
    }
}
