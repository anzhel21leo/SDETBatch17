package class9;

public class T42DArrays {
    public static void main(String[] args) {

        String [] [] cars=
                {       {"Dodge","Jeep","Ford","Cadillac"},
                        {"Volvo", "Wolswagan", "Mercedes", "Porsche"},
                        {"Ferrari","Fiat","Lamborghini", "Alfa"},
                        {"Kia", "Hyundai", "Genesis", "Pronto"}
                };

       for(String[] row:cars){
           for(String c:row){
               System.out.print(c+" ");
           }
           System.out.println();
       }
        System.out.println("=========================");
        for (int i = 0; i < cars.length ; i++) {
            for (int j = 0; j <cars[i].length ; j++) {
                System.out.print(cars[i][j]+" ");
            }
            System.out.println();
        }
    }
}
