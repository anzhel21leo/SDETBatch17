package review2;

public class E6IfDemo {
    public static void main(String[] args) {
        int age=45;

        if(age==60){
            System.out.println("You get 20% Discount");
        } else if (age==50) {
            System.out.println("You get 15% Discount");
        } else if (age==40) {
            System.out.println("You get 10% Discount");
        }else{
            System.out.println("You get no Discount");
        }
    }
}
