package class9;

public class E62DArrays {
    public static void main(String[] args) {
        //print only even numbers from this array
        int [][] numbers={
                {10,20,30,40},
                {15,30,35,45},
                {16,20,32,22}
        };
        int sum=0;
        for (int row = 0; row < numbers.length; row++) {
            System.out.println(numbers[row][2]);
        }

    }
}
