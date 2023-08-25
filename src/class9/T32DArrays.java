package class9;

public class T32DArrays {
    public static void main(String[] args) {
        //create 2d array(shorter way) in which:
       // 1st array 4 names
        //2nd array contain grades
        //write a program that will print out name of student that has A and B grade
        String [][] students={
                {"Aysha","Giulia","John","Deepali"},
                {"A", "A+", "C", "B"}
        };
        for (int i = 0; i < 4; i++) {
            if(students[1][i].equals("A") || students[1][i].equals("B"))
            System.out.println(students[0][i]);
        }
        

    }
}
