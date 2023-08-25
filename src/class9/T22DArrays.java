package class9;

public class T22DArrays {
    public static void main(String[] args) {
        //print only even numbers from this array
        int [][] numbers={
                {10,20,30,40,50},
                {15,30,35,45,20},
                {16,20,32,22,30}
        }; //write a loop to get al the elements from 2nd row one by one
        int sum=0;
        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[1][i]+" ");
        }


    }
}
