package class9;

public class E12DArrays {
    public static void main(String[] args) {

        String [] [] names=
                {       {"Hind","Mikhail","Ismael","Ahmed"},         //0|0 0|1 0|2 0|3
                        {"John", "Bob", "Adam", "Tamim"},            //1|0 1|1 1|2 1|3
                        {"Joke","Laugh","John Ahmed","Mohammad"},    //2|0 2|1 2|2 2|3
                        {"Gui", "Backend", "Front", "API"},          //3|0 3|1 3|2 3|3
                };

        System.out.println(names[1][1]); //Bob
        System.out.println(names[1][3]); //Tamim
    }
}
