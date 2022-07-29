package com.ques3;
import java.util.Scanner;

public class AccountDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account acc = new Account();

        System.out.println("Enter account number");
        acc.setAccountNumber(sc.next());

        System.out.println("Enter deposit amount");
        acc.deposit(sc.nextInt());

        System.out.println("Enter withdraw amount");

        try{
            System.out.println("Balance is : "+acc.withdraw(sc.nextInt()));
        }
        catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
