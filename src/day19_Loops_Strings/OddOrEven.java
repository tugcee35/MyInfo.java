package day19_Loops_Strings;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
while(true){
        System.out.println("Enter a number:");
        int num = scan.nextInt();

        if(num%2 == 0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }

        System.out.println("Would you like the another number? (yes or no)");
        String answer = scan.next();

        if( ! (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){
            System.err.println("Invalid Entry");
            System.exit(0);
        }
        if(answer.equalsIgnoreCase("no")){
            System.out.println("Thank you!");
            break;
        }

    }

    }
}
