package com.ques2;
import java.util.*;

public class Factorial {

        public static void main(String[] args) {
            System.out.println("enter number : ");
            Scanner sc=new Scanner(System.in);
            int num=sc.nextInt();

            prime(num);
        }

        private static void prime(int num) {

            if(num>=2) {
                for(int i=1; i<num; i++) {
                    if(num%i==0) {
                        System.out.println(i+" ");
                    }
                }
            }
            else {

                System.out.println("invalid number");
            }
        }
}
