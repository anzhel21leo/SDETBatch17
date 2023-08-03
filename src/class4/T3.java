package class4;

public class T3 {
    //Create a Java program and call it a Donor.
    //In order to be eligible to donate your blood you have to be 18 years old.
    // Also once you identify age eligibility then we have to see if person matches weight requirements.
    // If person weight it more than 110 lbs → then he/she is eligible, otherwise we cannot accept such a patient.
    public static void main(String[] args) {

        int age=15, weight=115;

        if(age>18){
            System.out.println("You are age qualified for blood donner");
            if(weight>110){
                System.out.println("Your can donate blood");
            }else{
                System.out.println("Your weight is not at a minimun");
            }
        }else{
            System.out.println("You are not of age");
        }

    }
}
