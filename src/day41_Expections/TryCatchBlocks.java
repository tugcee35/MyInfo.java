package day41_Expections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Test1 stated");

        try{
            System.out.println(9/0);

            System.out.println("Try Block");

        }catch (ArithmeticException e){

            System.out.println("Catch Block");

            System.out.println("Arithmetic Exception was occured");

        }


        System.out.println("Test1 Completed");

        System.out.println("----------------------------------");

        System.out.println("Test2 started");

        int[] numbers={1,2,3,4,5};

        try{
            System.out.println(numbers[200]);

            System.out.println("Try Block");

        }catch (RuntimeException e){

          e.printStackTrace();

           // System.out.println(e.getMessage());
        }


        System.out.println("Test2 Completed");

        System.out.println("-----------------------------------");

        System.out.println("Test3 started");



        try{
            System.out.println("Ceydeo".substring(2, 0));
        }catch (RuntimeException e){
            e.printStackTrace();
        }

        System.out.println("Test3 started");

        System.out.println("-------------------------------------");

        System.out.println("Hello");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Cydeo");

        System.out.println("-------------------------------");

        try {
            FileInputStream file = new FileInputStream("File Path");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
