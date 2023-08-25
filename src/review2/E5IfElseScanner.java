package review2;

public class E5IfElseScanner {
    public static void main(String[] args) {
        int age=45;
        /*
        if age is greater than 60 offer 20% discount
        if age is greater than 50 offer 15% discount
        if age is greater than 40 offer 10% discount
        No Discounts
         */
        if(age>60){
            System.out.println("You get 20% Discount");
        } else if (age>50) {
            System.out.println("You get 15% Discount");
        } else if (age>40) {
            System.out.println("You get 10% Discount");
        }else{
            System.out.println("You get no Discount");
        }
    }
}
