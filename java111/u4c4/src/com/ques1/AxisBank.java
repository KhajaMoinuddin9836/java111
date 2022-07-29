package com.ques1;

public class AxisBank extends Bank {

    double rateOfInterest;
    void getCreditCard() {
        System.out.println("Get the credit card from the Axis bank");
    }

    void displayDetails() {
        System.out.println("AxisBank rate of Interest :"+this.rateOfInterest+"%");
        System.out.println("Branch Name id : "+this.branchName);
    }
}
