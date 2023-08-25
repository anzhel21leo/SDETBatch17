package class7;

public class T7Arrays {
    public static void main(String[] args) {
        //create an array store 5 numbers in it and print all the numbers from the array
        int [] nums={20,29,48,69,60}; //20,48,60

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                System.out.println(nums[i]);
            }
        }

    }
}
