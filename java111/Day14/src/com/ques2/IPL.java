package com.ques2;
import java.util.Scanner;

public class IPL {

    void homeTeamStadium(Stadium stadium) {

        switch (stadium) {

            case EDEN_GARDEN_STADIUM:
                System.out.println("This the home ground of KKR");
                break;
            case WANKHEDE_STADIUM:
                System.out.println("This the home ground of Mumbai Indians");
                break;
            case CHIDAMBARAM_STADIUM:
                System.out.println("This the home ground of CSK");
                break;
            case M_CHINNASWAMY_STADIUM:
                System.out.println("This the home ground of RCB");
                break;
            default:
                System.out.println("please enter correct name of stadium");
        }
    }

    public static void main(String[] args) {

        try{

            IPL ipl = new IPL();
            Scanner sc = new Scanner(System.in);
            String s = sc.next();

            Stadium stadium = Stadium.valueOf(s);

            ipl.homeTeamStadium(stadium);
        }
        catch (Exception e)
        {
            System.out.println("please enter correct name of stadium");
        }
    }
}
