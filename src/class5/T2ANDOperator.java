package class5;

import java.util.Scanner;

public class T2ANDOperator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your age in inches");
        int height=input.nextInt();
        if(height<60){
            System.out.println("You height is short");
        } else if (height>=60&&height<=72) {
            System.out.println("You are average height");
        }else {
            System.out.println("Your height is tall");
        }
    }
}
