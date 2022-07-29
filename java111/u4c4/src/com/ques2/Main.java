package com.ques2;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int[] arr = new int[sc.nextInt()];


        for(int i=0; i<arr.length; i++)
        {
            System.out.println("Enter the elements in the array");
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the index of the array element you want to access");


            int index = sc.nextInt();
            int x = arr[index];
            System.out.println("the array element at index "+index+" = "+x);
        }
        catch (ArrayIndexOutOfBoundsException Ae){

            System.out.println(Ae.getMessage());

        }
        catch (NumberFormatException nfe){
            System.out.println(nfe.getMessage());
        }

        System.out.println("The array element successfully accessed");
    }
}
