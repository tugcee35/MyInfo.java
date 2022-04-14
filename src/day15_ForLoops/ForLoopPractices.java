package day15_ForLoops;

public class ForLoopPractices {
    public static void main(String[] args) {

        /*
        System.out.println(15);
        System.out.println(16);
        ...
        System.out.println(45);
         */

        for(int i = 15; i <= 45; i++ ){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Hello");


        //100 99 98...50

        for( int i = 100; i>= 50; i--){
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println("-----------------");

        for(int i =1; i<= 55; i++){
            if( i % 2 == 0 ){
                System.out.println(i+" ");
            }
        }
        System.out.println();
        System.out.println("-----------------------");

        for(int i = 2; i<= 54; i+= 2 ){
            System.out.println(i + " ");
        }



        
    }
}
