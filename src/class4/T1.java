package class4;

public class T1 {
    public static void main(String[] args) {
        boolean degree=false;
        double gpa=3.1;

        if (degree){
            System.out.println("Congratulations you get a degree");
            if (gpa>3.5){
                System.out.println("You should get a scholarship");
            }else {
                System.out.println("You do not qualify for scholarship. You should have studied harder");
            }
        }else{
            System.out.println("You do not have a degree");
        }
    }
}
