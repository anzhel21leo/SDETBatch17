package class9;

import java.util.Arrays;

public class E32DArrays {
    public static void main(String[] args) {

//        int [] row0={10,20,30,40};
//        int [] row1={100,200,300,400};
//        int [] row2={1,2,3,4};
//

        int [][] numbers={
                {10,20,30,40},
                {100,200,300,400},
                {1,2,3,4}
        };
        int[] row=numbers[0];       //returns a complete 1D array
        int number=numbers[0][1];   //returns a single element
        System.out.println(numbers[0][1]);
        System.out.println(Arrays.toString(numbers[1])); //returns the whole row
        System.out.println(Arrays.toString(numbers[1]));

    }
}
