package class5;

import java.util.Scanner;

public class T1OROperator {
    public static void main(String[] args) {
     /*
     Write a program for user to enter his/hers birth month. Based on the month define the season.
Example: if user is born in March, April, May → season =”Spring”
if user is born in June, July, August →
season =”Summer”  etc …
At the end of the program we should see 1 output as “You were born is season __”.
      */

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your birth month");
        String month=input.next();
        if(month.equalsIgnoreCase("December")||
                month.equalsIgnoreCase("January")||
                month.equalsIgnoreCase("February")){
            System.out.println("You are born in Winter");
        } else if (month.equalsIgnoreCase("March")||
                month.equalsIgnoreCase("April")||
                month.equalsIgnoreCase("May")) {
            System.out.println("You are born in Spring");
        } else if (month.equalsIgnoreCase("June")||
                month.equalsIgnoreCase("July")||
                month.equalsIgnoreCase("August")) {
            System.out.println("You are born in Summer");
        }else if(month.equalsIgnoreCase("September")||
                month.equalsIgnoreCase("October")||
                month.equalsIgnoreCase("November")){
            System.out.println("You are born in Autumn");
        }else {
            System.out.println("The month entered is invalid");
        }
    }
}
