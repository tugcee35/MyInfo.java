package week15;

public class ErrorExamples {
    public static void main(String[] args) {


        deathlyMethod();


    }

    static int counter =0;

    public static void deathlyMethod(){
        System.out.println(counter++);
        deathlyMethod();
    }

}
