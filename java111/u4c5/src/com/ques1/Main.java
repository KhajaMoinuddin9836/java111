package com.ques1;

public class Main {

    public static void main(String[] args) {

        Loan loan = new Loan();

        double permanentEmployeeLoan=loan.calculateLoanAmount(new PermanentEmployee(1,"khaja",1000));
        double temporaryEmployeeLoan=loan.calculateLoanAmount(new TemporaryEmployee(2,500,20,"moin"));

        System.out.println("Loan Amount for Permanent Employee => "+permanentEmployeeLoan);
        System.out.println("Loan Amount for Temporary Employee => "+temporaryEmployeeLoan);
    }
}
