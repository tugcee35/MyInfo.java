package week06;

public class BasicLoopExamples {
    public static void main(String[] args) {

/*
 * Question-1:

         Write a for loop that displays the following set of numbers:

         0,10,20,30,40,50,...1000

 */

    for(int i =0 ; i<=1000 ; i+= 10){ //local variablee only works inside for loops
        System.out.print(i+" ");
    }
        System.out.println();
    //===========================================
        //initialization
        int z = 0; // global variable for the whole class
        for( ; z <= 1000 ; ){
            if(z%10==0){
                System.out.print(z+" ");
            }
        z++;  //iteration z+=10;
    }

        System.out.println("z = " + z);

    //=============================================
        //Ouestion2- display odd numbers between 3-130 in the same line
        System.out.println();
        for(int i = 3; i < 130 ; i += 2){
            System.out.print(i+" ");
        }

    //==============================================
        System.out.println();
/*
 * Question-3:

            Write a program that displays
            the number of even numbers between 5 and 50 (included)
 */
        int countOfEven=0;
        for(int i=5; i <= 50 ; i++){
            if(i%2==0){
                ++countOfEven;
            }
        }
        System.out.println("count of even number 5 to 50= " + countOfEven);

    //==============================================
        System.out.println();
///create a 12 nin çarpım tablosu

        int j = 1;
        for( ; j <= 10 ; j++){
            System.out.println("12 X "+j+" = "+(12*j));
        }



    }
}
