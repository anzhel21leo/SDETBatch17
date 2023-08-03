package class3;

public class T2TemperatureCheck {
    public static void main(String[] args) {
        int storeTemp=35;
        if(storeTemp<32){
            System.out.println("Water will freeze with temperature "+storeTemp);
        } else {
            System.out.println("Water will not freeze with temperature "+storeTemp);
        }
    }
}
