package com.ms;


public class EvenSum {

        public static void main(String[] args) {

            int[][] mat={
                    {1,2,3},
                    {4,5,6},
                    {7,8,9}
            };

            for(int M=0; M<mat.length; M++)
            {
                int sum=0;
                for(int N=0; N<mat[M].length; N++)
                {
                    if(mat[N][M]%2==0)
                    {
                        sum=sum+mat[N][M];
                    }
                }
                System.out.println(sum);
            }

        }
}
