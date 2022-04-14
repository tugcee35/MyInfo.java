package day21_ForEachLoop;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[]numbers={10,20,30,40,50};
//                     0  1  2  3  4
        int[]reserved = new int[numbers.length];    //{50,40,30,20,10}

        /*reserved[0] = numbers[numbers.length-1];
        reserved[1] = numbers[numbers.length];
        reserved[2] = numbers[numbers.length];
        numbers[3] = numbers[numbers.length];

         */

        for (int i = numbers.length-1, j=0 ;i >=0 ; i--, j++) {
            reserved[j]=numbers[i];
        }
        System.out.println(Arrays.toString(reserved));





    }
}
