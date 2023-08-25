package review3;

import java.util.Scanner;

public class E5Switch {
    public static void main(String[] args) {
        for (int i = 1; i<=3; i++){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the name of the fruit");
        String fruit=scanner.nextLine();

        switch (fruit) {
            case "Orange":
                System.out.println("It is usually Orange");
                break;
            case "Banana":
                System.out.println("It is usually Yellow");
                break;
            case "Strawberry":
                System.out.println("It is usually Red");
                break;
            case "Blue berry":
                System.out.println("It is usually Blue");
                break;
            default:
        }
        }
    }
}
