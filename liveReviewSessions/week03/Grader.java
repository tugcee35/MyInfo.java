package week03;

public class Grader {
    public static void main(String[] args) {

        int grade = 100;
        if(grade >= 0 && grade <= 100){
            System.out.println("Your grade is valid");
            if(grade <=100 && grade >= 90){
                System.out.println("A");
            }else if(grade <=90 && grade >=80){
                System.out.println("B");
            }else if(grade <80 && grade >=70){
                System.out.println("C");
            }else if( grade <70 && grade >= 60){
                System.out.println("D");
            }else{
                System.out.println("F");
            }
        }else{
            System.out.println("Not Valid Grade");
        }
    }
}
