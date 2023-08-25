package class6;

import java.util.Scanner;

public class E12DoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter -1 to shutdown");
        int input;

        do { System.out.println("Please Enter your name or shutdown to close the program");
            input= scanner.nextInt();
            System.out.println("You have entered "+input);
        } while (input!=-1);
    }
}
