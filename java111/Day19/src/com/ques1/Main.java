package com.ques1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Product> p = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true)
        {
            System.out.println("Enter Product Id");
            int id = sc.nextInt();
            System.out.println("Enter Product Name");
            String name = sc.next();
            System.out.println("Enter Product Price");
            double price = sc.nextDouble();

            p.add(new Product(id,name,price));

            System.out.println("If you want to add more Product detail enter y/n");
            String s = sc.next();
            if(s.contains("n"))
            {
                break;
            }
        }

        System.out.println("Enter choose option 1,2,3");
        int c = sc.nextInt();

        if(c==1)
        {
            Collections.sort(p,new ProductSortByPrice());
            System.out.println(p);
        }
        else if(c==2)
        {
            Collections.sort(p,new ProductSortByName());
            System.out.println(p);
        }
        else
        {
            Collections.sort(p,new ProductSortById());
            System.out.println(p);
        }
    }
}
