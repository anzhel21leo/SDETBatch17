package class10;

public class Student {
    //properties/atributes
    String name;
    int age;
    String id;
    //methods/functions/behaviours
    void study(){
        System.out.println("Studying 16 hours a day.....");
    }

    public static void main(String[] args) {
        //we are creating an actual student by using the student class
        Student ehabObj=new Student();
        ehabObj.name="Ehab";
        ehabObj.age=23;
        ehabObj.id="abc123";
        ehabObj.study(); // scanner.nextInt();

        Student habibObj=new Student();
        habibObj.name="Habib";
        habibObj.age=20;
        habibObj.id="abc123";
        habibObj.study();

    }
}
