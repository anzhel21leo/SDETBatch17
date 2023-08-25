package review2;

import java.util.Scanner;

public class E7CommonScannerIssues {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

//        System.out.println("What city are you in?");
//        String city=scanner.nextLine(); //.nextLine can hold more than one word
//        System.out.println("What is the temperature in that city in fahrenheit?");
//        double fahrenheit=scanner.nextDouble();
//        double celsius=(fahrenheit-32)*5/9;
//        System.out.println("The temperature in "+city+" is "+celsius);

        System.out.println("Enter your FullName");
        String fName=scanner.next(); //.nextLine() consume the enter press
        System.out.println("Please Enter your City");
        String city= scanner.nextLine();
        System.out.println(fName+" "+city);
    }
}
