package com.ms;
import java.util.Arrays;

public class PrimeNumber {
    public int[] findAndReturnPrimeNumbers(int[] inputArray){

        int temp=0;
        int[]  arr1= {};

        for(int i=0;i<inputArray.length;i++) {
            int x=0;

            for(int j=2;j<=inputArray[i];j++)
                if(inputArray[i]%j==0) {
                    x++;
                }
            if(x==1) {

//				System.out.println(inputArray[i]);
                temp++;
                arr1 = Arrays.copyOf(arr1, 0+ temp);

                arr1[temp-1]=inputArray[i];

//				System.out.println();
            }
        }

        return arr1;
    }
    public static void main(String[] args) {

        PrimeNumber obj=new PrimeNumber();
        int[] inputArray= {1,3,5,7,9,11,13,14,15,21};
        int[] result=obj.findAndReturnPrimeNumbers(inputArray);
        if(result.length>0)
        {
            for(int i=0;i<result.length;i++)
            {
                System.out.println(result[i]);
            }
        }
        else
        {
            System.out.println("Prime number is not found in the supplied Array");
        }


    }

}