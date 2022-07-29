package com.ques2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DateOfBirth {

    static LocalDate validDate(String dob)throws InvalidDateFormat {

        try{

            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/mm/yyyy");

            LocalDate ld = LocalDate.parse(dob,dtf);

            return ld;
        }
        catch (DateTimeParseException DTPE){

            throw new InvalidDateFormat();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Valid Date Of Birth in right format dd/mm/yyyy");

        String dob = sc.next();

        try{
            LocalDate ld = validDate(dob);
            LocalDate date = LocalDate.now();
            if(date.isBefore(ld))
            {
                System.out.println("Date should not be in future");
            }
            else
            {
                System.out.println("Age of the user is: "+ ChronoUnit.YEARS.between(ld,date));
            }
        }
        catch (InvalidDateFormat IDF){
            System.out.println("Invalid date format");
        }
    }
}
