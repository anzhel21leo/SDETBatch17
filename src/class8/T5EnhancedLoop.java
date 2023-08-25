package class8;

public class T5EnhancedLoop {
    public static void main(String[] args) {
        //find the largest even number
        int [] nums={10,23,25,56,60,20};
        int largest=nums[0];
        for(int e:nums){
            if(e>largest && e%2==0){
                largest=e;
            }
        }
        System.out.println(largest);
    }
}
