package day11_Switch_Scanner;

import javax.crypto.spec.PSource;

public class Grade2 {
    public static void main(String[] args) {
        char ch = 'A';

        switch (ch){

            case 'A':
            case 'B':
            case 'C':
            case 'D':
                System.out.println("Passed");
                break;
            default:
                System.out.println("Failed");
        }


    }
}
