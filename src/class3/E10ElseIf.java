package class3;

public class E10ElseIf {
    public static void main(String[] args) {

        String fruit="Apple";

        if(fruit.equals("Mango")){
            System.out.println("Price is $5");
        } else if (fruit.equals("Orange")) {
            System.out.println("Price is $2");
        } else if (fruit.equals("Apple")) {
            System.out.println("Price is $9");
        } else if (fruit.equals("Kiwi")) {
            System.out.println("Price is $7");
        }else {
            System.out.println("This fruit is not avaliable right now");
        }
    }
}
