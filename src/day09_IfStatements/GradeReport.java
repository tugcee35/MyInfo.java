package day09_IfStatements;

public class GradeReport {
    public static void main(String[] args) {
        int n = 100;
        String grade;

        if(n==100){
            grade = "A";
        }else if (n==80){
            grade = "B";
        }else if(n==60){
            grade = "C";
        }else if(n==40){
            grade ="D";
        }else{
            grade = "F";
        }
        System.out.println("grade = " + grade);


//Garde report; A B C D F
      
    }
}
