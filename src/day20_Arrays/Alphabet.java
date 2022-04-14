package day20_Arrays;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {

        char[] alphabets = new char[26]; //Z˜A

       /*
        alphabets[0] = 'Z'; // 90 ASCII table in
       alphabets[1] = 'Y'; // 89 ASCII table in

        System.out.println(Arrays.toString(alphabets)); //print the whole arrays
        System.out.println(alphabets[0]); //printing the element of array
        */
      /*
        for(char i = 0, j = 'Z'; i < alphabets.length; i++, j--){
       alphabets[i] = j;
        }

        System.out.println(Arrays.toString(alphabets ));
       */
           char ch = 'Z';
        for (int i = 0; i < alphabets.length; i++, ch--) {
            alphabets[i] =ch;
        }
        System.out.println(Arrays.toString(alphabets));


    }
}
