package day22_MultiDimensionalArray.day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReversedSecondWord {
    public static void main(String[] args) {

        String sentence = "I love Java";
        String[]words=sentence.split(" ");

        String revers = "";

        for(int i = words[1].length()-1; i>=0; i-- ){
            revers += words[1].charAt(i);
        }
        System.out.println(revers);
        //sentence = sentence.replaceFirst(words[1], revers);

        words[1]=revers;
        System.out.println(Arrays.toString(words));

        for (String word : words) {
            System.out.println(word +" ");
        }


    }
}
