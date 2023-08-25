package class6;

public class T9T10T11ForLoop {
    public static void main(String[] args) {
        //print all the even numbers from 100 to 1 using for loop
        System.out.println("T9 For Loop");
        for (int i = 100; i > 1; i-=2) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("T10 For Loop");
        //print even nums 20 to 100
        for (int a = 20; a < 100; a+=2) {
            System.out.print(a+" ");
        }
        System.out.println();
        //print only odd numbers from 100 o 1 (2 different ways)
        System.out.println("T11 For Loop");

        for (int b = 99; b > 1; b-=2) {
            System.out.print(b+" ");
        }
        System.out.println();
        System.out.println("2nd way");
            int c = 99;
            while (c > 1) {
                System.out.print(c+" ");
                c -= 2;
            }
    }
}
