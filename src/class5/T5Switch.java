package class5;

import java.util.Scanner;

public class T5Switch {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String country=input.nextLine();
        System.out.println("Please enter Country");

        switch (country){
            case "America":
                System.out.println("English");
                break;
            case "China":
                System.out.println("Chinese");
                break;
            case "France":
                System.out.println("French");
                break;
            case "Italy":
                System.out.println("Italian");
                break;
            default:
                System.out.println("Language not present");
        }
    }
}
