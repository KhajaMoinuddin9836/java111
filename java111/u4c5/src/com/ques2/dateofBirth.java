package com.ques2;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class dateofBirth {

    public int DateOfBirth(String date)throws InvalidAgeException {

        try {

            DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("dd/mm/yyyy");

            LocalDate localDate = LocalDate.parse(date, dateTime);

            LocalDate localDate1 = LocalDate.now();

            Period per = Period.between(localDate, localDate1);

            if(per.getYears()>0 || per.getMonths()>0 || per.getDays()>0)
            {
                return per.getYears();
            }
            else
            {
                return -1;
            }
        }
        catch (Exception e)
        {
            InvalidAgeException Ie = new InvalidAgeException("Please pass the date in proper format");

            throw Ie;
        }
    }

    public static void main(String[] args)throws InvalidAgeException {

        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the date of birth : dd/mm/yyyy");

            String date = sc.next();

            dateofBirth dob = new dateofBirth();

            int Age = dob.DateOfBirth(date);

            if(Age>18)
            {
                System.out.println("your are eligible to vote");
            }
            else if(Age==18)
            {
                System.out.println("Happy Birthday, you are eligible to vote");
            }
            else if(Age<0)
            {
                System.out.println("Date should not be in future");
            }
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
