package review4;

public class E5NestedLoop {
    public static void main(String[] args) {
        /*
        *
        * *
        * * *
        * * * *
        * * *
        * *
        *
         */
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int k = 1; k <= 3; k++) {
            for (int m = 0; m < 4-k; m++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
