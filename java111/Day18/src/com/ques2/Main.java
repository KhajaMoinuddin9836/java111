package com.ques2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> AL = new ArrayList<>();

        AL.add("10");
        AL.add("20");
        AL.add("30");
        AL.add("40");
        AL.add("50");

        System.out.println("ArrayList is: "+AL);

        for(String s:AL)
        {
            System.out.println(AL);
        }

        for(int i=0; i<AL.size(); i++)
        {
            System.out.println(AL.get(i));
        }
    }
}
