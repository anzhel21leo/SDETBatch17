package class8;

public class T1Arrays {
    public static void main(String[] args) {
        //              0   1   2   3   4   5   6    =total 7
        char [] chars={'A','b','c','F','E','#','@'};
        //to print in reverse order

        for (int j = chars.length-1; j >= 0; j--) {
            System.out.print(chars[j]+" ");
        }
    }
}
