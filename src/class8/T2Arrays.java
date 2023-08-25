package class8;

public class T2Arrays {
    public static void main(String[] args) {
        //Count how many true values are present in array
        //                 0    1      2    3    4    5
        boolean [] conds={true,false,true,false,true,true};
        int count=0;
        for (int i = 0; i < conds.length; i++) {

            if (conds[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
