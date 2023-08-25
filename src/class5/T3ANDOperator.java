package class5;

import java.util.Scanner;

public class T3ANDOperator {
    public static void main(String[] args) {
        System.out.println("Please enter a day integer");

        Scanner input=new Scanner(System.in);

        int day= input.nextInt();

        if(day>=1 && day<=5){
            System.out.println("It is a week day");
        } else if (day==6 && day==7) {
            System.out.println("Its a weekend");
        }else {
            System.out.println("Invalid day");
        }
    }
}
