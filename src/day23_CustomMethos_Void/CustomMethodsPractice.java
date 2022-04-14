package day23_CustomMethos_Void;

public class CustomMethodsPractice {
    public static void main(String[] args) {

        helloWorld5Times();

        System.out.println("-------------------");

        helloCydeoTimes();

        System.out.println("----------------------");

        evenNumbers();
    }

    // create a function that can print hello world 5 times==> helloWorld5times()
    public static void helloWorld5Times(){

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");

        }
    }

// create a function that can print hello Cydeo 5 times
    public static void helloCydeoTimes(){

        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }


    }

    // create a function that can print all the even number from 1~10
    public static void evenNumbers(){
        for (int i = 2; i <= 11; i+=2) {
            System.out.println(i);
        }
    }



}
