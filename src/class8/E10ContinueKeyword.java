package class8;

public class E10ContinueKeyword {
    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {

            System.out.println("Batch 17 is Greatest of all time");
            if(i%2==0){
                continue; //skip
            }
            System.out.println("I am kidding");
        }

    }
}