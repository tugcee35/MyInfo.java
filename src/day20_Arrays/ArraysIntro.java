package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        //create a variable that's capable enough to contaion 5 names

        String[] myGroup = new String[5];
        myGroup[0] = "Gunay";
        myGroup[1] = "Neig";
        myGroup[3] = "Suat";
        myGroup [4] = "Hulya";
       // myGroup [5] = "Mikael";

       // System.out.println(myGroup); hashcode wrong way
        System.out.println(Arrays.toString(myGroup));

        System.out.println("--------------------------------");

        String[]days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday","Sunday"};
        // index :         0          1            2           3           4         5         6

        days[7] = "JavaDay";


        System.out.println(Arrays.toString(days));

        int number = 5;

        if(number<1 || number >7){
            System.err.println("Invalid Number");
            System.exit(0);
        }
        System.out.println(days[number-1]);





    }
}
