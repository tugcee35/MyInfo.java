package week05;

import java.util.Locale;
import java.util.Scanner;

public class EmailExampleFromReplit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a valid email: tugce.emiroglu@gmail.com");
        String email = input.next();

        int indexof = email.indexOf(".");
        int indexofAtSign = email.indexOf("@");
        int indexOfDot = email.indexOf(".");

        String firstName = email.substring(0, indexof);
        firstName = firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();

        System.out.println("firstName =" + firstName);

        String lastName = email.substring(indexof+1,indexofAtSign);
        lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();
        System.out.println("lastName = " + lastName);

        lastName = lastName.toUpperCase().charAt(0)+lastName.substring(1).toLowerCase();
        System.out.println("lastName = " + lastName);



    }
}
