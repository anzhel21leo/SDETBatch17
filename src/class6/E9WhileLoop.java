package class6;
public class E9WhileLoop {
    public static void main(String[] args) {
        //print all even numbers from 2 to 100
        int start = 5, end = 15, step = 2;
        while (start <= end){
            System.out.print(start+" ");
            start+=step;
        }
    }
}
