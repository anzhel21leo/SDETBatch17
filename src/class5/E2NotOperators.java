package class5;

import java.util.Scanner;

public class E2NotOperators {
    public static void main(String[] args) {
        /*
        write a program that checks if the country in not equal to Iran
        its says you are allowed
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter the name of the country");
        String country=input.nextLine();

        if(!country.equals("Iran")){
            System.out.println("Welcome you are allowed");
        }else {
            System.out.println("You are not allowed");
        }

    }
}
