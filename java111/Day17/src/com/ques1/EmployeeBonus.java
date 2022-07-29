package com.ques1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class EmployeeBonus {

    public double bonusGet(String date)throws InvalidAgeException {

        DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("dd/mm/yyyy");

        LocalDate localDate = LocalDate.parse(date,dateTime);

        LocalDate localDate1 = LocalDate.now();

        Period p = Period.between(localDate, localDate1);

        if(p.getYears()>1 && p.getDays()>=1 && p.getMonths()>=1)
        {
            return 5000;
        }
        else if(p.getYears()>1 && p.getYears()<2)
        {

            return 8000;
        }
        else if(p.getYears()>2)
        {
            return 10000;
        }
        else
        {
            InvalidAgeException e = new InvalidAgeException("Invalid Age");
            throw e;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the date of joining in: dd/mm/yyyy");

        String date = sc.next();

        EmployeeBonus employee = new EmployeeBonus();

        try{
            double bonus = employee.bonusGet(date);

            System.out.println("your bonus is: "+bonus);
        }
        catch (InvalidAgeException iae){

            InvalidAgeException IAE = new InvalidAgeException("Invalid date format");
            IAE.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
