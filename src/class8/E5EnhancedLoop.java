package class8;

public class E5EnhancedLoop {
    public static void main(String[] args) {
        //print att the even numbers from this array using enhanced for loop
        int [] nums={10,23,25,56,45,20};
        for(int e:nums){
            if(e%2==0){
                System.out.println(e);
            }
        }

    }
}
