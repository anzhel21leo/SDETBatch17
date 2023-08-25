package review3;

public class E2LogicalOperators {
    public static void main(String[] args) {


        boolean isMeat=true;
        boolean isEgg=true;
        boolean isFish=true;
        boolean milk=true;
        boolean veggies=true;


        boolean isProtient=isEgg||isFish||isMeat;
        boolean isGoodDiet=(isEgg||isFish||isMeat) &&milk&&veggies;

        System.out.println(isProtient);
        System.out.println(isGoodDiet);

    }
}
