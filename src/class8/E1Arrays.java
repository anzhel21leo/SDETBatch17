package class8;

public class E1Arrays {
    public static void main(String[] args) {
        //              0   1   2   3   4   5   6
        char [] chars={'A','b','c','F','E','#','@'};

        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]+" ");
        }

        System.out.println();
        //to print in reverse order

        for (int j = chars.length-1; j >= 0; j--) {
            System.out.print(chars[j]+" ");
        }
    }
}
