package class5;

import java.util.Scanner;

public class T4ANDOperator {
    public static void main(String[] args) {
        System.out.println("Please enter a number");

        Scanner input=new Scanner(System.in);

        int number= input.nextInt();

        if(number>=1 && number<=10){
            System.out.println("Small");
        } else if (number>=11 && number<= 100) {
            System.out.println("Medium");
        }else if(number>=101 && number<=1000) {
            System.out.println("Large");
        }
    }
}
