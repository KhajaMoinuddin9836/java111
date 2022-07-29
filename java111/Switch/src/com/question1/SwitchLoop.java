package com.question1;
import java.util.*;

public class SwitchLoop {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter your city name : ");
        String city=sc.next();

        printCity(city);
    }

        private static void printCity(String city) {

            switch(city) {
                case "Mumbai":
                    System.out.println("Financial city");
                    break;
                case "Kolkata":
                    System.out.println("City of joy");
                    break;
                case "Delhi":
                    System.out.println("Capital of india");
                case "Bangalore":
                    System.out.println("Cyber city");
                    break;
                default:
                    System.out.println("May be other Indian city");
            }
        }

}
