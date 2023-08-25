package class9;

import java.util.Arrays;

public class E92DArrays {
    public static void main(String[] args) {

        String [] [] names=                                         //row|column
                {       {"Hind","Mikhail","Ismael","Ahmed"},         //0|0 0|1 0|2 0|3
                        {"John", "Bob", "Adam", "Tamim"},            //1|0 1|1 1|2 1|3
                        {"Joke","Laugh","John Ahmed","Mohammad"},    //2|0 2|1 2|2 2|3
                        {"Gui", "Backend", "Front", "API"},          //3|0 3|1 3|2 3|3
                };

       for(String[] row:names){
           for(String v:row){
               System.out.print(v+" ");
           }
           System.out.println();
       }
        System.out.println(Arrays.deepToString(names)); //for printing 2D arrays
    }
}
