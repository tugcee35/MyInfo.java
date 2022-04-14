package week01;

import java.util.Scanner;

public class StringPractice01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(firstTwoChars(str));


    }

    public static String firstTwoChars(String str){

      //  str = str.toUpperCase().substring(0,2);

        return str.toUpperCase().substring(0,2);


    }

}
/*
 * 1.
 * Ask for a String input from user
 * Create a method that will return a string,
 *  print the string made of its first two chars,
 * so the String "Hello" yields “HE".
 */